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

@OriginalClass("client!qi")
public final class Class82_Sub2 extends Class82 implements Interface8 {

	@OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
	public int anInt5193;

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "Lclient!mm;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
	public int anInt5196;

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
	public int anInt5197;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
	private int anInt5198;

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
	public int anInt5199;

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
	public int anInt5200;

	@OriginalMember(owner = "client!qi", name = "Y", descriptor = "Lclient!ct;")
	public Class42 aClass42_3;

	@OriginalMember(owner = "client!qi", name = "ab", descriptor = "I")
	private int anInt5203;

	@OriginalMember(owner = "client!qi", name = "bb", descriptor = "Ljava/lang/String;")
	private String aString47;

	@OriginalMember(owner = "client!qi", name = "cb", descriptor = "I")
	private int anInt5204;

	@OriginalMember(owner = "client!qi", name = "db", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!qi", name = "hb", descriptor = "Z")
	private boolean aBoolean393;

	@OriginalMember(owner = "client!qi", name = "ib", descriptor = "Lclient!rh;")
	public Class54_Sub2 aClass54_Sub2_1;

	@OriginalMember(owner = "client!qi", name = "mb", descriptor = "Z")
	private boolean aBoolean394;

	@OriginalMember(owner = "client!qi", name = "nb", descriptor = "F")
	private float aFloat51;

	@OriginalMember(owner = "client!qi", name = "ob", descriptor = "Z")
	public boolean aBoolean395;

	@OriginalMember(owner = "client!qi", name = "rb", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!qi", name = "sb", descriptor = "Z")
	public boolean aBoolean397;

	@OriginalMember(owner = "client!qi", name = "tb", descriptor = "I")
	private int anInt5209;

	@OriginalMember(owner = "client!qi", name = "ub", descriptor = "I")
	private int anInt5210;

	@OriginalMember(owner = "client!qi", name = "vb", descriptor = "Lclient!rh;")
	public Class54_Sub2 aClass54_Sub2_2;

	@OriginalMember(owner = "client!qi", name = "wb", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_4;

	@OriginalMember(owner = "client!qi", name = "xb", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!qi", name = "zb", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!qi", name = "Ab", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!qi", name = "Bb", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!qi", name = "Eb", descriptor = "Z")
	private boolean aBoolean400;

	@OriginalMember(owner = "client!qi", name = "Fb", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!qi", name = "Gb", descriptor = "I")
	private int anInt5213;

	@OriginalMember(owner = "client!qi", name = "Hb", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_4;

	@OriginalMember(owner = "client!qi", name = "Ib", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_5;

	@OriginalMember(owner = "client!qi", name = "Kb", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_6;

	@OriginalMember(owner = "client!qi", name = "Lb", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_7;

	@OriginalMember(owner = "client!qi", name = "Nb", descriptor = "I")
	private int anInt5214;

	@OriginalMember(owner = "client!qi", name = "Qb", descriptor = "I")
	private int anInt5215;

	@OriginalMember(owner = "client!qi", name = "Rb", descriptor = "Z")
	public boolean aBoolean403;

	@OriginalMember(owner = "client!qi", name = "Vb", descriptor = "Lclient!r;")
	private Class7_Sub1_Sub1 aClass7_Sub1_Sub1_4;

	@OriginalMember(owner = "client!qi", name = "Xb", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_5;

	@OriginalMember(owner = "client!qi", name = "Yb", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!qi", name = "ac", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!qi", name = "dc", descriptor = "Lclient!lo;")
	public Class3_Sub2 aClass3_Sub2_8;

	@OriginalMember(owner = "client!qi", name = "ec", descriptor = "Ljava/lang/String;")
	private String aString48;

	@OriginalMember(owner = "client!qi", name = "fc", descriptor = "Z")
	public boolean aBoolean407;

	@OriginalMember(owner = "client!qi", name = "gc", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!qi", name = "ic", descriptor = "I")
	private int anInt5218;

	@OriginalMember(owner = "client!qi", name = "jc", descriptor = "F")
	private float aFloat59;

	@OriginalMember(owner = "client!qi", name = "lc", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!qi", name = "nc", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!qi", name = "oc", descriptor = "[Lclient!et;")
	private Class7[] aClass7Array1;

	@OriginalMember(owner = "client!qi", name = "qc", descriptor = "Lclient!ai;")
	public Class7_Sub1 aClass7_Sub1_6;

	@OriginalMember(owner = "client!qi", name = "rc", descriptor = "F")
	private float aFloat62;

	@OriginalMember(owner = "client!qi", name = "sc", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!qi", name = "tc", descriptor = "I")
	public int anInt5221;

	@OriginalMember(owner = "client!qi", name = "xc", descriptor = "Z")
	private boolean aBoolean410;

	@OriginalMember(owner = "client!qi", name = "yc", descriptor = "Z")
	private boolean aBoolean411;

	@OriginalMember(owner = "client!qi", name = "zc", descriptor = "Z")
	public boolean aBoolean412;

	@OriginalMember(owner = "client!qi", name = "Ac", descriptor = "F")
	public float aFloat65;

	@OriginalMember(owner = "client!qi", name = "Bc", descriptor = "I")
	private int anInt5224;

	@OriginalMember(owner = "client!qi", name = "Fc", descriptor = "Lclient!wf;")
	private Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!qi", name = "Gc", descriptor = "Lclient!hm;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!qi", name = "Hc", descriptor = "I")
	public int anInt5227;

	@OriginalMember(owner = "client!qi", name = "Jc", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!qi", name = "Kc", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!qi", name = "Nc", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!qi", name = "Pc", descriptor = "Lclient!la;")
	private Interface7 anInterface7_5;

	@OriginalMember(owner = "client!qi", name = "Qc", descriptor = "I")
	private int anInt5231;

	@OriginalMember(owner = "client!qi", name = "Sc", descriptor = "Z")
	private boolean aBoolean414;

	@OriginalMember(owner = "client!qi", name = "Wc", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!qi", name = "Xc", descriptor = "I")
	private int anInt5236;

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "Lclient!ko;")
	private final Class138 aClass138_1 = new Class138();

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "Lclient!dr;")
	private final Class54 aClass54_3 = new Class54_Sub2();

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
	public final int anInt5194 = 3;

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "[Lclient!mm;")
	private final Interface8[] anInterface8Array1 = new Interface8[4];

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
	private int anInt5195 = -1;

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
	public final int anInt5201 = 8;

	@OriginalMember(owner = "client!qi", name = "H", descriptor = "Lclient!sm;")
	private final Class210 aClass210_35 = new Class210();

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "Lclient!sm;")
	private final Class210 aClass210_36 = new Class210();

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "Lclient!sm;")
	private final Class210 aClass210_37 = new Class210();

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "Lclient!sm;")
	private final Class210 aClass210_38 = new Class210();

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "Lclient!sm;")
	private final Class210 aClass210_39 = new Class210();

	@OriginalMember(owner = "client!qi", name = "V", descriptor = "Lclient!sm;")
	private final Class210 aClass210_40 = new Class210();

	@OriginalMember(owner = "client!qi", name = "W", descriptor = "Lclient!sm;")
	private final Class210 aClass210_41 = new Class210();

	@OriginalMember(owner = "client!qi", name = "jb", descriptor = "I")
	private int anInt5207 = -1;

	@OriginalMember(owner = "client!qi", name = "eb", descriptor = "I")
	public int anInt5205 = 0;

	@OriginalMember(owner = "client!qi", name = "X", descriptor = "I")
	public int anInt5202 = 512;

	@OriginalMember(owner = "client!qi", name = "qb", descriptor = "F")
	public float aFloat53 = 1.0F;

	@OriginalMember(owner = "client!qi", name = "fb", descriptor = "[F")
	private final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!qi", name = "Ob", descriptor = "F")
	private float aFloat55 = 0.0F;

	@OriginalMember(owner = "client!qi", name = "hc", descriptor = "[F")
	public final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!qi", name = "cc", descriptor = "F")
	public float aFloat58 = 3584.0F;

	@OriginalMember(owner = "client!qi", name = "Db", descriptor = "I")
	public int anInt5212 = 0;

	@OriginalMember(owner = "client!qi", name = "kb", descriptor = "I")
	public int anInt5208 = 3584;

	@OriginalMember(owner = "client!qi", name = "yb", descriptor = "F")
	public float aFloat54 = -1.0F;

	@OriginalMember(owner = "client!qi", name = "Z", descriptor = "[F")
	private final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!qi", name = "kc", descriptor = "I")
	public int anInt5219 = 512;

	@OriginalMember(owner = "client!qi", name = "Sb", descriptor = "I")
	private int anInt5216 = 0;

	@OriginalMember(owner = "client!qi", name = "Cb", descriptor = "I")
	private int anInt5211 = 8448;

	@OriginalMember(owner = "client!qi", name = "wc", descriptor = "F")
	public float aFloat64 = 3584.0F;

	@OriginalMember(owner = "client!qi", name = "lb", descriptor = "[F")
	private final float[] lb = new float[4];

	@OriginalMember(owner = "client!qi", name = "Cc", descriptor = "I")
	private int anInt5225 = 0;

	@OriginalMember(owner = "client!qi", name = "Zb", descriptor = "F")
	public float aFloat57 = -1.0F;

	@OriginalMember(owner = "client!qi", name = "uc", descriptor = "I")
	private int anInt5222 = -1;

	@OriginalMember(owner = "client!qi", name = "Ec", descriptor = "I")
	private int anInt5226 = 0;

	@OriginalMember(owner = "client!qi", name = "Jb", descriptor = "[F")
	private final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!qi", name = "Mc", descriptor = "I")
	public int anInt5229 = 0;

	@OriginalMember(owner = "client!qi", name = "Dc", descriptor = "F")
	private float aFloat66 = 1.0F;

	@OriginalMember(owner = "client!qi", name = "bc", descriptor = "I")
	public int anInt5217 = -1;

	@OriginalMember(owner = "client!qi", name = "vc", descriptor = "I")
	private int anInt5223 = 0;

	@OriginalMember(owner = "client!qi", name = "Tc", descriptor = "I")
	public int anInt5232 = 50;

	@OriginalMember(owner = "client!qi", name = "mc", descriptor = "Z")
	private boolean aBoolean409 = true;

	@OriginalMember(owner = "client!qi", name = "Uc", descriptor = "I")
	private int anInt5233 = 0;

	@OriginalMember(owner = "client!qi", name = "Oc", descriptor = "I")
	public int anInt5230 = -1;

	@OriginalMember(owner = "client!qi", name = "Ic", descriptor = "I")
	private int anInt5228 = 0;

	@OriginalMember(owner = "client!qi", name = "Rc", descriptor = "F")
	public float aFloat70 = 1.0F;

	@OriginalMember(owner = "client!qi", name = "pc", descriptor = "I")
	private int anInt5220 = 8448;

	@OriginalMember(owner = "client!qi", name = "Yc", descriptor = "F")
	public float aFloat71 = 1.0F;

	@OriginalMember(owner = "client!qi", name = "Zc", descriptor = "I")
	public int anInt5237 = -1;

	@OriginalMember(owner = "client!qi", name = "pb", descriptor = "F")
	private float aFloat52 = 1.0F;

	@OriginalMember(owner = "client!qi", name = "Vc", descriptor = "I")
	private int anInt5234 = 0;

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas5;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!qi", name = "gb", descriptor = "I")
	public final int anInt5206;

	@OriginalMember(owner = "client!qi", name = "Mb", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!qi", name = "Pb", descriptor = "Z")
	public boolean aBoolean402;

	@OriginalMember(owner = "client!qi", name = "Ub", descriptor = "Z")
	public boolean aBoolean405;

	@OriginalMember(owner = "client!qi", name = "Tb", descriptor = "Z")
	public boolean aBoolean404;

	@OriginalMember(owner = "client!qi", name = "Lc", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!qi", name = "Wb", descriptor = "Z")
	public boolean aBoolean406;

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "Lclient!ti;")
	public final Class219 aClass219_1;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "Lclient!vg;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "Lclient!ur;")
	private final Class232 aClass232_1;

	@OriginalMember(owner = "client!qi", name = "C", descriptor = "Lclient!nt;")
	private final Class2_Sub28_Sub1 aClass2_Sub28_Sub1_1;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!bc;IILclient!dq;)V")
	public Class82_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class53 arg4) {
		super(arg2, arg1);
		this.aCanvas5 = arg0;
		@Pc(185) int local185 = 0;
		while (!this.aCanvas5.isShowing()) {
			if (local185++ > 5) {
				throw new RuntimeException("");
			}
			Static185.method3004(1000L);
		}
		this.aCanvas5.setIgnoreRepaint(true);
		try {
			if (Static293.aBoolean390 == null || !Static293.aBoolean390) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static293.aBoolean390 = Boolean.TRUE;
				} else {
					@Pc(219) Class1 local219 = arg4.method1182(this.getClass());
					while (local219.anInt2 == 0) {
						Static185.method3004(100L);
					}
					if (local219.anInt2 == 1) {
						Static293.aBoolean390 = Boolean.TRUE;
					}
				}
			}
			if (Static293.aBoolean390 == null || !Static293.aBoolean390) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas5, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method4613();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(286) int local286 = this.method4609();
				if (local286 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5206 = this.aBoolean403 ? 33639 : 5121;
				@Pc(305) String local305 = this.aString48.toLowerCase();
				@Pc(309) String local309 = this.aString47.toLowerCase();
				if (local309.indexOf("radeon") != -1) {
					@Pc(316) int local316 = 0;
					@Pc(318) boolean local318 = false;
					@Pc(320) boolean local320 = false;
					@Pc(328) String[] local328 = Static29.method705(local309.replace('/', ' '), ' ');
					for (@Pc(330) int local330 = 0; local330 < local328.length; local330++) {
						@Pc(338) String local338 = local328[local330];
						try {
							if (local338.length() > 0) {
								if (local338.charAt(0) == 'x' && local338.length() >= 3 && Static225.method3769(local338.substring(1, 3))) {
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
									if (local338.length() >= 4 && Static225.method3769(local338.substring(0, 4))) {
										local316 = Static319.method4935(local338.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
					if (!local320 && !local318) {
						if (local316 >= 7000 && local316 <= 7999) {
							this.aBoolean401 = false;
						}
						if (local316 >= 7000 && local316 <= 9250) {
							this.aBoolean402 = false;
						}
					}
					if (!local318 || local316 < 4000) {
						this.aBoolean405 = false;
					}
					this.aBoolean404 &= this.anOpengl2.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean413 = this.aBoolean401;
				}
				if (local305.contains("intel")) {
					this.aBoolean406 = false;
				}
				if (this.aBoolean401) {
					try {
						@Pc(460) int[] local460 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local460, 0);
					} catch (@Pc(468) Throwable local468) {
						throw new RuntimeException("", local468);
					}
				}
				this.method4602(this);
				this.method4526();
				this.method4598();
				new Class226(this);
				this.aClass219_1 = new Class219(this, this.anInterface1_4);
				Static256.method4022(true);
				this.aBoolean391 = true;
				this.aClass235_1 = new Class235(this);
				this.aClass232_1 = new Class232(this);
				this.aClass2_Sub28_Sub1_1 = new Class2_Sub28_Sub1(this);
				this.method4597();
				this.anOpengl2.glClear(16640);
				local185 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(533) Exception local533) {
						if (local185++ > 5) {
							throw new RuntimeException("");
						}
						Static185.method3004(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(552) Throwable local552) {
			local552.printStackTrace();
			this.method4534();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local552);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIILclient!vb;II)V")
	@Override
	public void method4540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class201 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class201_Sub2 local2 = (Class201_Sub2) arg5;
		@Pc(5) Class7_Sub1_Sub1 local5 = local2.aClass7_Sub1_Sub1_5;
		this.method4626();
		this.method4614(local2.aClass7_Sub1_Sub1_5);
		this.method4575(1);
		this.method4624(7681, 8448);
		this.method4592(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat75 / (float) local5.anInt5437;
		@Pc(37) float local37 = local5.aFloat76 / (float) local5.anInt5438;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method4592(0, 5890, 768);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!op;)V")
	@Override
	public void method4508(@OriginalArg(0) Class21 arg0) {
		this.aClass21_Sub1_1 = (Class21_Sub1) arg0;
	}

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "()V")
	public void method4561() {
		if (this.anInt5203 != 2) {
			this.anInt5203 = 2;
			this.method4627();
			this.method4608();
			this.anInt5231 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "()I")
	@Override
	public int method4490() {
		@Pc(2) int local2 = this.anInt5209;
		this.anInt5209 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!qi", name = "N", descriptor = "()V")
	public void method4562() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray25, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(II)V")
	public synchronized void method4563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub44 local4 = new Class2_Sub44(arg1);
		local4.aLong208 = arg0;
		this.aClass210_38.method5044(local4);
	}

	@OriginalMember(owner = "client!qi", name = "H", descriptor = "()V")
	@Override
	public void method4548() {
	}

	@OriginalMember(owner = "client!qi", name = "O", descriptor = "()V")
	public void method4564() {
		if (this.anInt5231 == 8) {
			return;
		}
		this.method4561();
		this.method4616(true);
		this.method4585(true);
		this.method4573(true);
		this.method4575(1);
		this.method4618(1);
		this.anInt5231 = 8;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[Lclient!rc;)V")
	@Override
	public void method4489(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class2_Sub14 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static293.aFloatArray20[0] = local8.anInt2170;
			Static293.aFloatArray20[1] = local8.anInt2165;
			Static293.aFloatArray20[2] = local8.anInt2167;
			Static293.aFloatArray20[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static293.aFloatArray20, 0);
			@Pc(44) int local44 = local8.anInt2172;
			@Pc(49) float local49 = local8.aFloat25 / 255.0F;
			Static293.aFloatArray20[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static293.aFloatArray20[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static293.aFloatArray20[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static293.aFloatArray20, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt2166 * local8.anInt2166));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt5226) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt5226 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "()F")
	@Override
	public float method4546() {
		return this.aFloat63;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([I)V")
	@Override
	public void method4523(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5225;
		arg0[1] = this.anInt5216;
		arg0[2] = this.anInt5233;
		arg0[3] = this.anInt5228;
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(IIIIII)Lclient!op;")
	@Override
	public Class21 method4541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean412 ? new Class21_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!qi", name = "B", descriptor = "()I")
	@Override
	public int method4529() {
		return this.anInt5232;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	@Override
	public void method4481(@OriginalArg(0) int arg0) {
		this.method4575(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!qi", name = "P", descriptor = "()V")
	private void method4565() {
		if (this.aBoolean394 && this.aBoolean398 | this.anInt5230 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "()V")
	@Override
	public void method4512() {
		this.anInt5225 = 0;
		this.anInt5216 = 0;
		this.anInt5233 = this.anInt5193;
		this.anInt5228 = this.anInt5200;
		this.anOpengl2.glDisable(3089);
		this.method4621();
	}

	@OriginalMember(owner = "client!qi", name = "Q", descriptor = "()V")
	private void method4566() {
		if (this.aBoolean400) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean400 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[BIZ)Lclient!hm;")
	public Interface3 method4567(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface3) (this.aBoolean401 && (!arg2 || this.aBoolean413) ? new Class16_Sub2(this, 5123, arg0, arg1, arg2) : new Class131_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "()V")
	@Override
	public void method4560() {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!sa;)V")
	@Override
	public void method4467(@OriginalArg(0) Class2_Sub34 arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "()Z")
	@Override
	public boolean method4498() {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "()Z")
	@Override
	public boolean method4521() {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4468(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "()V")
	private void method4568() {
		@Pc(15) int local15;
		if (this.aBoolean398) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt5222;
		} else {
			this.aFloat62 = (float) (this.anInt5208 - 256) - this.aFloat55;
			this.aFloat56 = this.aFloat62 - (float) this.anInt5230 * this.aFloat66;
			if (this.aFloat56 < (float) this.anInt5232) {
				this.aFloat56 = this.anInt5232;
			}
			this.anOpengl2.glFogf(2915, this.aFloat56);
			this.anOpengl2.glFogf(2916, this.aFloat62);
			local15 = this.anInt5237;
		}
		Static293.aFloatArray21[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static293.aFloatArray21[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static293.aFloatArray21[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static293.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(FF)V")
	@Override
	public void method4516(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat69 && arg1 == this.aFloat63) {
			return;
		}
		this.aFloat69 = arg0;
		this.aFloat63 = arg1;
		this.method4594();
		if (this.anInt5203 == 3) {
			this.method4628();
		} else if (this.anInt5203 == 2) {
			this.method4627();
		}
	}

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "()Z")
	@Override
	public boolean method4503() {
		if (!this.aClass2_Sub28_Sub1_1.method3959()) {
			if (!this.aClass232_1.method5444(this.aClass2_Sub28_Sub1_1)) {
				return false;
			}
			this.aClass219_1.method5199();
		}
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "(I)V")
	public void method4569() {
		this.method4576(-2, true);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(F)V")
	@Override
	public void method4457(@OriginalArg(0) float arg0) {
		if (this.aFloat61 != arg0) {
			this.aFloat61 = arg0;
			this.method4612();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt5193) {
			arg2 = this.anInt5193;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt5200) {
			arg3 = this.anInt5200;
		}
		this.anInt5225 = arg0;
		this.anInt5216 = arg1;
		this.anInt5233 = arg2;
		this.anInt5228 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method4621();
		this.method4584();
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)Lclient!sa;")
	@Override
	public Class2_Sub34 method4500() {
		return null;
	}

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "()V")
	@Override
	protected void method4534() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass232_1.method5440();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method4630();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean391) {
			Static318.method4081(true);
			this.aBoolean391 = false;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
	@Override
	public int method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIIII)Lclient!aq;")
	@Override
	public Class5 method4456(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class5_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qi", name = "S", descriptor = "()V")
	private void method4570() {
		if (this.anInt5203 != 3) {
			this.anInt5203 = 3;
			this.method4628();
			this.method4608();
			this.anInt5231 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(II)V")
	@Override
	public void method4524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5232 == arg0 && this.anInt5208 == arg1) {
			return;
		}
		this.anInt5232 = arg0;
		this.anInt5208 = arg1;
		this.method4583();
		this.method4568();
		if (this.anInt5203 == 3) {
			this.method4628();
		} else if (this.anInt5203 == 2) {
			this.method4627();
		}
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "(I)V")
	public void method4571(@OriginalArg(0) int arg0) {
		Static293.aFloatArray21[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static293.aFloatArray21[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static293.aFloatArray21[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static293.aFloatArray21[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static293.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4604();
		this.method4575(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!qi", name = "J", descriptor = "()Z")
	@Override
	public boolean method4551() {
		return !this.aBoolean392;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(II)V")
	public void method4572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5234 = arg0;
		this.anInt5223 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt5193, this.anInt5200);
		this.method4584();
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "()F")
	@Override
	public float method4479() {
		return this.aFloat69;
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(Z)V")
	public void method4573(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean396) {
			this.aBoolean396 = arg0;
			this.method4629();
			this.anInt5231 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!gr;IIII)Lclient!ab;")
	@Override
	public Class3 method4466(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class3_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(Z)V")
	public void method4574(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean408) {
			this.aBoolean408 = arg0;
			this.method4633();
			this.anInt5231 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "(I)V")
	public void method4575(@OriginalArg(0) int arg0) {
		if (this.anInt5215 == arg0) {
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
		if (local10 != this.aBoolean414) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean414 = local10;
		}
		if (local12 != this.aBoolean399) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean399 = local12;
		}
		if (local8 != this.anInt5224) {
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
			this.anInt5224 = local8;
		}
		this.anInt5215 = arg0;
		this.anInt5231 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	public void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4606(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "(I)I")
	public int method4577(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass232_1.method5446(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "()Z")
	@Override
	public boolean method4475() {
		return this.aClass235_1.method5532();
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "(I)I")
	public int method4578(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!mm;)V")
	public void method4579(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt5195 < 0 || this.anInterface8Array1[this.anInt5195] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface8Array1[this.anInt5195--] = null;
		arg0.method4560();
		if (this.anInt5195 >= 0) {
			this.anInterface8_1 = this.anInterface8Array1[this.anInt5195];
			this.anInterface8_1.method4558();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass7_Sub1_Sub1_4 == null || this.aClass7_Sub1_Sub1_4.anInt5435 < arg2 || this.aClass7_Sub1_Sub1_4.anInt5434 < arg3) {
			this.aClass7_Sub1_Sub1_4 = Static402.method4750(arg3, this, arg6, arg2);
			this.aClass7_Sub1_Sub1_4.method4749(false, false);
			local32 = this.aClass7_Sub1_Sub1_4.aFloat76;
			local36 = this.aClass7_Sub1_Sub1_4.aFloat75;
		} else {
			this.aClass7_Sub1_Sub1_4.method4747(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass7_Sub1_Sub1_4.aFloat76 * (float) arg3 / (float) this.aClass7_Sub1_Sub1_4.anInt5434;
			local36 = this.aClass7_Sub1_Sub1_4.aFloat75 * (float) arg2 / (float) this.aClass7_Sub1_Sub1_4.anInt5435;
		}
		this.method4626();
		this.method4614(this.aClass7_Sub1_Sub1_4);
		this.method4575(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4571(arg5);
		this.method4624(34165, 34165);
		this.method4592(0, 34166, 768);
		this.method4592(2, 5890, 770);
		this.method4631(0, 34166);
		this.method4631(2, 5890);
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
		this.method4592(0, 5890, 768);
		this.method4592(2, 34166, 770);
		this.method4631(0, 5890);
		this.method4631(2, 34166);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!uk;Lclient!uk;Lclient!uk;Lclient!uk;)V")
	public void method4580(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class229 arg2, @OriginalArg(3) Class229 arg3) {
		if (arg0 == null) {
			this.anOpengl2.glDisableClientState(32884);
		} else {
			this.anOpengl2.glEnableClientState(32884);
			arg0.method5372();
		}
		if (arg1 == null) {
			this.anOpengl2.glDisableClientState(32885);
		} else {
			this.anOpengl2.glEnableClientState(32885);
			arg1.method5369();
		}
		if (arg2 == null) {
			this.anOpengl2.glDisableClientState(32886);
		} else {
			this.anOpengl2.glEnableClientState(32886);
			arg2.method5370();
		}
		if (arg3 == null) {
			this.anOpengl2.glDisableClientState(32888);
		} else {
			this.anOpengl2.glEnableClientState(32888);
			arg3.method5371();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!hm;)V")
	public void method4581(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_4 != arg0 && this.aBoolean401) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method5130());
			this.anInterface3_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!vb;II)V")
	@Override
	public void method4494(@OriginalArg(1) Class201 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class201_Sub2 local2 = (Class201_Sub2) arg0;
		@Pc(5) Class7_Sub1_Sub1 local5 = local2.aClass7_Sub1_Sub1_5;
		this.method4626();
		this.method4614(local2.aClass7_Sub1_Sub1_5);
		this.method4575(1);
		this.method4624(7681, 8448);
		this.method4592(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat75 / (float) local5.anInt5437;
		@Pc(37) float local37 = local5.aFloat76 / (float) local5.anInt5438;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5225 - arg1), local37 * (float) (this.anInt5216 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5225, this.anInt5216);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5225 - arg1), local37 * (float) (this.anInt5228 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5225, this.anInt5228);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5233 - arg1), local37 * (float) (this.anInt5228 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5233, this.anInt5228);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5233 - arg1), local37 * (float) (this.anInt5216 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5233, this.anInt5216);
		this.anOpengl2.glEnd();
		this.method4592(0, 5890, 768);
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "()V")
	@Override
	public void method4461() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	@Override
	public void method4459(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "(I)V")
	public void method4582(@OriginalArg(0) int arg0) {
		if (this.anInt5214 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt5214 = arg0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "()V")
	private void method4583() {
		@Pc(2) float[] local2 = this.aFloatArray23;
		@Pc(14) float local14 = (float) (-this.anInt5229 * this.anInt5232) / (float) this.anInt5202;
		@Pc(28) float local28 = (float) ((this.anInt5193 - this.anInt5229) * this.anInt5232) / (float) this.anInt5202;
		@Pc(39) float local39 = (float) (this.anInt5205 * this.anInt5232) / (float) this.anInt5219;
		@Pc(53) float local53 = (float) ((this.anInt5205 - this.anInt5200) * this.anInt5232) / (float) this.anInt5219;
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
			@Pc(67) float local67 = (float) this.anInt5232 * 2.0F;
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
			local2[10] = this.aFloat59 = (float) -(this.anInt5208 + this.anInt5232) / (float) (this.anInt5208 - this.anInt5232);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat51 = -(local67 * (float) this.anInt5208) / (float) (this.anInt5208 - this.anInt5232);
			local2[15] = 0.0F;
		}
		this.method4594();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[[I[[IIII)Lclient!dh;")
	@Override
	public Class33 method4538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class33_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!qi", name = "C", descriptor = "()I")
	@Override
	public int method4532() {
		return 4;
	}

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "()Z")
	@Override
	public boolean method4488() {
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4604();
		this.method4575(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean393) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean393) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(IIIII)V")
	@Override
	protected void method4515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
	@Override
	public void method4558() {
	}

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "()V")
	private void method4584() {
		if (this.anInt5225 <= this.anInt5233 && this.anInt5216 <= this.anInt5228) {
			this.anOpengl2.glScissor(this.anInt5234 + this.anInt5225, this.anInt5223 + this.anInt5200 - this.anInt5228, this.anInt5233 - this.anInt5225, this.anInt5228 - this.anInt5216);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	@Override
	public void method4464(@OriginalArg(0) int arg0) {
		this.method4613();
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(Z)V")
	public void method4585(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean411) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean411 = arg0;
		this.anInt5231 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "()Z")
	@Override
	public boolean method4502() {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!la;)V")
	public void method4586(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_5 != arg0 && this.aBoolean401) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method5130());
			this.anInterface7_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "(II)V")
	public synchronized void method4587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub44 local4 = new Class2_Sub44(arg1);
		local4.aLong208 = arg0;
		this.aClass210_37.method5044(local4);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)V")
	@Override
	public void method4519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5237 == arg0 && this.anInt5230 == arg1) {
			return;
		}
		this.anInt5237 = arg0;
		this.anInt5230 = arg1;
		if (!this.aBoolean398) {
			this.method4568();
			this.method4565();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
	@Override
	public void method4549(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(FF)V")
	public void method4588(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat66 = arg0;
		this.aFloat55 = arg1;
		if (!this.aBoolean398) {
			this.method4568();
		}
	}

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "(I)V")
	public synchronized void method4589(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub44 local4 = new Class2_Sub44(arg0);
		this.aClass210_40.method5044(local4);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass54_Sub2_2.aFloat81 * (float) arg0 + this.aClass54_Sub2_2.aFloat84 * (float) arg1 + this.aClass54_Sub2_2.aFloat77 * (float) arg2 + this.aClass54_Sub2_2.aFloat85;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass54_Sub2_2.aFloat81 * (float) arg3 + this.aClass54_Sub2_2.aFloat84 * (float) arg4 + this.aClass54_Sub2_2.aFloat77 * (float) arg5 + this.aClass54_Sub2_2.aFloat85;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt5232 && local55 < (float) this.anInt5232 || !(!(local24 > (float) this.anInt5208) || !(local55 > (float) this.anInt5208))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt5202 * (this.aClass54_Sub2_2.aFloat87 * (float) arg0 + this.aClass54_Sub2_2.aFloat80 * (float) arg1 + this.aClass54_Sub2_2.aFloat86 * (float) arg2 + this.aClass54_Sub2_2.aFloat82) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt5202 * (this.aClass54_Sub2_2.aFloat87 * (float) arg3 + this.aClass54_Sub2_2.aFloat80 * (float) arg4 + this.aClass54_Sub2_2.aFloat86 * (float) arg5 + this.aClass54_Sub2_2.aFloat82) / local55);
		if ((float) local119 < this.aFloat68 && (float) local151 < this.aFloat68 || (float) local119 > this.aFloat67 && (float) local151 > this.aFloat67) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt5219 * (this.aClass54_Sub2_2.aFloat83 * (float) arg0 + this.aClass54_Sub2_2.aFloat79 * (float) arg1 + this.aClass54_Sub2_2.aFloat78 * (float) arg2 + this.aClass54_Sub2_2.aFloat88) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt5219 * (this.aClass54_Sub2_2.aFloat83 * (float) arg3 + this.aClass54_Sub2_2.aFloat79 * (float) arg4 + this.aClass54_Sub2_2.aFloat78 * (float) arg5 + this.aClass54_Sub2_2.aFloat88) / local55);
			return (!((float) local209 < this.aFloat65) || !((float) local241 < this.aFloat65)) && (!((float) local209 > this.aFloat60) || !((float) local241 > this.aFloat60));
		}
	}

	@OriginalMember(owner = "client!qi", name = "K", descriptor = "()Z")
	@Override
	public boolean method4554() {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "V", descriptor = "()V")
	public void method4590() {
		if (this.anInt5203 != 0) {
			this.anInt5203 = 0;
			this.anInt5231 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(FFFF)V")
	public void method4591(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static293.aFloatArray21[0] = arg0;
		Static293.aFloatArray21[1] = arg1;
		Static293.aFloatArray21[2] = arg2;
		Static293.aFloatArray21[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static293.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public void method4592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!qi", name = "W", descriptor = "()V")
	private void method4593() {
		Static293.aFloatArray21[0] = this.aFloat57 * this.aFloat53;
		Static293.aFloatArray21[1] = this.aFloat57 * this.aFloat71;
		Static293.aFloatArray21[2] = this.aFloat57 * this.aFloat70;
		Static293.aFloatArray21[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static293.aFloatArray21, 0);
		Static293.aFloatArray21[0] = -this.aFloat54 * this.aFloat53;
		Static293.aFloatArray21[1] = -this.aFloat54 * this.aFloat71;
		Static293.aFloatArray21[2] = -this.aFloat54 * this.aFloat70;
		Static293.aFloatArray21[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static293.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!qi", name = "X", descriptor = "()V")
	private void method4594() {
		if (this.aFloat63 == 0.0F) {
			this.aFloatArray23[10] = this.aFloat59;
			this.aFloatArray23[14] = this.aFloat51;
		} else {
			@Pc(13) float local13 = this.aFloat69 / (this.aFloat63 + this.aFloat69);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat51 * (1.0F - local13) * (1.0F - local13) / this.aFloat63;
			this.aFloatArray23[10] = this.aFloat59 + local32;
			this.aFloatArray23[14] = this.aFloat51 * local17;
		}
		this.aFloat64 = (this.aFloatArray23[14] - (float) this.anInt5208) / this.aFloatArray23[10];
		this.aFloat58 = (float) this.anInt5208 - this.aFloat63;
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "()V")
	@Override
	public void method4460() {
		if (this.anInt5193 <= 0 && this.anInt5200 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt5225;
		@Pc(12) int local12 = this.anInt5233;
		@Pc(15) int local15 = this.anInt5216;
		@Pc(18) int local18 = this.anInt5228;
		this.method4512();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4590();
		this.method4616(false);
		this.method4574(false);
		this.method4585(false);
		this.method4573(false);
		this.method4614(null);
		this.method4569();
		this.method4618(0);
		this.method4575(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt5193, this.anInt5200, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4477(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!qi", name = "z", descriptor = "()V")
	@Override
	public void method4526() {
		this.anInt5193 = this.aCanvas5.getWidth();
		this.anInt5200 = this.aCanvas5.getHeight();
		this.anOpengl2.glViewport(this.anInt5234, this.anInt5223, this.anInt5193, this.anInt5200);
		this.method4590();
		this.method4512();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!op;Lclient!op;FLclient!op;)Lclient!op;")
	@Override
	public Class21 method4465(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean412 && this.aBoolean406) {
			@Pc(11) Class21_Sub1_Sub1 local11 = null;
			@Pc(14) Class21_Sub1 local14 = (Class21_Sub1) arg0;
			@Pc(17) Class21_Sub1 local17 = (Class21_Sub1) arg1;
			@Pc(21) Class7_Sub4 local21 = local14.method2723();
			@Pc(25) Class7_Sub4 local25 = local17.method2723();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt5179 > local25.anInt5179 ? local21.anInt5179 : local25.anInt5179;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class21_Sub1_Sub1) {
					@Pc(52) Class21_Sub1_Sub1 local52 = (Class21_Sub1_Sub1) arg3;
					if (local52.method583() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class21_Sub1_Sub1(this, local40);
				}
				local11.method584(local25, arg2, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "()V")
	@Override
	public void method4547() {
		if (this.aClass2_Sub28_Sub1_1.method3959()) {
			this.aClass232_1.method5441(this.aClass2_Sub28_Sub1_1);
			this.aClass219_1.method5199();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!hm;III)V")
	public void method4595(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4581(arg0);
		arg0.method3547(arg1, arg2);
	}

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "(I)V")
	@Override
	public void method4522(@OriginalArg(0) int arg0) {
		this.method4630();
	}

	@OriginalMember(owner = "client!qi", name = "Y", descriptor = "()Lclient!qh;")
	public Class7_Sub4 method4596() {
		return this.aClass21_Sub1_1 == null ? null : this.aClass21_Sub1_1.method2723();
	}

	@OriginalMember(owner = "client!qi", name = "Z", descriptor = "()V")
	private void method4597() {
		this.method4569();
		for (@Pc(7) int local7 = this.anInt5235 - 1; local7 >= 0; local7--) {
			this.method4582(local7);
			this.method4614(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method4624(8448, 8448);
		this.method4592(2, 34168, 770);
		this.method4566();
		this.anInt5215 = 1;
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt5224 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean399 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean414 = true;
		this.method4616(true);
		this.method4574(true);
		this.method4585(true);
		this.method4573(true);
		this.method4590();
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
		this.anInt5207 = this.anInt5237 = -1;
		this.method4512();
	}

	@OriginalMember(owner = "client!qi", name = "ab", descriptor = "()V")
	private void method4598() {
		this.aClass54_Sub2_2 = new Class54_Sub2();
		this.aClass54_Sub2_1 = new Class54_Sub2();
		this.aClass7Array1 = new Class7[this.anInt5235];
		this.aClass7_Sub1_4 = new Class7_Sub1(this, 3553, 6408, 1, 1);
		this.aClass7_Sub1_6 = new Class7_Sub1(this, 3553, 6408, 1, 1);
		this.aClass7_Sub1_5 = new Class7_Sub1(this, 3553, 6408, 1, 1);
		this.aClass3_Sub2_5 = new Class3_Sub2(this);
		this.aClass3_Sub2_4 = new Class3_Sub2(this);
		this.aClass3_Sub2_1 = new Class3_Sub2(this);
		this.aClass3_Sub2_2 = new Class3_Sub2(this);
		this.aClass3_Sub2_3 = new Class3_Sub2(this);
		this.aClass3_Sub2_8 = new Class3_Sub2(this);
		this.aClass3_Sub2_6 = new Class3_Sub2(this);
		this.aClass3_Sub2_7 = new Class3_Sub2(this);
		if (this.aBoolean406) {
			this.aClass42_3 = new Class42(this);
		}
		this.aClass138_1.method3045(this);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ss;[Lclient!ua;Z)Lclient!oj;")
	@Override
	public Class13 method4472(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class224[] arg1) {
		return new Class13_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "()Z")
	@Override
	public boolean method4463() {
		return this.aClass2_Sub28_Sub1_1.method3959();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([Lclient!ab;Lclient!dr;[Lclient!bm;I)V")
	@Override
	public void method4535(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class22_Sub1[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method3443(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(FFF)V")
	private void method4599(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean400) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean400 = true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([Lclient!ab;Lclient!nd;Lclient!dr;[Lclient!bm;I)V")
	@Override
	public void method4545(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class22_Sub1[] arg3, @OriginalArg(4) int arg4) {
		this.method4535(arg0, arg2, arg3, arg4);
		this.method4510(arg1);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4536(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4461();
	}

	@OriginalMember(owner = "client!qi", name = "bb", descriptor = "()V")
	public void method4600() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "()Z")
	@Override
	public boolean method4469() {
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!la;")
	public Interface7 method4601(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface7) (this.aBoolean401 ? new Class16_Sub1(this, arg0, arg1, false) : new Class131_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Lclient!mm;)V")
	public void method4602(@OriginalArg(0) Interface8 arg0) {
		if (this.anInt5195 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5195 >= 0) {
			this.anInterface8Array1[this.anInt5195].method4560();
		}
		this.anInterface8_1 = this.anInterface8Array1[++this.anInt5195] = arg0;
		this.anInterface8_1.method4558();
	}

	@OriginalMember(owner = "client!qi", name = "cb", descriptor = "()V")
	public void method4603() {
		if (this.anInt5231 == 4) {
			return;
		}
		this.method4622();
		this.method4616(false);
		this.method4574(false);
		this.method4585(false);
		this.method4573(false);
		this.method4569();
		this.method4575(1);
		this.method4618(1);
		this.anInt5231 = 4;
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "()V")
	@Override
	public void method4458() {
		this.method4573(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5229 = arg0;
		this.anInt5205 = arg1;
		this.anInt5202 = arg2;
		this.anInt5219 = arg3;
		this.method4583();
		this.method4621();
		if (this.anInt5203 == 3) {
			this.method4628();
		} else if (this.anInt5203 == 2) {
			this.method4627();
		}
	}

	@OriginalMember(owner = "client!qi", name = "db", descriptor = "()V")
	private void method4604() {
		if (this.anInt5231 == 1) {
			return;
		}
		this.method4622();
		this.method4616(false);
		this.method4574(false);
		this.method4585(false);
		this.method4573(false);
		this.method4614(null);
		this.method4569();
		this.method4618(0);
		this.anInt5231 = 1;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(F)V")
	public void method4605(@OriginalArg(0) float arg0) {
		if (this.aFloat52 != arg0) {
			this.aFloat52 = arg0;
			if (this.anInt5203 == 3) {
				this.method4628();
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "E", descriptor = "()Z")
	@Override
	public boolean method4543() {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZZ)V")
	public void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt5236) {
			if (arg0 < 0) {
				this.method4566();
				this.method4614(null);
				if (!this.aBoolean398) {
					this.aClass235_1.method5533(0, arg1, arg2);
				}
			} else {
				@Pc(11) Class7_Sub1 local11 = this.aClass219_1.method5200(arg0);
				@Pc(17) Class182 local17 = this.anInterface1_4.method2849(arg0);
				if (local17.aByte52 == 0 && local17.aByte50 == 0) {
					this.method4566();
				} else {
					@Pc(30) int local30 = local17.aBoolean361 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method4599((float) (this.anInt5197 % local34 * local17.aByte52) / (float) local34, (float) (this.anInt5197 % local34 * local17.aByte50) / (float) local34, 0.0F);
				}
				if (this.aBoolean398) {
					this.aClass235_1.method5533(3, arg1, arg2);
					this.method4614(local11);
				} else {
					this.aClass235_1.method5533(local17.aByte47, arg1, arg2);
					this.aClass235_1.method5535(local17.aByte48, false);
					if (!this.aClass235_1.method5534(local11)) {
						this.method4614(local11);
					}
				}
			}
			this.anInt5236 = arg0;
		}
		this.anInt5231 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qi", name = "eb", descriptor = "()Lclient!mm;")
	public Interface8 method4607() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!qi", name = "fb", descriptor = "()V")
	private void method4608() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass54_Sub2_2.method4797(), 0);
		this.method4562();
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4604();
		this.method4575(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "()V")
	@Override
	public void method4507() {
		this.aClass232_1.method5442();
	}

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "()Lclient!dr;")
	@Override
	public Class54 method4493() {
		return new Class54_Sub2();
	}

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "()I")
	@Override
	public int method4478() {
		return this.anInt5196 + this.anInt5199 + this.anInt5198;
	}

	@OriginalMember(owner = "client!qi", name = "gb", descriptor = "()I")
	private int method4609() {
		@Pc(1) int local1 = 0;
		this.aString48 = this.anOpengl2.glGetString(7936);
		this.aString47 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString48.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static29.method705(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static319.method4935(local53[0]);
				@Pc(69) int local69 = Static319.method4935(local53[1]);
				this.anInt5210 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt5210 < 12) {
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
		this.anInt5235 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt5218 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt5204 = local116[0];
		if (this.anInt5235 < 2 || this.anInt5218 < 2 || this.anInt5204 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean392 = Static65.aString14 != null && Static65.aString14.startsWith("mac");
		this.aBoolean403 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean401 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean393 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean407 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean397 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean402 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean404 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean412 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean405 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean395 = false;
		this.aBoolean406 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I[BIZ)Lclient!la;")
	public Interface7 method4610(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface7) (this.aBoolean401 && (!arg3 || this.aBoolean413) ? new Class16_Sub1(this, arg0, arg1, arg2, arg3) : new Class131_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "()Z")
	@Override
	public boolean method4484() {
		return this.aClass2_Sub28_Sub1_1.method3960();
	}

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "()V")
	@Override
	public void method4495() {
		this.aClass235_1.method5533(0, false, false);
		this.aBoolean398 = false;
		this.method4568();
		this.method4565();
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5225 < arg0) {
			this.anInt5225 = arg0;
		}
		if (this.anInt5233 > arg2) {
			this.anInt5233 = arg2;
		}
		if (this.anInt5216 < arg1) {
			this.anInt5216 = arg1;
		}
		if (this.anInt5228 > arg3) {
			this.anInt5228 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method4621();
		this.method4584();
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "()Z")
	@Override
	public boolean method4471() {
		return this.aBoolean393;
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(II)V")
	public synchronized void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class2_Sub44 local4 = new Class2_Sub44(arg1);
		local4.aLong208 = arg0;
		this.aClass210_36.method5044(local4);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[I[I)Lclient!vb;")
	@Override
	public Class201 method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static403.method5173(arg1, arg0, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method4517(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class2_Sub44 local16;
		while (!this.aClass210_36.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_36.method5039();
			Static293.anIntArray643[local1++] = (int) local16.aLong208;
			this.anInt5196 -= local16.anInt6631;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static293.anIntArray643, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static293.anIntArray643, 0);
			local1 = 0;
		}
		while (!this.aClass210_37.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_37.method5039();
			Static293.anIntArray643[local1++] = (int) local16.aLong208;
			this.anInt5199 -= local16.anInt6631;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static293.anIntArray643, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static293.anIntArray643, 0);
			local1 = 0;
		}
		while (!this.aClass210_38.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_38.method5039();
			Static293.anIntArray643[local1++] = local16.anInt6631;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static293.anIntArray643, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static293.anIntArray643, 0);
			local1 = 0;
		}
		while (!this.aClass210_39.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_39.method5039();
			Static293.anIntArray643[local1++] = (int) local16.aLong208;
			this.anInt5198 -= local16.anInt6631;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static293.anIntArray643, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static293.anIntArray643, 0);
			local1 = 0;
		}
		while (!this.aClass210_40.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_40.method5039();
			Static293.anIntArray643[local1++] = (int) local16.aLong208;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static293.anIntArray643, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static293.anIntArray643, 0);
		}
		while (!this.aClass210_35.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_35.method5039();
			this.anOpengl2.glDeleteLists((int) local16.aLong208, local16.anInt6631);
		}
		while (!this.aClass210_41.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_41.method5039();
			this.anOpengl2.glDeleteObjectARB(local16.anInt6631);
		}
		while (!this.aClass210_35.method5040()) {
			local16 = (Class2_Sub44) this.aClass210_35.method5039();
			this.anOpengl2.glDeleteLists((int) local16.aLong208, local16.anInt6631);
		}
		if (this.method4478() > 100663296 && Static51.method979() > this.aLong165 + 60000L) {
			System.gc();
			this.aLong165 = Static51.method979();
		}
		this.anInt5197 = local5;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ua;Z)Lclient!aq;")
	@Override
	public Class5 method4514(@OriginalArg(0) Class224 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt6145 * arg0.anInt6142];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray96 == null) {
			for (local15 = 0; local15 < arg0.anInt6142; local15++) {
				for (local21 = 0; local21 < arg0.anInt6145; local21++) {
					@Pc(74) int local74 = arg0.anIntArray735[arg0.aByteArray97[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt6142; local15++) {
				for (local21 = 0; local21 < arg0.anInt6145; local21++) {
					local6[local10++] = arg0.aByteArray96[local8] << 24 | arg0.anIntArray735[arg0.aByteArray97[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class5 local100 = this.method4456(local6, arg0.anInt6145, arg0.anInt6145, arg0.anInt6142);
		local100.method4994(arg0.anInt6144, arg0.anInt6141, arg0.anInt6143, arg0.anInt6146);
		return local100;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method4552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method4604();
		this.method4575(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean393) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean393) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qi", name = "A", descriptor = "()Z")
	@Override
	public boolean method4527() {
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "hb", descriptor = "()V")
	private void method4612() {
		Static293.aFloatArray21[0] = this.aFloat61 * this.aFloat53;
		Static293.aFloatArray21[1] = this.aFloat61 * this.aFloat71;
		Static293.aFloatArray21[2] = this.aFloat61 * this.aFloat70;
		Static293.aFloatArray21[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static293.aFloatArray21, 0);
	}

	@OriginalMember(owner = "client!qi", name = "ib", descriptor = "()V")
	private void method4613() {
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
			Static185.method3004(1000L);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!et;)V")
	public void method4614(@OriginalArg(0) Class7 arg0) {
		@Pc(5) Class7 local5 = this.aClass7Array1[this.anInt5214];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt5432);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt5432);
				} else if (arg0.anInt5432 != local5.anInt5432) {
					this.anOpengl2.glDisable(local5.anInt5432);
					this.anOpengl2.glEnable(arg0.anInt5432);
				}
				this.anOpengl2.glBindTexture(arg0.anInt5432, arg0.method4741());
			}
			this.aClass7Array1[this.anInt5214] = arg0;
		}
		this.anInt5231 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4537(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static247.aFloat47 = arg0;
		Static247.aFloat46 = arg1;
		Static247.aFloat48 = arg2;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!dr;)V")
	@Override
	public void method4533(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub2_2 = (Class54_Sub2) arg0;
		this.aClass54_Sub2_1.method4794(this.aClass54_Sub2_2);
		if (this.anInt5203 != 1) {
			this.method4608();
		}
	}

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "(Z)V")
	public void method4615(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean410) {
			this.aBoolean410 = arg0;
			this.method4633();
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4604();
		this.method4575(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass54_Sub2_2.aFloat81 * (float) arg0 + this.aClass54_Sub2_2.aFloat84 * (float) arg1 + this.aClass54_Sub2_2.aFloat77 * (float) arg2 + this.aClass54_Sub2_2.aFloat85;
		if (local24 < (float) this.anInt5232 || local24 > (float) this.anInt5208) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5202 * (this.aClass54_Sub2_2.aFloat87 * (float) arg0 + this.aClass54_Sub2_2.aFloat80 * (float) arg1 + this.aClass54_Sub2_2.aFloat86 * (float) arg2 + this.aClass54_Sub2_2.aFloat82) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5219 * (this.aClass54_Sub2_2.aFloat83 * (float) arg0 + this.aClass54_Sub2_2.aFloat79 * (float) arg1 + this.aClass54_Sub2_2.aFloat78 * (float) arg2 + this.aClass54_Sub2_2.aFloat88) / local24);
		if ((float) local81 >= this.aFloat68 && (float) local81 <= this.aFloat67 && (float) local113 >= this.aFloat65 && (float) local113 <= this.aFloat60) {
			arg3[0] = (int) ((float) local81 - this.aFloat68);
			arg3[1] = (int) ((float) local113 - this.aFloat65);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(Z)V")
	public void method4616(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean394) {
			this.aBoolean394 = arg0;
			this.method4565();
			this.anInt5231 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "(I)V")
	public synchronized void method4617(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub44 local4 = new Class2_Sub44(arg0);
		this.aClass210_38.method5044(local4);
	}

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "(I)V")
	public void method4618(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4624(7681, 7681);
		} else if (arg0 == 1) {
			this.method4624(8448, 8448);
		} else if (arg0 == 2) {
			this.method4624(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!rh;)V")
	public void method4619(@OriginalArg(0) Class54_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method4797(), 0);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(III)V")
	public void method4620(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "()I")
	@Override
	public int method4518() {
		return this.anInt5208;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ab;Lclient!nd;Lclient!dr;Lclient!bm;I)V")
	@Override
	public void method4485(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class157 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Class22_Sub1 arg3) {
		arg0.method3443(arg2, arg3, 0);
		this.method4510(arg1);
	}

	@OriginalMember(owner = "client!qi", name = "jb", descriptor = "()V")
	private void method4621() {
		this.aFloat68 = this.anInt5225 - this.anInt5229;
		this.aFloat67 = this.anInt5233 - this.anInt5229;
		this.aFloat65 = this.anInt5216 - this.anInt5205;
		this.aFloat60 = this.anInt5228 - this.anInt5205;
	}

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "(IIII)V")
	@Override
	public void method4544() {
		this.aBoolean398 = true;
		this.anInt5222 = 1583160;
		this.anInt5217 = 40;
		this.anInt5212 = 127;
		this.method4568();
		this.method4565();
		this.aClass235_1.method5533(3, false, false);
		this.aClass235_1.method5535(-1, true);
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(IIII)[I")
	@Override
	public int[] method4528() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt5200 - local6, 36, 1, 32993, this.anInt5206, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!nd;)V")
	@Override
	public void method4510(@OriginalArg(0) Class157 arg0) {
		this.aClass138_1.method3046(this, arg0);
	}

	@OriginalMember(owner = "client!qi", name = "kb", descriptor = "()V")
	private void method4622() {
		if (this.anInt5203 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (this.anInt5193 > 0 && this.anInt5200 > 0) {
			this.anOpengl2.glOrtho(0.0D, (double) this.anInt5193, (double) this.anInt5200, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt5203 = 1;
		this.anInt5231 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4505() {
	}

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "(I)I")
	public int method4623(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIZ)Lclient!aq;")
	@Override
	public Class5 method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class5_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "(II)V")
	public void method4624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5214 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt5220 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt5220 = arg0;
			local4 = true;
		}
		if (this.anInt5211 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt5211 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt5231 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "()I")
	@Override
	public int method4480() {
		@Pc(2) int local2 = this.anInt5213;
		this.anInt5213 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)I")
	@Override
	public int method4499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!qi", name = "I", descriptor = "()Z")
	@Override
	public boolean method4550() {
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "(I)V")
	public synchronized void method4625(@OriginalArg(0) int arg0) {
		@Pc(4) Class2_Sub44 local4 = new Class2_Sub44(arg0);
		this.aClass210_41.method5044(local4);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4520(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt5207 != arg0;
		if (local7 || this.aFloat57 != arg1 || this.aFloat54 != arg2) {
			this.anInt5207 = arg0;
			this.aFloat57 = arg1;
			this.aFloat54 = arg2;
			if (local7) {
				this.aFloat53 = (float) (this.anInt5207 & 0xFF0000) / 1.671168E7F;
				this.aFloat71 = (float) (this.anInt5207 & 0xFFFF) / 65535.0F;
				this.aFloat70 = (float) (this.anInt5207 & 0xFF) / 255.0F;
				this.method4612();
			}
			this.method4593();
		}
		if (this.lb[0] == arg3 && this.lb[1] == arg4 && this.lb[2] == arg5) {
			return;
		}
		this.lb[0] = arg3;
		this.lb[1] = arg4;
		this.lb[2] = arg5;
		this.aFloatArray22[0] = -arg3;
		this.aFloatArray22[1] = -arg4;
		this.aFloatArray22[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray25[0] = arg3 * local132;
		this.aFloatArray25[1] = arg4 * local132;
		this.aFloatArray25[2] = arg5 * local132;
		this.aFloatArray24[0] = -this.aFloatArray25[0];
		this.aFloatArray24[1] = -this.aFloatArray25[1];
		this.aFloatArray24[2] = -this.aFloatArray25[2];
		this.method4562();
		this.anInt5227 = (int) (arg3 * 256.0F / arg4);
		this.anInt5221 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "(IIII)V")
	@Override
	public void method4557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean398) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt5222 = arg1;
		this.anInt5217 = arg2;
		this.anInt5212 = arg3;
		this.method4568();
		this.aClass235_1.method5535(arg0, true);
	}

	@OriginalMember(owner = "client!qi", name = "lb", descriptor = "()V")
	public void method4626() {
		if (this.anInt5231 == 2) {
			return;
		}
		this.method4622();
		this.method4616(false);
		this.method4574(false);
		this.method4585(false);
		this.method4573(false);
		this.method4569();
		this.anInt5231 = 2;
	}

	@OriginalMember(owner = "client!qi", name = "mb", descriptor = "()V")
	private void method4627() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray23, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qi", name = "nb", descriptor = "()V")
	private void method4628() {
		@Pc(11) float local11 = (float) -this.anInt5229 * this.aFloat52 / (float) this.anInt5202;
		@Pc(23) float local23 = (float) -this.anInt5205 * this.aFloat52 / (float) this.anInt5219;
		@Pc(37) float local37 = (float) (this.anInt5193 - this.anInt5229) * this.aFloat52 / (float) this.anInt5202;
		@Pc(51) float local51 = (float) (this.anInt5200 - this.anInt5205) * this.aFloat52 / (float) this.anInt5219;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt5232 - this.aFloat63), (double) ((float) this.anInt5208 - this.aFloat63));
		}
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qi", name = "L", descriptor = "()Lclient!dr;")
	@Override
	public Class54 method4556() {
		return this.aClass54_3;
	}

	@OriginalMember(owner = "client!qi", name = "ob", descriptor = "()V")
	private void method4629() {
		this.anOpengl2.glDepthMask(this.aBoolean396 && this.aBoolean409);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method4539(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(Z)V")
	@Override
	public void method4555(@OriginalArg(0) boolean arg0) {
		this.aBoolean409 = arg0;
		this.method4629();
	}

	@OriginalMember(owner = "client!qi", name = "pb", descriptor = "()V")
	private void method4630() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
	@Override
	public void method4496(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(III)V")
	public void method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!qi", name = "qb", descriptor = "()V")
	public void method4632() {
		if (this.anInt5231 == 16) {
			return;
		}
		this.method4570();
		this.method4616(true);
		this.method4585(true);
		this.method4573(true);
		this.method4575(1);
		this.method4618(1);
		this.anInt5231 = 16;
	}

	@OriginalMember(owner = "client!qi", name = "rb", descriptor = "()V")
	private void method4633() {
		if (this.aBoolean408 && !this.aBoolean410) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "()I")
	@Override
	public int method4559() {
		return this.anInt5200;
	}
}
