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

@OriginalClass("client!mi")
public final class Class155_Sub1 extends Class155 implements Interface2 {

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
	public int anInt3842;

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
	public int anInt3843;

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
	public int anInt3844;

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "Lclient!ca;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
	public int anInt3847;

	@OriginalMember(owner = "client!mi", name = "N", descriptor = "I")
	public int anInt3849;

	@OriginalMember(owner = "client!mi", name = "P", descriptor = "I")
	private int anInt3850;

	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_1;

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
	public int anInt3852;

	@OriginalMember(owner = "client!mi", name = "eb", descriptor = "I")
	private int anInt3854;

	@OriginalMember(owner = "client!mi", name = "gb", descriptor = "Lclient!is;")
	public Class118_Sub1 aClass118_Sub1_1;

	@OriginalMember(owner = "client!mi", name = "hb", descriptor = "I")
	public int anInt3856;

	@OriginalMember(owner = "client!mi", name = "ib", descriptor = "F")
	private float aFloat38;

	@OriginalMember(owner = "client!mi", name = "jb", descriptor = "F")
	private float aFloat39;

	@OriginalMember(owner = "client!mi", name = "lb", descriptor = "Lclient!rh;")
	private Class30_Sub3_Sub1 lb;

	@OriginalMember(owner = "client!mi", name = "nb", descriptor = "I")
	private int anInt3857;

	@OriginalMember(owner = "client!mi", name = "ob", descriptor = "[Lclient!bl;")
	private Class30[] aClass30Array1;

