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

@OriginalClass("client!se")
public final class Class122_Sub2 extends Class122 implements Interface3 {

	@OriginalMember(owner = "client!se", name = "F", descriptor = "I")
	public int anInt5609;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "I")
	public int anInt5610;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "I")
	private int anInt5613;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "Lclient!hj;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "I")
	public int anInt5614;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "I")
	public int anInt5615;

	@OriginalMember(owner = "client!se", name = "R", descriptor = "I")
	public int anInt5616;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "Lclient!pk;")
	public Class124_Sub2 aClass124_Sub2_1;

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "Lclient!sd;")
	public Class56_Sub2 aClass56_Sub2_1;

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
	private int anInt5618;

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "Lclient!rd;")
	public Interface8 anInterface8_5;

	@OriginalMember(owner = "client!se", name = "jb", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "I")
	private int anInt5621;

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "F")
	public float lb;

	@OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
	public int anInt5622;

	@OriginalMember(owner = "client!se", name = "tb", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!se", name = "ub", descriptor = "[Z")
	private boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!se", name = "vb", descriptor = "Lclient!pk;")
	public Class124_Sub2 aClass124_Sub2_2;

	@OriginalMember(owner = "client!se", name = "wb", descriptor = "Z")
	private boolean aBoolean354;

	@OriginalMember(owner = "client!se", name = "xb", descriptor = "F")
	public float aFloat53;

	@OriginalMember(owner = "client!se", name = "yb", descriptor = "Lclient!jj;")
	public Class109 aClass109_3;

	@OriginalMember(owner = "client!se", name = "zb", descriptor = "I")
	private int anInt5625;

	@OriginalMember(owner = "client!se", name = "Ab", descriptor = "Lclient!oa;")
	public Class66_Sub1 aClass66_Sub1_4;

	@OriginalMember(owner = "client!se", name = "Bb", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!se", name = "Cb", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!se", name = "Db", descriptor = "Lclient!kr;")
	private Class117 aClass117_16;

	@OriginalMember(owner = "client!se", name = "Eb", descriptor = "Lclient!pk;")
	public Class124_Sub2 aClass124_Sub2_3;

	@OriginalMember(owner = "client!se", name = "Hb", descriptor = "F")
	private float aFloat57;

	@OriginalMember(owner = "client!se", name = "Ib", descriptor = "Lclient!oa;")
	public Class66_Sub1 aClass66_Sub1_5;

	@OriginalMember(owner = "client!se", name = "Jb", descriptor = "Lclient!oa;")
	public Class66_Sub1 aClass66_Sub1_6;

	@OriginalMember(owner = "client!se", name = "Kb", descriptor = "[Lclient!kr;")
	private Class117[] aClass117Array1;

	@OriginalMember(owner = "client!se", name = "Lb", descriptor = "Lclient!pk;")
	public Class124_Sub2 aClass124_Sub2_4;

	@OriginalMember(owner = "client!se", name = "Mb", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!se", name = "Sb", descriptor = "Z")
	public boolean aBoolean357;

	@OriginalMember(owner = "client!se", name = "Tb", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!se", name = "Ub", descriptor = "Lclient!sd;")
	public Class56_Sub2 aClass56_Sub2_2;

	@OriginalMember(owner = "client!se", name = "Vb", descriptor = "Lclient!mp;")
	private Interface6 anInterface6_6;

	@OriginalMember(owner = "client!se", name = "Wb", descriptor = "Lclient!fj;")
	private Class66_Sub1_Sub1 aClass66_Sub1_Sub1_5;

	@OriginalMember(owner = "client!se", name = "Xb", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!se", name = "ac", descriptor = "Z")
	public boolean aBoolean359;

	@OriginalMember(owner = "client!se", name = "bc", descriptor = "I")
	private int anInt5630;

	@OriginalMember(owner = "client!se", name = "cc", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!se", name = "dc", descriptor = "Z")
	private boolean aBoolean361;

	@OriginalMember(owner = "client!se", name = "fc", descriptor = "Ljava/lang/String;")
	private String aString200;

	@OriginalMember(owner = "client!se", name = "gc", descriptor = "Z")
	private boolean aBoolean362;

	@OriginalMember(owner = "client!se", name = "hc", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!se", name = "lc", descriptor = "I")
	private int anInt5634;

	@OriginalMember(owner = "client!se", name = "mc", descriptor = "F")
	private float aFloat61;

	@OriginalMember(owner = "client!se", name = "nc", descriptor = "I")
	private int anInt5635;

	@OriginalMember(owner = "client!se", name = "oc", descriptor = "Lclient!kr;")
	private Class117 aClass117_17;

	@OriginalMember(owner = "client!se", name = "pc", descriptor = "I")
	public int anInt5636;

	@OriginalMember(owner = "client!se", name = "rc", descriptor = "I")
	private int anInt5637;

	@OriginalMember(owner = "client!se", name = "vc", descriptor = "Lclient!pk;")
	public Class124_Sub2 aClass124_Sub2_5;

	@OriginalMember(owner = "client!se", name = "wc", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!se", name = "zc", descriptor = "I")
	private int anInt5640;

	@OriginalMember(owner = "client!se", name = "Ac", descriptor = "F")
	public float aFloat64;

	@OriginalMember(owner = "client!se", name = "Cc", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!se", name = "Dc", descriptor = "Lclient!pk;")
	public Class124_Sub2 aClass124_Sub2_6;

	@OriginalMember(owner = "client!se", name = "Gc", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!se", name = "Jc", descriptor = "Z")
	private boolean aBoolean369;

	@OriginalMember(owner = "client!se", name = "Lc", descriptor = "Z")
	private boolean aBoolean371;

	@OriginalMember(owner = "client!se", name = "Mc", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!se", name = "Qc", descriptor = "Lclient!kr;")
	private Class117 aClass117_18;

	@OriginalMember(owner = "client!se", name = "Rc", descriptor = "Lclient!oi;")
	private Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!se", name = "Uc", descriptor = "Z")
	public boolean aBoolean372;

	@OriginalMember(owner = "client!se", name = "Wc", descriptor = "Z")
	public boolean aBoolean373;

	@OriginalMember(owner = "client!se", name = "Xc", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!se", name = "Zc", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!se", name = "bd", descriptor = "Ljava/lang/String;")
	private String aString201;

	@OriginalMember(owner = "client!se", name = "dd", descriptor = "Z")
	public boolean aBoolean375;

	@OriginalMember(owner = "client!se", name = "ed", descriptor = "Lclient!rd;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!se", name = "fd", descriptor = "[Lclient!gd;")
	private Class66[] aClass66Array1;

	@OriginalMember(owner = "client!se", name = "gd", descriptor = "I")
	private int anInt5651;

	@OriginalMember(owner = "client!se", name = "hd", descriptor = "I")
	private int anInt5652;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "Lclient!nl;")
	private final Class144 aClass144_1 = new Class144();

	@OriginalMember(owner = "client!se", name = "E", descriptor = "Lclient!ug;")
	private final Class56 aClass56_4 = new Class56_Sub2();

	@OriginalMember(owner = "client!se", name = "H", descriptor = "I")
	public final int anInt5611 = 3;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "[Lclient!hj;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!se", name = "J", descriptor = "Z")
	private boolean aBoolean349 = false;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "I")
	public final int anInt5612 = 8;

	@OriginalMember(owner = "client!se", name = "S", descriptor = "I")
	private int anInt5617 = -1;

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "Lclient!m;")
	private final Class127 aClass127_31 = new Class127();

	@OriginalMember(owner = "client!se", name = "T", descriptor = "Lclient!m;")
	private final Class127 aClass127_32 = new Class127();

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Lclient!m;")
	private final Class127 aClass127_33 = new Class127();

	@OriginalMember(owner = "client!se", name = "V", descriptor = "Lclient!m;")
	private final Class127 aClass127_34 = new Class127();

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Lclient!m;")
	private final Class127 aClass127_35 = new Class127();

	@OriginalMember(owner = "client!se", name = "X", descriptor = "Lclient!m;")
	private final Class127 aClass127_36 = new Class127();

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Lclient!m;")
	private final Class127 aClass127_37 = new Class127();

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "I")
	public int anInt5619 = 3584;

	@OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
	public int anInt5623 = 512;

	@OriginalMember(owner = "client!se", name = "sb", descriptor = "F")
	private float aFloat52 = 1.0F;

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "[F")
	public final float[] aFloatArray26 = new float[4];

	@OriginalMember(owner = "client!se", name = "Zb", descriptor = "I")
	public int anInt5629 = 50;

	@OriginalMember(owner = "client!se", name = "Qb", descriptor = "I")
	private int anInt5627 = 0;

	@OriginalMember(owner = "client!se", name = "Fb", descriptor = "I")
	private int anInt5626 = 0;

	@OriginalMember(owner = "client!se", name = "ec", descriptor = "[F")
	private final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!se", name = "jc", descriptor = "I")
	public int anInt5632 = -1;

	@OriginalMember(owner = "client!se", name = "nb", descriptor = "F")
	public float aFloat50 = 3584.0F;

	@OriginalMember(owner = "client!se", name = "kc", descriptor = "I")
	public int anInt5633 = -1;

	@OriginalMember(owner = "client!se", name = "rb", descriptor = "I")
	private int anInt5624 = 0;

	@OriginalMember(owner = "client!se", name = "Bc", descriptor = "I")
	private int anInt5641 = 0;

	@OriginalMember(owner = "client!se", name = "ic", descriptor = "I")
	private int anInt5631 = 0;

	@OriginalMember(owner = "client!se", name = "uc", descriptor = "I")
	public int anInt5639 = 512;

	@OriginalMember(owner = "client!se", name = "Rb", descriptor = "F")
	public float aFloat59 = 1.0F;

	@OriginalMember(owner = "client!se", name = "Gb", descriptor = "F")
	public float aFloat56 = -1.0F;

	@OriginalMember(owner = "client!se", name = "Yb", descriptor = "F")
	public float aFloat60 = 3584.0F;

	@OriginalMember(owner = "client!se", name = "qb", descriptor = "F")
	private float aFloat51 = 1.0F;

	@OriginalMember(owner = "client!se", name = "tc", descriptor = "F")
	public float aFloat62 = -1.0F;

	@OriginalMember(owner = "client!se", name = "Ec", descriptor = "[F")
	private final float[] aFloatArray29 = new float[16];

	@OriginalMember(owner = "client!se", name = "yc", descriptor = "Z")
	private boolean aBoolean366 = true;

	@OriginalMember(owner = "client!se", name = "Nc", descriptor = "I")
	private int anInt5644 = 8448;

	@OriginalMember(owner = "client!se", name = "Tc", descriptor = "I")
	private int anInt5647 = 0;

	@OriginalMember(owner = "client!se", name = "Sc", descriptor = "F")
	private float aFloat67 = 0.0F;

	@OriginalMember(owner = "client!se", name = "Ic", descriptor = "I")
	public int anInt5643 = 0;

	@OriginalMember(owner = "client!se", name = "Pb", descriptor = "[F")
	private final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!se", name = "xc", descriptor = "F")
	public float aFloat63 = 1.0F;

	@OriginalMember(owner = "client!se", name = "ad", descriptor = "I")
	private int anInt5649 = 8448;

	@OriginalMember(owner = "client!se", name = "Yc", descriptor = "F")
	public float aFloat68 = 1.0F;

	@OriginalMember(owner = "client!se", name = "Vc", descriptor = "I")
	private int anInt5648 = -1;

	@OriginalMember(owner = "client!se", name = "Oc", descriptor = "I")
	public int anInt5645 = -1;

	@OriginalMember(owner = "client!se", name = "cd", descriptor = "I")
	public int anInt5650 = 0;

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "[F")
	private final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!se", name = "Pc", descriptor = "I")
	private int anInt5646 = 0;

	@OriginalMember(owner = "client!se", name = "sc", descriptor = "I")
	private int anInt5638 = -1;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Lclient!wh;")
	public final Interface9 anInterface9_5;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Lclient!jaggl/context;")
	private context aContext1;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!jaggl/opengl;")
	public opengl anOpengl2;

	@OriginalMember(owner = "client!se", name = "Fc", descriptor = "I")
	public final int anInt5642;

	@OriginalMember(owner = "client!se", name = "Kc", descriptor = "Z")
	private boolean aBoolean370;

	@OriginalMember(owner = "client!se", name = "qc", descriptor = "Z")
	public boolean aBoolean364;

	@OriginalMember(owner = "client!se", name = "Ob", descriptor = "Z")
	public boolean aBoolean356;

	@OriginalMember(owner = "client!se", name = "Hc", descriptor = "Z")
	private boolean aBoolean368;

	@OriginalMember(owner = "client!se", name = "Nb", descriptor = "Z")
	public boolean aBoolean355;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "Lclient!iq;")
	public final Class99 aClass99_1;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "Lclient!cd;")
	public final Class29 aClass29_1;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Lclient!lr;")
	private final Class126 aClass126_1;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "Lclient!sp;")
	private final Class185 aClass185_1;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "Lclient!nj;")
	private final Class3_Sub31_Sub1 aClass3_Sub31_Sub1_1;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!wh;IILclient!de;)V")
	public Class122_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class42 arg4) {
		this.aCanvas3 = arg0;
		this.anInterface9_5 = arg1;
		this.anInt5595 = arg2;
		@Pc(186) int local186 = 0;
		while (!this.aCanvas3.isShowing()) {
			if (local186++ > 5) {
				throw new RuntimeException("");
			}
			Static134.method2241(1000L);
		}
		this.aCanvas3.setIgnoreRepaint(true);
		try {
			if (!Static282.aBoolean348) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static282.aBoolean348 = Boolean.TRUE;
				} else {
					@Pc(218) Class207 local218 = arg4.method977(this.getClass());
					while (local218.anInt6346 == 0) {
						Static134.method2241(100L);
					}
					if (local218.anInt6346 == 1) {
						Static282.aBoolean348 = Boolean.TRUE;
					}
				}
			}
			if (!Static282.aBoolean348) {
				throw new RuntimeException("");
			}
			this.aContext1 = new context();
			if (!this.aContext1.choosePixelFormat(this.aCanvas3, arg3, 0)) {
				throw new RuntimeException("");
			} else if (this.aContext1.createContext()) {
				this.method4822();
				this.anOpengl2 = this.aContext1.getGL();
				@Pc(283) int local283 = this.method4867();
				if (local283 != 0) {
					throw new RuntimeException("");
				}
				this.anInt5642 = this.aBoolean363 ? 33639 : 5121;
				@Pc(302) String local302 = this.aString200.toLowerCase();
				@Pc(306) String local306 = this.aString201.toLowerCase();
				if (local306.indexOf("radeon") != -1) {
					@Pc(313) int local313 = 0;
					@Pc(315) boolean local315 = false;
					@Pc(317) boolean local317 = false;
					@Pc(325) String[] local325 = Static159.method2528(' ', local306.replace('/', ' '));
					for (@Pc(327) int local327 = 0; local327 < local325.length; local327++) {
						@Pc(335) String local335 = local325[local327];
						if (local335.charAt(0) == 'x' && local335.length() >= 3 && Static106.method1818(local335.substring(1, 3))) {
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
							if (local335.length() >= 4 && Static106.method1818(local335.substring(0, 4))) {
								local313 = Static261.method4403(local335.substring(0, 4));
								break;
							}
						}
					}
					if (!local317 && !local315) {
						if (local313 >= 7000 && local313 <= 7999) {
							this.aBoolean370 = false;
						}
						if (local313 >= 7000 && local313 <= 9250) {
							this.aBoolean364 = false;
						}
					}
					if (!local315 || local313 < 4000) {
						this.aBoolean356 = false;
					}
					this.aBoolean368 = this.aBoolean370;
				}
				if (local302.contains("intel")) {
					this.aBoolean355 = false;
				}
				if (this.aBoolean370) {
					try {
						@Pc(442) int[] local442 = new int[1];
						this.anOpengl2.glGenBuffersARB(1, local442, 0);
					} catch (@Pc(450) Throwable local450) {
						throw new RuntimeException("", local450);
					}
				}
				this.method4833(this);
				this.method4802();
				this.method4849();
				this.aClass99_1 = new Class99(this);
				this.aClass29_1 = new Class29(this, this.anInterface9_5);
				Static88.method1409(true);
				this.aBoolean349 = true;
				this.aClass126_1 = new Class126(this);
				this.aClass185_1 = new Class185(this);
				this.aClass3_Sub31_Sub1_1 = new Class3_Sub31_Sub1(this);
				this.method4847();
				this.anOpengl2.glClear(16640);
				local186 = 0;
				while (true) {
					try {
						this.aContext1.swapBuffers();
						break;
					} catch (@Pc(516) Exception local516) {
						if (local186++ > 5) {
							throw new RuntimeException("");
						}
						Static134.method2241(100L);
					}
				}
				this.anOpengl2.glClear(16384);
			} else {
				throw new RuntimeException("");
			}
		} catch (@Pc(535) Throwable local535) {
			local535.printStackTrace();
			this.method4740();
			throw new RuntimeException("OpenGL toolkit initialisation failed", local535);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([Lclient!qb;Lclient!ai;Lclient!ug;[Lclient!aj;I)V")
	@Override
	public void method4741(@OriginalArg(0) Class124[] arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class8_Sub2[] arg3, @OriginalArg(4) int arg4) {
		this.method4761(arg0, arg2, arg3, arg4);
		this.method4721(arg1);
	}

	@OriginalMember(owner = "client!se", name = "D", descriptor = "()I")
	@Override
	public int method4776() {
		return this.anInt5619;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ai;)V")
	@Override
	public void method4721(@OriginalArg(0) Class9 arg0) {
		this.aClass144_1.method3722(this, arg0);
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(I)I")
	public int method4809(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!se", name = "v", descriptor = "()Z")
	@Override
	public boolean method4750() {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!vn;[Lclient!ok;Z)Lclient!os;")
	@Override
	public Class120 method4727(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class149[] arg1) {
		return new Class120_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
	@Override
	public void method4705(@OriginalArg(0) boolean arg0) {
		this.aBoolean366 = arg0;
		this.method4812();
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(I)V")
	public void method4810() {
		this.method4843(-2, true);
	}

	@OriginalMember(owner = "client!se", name = "j", descriptor = "(I)V")
	public void method4811(@OriginalArg(0) int arg0) {
		if (this.anInt5630 != arg0) {
			this.anOpengl2.glActiveTexture(arg0 + 33984);
			this.anInt5630 = arg0;
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(Z)V")
	@Override
	public void method4803(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "()Z")
	@Override
	public boolean method4710() {
		return this.aClass3_Sub31_Sub1_1.method3719();
	}

	@OriginalMember(owner = "client!se", name = "M", descriptor = "()V")
	private void method4812() {
		this.anOpengl2.glDepthMask(this.aBoolean350 && this.aBoolean366);
	}

	@OriginalMember(owner = "client!se", name = "k", descriptor = "(I)V")
	public synchronized void method4813(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub22 local4 = new Class3_Sub22(arg0);
		this.aClass127_37.method3387(local4);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!dc;)V")
	@Override
	public void method4792(@OriginalArg(0) Class3_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!se", name = "B", descriptor = "()Z")
	@Override
	public boolean method4769() {
		if (!this.aClass3_Sub31_Sub1_1.method3715()) {
			if (!this.aClass185_1.method4960(this.aClass3_Sub31_Sub1_1)) {
				return false;
			}
			this.aClass29_1.method682();
		}
		return true;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(II)V")
	public synchronized void method4814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub22 local4 = new Class3_Sub22(arg1);
		local4.aLong211 = arg0;
		this.aClass127_34.method3387(local4);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
	public void method4815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34176, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qb;Lclient!ai;Lclient!ug;Lclient!aj;I)V")
	@Override
	public void method4756(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) Class8_Sub2 arg3) {
		arg0.method4079(arg2, arg3, 0);
		this.method4721(arg1);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(7) boolean local7 = this.anInt5638 != arg0;
		if (local7 || this.aFloat56 != arg1 || this.aFloat62 != arg2) {
			this.anInt5638 = arg0;
			this.aFloat56 = arg1;
			this.aFloat62 = arg2;
			if (local7) {
				this.aFloat59 = (float) (this.anInt5638 & 0xFF0000) / 1.671168E7F;
				this.aFloat63 = (float) (this.anInt5638 & 0xFFFF) / 65535.0F;
				this.aFloat68 = (float) (this.anInt5638 & 0xFF) / 255.0F;
				this.method4886();
			}
			this.method4821();
		}
		if (this.aFloatArray27[0] == arg3 && this.aFloatArray27[1] == arg4 && this.aFloatArray27[2] == arg5) {
			return;
		}
		this.aFloatArray27[0] = arg3;
		this.aFloatArray27[1] = arg4;
		this.aFloatArray27[2] = arg5;
		this.aFloatArray25[0] = -arg3;
		this.aFloatArray25[1] = -arg4;
		this.aFloatArray25[2] = -arg5;
		@Pc(132) float local132 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray26[0] = arg3 * local132;
		this.aFloatArray26[1] = arg4 * local132;
		this.aFloatArray26[2] = arg5 * local132;
		this.aFloatArray28[0] = -this.aFloatArray26[0];
		this.aFloatArray28[1] = -this.aFloatArray26[1];
		this.aFloatArray28[2] = -this.aFloatArray26[2];
		this.method4824();
		this.anInt5620 = (int) (arg3 * 256.0F / arg4);
		this.anInt5636 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!se", name = "k", descriptor = "()Z")
	@Override
	public boolean method4730() {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(III)V")
	public void method4816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glTexEnvi(8960, arg0 + 34184, arg1);
		this.anOpengl2.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!se", name = "u", descriptor = "()Z")
	@Override
	public boolean method4748() {
		return Static59.aString40 == null || !Static59.aString40.startsWith("mac");
	}

	@OriginalMember(owner = "client!se", name = "N", descriptor = "()V")
	public void method4817() {
		if (this.anInt5628 == 4) {
			return;
		}
		this.method4818();
		this.method4852(false);
		this.method4880(false);
		this.method4871(false);
		this.method4841(false);
		this.method4810();
		this.method4882(1);
		this.method4859(1);
		this.anInt5628 = 4;
	}

	@OriginalMember(owner = "client!se", name = "O", descriptor = "()V")
	private void method4818() {
		if (this.anInt5635 == 1) {
			return;
		}
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, (double) this.anInt5609, (double) this.anInt5614, 0.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anInt5635 = 1;
		this.anInt5628 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFF)V")
	private void method4819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(3) float local3 = arg4 * 2.0F;
		@Pc(6) float[] local6 = this.aFloatArray29;
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
		local6[10] = this.aFloat61 = -(arg5 + arg4) / (arg5 - arg4);
		local6[11] = -1.0F;
		local6[12] = 0.0F;
		local6[13] = 0.0F;
		local6[14] = this.aFloat65 = -(local3 * arg5) / (arg5 - arg4);
		local6[15] = 0.0F;
		this.method4876();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ke;)V")
	@Override
	public void method4706(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub1_1 = (Class113_Sub1) arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4726(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = arg0 & Integer.MAX_VALUE;
		@Pc(16) Class3_Sub22 local16;
		while (!this.aClass127_32.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_32.method3396();
			Static282.anIntArray448[local1++] = (int) local16.aLong211;
			this.anInt5616 -= local16.anInt2181;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteBuffersARB(local1, Static282.anIntArray448, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteBuffersARB(local1, Static282.anIntArray448, 0);
			local1 = 0;
		}
		while (!this.aClass127_33.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_33.method3396();
			Static282.anIntArray448[local1++] = (int) local16.aLong211;
			this.anInt5615 -= local16.anInt2181;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteTextures(local1, Static282.anIntArray448, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteTextures(local1, Static282.anIntArray448, 0);
			local1 = 0;
		}
		while (!this.aClass127_34.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_34.method3396();
			Static282.anIntArray448[local1++] = local16.anInt2181;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteFramebuffersEXT(local1, Static282.anIntArray448, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteFramebuffersEXT(local1, Static282.anIntArray448, 0);
			local1 = 0;
		}
		while (!this.aClass127_35.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_35.method3396();
			Static282.anIntArray448[local1++] = (int) local16.aLong211;
			this.anInt5613 -= local16.anInt2181;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static282.anIntArray448, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteRenderbuffersEXT(local1, Static282.anIntArray448, 0);
			local1 = 0;
		}
		while (!this.aClass127_36.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_36.method3396();
			Static282.anIntArray448[local1++] = (int) local16.aLong211;
			if (local1 == 1000) {
				this.anOpengl2.glDeleteProgramsARB(local1, Static282.anIntArray448, 0);
				local1 = 0;
			}
		}
		if (local1 > 0) {
			this.anOpengl2.glDeleteProgramsARB(local1, Static282.anIntArray448, 0);
		}
		while (!this.aClass127_31.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_31.method3396();
			this.anOpengl2.glDeleteLists((int) local16.aLong211, local16.anInt2181);
		}
		while (!this.aClass127_37.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_37.method3396();
			this.anOpengl2.glDeleteObjectARB(local16.anInt2181);
		}
		while (!this.aClass127_31.method3390()) {
			local16 = (Class3_Sub22) this.aClass127_31.method3396();
			this.anOpengl2.glDeleteLists((int) local16.aLong211, local16.anInt2181);
		}
		if (this.method4707() > 100663296 && Static53.method898() > this.aLong179 + 60000L) {
			System.gc();
			this.aLong179 = Static53.method898();
		}
		this.anInt5610 = local5;
	}

	@OriginalMember(owner = "client!se", name = "P", descriptor = "()V")
	public void method4820() {
		if (this.anInt5628 == 8) {
			return;
		}
		this.method4854();
		this.method4852(true);
		this.method4871(true);
		this.method4841(true);
		this.method4882(1);
		this.method4859(1);
		this.anInt5628 = 8;
	}

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "()V")
	private void method4821() {
		Static282.aFloatArray23[0] = this.aFloat56 * this.aFloat59;
		Static282.aFloatArray23[1] = this.aFloat56 * this.aFloat63;
		Static282.aFloatArray23[2] = this.aFloat56 * this.aFloat68;
		Static282.aFloatArray23[3] = 1.0F;
		this.anOpengl2.glLightfv(16384, 4609, Static282.aFloatArray23, 0);
		Static282.aFloatArray23[0] = -this.aFloat62 * this.aFloat59;
		Static282.aFloatArray23[1] = -this.aFloat62 * this.aFloat63;
		Static282.aFloatArray23[2] = -this.aFloat62 * this.aFloat68;
		Static282.aFloatArray23[3] = 1.0F;
		this.anOpengl2.glLightfv(16385, 4609, Static282.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
	@Override
	public void method4796(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5631;
		arg0[1] = this.anInt5646;
		arg0[2] = this.anInt5624;
		arg0[3] = this.anInt5626;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)Z")
	@Override
	public boolean method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass56_Sub2_1.aFloat45 * (float) arg0 + this.aClass56_Sub2_1.aFloat41 * (float) arg1 + this.aClass56_Sub2_1.aFloat40 * (float) arg2 + this.aClass56_Sub2_1.aFloat42;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass56_Sub2_1.aFloat45 * (float) arg3 + this.aClass56_Sub2_1.aFloat41 * (float) arg4 + this.aClass56_Sub2_1.aFloat40 * (float) arg5 + this.aClass56_Sub2_1.aFloat42;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt5629 && local55 < (float) this.anInt5629 || !(!(local24 > (float) this.anInt5619) || !(local55 > (float) this.anInt5619))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt5639 * (this.aClass56_Sub2_1.aFloat39 * (float) arg0 + this.aClass56_Sub2_1.aFloat48 * (float) arg1 + this.aClass56_Sub2_1.aFloat43 * (float) arg2 + this.aClass56_Sub2_1.aFloat46) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt5639 * (this.aClass56_Sub2_1.aFloat39 * (float) arg3 + this.aClass56_Sub2_1.aFloat48 * (float) arg4 + this.aClass56_Sub2_1.aFloat43 * (float) arg5 + this.aClass56_Sub2_1.aFloat46) / local55);
		if ((float) local119 < this.aFloat54 && (float) local151 < this.aFloat54 || (float) local119 > this.aFloat58 && (float) local151 > this.aFloat58) {
			return false;
		} else {
			@Pc(209) int local209 = (int) ((float) this.anInt5623 * (this.aClass56_Sub2_1.aFloat47 * (float) arg0 + this.aClass56_Sub2_1.aFloat38 * (float) arg1 + this.aClass56_Sub2_1.aFloat37 * (float) arg2 + this.aClass56_Sub2_1.aFloat44) / local24);
			@Pc(241) int local241 = (int) ((float) this.anInt5623 * (this.aClass56_Sub2_1.aFloat47 * (float) arg3 + this.aClass56_Sub2_1.aFloat38 * (float) arg4 + this.aClass56_Sub2_1.aFloat37 * (float) arg5 + this.aClass56_Sub2_1.aFloat44) / local55);
			return (!((float) local209 < this.lb) || !((float) local241 < this.lb)) && (!((float) local209 > this.aFloat55) || !((float) local241 > this.aFloat55));
		}
	}

	@OriginalMember(owner = "client!se", name = "R", descriptor = "()V")
	private void method4822() {
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
			Static134.method2241(1000L);
		}
	}

	@OriginalMember(owner = "client!se", name = "J", descriptor = "()I")
	@Override
	public int method4800() {
		return 4;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(FFF)V")
	private void method4823(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		this.anOpengl2.glMatrixMode(5890);
		if (this.aBoolean371) {
			this.anOpengl2.glLoadIdentity();
		}
		this.anOpengl2.glTranslatef(arg0, arg1, arg2);
		this.anOpengl2.glMatrixMode(5888);
		this.aBoolean371 = true;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg2 > this.anInt5609) {
			arg2 = this.anInt5609;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt5614) {
			arg3 = this.anInt5614;
		}
		this.anInt5631 = arg0;
		this.anInt5646 = arg1;
		this.anInt5624 = arg2;
		this.anInt5626 = arg3;
		this.anOpengl2.glEnable(3089);
		this.method4875();
		this.method4861();
	}

	@OriginalMember(owner = "client!se", name = "S", descriptor = "()V")
	public void method4824() {
		this.anOpengl2.glLightfv(16384, 4611, this.aFloatArray27, 0);
		this.anOpengl2.glLightfv(16385, 4611, this.aFloatArray25, 0);
	}

	@OriginalMember(owner = "client!se", name = "r", descriptor = "()Lclient!ug;")
	@Override
	public Class56 method4743() {
		return new Class56_Sub2();
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(II)V")
	public void method4825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5641 = arg0;
		this.anInt5627 = arg1;
		this.anOpengl2.glViewport(arg0, arg1, this.anInt5609, this.anInt5614);
		this.method4861();
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "()Z")
	@Override
	public boolean method4720() {
		return this.aBoolean369;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4749(@OriginalArg(0) Canvas arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FF)V")
	@Override
	public void method4744(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat64 && arg1 == this.aFloat53) {
			return;
		}
		this.aFloat64 = arg0;
		this.aFloat53 = arg1;
		this.method4876();
		this.method4826();
		if (this.anInt5635 == 3) {
			this.method4856();
		} else if (this.anInt5635 == 2) {
			this.method4850();
		}
	}

	@OriginalMember(owner = "client!se", name = "T", descriptor = "()V")
	private void method4826() {
		this.aFloat60 = (this.aFloatArray29[14] - (float) this.anInt5619) / this.aFloatArray29[10];
		this.aFloat50 = (float) this.anInt5619 - this.aFloat53;
	}

	@OriginalMember(owner = "client!se", name = "z", descriptor = "()V")
	@Override
	public void method4764() {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[Lclient!dn;)V")
	@Override
	public void method4742(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub13[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg0; local1++) {
			@Pc(8) Class3_Sub13 local8 = arg1[local1];
			@Pc(12) int local12 = local1 + 16386;
			Static282.aFloatArray24[0] = local8.anInt6662;
			Static282.aFloatArray24[1] = local8.anInt6667;
			Static282.aFloatArray24[2] = local8.anInt6666;
			Static282.aFloatArray24[3] = 1.0F;
			this.anOpengl2.glLightfv(local12, 4611, Static282.aFloatArray24, 0);
			@Pc(44) int local44 = local8.anInt6665;
			@Pc(49) float local49 = local8.aFloat77 / 255.0F;
			Static282.aFloatArray24[0] = (float) (local44 >> 16 & 0xFF) * local49;
			Static282.aFloatArray24[1] = (float) (local44 >> 8 & 0xFF) * local49;
			Static282.aFloatArray24[2] = (float) (local44 & 0xFF) * local49;
			this.anOpengl2.glLightfv(local12, 4609, Static282.aFloatArray24, 0);
			this.anOpengl2.glLightf(local12, 4617, 1.0F / (float) (local8.anInt6661 * local8.anInt6661));
			this.anOpengl2.glEnable(local12);
		}
		while (local1 < this.anInt5647) {
			this.anOpengl2.glDisable(local1 + 16386);
			local1++;
		}
		this.anInt5647 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(II)I")
	@Override
	public int method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!se", name = "x", descriptor = "()V")
	@Override
	public void method4755() {
		this.aClass126_1.method3377(false, false, 0);
		this.aBoolean359 = false;
		this.method4863();
		this.method4884();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!kr;)V")
	public void method4827(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1) {
		@Pc(2) Interface6 local2 = arg1.anInterface6_2;
		this.method4862(local2);
		local2.method3005(arg0, arg1);
		this.aClass117Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(IIIII)V")
	@Override
	protected void method4788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(II)V")
	public synchronized void method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub22 local4 = new Class3_Sub22(arg1);
		local4.aLong211 = arg0;
		this.aClass127_32.method3387(local4);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!rd;)V")
	public void method4829(@OriginalArg(0) Interface8 arg0) {
		if (this.anInterface8_6 != arg0 && this.aBoolean370) {
			this.anOpengl2.glBindBufferARB(34963, arg0.method5253());
			this.anInterface8_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!se", name = "A", descriptor = "()Z")
	@Override
	public boolean method4767() {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "()Z")
	@Override
	public boolean method4715() {
		return this.aClass126_1.method3375();
	}

	@OriginalMember(owner = "client!se", name = "U", descriptor = "()V")
	public void method4830() {
		this.anOpengl2.glPopMatrix();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BIZ)Lclient!rd;")
	public Interface8 method4831(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		return (Interface8) (this.aBoolean370 && (!arg2 || this.aBoolean368) ? new Class121_Sub2(this, 5123, arg0, arg1, arg2) : new Class63_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIIII)Lclient!ke;")
	@Override
	public Class113 method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean352 ? new Class113_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!se", name = "E", descriptor = "()V")
	@Override
	public void method4777() {
		this.method4841(true);
		this.anOpengl2.glClear(256);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!kr;)V")
	public void method4832(@OriginalArg(0) Class117 arg0) {
		@Pc(2) Interface6 local2 = arg0.anInterface6_2;
		this.method4862(local2);
		local2.method3001(arg0);
		this.aClass117_16 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!hj;)V")
	public void method4833(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt5617 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt5617 >= 0) {
			this.anInterface3Array1[this.anInt5617].method4808();
		}
		this.anInterface3_1 = this.anInterface3Array1[++this.anInt5617] = arg0;
		this.anInterface3_1.method4807();
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(III)V")
	public void method4834(@OriginalArg(2) int arg0) {
		this.anOpengl2.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!kr;)V")
	public void method4835(@OriginalArg(0) Class117 arg0) {
		@Pc(2) Interface6 local2 = arg0.anInterface6_2;
		this.method4862(local2);
		local2.method3003(arg0);
		this.aClass117_18 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "t", descriptor = "()Z")
	@Override
	public boolean method4747() {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "V", descriptor = "()Lclient!pi;")
	public Class66_Sub4 method4836() {
		return this.aClass113_Sub1_1 == null ? null : this.aClass113_Sub1_1.method5316();
	}

	@OriginalMember(owner = "client!se", name = "W", descriptor = "()V")
	private void method4837() {
		if (this.aBoolean371) {
			this.anOpengl2.glMatrixMode(5890);
			this.anOpengl2.glLoadIdentity();
			this.anOpengl2.glMatrixMode(5888);
			this.aBoolean371 = false;
		}
	}

	@OriginalMember(owner = "client!se", name = "j", descriptor = "()F")
	@Override
	public float method4722() {
		return this.aFloat64;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
	@Override
	public int method4703() {
		@Pc(2) int local2 = this.anInt5652;
		this.anInt5652 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(Z)V")
	public void method4838(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean361) {
			this.aBoolean361 = arg0;
			this.method4842();
		}
	}

	@OriginalMember(owner = "client!se", name = "l", descriptor = "(I)I")
	public int method4839(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!rd;III)V")
	public void method4840(@OriginalArg(0) Interface8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4829(arg0);
		arg0.method5256(arg1, arg2);
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(Z)V")
	public void method4841(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean350) {
			this.aBoolean350 = arg0;
			this.method4812();
			this.anInt5628 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!se", name = "L", descriptor = "()Z")
	@Override
	public boolean method4804() {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "F", descriptor = "()F")
	@Override
	public float method4778() {
		return this.aFloat53;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
	@Override
	public void method4738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5629 == arg0 && this.anInt5619 == arg1) {
			return;
		}
		this.anInt5629 = arg0;
		this.anInt5619 = arg1;
		this.method4848();
		this.method4826();
		this.method4863();
	}

	@OriginalMember(owner = "client!se", name = "n", descriptor = "()V")
	@Override
	public void method4735() {
		if (this.aClass3_Sub31_Sub1_1.method3715()) {
			this.aClass185_1.method4958(this.aClass3_Sub31_Sub1_1);
			this.aClass29_1.method682();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class57 method4762(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class57_Sub1(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!se", name = "X", descriptor = "()V")
	private void method4842() {
		if (this.aBoolean360 && !this.aBoolean361) {
			this.anOpengl2.glEnable(2896);
		} else {
			this.anOpengl2.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)V")
	public void method4843(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method4868(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "()V")
	private void method4844() {
		try {
			this.aContext1.releaseContext();
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "()V")
	public void method4845() {
		if (this.anInt5628 == 16) {
			return;
		}
		this.method4878();
		this.method4852(true);
		this.method4871(true);
		this.method4841(true);
		this.method4882(1);
		this.method4859(1);
		this.anInt5628 = 16;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!sd;)V")
	public void method4846(@OriginalArg(0) Class56_Sub2 arg0) {
		this.anOpengl2.glPushMatrix();
		this.anOpengl2.glMultMatrixf(arg0.method4699(), 0);
	}

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "()V")
	private void method4847() {
		this.method4810();
		for (@Pc(7) int local7 = this.anInt5622 - 1; local7 >= 0; local7--) {
			this.method4811(local7);
			this.method4864(null);
			this.anOpengl2.glTexEnvi(8960, 8704, 34160);
		}
		this.method4860(8448, 8448);
		this.method4815(2, 34168, 770);
		this.method4837();
		this.anOpengl2.glEnable(3042);
		this.anOpengl2.glBlendFunc(770, 771);
		this.anInt5621 = 1;
		this.anOpengl2.glEnable(3008);
		this.anOpengl2.glAlphaFunc(516, 0.0F);
		this.aBoolean358 = true;
		this.anOpengl2.glColorMask(true, true, true, true);
		this.aBoolean367 = true;
		this.method4852(true);
		this.method4880(true);
		this.method4871(true);
		this.method4841(true);
		this.method4848();
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
		this.anInt5638 = this.anInt5633 = -1;
		this.method4734();
	}

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "()V")
	public void method4848() {
		if (this.anInt5635 != 0) {
			this.anInt5635 = 0;
			this.anInt5628 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
	@Override
	public void method4808() {
	}

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "()V")
	private void method4849() {
		this.aClass56_Sub2_1 = new Class56_Sub2();
		this.aClass56_Sub2_2 = new Class56_Sub2();
		this.aClass66Array1 = new Class66[this.anInt5622];
		this.aBooleanArray27 = new boolean[this.anInt5634];
		this.aClass117Array1 = new Class117[this.anInt5634];
		this.aClass66_Sub1_6 = new Class66_Sub1(this, 3553, 6408, 1, 1);
		this.aClass66_Sub1_4 = new Class66_Sub1(this, 3553, 6408, 1, 1);
		this.aClass66_Sub1_5 = new Class66_Sub1(this, 3553, 6408, 1, 1);
		this.aClass124_Sub2_1 = new Class124_Sub2(this);
		this.aClass124_Sub2_4 = new Class124_Sub2(this);
		this.aClass124_Sub2_3 = new Class124_Sub2(this);
		this.aClass124_Sub2_5 = new Class124_Sub2(this);
		this.aClass124_Sub2_6 = new Class124_Sub2(this);
		this.aClass124_Sub2_2 = new Class124_Sub2(this);
		this.anInterface8_5 = this.method4831(null, 1024, true);
		if (this.aBoolean355) {
			this.aClass109_3 = new Class109(this);
		}
		this.aClass144_1.method3721(this);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	@Override
	public void method4751(@OriginalArg(0) int arg0) {
		this.method4882(0);
		this.anOpengl2.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFFFF) / 65535.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		this.anOpengl2.glClear(16384);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method4806() {
		return this.anInt5614;
	}

	@OriginalMember(owner = "client!se", name = "db", descriptor = "()V")
	private void method4850() {
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadMatrixf(this.aFloatArray29, 0);
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!se", name = "q", descriptor = "()V")
	@Override
	protected void method4740() {
		if (this.anOpengl2 != null) {
			try {
				this.aClass185_1.method4961();
			} catch (@Pc(7) Throwable local7) {
			}
			this.anOpengl2 = null;
		}
		if (this.aContext1 != null) {
			this.method4844();
			try {
				this.aContext1.destroy();
			} catch (@Pc(21) Throwable local21) {
			}
			this.aContext1 = null;
		}
		if (this.aBoolean349) {
			Static85.method1378(true);
			this.aBoolean349 = false;
		}
	}

	@OriginalMember(owner = "client!se", name = "G", descriptor = "()Z")
	@Override
	public boolean method4781() {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(Lclient!kr;)V")
	public void method4851(@OriginalArg(0) Class117 arg0) {
		@Pc(2) Interface6 local2 = arg0.anInterface6_2;
		this.method4862(local2);
		local2.method3002(arg0);
		this.aClass117_17 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "m", descriptor = "()V")
	@Override
	public void method4734() {
		this.anInt5631 = 0;
		this.anInt5646 = 0;
		this.anInt5624 = this.anInt5609;
		this.anInt5626 = this.anInt5614;
		this.anOpengl2.glDisable(3089);
		this.method4875();
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "()I")
	@Override
	public int method4707() {
		return this.anInt5616 + this.anInt5615 + this.anInt5613;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method4732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(14) float local14 = local4 + (float) arg2;
		@Pc(19) float local19 = local9 + (float) arg3;
		this.method4855();
		this.method4882(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean369) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local19);
		this.anOpengl2.glVertex2f(local14, local19);
		this.anOpengl2.glVertex2f(local14, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean369) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anOpengl2.glLineWidth((float) arg5);
		this.method4723(arg0, arg1, arg2, arg3, arg4, 0);
		this.anOpengl2.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	@Override
	public void method4718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5633 == arg0 && this.anInt5645 == arg1) {
			return;
		}
		this.anInt5633 = arg0;
		this.anInt5645 = arg1;
		if (!this.aBoolean359) {
			this.method4863();
			this.method4884();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	@Override
	public void method4729(@OriginalArg(0) int arg0) {
		this.method4844();
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(Z)V")
	public void method4852(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean362) {
			this.aBoolean362 = arg0;
			this.method4884();
			this.anInt5628 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([Lclient!qb;Lclient!ug;[Lclient!aj;I)V")
	@Override
	public void method4761(@OriginalArg(0) Class124[] arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class8_Sub2[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] != null) {
				arg0[local1].method4079(arg1, arg2 == null ? null : arg2[local1], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)V")
	@Override
	public void method4786(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/nio/ByteBuffer;Z)Lclient!mp;")
	public Interface6 method4853(@OriginalArg(0) int arg0, @OriginalArg(1) ByteBuffer arg1) {
		return (Interface6) (this.aBoolean370 ? new Class121_Sub1(this, arg0, arg1, false) : new Class63_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
	@Override
	public void method4787(@OriginalArg(0) int arg0) {
		this.method4822();
	}

	@OriginalMember(owner = "client!se", name = "I", descriptor = "()I")
	@Override
	public int method4795() {
		return this.anInt5629;
	}

	@OriginalMember(owner = "client!se", name = "s", descriptor = "()Z")
	@Override
	public boolean method4746() {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIILclient!sf;II)V")
	@Override
	public void method4782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class74 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg5;
		@Pc(5) Class66_Sub1_Sub1 local5 = local2.aClass66_Sub1_Sub1_3;
		this.method4877();
		this.method4864(local2.aClass66_Sub1_Sub1_3);
		this.method4882(1);
		this.method4860(7681, 8448);
		this.method4815(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat6 / (float) local5.anInt1845;
		@Pc(37) float local37 = local5.aFloat7 / (float) local5.anInt1846;
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg0 - arg6), local37 * (float) (arg1 - arg7));
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glTexCoord2f(local30 * (float) (arg2 - arg6), local37 * (float) (arg3 - arg7));
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
		this.method4815(0, 5890, 768);
	}

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "()V")
	public void method4854() {
		if (this.anInt5635 != 2) {
			this.anInt5635 = 2;
			this.method4850();
			this.method4873();
			this.anInt5628 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
	@Override
	public void method4779(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("GL toolkit does not support more than 1 thread");
		}
	}

	@OriginalMember(owner = "client!se", name = "l", descriptor = "()V")
	@Override
	public void method4733() {
		this.aClass185_1.method4959();
	}

	@OriginalMember(owner = "client!se", name = "fb", descriptor = "()V")
	private void method4855() {
		if (this.anInt5628 == 1) {
			return;
		}
		this.method4818();
		this.method4852(false);
		this.method4880(false);
		this.method4871(false);
		this.method4841(false);
		this.method4864(null);
		this.method4810();
		this.method4859(0);
		this.anInt5628 = 1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II[I[I)Lclient!sf;")
	@Override
	public Class74 method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static359.method1780(arg0, arg2, arg1, this, arg3);
	}

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "()V")
	private void method4856() {
		@Pc(11) float local11 = (float) -this.anInt5650 * this.aFloat52 / (float) this.anInt5639;
		@Pc(23) float local23 = (float) -this.anInt5643 * this.aFloat52 / (float) this.anInt5623;
		@Pc(37) float local37 = (float) (this.anInt5609 - this.anInt5650) * this.aFloat52 / (float) this.anInt5639;
		@Pc(51) float local51 = (float) (this.anInt5614 - this.anInt5643) * this.aFloat52 / (float) this.anInt5623;
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho((double) local11, (double) local37, (double) -local51, (double) -local23, (double) ((float) this.anInt5629 - this.aFloat53), (double) ((float) this.anInt5619 - this.aFloat53));
		this.anOpengl2.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!se", name = "K", descriptor = "()V")
	@Override
	public void method4802() {
		this.anInt5609 = this.aCanvas3.getWidth();
		this.anInt5614 = this.aCanvas3.getHeight();
		this.anOpengl2.glViewport(this.anInt5641, this.anInt5627, this.anInt5609, this.anInt5614);
		this.method4848();
		this.method4734();
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4855();
		this.method4882(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		this.anOpengl2.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFF)V")
	public void method4857(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		Static282.aFloatArray23[0] = arg0;
		Static282.aFloatArray23[1] = arg1;
		Static282.aFloatArray23[2] = arg2;
		Static282.aFloatArray23[3] = arg3;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static282.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "()Lclient!hj;")
	public Interface3 method4858() {
		return this.anInterface3_1;
	}

	@OriginalMember(owner = "client!se", name = "w", descriptor = "()Z")
	@Override
	public boolean method4753() {
		return true;
	}

	@OriginalMember(owner = "client!se", name = "m", descriptor = "(I)V")
	public void method4859(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			this.method4860(7681, 7681);
		} else if (arg0 == 1) {
			this.method4860(8448, 8448);
		} else if (arg0 == 2) {
			this.method4860(34165, 7681);
		}
	}

	@OriginalMember(owner = "client!se", name = "p", descriptor = "()Lclient!ug;")
	@Override
	public Class56 method4739() {
		return this.aClass56_4;
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(II)V")
	public void method4860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5630 != 0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(4) boolean local4 = false;
		if (this.anInt5649 != arg0) {
			this.anOpengl2.glTexEnvi(8960, 34161, arg0);
			this.anInt5649 = arg0;
			local4 = true;
		}
		if (this.anInt5644 != arg1) {
			this.anOpengl2.glTexEnvi(8960, 34162, arg1);
			this.anInt5644 = arg1;
			local4 = true;
		}
		if (local4) {
			this.anInt5628 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "()V")
	private void method4861() {
		if (this.anInt5631 <= this.anInt5624 && this.anInt5646 <= this.anInt5626) {
			this.anOpengl2.glScissor(this.anInt5641 + this.anInt5631, this.anInt5627 + this.anInt5614 - this.anInt5626, this.anInt5624 - this.anInt5631, this.anInt5626 - this.anInt5646);
		} else {
			this.anOpengl2.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(4) float local4 = (float) arg0 + 0.35F;
		@Pc(9) float local9 = (float) arg1 + 0.35F;
		@Pc(16) float local16 = local4 + (float) arg2 - 1.0F;
		@Pc(23) float local23 = local9 + (float) arg3 - 1.0F;
		this.method4855();
		this.method4882(arg5);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean369) {
			this.anOpengl2.glDisable(32925);
		}
		this.anOpengl2.glBegin(2);
		this.anOpengl2.glVertex2f(local4, local9);
		this.anOpengl2.glVertex2f(local4, local23);
		this.anOpengl2.glVertex2f(local16, local23);
		this.anOpengl2.glVertex2f(local16, local9);
		this.anOpengl2.glEnd();
		if (this.aBoolean369) {
			this.anOpengl2.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!mp;)V")
	public void method4862(@OriginalArg(0) Interface6 arg0) {
		if (this.anInterface6_6 != arg0 && this.aBoolean370) {
			this.anOpengl2.glBindBufferARB(34962, arg0.method5253());
			this.anInterface6_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!se", name = "jb", descriptor = "()V")
	private void method4863() {
		@Pc(15) int local15;
		if (this.aBoolean359) {
			this.anOpengl2.glFogf(2915, 0.0F);
			this.anOpengl2.glFogf(2916, 1.0F);
			local15 = this.anInt5648;
		} else {
			this.aFloat57 = (float) (this.anInt5619 - 256) - this.aFloat67;
			this.aFloat66 = this.aFloat57 - (float) this.anInt5645 * this.aFloat51;
			if (this.aFloat66 < (float) this.anInt5629) {
				this.aFloat66 = this.anInt5629;
			}
			this.anOpengl2.glFogf(2915, this.aFloat66);
			this.anOpengl2.glFogf(2916, this.aFloat57);
			local15 = this.anInt5633;
		}
		Static282.aFloatArray23[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static282.aFloatArray23[1] = (float) (local15 & 0xFFFF) / 65535.0F;
		Static282.aFloatArray23[2] = (float) (local15 & 0xFF) / 255.0F;
		this.anOpengl2.glFogfv(2918, Static282.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!gd;)V")
	public void method4864(@OriginalArg(0) Class66 arg0) {
		@Pc(5) Class66 local5 = this.aClass66Array1[this.anInt5630];
		if (local5 != arg0) {
			if (arg0 == null) {
				this.anOpengl2.glDisable(local5.anInt4752);
			} else {
				if (local5 == null) {
					this.anOpengl2.glEnable(arg0.anInt4752);
				} else if (arg0.anInt4752 != local5.anInt4752) {
					this.anOpengl2.glDisable(local5.anInt4752);
					this.anOpengl2.glEnable(arg0.anInt4752);
				}
				this.anOpengl2.glBindTexture(arg0.anInt4752, arg0.method4040());
			}
			this.aClass66Array1[this.anInt5630] = arg0;
		}
		this.anInt5628 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!sf;II)V")
	@Override
	public void method4711(@OriginalArg(1) Class74 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg0;
		@Pc(5) Class66_Sub1_Sub1 local5 = local2.aClass66_Sub1_Sub1_3;
		this.method4877();
		this.method4864(local2.aClass66_Sub1_Sub1_3);
		this.method4882(1);
		this.method4860(7681, 8448);
		this.method4815(0, 34167, 768);
		@Pc(30) float local30 = local5.aFloat6 / (float) local5.anInt1845;
		@Pc(37) float local37 = local5.aFloat7 / (float) local5.anInt1846;
		this.anOpengl2.glColor4ub((byte) 0, (byte) 0, (byte) 0, (byte) -1);
		this.anOpengl2.glBegin(7);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5631 - arg1), local37 * (float) (this.anInt5646 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5631, this.anInt5646);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5631 - arg1), local37 * (float) (this.anInt5626 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5631, this.anInt5626);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5624 - arg1), local37 * (float) (this.anInt5626 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5624, this.anInt5626);
		this.anOpengl2.glTexCoord2f(local30 * (float) (this.anInt5624 - arg1), local37 * (float) (this.anInt5646 - arg2));
		this.anOpengl2.glVertex2i(this.anInt5624, this.anInt5646);
		this.anOpengl2.glEnd();
		this.method4815(0, 5890, 768);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass56_Sub2_1.aFloat45 * (float) arg0 + this.aClass56_Sub2_1.aFloat41 * (float) arg1 + this.aClass56_Sub2_1.aFloat40 * (float) arg2 + this.aClass56_Sub2_1.aFloat42;
		if (local24 < (float) this.anInt5629 || local24 > (float) this.anInt5619) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5639 * (this.aClass56_Sub2_1.aFloat39 * (float) arg0 + this.aClass56_Sub2_1.aFloat48 * (float) arg1 + this.aClass56_Sub2_1.aFloat43 * (float) arg2 + this.aClass56_Sub2_1.aFloat46) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5623 * (this.aClass56_Sub2_1.aFloat47 * (float) arg0 + this.aClass56_Sub2_1.aFloat38 * (float) arg1 + this.aClass56_Sub2_1.aFloat37 * (float) arg2 + this.aClass56_Sub2_1.aFloat44) / local24);
		if ((float) local81 >= this.aFloat54 && (float) local81 <= this.aFloat58 && (float) local113 >= this.lb && (float) local113 <= this.aFloat55) {
			arg3[0] = (int) ((float) local81 - this.aFloat54);
			arg3[1] = (int) ((float) local113 - this.lb);
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!se", name = "C", descriptor = "()Z")
	@Override
	public boolean method4774() {
		return this.aClass3_Sub31_Sub1_1.method3715();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!hj;)V")
	public void method4865(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt5617 < 0 || this.anInterface3Array1[this.anInt5617] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array1[this.anInt5617--] = null;
		arg0.method4808();
		if (this.anInt5617 >= 0) {
			this.anInterface3_1 = this.anInterface3Array1[this.anInt5617];
			this.anInterface3_1.method4807();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()V")
	@Override
	public void method4807() {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ok;Z)Lclient!l;")
	@Override
	public Class57 method4757(@OriginalArg(0) Class149 arg0) {
		@Pc(6) int[] local6 = new int[arg0.anInt4569 * arg0.anInt4572];
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(15) int local15;
		@Pc(21) int local21;
		if (arg0.aByteArray71 == null) {
			for (local15 = 0; local15 < arg0.anInt4572; local15++) {
				for (local21 = 0; local21 < arg0.anInt4569; local21++) {
					@Pc(74) int local74 = arg0.anIntArray371[arg0.aByteArray72[local8++] & 0xFF];
					local6[local10++] = local74 == 0 ? 0 : local74 | 0xFF000000;
				}
			}
		} else {
			for (local15 = 0; local15 < arg0.anInt4572; local15++) {
				for (local21 = 0; local21 < arg0.anInt4569; local21++) {
					local6[local10++] = arg0.aByteArray71[local8] << 24 | arg0.anIntArray371[arg0.aByteArray72[local8] & 0xFF];
					local8++;
				}
			}
		}
		@Pc(100) Class57 local100 = this.method4762(local6, arg0.anInt4569, arg0.anInt4569, arg0.anInt4572);
		local100.method5438(arg0.anInt4571, arg0.anInt4573, arg0.anInt4570, arg0.anInt4568);
		return local100;
	}

	@OriginalMember(owner = "client!se", name = "H", descriptor = "()V")
	@Override
	public void method4789() {
		try {
			this.aContext1.swapBuffers();
		} catch (@Pc(5) Exception local5) {
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ke;Lclient!ke;FLclient!ke;)Lclient!ke;")
	@Override
	public Class113 method4775(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class113 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean352 && this.aBoolean355) {
			@Pc(11) Class113_Sub1_Sub1 local11 = null;
			@Pc(14) Class113_Sub1 local14 = (Class113_Sub1) arg0;
			@Pc(17) Class113_Sub1 local17 = (Class113_Sub1) arg1;
			@Pc(21) Class66_Sub4 local21 = local14.method5316();
			@Pc(25) Class66_Sub4 local25 = local17.method5316();
			if (local21 != null && local25 != null) {
				@Pc(40) int local40 = local21.anInt4756 > local25.anInt4756 ? local21.anInt4756 : local25.anInt4756;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class113_Sub1_Sub1) {
					@Pc(52) Class113_Sub1_Sub1 local52 = (Class113_Sub1_Sub1) arg3;
					if (local52.method3540() == local40) {
						local11 = local52;
					}
				}
				if (local11 == null) {
					local11 = new Class113_Sub1_Sub1(this, local40);
				}
				local11.method3539(local25, arg2, local21);
				return local11;
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!se", name = "n", descriptor = "(I)V")
	public synchronized void method4866(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub22 local4 = new Class3_Sub22(arg0);
		this.aClass127_36.method3387(local4);
	}

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "()I")
	private int method4867() {
		@Pc(1) int local1 = 0;
		this.aString200 = this.anOpengl2.glGetString(7936);
		this.aString201 = this.anOpengl2.glGetString(7937);
		@Pc(17) String local17 = this.aString200.toLowerCase();
		if (local17.indexOf("microsoft") != -1) {
			local1 = 1;
		}
		if (local17.indexOf("brian paul") != -1 || local17.indexOf("mesa") != -1) {
			local1 |= 0x1;
		}
		@Pc(45) String local45 = this.anOpengl2.glGetString(7938);
		@Pc(53) String[] local53 = Static159.method2528(' ', local45.replace('.', ' '));
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static261.method4403(local53[0]);
				@Pc(69) int local69 = Static261.method4403(local53[1]);
				this.anInt5637 = local63 * 10 + local69;
			} catch (@Pc(78) NumberFormatException local78) {
				local1 |= 0x4;
			}
		} else {
			local1 |= 0x4;
		}
		if (this.anInt5637 < 12) {
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
		this.anInt5622 = local116[0];
		this.anOpengl2.glGetIntegerv(34929, local116, 0);
		this.anInt5634 = local116[0];
		this.anOpengl2.glGetIntegerv(34930, local116, 0);
		this.anInt5625 = local116[0];
		if (this.anInt5622 < 2 || this.anInt5634 < 2 || this.anInt5625 < 2) {
			local1 |= 0x10;
		}
		this.aBoolean363 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		this.aBoolean370 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean369 = this.anOpengl2.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean375 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean353 = this.anOpengl2.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean373 = this.anOpengl2.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean364 = this.anOpengl2.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean357 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean352 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean356 = this.anOpengl2.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean372 = false;
		this.aBoolean355 = this.anOpengl2.isExtensionAvailable("GL_EXT_framebuffer_object");
		return local1 == 0 ? 0 : local1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4745() {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZZ)V")
	public void method4868(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 != this.anInt5640) {
			if (arg0 < 0) {
				this.method4837();
				this.method4864(null);
				if (!this.aBoolean359) {
					this.aClass126_1.method3377(arg2, arg1, 0);
				}
			} else {
				@Pc(11) Class66_Sub1 local11 = this.aClass29_1.method683(arg0);
				@Pc(17) Class171 local17 = this.anInterface9_5.method2396(arg0);
				if (local17.aByte52 == 0 && local17.aByte55 == 0) {
					this.method4837();
				} else {
					@Pc(30) int local30 = local17.aBoolean321 ? 64 : 128;
					@Pc(34) int local34 = local30 * 50;
					this.method4823((float) (this.anInt5610 % local34 * local17.aByte52) / (float) local34, (float) (this.anInt5610 % local34 * local17.aByte55) / (float) local34, 0.0F);
				}
				if (this.aBoolean359) {
					this.aClass126_1.method3377(arg2, arg1, 3);
					this.method4864(local11);
				} else {
					this.aClass126_1.method3377(arg2, arg1, local17.aByte57);
					this.aClass126_1.method3376(false, local17.aByte58);
					if (!this.aClass126_1.method3374(local11)) {
						this.method4864(local11);
					}
				}
			}
			this.anInt5640 = arg0;
		}
		this.anInt5628 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(F)V")
	public void method4869(@OriginalArg(0) float arg0) {
		if (this.aFloat52 != arg0) {
			this.aFloat52 = arg0;
			if (this.anInt5635 == 3) {
				this.method4856();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "o", descriptor = "(I)V")
	public synchronized void method4870(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub22 local4 = new Class3_Sub22(arg0);
		this.aClass127_34.method3387(local4);
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "()I")
	@Override
	public int method4708() {
		@Pc(2) int local2 = this.anInt5651;
		this.anInt5651 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4712(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4789();
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(Z)V")
	public void method4871(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean374) {
			return;
		}
		if (arg0) {
			this.anOpengl2.glEnable(2929);
		} else {
			this.anOpengl2.glDisable(2929);
		}
		this.aBoolean374 = arg0;
		this.anInt5628 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!se", name = "p", descriptor = "(I)V")
	public void method4872(@OriginalArg(0) int arg0) {
		Static282.aFloatArray23[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static282.aFloatArray23[1] = (float) (arg0 & 0xFFFF) / 65535.0F;
		Static282.aFloatArray23[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static282.aFloatArray23[3] = (float) (arg0 >>> 24) / 255.0F;
		this.anOpengl2.glTexEnvfv(8960, 8705, Static282.aFloatArray23, 0);
	}

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "()V")
	private void method4873() {
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		this.anOpengl2.glMultMatrixf(this.aClass56_Sub2_1.method4699(), 0);
		this.method4824();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II[[I[[IIII)Lclient!da;")
	@Override
	public Class22 method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class22_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class57 method4731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class57_Sub1(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(FF)V")
	public void method4874(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat51 = arg0;
		this.aFloat67 = arg1;
		if (!this.aBoolean359) {
			this.method4863();
		}
	}

	@OriginalMember(owner = "client!se", name = "mb", descriptor = "()V")
	private void method4875() {
		this.aFloat54 = this.anInt5631 - this.anInt5650;
		this.aFloat58 = this.anInt5624 - this.anInt5650;
		this.lb = this.anInt5646 - this.anInt5643;
		this.aFloat55 = this.anInt5626 - this.anInt5643;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method4716() {
		@Pc(4) int[] local4 = new int[1152];
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			this.anOpengl2.glReadPixels(0, this.anInt5614 - local6, 36, 1, 32993, this.anInt5642, IntBuffer.wrap(local4, local6 * 36, 36));
		}
		return local4;
	}

	@OriginalMember(owner = "client!se", name = "nb", descriptor = "()V")
	private void method4876() {
		if (this.aFloat53 == 0.0F) {
			this.aFloatArray29[10] = this.aFloat61;
			this.aFloatArray29[14] = this.aFloat65;
		} else {
			@Pc(13) float local13 = this.aFloat64 / (this.aFloat53 + this.aFloat64);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = -this.aFloat65 * (1.0F - local13) * (1.0F - local13) / this.aFloat53;
			this.aFloatArray29[10] = this.aFloat61 + local32;
			this.aFloatArray29[14] = this.aFloat65 * local17;
		}
		this.method4826();
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4855();
		this.method4882(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9 + (float) arg2, local14);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!se", name = "ob", descriptor = "()V")
	public void method4877() {
		if (this.anInt5628 == 2) {
			return;
		}
		this.method4818();
		this.method4852(false);
		this.method4880(false);
		this.method4871(false);
		this.method4841(false);
		this.method4810();
		this.anInt5628 = 2;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method4754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method4855();
		this.method4882(arg4);
		@Pc(9) float local9 = (float) arg0 + 0.35F;
		@Pc(14) float local14 = (float) arg1 + 0.35F;
		this.anOpengl2.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		this.anOpengl2.glBegin(1);
		this.anOpengl2.glVertex2f(local9, local14);
		this.anOpengl2.glVertex2f(local9, local14 + (float) arg2);
		this.anOpengl2.glEnd();
	}

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "()V")
	private void method4878() {
		if (this.anInt5635 != 3) {
			this.anInt5635 = 3;
			this.method4856();
			this.method4873();
			this.anInt5628 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!se", name = "y", descriptor = "()Z")
	@Override
	public boolean method4759() {
		return false;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	@Override
	public void method4758() {
		this.aBoolean359 = true;
		this.anInt5648 = 1583160;
		this.anInt5632 = 40;
		this.method4863();
		this.method4884();
		this.aClass126_1.method3377(false, false, 3);
		this.aClass126_1.method3376(true, -1);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5650 = arg0;
		this.anInt5643 = arg1;
		this.anInt5639 = arg2;
		this.anInt5623 = arg3;
		@Pc(23) float local23 = (float) (-this.anInt5650 * this.anInt5629) / (float) this.anInt5639;
		@Pc(35) float local35 = (float) (-this.anInt5643 * this.anInt5629) / (float) this.anInt5623;
		@Pc(49) float local49 = (float) ((this.anInt5609 - this.anInt5650) * this.anInt5629) / (float) this.anInt5639;
		@Pc(63) float local63 = (float) ((this.anInt5614 - this.anInt5643) * this.anInt5629) / (float) this.anInt5623;
		this.method4819(local23, local49, -local63, -local35, (float) this.anInt5629, (float) this.anInt5619);
		if (this.anInt5635 != 1) {
			this.method4848();
		}
		this.method4826();
		this.method4875();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(F)V")
	@Override
	public void method4752(@OriginalArg(0) float arg0) {
		if (this.aFloat49 != arg0) {
			this.aFloat49 = arg0;
			this.method4886();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V")
	@Override
	public void method4805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean359) {
			throw new RuntimeException("Can't call underwatermode_adjust without first enabling underwater mode");
		}
		this.anInt5648 = arg1;
		this.anInt5632 = arg2;
		this.method4863();
		this.aClass126_1.method3376(true, arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5631 < arg0) {
			this.anInt5631 = arg0;
		}
		if (this.anInt5624 > arg2) {
			this.anInt5624 = arg2;
		}
		if (this.anInt5646 < arg1) {
			this.anInt5646 = arg1;
		}
		if (this.anInt5626 > arg3) {
			this.anInt5626 = arg3;
		}
		this.anOpengl2.glEnable(3089);
		this.method4875();
		this.method4861();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!d;IIII)Lclient!qb;")
	@Override
	public Class124 method4794(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class124_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!se", name = "qb", descriptor = "()V")
	public void method4879() {
		@Pc(6) boolean local6 = this.aClass117_16 != null;
		if (local6 != this.aBoolean365) {
			if (local6) {
				this.anOpengl2.glEnableClientState(32884);
			} else {
				this.anOpengl2.glDisableClientState(32884);
			}
			this.aBoolean365 = local6;
		}
		this.aClass117_16 = null;
		@Pc(34) boolean local34 = this.aClass117_18 != null;
		if (local34 != this.aBoolean351) {
			if (local34) {
				this.anOpengl2.glEnableClientState(32885);
			} else {
				this.anOpengl2.glDisableClientState(32885);
			}
			this.aBoolean351 = local34;
		}
		this.aClass117_18 = null;
		@Pc(62) boolean local62 = this.aClass117_17 != null;
		if (local62 != this.aBoolean354) {
			if (local62) {
				this.anOpengl2.glEnableClientState(32886);
			} else {
				this.anOpengl2.glDisableClientState(32886);
			}
			this.aBoolean354 = local62;
		}
		this.aClass117_17 = null;
		for (@Pc(85) int local85 = 0; local85 < this.anInt5634; local85++) {
			@Pc(98) boolean local98 = this.aClass117Array1[local85] != null;
			if (local98 != this.aBooleanArray27[local85]) {
				this.anOpengl2.glClientActiveTexture(local85 + 33984);
				if (local98) {
					this.anOpengl2.glEnableClientState(32888);
				} else {
					this.anOpengl2.glDisableClientState(32888);
				}
				this.aBooleanArray27[local85] = local98;
			}
			this.aClass117Array1[local85] = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(32) float local32;
		@Pc(36) float local36;
		if (this.aClass66_Sub1_Sub1_5 == null || this.aClass66_Sub1_Sub1_5.anInt1844 < arg2 || this.aClass66_Sub1_Sub1_5.anInt1842 < arg3) {
			this.aClass66_Sub1_Sub1_5 = Static358.method1519(arg6, arg2, this, arg3);
			this.aClass66_Sub1_Sub1_5.method1516(false, false);
			local32 = this.aClass66_Sub1_Sub1_5.aFloat7;
			local36 = this.aClass66_Sub1_Sub1_5.aFloat6;
		} else {
			this.aClass66_Sub1_Sub1_5.method1513(arg2, arg3, arg6, 6406, false);
			local32 = this.aClass66_Sub1_Sub1_5.aFloat7 * (float) arg3 / (float) this.aClass66_Sub1_Sub1_5.anInt1842;
			local36 = this.aClass66_Sub1_Sub1_5.aFloat6 * (float) arg2 / (float) this.aClass66_Sub1_Sub1_5.anInt1844;
		}
		this.method4877();
		this.method4864(this.aClass66_Sub1_Sub1_5);
		this.method4882(arg8);
		this.anOpengl2.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method4872(arg5);
		this.method4860(34165, 34165);
		this.method4815(0, 34166, 768);
		this.method4815(2, 5890, 770);
		this.method4816(0, 34166);
		this.method4816(2, 5890);
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
		this.method4815(0, 5890, 768);
		this.method4815(2, 34166, 770);
		this.method4816(0, 5890);
		this.method4816(2, 34166);
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(IIII)V")
	@Override
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass185_1.method4956(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(Z)V")
	public void method4880(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean360) {
			this.aBoolean360 = arg0;
			this.method4842();
			this.anInt5628 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4709(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static211.aFloat27 = arg0;
		Static211.aFloat28 = arg1;
		Static211.aFloat29 = arg2;
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(II)V")
	public synchronized void method4881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub22 local4 = new Class3_Sub22(arg1);
		local4.aLong211 = arg0;
		this.aClass127_33.method3387(local4);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)I")
	@Override
	public int method4766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!se", name = "q", descriptor = "(I)V")
	public void method4882(@OriginalArg(0) int arg0) {
		if (this.anInt5618 == arg0) {
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
		if (local10 != this.aBoolean367) {
			this.anOpengl2.glColorMask(local10, local10, local10, true);
			this.aBoolean367 = local10;
		}
		if (local12 != this.aBoolean358) {
			if (local12) {
				this.anOpengl2.glEnable(3008);
			} else {
				this.anOpengl2.glDisable(3008);
			}
			this.aBoolean358 = local12;
		}
		if (local8 != this.anInt5621) {
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
			this.anInt5621 = local8;
		}
		this.anInt5618 = arg0;
		this.anInt5628 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)Lclient!dc;")
	@Override
	public Class3_Sub11 method4783() {
		return null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ug;)V")
	@Override
	public void method4785(@OriginalArg(0) Class56 arg0) {
		this.aClass56_Sub2_1 = (Class56_Sub2) arg0;
		this.aClass56_Sub2_2.method4701(this.aClass56_Sub2_1);
		if (this.anInt5635 != 1) {
			this.method4873();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I[BIZ)Lclient!mp;")
	public Interface6 method4883(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface6) (this.aBoolean370 && (!arg3 || this.aBoolean368) ? new Class121_Sub1(this, arg0, arg1, arg2, arg3) : new Class63_Sub1(this, arg0, arg1, arg2));
	}

	@OriginalMember(owner = "client!se", name = "rb", descriptor = "()V")
	private void method4884() {
		if (this.aBoolean362 && this.aBoolean359 | this.anInt5645 >= 0) {
			this.anOpengl2.glEnable(2912);
		} else {
			this.anOpengl2.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!se", name = "r", descriptor = "(I)I")
	public int method4885(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!se", name = "o", descriptor = "()V")
	@Override
	public void method4737() {
		@Pc(2) int local2 = this.anInt5631;
		@Pc(5) int local5 = this.anInt5624;
		@Pc(8) int local8 = this.anInt5646;
		@Pc(11) int local11 = this.anInt5626;
		this.method4734();
		this.anOpengl2.glReadBuffer(1028);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4848();
		this.method4852(false);
		this.method4880(false);
		this.method4871(false);
		this.method4841(false);
		this.method4864(null);
		this.method4810();
		this.method4859(0);
		this.method4882(0);
		this.anOpengl2.glMatrixMode(5889);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		this.anOpengl2.glMatrixMode(5888);
		this.anOpengl2.glLoadIdentity();
		this.anOpengl2.glRasterPos2i(0, 0);
		this.anOpengl2.glCopyPixels(0, 0, this.anInt5609, this.anInt5614, 6144);
		this.anOpengl2.glFlush();
		this.anOpengl2.glReadBuffer(1029);
		this.anOpengl2.glDrawBuffer(1029);
		this.method4768(local2, local8, local5, local11);
	}

	@OriginalMember(owner = "client!se", name = "sb", descriptor = "()V")
	private void method4886() {
		Static282.aFloatArray23[0] = this.aFloat49 * this.aFloat59;
		Static282.aFloatArray23[1] = this.aFloat49 * this.aFloat63;
		Static282.aFloatArray23[2] = this.aFloat49 * this.aFloat68;
		Static282.aFloatArray23[3] = 1.0F;
		this.anOpengl2.glLightModelfv(2899, Static282.aFloatArray23, 0);
	}
}
