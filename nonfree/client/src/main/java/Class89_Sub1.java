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

@OriginalClass("client!hd")
public final class Class89_Sub1 extends Class89 implements Interface2 {

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public int anInt2599;

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
	public int anInt2600;

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
	public int anInt2602;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	public int anInt2603;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
	private int anInt2605;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	public int anInt2606;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "Lclient!hf;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!hd", name = "X", descriptor = "F")
	public float aFloat24;

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
	private int anInt2608;

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Z")
	private boolean aBoolean183;

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Z")
	private boolean aBoolean184;

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lclient!oe;")
	public Class92_Sub4 aClass92_Sub4_3;

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "Lclient!mj;")
	private Class17_Sub1 aClass17_Sub1_1;

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "[Lclient!rs;")
	private Class181[] aClass181Array1;

	@OriginalMember(owner = "client!hd", name = "hb", descriptor = "Z")
	private boolean aBoolean186;

	@OriginalMember(owner = "client!hd", name = "jb", descriptor = "Z")
	private boolean aBoolean187;

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "F")
	public float aFloat25;

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "Lclient!ui;")
	private Interface9 lb;

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "I")
	private int anInt2610;

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "Lclient!fs;")
	public Class31_Sub2 aClass31_Sub2_1;

	@OriginalMember(owner = "client!hd", name = "pb", descriptor = "Ljava/lang/String;")
	private String aString183;

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "Z")
	public boolean aBoolean189;

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "Lclient!gm;")
	public Class85 aClass85_3;

	@OriginalMember(owner = "client!hd", name = "vb", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "Lclient!n;")
	public Class70_Sub2 aClass70_Sub2_1;

	@OriginalMember(owner = "client!hd", name = "xb", descriptor = "Lclient!n;")
	public Class70_Sub2 aClass70_Sub2_2;

	@OriginalMember(owner = "client!hd", name = "yb", descriptor = "F")
	public float aFloat26;

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
	public int anInt2615;

	@OriginalMember(owner = "client!hd", name = "Fb", descriptor = "I")
	private int anInt2618;

	@OriginalMember(owner = "client!hd", name = "Hb", descriptor = "[Lclient!vd;")
	private Class92[] aClass92Array1;

	@OriginalMember(owner = "client!hd", name = "Ib", descriptor = "Lclient!fs;")
	public Class31_Sub2 aClass31_Sub2_2;

	@OriginalMember(owner = "client!hd", name = "Jb", descriptor = "[Z")
	private boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "F")
	private float aFloat28;

	@OriginalMember(owner = "client!hd", name = "Lb", descriptor = "F")
	public float aFloat29;

	@OriginalMember(owner = "client!hd", name = "Mb", descriptor = "I")
	private int anInt2620;

	@OriginalMember(owner = "client!hd", name = "Nb", descriptor = "F")
	public float aFloat30;

	@OriginalMember(owner = "client!hd", name = "Ob", descriptor = "Lclient!fs;")
	public Class31_Sub2 aClass31_Sub2_3;

	@OriginalMember(owner = "client!hd", name = "Pb", descriptor = "I")
	private int anInt2621;

	@OriginalMember(owner = "client!hd", name = "Qb", descriptor = "I")
	public int anInt2622;

	@OriginalMember(owner = "client!hd", name = "Rb", descriptor = "Lclient!ui;")
	public Interface9 anInterface9_3;

	@OriginalMember(owner = "client!hd", name = "Ub", descriptor = "Lclient!rs;")
	private Class181 aClass181_15;

	@OriginalMember(owner = "client!hd", name = "Wb", descriptor = "Lclient!oe;")
	public Class92_Sub4 aClass92_Sub4_4;

	@OriginalMember(owner = "client!hd", name = "Zb", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!hd", name = "bc", descriptor = "Z")
	public boolean aBoolean193;

	@OriginalMember(owner = "client!hd", name = "dc", descriptor = "Lclient!fs;")
	public Class31_Sub2 aClass31_Sub2_4;

	@OriginalMember(owner = "client!hd", name = "ec", descriptor = "I")
	private int anInt2625;

	@OriginalMember(owner = "client!hd", name = "gc", descriptor = "Z")
	public boolean aBoolean195;

	@OriginalMember(owner = "client!hd", name = "hc", descriptor = "Lclient!hk;")
	private Interface3 anInterface3_5;

	@OriginalMember(owner = "client!hd", name = "ic", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!hd", name = "kc", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!hd", name = "lc", descriptor = "Z")
	public boolean aBoolean199;

	@OriginalMember(owner = "client!hd", name = "nc", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!hd", name = "oc", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!hd", name = "sc", descriptor = "Z")
	public boolean aBoolean200;

	@OriginalMember(owner = "client!hd", name = "tc", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!hd", name = "vc", descriptor = "Z")
	private boolean aBoolean202;

	@OriginalMember(owner = "client!hd", name = "xc", descriptor = "Z")
	public boolean aBoolean203;

	@OriginalMember(owner = "client!hd", name = "yc", descriptor = "Ljava/lang/String;")
	private String aString184;

	@OriginalMember(owner = "client!hd", name = "zc", descriptor = "I")
	private int anInt2631;

	@OriginalMember(owner = "client!hd", name = "Ac", descriptor = "Lclient!rs;")
	private Class181 aClass181_16;

	@OriginalMember(owner = "client!hd", name = "Bc", descriptor = "Lclient!fs;")
	public Class31_Sub2 aClass31_Sub2_5;

	@OriginalMember(owner = "client!hd", name = "Cc", descriptor = "Z")
	private boolean aBoolean204;

	@OriginalMember(owner = "client!hd", name = "Dc", descriptor = "Z")
	private boolean aBoolean205;

	@OriginalMember(owner = "client!hd", name = "Gc", descriptor = "I")
	private int anInt2633;

	@OriginalMember(owner = "client!hd", name = "Ic", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!hd", name = "Kc", descriptor = "I")
	public int anInt2635;

	@OriginalMember(owner = "client!hd", name = "Lc", descriptor = "Lclient!rs;")
	private Class181 aClass181_17;

	@OriginalMember(owner = "client!hd", name = "Mc", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "client!hd", name = "Nc", descriptor = "Lclient!mc;")
	private Class92_Sub4_Sub1 aClass92_Sub4_Sub1_1;

	@OriginalMember(owner = "client!hd", name = "Rc", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!hd", name = "Uc", descriptor = "I")
	private int anInt2638;

	@OriginalMember(owner = "client!hd", name = "Vc", descriptor = "Lclient!oe;")
	public Class92_Sub4 aClass92_Sub4_5;

	@OriginalMember(owner = "client!hd", name = "Wc", descriptor = "F")
	private float aFloat43;

	@OriginalMember(owner = "client!hd", name = "ad", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!hd", name = "bd", descriptor = "Lclient!fs;")
	public Class31_Sub2 aClass31_Sub2_6;

	@OriginalMember(owner = "client!hd", name = "dd", descriptor = "I")
	private int anInt2641;

	@OriginalMember(owner = "client!hd", name = "ed", descriptor = "I")
	private int anInt2642;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!bm;")
	private final Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "Lclient!mk;")
	private final Class70 aClass70_7 = new Class70_Sub2();

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	public final int anInt2601 = 8;

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "[Lclient!hf;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	private int anInt2604 = -1;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
	public final int anInt2607 = 3;

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "Lclient!fi;")
	private final Class74 aClass74_12 = new Class74();

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "Lclient!fi;")
	private final Class74 aClass74_13 = new Class74();

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "Lclient!fi;")
	private final Class74 aClass74_14 = new Class74();

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Lclient!fi;")
	private final Class74 aClass74_15 = new Class74();

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "Lclient!fi;")
	private final Class74 aClass74_16 = new Class74();

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "Lclient!fi;")
	private final Class74 aClass74_17 = new Class74();

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "Lclient!fi;")
	private final Class74 aClass74_18 = new Class74();

	@OriginalMember(owner = "client!hd", name = "Cb", descriptor = "[F")
	private final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!hd", name = "ac", descriptor = "F")
	public float aFloat33 = -1.0F;

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "F")
	private float aFloat27 = 0.0F;

	@OriginalMember(owner = "client!hd", name = "Vb", descriptor = "F")
	public float aFloat31 = 1.0F;

	@OriginalMember(owner = "client!hd", name = "Db", descriptor = "I")
	private int anInt2616 = 0;

	@OriginalMember(owner = "client!hd", name = "fc", descriptor = "I")
	public int anInt2626 = -1;

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "F")
	public float aFloat23 = 1.0F;

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
	private int anInt2609 = 0;

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
	private int anInt2612 = -1;

	@OriginalMember(owner = "client!hd", name = "qc", descriptor = "F")
	public float aFloat36 = -1.0F;

	@OriginalMember(owner = "client!hd", name = "Eb", descriptor = "I")
	public int anInt2617 = -1;

	@OriginalMember(owner = "client!hd", name = "Gb", descriptor = "I")
	public int anInt2619 = 0;

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
	private int anInt2611 = 8448;

	@OriginalMember(owner = "client!hd", name = "rc", descriptor = "I")
	public int anInt2629 = 512;

	@OriginalMember(owner = "client!hd", name = "Sb", descriptor = "I")
	public int anInt2623 = 0;

	@OriginalMember(owner = "client!hd", name = "mc", descriptor = "I")
	private int anInt2627 = -1;

	@OriginalMember(owner = "client!hd", name = "Jc", descriptor = "F")
	private float aFloat40 = 1.0F;

	@OriginalMember(owner = "client!hd", name = "Ec", descriptor = "F")
	public float aFloat38 = 1.0F;

	@OriginalMember(owner = "client!hd", name = "Hc", descriptor = "I")
	private int anInt2634 = 0;

	@OriginalMember(owner = "client!hd", name = "Oc", descriptor = "[F")
	private final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!hd", name = "uc", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!hd", name = "Qc", descriptor = "I")
	private int anInt2636 = 0;

	@OriginalMember(owner = "client!hd", name = "Tb", descriptor = "I")
	public int anInt2624 = 50;

	@OriginalMember(owner = "client!hd", name = "Fc", descriptor = "I")
	private int anInt2632 = 0;

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "[F")
	private final float[] aFloatArray9 = new float[4];

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "I")
	private int anInt2613 = 8448;

	@OriginalMember(owner = "client!hd", name = "wc", descriptor = "I")
	public int anInt2630 = 3584;

	@OriginalMember(owner = "client!hd", name = "zb", descriptor = "I")
	public int anInt2614 = 512;

	@OriginalMember(owner = "client!hd", name = "Pc", descriptor = "F")
	private float aFloat41 = 1.0F;

	@OriginalMember(owner = "client!hd", name = "Sc", descriptor = "F")
	public float aFloat42 = 3584.0F;

	@OriginalMember(owner = "client!hd", name = "Zc", descriptor = "I")
	private int anInt2639 = 0;

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "[F")
	public final float[] aFloatArray10 = new float[4];

	@OriginalMember(owner = "client!hd", name = "Yb", descriptor = "F")
	public float aFloat32 = 3584.0F;

	@OriginalMember(owner = "client!hd", name = "Xc", descriptor = "[F")
	private final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!hd", name = "pc", descriptor = "I")
	private int anInt2628 = 0;

	@OriginalMember(owner = "client!hd", name = "Tc", descriptor = "I")
	public int anInt2637 = -1;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas2;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!pg;")
	public final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!hd", name = "cd", descriptor = "I")
	public final int anInt2640;

	@OriginalMember(owner = "client!hd", name = "Yc", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!hd", name = "Xb", descriptor = "Z")
	public boolean aBoolean191;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "Z")
	public boolean aBoolean185;

	@OriginalMember(owner = "client!hd", name = "cc", descriptor = "Z")
	private boolean aBoolean194;

	@OriginalMember(owner = "client!hd", name = "jc", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "Lclient!wr;")
	public final Class220 aClass220_1;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!nk;")
	public final Class144 aClass144_1;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!eq;")
	private final Class67 aClass67_1;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!wk;")
	private final Class216 aClass216_1;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Lclient!cg;")
	private final Class7_Sub6_Sub1 aClass7_Sub6_Sub1_1;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!pg;IILclient!bd;)V")
	public Class89_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class21 arg4) {
		this.aCanvas2 = arg0;
		this.anInterface6_3 = arg1;
		this.anInt6390 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas2.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static129.method2634(1000L);
		}
		this.aCanvas2.setIgnoreRepaint(true);
		try {
			if (!Static115.aBoolean181) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static115.aBoolean181 = Boolean.TRUE;
				} else {
					@Pc(218) Class99 local218 = arg4.method374(this.getClass());
					while (local218.anInt2836 == 0) {
						Static129.method2634(100L);
					}
					if (local218.anInt2836 == 1) {
						Static115.aBoolean181 = Boolean.TRUE;
					}
				}
			}
			if (!Static115.aBoolean181) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas2, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method2405();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(283) int local283 = this.method2439();
				if (local283 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2640 = this.aBoolean195 ? 33639 : 5121;
				@Pc(302) String local302 = this.aString183.toLowerCase();
				@Pc(306) String local306 = this.aString184.toLowerCase();
				if (local306.indexOf("radeon") != -1) {
					@Pc(313) int local313 = 0;
					@Pc(315) boolean local315 = false;
					@Pc(317) boolean local317 = false;
					@Pc(325) String[] local325 = Static201.method3708(' ', local306.replace('/', ' '));
					for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
						@Pc(335) String local335 = local325[local327];
						if (local335.length() >= 4) {
							if (local335.charAt(0) == 'x' && Static324.method5212(local335.substring(1, 3))) {
								local335 = local335.substring(1);
								local317 = true;
							}
							if (local335.equals("hd")) {
								local315 = true;
								break;
							}
							if (local335.startsWith("hd")) {
								local335 = local335.substring(2);
								local315 = true;
							}
							if (Static324.method5212(local335.substring(0, 4))) {
								local313 = Static281.method4414(local335.substring(0, 4));
								break;
							}
						}
					}
					if (!local317 && !local315) {
						if (local313 >= 7000 && local313 <= 7999) {
							this.aBoolean208 = false;
						}
						if (local313 >= 7000 && local313 <= 9250) {
							this.aBoolean191 = false;
						}
					}
					if (!local315 || local313 < 4000) {
						this.aBoolean185 = false;
					}
					this.aBoolean194 = this.aBoolean208;
				}
				if (local302.contains("intel")) {
					this.aBoolean197 = false;
				}
				if (this.aBoolean208) {
					try {
						@Pc(438) int[] local438 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local438, 0);
					} catch (@Pc(446) Throwable local446) {
						throw new RuntimeException("", local446);
					}
				}
				this.method2468(this);
				this.method5434();
				this.method2401();
				this.aClass220_1 = new Class220(this);
				this.aClass144_1 = new Class144(this, this.anInterface6_3);
				Static314.method5102(true);
				this.aBoolean182 = true;
				this.aClass67_1 = new Class67(this);
				this.aClass216_1 = new Class216(this);
				this.aClass7_Sub6_Sub1_1 = new Class7_Sub6_Sub1(this);
				this.method2443();
				this.anOpengl2.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(512) Exception local512) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static129.method2634(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(531) Throwable local531) {
			local531.printStackTrace();
			this.method5443();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local531);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!vm;[Lclient!dr;Z)Lclient!hq;")
	@Override
	public Class94 method5483(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class56[] arg1) {
		return new Class94_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([I)V")
	@Override
	public void method5421(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2636;
		arg0[1] = this.anInt2639;
		arg0[2] = this.anInt2609;
		arg0[3] = this.anInt2634;
	}

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "()Z")
	@Override
	public boolean method5447() {
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	@Override
	public void method5407(@OriginalArg(0) int arg0) {
		this.method2456();
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(III)V")
	public void method2392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
	@Override
	public void method2390() {
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method2442();
		this.method2403(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean206) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean206) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "()Lclient!m;")
	public Class92_Sub3 method2393() {
		return this.aClass17_Sub1_1 == null ? null : this.aClass17_Sub1_1.method1865();
	}

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "(I)V")
	public synchronized void method2394(@OriginalArg(0) int arg0) {
		@Pc(4) Class7_Sub10 local4 = new Class7_Sub10(arg0);
		this.aClass74_15.method1802(local4);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	@Override
	public void method5400(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "()Z")
	@Override
	public boolean method5402() {
		return Static22.aString35 == null || !Static22.aString35.startsWith("mac");
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(II)V")
	@Override
	public void method5479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2617 == arg0 && this.anInt2626 == arg1) {
			return;
		}
		this.anInt2617 = arg0;
		this.anInt2626 = arg1;
		if (!this.aBoolean198) {
			this.method2457();
			this.method2455();
		}
	}

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "()V")
	@Override
	public void method5433() {
		if (this.aClass7_Sub6_Sub1_1.method862()) {
			this.aClass216_1.method5658(this.aClass7_Sub6_Sub1_1);
			this.aClass144_1.method3849();
		}
	}

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "()V")
	private void method2395() {
		if (this.anInt2633 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, (double) this.anInt2602, (double) this.anInt2603, 0.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt2633 = 1;
		this.anInt2631 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5386(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5392();
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	@Override
	public void method5405(@OriginalArg(0) int arg0) {
		this.method2403(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class8 method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class8_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "()Z")
	@Override
	public boolean method5430() {
		return this.aClass7_Sub6_Sub1_1.method866();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(III)V")
	public void method2396(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(FF)V")
	@Override
	public void method5463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat30 && arg1 == this.aFloat34) {
			return;
		}
		this.aFloat30 = arg0;
		this.aFloat34 = arg1;
		this.method2450();
		this.method2446();
		if (this.anInt2633 == 3) {
			this.method2448();
		} else if (this.anInt2633 == 2) {
			this.method2397();
		}
	}

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "()V")
	private void method2397() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray11, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "()V")
	@Override
	public void method5480() {
		this.method2424(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt2602) {
			arg2 = this.anInt2602;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt2603) {
			arg3 = this.anInt2603;
		}
		this.anInt2636 = arg0;
		this.anInt2639 = arg1;
		this.anInt2609 = arg2;
		this.anInt2634 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method2409();
		this.method2417();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ui;III)V")
	public void method2398(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2444(arg0);
		arg0.method5711(arg1, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "(I)I")
	public int method2399(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "()F")
	@Override
	public float method5424() {
		return this.aFloat30;
	}

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "()Z")
	@Override
	public boolean method5458() {
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "()I")
	@Override
	public int method5440() {
		return this.anInt2624;
	}

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "()V")
	public void method2400() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray12, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray13, 0);
	}

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "()V")
	private void method2401() {
		this.aClass70_Sub2_2 = new Class70_Sub2();
		this.aClass70_Sub2_1 = new Class70_Sub2();
		this.aClass92Array1 = new Class92[this.anInt2615];
		this.aBooleanArray16 = new boolean[this.anInt2620];
		this.aClass181Array1 = new Class181[this.anInt2620];
		this.aClass92_Sub4_5 = new Class92_Sub4(this, 3553, 6408, 1, 1);
		this.aClass92_Sub4_3 = new Class92_Sub4(this, 3553, 6408, 1, 1);
		this.aClass92_Sub4_4 = new Class92_Sub4(this, 3553, 6408, 1, 1);
		this.aClass31_Sub2_2 = new Class31_Sub2(this);
		this.aClass31_Sub2_6 = new Class31_Sub2(this);
		this.aClass31_Sub2_3 = new Class31_Sub2(this);
		this.aClass31_Sub2_1 = new Class31_Sub2(this);
		this.aClass31_Sub2_4 = new Class31_Sub2(this);
		this.aClass31_Sub2_5 = new Class31_Sub2(this);
		this.anInterface9_3 = this.method2408(null, 1024, true);
		if (this.aBoolean197) {
			this.aClass85_3 = new Class85(this);
		}
		this.aClass29_1.method483(this);
	}

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "()V")
	public void method2402() {
		if (this.anInt2631 == 4) {
			return;
		}
		this.method2395();
		this.method2436(false);
		this.method2407(false);
		this.method2414(false);
		this.method2424(false);
		this.method2438();
		this.method2403(1);
		this.method2425(1);
		this.anInt2631 = 4;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)V")
	@Override
	public void method5460(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "(I)V")
	public void method2403(@OriginalArg(0) int arg0) {
		if (this.anInt2610 == arg0) {
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
		if (local10 != this.aBoolean196) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean196 = local10;
		}
		if (local12 != this.aBoolean192) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean192 = local12;
		}
		if (local8 != this.anInt2618) {
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
			this.anInt2618 = local8;
		}
		this.anInt2610 = arg0;
		this.anInt2631 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "()V")
	@Override
	public void method5425() {
		this.anInt2636 = 0;
		this.anInt2639 = 0;
		this.anInt2609 = this.anInt2602;
		this.anInt2634 = this.anInt2603;
		this.anOpengl2.glDisable(3089);
		this.method2409();
	}

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "()V")
	public void method2404() {
		if (this.anInt2631 == 16) {
			return;
		}
		this.method2465();
		this.method2436(true);
		this.method2414(true);
		this.method2424(true);
		this.method2403(1);
		this.method2425(1);
		this.anInt2631 = 16;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V")
	@Override
	public void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2624 == arg0 && this.anInt2630 == arg1) {
			return;
		}
		this.anInt2624 = arg0;
		this.anInt2630 = arg1;
		this.method2449();
		this.method2446();
		this.method2457();
	}

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "()V")
	private void method2405() {
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
			Static129.method2634(1000L);
		}
	}

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "(I)I")
	public int method2406(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(Z)V")
	public void method2407(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean204) {
			this.aBoolean204 = arg0;
			this.method2422();
			this.anInt2631 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BIZ)Lclient!ui;")
	public Interface9 method2408(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface9) (this.aBoolean208 && (!arg2 || this.aBoolean194) ? new Class33_Sub1(this, 5123, arg0, arg1, arg2) : new Class19_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	@Override
	public void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean198) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt2627 = arg1;
		this.anInt2637 = arg2;
		this.method2457();
		this.aClass67_1.method1578(arg0, true);
	}

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "()V")
	private void method2409() {
		this.aFloat24 = this.anInt2636 - this.anInt2619;
		this.aFloat26 = this.anInt2609 - this.anInt2619;
		this.aFloat37 = this.anInt2639 - this.anInt2623;
		this.aFloat25 = this.anInt2634 - this.anInt2623;
	}

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "()V")
	private void method2410() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass70_Sub2_2.method3724(), 0);
		this.method2400();
	}

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "(I)V")
	public synchronized void method2411(@OriginalArg(0) int arg0) {
		@Pc(4) Class7_Sub10 local4 = new Class7_Sub10(arg0);
		this.aClass74_18.method1802(local4);
	}

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "()Z")
	@Override
	public boolean method5437() {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "W", descriptor = "()V")
	private void method2412() {
		Static115.aFloatArray7[0] = this.aFloat36 * this.aFloat31;
		Static115.aFloatArray7[1] = this.aFloat36 * this.aFloat38;
		Static115.aFloatArray7[2] = this.aFloat36 * this.aFloat23;
		Static115.aFloatArray7[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static115.aFloatArray7, 0);
		Static115.aFloatArray7[0] = -this.aFloat33 * this.aFloat31;
		Static115.aFloatArray7[1] = -this.aFloat33 * this.aFloat38;
		Static115.aFloatArray7[2] = -this.aFloat33 * this.aFloat23;
		Static115.aFloatArray7[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static115.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
	@Override
	public void method2389() {
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(II)V")
	public synchronized void method2413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class7_Sub10 local4 = new Class7_Sub10(arg1);
		local4.aLong232 = arg0;
		this.aClass74_15.method1802(local4);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
	@Override
	public void method5452() {
		this.aBoolean198 = true;
		this.anInt2627 = 1583160;
		this.anInt2637 = 40;
		this.method2457();
		this.method2455();
		this.aClass67_1.method1579(false, false, 3);
		this.aClass67_1.method1578(-1, true);
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(Z)V")
	public void method2414(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean190) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean190 = arg0;
		this.anInt2631 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(II)V")
	public synchronized void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class7_Sub10 local4 = new Class7_Sub10(arg1);
		local4.aLong232 = arg0;
		this.aClass74_13.method1802(local4);
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(II)V")
	public void method2416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2632 = arg0;
		this.anInt2616 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt2602, this.anInt2603);
		this.method2417();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[Lclient!j;)V")
	@Override
	public void method5470(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub16[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class7_Sub16 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static115.aFloatArray8[0] = local8.anInt4070;
			Static115.aFloatArray8[1] = local8.anInt4074;
			Static115.aFloatArray8[2] = local8.anInt4072;
			Static115.aFloatArray8[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static115.aFloatArray8, 0);
			@Pc(44) int local44 = local8.anInt4075;
			@Pc(49) float local49 = local8.aFloat55 / 255.0F;
			Static115.aFloatArray8[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static115.aFloatArray8[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static115.aFloatArray8[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static115.aFloatArray8, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt4076 * local8.anInt4076));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt2628) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt2628 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2619 = arg0;
		this.anInt2623 = arg1;
		this.anInt2614 = arg2;
		this.anInt2629 = arg3;
		@Pc(23) float local23 = (float) (-this.anInt2619 * this.anInt2624) / (float) this.anInt2614;
		@Pc(35) float local35 = (float) (-this.anInt2623 * this.anInt2624) / (float) this.anInt2629;
		@Pc(49) float local49 = (float) ((this.anInt2602 - this.anInt2619) * this.anInt2624) / (float) this.anInt2614;
		@Pc(63) float local63 = (float) ((this.anInt2603 - this.anInt2623) * this.anInt2624) / (float) this.anInt2629;
		this.method2454(local23, local49, -local63, -local35, (float) this.anInt2624, (float) this.anInt2630);
		if (this.anInt2633 != 1) {
			this.method2449();
		}
		this.method2446();
		this.method2409();
	}

	@OriginalMember(owner = "client!hd", name = "X", descriptor = "()V")
	private void method2417() {
		if (this.anInt2636 <= this.anInt2609 && this.anInt2639 <= this.anInt2634) {
			this.anOpengl2.glScissor(this.anInt2632 + this.anInt2636, this.anInt2616 + this.anInt2603 - this.anInt2634, this.anInt2609 - this.anInt2636, this.anInt2634 - this.anInt2639);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!hd", name = "Y", descriptor = "()V")
	private void method2418() {
		if (this.aBoolean184) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean184 = false;
		}
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(II)V")
	public void method2419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2608 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt2613 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt2613 = arg0;
			local4 = true;
		}
		if (this.anInt2611 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt2611 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt2631 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "()Z")
	@Override
	public boolean method5485() {
		return this.aBoolean206;
	}

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "()I")
	@Override
	public int method5444() {
		return this.anInt2630;
	}

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "()V")
	@Override
	public void method5474() {
		this.aClass67_1.method1579(false, false, 0);
		this.aBoolean198 = false;
		this.method2457();
		this.method2455();
	}

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "()V")
	public void method2420() {
		if (this.anInt2631 == 8) {
			return;
		}
		this.method2459();
		this.method2436(true);
		this.method2414(true);
		this.method2424(true);
		this.method2403(1);
		this.method2425(1);
		this.anInt2631 = 8;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!rs;)V")
	public void method2421(@OriginalArg(0) Class181 arg0) {
		@Pc(2) Interface3 local2 = arg0.anInterface3_6;
		this.method2423(local2);
		local2.method4548(arg0);
		this.aClass181_17 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method5462(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt2612 != arg0;
		if (local7 || this.aFloat36 != arg1 || this.aFloat33 != arg2) {
			this.anInt2612 = arg0;
			this.aFloat36 = arg1;
			this.aFloat33 = arg2;
			if (local7) {
				this.aFloat31 = (float) (this.anInt2612 & 0xFF0000) / 1.671168E7F;
				this.aFloat38 = (float) (this.anInt2612 & 0xFFFF) / 65535.0F;
				this.aFloat23 = (float) (this.anInt2612 & 0xFF) / 255.0F;
				this.method2440();
			}
			this.method2412();
		}
		if (this.aFloatArray12[0] == arg3 && this.aFloatArray12[1] == arg4 && this.aFloatArray12[2] == arg5) {
			return;
		}
		this.aFloatArray12[0] = arg3;
		this.aFloatArray12[1] = arg4;
		this.aFloatArray12[2] = arg5;
		this.aFloatArray13[0] = -arg3;
		this.aFloatArray13[1] = -arg4;
		this.aFloatArray13[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray10[0] = arg3 * local132;
		this.aFloatArray10[1] = arg4 * local132;
		this.aFloatArray10[2] = arg5 * local132;
		this.aFloatArray9[0] = -this.aFloatArray10[0];
		this.aFloatArray9[1] = -this.aFloatArray10[1];
		this.aFloatArray9[2] = -this.aFloatArray10[2];
		this.method2400();
		this.anInt2622 = (int) (arg3 * 256.0F / arg4);
		this.anInt2635 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	@Override
	public void method5446(@OriginalArg(0) boolean arg0) {
		this.aBoolean201 = arg0;
		this.method2464();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass92_Sub4_Sub1_1 == null || this.aClass92_Sub4_Sub1_1.anInt3881 < arg2 || this.aClass92_Sub4_Sub1_1.anInt3880 < arg3) {
			this.aClass92_Sub4_Sub1_1 = Static363.method3534(this, arg3, arg2, arg6);
			this.aClass92_Sub4_Sub1_1.method3530(false, false);
			local32 = this.aClass92_Sub4_Sub1_1.aFloat53;
			local36 = this.aClass92_Sub4_Sub1_1.aFloat54;
		} else {
			this.aClass92_Sub4_Sub1_1.method3531(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass92_Sub4_Sub1_1.aFloat53 * (float) arg3 / (float) this.aClass92_Sub4_Sub1_1.anInt3880;
			local36 = this.aClass92_Sub4_Sub1_1.aFloat54 * (float) arg2 / (float) this.aClass92_Sub4_Sub1_1.anInt3881;
		}
		this.method2441();
		this.method2445(this.aClass92_Sub4_Sub1_1);
		this.method2403(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2431(arg5);
		this.method2419(34165, 34165);
		this.method2392(0, 34166, 768);
		this.method2392(2, 5890, 770);
		this.method2451(0, 34166);
		this.method2451(2, 5890);
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
		this.method2392(0, 5890, 768);
		this.method2392(2, 34166, 770);
		this.method2451(0, 5890);
		this.method2451(2, 34166);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!vj;II)V")
	@Override
	public void method5436(@OriginalArg(1) Class64 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class64_Sub2 local2 = (Class64_Sub2) arg0;
		@Pc(5) Class92_Sub4_Sub1 local5 = local2.aClass92_Sub4_Sub1_2;
		this.method2441();
		this.method2445(local2.aClass92_Sub4_Sub1_2);
		this.method2403(1);
		this.method2419(7681, 8448);
		this.method2392(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat54 / (float) local5.anInt3884;
		@Pc(37) float local37 = local5.aFloat53 / (float) local5.anInt3883;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2636 - arg1), local37 * (float) (this.anInt2639 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2636, this.anInt2639);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2636 - arg1), local37 * (float) (this.anInt2634 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2636, this.anInt2634);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2609 - arg1), local37 * (float) (this.anInt2634 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2609, this.anInt2634);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt2609 - arg1), local37 * (float) (this.anInt2639 - arg2));
		this.anOpengl2.glVertex2i(this.anInt2609, this.anInt2639);
		this.anOpengl2.glEnd();
		this.method2392(0, 5890, 768);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIII)Lclient!k;")
	@Override
	public Class17 method5412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean199 ? new Class17_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "()V")
	private void method2422() {
		if (this.aBoolean204 && !this.aBoolean202) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!hk;)V")
	public void method2423(@OriginalArg(0) Interface3 arg0) {
		if (this.anInterface3_5 != arg0 && this.aBoolean208) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method5710());
			this.anInterface3_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(Z)V")
	public void method2424(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean205) {
			this.aBoolean205 = arg0;
			this.method2464();
			this.anInt2631 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "(I)V")
	public void method2425(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method2419(7681, 7681);
		} else if (arg0 == 1) {
			this.method2419(8448, 8448);
		} else if (arg0 == 2) {
			this.method2419(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!rs;)V")
	public void method2426(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(2) Interface3 local2 = arg1.anInterface3_6;
		this.method2423(local2);
		local2.method4549(arg0, arg1);
		this.aClass181Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!rs;)V")
	public void method2427(@OriginalArg(0) Class181 arg0) {
		@Pc(2) Interface3 local2 = arg0.anInterface3_6;
		this.method2423(local2);
		local2.method4546(arg0);
		this.aClass181_16 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "()V")
	public void method2428() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)I")
	@Override
	public int method5435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFFF)V")
	public void method2429(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static115.aFloatArray7[0] = arg0;
		Static115.aFloatArray7[1] = arg1;
		Static115.aFloatArray7[2] = arg2;
		Static115.aFloatArray7[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static115.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I[BIZ)Lclient!hk;")
	public Interface3 method2430(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface3) (this.aBoolean208 && (!arg3 || this.aBoolean194) ? new Class33_Sub2(this, arg0, arg1, arg2, arg3) : new Class19_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!sj;Lclient!bg;Lclient!mk;Lclient!mo;I)V")
	@Override
	public void method5390(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class36_Sub6 arg3) {
		arg0.method1928(arg2, arg3, 0);
		this.method5422(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method5481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method2442();
		this.method2403(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean206) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean206) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "()Z")
	@Override
	public boolean method5465() {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "(I)V")
	public void method2431(@OriginalArg(0) int arg0) {
		Static115.aFloatArray7[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static115.aFloatArray7[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static115.aFloatArray7[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static115.aFloatArray7[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static115.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!k;)V")
	@Override
	public void method5396(@OriginalArg(0) Class17 arg0) {
		this.aClass17_Sub1_1 = (Class17_Sub1) arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass70_Sub2_2.aFloat65 * (float) arg0 + this.aClass70_Sub2_2.aFloat64 * (float) arg1 + this.aClass70_Sub2_2.aFloat67 * (float) arg2 + this.aClass70_Sub2_2.aFloat62;
		if (local24 < (float) this.anInt2624 || local24 > (float) this.anInt2630) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt2614 * (this.aClass70_Sub2_2.aFloat66 * (float) arg0 + this.aClass70_Sub2_2.aFloat58 * (float) arg1 + this.aClass70_Sub2_2.aFloat59 * (float) arg2 + this.aClass70_Sub2_2.aFloat60) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt2629 * (this.aClass70_Sub2_2.aFloat61 * (float) arg0 + this.aClass70_Sub2_2.aFloat56 * (float) arg1 + this.aClass70_Sub2_2.aFloat57 * (float) arg2 + this.aClass70_Sub2_2.aFloat63) / local24);
		if ((float) local81 >= this.aFloat24 && (float) local81 <= this.aFloat26 && (float) local113 >= this.aFloat37 && (float) local113 <= this.aFloat25) {
			arg3[0] = (int) ((float) local81 - this.aFloat24);
			arg3[1] = (int) ((float) local113 - this.aFloat37);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "()Z")
	@Override
	public boolean method5393() {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "()Z")
	@Override
	public boolean method5395() {
		if (!this.aClass7_Sub6_Sub1_1.method862()) {
			if (!this.aClass216_1.method5653(this.aClass7_Sub6_Sub1_1)) {
				return false;
			}
			this.aClass144_1.method3849();
		}
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "()V")
	@Override
	public void method5434() {
		this.anInt2602 = this.aCanvas2.getWidth();
		this.anInt2603 = this.aCanvas2.getHeight();
		this.anOpengl2.glViewport(this.anInt2632, this.anInt2616, this.anInt2602, this.anInt2603);
		this.method2449();
		this.method5425();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	public void method2432(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method2461(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "(I)V")
	public void method2433(@OriginalArg(0) int arg0) {
		if (this.anInt2608 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt2608 = arg0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "()V")
	@Override
	public void method5410() {
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIZ)Lclient!kb;")
	@Override
	public Class52 method5468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class52_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(II)V")
	public synchronized void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class7_Sub10 local4 = new Class7_Sub10(arg1);
		local4.aLong232 = arg0;
		this.aClass74_14.method1802(local4);
	}

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "()V")
	public void method2435() {
		@Pc(6) boolean local6 = this.aClass181_16 != null;
		if (local6 != this.aBoolean186) {
			if (local6) {
				this.anOpengl2.glEnableClientState(32884);
			} else {
				this.anOpengl2.glDisableClientState(32884);
			}
			this.aBoolean186 = local6;
		}
		this.aClass181_16 = null;
		@Pc(34) boolean local34 = this.aClass181_17 != null;
		if (local34 != this.aBoolean188) {
			if (local34) {
				this.anOpengl2.glEnableClientState(32885);
			} else {
				this.anOpengl2.glDisableClientState(32885);
			}
			this.aBoolean188 = local34;
		}
		this.aClass181_17 = null;
		@Pc(62) boolean local62 = this.aClass181_15 != null;
		if (local62 != this.aBoolean187) {
			if (local62) {
				this.anOpengl2.glEnableClientState(32886);
			} else {
				this.anOpengl2.glDisableClientState(32886);
			}
			this.aBoolean187 = local62;
		}
		this.aClass181_15 = null;
		for (@Pc(85) int local85 = 0; local85 < this.anInt2620; local85++) {
			@Pc(98) boolean local98 = this.aClass181Array1[local85] != null;
			if (local98 != this.aBooleanArray16[local85]) {
				this.anOpengl2.glClientActiveTexture(local85 + 33984);
				if (local98) {
					this.anOpengl2.glEnableClientState(32888);
				} else {
					this.anOpengl2.glDisableClientState(32888);
				}
				this.aBooleanArray16[local85] = local98;
			}
			this.aClass181Array1[local85] = null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "()V")
	@Override
	public void method5432() {
		this.aClass216_1.method5652();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!bg;)V")
	@Override
	public void method5422(@OriginalArg(0) Class24 arg0) {
		this.aClass29_1.method486(this, arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
	@Override
	public int method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(Z)V")
	public void method2436(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean183) {
			this.aBoolean183 = arg0;
			this.method2455();
			this.anInt2631 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "()I")
	@Override
	public int method2391() {
		return this.anInt2603;
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(IIII)V")
	@Override
	public void method5459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass216_1.method5659(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!hk;")
	public Interface3 method2437(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface3) (this.aBoolean208 ? new Class33_Sub2(this, arg0, arg1, false) : new Class19_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([IIIII)Lclient!kb;")
	@Override
	public Class52 method5409(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class52_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!mk;)V")
	@Override
	public void method5467(@OriginalArg(0) Class70 arg0) {
		this.aClass70_Sub2_2 = (Class70_Sub2) arg0;
		this.aClass70_Sub2_1.method3725(this.aClass70_Sub2_2);
		if (this.anInt2633 != 1) {
			this.method2410();
		}
	}

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "(I)V")
	public void method2438() {
		this.method2432(-2, true);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method5429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2442();
		this.method2403(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "()I")
	private int method2439() {
		@Pc(1) int local1 = 0;
		this.aString183 = this.anOpengl2.glGetString(7936);
		this.aString184 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString183.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static201.method3708(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static281.method4414(local53[0]);
				@Pc(69) int local69 = Static281.method4414(local53[1]);
				this.anInt2621 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt2621 < 12) {
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
		this.anInt2615 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt2620 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt2625 = local116[0];
		if (this.anInt2615 < 2 || this.anInt2620 < 2 || this.anInt2625 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean195 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean208 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean206 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean189 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean193 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean200 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean191 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean203 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean199 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean185 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean207 = false;
		this.aBoolean197 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5482(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "()V")
	private void method2440() {
		Static115.aFloatArray7[0] = this.aFloat39 * this.aFloat31;
		Static115.aFloatArray7[1] = this.aFloat39 * this.aFloat38;
		Static115.aFloatArray7[2] = this.aFloat39 * this.aFloat23;
		Static115.aFloatArray7[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static115.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method5469(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)[I")
	@Override
	public int[] method5406() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt2603 - local6, 36, 1, 32993, this.anInt2640, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!hd", name = "fb", descriptor = "()V")
	public void method2441() {
		if (this.anInt2631 == 2) {
			return;
		}
		this.method2395();
		this.method2436(false);
		this.method2407(false);
		this.method2414(false);
		this.method2424(false);
		this.method2438();
		this.anInt2631 = 2;
	}

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "()I")
	@Override
	public int method5419() {
		return 4;
	}

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "()I")
	@Override
	public int method5423() {
		return this.anInt2606 + this.anInt2600 + this.anInt2605;
	}

	@OriginalMember(owner = "client!hd", name = "gb", descriptor = "()V")
	private void method2442() {
		if (this.anInt2631 == 1) {
			return;
		}
		this.method2395();
		this.method2436(false);
		this.method2407(false);
		this.method2414(false);
		this.method2424(false);
		this.method2445(null);
		this.method2438();
		this.method2425(0);
		this.anInt2631 = 1;
	}

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "()Z")
	@Override
	public boolean method5473() {
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "()Z")
	@Override
	public boolean method5445() {
		return this.aClass67_1.method1580();
	}

	@OriginalMember(owner = "client!hd", name = "hb", descriptor = "()V")
	private void method2443() {
		this.method2438();
		for (@Pc(7) int local7 = this.anInt2615 - 1; local7 >= 0; local7--) {
			this.method2433(local7);
			this.method2445(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method2419(8448, 8448);
		this.method2392(2, 34168, 770);
		this.method2418();
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt2618 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean192 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean196 = true;
		this.method2436(true);
		this.method2407(true);
		this.method2414(true);
		this.method2424(true);
		this.method2449();
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
		this.anInt2612 = this.anInt2617 = -1;
		this.method5425();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ui;)V")
	public void method2444(@OriginalArg(0) Interface9 arg0) {
		if (this.lb != arg0 && this.aBoolean208) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method5710());
			this.lb = arg0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Lclient!i;")
	@Override
	public Class7_Sub14 method5389() {
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!vd;)V")
	public void method2445(@OriginalArg(0) Class92 arg0) {
		@Pc(5) Class92 local5 = this.aClass92Array1[this.anInt2608];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt3876);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt3876);
				} else if (arg0.anInt3876 != local5.anInt3876) {
					this.anOpengl2.glDisable(local5.anInt3876);
					this.anOpengl2.glEnable(arg0.anInt3876);
				}
				this.anOpengl2.glBindTexture(arg0.anInt3876, arg0.method3525());
			}
			this.aClass92Array1[this.anInt2608] = arg0;
		}
		this.anInt2631 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "()F")
	@Override
	public float method5478() {
		return this.aFloat34;
	}

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "()V")
	private void method2446() {
		this.aFloat32 = (this.aFloatArray11[14] - (float) this.anInt2630) / this.aFloatArray11[10];
		this.aFloat42 = (float) this.anInt2630 - this.aFloat34;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	@Override
	public void method5420(@OriginalArg(0) int arg0) {
		this.method2405();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(F)V")
	@Override
	public void method5456(@OriginalArg(0) float arg0) {
		if (this.aFloat39 != arg0) {
			this.aFloat39 = arg0;
			this.method2440();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lclient!sj;Lclient!bg;Lclient!mk;[Lclient!mo;I)V")
	@Override
	public void method5428(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class36_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method5472(arg0, arg2, arg3, arg4);
		this.method5422(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!dr;Z)Lclient!kb;")
	@Override
	public Class52 method5411(@OriginalArg(0) Class56 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt1621 * arg0.anInt1622];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray21 == null) {
			for (local15 = 0; local15 < arg0.anInt1622; local15++) {
				for (local21 = 0; local21 < arg0.anInt1621; local21++) {
					@Pc(74) int local74 = arg0.anIntArray234[arg0.aByteArray20[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt1622; local15++) {
				for (local21 = 0; local21 < arg0.anInt1621; local21++) {
					local6[local10++] = arg0.aByteArray21[local8] << 24 | arg0.anIntArray234[arg0.aByteArray20[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class52 local100 = this.method5409(local6, arg0.anInt1621, arg0.anInt1621, arg0.anInt1622);
		local100.method4139(arg0.anInt1618, arg0.anInt1620, arg0.anInt1617, arg0.anInt1619);
		return local100;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!hf;)V")
	public void method2447(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt2604 < 0 || this.anInterface2Array1[this.anInt2604] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array1[this.anInt2604--] = null;
		arg0.method2390();
		if (this.anInt2604 >= 0) {
			this.anInterface2_1 = this.anInterface2Array1[this.anInt2604];
			this.anInterface2_1.method2389();
		}
	}

	@OriginalMember(owner = "client!hd", name = "jb", descriptor = "()V")
	private void method2448() {
		@Pc(11) float local11 = (float) -this.anInt2619 * this.aFloat40 / (float) this.anInt2614;
		@Pc(23) float local23 = (float) -this.anInt2623 * this.aFloat40 / (float) this.anInt2629;
		@Pc(37) float local37 = (float) (this.anInt2602 - this.anInt2619) * this.aFloat40 / (float) this.anInt2614;
		@Pc(51) float local51 = (float) (this.anInt2603 - this.anInt2623) * this.aFloat40 / (float) this.anInt2629;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt2624 - this.aFloat34), (double) ((float) this.anInt2630 - this.aFloat34));
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "()V")
	public void method2449() {
		if (this.anInt2633 != 0) {
			this.anInt2633 = 0;
			this.anInt2631 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "()V")
	@Override
	protected void method5443() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass216_1.method5656();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method2456();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean182) {
			Static12.method181(true);
			this.aBoolean182 = false;
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(IIII)V")
	@Override
	public void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2636 < arg0) {
			this.anInt2636 = arg0;
		}
		if (this.anInt2609 > arg2) {
			this.anInt2609 = arg2;
		}
		if (this.anInt2639 < arg1) {
			this.anInt2639 = arg1;
		}
		if (this.anInt2634 > arg3) {
			this.anInt2634 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method2409();
		this.method2417();
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2442();
		this.method2403(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIILclient!vj;II)V")
	@Override
	public void method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class64 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class64_Sub2 local2 = (Class64_Sub2) arg5;
		@Pc(5) Class92_Sub4_Sub1 local5 = local2.aClass92_Sub4_Sub1_2;
		this.method2441();
		this.method2445(local2.aClass92_Sub4_Sub1_2);
		this.method2403(1);
		this.method2419(7681, 8448);
		this.method2392(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat54 / (float) local5.anInt3884;
		@Pc(37) float local37 = local5.aFloat53 / (float) local5.anInt3883;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method2392(0, 5890, 768);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II[I[I)Lclient!vj;")
	@Override
	public Class64 method5455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static364.method3729(arg3, arg2, arg1, this, arg0);
	}

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "()V")
	private void method2450() {
		if (this.aFloat34 == 0.0F) {
			this.aFloatArray11[10] = this.aFloat28;
			this.aFloatArray11[14] = this.aFloat35;
		} else {
			@Pc(13) float local13 = this.aFloat30 / (this.aFloat34 + this.aFloat30);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat35 * (1.0F - local13) * (1.0F - local13) / this.aFloat34;
			this.aFloatArray11[10] = this.aFloat28 + local32;
			this.aFloatArray11[14] = this.aFloat35 * local17;
		}
		this.method2446();
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(III)V")
	public void method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!hd", name = "E", descriptor = "()I")
	@Override
	public int method5466() {
		@Pc(2) int local2 = this.anInt2642;
		this.anInt2642 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hd", name = "mb", descriptor = "()Lclient!hf;")
	public Interface2 method2452() {
		return this.anInterface2_1;
	}

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "()Lclient!mk;")
	@Override
	public Class70 method5427() {
		return this.aClass70_7;
	}

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "()Z")
	@Override
	public boolean method5418() {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass70_Sub2_2.aFloat65 * (float) arg0 + this.aClass70_Sub2_2.aFloat64 * (float) arg1 + this.aClass70_Sub2_2.aFloat67 * (float) arg2 + this.aClass70_Sub2_2.aFloat62;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass70_Sub2_2.aFloat65 * (float) arg3 + this.aClass70_Sub2_2.aFloat64 * (float) arg4 + this.aClass70_Sub2_2.aFloat67 * (float) arg5 + this.aClass70_Sub2_2.aFloat62;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt2624 && local55 < (float) this.anInt2624 || !(!(local24 > (float) this.anInt2630) || !(local55 > (float) this.anInt2630))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt2614 * (this.aClass70_Sub2_2.aFloat66 * (float) arg0 + this.aClass70_Sub2_2.aFloat58 * (float) arg1 + this.aClass70_Sub2_2.aFloat59 * (float) arg2 + this.aClass70_Sub2_2.aFloat60) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt2614 * (this.aClass70_Sub2_2.aFloat66 * (float) arg3 + this.aClass70_Sub2_2.aFloat58 * (float) arg4 + this.aClass70_Sub2_2.aFloat59 * (float) arg5 + this.aClass70_Sub2_2.aFloat60) / local55);
		if ((float) local119 < this.aFloat24 && (float) local151 < this.aFloat24 || (float) local119 > this.aFloat26 && (float) local151 > this.aFloat26) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt2629 * (this.aClass70_Sub2_2.aFloat61 * (float) arg0 + this.aClass70_Sub2_2.aFloat56 * (float) arg1 + this.aClass70_Sub2_2.aFloat57 * (float) arg2 + this.aClass70_Sub2_2.aFloat63) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt2629 * (this.aClass70_Sub2_2.aFloat61 * (float) arg3 + this.aClass70_Sub2_2.aFloat56 * (float) arg4 + this.aClass70_Sub2_2.aFloat57 * (float) arg5 + this.aClass70_Sub2_2.aFloat63) / local55);
			return (!((float) local209 < this.aFloat37) || !((float) local241 < this.aFloat37)) && (!((float) local209 > this.aFloat25) || !((float) local241 > this.aFloat25));
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!k;Lclient!k;FLclient!k;)Lclient!k;")
	@Override
	public Class17 method5451(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class17 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean199 && this.aBoolean197) {
			@Pc(11) Class17_Sub1_Sub2 local11 = null;
			@Pc(14) Class17_Sub1 local14 = (Class17_Sub1) arg0;
			@Pc(17) Class17_Sub1 local17 = (Class17_Sub1) arg1;
			@Pc(21) Class92_Sub3 local21 = local14.method1865();
			@Pc(25) Class92_Sub3 local25 = local17.method1865();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt3842 > local25.anInt3842 ? local21.anInt3842 : local25.anInt3842;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class17_Sub1_Sub2) {
					@Pc(52) Class17_Sub1_Sub2 local52 = (Class17_Sub1_Sub2) arg3;
					if (local52.method1867() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class17_Sub1_Sub2(this, local40);
				}
				local11.method1866(local21, arg2, local25);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(F)V")
	public void method2453(@OriginalArg(0) float arg0) {
		if (this.aFloat40 != arg0) {
			this.aFloat40 = arg0;
			if (this.anInt2633 == 3) {
				this.method2448();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "()Z")
	@Override
	public boolean method5476() {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5401() {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFFFFF)V")
	private void method2454(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		@Pc(6) float[] local6 = this.aFloatArray11;
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
		local6[10] = this.aFloat28 = -(arg5 + arg4) / (arg5 - arg4);
		local6[11] = -1.0F;
		local6[12] = 0.0F;
		local6[13] = 0.0F;
		local6[14] = this.aFloat35 = -(local3 * arg5) / (arg5 - arg4);
		local6[15] = 0.0F;
		this.method2450();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "()I")
	@Override
	public int method5388() {
		@Pc(2) int local2 = this.anInt2641;
		this.anInt2641 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "()V")
	@Override
	public void method5450() {
		@Pc(2) int local2 = this.anInt2636;
		@Pc(5) int local5 = this.anInt2609;
		@Pc(8) int local8 = this.anInt2639;
		@Pc(11) int local11 = this.anInt2634;
		this.method5425();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method2449();
		this.method2436(false);
		this.method2407(false);
		this.method2414(false);
		this.method2424(false);
		this.method2445(null);
		this.method2438();
		this.method2425(0);
		this.method2403(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt2602, this.anInt2603, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method5431(local2, local8, local5, local11);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5397(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!mr;IIII)Lclient!sj;")
	@Override
	public Class31 method5475(@OriginalArg(0) Class140 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class31_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "()V")
	private void method2455() {
		if (this.aBoolean183 && this.aBoolean198 | this.anInt2626 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "()Lclient!mk;")
	@Override
	public Class70 method5438() {
		return new Class70_Sub2();
	}

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "()V")
	private void method2456() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!hd", name = "pb", descriptor = "()V")
	private void method2457() {
		@Pc(15) int local15;
		if (this.aBoolean198) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt2627;
		} else {
			this.aFloat43 = (float) (this.anInt2630 - 256) - this.aFloat27;
			this.aFloat29 = this.aFloat43 - (float) this.anInt2626 * this.aFloat41;
			if (this.aFloat29 < (float) this.anInt2624) {
				this.aFloat29 = this.anInt2624;
			}
			this.anOpengl2.glFogf(2915, this.aFloat29);
			this.anOpengl2.glFogf(2916, this.aFloat43);
			local15 = this.anInt2617;
		}
		Static115.aFloatArray7[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static115.aFloatArray7[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static115.aFloatArray7[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static115.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(Z)V")
	public void method2458(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean202) {
			this.aBoolean202 = arg0;
			this.method2422();
		}
	}

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "()V")
	public void method2459() {
		if (this.anInt2633 != 2) {
			this.anInt2633 = 2;
			this.method2397();
			this.method2410();
			this.anInt2631 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(FF)V")
	public void method2460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat41 = arg0;
		this.aFloat27 = arg1;
		if (!this.aBoolean198) {
			this.method2457();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lclient!sj;Lclient!mk;[Lclient!mo;I)V")
	@Override
	public void method5472(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class36_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method1928(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "()V")
	@Override
	public void method5392() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZZ)V")
	public void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt2638) {
			if (arg0 < 0) {
				this.method2418();
				this.method2445(null);
				if (!this.aBoolean198) {
					this.aClass67_1.method1579(arg1, arg2, 0);
				}
			} else {
				@Pc(11) Class92_Sub4 local11 = this.aClass144_1.method3848(arg0);
				@Pc(17) Class18 local17 = this.anInterface6_3.method5614(arg0);
				if (local17.aByte3 == 0 && local17.aByte4 == 0) {
					this.method2418();
				} else {
					@Pc(30) int local30 = local17.aBoolean15 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method2466((float) (this.anInt2599 % local34 * local17.aByte3) / (float) local34, (float) (this.anInt2599 % local34 * local17.aByte4) / (float) local34, 0.0F);
				}
				if (this.aBoolean198) {
					this.aClass67_1.method1579(arg1, arg2, 3);
					this.method2445(local11);
				} else {
					this.aClass67_1.method1579(arg1, arg2, local17.aByte5);
					this.aClass67_1.method1578(local17.aByte6, false);
					if (!this.aClass67_1.method1577(local11)) {
						this.method2445(local11);
					}
				}
			}
			this.anInt2638 = arg0;
		}
		this.anInt2631 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method5461(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class7_Sub10 local16;
		while (!this.aClass74_13.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_13.method1792();
			Static115.anIntArray349[local1++] = (int) local16.aLong232;
			this.anInt2606 -= local16.anInt2111;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static115.anIntArray349, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static115.anIntArray349, 0);
			local1 = 0;
		}
		while (!this.aClass74_14.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_14.method1792();
			Static115.anIntArray349[local1++] = (int) local16.aLong232;
			this.anInt2600 -= local16.anInt2111;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static115.anIntArray349, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static115.anIntArray349, 0);
			local1 = 0;
		}
		while (!this.aClass74_15.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_15.method1792();
			Static115.anIntArray349[local1++] = local16.anInt2111;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static115.anIntArray349, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static115.anIntArray349, 0);
			local1 = 0;
		}
		while (!this.aClass74_16.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_16.method1792();
			Static115.anIntArray349[local1++] = (int) local16.aLong232;
			this.anInt2605 -= local16.anInt2111;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static115.anIntArray349, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static115.anIntArray349, 0);
			local1 = 0;
		}
		while (!this.aClass74_17.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_17.method1792();
			Static115.anIntArray349[local1++] = (int) local16.aLong232;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static115.anIntArray349, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static115.anIntArray349, 0);
		}
		while (!this.aClass74_12.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_12.method1792();
			this.anOpengl2.glDeleteLists((int) local16.aLong232, local16.anInt2111);
		}
		while (!this.aClass74_18.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_18.method1792();
			this.anOpengl2.glDeleteObjectARB(local16.anInt2111);
		}
		while (!this.aClass74_12.method1800()) {
			local16 = (Class7_Sub10) this.aClass74_12.method1792();
			this.anOpengl2.glDeleteLists((int) local16.aLong232, local16.anInt2111);
		}
		if (this.method5423() > 100663296 && Static335.method5308() > this.aLong90 + 60000L) {
			System.gc();
			this.aLong90 = Static335.method5308();
		}
		this.anInt2599 = local5;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!n;)V")
	public void method2462(@OriginalArg(0) Class70_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method3724(), 0);
	}

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "()Z")
	@Override
	public boolean method5441() {
		return this.aClass7_Sub6_Sub1_1.method862();
	}

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "(I)V")
	public synchronized void method2463(@OriginalArg(0) int arg0) {
		@Pc(4) Class7_Sub10 local4 = new Class7_Sub10(arg0);
		this.aClass74_17.method1802(local4);
	}

	@OriginalMember(owner = "client!hd", name = "rb", descriptor = "()V")
	private void method2464() {
		this.anOpengl2.glDepthMask(this.aBoolean205 && this.aBoolean201);
	}

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "()V")
	private void method2465() {
		if (this.anInt2633 != 3) {
			this.anInt2633 = 3;
			this.method2448();
			this.method2410();
			this.anInt2631 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5442(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static39.aFloat12 = arg0;
		Static39.aFloat11 = arg1;
		Static39.aFloat10 = arg2;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(FFF)V")
	private void method2466(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean184) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean184 = true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!i;)V")
	@Override
	public void method5464(@OriginalArg(0) Class7_Sub14 arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(Lclient!rs;)V")
	public void method2467(@OriginalArg(0) Class181 arg0) {
		@Pc(2) Interface3 local2 = arg0.anInterface3_6;
		this.method2423(local2);
		local2.method4545(arg0);
		this.aClass181_15 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "()Z")
	@Override
	public boolean method5484() {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2442();
		this.method2403(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!hf;)V")
	public void method2468(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt2604 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2604 >= 0) {
			this.anInterface2Array1[this.anInt2604].method2390();
		}
		this.anInterface2_1 = this.anInterface2Array1[++this.anInt2604] = arg0;
		this.anInterface2_1.method2389();
	}

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "(I)I")
	public int method2469(@OriginalArg(0) int arg0) {
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
}