	@OriginalMember(owner = "client!mi", name = "pb", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_2;

	@OriginalMember(owner = "client!mi", name = "qb", descriptor = "F")
	public float aFloat41;

	@OriginalMember(owner = "client!mi", name = "rb", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!mi", name = "sb", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!mi", name = "ub", descriptor = "I")
	private int anInt3858;

	@OriginalMember(owner = "client!mi", name = "wb", descriptor = "Lclient!kh;")
	public Class30_Sub3 aClass30_Sub3_2;

	@OriginalMember(owner = "client!mi", name = "zb", descriptor = "I")
	private int anInt3860;

	@OriginalMember(owner = "client!mi", name = "Ab", descriptor = "Lclient!kh;")
	public Class30_Sub3 aClass30_Sub3_3;

	@OriginalMember(owner = "client!mi", name = "Bb", descriptor = "Z")
	public boolean aBoolean296;

	@OriginalMember(owner = "client!mi", name = "Cb", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!mi", name = "Eb", descriptor = "F")
	public float aFloat45;

	@OriginalMember(owner = "client!mi", name = "Fb", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!mi", name = "Ib", descriptor = "I")
	private int anInt3863;

	@OriginalMember(owner = "client!mi", name = "Jb", descriptor = "Lclient!hs;")
	private Interface4 anInterface4_3;

	@OriginalMember(owner = "client!mi", name = "Kb", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!mi", name = "Mb", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!mi", name = "Nb", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!mi", name = "Ob", descriptor = "F")
	public float aFloat47;

	@OriginalMember(owner = "client!mi", name = "Pb", descriptor = "Lclient!kh;")
	public Class30_Sub3 aClass30_Sub3_4;

	@OriginalMember(owner = "client!mi", name = "Qb", descriptor = "I")
	private int anInt3865;

	@OriginalMember(owner = "client!mi", name = "Rb", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!mi", name = "Sb", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_3;

	@OriginalMember(owner = "client!mi", name = "Tb", descriptor = "Lclient!is;")
	public Class118_Sub1 aClass118_Sub1_2;

	@OriginalMember(owner = "client!mi", name = "Vb", descriptor = "I")
	private int anInt3866;

	@OriginalMember(owner = "client!mi", name = "Wb", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!mi", name = "Xb", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!mi", name = "Yb", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!mi", name = "bc", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!mi", name = "ec", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_4;

	@OriginalMember(owner = "client!mi", name = "fc", descriptor = "I")
	public int anInt3869;

	@OriginalMember(owner = "client!mi", name = "gc", descriptor = "J")
	private long aLong149;

	@OriginalMember(owner = "client!mi", name = "hc", descriptor = "Ljava/lang/String;")
	private String aString40;

	@OriginalMember(owner = "client!mi", name = "lc", descriptor = "Z")
	private boolean aBoolean305;

	@OriginalMember(owner = "client!mi", name = "mc", descriptor = "Ljava/lang/String;")
	private String aString41;

	@OriginalMember(owner = "client!mi", name = "tc", descriptor = "I")
	private int anInt3875;

	@OriginalMember(owner = "client!mi", name = "wc", descriptor = "I")
	private int anInt3878;

	@OriginalMember(owner = "client!mi", name = "xc", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_5;

	@OriginalMember(owner = "client!mi", name = "Dc", descriptor = "Z")
	public boolean aBoolean306;

	@OriginalMember(owner = "client!mi", name = "Fc", descriptor = "Lclient!la;")
	public Class141 aClass141_2;

	@OriginalMember(owner = "client!mi", name = "Hc", descriptor = "Z")
	public boolean aBoolean308;

	@OriginalMember(owner = "client!mi", name = "Ic", descriptor = "Z")
	private boolean aBoolean309;

	@OriginalMember(owner = "client!mi", name = "Jc", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_6;

	@OriginalMember(owner = "client!mi", name = "Mc", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!mi", name = "Nc", descriptor = "I")
	private int anInt3883;

	@OriginalMember(owner = "client!mi", name = "Qc", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!mi", name = "Rc", descriptor = "I")
	private int anInt3885;

	@OriginalMember(owner = "client!mi", name = "Sc", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_7;

	@OriginalMember(owner = "client!mi", name = "Tc", descriptor = "Lclient!vh;")
	public Class75_Sub2 aClass75_Sub2_8;

	@OriginalMember(owner = "client!mi", name = "Uc", descriptor = "Z")
	private boolean aBoolean312;

	@OriginalMember(owner = "client!mi", name = "Wc", descriptor = "Z")
	private boolean aBoolean313;

	@OriginalMember(owner = "client!mi", name = "Yc", descriptor = "Lclient!ht;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!mi", name = "Zc", descriptor = "Lclient!sp;")
	private Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "Lclient!wa;")
	private final Class243 aClass243_1 = new Class243();

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "Lclient!os;")
	private final Class118 aClass118_5 = new Class118_Sub1();

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
	public final int anInt3845 = 8;

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
	public final int anInt3848 = 3;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
	private int anInt3846 = -1;

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "Z")
	private boolean aBoolean291 = false;

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "[Lclient!ca;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!mi", name = "L", descriptor = "Lclient!kr;")
	private final Class138 aClass138_26 = new Class138();

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "Lclient!kr;")
	private final Class138 aClass138_27 = new Class138();

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "Lclient!kr;")
	private final Class138 aClass138_28 = new Class138();

	@OriginalMember(owner = "client!mi", name = "T", descriptor = "Lclient!kr;")
	private final Class138 aClass138_29 = new Class138();

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "Lclient!kr;")
	private final Class138 aClass138_30 = new Class138();

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "Lclient!kr;")
	private final Class138 aClass138_31 = new Class138();

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "Lclient!kr;")
	private final Class138 aClass138_32 = new Class138();

	@OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
	public int anInt3855 = -1;

	@OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
	private int anInt3853 = 0;

	@OriginalMember(owner = "client!mi", name = "X", descriptor = "[F")
	private final float[] aFloatArray19 = new float[4];

	@OriginalMember(owner = "client!mi", name = "Gb", descriptor = "I")
	private int anInt3861 = 0;

	@OriginalMember(owner = "client!mi", name = "tb", descriptor = "[F")
	private final float[] aFloatArray20 = new float[16];

	@OriginalMember(owner = "client!mi", name = "Lb", descriptor = "I")
	private int anInt3864 = -1;

	@OriginalMember(owner = "client!mi", name = "Ub", descriptor = "F")
	private float aFloat48 = 0.0F;

	@OriginalMember(owner = "client!mi", name = "jc", descriptor = "F")
	public float aFloat51 = 3584.0F;

	@OriginalMember(owner = "client!mi", name = "kc", descriptor = "I")
	public int anInt3870 = 512;

	@OriginalMember(owner = "client!mi", name = "yb", descriptor = "[F")
	public final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
	private int anInt3851 = 8448;

	@OriginalMember(owner = "client!mi", name = "Hb", descriptor = "I")
	public int anInt3862 = -1;

	@OriginalMember(owner = "client!mi", name = "Db", descriptor = "F")
	public float aFloat44 = 1.0F;

	@OriginalMember(owner = "client!mi", name = "rc", descriptor = "I")
	private int anInt3874 = 0;

	@OriginalMember(owner = "client!mi", name = "sc", descriptor = "F")
	private float aFloat53 = 1.0F;

	@OriginalMember(owner = "client!mi", name = "cc", descriptor = "F")
	private float aFloat50 = 1.0F;

	@OriginalMember(owner = "client!mi", name = "Zb", descriptor = "I")
	private int anInt3867 = 0;

	@OriginalMember(owner = "client!mi", name = "pc", descriptor = "I")
	private int anInt3873 = 8448;

	@OriginalMember(owner = "client!mi", name = "vc", descriptor = "I")
	public int anInt3877 = 0;

	@OriginalMember(owner = "client!mi", name = "yc", descriptor = "F")
	public float aFloat54 = -1.0F;

	@OriginalMember(owner = "client!mi", name = "Ac", descriptor = "I")
	public int anInt3880 = 3584;

	@OriginalMember(owner = "client!mi", name = "qc", descriptor = "F")
	public float aFloat52 = 3584.0F;

	@OriginalMember(owner = "client!mi", name = "nc", descriptor = "I")
	private int anInt3871 = 0;

	@OriginalMember(owner = "client!mi", name = "Bc", descriptor = "I")
	public int anInt3881 = 50;

	@OriginalMember(owner = "client!mi", name = "zc", descriptor = "I")
	public int anInt3879 = -1;

	@OriginalMember(owner = "client!mi", name = "Oc", descriptor = "I")
	public int anInt3884 = 512;

	@OriginalMember(owner = "client!mi", name = "Ec", descriptor = "[F")
	private final float[] aFloatArray23 = new float[4];

	@OriginalMember(owner = "client!mi", name = "Pc", descriptor = "F")
	public float aFloat56 = 1.0F;

	@OriginalMember(owner = "client!mi", name = "ac", descriptor = "[F")
	private final float[] aFloatArray22 = new float[4];

	@OriginalMember(owner = "client!mi", name = "mb", descriptor = "F")
	public float aFloat40 = 1.0F;

	@OriginalMember(owner = "client!mi", name = "dc", descriptor = "I")
	public int anInt3868 = 0;

	@OriginalMember(owner = "client!mi", name = "Kc", descriptor = "Z")
	private boolean aBoolean310 = true;

	@OriginalMember(owner = "client!mi", name = "xb", descriptor = "I")
	private int anInt3859 = 0;

	@OriginalMember(owner = "client!mi", name = "oc", descriptor = "I")
	private int anInt3872 = 0;

	@OriginalMember(owner = "client!mi", name = "Cc", descriptor = "I")
	private int anInt3882 = -1;

	@OriginalMember(owner = "client!mi", name = "Lc", descriptor = "F")
	public float aFloat55 = -1.0F;

	@OriginalMember(owner = "client!mi", name = "Vc", descriptor = "I")
	public int anInt3886 = 0;

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl1;

	@OriginalMember(owner = "client!mi", name = "uc", descriptor = "I")
	public final int anInt3876;

	@OriginalMember(owner = "client!mi", name = "ic", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "Z")
	public boolean aBoolean292;

	@OriginalMember(owner = "client!mi", name = "kb", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!mi", name = "vb", descriptor = "Z")
	public boolean aBoolean295;

	@OriginalMember(owner = "client!mi", name = "Gc", descriptor = "Z")
	private boolean aBoolean307;

	@OriginalMember(owner = "client!mi", name = "Xc", descriptor = "Z")
	public boolean aBoolean314;

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "Lclient!qf;")
	public final Class192 aClass192_1;

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "Lclient!ls;")
	private final Class149 aClass149_1;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "Lclient!gp;")
	private final Class95 aClass95_1;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "Lclient!sb;")
	private final Class3_Sub25_Sub1 aClass3_Sub25_Sub1_1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!wp;IILclient!mj;)V")
	public Class155_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class156 arg4) {
		super(arg2, arg1);
		this.aCanvas3 = arg0;
		@Pc(185) int local185 = 0;
		while (!this.aCanvas3.isShowing()) {
			if (local185++ > 5) {
				throw new RuntimeException("");
			}
			Static37.method613(1000L);
		}
		this.aCanvas3.setIgnoreRepaint(true);
		try {
			if (Static217.aBoolean290 == null || !Static217.aBoolean290) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static217.aBoolean290 = Boolean.TRUE;
				} else {
					@Pc(219) Class133 local219 = arg4.method3646(this.getClass());
					while (local219.anInt3257 == 0) {
						Static37.method613(100L);
					}
					if (local219.anInt3257 == 1) {
						Static217.aBoolean290 = Boolean.TRUE;
					}
				}
			}
			if (Static217.aBoolean290 == null || !Static217.aBoolean290) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas3, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method3564();
				this.anOpengl1 = this.aContext1.getGL();
				@Pc(286) int local286 = this.method3603();
				if (local286 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3876 = this.aBoolean298 ? 33639 : 5121;
				@Pc(305) String local305 = this.aString41.toLowerCase();
				@Pc(309) String local309 = this.aString40.toLowerCase();
				if (local309.indexOf("radeon") != -1) {
					@Pc(316) int local316 = 0;
					@Pc(318) boolean local318 = false;
					@Pc(320) boolean local320 = false;
					@Pc(328) String[] local328 = Static63.method1103(' ', local309.replace('/', ' '));
					for (@Pc(330) int local330 = 0; local330 < local328.length; local330++) {
						@Pc(338) String local338 = local328[local330];
						try {
							if (local338.length() > 0) {
								if (local338.charAt(0) == 'x' && local338.length() >= 3 && Static245.method4021(local338.substring(1, 3))) {
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
									if (local338.length() >= 4 && Static245.method4021(local338.substring(0, 4))) {
										local316 = Static321.method2984(local338.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(402) Exception local402) {
						}
					}
					if (!local320 && !local318) {
						if (local316 >= 7000 && local316 <= 7999) {
							this.aBoolean304 = false;
						}
						if (local316 >= 7000 && local316 <= 9250) {
							this.aBoolean292 = false;
						}
					}
					if (!local318 || local316 < 4000) {
						this.aBoolean293 = false;
					}
					this.aBoolean295 &= this.anOpengl1.isExtensionAvailable("GL_ARB_half_float_pixel");
					this.aBoolean307 = this.aBoolean304;
				}
				if (local305.contains("intel")) {
					this.aBoolean314 = false;
				}
				if (this.aBoolean304) {
					try {
						@Pc(460) int[] local460 = new int[1];
						this.anOpengl1.glGenBuffersARB(1, local460, 0);
					} catch (@Pc(468) Throwable local468) {
						throw new RuntimeException("", local468);
					}
				}
				this.method3587(this);
				this.method4909();
				this.method3565();
				new Class33(this);
				this.aClass192_1 = new Class192(this, this.anInterface10_7);
				Static333.method5081(true);
				this.aBoolean291 = true;
				this.aClass149_1 = new Class149(this);
				this.aClass95_1 = new Class95(this);
				this.aClass3_Sub25_Sub1_1 = new Class3_Sub25_Sub1(this);
				this.method3593();
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
						Static37.method613(100L);
					}
				}
				this.anOpengl1.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(552) Throwable local552) {
			local552.printStackTrace();
			this.method4866();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local552);
		}
	}

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "()V")
	private void method3564() {
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
			Static37.method613(1000L);
		}
	}

	@OriginalMember(owner = "client!mi", name = "N", descriptor = "()V")
	private void method3565() {
		this.aClass118_Sub1_1 = new Class118_Sub1();
		this.aClass118_Sub1_2 = new Class118_Sub1();
		this.aClass30Array1 = new Class30[this.anInt3852];
		this.aClass30_Sub3_3 = new Class30_Sub3(this, 3553, 6408, 1, 1);
		this.aClass30_Sub3_4 = new Class30_Sub3(this, 3553, 6408, 1, 1);
		this.aClass30_Sub3_2 = new Class30_Sub3(this, 3553, 6408, 1, 1);
		this.aClass75_Sub2_3 = new Class75_Sub2(this);
		this.aClass75_Sub2_4 = new Class75_Sub2(this);
		this.aClass75_Sub2_2 = new Class75_Sub2(this);
		this.aClass75_Sub2_8 = new Class75_Sub2(this);
		this.aClass75_Sub2_6 = new Class75_Sub2(this);
		this.aClass75_Sub2_5 = new Class75_Sub2(this);
		this.aClass75_Sub2_1 = new Class75_Sub2(this);
		this.aClass75_Sub2_7 = new Class75_Sub2(this);
		if (this.aBoolean314) {
			this.aClass141_2 = new Class141(this);
		}
		this.aClass243_1.method5635(this);
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(II)V")
	public void method3566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3872 = arg0;
		this.anInt3859 = arg1;
		this.anOpengl1.glViewport(arg0, arg1, this.anInt3849, this.anInt3843);
		this.method3594();
	}

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "()Z")
	@Override
	public boolean method4882() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "()V")
	private void method3567() {
		@Pc(11) float local11 = (float) -this.anInt3886 * this.aFloat53 / (float) this.anInt3870;
		@Pc(23) float local23 = (float) -this.anInt3877 * this.aFloat53 / (float) this.anInt3884;
		@Pc(37) float local37 = (float) (this.anInt3849 - this.anInt3886) * this.aFloat53 / (float) this.anInt3870;
		@Pc(51) float local51 = (float) (this.anInt3843 - this.anInt3877) * this.aFloat53 / (float) this.anInt3884;
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (local11 != local37 && local51 != local23) {
			this.anOpengl1.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt3881 - this.aFloat43), (double) ((float) this.anInt3880 - this.aFloat43));
		}
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method4862() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl1.glReadPixels(0, this.anInt3843 - local6, 36, 1, 32993, this.anInt3876, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(Z)V")
	public void method3568(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean313) {
			this.aBoolean313 = arg0;
			this.method3604();
			this.anInt3875 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	@Override
	public void method4915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3855 == arg0 && this.anInt3879 == arg1) {
			return;
		}
		this.anInt3855 = arg0;
		this.anInt3879 = arg1;
		if (!this.aBoolean296) {
			this.method3572();
			this.method3607();
		}
	}

	@OriginalMember(owner = "client!mi", name = "P", descriptor = "()V")
	private void method3569() {
		@Pc(2) float[] local2 = this.aFloatArray20;
		@Pc(14) float local14 = (float) (-this.anInt3886 * this.anInt3881) / (float) this.anInt3870;
		@Pc(28) float local28 = (float) ((this.anInt3849 - this.anInt3886) * this.anInt3881) / (float) this.anInt3870;
		@Pc(39) float local39 = (float) (this.anInt3877 * this.anInt3881) / (float) this.anInt3884;
		@Pc(53) float local53 = (float) ((this.anInt3877 - this.anInt3843) * this.anInt3881) / (float) this.anInt3884;
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
			@Pc(67) float local67 = (float) this.anInt3881 * 2.0F;
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
			local2[10] = this.aFloat38 = (float) -(this.anInt3880 + this.anInt3881) / (float) (this.anInt3880 - this.anInt3881);
			local2[11] = -1.0F;
			local2[12] = 0.0F;
			local2[13] = 0.0F;
			local2[14] = this.aFloat39 = -(local67 * (float) this.anInt3880) / (float) (this.anInt3880 - this.anInt3881);
			local2[15] = 0.0F;
		}
		this.method3581();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ja;)V")
	@Override
	public void method4907(@OriginalArg(0) Class8 arg0) {
		this.aClass8_Sub1_1 = (Class8_Sub1) arg0;
	}

	@OriginalMember(owner = "client!mi", name = "Q", descriptor = "()V")
	public void method3570() {
		if (this.anInt3875 == 4) {
			return;
		}
		this.method3588();
		this.method3612(false);
		this.method3568(false);
		this.method3573(false);
		this.method3584(false);
		this.method3620();
		this.method3613(1);
		this.method3580(1);
		this.anInt3875 = 4;
	}

	@OriginalMember(owner = "client!mi", name = "L", descriptor = "()Lclient!os;")
	@Override
	public Class118 method4950() {
		return new Class118_Sub1();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!hs;)V")
	public void method3571(@OriginalArg(0) Interface4 arg0) {
		if (this.anInterface4_3 != arg0 && this.aBoolean304) {
			this.anOpengl1.glBindBufferARB(34963, arg0.method3932());
			this.anInterface4_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4878() {
		this.aBoolean296 = true;
		this.anInt3864 = 1583160;
		this.anInt3862 = 40;
		this.anInt3868 = 127;
		this.method3572();
		this.method3607();
		this.aClass149_1.method3226(false, false, 3);
		this.aClass149_1.method3223(-1, true);
	}

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "()V")
	@Override
	public void method4877() {
		this.method3584(true);
		this.anOpengl1.glClear(256);
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3886 = arg0;
		this.anInt3877 = arg1;
		this.anInt3870 = arg2;
		this.anInt3884 = arg3;
		this.method3569();
		this.method3602();
		if (this.anInt3883 == 3) {
			this.method3567();
		} else if (this.anInt3883 == 2) {
			this.method3609();
		}
	}

	@OriginalMember(owner = "client!mi", name = "R", descriptor = "()V")
	private void method3572() {
		@Pc(15) int local15;
		if (this.aBoolean296) {
			this.anOpengl1.glFogf(2915, 0.0F);
			this.anOpengl1.glFogf(2916, 1.0F);
			local15 = this.anInt3864;
		} else {
			this.aFloat57 = (float) (this.anInt3880 - 256) - this.aFloat48;
			this.aFloat47 = this.aFloat57 - (float) this.anInt3879 * this.aFloat50;
			if (this.aFloat47 < (float) this.anInt3881) {
				this.aFloat47 = this.anInt3881;
			}
			this.anOpengl1.glFogf(2915, this.aFloat47);
			this.anOpengl1.glFogf(2916, this.aFloat57);
			local15 = this.anInt3855;
		}
		Static217.aFloatArray17[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static217.aFloatArray17[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static217.aFloatArray17[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl1.glFogfv(2918, Static217.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(Z)V")
	public void method3573(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean302) {
			return;
		}
		if (arg0) {
			this.anOpengl1.glEnable(2929);
		} else {
			this.anOpengl1.glDisable(2929);
		}
		this.aBoolean302 = arg0;
		this.anInt3875 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
	@Override
	public int method3562() {
		return this.anInt3843;
	}

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "()V")
	public void method3574() {
		if (this.anInt3875 == 2) {
			return;
		}
		this.method3588();
		this.method3612(false);
		this.method3568(false);
		this.method3573(false);
		this.method3584(false);
		this.method3620();
		this.anInt3875 = 2;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lclient!f;Lclient!os;[Lclient!kt;I)V")
	@Override
	public void method4937(@OriginalArg(0) Class75[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class12_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method5469(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "T", descriptor = "()V")
	public void method3575() {
		if (this.anInt3875 == 16) {
			return;
		}
		this.method3611();
		this.method3612(true);
		this.method3573(true);
		this.method3584(true);
		this.method3613(1);
		this.method3580(1);
		this.anInt3875 = 16;
	}

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "()V")
	public void method3576() {
		if (this.anInt3875 == 8) {
			return;
		}
		this.method3586();
		this.method3612(true);
		this.method3573(true);
		this.method3584(true);
		this.method3613(1);
		this.method3580(1);
		this.anInt3875 = 8;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public void method4852(@OriginalArg(0) int arg0) {
		this.method3564();
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)I")
	public int method3577(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFF)V")
	public void method3578(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static217.aFloatArray17[0] = arg0;
		Static217.aFloatArray17[1] = arg1;
		Static217.aFloatArray17[2] = arg2;
		Static217.aFloatArray17[3] = arg3;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static217.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)I")
	public int method3579(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!vn;IIII)Lclient!f;")
	@Override
	public Class75 method4930(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class75_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
	public void method3580(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method3610(7681, 7681);
		} else if (arg0 == 1) {
			this.method3610(8448, 8448);
		} else if (arg0 == 2) {
			this.method3610(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "()Z")
	@Override
	public boolean method4893() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3867 < arg0) {
			this.anInt3867 = arg0;
		}
		if (this.anInt3853 > arg2) {
			this.anInt3853 = arg2;
		}
		if (this.anInt3871 < arg1) {
			this.anInt3871 = arg1;
		}
		if (this.anInt3874 > arg3) {
			this.anInt3874 = arg3;
		}
		this.anOpengl1.glEnable(3089);
		this.method3602();
		this.method3594();
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
	@Override
	public void method4921(@OriginalArg(0) int arg0) {
		this.method3613(0);
		this.anOpengl1.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl1.glClear(16384);
	}

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "()V")
	private void method3581() {
		if (this.aFloat43 == 0.0F) {
			this.aFloatArray20[10] = this.aFloat38;
			this.aFloatArray20[14] = this.aFloat39;
		} else {
			@Pc(13) float local13 = this.aFloat37 / (this.aFloat43 + this.aFloat37);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat39 * (1.0F - local13) * (1.0F - local13) / this.aFloat43;
			this.aFloatArray20[10] = this.aFloat38 + local32;
			this.aFloatArray20[14] = this.aFloat39 * local17;
		}
		this.aFloat51 = (this.aFloatArray20[14] - (float) this.anInt3880) / this.aFloatArray20[10];
		this.aFloat52 = (float) this.anInt3880 - this.aFloat43;
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(IIII)V")
	@Override
	public void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean296) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt3864 = arg1;
		this.anInt3862 = arg2;
		this.anInt3868 = arg3;
		this.method3572();
		this.aClass149_1.method3223(arg0, true);
	}

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "()F")
	@Override
	public float method4913() {
		return this.aFloat43;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "()Z")
	@Override
	public boolean method4861() {
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(II)V")
	@Override
	public void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3881 == arg0 && this.anInt3880 == arg1) {
			return;
		}
		this.anInt3881 = arg0;
		this.anInt3880 = arg1;
		this.method3569();
		this.method3572();
		if (this.anInt3883 == 3) {
			this.method3567();
		} else if (this.anInt3883 == 2) {
			this.method3609();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZZ)V")
	public void method3582(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt3860) {
			if (arg0 < 0) {
				this.method3600();
				this.method3585(null);
				if (!this.aBoolean296) {
					this.aClass149_1.method3226(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class30_Sub3 local11 = this.aClass192_1.method4408(arg0);
				@Pc(17) Class121 local17 = this.anInterface10_7.method192(arg0);
				if (local17.aByte41 == 0 && local17.aByte39 == 0) {
					this.method3600();
				} else {
					@Pc(30) int local30 = local17.aBoolean224 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method3628((float) (this.anInt3844 % local34 * local17.aByte41) / (float) local34, (float) (this.anInt3844 % local34 * local17.aByte39) / (float) local34, 0.0F);
				}
				if (this.aBoolean296) {
					this.aClass149_1.method3226(arg2, arg1, 3);
					this.method3585(local11);
				} else {
					this.aClass149_1.method3226(arg2, arg1, local17.aByte40);
					this.aClass149_1.method3223(local17.aByte43, false);
					if (!this.aClass149_1.method3225(local11)) {
						this.method3585(local11);
					}
				}
			}
			this.anInt3860 = arg0;
		}
		this.anInt3875 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "()Z")
	@Override
	public boolean method4875() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)I")
	@Override
	public int method4920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "()I")
	@Override
	public int method4906() {
		return this.anInt3842 + this.anInt3847 + this.anInt3850;
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(Z)V")
	public void method3583(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean303) {
			this.aBoolean303 = arg0;
			this.method3604();
		}
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(Z)V")
	public void method3584(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean312) {
			this.aBoolean312 = arg0;
			this.method3614();
			this.anInt3875 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!bl;)V")
	public void method3585(@OriginalArg(0) Class30 arg0) {
		@Pc(5) Class30 local5 = this.aClass30Array1[this.anInt3885];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl1.glDisable(local5.anInt5155);
			} else {
				if (local5 == null) {
					this.anOpengl1.glEnable(arg0.anInt5155);
				} else if (arg0.anInt5155 != local5.anInt5155) {
					this.anOpengl1.glDisable(local5.anInt5155);
					this.anOpengl1.glEnable(arg0.anInt5155);
				}
				this.anOpengl1.glBindTexture(arg0.anInt5155, arg0.method4612());
			}
			this.aClass30Array1[this.anInt3885] = arg0;
		}
		this.anInt3875 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "()V")
	public void method3586() {
		if (this.anInt3883 != 2) {
			this.anInt3883 = 2;
			this.method3609();
			this.method3589();
			this.anInt3875 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "()V")
	@Override
	public void method4884() {
		this.aClass95_1.method1927();
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	@Override
	public void method4865(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ju;Z)Lclient!tr;")
	@Override
	public Class110 method4869(@OriginalArg(0) Class127 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt3167 * arg0.anInt3171];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray43 == null) {
			for (local15 = 0; local15 < arg0.anInt3171; local15++) {
				for (local21 = 0; local21 < arg0.anInt3167; local21++) {
					@Pc(74) int local74 = arg0.anIntArray361[arg0.aByteArray44[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt3171; local15++) {
				for (local21 = 0; local21 < arg0.anInt3167; local21++) {
					local6[local10++] = arg0.aByteArray43[local8] << 24 | arg0.anIntArray361[arg0.aByteArray44[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class110 local100 = this.method4871(local6, arg0.anInt3167, arg0.anInt3167, arg0.anInt3171);
		local100.method5087(arg0.anInt3170, arg0.anInt3166, arg0.anInt3169, arg0.anInt3168);
		return local100;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ca;)V")
	public void method3587(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt3846 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3846 >= 0) {
			this.anInterface2Array1[this.anInt3846].method3563();
		}
		this.anInterface2_1 = this.anInterface2Array1[++this.anInt3846] = arg0;
		this.anInterface2_1.method3561();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!cs;)V")
	@Override
	public void method4864(@OriginalArg(0) Class47 arg0) {
		this.aClass243_1.method5634(this, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4853(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static309.aFloat64 = arg0;
		Static309.aFloat63 = arg1;
		Static309.aFloat62 = arg2;
	}

	@OriginalMember(owner = "client!mi", name = "X", descriptor = "()V")
	private void method3588() {
		if (this.anInt3883 == 1) {
			return;
		}
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		if (this.anInt3849 > 0 && this.anInt3843 > 0) {
			this.anOpengl1.glOrtho(0.0D, (double) this.anInt3849, (double) this.anInt3843, 0.0D, -1.0D, 1.0D);
		}
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anInt3883 = 1;
		this.anInt3875 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!mi", name = "K", descriptor = "()Z")
	@Override
	public boolean method4949() {
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
	@Override
	public void method3561() {
	}

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "()V")
	private void method3589() {
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl1.glMultMatrixf(this.aClass118_Sub1_1.method2482(), 0);
		this.method3636();
	}

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "()V")
	@Override
	public void method4902() {
		this.anInt3867 = 0;
		this.anInt3871 = 0;
		this.anInt3853 = this.anInt3849;
		this.anInt3874 = this.anInt3843;
		this.anOpengl1.glDisable(3089);
		this.method3602();
	}

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)V")
	public void method3590(@OriginalArg(0) int arg0) {
		if (this.anInt3885 != arg0) {
			this.anOpengl1.glActiveTexture(arg0 + 33984);
			this.anInt3885 = arg0;
		}
	}

	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "()V")
	private void method3591() {
		Static217.aFloatArray17[0] = this.aFloat46 * this.aFloat56;
		Static217.aFloatArray17[1] = this.aFloat46 * this.aFloat44;
		Static217.aFloatArray17[2] = this.aFloat46 * this.aFloat40;
		Static217.aFloatArray17[3] = 1.0F;
		this.anOpengl1.glLightModelfv(2899, Static217.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "()V")
	private void method3592() {
		if (this.anInt3875 == 1) {
			return;
		}
		this.method3588();
		this.method3612(false);
		this.method3568(false);
		this.method3573(false);
		this.method3584(false);
		this.method3585(null);
		this.method3620();
		this.method3580(0);
		this.anInt3875 = 1;
	}

	@OriginalMember(owner = "client!mi", name = "bb", descriptor = "()V")
	private void method3593() {
		this.method3620();
		for (@Pc(7) int local7 = this.anInt3852 - 1; local7 >= 0; local7--) {
			this.method3590(local7);
			this.method3585(null);
			this.anOpengl1.glTexEnvi(8960, 8704, 34160);
		}
		this.method3610(8448, 8448);
		this.method3624(2, 34168, 770);
		this.method3600();
		this.anInt3858 = 1;
		this.anOpengl1.glEnable(3042);
		this.anOpengl1.glBlendFunc(770, 771);
		this.anInt3865 = 1;
		this.anOpengl1.glEnable(3008);
		this.anOpengl1.glAlphaFunc(516, 0.0F);
		this.aBoolean305 = true;
		this.anOpengl1.glColorMask(true, true, true, true);
		this.aBoolean300 = true;
		this.method3612(true);
		this.method3568(true);
		this.method3573(true);
		this.method3584(true);
		this.method3597();
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
		this.anInt3882 = this.anInt3855 = -1;
		this.method4902();
	}

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "()V")
	@Override
	public void method4939() {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
	@Override
	public void method4857(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "cb", descriptor = "()V")
	private void method3594() {
		if (this.anInt3867 <= this.anInt3853 && this.anInt3871 <= this.anInt3874) {
			this.anOpengl1.glScissor(this.anInt3872 + this.anInt3867, this.anInt3859 + this.anInt3843 - this.anInt3874, this.anInt3853 - this.anInt3867, this.anInt3874 - this.anInt3871);
		} else {
			this.anOpengl1.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3592();
		this.method3613(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!mi", name = "db", descriptor = "()V")
	private void method3595() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(II)V")
	public synchronized void method3596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub28 local4 = new Class3_Sub28(arg1);
		local4.aLong240 = arg0;
		this.aClass138_28.method3053(local4);
	}

	@OriginalMember(owner = "client!mi", name = "eb", descriptor = "()V")
	public void method3597() {
		if (this.anInt3883 != 0) {
			this.anInt3883 = 0;
			this.anInt3875 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
	public void method3598(@OriginalArg(2) int arg0) {
		this.anOpengl1.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method3592();
		this.method3613(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean301) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local23);
		this.anOpengl1.glVertex2f(local16, local23);
		this.anOpengl1.glVertex2f(local16, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean301) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.lb == null || this.lb.anInt5158 < arg2 || this.lb.anInt5157 < arg3) {
			this.lb = Static406.method4618(arg3, arg2, arg6, this);
			this.lb.method4613(false, false);
			local32 = this.lb.aFloat61;
			local36 = this.lb.aFloat60;
		} else {
			this.lb.method4615(arg2, arg3, arg6, 6406, false);
			local32 = this.lb.aFloat61 * (float) arg3 / (float) this.lb.anInt5157;
			local36 = this.lb.aFloat60 * (float) arg2 / (float) this.lb.anInt5158;
		}
		this.method3574();
		this.method3585(this.lb);
		this.method3613(arg8);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3605(arg5);
		this.method3610(34165, 34165);
		this.method3624(0, 34166, 768);
		this.method3624(2, 5890, 770);
		this.method3635(0, 34166);
		this.method3635(2, 5890);
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
		this.method3624(0, 5890, 768);
		this.method3624(2, 34166, 770);
		this.method3635(0, 5890);
		this.method3635(2, 34166);
	}

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "(I)V")
	public synchronized void method3599(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub28 local4 = new Class3_Sub28(arg0);
		this.aClass138_29.method3053(local4);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!qb;[Lclient!ju;Z)Lclient!oh;")
	@Override
	public Class150 method4888(@OriginalArg(0) Class190 arg0, @OriginalArg(1) Class127[] arg1) {
		return new Class150_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ja;Lclient!ja;FLclient!ja;)Lclient!ja;")
	@Override
	public Class8 method4933(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class8 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean297 && this.aBoolean314) {
			@Pc(11) Class8_Sub1_Sub1 local11 = null;
			@Pc(14) Class8_Sub1 local14 = (Class8_Sub1) arg0;
			@Pc(17) Class8_Sub1 local17 = (Class8_Sub1) arg1;
			@Pc(21) Class30_Sub4 local21 = local14.method2306();
			@Pc(25) Class30_Sub4 local25 = local17.method2306();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt4237 > local25.anInt4237 ? local21.anInt4237 : local25.anInt4237;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class8_Sub1_Sub1) {
					@Pc(52) Class8_Sub1_Sub1 local52 = (Class8_Sub1_Sub1) arg3;
					if (local52.method141() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class8_Sub1_Sub1(this, local40);
				}
				local11.method142(arg2, local25, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(IIII)V")
	@Override
	public void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass95_1.method1923(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "()I")
	@Override
	public int method4870() {
		@Pc(2) int local2 = this.anInt3854;
		this.anInt3854 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIILclient!sm;II)V")
	@Override
	public void method4916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class38 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class38_Sub2 local2 = (Class38_Sub2) arg5;
		@Pc(5) Class30_Sub3_Sub1 local5 = local2.aClass30_Sub3_Sub1_1;
		this.method3574();
		this.method3585(local2.aClass30_Sub3_Sub1_1);
		this.method3613(1);
		this.method3610(7681, 8448);
		this.method3624(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat60 / (float) local5.anInt5160;
		@Pc(37) float local37 = local5.aFloat61 / (float) local5.anInt5161;
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
		this.method3624(0, 5890, 768);
	}

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "()I")
	@Override
	public int method4932() {
		return this.anInt3880;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method4953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3592();
		this.method3613(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl1.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl1.glBegin(1);
		this.anOpengl1.glVertex2f(local9, local14);
		this.anOpengl1.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!f;Lclient!cs;Lclient!os;Lclient!kt;I)V")
	@Override
	public void method4905(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class12_Sub5 arg3) {
		arg0.method5469(arg2, arg3, 0);
		this.method4864(arg1);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt3849) {
			arg2 = this.anInt3849;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt3843) {
			arg3 = this.anInt3843;
		}
		this.anInt3867 = arg0;
		this.anInt3871 = arg1;
		this.anInt3853 = arg2;
		this.anInt3874 = arg3;
		this.anOpengl1.glEnable(3089);
		this.method3602();
		this.method3594();
	}

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "()V")
	@Override
	public void method4909() {
		this.anInt3849 = this.aCanvas3.getWidth();
		this.anInt3843 = this.aCanvas3.getHeight();
		this.anOpengl1.glViewport(this.anInt3872, this.anInt3859, this.anInt3849, this.anInt3843);
		this.method3597();
		this.method4902();
	}

	@OriginalMember(owner = "client!mi", name = "fb", descriptor = "()V")
	private void method3600() {
		if (this.aBoolean311) {
			this.anOpengl1.glMatrixMode(5890);
			this.anOpengl1.glLoadIdentity();
			this.anOpengl1.glMatrixMode(5888);
			this.aBoolean311 = false;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ht;)V")
	public void method3601(@OriginalArg(0) Interface5 arg0) {
		if (this.anInterface5_4 != arg0 && this.aBoolean304) {
			this.anOpengl1.glBindBufferARB(34962, arg0.method3932());
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!mi", name = "gb", descriptor = "()V")
	private void method3602() {
		this.aFloat49 = this.anInt3867 - this.anInt3886;
		this.aFloat45 = this.anInt3853 - this.anInt3886;
		this.aFloat41 = this.anInt3871 - this.anInt3877;
		this.aFloat42 = this.anInt3874 - this.anInt3877;
	}

	@OriginalMember(owner = "client!mi", name = "hb", descriptor = "()I")
	private int method3603() {
		@Pc(1) int local1 = 0;
		this.aString41 = this.anOpengl1.glGetString(7936);
		this.aString40 = this.anOpengl1.glGetString(7937);
		@Pc(17) String local17 = this.aString41.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl1.glGetString(7938);
		@Pc(53) String[] local53 = Static63.method1103(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static321.method2984(local53[0]);
				@Pc(69) int local69 = Static321.method2984(local53[1]);
				this.anInt3878 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt3878 < 12) {
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
		this.anInt3852 = local116[0];
		this.anOpengl1.glGetIntegerv(34929, local116, 0);
		this.anInt3863 = local116[0];
		this.anOpengl1.glGetIntegerv(34930, local116, 0);
		this.anInt3857 = local116[0];
		if (this.anInt3852 < 2 || this.anInt3863 < 2 || this.anInt3857 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean299 = Static218.aString43 != null && Static218.aString43.startsWith("mac");
		this.aBoolean298 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean304 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean301 = this.anOpengl1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean308 = this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_program");
		this.anOpengl1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean294 = this.anOpengl1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean292 = this.anOpengl1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean295 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean297 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean293 = this.anOpengl1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean306 = false;
		this.aBoolean314 = this.anOpengl1.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "()Z")
	@Override
	public boolean method4889() {
		return !this.aBoolean299;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl1.glLineWidth((float) arg5);
		this.method4911(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl1.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V")
	@Override
	public void method4917(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4874(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mi", name = "ib", descriptor = "()V")
	private void method3604() {
		if (this.aBoolean313 && !this.aBoolean303) {
			this.anOpengl1.glEnable(2896);
		} else {
			this.anOpengl1.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[I[I)Lclient!sm;")
	@Override
	public Class38 method4946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static399.method1787(arg2, arg1, this, arg3, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method3592();
		this.method3613(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean301) {
			this.anOpengl1.glDisable(32925);
		}
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glVertex2f(local4, local9);
		this.anOpengl1.glVertex2f(local4, local19);
		this.anOpengl1.glVertex2f(local14, local19);
		this.anOpengl1.glVertex2f(local14, local9);
		this.anOpengl1.glEnd();
		if (this.aBoolean301) {
			this.anOpengl1.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "(I)V")
	public void method3605(@OriginalArg(0) int arg0) {
		Static217.aFloatArray17[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static217.aFloatArray17[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static217.aFloatArray17[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static217.aFloatArray17[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl1.glTexEnvfv(8960, 8705, Static217.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "()I")
	@Override
	public int method4876() {
		@Pc(2) int local2 = this.anInt3866;
		this.anInt3866 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!mi", name = "jb", descriptor = "()V")
	private void method3606() {
		Static217.aFloatArray17[0] = this.aFloat55 * this.aFloat56;
		Static217.aFloatArray17[1] = this.aFloat55 * this.aFloat44;
		Static217.aFloatArray17[2] = this.aFloat55 * this.aFloat40;
		Static217.aFloatArray17[3] = 1.0F;
		this.anOpengl1.glLightfv(16384, 4609, Static217.aFloatArray17, 0);
		Static217.aFloatArray17[0] = -this.aFloat54 * this.aFloat56;
		Static217.aFloatArray17[1] = -this.aFloat54 * this.aFloat44;
		Static217.aFloatArray17[2] = -this.aFloat54 * this.aFloat40;
		Static217.aFloatArray17[3] = 1.0F;
		this.anOpengl1.glLightfv(16385, 4609, Static217.aFloatArray17, 0);
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "()I")
	@Override
	public int method4868() {
		return this.anInt3881;
	}

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "()Z")
	@Override
	public boolean method4898() {
		return this.aClass3_Sub25_Sub1_1.method4754();
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3592();
		this.method3613(arg5);
		this.anOpengl1.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl1.glBegin(2);
		this.anOpengl1.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl1.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl1.glEnd();
	}

	@OriginalMember(owner = "client!mi", name = "kb", descriptor = "()V")
	private void method3607() {
		if (this.aBoolean309 && this.aBoolean296 | this.anInt3879 >= 0) {
			this.anOpengl1.glEnable(2912);
		} else {
			this.anOpengl1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!sm;II)V")
	@Override
	public void method4918(@OriginalArg(1) Class38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class38_Sub2 local2 = (Class38_Sub2) arg0;
		@Pc(5) Class30_Sub3_Sub1 local5 = local2.aClass30_Sub3_Sub1_1;
		this.method3574();
		this.method3585(local2.aClass30_Sub3_Sub1_1);
		this.method3613(1);
		this.method3610(7681, 8448);
		this.method3624(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat60 / (float) local5.anInt5160;
		@Pc(37) float local37 = local5.aFloat61 / (float) local5.anInt5161;
		this.anOpengl1.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl1.glBegin(7);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3867 - arg1), local37 * (float) (this.anInt3871 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3867, this.anInt3871);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3867 - arg1), local37 * (float) (this.anInt3874 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3867, this.anInt3874);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3853 - arg1), local37 * (float) (this.anInt3874 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3853, this.anInt3874);
		this.anOpengl1.glTexCoord2f(local30 * (float) (this.anInt3853 - arg1), local37 * (float) (this.anInt3871 - arg2));
		this.anOpengl1.glVertex2i(this.anInt3853, this.anInt3871);
		this.anOpengl1.glEnd();
		this.method3624(0, 5890, 768);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BIZ)Lclient!hs;")
	public Interface4 method3608(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface4) (this.aBoolean304 && (!arg2 || this.aBoolean307) ? new Class1_Sub1(this, 5123, arg0, arg1, arg2) : new Class109_Sub1(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "()I")
	@Override
	public int method4943() {
		return 4;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(IIIIII)Lclient!ja;")
	@Override
	public Class8 method4860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean297 ? new Class8_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!mi", name = "lb", descriptor = "()V")
	private void method3609() {
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadMatrixf(this.aFloatArray20, 0);
		this.anOpengl1.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(II)V")
	public void method3610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3885 != 0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt3851 != arg0) {
			this.anOpengl1.glTexEnvi(8960, 34161, arg0);
			this.anInt3851 = arg0;
			local4 = true;
		}
		if (this.anInt3873 != arg1) {
			this.anOpengl1.glTexEnvi(8960, 34162, arg1);
			this.anInt3873 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt3875 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
	@Override
	public int method4919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)Lclient!gf;")
	@Override
	public Class3_Sub15 method4931() {
		return null;
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V")
	@Override
	public synchronized void method4935(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class3_Sub28 local16;
		while (!this.aClass138_27.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_27.method3047();
			Static217.anIntArray419[local1++] = (int) local16.aLong240;
			this.anInt3842 -= local16.anInt3982;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteBuffersARB(local1, Static217.anIntArray419, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteBuffersARB(local1, Static217.anIntArray419, 0);
			local1 = 0;
		}
		while (!this.aClass138_28.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_28.method3047();
			Static217.anIntArray419[local1++] = (int) local16.aLong240;
			this.anInt3847 -= local16.anInt3982;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteTextures(local1, Static217.anIntArray419, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteTextures(local1, Static217.anIntArray419, 0);
			local1 = 0;
		}
		while (!this.aClass138_29.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_29.method3047();
			Static217.anIntArray419[local1++] = local16.anInt3982;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteFramebuffersEXT(local1, Static217.anIntArray419, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteFramebuffersEXT(local1, Static217.anIntArray419, 0);
			local1 = 0;
		}
		while (!this.aClass138_30.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_30.method3047();
			Static217.anIntArray419[local1++] = (int) local16.aLong240;
			this.anInt3850 -= local16.anInt3982;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static217.anIntArray419, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteRenderbuffersEXT(local1, Static217.anIntArray419, 0);
			local1 = 0;
		}
		while (!this.aClass138_31.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_31.method3047();
			Static217.anIntArray419[local1++] = (int) local16.aLong240;
			if (local1 == 1000) {
				this.anOpengl1.glDeleteProgramsARB(local1, Static217.anIntArray419, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl1.glDeleteProgramsARB(local1, Static217.anIntArray419, 0);
		}
		while (!this.aClass138_26.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_26.method3047();
			this.anOpengl1.glDeleteLists((int) local16.aLong240, local16.anInt3982);
		}
		while (!this.aClass138_32.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_32.method3047();
			this.anOpengl1.glDeleteObjectARB(local16.anInt3982);
		}
		while (!this.aClass138_26.method3059()) {
			local16 = (Class3_Sub28) this.aClass138_26.method3047();
			this.anOpengl1.glDeleteLists((int) local16.aLong240, local16.anInt3982);
		}
		if (this.method4906() > 100663296 && Static288.method4512() > this.aLong149 + 60000L) {
			System.gc();
			this.aLong149 = Static288.method4512();
		}
		this.anInt3844 = local5;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[[I[[IIII)Lclient!pl;")
	@Override
	public Class7 method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class7_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([IIIII)Lclient!tr;")
	@Override
	public Class110 method4871(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class110_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "()V")
	@Override
	public void method4948() {
		if (this.aClass3_Sub25_Sub1_1.method4754()) {
			this.aClass95_1.method1926(this.aClass3_Sub25_Sub1_1);
			this.aClass192_1.method4409();
		}
	}

	@OriginalMember(owner = "client!mi", name = "mb", descriptor = "()V")
	private void method3611() {
		if (this.anInt3883 != 3) {
			this.anInt3883 = 3;
			this.method3567();
			this.method3589();
			this.anInt3875 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "()Lclient!os;")
	@Override
	public Class118 method4908() {
		return this.aClass118_5;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()V")
	@Override
	public void method3563() {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!gf;)V")
	@Override
	public void method4873(@OriginalArg(0) Class3_Sub15 arg0) {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIZ)Lclient!tr;")
	@Override
	public Class110 method4901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class110_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!mi", name = "B", descriptor = "()Z")
	@Override
	public boolean method4914() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "()Z")
	@Override
	public boolean method4938() {
		return this.aClass149_1.method3224();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(FF)V")
	@Override
	public void method4856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat37 && arg1 == this.aFloat43) {
			return;
		}
		this.aFloat37 = arg0;
		this.aFloat43 = arg1;
		this.method3581();
		if (this.anInt3883 == 3) {
			this.method3567();
		} else if (this.anInt3883 == 2) {
			this.method3609();
		}
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "(Z)V")
	public void method3612(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean309) {
			this.aBoolean309 = arg0;
			this.method3607();
			this.anInt3875 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!os;)V")
	@Override
	public void method4904(@OriginalArg(0) Class118 arg0) {
		this.aClass118_Sub1_1 = (Class118_Sub1) arg0;
		this.aClass118_Sub1_2.method2485(this.aClass118_Sub1_1);
		if (this.anInt3883 != 1) {
			this.method3589();
		}
	}

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "(I)V")
	public void method3613(@OriginalArg(0) int arg0) {
		if (this.anInt3858 == arg0) {
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
		if (local10 != this.aBoolean300) {
			this.anOpengl1.glColorMask(local10, local10, local10, true);
			this.aBoolean300 = local10;
		}
		if (local12 != this.aBoolean305) {
			if (local12) {
				this.anOpengl1.glEnable(3008);
			} else {
				this.anOpengl1.glDisable(3008);
			}
			this.aBoolean305 = local12;
		}
		if (local8 != this.anInt3865) {
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
			this.anInt3865 = local8;
		}
		this.anInt3858 = arg0;
		this.anInt3875 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!mi", name = "C", descriptor = "()Z")
	@Override
	public boolean method4924() {
		return this.aBoolean301;
	}

	@OriginalMember(owner = "client!mi", name = "nb", descriptor = "()V")
	private void method3614() {
		this.anOpengl1.glDepthMask(this.aBoolean312 && this.aBoolean310);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(FF)V")
	public void method3615(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat50 = arg0;
		this.aFloat48 = arg1;
		if (!this.aBoolean296) {
			this.method3572();
		}
	}

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "()F")
	@Override
	public float method4912() {
		return this.aFloat37;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass118_Sub1_1.aFloat28 * (float) arg0 + this.aClass118_Sub1_1.aFloat29 * (float) arg1 + this.aClass118_Sub1_1.aFloat31 * (float) arg2 + this.aClass118_Sub1_1.aFloat32;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass118_Sub1_1.aFloat28 * (float) arg3 + this.aClass118_Sub1_1.aFloat29 * (float) arg4 + this.aClass118_Sub1_1.aFloat31 * (float) arg5 + this.aClass118_Sub1_1.aFloat32;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt3881 && local55 < (float) this.anInt3881 || !(!(local24 > (float) this.anInt3880) || !(local55 > (float) this.anInt3880))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt3870 * (this.aClass118_Sub1_1.aFloat25 * (float) arg0 + this.aClass118_Sub1_1.aFloat24 * (float) arg1 + this.aClass118_Sub1_1.aFloat30 * (float) arg2 + this.aClass118_Sub1_1.aFloat26) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt3870 * (this.aClass118_Sub1_1.aFloat25 * (float) arg3 + this.aClass118_Sub1_1.aFloat24 * (float) arg4 + this.aClass118_Sub1_1.aFloat30 * (float) arg5 + this.aClass118_Sub1_1.aFloat26) / local55);
		if ((float) local119 < this.aFloat49 && (float) local151 < this.aFloat49 || (float) local119 > this.aFloat45 && (float) local151 > this.aFloat45) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt3884 * (this.aClass118_Sub1_1.aFloat27 * (float) arg0 + this.aClass118_Sub1_1.aFloat23 * (float) arg1 + this.aClass118_Sub1_1.aFloat22 * (float) arg2 + this.aClass118_Sub1_1.aFloat33) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt3884 * (this.aClass118_Sub1_1.aFloat27 * (float) arg3 + this.aClass118_Sub1_1.aFloat23 * (float) arg4 + this.aClass118_Sub1_1.aFloat22 * (float) arg5 + this.aClass118_Sub1_1.aFloat33) / local55);
			return (!((float) local209 < this.aFloat41) || !((float) local241 < this.aFloat41)) && (!((float) local209 > this.aFloat42) || !((float) local241 > this.aFloat42));
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!hs;III)V")
	public void method3616(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3571(arg0);
		arg0.method2310(arg1, arg2);
	}

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "(I)I")
	public int method3617(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "()V")
	@Override
	public void method4894() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "(II)V")
	public synchronized void method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub28 local4 = new Class3_Sub28(arg1);
		local4.aLong240 = arg0;
		this.aClass138_29.method3053(local4);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(F)V")
	public void method3619(@OriginalArg(0) float arg0) {
		if (this.aFloat53 != arg0) {
			this.aFloat53 = arg0;
			if (this.anInt3883 == 3) {
				this.method3567();
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "(I)V")
	public void method3620() {
		this.method3631(-2, true);
	}

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "()Z")
	@Override
	public boolean method4947() {
		if (!this.aClass3_Sub25_Sub1_1.method4754()) {
			if (!this.aClass95_1.method1921(this.aClass3_Sub25_Sub1_1)) {
				return false;
			}
			this.aClass192_1.method4409();
		}
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass118_Sub1_1.aFloat28 * (float) arg0 + this.aClass118_Sub1_1.aFloat29 * (float) arg1 + this.aClass118_Sub1_1.aFloat31 * (float) arg2 + this.aClass118_Sub1_1.aFloat32;
		if (local24 < (float) this.anInt3881 || local24 > (float) this.anInt3880) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt3870 * (this.aClass118_Sub1_1.aFloat25 * (float) arg0 + this.aClass118_Sub1_1.aFloat24 * (float) arg1 + this.aClass118_Sub1_1.aFloat30 * (float) arg2 + this.aClass118_Sub1_1.aFloat26) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt3884 * (this.aClass118_Sub1_1.aFloat27 * (float) arg0 + this.aClass118_Sub1_1.aFloat23 * (float) arg1 + this.aClass118_Sub1_1.aFloat22 * (float) arg2 + this.aClass118_Sub1_1.aFloat33) / local24);
		if ((float) local81 >= this.aFloat49 && (float) local81 <= this.aFloat45 && (float) local113 >= this.aFloat41 && (float) local113 <= this.aFloat42) {
			arg3[0] = (int) ((float) local81 - this.aFloat49);
			arg3[1] = (int) ((float) local113 - this.aFloat41);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!mi", name = "ob", descriptor = "()V")
	public void method3621() {
		this.anOpengl1.glPopMatrix();
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I[BIZ)Lclient!ht;")
	public Interface5 method3622(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface5) (this.aBoolean304 && (!arg3 || this.aBoolean307) ? new Class1_Sub2(this, arg0, arg1, arg2, arg3) : new Class109_Sub2(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "(I)V")
	public synchronized void method3623(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub28 local4 = new Class3_Sub28(arg0);
		this.aClass138_32.method3053(local4);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)V")
	public void method3624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!ht;")
	public Interface5 method3625(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface5) (this.aBoolean304 ? new Class1_Sub2(this, arg0, arg1, false) : new Class109_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ga;Lclient!ga;Lclient!ga;Lclient!ga;)V")
	public void method3626(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3) {
		if (arg0 == null) {
			this.anOpengl1.glDisableClientState(32884);
		} else {
			this.anOpengl1.glEnableClientState(32884);
			arg0.method1809();
		}
		if (arg1 == null) {
			this.anOpengl1.glDisableClientState(32885);
		} else {
			this.anOpengl1.glEnableClientState(32885);
			arg1.method1807();
		}
		if (arg2 == null) {
			this.anOpengl1.glDisableClientState(32886);
		} else {
			this.anOpengl1.glEnableClientState(32886);
			arg2.method1806();
		}
		if (arg3 == null) {
			this.anOpengl1.glDisableClientState(32888);
		} else {
			this.anOpengl1.glEnableClientState(32888);
			arg3.method1808();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lclient!f;Lclient!cs;Lclient!os;[Lclient!kt;I)V")
	@Override
	public void method4886(@OriginalArg(0) Class75[] arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class12_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method4937(arg0, arg2, arg3, arg4);
		this.method4864(arg1);
	}

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "()Z")
	@Override
	public boolean method4891() {
		return false;
	}

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "()V")
	@Override
	public void method4892() {
		this.aClass149_1.method3226(false, false, 0);
		this.aBoolean296 = false;
		this.method3572();
		this.method3607();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4854(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4894();
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lclient!ca;)V")
	public void method3627(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt3846 < 0 || this.anInterface2Array1[this.anInt3846] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array1[this.anInt3846--] = null;
		arg0.method3563();
		if (this.anInt3846 >= 0) {
			this.anInterface2_1 = this.anInterface2Array1[this.anInt3846];
			this.anInterface2_1.method3561();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4900() {
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(F)V")
	@Override
	public void method4899(@OriginalArg(0) float arg0) {
		if (this.aFloat46 != arg0) {
			this.aFloat46 = arg0;
			this.method3591();
		}
	}

	@OriginalMember(owner = "client!mi", name = "D", descriptor = "()Z")
	@Override
	public boolean method4928() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(Z)V")
	@Override
	public void method4923(@OriginalArg(0) boolean arg0) {
		this.aBoolean310 = arg0;
		this.method3614();
	}

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "()Z")
	@Override
	public boolean method4858() {
		return this.aClass3_Sub25_Sub1_1.method4761();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[Lclient!eo;)V")
	@Override
	public void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub12[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class3_Sub12 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static217.aFloatArray18[0] = local8.anInt6127;
			Static217.aFloatArray18[1] = local8.anInt6123;
			Static217.aFloatArray18[2] = local8.anInt6122;
			Static217.aFloatArray18[3] = 1.0F;
			this.anOpengl1.glLightfv(local12, 4611, Static217.aFloatArray18, 0);
			@Pc(44) int local44 = local8.anInt6130;
			@Pc(49) float local49 = local8.aFloat69 / 255.0F;
			Static217.aFloatArray18[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static217.aFloatArray18[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static217.aFloatArray18[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl1.glLightfv(local12, 4609, Static217.aFloatArray18, 0);
			this.anOpengl1.glLightf(local12, 4617, 1.0F / (float) (local8.anInt6129 * local8.anInt6129));
			this.anOpengl1.glEnable(local12);
		}
		while (local1 < this.anInt3861) {
			this.anOpengl1.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt3861 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(FFF)V")
	private void method3628(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl1.glMatrixMode(5890);
		if (this.aBoolean311) {
			this.anOpengl1.glLoadIdentity();
		}
		this.anOpengl1.glTranslatef(arg0, arg1, arg2);
		this.anOpengl1.glMatrixMode(5888);
		this.aBoolean311 = true;
	}

	@OriginalMember(owner = "client!mi", name = "pb", descriptor = "()Lclient!ca;")
	public Interface2 method3629() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "()V")
	@Override
	protected void method4866() {
		if (this.anOpengl1 != null) {
			try {
				this.aClass95_1.method1925();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl1 = null;
		}
		if (this.aContext1 != null) {
			this.method3595();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean291) {
			Static236.method3898(true);
			this.aBoolean291 = false;
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
	@Override
	public void method4890(@OriginalArg(0) int arg0) {
		this.method3595();
	}

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "(I)V")
	public synchronized void method3630(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub28 local4 = new Class3_Sub28(arg0);
		this.aClass138_31.method3053(local4);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)V")
	public void method3631(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method3582(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4881(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt3882 != arg0;
		if (local7 || this.aFloat55 != arg1 || this.aFloat54 != arg2) {
			this.anInt3882 = arg0;
			this.aFloat55 = arg1;
			this.aFloat54 = arg2;
			if (local7) {
				this.aFloat56 = (float) (this.anInt3882 & 0xFF0000) / 1.671168E7F;
				this.aFloat44 = (float) (this.anInt3882 & 0xFFFF) / 65535.0F;
				this.aFloat40 = (float) (this.anInt3882 & 0xFF) / 255.0F;
				this.method3591();
			}
			this.method3606();
		}
		if (this.aFloatArray23[0] == arg3 && this.aFloatArray23[1] == arg4 && this.aFloatArray23[2] == arg5) {
			return;
		}
		this.aFloatArray23[0] = arg3;
		this.aFloatArray23[1] = arg4;
		this.aFloatArray23[2] = arg5;
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
		this.method3636();
		this.anInt3856 = (int) (arg3 * 256.0F / arg4);
		this.anInt3869 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "()Z")
	@Override
	public boolean method4903() {
		return true;
	}

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "(II)V")
	public synchronized void method3632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub28 local4 = new Class3_Sub28(arg1);
		local4.aLong240 = arg0;
		this.aClass138_27.method3053(local4);
	}

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "()V")
	@Override
	public void method4895() {
		if (this.anInt3849 <= 0 && this.anInt3843 <= 0) {
			return;
		}
		@Pc(9) int local9 = this.anInt3867;
		@Pc(12) int local12 = this.anInt3853;
		@Pc(15) int local15 = this.anInt3871;
		@Pc(18) int local18 = this.anInt3874;
		this.method4902();
		this.anOpengl1.glReadBuffer(1028);
		this.anOpengl1.glDrawBuffer(1029);
		this.method3597();
		this.method3612(false);
		this.method3568(false);
		this.method3573(false);
		this.method3584(false);
		this.method3585(null);
		this.method3620();
		this.method3580(0);
		this.method3613(0);
		this.anOpengl1.glMatrixMode(5889);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl1.glMatrixMode(5888);
		this.anOpengl1.glLoadIdentity();
		this.anOpengl1.glRasterPos2i(0, 0);
		this.anOpengl1.glCopyPixels(0, 0, this.anInt3849, this.anInt3843, 6144);
		this.anOpengl1.glFlush();
		this.anOpengl1.glReadBuffer(1029);
		this.anOpengl1.glDrawBuffer(1029);
		this.method4867(local9, local15, local12, local18);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!is;)V")
	public void method3633(@OriginalArg(0) Class118_Sub1 arg0) {
		this.anOpengl1.glPushMatrix();
		this.anOpengl1.glMultMatrixf(arg0.method2482(), 0);
	}

	@OriginalMember(owner = "client!mi", name = "qb", descriptor = "()Lclient!nq;")
	public Class30_Sub4 method3634() {
		return this.aClass8_Sub1_1 == null ? null : this.aClass8_Sub1_1.method2306();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([I)V")
	@Override
	public void method4941(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3867;
		arg0[1] = this.anInt3871;
		arg0[2] = this.anInt3853;
		arg0[3] = this.anInt3874;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(III)V")
	public void method3635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl1.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!mi", name = "rb", descriptor = "()V")
	public void method3636() {
		this.anOpengl1.glLightfv(16384, 4611, this.aFloatArray21, 0);
		this.anOpengl1.glLightfv(16385, 4611, this.aFloatArray22, 0);
	}
}
