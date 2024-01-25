import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeHeap;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class128_Sub2 extends Class128 {

	@OriginalMember(owner = "client!od", name = "O", descriptor = "I")
	private int anInt4441;

	@OriginalMember(owner = "client!od", name = "db", descriptor = "I")
	public int anInt4455;

	@OriginalMember(owner = "client!od", name = "Nc", descriptor = "I")
	private int anInt4536;

	@OriginalMember(owner = "client!od", name = "rd", descriptor = "I")
	public int anInt4562;

	@OriginalMember(owner = "client!od", name = "se", descriptor = "I")
	public int anInt4604;

	@OriginalMember(owner = "client!od", name = "ue", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!od", name = "ze", descriptor = "Lclient!ig;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!od", name = "Ee", descriptor = "Lclient!ig;")
	private Interface7 anInterface7_2;

	@OriginalMember(owner = "client!od", name = "Fe", descriptor = "I")
	public int anInt4610;

	@OriginalMember(owner = "client!od", name = "He", descriptor = "I")
	private int anInt4611;

	@OriginalMember(owner = "client!od", name = "Ie", descriptor = "I")
	public int anInt4612;

	@OriginalMember(owner = "client!od", name = "Re", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!od", name = "Se", descriptor = "[Lclient!jk;")
	private Class5[] aClass5Array1;

	@OriginalMember(owner = "client!od", name = "Te", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_1;

	@OriginalMember(owner = "client!od", name = "Ue", descriptor = "Lclient!ap;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!od", name = "Ve", descriptor = "I")
	private int anInt4614;

	@OriginalMember(owner = "client!od", name = "We", descriptor = "Z")
	private boolean aBoolean349;

	@OriginalMember(owner = "client!od", name = "af", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_2;

	@OriginalMember(owner = "client!od", name = "cf", descriptor = "Lclient!nc;")
	private Interface10 anInterface10_4;

	@OriginalMember(owner = "client!od", name = "df", descriptor = "I")
	private int anInt4617;

	@OriginalMember(owner = "client!od", name = "gf", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_3;

	@OriginalMember(owner = "client!od", name = "hf", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!od", name = "jf", descriptor = "Lclient!bg;")
	public Class21 aClass21_7;

	@OriginalMember(owner = "client!od", name = "kf", descriptor = "I")
	private int anInt4618;

	@OriginalMember(owner = "client!od", name = "lf", descriptor = "I")
	public int anInt4619;

	@OriginalMember(owner = "client!od", name = "mf", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!od", name = "nf", descriptor = "F")
	public float aFloat56;

	@OriginalMember(owner = "client!od", name = "rf", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_4;

	@OriginalMember(owner = "client!od", name = "sf", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!od", name = "uf", descriptor = "Lclient!bg;")
	public Class21 aClass21_8;

	@OriginalMember(owner = "client!od", name = "wf", descriptor = "Z")
	public boolean aBoolean353;

	@OriginalMember(owner = "client!od", name = "xf", descriptor = "I")
	private int anInt4622;

	@OriginalMember(owner = "client!od", name = "zf", descriptor = "I")
	private int anInt4624;

	@OriginalMember(owner = "client!od", name = "Af", descriptor = "Z")
	private boolean aBoolean354;

	@OriginalMember(owner = "client!od", name = "Bf", descriptor = "Z")
	private boolean aBoolean355;

	@OriginalMember(owner = "client!od", name = "Cf", descriptor = "Z")
	public boolean aBoolean356;

	@OriginalMember(owner = "client!od", name = "Df", descriptor = "Ljava/lang/String;")
	private String aString44;

	@OriginalMember(owner = "client!od", name = "Ef", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_5;

	@OriginalMember(owner = "client!od", name = "Ff", descriptor = "I")
	public int anInt4625;

	@OriginalMember(owner = "client!od", name = "If", descriptor = "I")
	private int anInt4626;

	@OriginalMember(owner = "client!od", name = "Jf", descriptor = "Lclient!ah;")
	public Class5_Sub1 aClass5_Sub1_4;

	@OriginalMember(owner = "client!od", name = "Kf", descriptor = "Lclient!ah;")
	public Class5_Sub1 aClass5_Sub1_5;

	@OriginalMember(owner = "client!od", name = "Lf", descriptor = "Lclient!nc;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!od", name = "Nf", descriptor = "I")
	public int anInt4628;

	@OriginalMember(owner = "client!od", name = "Rf", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!od", name = "Sf", descriptor = "I")
	private int anInt4631;

	@OriginalMember(owner = "client!od", name = "Tf", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_6;

	@OriginalMember(owner = "client!od", name = "Uf", descriptor = "F")
	public float aFloat59;

	@OriginalMember(owner = "client!od", name = "Xf", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!od", name = "Yf", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_7;

	@OriginalMember(owner = "client!od", name = "Zf", descriptor = "I")
	private int anInt4634;

	@OriginalMember(owner = "client!od", name = "ag", descriptor = "Z")
	public boolean aBoolean360;

	@OriginalMember(owner = "client!od", name = "bg", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_8;

	@OriginalMember(owner = "client!od", name = "cg", descriptor = "Z")
	public boolean aBoolean361;

	@OriginalMember(owner = "client!od", name = "dg", descriptor = "Z")
	public boolean aBoolean362;

	@OriginalMember(owner = "client!od", name = "eg", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_9;

	@OriginalMember(owner = "client!od", name = "gg", descriptor = "Lclient!ah;")
	public Class5_Sub1 aClass5_Sub1_6;

	@OriginalMember(owner = "client!od", name = "hg", descriptor = "Lclient!dj;")
	public Class40_Sub2 aClass40_Sub2_3;

	@OriginalMember(owner = "client!od", name = "ig", descriptor = "F")
	public float aFloat60;

	@OriginalMember(owner = "client!od", name = "jg", descriptor = "I")
	public int anInt4635;

	@OriginalMember(owner = "client!od", name = "lg", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!od", name = "mg", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!od", name = "og", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!od", name = "pg", descriptor = "Lclient!vj;")
	public Class33_Sub2 aClass33_Sub2_10;

	@OriginalMember(owner = "client!od", name = "rg", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!od", name = "tg", descriptor = "Lclient!fv;")
	public Class87 aClass87_3;

	@OriginalMember(owner = "client!od", name = "ug", descriptor = "F")
	public float aFloat62;

	@OriginalMember(owner = "client!od", name = "wg", descriptor = "Lclient!dj;")
	public Class40_Sub2 aClass40_Sub2_4;

	@OriginalMember(owner = "client!od", name = "Ag", descriptor = "F")
	private float aFloat65;

	@OriginalMember(owner = "client!od", name = "Dg", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!od", name = "Fg", descriptor = "Ljava/lang/String;")
	private String aString45;

	@OriginalMember(owner = "client!od", name = "Gg", descriptor = "F")
	public float aFloat66;

	@OriginalMember(owner = "client!od", name = "Jg", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!od", name = "Kg", descriptor = "Lclient!hs;")
	private Class9_Sub1 aClass9_Sub1_1;

	@OriginalMember(owner = "client!od", name = "Mg", descriptor = "F")
	public float aFloat67;

	@OriginalMember(owner = "client!od", name = "Og", descriptor = "I")
	private int anInt4647;

	@OriginalMember(owner = "client!od", name = "Rg", descriptor = "Z")
	private boolean aBoolean370;

	@OriginalMember(owner = "client!od", name = "Sg", descriptor = "Z")
	private boolean aBoolean371;

	@OriginalMember(owner = "client!od", name = "Ug", descriptor = "Lclient!we;")
	private Class5_Sub1_Sub1 aClass5_Sub1_Sub1_2;

	@OriginalMember(owner = "client!od", name = "Vg", descriptor = "F")
	public float aFloat68;

	@OriginalMember(owner = "client!od", name = "Wg", descriptor = "I")
	private int anInt4649;

	@OriginalMember(owner = "client!od", name = "ah", descriptor = "F")
	private float aFloat72;

	@OriginalMember(owner = "client!od", name = "bh", descriptor = "Z")
	public boolean aBoolean373;

	@OriginalMember(owner = "client!od", name = "eh", descriptor = "Lclient!fv;")
	public Class87 aClass87_4;

	@OriginalMember(owner = "client!od", name = "gh", descriptor = "I")
	private int anInt4651;

	@OriginalMember(owner = "client!od", name = "ge", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!od", name = "he", descriptor = "I")
	public int anInt4602 = 128;

	@OriginalMember(owner = "client!od", name = "ie", descriptor = "Lclient!bb;")
	private final Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!od", name = "oe", descriptor = "Lclient!dj;")
	private final Class40_Sub2 aClass40_Sub2_1 = new Class40_Sub2();

	@OriginalMember(owner = "client!od", name = "pe", descriptor = "Lclient!dj;")
	public final Class40_Sub2 aClass40_Sub2_2 = new Class40_Sub2();

	@OriginalMember(owner = "client!od", name = "qe", descriptor = "Z")
	private boolean aBoolean348 = false;

	@OriginalMember(owner = "client!od", name = "te", descriptor = "I")
	public int anInt4605 = 8;

	@OriginalMember(owner = "client!od", name = "ve", descriptor = "I")
	public int anInt4606 = 3;

	@OriginalMember(owner = "client!od", name = "we", descriptor = "Lclient!vp;")
	private final Class254 aClass254_28 = new Class254();

	@OriginalMember(owner = "client!od", name = "Be", descriptor = "I")
	private int anInt4608 = -1;

	@OriginalMember(owner = "client!od", name = "Ae", descriptor = "[Lclient!ig;")
	private final Interface7[] anInterface7Array2 = new Interface7[4];

	@OriginalMember(owner = "client!od", name = "xe", descriptor = "I")
	private int anInt4607 = -1;

	@OriginalMember(owner = "client!od", name = "ye", descriptor = "[Lclient!ig;")
	private final Interface7[] anInterface7Array1 = new Interface7[4];

	@OriginalMember(owner = "client!od", name = "Ce", descriptor = "[Lclient!ig;")
	private final Interface7[] anInterface7Array3 = new Interface7[4];

	@OriginalMember(owner = "client!od", name = "De", descriptor = "I")
	private int anInt4609 = -1;

	@OriginalMember(owner = "client!od", name = "Ge", descriptor = "Lclient!vp;")
	private final Class254 aClass254_29;

	@OriginalMember(owner = "client!od", name = "Je", descriptor = "Lclient!vp;")
	private final Class254 aClass254_30;

	@OriginalMember(owner = "client!od", name = "Ke", descriptor = "Lclient!vp;")
	private final Class254 aClass254_31;

	@OriginalMember(owner = "client!od", name = "Le", descriptor = "Lclient!vp;")
	private final Class254 aClass254_32;

	@OriginalMember(owner = "client!od", name = "Me", descriptor = "Lclient!vp;")
	private final Class254 aClass254_33;

	@OriginalMember(owner = "client!od", name = "Ne", descriptor = "Lclient!vp;")
	private final Class254 aClass254_34;

	@OriginalMember(owner = "client!od", name = "Oe", descriptor = "Lclient!vp;")
	private final Class254 aClass254_35;

	@OriginalMember(owner = "client!od", name = "Qe", descriptor = "I")
	private int anInt4613;

	@OriginalMember(owner = "client!od", name = "Ye", descriptor = "I")
	public int anInt4616;

	@OriginalMember(owner = "client!od", name = "vf", descriptor = "[F")
	private final float[] aFloatArray21;

	@OriginalMember(owner = "client!od", name = "Xe", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!od", name = "ef", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!od", name = "tf", descriptor = "I")
	private int anInt4621;

	@OriginalMember(owner = "client!od", name = "Hf", descriptor = "F")
	public float aFloat58;

	@OriginalMember(owner = "client!od", name = "Pe", descriptor = "[F")
	private final float[] aFloatArray19;

	@OriginalMember(owner = "client!od", name = "Of", descriptor = "I")
	public int anInt4629;

	@OriginalMember(owner = "client!od", name = "of", descriptor = "I")
	public int anInt4620;

	@OriginalMember(owner = "client!od", name = "yf", descriptor = "I")
	private int anInt4623;

	@OriginalMember(owner = "client!od", name = "pf", descriptor = "F")
	public float aFloat57;

	@OriginalMember(owner = "client!od", name = "Gf", descriptor = "[F")
	private final float[] aFloatArray22;

	@OriginalMember(owner = "client!od", name = "qf", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!od", name = "sg", descriptor = "I")
	public int anInt4638;

	@OriginalMember(owner = "client!od", name = "Cg", descriptor = "[F")
	public final float[] aFloatArray23;

	@OriginalMember(owner = "client!od", name = "Pf", descriptor = "I")
	private int anInt4630;

	@OriginalMember(owner = "client!od", name = "Hg", descriptor = "I")
	private int anInt4643;

	@OriginalMember(owner = "client!od", name = "ng", descriptor = "[Lclient!kt;")
	private final Class1_Sub24[] aClass1_Sub24Array2;

	@OriginalMember(owner = "client!od", name = "ff", descriptor = "F")
	private float aFloat55;

	@OriginalMember(owner = "client!od", name = "xg", descriptor = "I")
	public int anInt4640;

	@OriginalMember(owner = "client!od", name = "kg", descriptor = "I")
	public int anInt4636;

	@OriginalMember(owner = "client!od", name = "Ng", descriptor = "I")
	private int anInt4646;

	@OriginalMember(owner = "client!od", name = "zg", descriptor = "F")
	private float aFloat64;

	@OriginalMember(owner = "client!od", name = "Ze", descriptor = "[F")
	private final float[] aFloatArray20;

	@OriginalMember(owner = "client!od", name = "Lg", descriptor = "I")
	public int anInt4645;

	@OriginalMember(owner = "client!od", name = "Wf", descriptor = "I")
	private int anInt4632;

	@OriginalMember(owner = "client!od", name = "qg", descriptor = "F")
	public float aFloat61;

	@OriginalMember(owner = "client!od", name = "vg", descriptor = "I")
	private int anInt4639;

	@OriginalMember(owner = "client!od", name = "dh", descriptor = "F")
	public float aFloat73;

	@OriginalMember(owner = "client!od", name = "Xg", descriptor = "F")
	public float aFloat69;

	@OriginalMember(owner = "client!od", name = "Yg", descriptor = "F")
	public float aFloat70;

	@OriginalMember(owner = "client!od", name = "ch", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!od", name = "yg", descriptor = "F")
	public float aFloat63;

	@OriginalMember(owner = "client!od", name = "Ig", descriptor = "I")
	public int anInt4644;

	@OriginalMember(owner = "client!od", name = "Eg", descriptor = "I")
	public int anInt4642;

	@OriginalMember(owner = "client!od", name = "Zg", descriptor = "F")
	private float aFloat71;

	@OriginalMember(owner = "client!od", name = "Qg", descriptor = "I")
	private int anInt4648;

	@OriginalMember(owner = "client!od", name = "Mf", descriptor = "I")
	private int anInt4627;

	@OriginalMember(owner = "client!od", name = "me", descriptor = "I")
	public final int anInt4603;

	@OriginalMember(owner = "client!od", name = "jd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas7;

	@OriginalMember(owner = "client!od", name = "Dd", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!od", name = "Yc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!od", name = "id", descriptor = "J")
	private final long aLong145;

	@OriginalMember(owner = "client!od", name = "Uc", descriptor = "J")
	private long aLong144;

	@OriginalMember(owner = "client!od", name = "Bg", descriptor = "I")
	public final int anInt4641;

	@OriginalMember(owner = "client!od", name = "bf", descriptor = "Z")
	public boolean bf;

	@OriginalMember(owner = "client!od", name = "fh", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!od", name = "Vf", descriptor = "Z")
	public boolean aBoolean359;

	@OriginalMember(owner = "client!od", name = "Tg", descriptor = "Z")
	public boolean aBoolean372;

	@OriginalMember(owner = "client!od", name = "Qf", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!od", name = "fg", descriptor = "Z")
	public boolean aBoolean363;

	@OriginalMember(owner = "client!od", name = "Pg", descriptor = "Z")
	private final boolean aBoolean369;

	@OriginalMember(owner = "client!od", name = "ke", descriptor = "Lclient!ot;")
	public final Class185 aClass185_1;

	@OriginalMember(owner = "client!od", name = "re", descriptor = "Lclient!ms;")
	public final Class161 aClass161_1;

	@OriginalMember(owner = "client!od", name = "le", descriptor = "Lclient!ov;")
	private final Class186 aClass186_1;

	@OriginalMember(owner = "client!od", name = "ne", descriptor = "Lclient!cr;")
	private Class1_Sub4_Sub1 aClass1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!od", name = "je", descriptor = "Lclient!iu;")
	private final Class119 aClass119_1;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;ILclient!ji;)V")
	public Class128_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class124 arg4) {
		super(arg0, arg2);
		new Class260();
		new Class257(16);
		this.aClass254_29 = new Class254();
		this.aClass254_30 = new Class254();
		this.aClass254_31 = new Class254();
		this.aClass254_32 = new Class254();
		this.aClass254_33 = new Class254();
		this.aClass254_34 = new Class254();
		this.aClass254_35 = new Class254();
		this.anInt4613 = 8448;
		this.anInt4616 = 512;
		this.aFloatArray21 = new float[4];
		this.anInt4615 = 0;
		this.aFloat54 = -1.0F;
		this.anInt4621 = 8448;
		this.aFloat58 = 1.0F;
		this.aFloatArray19 = new float[16];
		this.anInt4629 = 512;
		this.anInt4620 = 50;
		this.anInt4623 = 0;
		this.aFloat57 = -1.0F;
		this.aFloatArray22 = new float[4];
		this.aBoolean351 = true;
		this.anInt4638 = 0;
		this.aFloatArray23 = new float[4];
		this.anInt4630 = -1;
		this.anInt4643 = 0;
		this.aClass1_Sub24Array2 = new Class1_Sub24[Static248.anInt4066];
		this.aFloat55 = 1.0F;
		this.anInt4640 = -1;
		this.anInt4636 = -1;
		this.anInt4646 = 0;
		this.aFloat64 = 0.0F;
		this.aFloatArray20 = new float[4];
		this.anInt4645 = -1;
		this.anInt4632 = -1;
		this.aFloat61 = 3584.0F;
		this.anInt4639 = 0;
		this.aFloat73 = 3000.0F;
		this.aFloat69 = 1.0F;
		this.aFloat70 = 3584.0F;
		this.anInt4650 = 0;
		this.aFloat63 = 1.0F;
		this.anInt4644 = 0;
		this.anInt4642 = 3584;
		this.aFloat71 = 1.0F;
		this.anInt4648 = 0;
		this.anInt4627 = 0;
		this.anInt4603 = arg3;
		this.aCanvas8 = this.aCanvas7 = arg1;
		try {
			if (Static300.aBoolean402 == null || !Static300.aBoolean402) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static300.aBoolean402 = Boolean.TRUE;
				} else {
					@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
					if (!local246.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local246.startsWith("linux") || local246.startsWith("sunos")) {
						System.load(arg4.method2511("libjaggl.so").toString());
					} else if (local246.startsWith("mac")) {
						System.load(arg4.method2511("libjaggl.jnilib").toString());
					} else if (local246.startsWith("win")) {
						System.load(arg4.method2511("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static300.aBoolean402 = Boolean.TRUE;
				}
			}
			if (Static300.aBoolean402 == null || !Static300.aBoolean402) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong144 = this.aLong145 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt4603);
			if (this.aLong145 == 0L) {
				throw new RuntimeException("");
			}
			this.method3613();
			@Pc(355) int local355 = this.method3650();
			if (local355 != 0) {
				throw new RuntimeException("");
			}
			this.anInt4641 = this.aBoolean360 ? 33639 : 5121;
			@Pc(379) int local379;
			if (this.aString44.indexOf("radeon") != -1) {
				local379 = 0;
				@Pc(381) boolean local381 = false;
				@Pc(383) boolean local383 = false;
				@Pc(392) String[] local392 = Static150.method2106(this.aString44.replace('/', ' '), ' ');
				for (@Pc(394) int local394 = 0; local394 < local392.length; local394++) {
					@Pc(400) String local400 = local392[local394];
					try {
						if (local400.length() > 0) {
							if (local400.charAt(0) == 'x' && local400.length() >= 3 && Static327.method4190(local400.substring(1, 3))) {
								local400 = local400.substring(1);
								local383 = true;
							}
							if (local400.equals("hd")) {
								local381 = true;
							} else {
								if (local400.startsWith("hd")) {
									local400 = local400.substring(2);
									local381 = true;
								}
								if (local400.length() >= 4 && Static327.method4190(local400.substring(0, 4))) {
									local379 = Static237.method3118(local400.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(467) Exception local467) {
					}
				}
				if (!local381 || local379 < 4000) {
					this.bf = false;
				}
				if (!local383 && !local381) {
					if (local379 >= 7000 && local379 <= 7999) {
						this.aBoolean374 = false;
					}
					if (local379 >= 7000 && local379 <= 9250) {
						this.aBoolean359 = false;
					}
				}
				this.aBoolean372 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean357 = this.aBoolean374;
			}
			if (this.aString45.indexOf("intel") != -1) {
				this.aBoolean363 = false;
			}
			this.aBoolean369 = !this.aString45.equals("s3 graphics");
			if (this.aBoolean374) {
				try {
					@Pc(544) int[] local544 = new int[1];
					OpenGL.glGenBuffersARB(1, local544, 0);
				} catch (@Pc(550) Throwable local550) {
					throw new RuntimeException("");
				}
			}
			Static139.method1854(false, true);
			this.aBoolean348 = true;
			this.aClass185_1 = new Class185(this, super.anInterface8_8);
			this.method3676();
			this.aClass161_1 = new Class161(this);
			this.aClass186_1 = new Class186(this);
			if (this.aClass186_1.method3907()) {
				this.aClass1_Sub4_Sub1_1 = new Class1_Sub4_Sub1(this);
				if (!this.aClass1_Sub4_Sub1_1.method882()) {
					this.aClass1_Sub4_Sub1_1.method871();
					this.aClass1_Sub4_Sub1_1 = null;
				}
			}
			this.aClass119_1 = new Class119(this);
			this.method3690();
			this.method3638();
			OpenGL.glClear(16640);
			local379 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(629) Exception local629) {
					if (local379++ > 5) {
						throw new RuntimeException("");
					}
					Static252.method2874(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(647) Throwable local647) {
			local647.printStackTrace();
			this.method3586();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!c;Lclient!po;Lclient!ia;Lclient!vk;I)V")
	@Override
	public void method3557(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8 arg3) {
		arg0.method5391(arg2, arg3, 0);
		this.method3587(arg1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!ap;)V")
	public void method3610(@OriginalArg(1) Interface2 arg0) {
		if (arg0 != this.anInterface2_4) {
			if (this.aBoolean374) {
				OpenGL.glBindBufferARB(34963, arg0.method4931());
			}
			this.anInterface2_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V")
	public void method3611(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean367 != arg0) {
			this.aBoolean367 = arg0;
			this.method3673();
		}
	}

	@OriginalMember(owner = "client!od", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return this.anInt4611 + this.anInt4612 + this.anInt4610;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!vk;I)V")
	@Override
	public void method3541(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class13_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method5391(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt4627 = 0;
		this.anInt4623 = this.anInt4562;
		this.anInt4648 = this.anInt4455;
		this.anInt4643 = 0;
		OpenGL.glDisable(3089);
		this.method3630();
	}

	@OriginalMember(owner = "client!od", name = "l", descriptor = "()Z")
	@Override
	public boolean method3570() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FIFF)V")
	private void method3612(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean371) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean371 = true;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(Z)V")
	private void method3613() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static252.method2874(1000L);
		}
	}

	@OriginalMember(owner = "client!od", name = "C", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method3609() {
		return new Class40_Sub2();
	}

	@OriginalMember(owner = "client!od", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class40 arg0) {
		this.aClass40_Sub2_3 = (Class40_Sub2) arg0;
		this.aClass40_Sub2_4.method1132(this.aClass40_Sub2_3);
		if (this.anInt4633 != 1) {
			this.method3674();
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	private void method3614() {
		if (this.anInt4648 >= this.anInt4627 && this.anInt4623 >= this.anInt4643) {
			OpenGL.glScissor(this.anInt4639 + this.anInt4627, -this.anInt4623 + this.anInt4562 + this.anInt4646, this.anInt4648 - this.anInt4627, -this.anInt4643 + this.anInt4623);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!od", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt4630;
		if (local15 || this.aFloat54 != arg1 || this.aFloat57 != arg2) {
			this.anInt4630 = arg0;
			this.aFloat57 = arg2;
			this.aFloat54 = arg1;
			if (local15) {
				this.aFloat58 = (float) (this.anInt4630 & 0xFF) / 255.0F;
				this.aFloat63 = (float) (this.anInt4630 & 0xFF00) / 65280.0F;
				this.aFloat69 = (float) (this.anInt4630 & 0xFF0000) / 1.671168E7F;
				this.method3631();
			}
			this.method3635();
		}
		if (this.aFloatArray21[0] == arg3 && this.aFloatArray21[1] == arg4 && arg5 == this.aFloatArray21[2]) {
			return;
		}
		this.aFloatArray21[1] = arg4;
		this.aFloatArray21[2] = arg5;
		this.aFloatArray21[0] = arg3;
		this.aFloatArray22[0] = -arg3;
		this.aFloatArray22[1] = -arg4;
		this.aFloatArray22[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray23[0] = arg3 * local142;
		this.aFloatArray23[2] = arg5 * local142;
		this.aFloatArray23[1] = local142 * arg4;
		this.aFloatArray20[1] = -this.aFloatArray23[1];
		this.aFloatArray20[2] = -this.aFloatArray23[2];
		this.aFloatArray20[0] = -this.aFloatArray23[0];
		this.method3678();
		this.anInt4635 = (int) (arg5 * 256.0F / arg4);
		this.anInt4628 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method3637();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method3653(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean365) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean365) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!ig;)V")
	public void method3615(@OriginalArg(1) Interface7 arg0) {
		if (this.anInt4609 < 0 || this.anInterface7Array3[this.anInt4609] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface7Array3[this.anInt4609--] = null;
		arg0.method1759();
		if (this.anInt4609 >= 0) {
			this.anInterface7_2 = this.anInterface7Array3[this.anInt4609];
			this.anInterface7_2.method1764();
		} else {
			this.anInterface7_2 = null;
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
	private void method3617() {
		@Pc(6) float[] local6 = this.aFloatArray19;
		@Pc(24) float local24 = (float) (-this.anInt4644 * this.anInt4620) / (float) this.anInt4616;
		@Pc(39) float local39 = (float) (this.anInt4620 * (this.anInt4455 - this.anInt4644)) / (float) this.anInt4616;
		@Pc(50) float local50 = (float) (this.anInt4620 * this.anInt4638) / (float) this.anInt4629;
		@Pc(65) float local65 = (float) ((this.anInt4638 - this.anInt4562) * this.anInt4620) / (float) this.anInt4629;
		if (local39 == local24 || local65 == local50) {
			local6[8] = 0.0F;
			local6[11] = 0.0F;
			local6[10] = 1.0F;
			local6[15] = 1.0F;
			local6[7] = 0.0F;
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[12] = 0.0F;
			local6[5] = 1.0F;
			local6[1] = 0.0F;
			local6[6] = 0.0F;
			local6[0] = 1.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
			local6[14] = 0.0F;
		} else {
			@Pc(145) float local145 = (float) this.anInt4620 * 2.0F;
			local6[9] = (local65 + local50) / (local50 - local65);
			local6[7] = 0.0F;
			local6[0] = local145 / (local39 - local24);
			local6[1] = 0.0F;
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[11] = -1.0F;
			local6[3] = 0.0F;
			local6[8] = (local24 + local39) / (local39 - local24);
			local6[14] = this.aFloat72 = -(local145 * (float) this.anInt4642) / (float) (this.anInt4642 - this.anInt4620);
			local6[15] = 0.0F;
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[5] = local145 / (local50 - local65);
			local6[10] = this.aFloat65 = (float) -(this.anInt4620 + this.anInt4642) / (float) (this.anInt4642 - this.anInt4620);
			local6[12] = 0.0F;
		}
		this.method3670();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)V")
	@Override
	public void method3598(@OriginalArg(0) boolean arg0) {
		this.aBoolean351 = arg0;
		this.method3655();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZ[BI)Lclient!ap;")
	public Interface2 method3618(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface2) (this.aBoolean374 && (!arg1 || this.aBoolean357) ? new Class34_Sub1(this, 5123, arg2, arg0, arg1) : new Class154_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	public synchronized void method3619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub6 local12 = new Class1_Sub6(arg1);
		local12.aLong226 = arg0;
		this.aClass254_30.method5430(local12);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass186_1.method3908(arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Lclient!c;Lclient!po;Lclient!ia;[Lclient!vk;I)V")
	@Override
	public void method3546(@OriginalArg(0) Class33[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class13_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method3541(arg0, arg2, arg3, arg4);
		this.method3587(arg1);
	}

	@OriginalMember(owner = "client!od", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3637();
		this.method3653(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3567(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable2.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) long local53 = this.anOpenGL1.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable2.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(II)I")
	public int method3620(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class49 method3572(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class49_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V")
	public void method3621(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean364) {
			this.aBoolean364 = arg0;
			this.method3673();
			this.anInt4624 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	public void method3622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4649 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(14) boolean local14 = false;
		if (this.anInt4621 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt4621 = arg1;
			local14 = true;
		}
		if (arg0 != this.anInt4613) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt4613 = arg0;
			local14 = true;
		}
		if (local14) {
			this.anInt4624 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!od", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg2 * this.aClass40_Sub2_3.aFloat12 + (float) arg0 * this.aClass40_Sub2_3.aFloat9 + (float) arg1 * this.aClass40_Sub2_3.aFloat19 + this.aClass40_Sub2_3.aFloat14;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass40_Sub2_3.aFloat14 + this.aClass40_Sub2_3.aFloat9 * (float) arg3 + (float) arg4 * this.aClass40_Sub2_3.aFloat19 + (float) arg5 * this.aClass40_Sub2_3.aFloat12;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt4620 > local28 && local59 < (float) this.anInt4620 || !(!((float) this.anInt4642 < local28) || !(local59 > (float) this.anInt4642))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg0 * this.aClass40_Sub2_3.aFloat16 + (float) arg1 * this.aClass40_Sub2_3.aFloat10 + this.aClass40_Sub2_3.aFloat18 * (float) arg2 + this.aClass40_Sub2_3.aFloat13) * (float) this.anInt4616 / local28);
		@Pc(155) int local155 = (int) ((this.aClass40_Sub2_3.aFloat13 + this.aClass40_Sub2_3.aFloat18 * (float) arg5 + this.aClass40_Sub2_3.aFloat10 * (float) arg4 + this.aClass40_Sub2_3.aFloat16 * (float) arg3) * (float) this.anInt4616 / local59);
		if ((float) local123 < this.aFloat68 && (float) local155 < this.aFloat68 || this.aFloat67 < (float) local123 && (float) local155 > this.aFloat67) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt4629 * (this.aClass40_Sub2_3.aFloat17 + this.aClass40_Sub2_3.aFloat11 * (float) arg2 + (float) arg0 * this.aClass40_Sub2_3.aFloat15 + (float) arg1 * this.aClass40_Sub2_3.aFloat20) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt4629 * (this.aClass40_Sub2_3.aFloat17 + (float) arg3 * this.aClass40_Sub2_3.aFloat15 + this.aClass40_Sub2_3.aFloat20 * (float) arg4 + (float) arg5 * this.aClass40_Sub2_3.aFloat11) / local59);
			return (!(this.aFloat60 > (float) local213) || !((float) local245 < this.aFloat60)) && (!(this.aFloat66 < (float) local213) || !(this.aFloat66 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!od", name = "s", descriptor = "()Z")
	@Override
	public boolean method3589() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat73;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLclient!jaggl/memory/NativeBuffer;II)Lclient!nc;")
	public Interface10 method3623(@OriginalArg(0) int arg0, @OriginalArg(2) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface10) (this.aBoolean374 ? new Class34_Sub2(this, arg2, arg1, arg0, false) : new Class154_Sub1(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method3599(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method3624(@OriginalArg(0) Interface7 arg0) {
		if (this.aBoolean353) {
			this.method3615(arg0);
			this.method3625(arg0);
		} else if (this.anInt4607 >= 0 && this.anInterface7Array2[this.anInt4607] == arg0) {
			this.anInterface7Array2[this.anInt4607--] = null;
			arg0.method1762();
			if (this.anInt4607 < 0) {
				this.anInterface7_2 = this.anInterface7_1 = null;
			} else {
				this.anInterface7_2 = this.anInterface7_1 = this.anInterface7Array2[this.anInt4607];
				this.anInterface7_2.method1761();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ig;Z)V")
	public void method3625(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt4608 < 0 || this.anInterface7Array1[this.anInt4608] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface7Array1[this.anInt4608--] = null;
		arg0.method1760();
		if (this.anInt4608 >= 0) {
			this.anInterface7_1 = this.anInterface7Array1[this.anInt4608];
			this.anInterface7_1.method1763();
		} else {
			this.anInterface7_1 = null;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIII)V")
	public void method3626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(6) int local6 = this.anInt4647;
		this.anInt4647 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILclient!ap;B)V")
	public void method3627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2) {
		@Pc(7) int local7 = arg2.method4933();
		@Pc(14) int local14 = arg1 * this.method3632(local7);
		this.method3610(arg2);
		OpenGL.glDrawElements(4, arg0, local7, arg2.method4930() + (long) local14);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!ig;I)V")
	public void method3628(@OriginalArg(0) Interface7 arg0) {
		if (this.aBoolean353) {
			this.method3671(arg0);
			this.method3660(arg0);
		} else if (this.anInt4607 < 3) {
			if (this.anInt4607 >= 0) {
				this.anInterface7Array2[this.anInt4607].method1762();
			}
			this.anInterface7_2 = this.anInterface7_1 = this.anInterface7Array2[++this.anInt4607] = arg0;
			this.anInterface7_2.method1761();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[Lclient!kt;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass1_Sub24Array2[local3] = arg1[local3];
		}
		this.anInt4637 = arg0;
		if (this.anInt4633 != 1) {
			this.method3644();
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(II)V")
	public synchronized void method3629(@OriginalArg(0) int arg0) {
		@Pc(15) Class1 local15 = new Class1();
		local15.aLong226 = arg0;
		this.aClass254_34.method5430(local15);
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
	private void method3630() {
		this.aFloat60 = this.anInt4643 - this.anInt4638;
		this.aFloat67 = this.anInt4648 - this.anInt4644;
		this.aFloat68 = this.anInt4627 - this.anInt4644;
		this.aFloat66 = this.anInt4623 - this.anInt4638;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(B)V")
	private void method3631() {
		Static334.aFloatArray26[0] = this.aFloat59 * this.aFloat69;
		Static334.aFloatArray26[2] = this.aFloat58 * this.aFloat59;
		Static334.aFloatArray26[1] = this.aFloat59 * this.aFloat63;
		Static334.aFloatArray26[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static334.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIF)Lclient!kt;")
	@Override
	public Class1_Sub24 method3577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub24_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method3599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3637();
		this.method3653(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIIII)Lclient!tl;")
	@Override
	public Class9 method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean368 ? new Class9_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!od", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat62;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(II)I")
	public int method3632(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)V")
	public void method3633() {
		if (this.anInt4624 == 8) {
			return;
		}
		this.method3681();
		this.method3656(true);
		this.method3659(true);
		this.method3668(true);
		this.method3653(1);
		this.method3677(0);
		this.anInt4624 = 8;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V")
	public synchronized void method3634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub6 local14 = new Class1_Sub6(arg1);
		local14.aLong226 = arg0;
		this.aClass254_33.method5430(local14);
	}

	@OriginalMember(owner = "client!od", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4645 == arg0 && this.anInt4636 == arg1 && this.anInt4650 == arg2) {
			return;
		}
		this.anInt4650 = arg2;
		this.anInt4645 = arg0;
		this.anInt4636 = arg1;
		if (!this.aBoolean356) {
			this.method3658();
			this.method3675();
		}
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "(I)V")
	private void method3635() {
		Static334.aFloatArray26[0] = this.aFloat54 * this.aFloat69;
		Static334.aFloatArray26[1] = this.aFloat63 * this.aFloat54;
		Static334.aFloatArray26[3] = 1.0F;
		Static334.aFloatArray26[2] = this.aFloat54 * this.aFloat58;
		OpenGL.glLightfv(16384, 4609, Static334.aFloatArray26, 0);
		Static334.aFloatArray26[1] = -this.aFloat57 * this.aFloat63;
		Static334.aFloatArray26[0] = this.aFloat69 * -this.aFloat57;
		Static334.aFloatArray26[2] = this.aFloat58 * -this.aFloat57;
		Static334.aFloatArray26[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static334.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	@Override
	public void method3550(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!od", name = "j", descriptor = "(I)V")
	private void method3636() {
		OpenGL.glViewport(this.anInt4639, this.anInt4646, this.anInt4455, this.anInt4562);
	}

	@OriginalMember(owner = "client!od", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3637();
		this.method3653(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(B)V")
	private void method3637() {
		if (this.anInt4624 == 1) {
			return;
		}
		this.method3679();
		this.method3656(false);
		this.method3621(false);
		this.method3659(false);
		this.method3668(false);
		this.method3691(null);
		this.method3652(-2);
		this.method3677(1);
		this.anInt4624 = 1;
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(B)V")
	private void method3638() {
		if (this.aCanvas8 == null) {
			this.anInt4441 = this.anInt4536 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas8.getSize();
			this.anInt4536 = local14.height;
			this.anInt4441 = local14.width;
		}
		if (this.anInterface7_1 == null) {
			this.anInt4455 = this.anInt4441;
			this.anInt4562 = this.anInt4536;
			this.method3636();
		}
		this.method3643();
		this.va();
	}

	@OriginalMember(owner = "client!od", name = "m", descriptor = "()Z")
	@Override
	public boolean method3573() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method3601(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aNativeHeap2 = ((Class1_Sub14_Sub1) arg0).aNativeHeap1;
		if (this.anInterface10_5 != null) {
			return;
		}
		@Pc(16) Class1_Sub11_Sub2 local16 = new Class1_Sub11_Sub2(80);
		if (this.aBoolean360) {
			local16.method4507(-1.0F);
			local16.method4507(-1.0F);
			local16.method4507(0.0F);
			local16.method4507(0.0F);
			local16.method4507(1.0F);
			local16.method4507(1.0F);
			local16.method4507(-1.0F);
			local16.method4507(0.0F);
			local16.method4507(1.0F);
			local16.method4507(1.0F);
			local16.method4507(1.0F);
			local16.method4507(1.0F);
			local16.method4507(0.0F);
			local16.method4507(1.0F);
			local16.method4507(0.0F);
			local16.method4507(-1.0F);
			local16.method4507(1.0F);
			local16.method4507(0.0F);
			local16.method4507(0.0F);
			local16.method4507(0.0F);
		} else {
			local16.method4509(-1.0F);
			local16.method4509(-1.0F);
			local16.method4509(0.0F);
			local16.method4509(0.0F);
			local16.method4509(1.0F);
			local16.method4509(1.0F);
			local16.method4509(-1.0F);
			local16.method4509(0.0F);
			local16.method4509(1.0F);
			local16.method4509(1.0F);
			local16.method4509(1.0F);
			local16.method4509(1.0F);
			local16.method4509(0.0F);
			local16.method4509(1.0F);
			local16.method4509(0.0F);
			local16.method4509(-1.0F);
			local16.method4509(1.0F);
			local16.method4509(0.0F);
			local16.method4509(0.0F);
			local16.method4509(0.0F);
		}
		this.anInterface10_5 = this.method3657(20, local16.anInt5766, false, local16.aByteArray64);
		this.aClass21_7 = new Class21(this.anInterface10_5, 5126, 3, 0);
		this.aClass21_8 = new Class21(this.anInterface10_5, 5126, 2, 12);
		this.aClass17_1.method384(this);
	}

	@OriginalMember(owner = "client!od", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean356) {
			throw new RuntimeException("");
		}
		this.anInt4632 = arg1;
		this.anInt4619 = arg0;
		this.anInt4615 = arg3;
		this.anInt4640 = arg2;
		this.aClass119_1.aClass84_Sub5_1.method3035();
		this.method3658();
	}

	@OriginalMember(owner = "client!od", name = "n", descriptor = "()Z")
	@Override
	public boolean method3581() {
		return this.aBoolean365 && (!this.method3536() || this.aBoolean370);
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "(B)V")
	public void method3639() {
		if (this.anInt4624 == 4) {
			return;
		}
		this.method3679();
		this.method3656(false);
		this.method3621(false);
		this.method3659(false);
		this.method3668(false);
		this.method3652(-2);
		this.method3653(1);
		this.method3677(0);
		this.anInt4624 = 4;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class59 method3585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static200.method2720(arg2, arg0, arg3, this, arg1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	@Override
	public void method3555(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!od", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt4562 - arg1 - local12, arg2, 1, 32993, this.anInt4641, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!dj;I)V")
	public void method3640(@OriginalArg(0) Class40_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method1129(), 0);
	}

	@OriginalMember(owner = "client!od", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.method3653(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!od", name = "k", descriptor = "(I)V")
	private void method3641() {
		if (this.anInt4633 != 3) {
			this.anInt4633 = 3;
			this.method3686();
			this.method3674();
			this.anInt4624 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!od", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class59_Sub1 local6 = (Class59_Sub1) arg1;
		@Pc(9) Class5_Sub1_Sub1 local9 = local6.aClass5_Sub1_Sub1_1;
		this.method3672();
		this.method3691(local6.aClass5_Sub1_Sub1_1);
		this.method3653(1);
		this.method3622(8448, 7681);
		this.method3647(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat98 / (float) local9.anInt7347;
		@Pc(46) float local46 = local9.aFloat100 / (float) local9.anInt7346;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4627 - arg2), local46 * (float) (this.anInt4643 - arg3));
		OpenGL.glVertex2i(this.anInt4627, this.anInt4643);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4627 - arg2), (float) (this.anInt4623 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4627, this.anInt4623);
		OpenGL.glTexCoord2f((float) (this.anInt4648 - arg2) * local39, (float) (this.anInt4623 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4648, this.anInt4623);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4648 - arg2), (float) (this.anInt4643 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4648, this.anInt4643);
		OpenGL.glEnd();
		this.method3647(5890, 768, 0);
	}

	@OriginalMember(owner = "client!od", name = "p", descriptor = "()Z")
	@Override
	public boolean method3584() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4615 = arg3;
		this.aBoolean356 = true;
		this.anInt4640 = arg2;
		this.anInt4619 = arg0;
		this.anInt4632 = arg1;
		this.aClass119_1.method2404(false, 3, false);
		this.aClass119_1.aClass84_Sub5_1.method3035();
		this.method3658();
		this.method3675();
	}

	@OriginalMember(owner = "client!od", name = "j", descriptor = "(B)Lclient!rc;")
	public Class5_Sub4 method3642() {
		return this.aClass9_Sub1_1 == null ? null : this.aClass9_Sub1_1.method1534();
	}

	@OriginalMember(owner = "client!od", name = "v", descriptor = "()Z")
	@Override
	public boolean method3597() {
		if (this.aClass1_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub4_Sub1_1.method868()) {
			if (!this.aClass186_1.method3904(this.aClass1_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass185_1.method3897();
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
		this.anInt4606 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt4606++;
		}
		this.anInt4605 = 0x1 << this.anInt4606;
	}

	@OriginalMember(owner = "client!od", name = "l", descriptor = "(I)V")
	public void method3643() {
		if (this.anInt4633 != 0) {
			this.anInt4633 = 0;
			this.anInt4624 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!po;)V")
	@Override
	public void method3587(@OriginalArg(0) Class194 arg0) {
		this.aClass17_1.method385(arg0, this);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class163 method3560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class163_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	@Override
	public void method3535() {
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "()V")
	@Override
	public void method3542() {
		this.aClass186_1.method3910();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3544(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub6 local19;
		while (!this.aClass254_30.method5444()) {
			local19 = (Class1_Sub6) this.aClass254_30.method5436();
			Static295.anIntArray262[local11++] = (int) local19.aLong226;
			this.anInt4612 -= local19.anInt796;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static295.anIntArray262, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static295.anIntArray262, 0);
			local11 = 0;
		}
		while (!this.aClass254_31.method5444()) {
			local19 = (Class1_Sub6) this.aClass254_31.method5436();
			Static295.anIntArray262[local11++] = (int) local19.aLong226;
			this.anInt4610 -= local19.anInt796;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static295.anIntArray262, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static295.anIntArray262, 0);
			local11 = 0;
		}
		while (!this.aClass254_32.method5444()) {
			local19 = (Class1_Sub6) this.aClass254_32.method5436();
			Static295.anIntArray262[local11++] = local19.anInt796;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static295.anIntArray262, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static295.anIntArray262, 0);
			local11 = 0;
		}
		while (!this.aClass254_33.method5444()) {
			local19 = (Class1_Sub6) this.aClass254_33.method5436();
			Static295.anIntArray262[local11++] = (int) local19.aLong226;
			this.anInt4611 -= local19.anInt796;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static295.anIntArray262, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static295.anIntArray262, 0);
		}
		while (!this.aClass254_29.method5444()) {
			local19 = (Class1_Sub6) this.aClass254_29.method5436();
			OpenGL.glDeleteLists((int) local19.aLong226, local19.anInt796);
		}
		@Pc(214) Class1 local214;
		while (!this.aClass254_34.method5444()) {
			local214 = this.aClass254_34.method5436();
			OpenGL.glDeleteProgramARB((int) local214.aLong226);
		}
		while (!this.aClass254_35.method5444()) {
			local214 = this.aClass254_35.method5436();
			OpenGL.glDeleteObjectARB(local214.aLong226);
		}
		while (!this.aClass254_29.method5444()) {
			local19 = (Class1_Sub6) this.aClass254_29.method5436();
			OpenGL.glDeleteLists((int) local19.aLong226, local19.anInt796);
		}
		this.aClass185_1.method3892();
		if (this.FA() > 100663296 && Static232.method3058() > this.aLong146 + 60000L) {
			System.gc();
			this.aLong146 = Static232.method3058();
		}
		this.anInt4604 = local9;
	}

	@OriginalMember(owner = "client!od", name = "m", descriptor = "(I)V")
	private void method3644() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt4637; local7++) {
			@Pc(14) Class1_Sub24 local14 = this.aClass1_Sub24Array2[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static112.aFloatArray5[0] = local14.method4367();
			Static112.aFloatArray5[1] = local14.method4376();
			Static112.aFloatArray5[2] = local14.method4369();
			Static112.aFloatArray5[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static112.aFloatArray5, 0);
			@Pc(52) int local52 = local14.method4373();
			@Pc(58) float local58 = local14.method4371() / 255.0F;
			Static112.aFloatArray5[1] = (float) (local52 >> 8 & 0xFF) * local58;
			Static112.aFloatArray5[2] = local58 * (float) (local52 & 0xFF);
			Static112.aFloatArray5[0] = local58 * (float) (local52 >> 16 & 0xFF);
			OpenGL.glLightfv(local18, 4609, Static112.aFloatArray5, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method4374() * local14.method4374()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt4651) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt4651 = this.anInt4637;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IIII)V")
	public void method3645(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(II)V")
	public void method3646(@OriginalArg(0) int arg0) {
		Static334.aFloatArray26[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static334.aFloatArray26[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static334.aFloatArray26[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static334.aFloatArray26[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static334.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Lclient!l;")
	@Override
	public Class1_Sub14 method3538() {
		@Pc(8) Class1_Sub14_Sub1 local8 = new Class1_Sub14_Sub1(78643200);
		this.aClass254_28.method5430(local8);
		return local8;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt4620;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(IIII)V")
	public void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
	@Override
	public void method3566(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!od", name = "k", descriptor = "(B)V")
	private void method3648() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray19, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!od", name = "n", descriptor = "(I)V")
	private void method3649() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!od", name = "o", descriptor = "(I)I")
	private int method3650() {
		this.aString45 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString44 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString45.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString45.indexOf("brian paul") != -1 || this.aString45.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static150.method2106(local47.replace('.', ' '), ' ');
		if (local55.length >= 2) {
			try {
				@Pc(65) int local65 = Static237.method3118(local55[0]);
				@Pc(71) int local71 = Static237.method3118(local55[1]);
				this.anInt4617 = local71 + local65 * 10;
			} catch (@Pc(80) NumberFormatException local80) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt4617 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt4625 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt4634 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt4631 = local119[0];
		if (this.anInt4625 < 2 || this.anInt4634 < 2 || this.anInt4631 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean360 = NativeStream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean374 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean365 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean352 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean361 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean366 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean359 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean372 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean368 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.bf = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean362 = false;
		this.aBoolean363 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean353 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean373 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean370 = this.aBoolean373 & this.aBoolean353;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!od", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(6) int local6 = this.anInt4618;
		this.anInt4618 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3549(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.aLong145;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable2.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas8 == arg0) {
			this.method3638();
		}
	}

	@OriginalMember(owner = "client!od", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.aBoolean356 = false;
		this.aClass119_1.method2404(false, 0, false);
		this.method3658();
		this.method3675();
	}

	@OriginalMember(owner = "client!od", name = "B", descriptor = "()Z")
	@Override
	public boolean method3608() {
		return this.aClass1_Sub4_Sub1_1 != null && (this.anInt4603 <= 1 || this.aBoolean370);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZZ)V")
	public void method3651(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt4622) {
			if (arg0 < 0) {
				this.method3665();
				this.method3691(null);
				this.method3677(0);
				if (!this.aBoolean356) {
					this.aClass119_1.method2404(arg2, 0, arg1);
				}
			} else {
				@Pc(20) Class5_Sub1 local20 = this.aClass185_1.method3894(arg0);
				@Pc(26) Class201 local26 = super.anInterface8_8.method1375(arg0);
				if (local26.aByte60 == 0 && local26.aByte59 == 0) {
					this.method3665();
				} else {
					@Pc(50) int local50 = local26.aBoolean431 ? 64 : 128;
					@Pc(54) int local54 = local50 * 50;
					this.method3612(0.0F, (float) (this.anInt4604 % local54 * local26.aByte60) / (float) local54, (float) (this.anInt4604 % local54 * local26.aByte59) / (float) local54);
				}
				if (this.aBoolean356) {
					this.aClass119_1.method2404(arg2, 3, arg1);
					this.method3691(local20);
					this.method3677(local26.anInt5367);
				} else {
					this.aClass119_1.method2404(arg2, local26.aByte61, arg1);
					this.aClass119_1.method2403(local26.anInt5366, local26.aByte64);
					if (!this.aClass119_1.method2407(local26.anInt5367, local20)) {
						this.method3691(local20);
						this.method3677(local26.anInt5367);
					}
				}
			}
			this.anInt4622 = arg0;
		}
		this.anInt4624 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3578(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method3637();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method3653(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean365) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean365) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(II)V")
	public void method3652(@OriginalArg(1) int arg0) {
		this.method3663(arg0, true);
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "(II)V")
	public void method3653(@OriginalArg(0) int arg0) {
		if (this.anInt4626 == arg0) {
			return;
		}
		@Pc(30) boolean local30;
		@Pc(32) byte local32;
		if (arg0 == 1) {
			local32 = 1;
			local30 = true;
		} else if (arg0 == 2) {
			local32 = 2;
			local30 = false;
		} else if (arg0 == 128) {
			local32 = 3;
			local30 = true;
		} else {
			local30 = false;
			local32 = 0;
		}
		if (!this.aBoolean354) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean354 = true;
		}
		if (this.aBoolean358 != local30) {
			if (local30) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean358 = local30;
		}
		if (this.anInt4614 != local32) {
			if (local32 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local32 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local32 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt4614 = local32;
		}
		this.anInt4626 = arg0;
		this.anInt4624 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FBF)V")
	public void method3654(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat55 = arg0;
		this.aFloat64 = arg1;
		if (!this.aBoolean356) {
			this.method3658();
		}
	}

	@OriginalMember(owner = "client!od", name = "l", descriptor = "(B)V")
	private void method3655() {
		OpenGL.glDepthMask(this.aBoolean349 && this.aBoolean351);
	}

	@OriginalMember(owner = "client!od", name = "j", descriptor = "()I")
	@Override
	public int method3558() {
		return 4;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	@Override
	public void method3590(@OriginalArg(0) int arg0) {
		this.method3649();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IZ)V")
	public void method3656(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean350 != arg0) {
			this.aBoolean350 = arg0;
			this.method3675();
			this.anInt4624 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!od", name = "y", descriptor = "()Z")
	@Override
	public boolean method3603() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "()Z")
	@Override
	public boolean method3545() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class49 method3564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class49_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	@Override
	public void method3592(@OriginalArg(0) int arg0) {
		this.method3613();
	}

	@OriginalMember(owner = "client!od", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(45) float local45;
		if (this.aClass5_Sub1_Sub1_2 == null || this.aClass5_Sub1_Sub1_2.anInt7338 < arg2 || this.aClass5_Sub1_Sub1_2.anInt7341 < arg3) {
			this.aClass5_Sub1_Sub1_2 = Static16.method2731(this, arg3, arg2, arg6);
			this.aClass5_Sub1_Sub1_2.method5547(false, false);
			local41 = this.aClass5_Sub1_Sub1_2.aFloat100;
			local45 = this.aClass5_Sub1_Sub1_2.aFloat98;
		} else {
			this.aClass5_Sub1_Sub1_2.method5541(arg6, arg3, arg2, 6406, false);
			local41 = this.aClass5_Sub1_Sub1_2.aFloat100 * (float) arg3 / (float) this.aClass5_Sub1_Sub1_2.anInt7341;
			local45 = (float) arg2 * this.aClass5_Sub1_Sub1_2.aFloat98 / (float) this.aClass5_Sub1_Sub1_2.anInt7338;
		}
		this.method3672();
		this.method3691(this.aClass5_Sub1_Sub1_2);
		this.method3653(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3646(arg5);
		this.method3622(34165, 34165);
		this.method3647(34166, 768, 0);
		this.method3647(5890, 770, 2);
		this.method3626(0, 34166);
		this.method3626(2, 5890);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		@Pc(160) float local160 = local150 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local41, local45);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method3647(5890, 768, 0);
		this.method3647(34166, 770, 2);
		this.method3626(0, 5890);
		this.method3626(2, 34166);
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	@Override
	public void method3606(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt4602 = arg0;
		this.aClass185_1.method3897();
	}

	@OriginalMember(owner = "client!od", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4643;
		arg0[2] = this.anInt4648;
		arg0[0] = this.anInt4627;
		arg0[3] = this.anInt4623;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIZ[B)Lclient!nc;")
	public Interface10 method3657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface10) (this.aBoolean374 && (!arg2 || this.aBoolean357) ? new Class34_Sub2(this, arg0, arg3, arg1, arg2) : new Class154_Sub1(this, arg0, arg3, arg1));
	}

	@OriginalMember(owner = "client!od", name = "p", descriptor = "(I)V")
	private void method3658() {
		@Pc(58) int local58;
		if (this.aBoolean356) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local58 = this.anInt4632;
		} else {
			this.aFloat53 = (float) (this.anInt4642 - this.anInt4650) - this.aFloat64;
			this.aFloat56 = this.aFloat53 - (float) this.anInt4636 * this.aFloat55;
			if (this.aFloat56 < (float) this.anInt4620) {
				this.aFloat56 = this.anInt4620;
			}
			OpenGL.glFogf(2915, this.aFloat56);
			OpenGL.glFogf(2916, this.aFloat53);
			local58 = this.anInt4645;
		}
		Static334.aFloatArray26[2] = (float) (local58 & 0xFF) / 255.0F;
		Static334.aFloatArray26[1] = (float) (local58 & 0xFF00) / 65280.0F;
		Static334.aFloatArray26[0] = (float) (local58 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static334.aFloatArray26, 0);
		if (this.aBoolean356) {
			this.aClass119_1.aClass84_Sub5_1.method3030();
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IZ)V")
	public void method3659(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean355) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt4624 &= 0xFFFFFFE0;
		this.aBoolean355 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ig;B)V")
	public void method3660(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt4608 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4608 >= 0) {
			this.anInterface7Array1[this.anInt4608].method1760();
		}
		this.anInterface7_1 = this.anInterface7Array1[++this.anInt4608] = arg0;
		this.anInterface7_1.method1763();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FIFFF)V")
	public void method3661(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static334.aFloatArray26[3] = arg3;
		Static334.aFloatArray26[0] = arg1;
		Static334.aFloatArray26[2] = arg0;
		Static334.aFloatArray26[1] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static334.aFloatArray26, 0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BJ)V")
	public synchronized void method3662(@OriginalArg(1) long arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong226 = arg0;
		this.aClass254_35.method5430(local7);
	}

	@OriginalMember(owner = "client!od", name = "x", descriptor = "()Lclient!ia;")
	@Override
	public Class40 method3600() {
		return this.aClass40_Sub2_1;
	}

	@OriginalMember(owner = "client!od", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIZ)V")
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method3651(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!bg;Lclient!bg;Lclient!bg;Lclient!bg;)V")
	public void method3664(@OriginalArg(1) Class21 arg0, @OriginalArg(2) Class21 arg1, @OriginalArg(3) Class21 arg2, @OriginalArg(4) Class21 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3688(arg3.anInterface10_2);
			OpenGL.glVertexPointer(arg3.aByte5, arg3.aShort1, this.anInterface10_4.method4284(), this.anInterface10_4.method4282() + (long) arg3.aByte4);
			OpenGL.glEnableClientState(32884);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3688(arg2.anInterface10_2);
			OpenGL.glNormalPointer(arg2.aShort1, this.anInterface10_4.method4284(), this.anInterface10_4.method4282() + (long) arg2.aByte4);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3688(arg1.anInterface10_2);
			OpenGL.glColorPointer(arg1.aByte5, arg1.aShort1, this.anInterface10_4.method4284(), this.anInterface10_4.method4282() + (long) arg1.aByte4);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3688(arg0.anInterface10_2);
			OpenGL.glTexCoordPointer(arg0.aByte5, arg0.aShort1, this.anInterface10_4.method4284(), this.anInterface10_4.method4282() + (long) arg0.aByte4);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!od", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt4620 && this.anInt4642 == arg1) {
			return;
		}
		this.anInt4642 = arg1;
		this.anInt4620 = arg0;
		this.method3617();
		this.method3658();
		if (this.anInt4633 == 3) {
			this.method3686();
			return;
		}
		if (this.anInt4633 != 2) {
			return;
		}
		this.method3648();
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(Z)V")
	private void method3665() {
		if (this.aBoolean371) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean371 = false;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method3591() {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FB)V")
	public void method3666(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat71) {
			this.aFloat71 = arg0;
			if (this.anInt4633 == 3) {
				this.method3686();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "j", descriptor = "(II)V")
	public void method3667(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt4649) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt4649 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(IZ)V")
	public void method3668(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean349 != arg0) {
			this.aBoolean349 = arg0;
			this.method3655();
			this.anInt4624 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!od", name = "q", descriptor = "(I)V")
	public void method3669() {
		if (this.anInt4624 == 16) {
			return;
		}
		this.method3641();
		this.method3656(true);
		this.method3659(true);
		this.method3668(true);
		this.method3653(1);
		this.method3677(0);
		this.anInt4624 = 16;
	}

	@OriginalMember(owner = "client!od", name = "r", descriptor = "(I)V")
	private void method3670() {
		if (this.aFloat62 == 0.0F) {
			this.aFloatArray19[10] = this.aFloat65;
			this.aFloatArray19[14] = this.aFloat72;
		} else {
			@Pc(27) float local27 = this.aFloat73 / (this.aFloat73 + this.aFloat62);
			@Pc(31) float local31 = local27 * local27;
			@Pc(48) float local48 = (1.0F - local27) * -this.aFloat72 * (1.0F - local27) / this.aFloat62;
			this.aFloatArray19[14] = local31 * this.aFloat72;
			this.aFloatArray19[10] = this.aFloat65 + local48;
		}
		this.aFloat70 = (float) this.anInt4642 - this.aFloat62;
		this.aFloat61 = ((float) -this.anInt4642 + this.aFloatArray19[14]) / this.aFloatArray19[10];
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!ig;B)V")
	public void method3671(@OriginalArg(0) Interface7 arg0) {
		if (this.anInt4609 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4609 >= 0) {
			this.anInterface7Array3[this.anInt4609].method1759();
		}
		this.anInterface7_2 = this.anInterface7Array3[++this.anInt4609] = arg0;
		this.anInterface7_2.method1764();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!tl;)V")
	@Override
	public void method3576(@OriginalArg(0) Class9 arg0) {
		this.aClass9_Sub1_1 = (Class9_Sub1) arg0;
	}

	@OriginalMember(owner = "client!od", name = "m", descriptor = "(B)V")
	public void method3672() {
		if (this.anInt4624 == 2) {
			return;
		}
		this.method3679();
		this.method3656(false);
		this.method3621(false);
		this.method3659(false);
		this.method3668(false);
		this.method3652(-2);
		this.anInt4624 = 2;
	}

	@OriginalMember(owner = "client!od", name = "q", descriptor = "()V")
	@Override
	protected void method3586() {
		for (@Pc(6) Class1 local6 = this.aClass254_28.method5437(); local6 != null; local6 = this.aClass254_28.method5433()) {
			((Class1_Sub14_Sub1) local6).method1513();
		}
		if (this.aClass186_1 != null) {
			this.aClass186_1.method3906();
		}
		if (this.anOpenGL1 != null) {
			this.method3649();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean348) {
			Static366.method4763(false, true);
			this.aBoolean348 = false;
		}
	}

	@OriginalMember(owner = "client!od", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt4642;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(Z)V")
	private void method3673() {
		if (this.aBoolean364 && !this.aBoolean367) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!od", name = "n", descriptor = "(B)V")
	private void method3674() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass40_Sub2_3.method1129(), 0);
		if (this.aBoolean356) {
			this.aClass119_1.aClass84_Sub5_1.method3035();
		}
		this.method3678();
		this.method3644();
	}

	@OriginalMember(owner = "client!od", name = "s", descriptor = "(I)V")
	private void method3675() {
		if (this.aBoolean350 && this.anInt4636 >= 0 | this.aBoolean356) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!tl;Lclient!tl;FLclient!tl;)Lclient!tl;")
	@Override
	public Class9 method3579(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class9 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean368 && this.aBoolean363 && this.aBoolean353) {
			@Pc(18) Class9_Sub1_Sub2 local18 = null;
			@Pc(21) Class9_Sub1 local21 = (Class9_Sub1) arg0;
			@Pc(24) Class9_Sub1 local24 = (Class9_Sub1) arg1;
			@Pc(28) Class5_Sub4 local28 = local21.method1534();
			@Pc(32) Class5_Sub4 local32 = local24.method1534();
			if (local28 != null && local32 != null) {
				@Pc(47) int local47 = local32.anInt5595 >= local28.anInt5595 ? local32.anInt5595 : local28.anInt5595;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class9_Sub1_Sub2) {
					@Pc(59) Class9_Sub1_Sub2 local59 = (Class9_Sub1_Sub2) arg3;
					if (local59.method1539() == local47) {
						local18 = local59;
					}
				}
				if (local18 == null) {
					local18 = new Class9_Sub1_Sub2(this, local47);
				}
				if (local18.method1537(arg2, local28, local32)) {
					return local18;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method3559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class59_Sub1 local6 = (Class59_Sub1) arg5;
		@Pc(9) Class5_Sub1_Sub1 local9 = local6.aClass5_Sub1_Sub1_1;
		this.method3672();
		this.method3691(local6.aClass5_Sub1_Sub1_1);
		this.method3653(1);
		this.method3622(8448, 7681);
		this.method3647(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat98 / (float) local9.anInt7347;
		@Pc(46) float local46 = local9.aFloat100 / (float) local9.anInt7346;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method3647(5890, 768, 0);
	}

	@OriginalMember(owner = "client!od", name = "t", descriptor = "(I)V")
	private void method3676() {
		this.aClass40_Sub2_3 = new Class40_Sub2();
		this.aClass40_Sub2_4 = new Class40_Sub2();
		this.aClass5Array1 = new Class5[this.anInt4625];
		this.aClass5_Sub1_4 = new Class5_Sub1(this, 3553, 6408, 1, 1);
		this.aClass5_Sub1_5 = new Class5_Sub1(this, 3553, 6408, 1, 1);
		this.aClass5_Sub1_6 = new Class5_Sub1(this, 3553, 6408, 1, 1);
		this.aClass33_Sub2_9 = new Class33_Sub2(this);
		this.aClass33_Sub2_8 = new Class33_Sub2(this);
		this.aClass33_Sub2_10 = new Class33_Sub2(this);
		this.aClass33_Sub2_1 = new Class33_Sub2(this);
		this.aClass33_Sub2_3 = new Class33_Sub2(this);
		this.aClass33_Sub2_4 = new Class33_Sub2(this);
		this.aClass33_Sub2_5 = new Class33_Sub2(this);
		this.aClass33_Sub2_6 = new Class33_Sub2(this);
		this.aClass33_Sub2_2 = new Class33_Sub2(this);
		this.aClass33_Sub2_7 = new Class33_Sub2(this);
		if (this.aBoolean363) {
			this.aClass87_4 = new Class87(this);
			this.aClass87_3 = new Class87(this);
		}
	}

	@OriginalMember(owner = "client!od", name = "k", descriptor = "(II)V")
	public void method3677(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3622(7681, 7681);
		} else if (arg0 == 0) {
			this.method3622(8448, 8448);
		} else if (arg0 == 2) {
			this.method3622(7681, 34165);
		} else if (arg0 == 3) {
			this.method3622(8448, 260);
		} else if (arg0 == 4) {
			this.method3622(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "u", descriptor = "(I)V")
	public void method3678() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray23, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!od", name = "v", descriptor = "(I)V")
	private void method3679() {
		if (this.anInt4633 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt4455 > 0 && this.anInt4562 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt4455, (double) this.anInt4562, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt4633 = 1;
		this.anInt4624 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!gu;Z)Lclient!f;")
	@Override
	public Class49 method3540(@OriginalArg(0) Class100 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt2454 * arg0.anInt2451];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray23 == null) {
			for (local21 = 0; local21 < arg0.anInt2454; local21++) {
				for (local25 = 0; local25 < arg0.anInt2451; local25++) {
					@Pc(87) int local87 = arg0.anIntArray118[arg0.aByteArray22[local14++] & 0xFF];
					local12[local16++] = local87 == 0 ? 0 : local87 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2454; local21++) {
				for (local25 = 0; local25 < arg0.anInt2451; local25++) {
					local12[local16++] = arg0.anIntArray118[arg0.aByteArray22[local14] & 0xFF] | arg0.aByteArray23[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(123) Class49 local123 = this.method3572(local12, arg0.anInt2451, arg0.anInt2451, arg0.anInt2454);
		local123.ka(arg0.anInt2452, arg0.anInt2449, arg0.anInt2453, arg0.anInt2450);
		return local123;
	}

	@OriginalMember(owner = "client!od", name = "w", descriptor = "(I)V")
	public void method3680() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!od", name = "o", descriptor = "(B)V")
	private void method3681() {
		if (this.anInt4633 != 2) {
			this.anInt4633 = 2;
			this.method3648();
			this.method3674();
			this.anInt4624 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "()V")
	@Override
	public void method3548() {
		if (this.aClass1_Sub4_Sub1_1 != null && this.aClass1_Sub4_Sub1_1.method868()) {
			this.aClass186_1.method3911(this.aClass1_Sub4_Sub1_1);
			this.aClass185_1.method3897();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	@Override
	public void method3534() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method3574(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method3534();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
	@Override
	public int method3554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIZ)V")
	public synchronized void method3682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub6 local8 = new Class1_Sub6(arg0);
		local8.aLong226 = arg1;
		this.aClass254_31.method5430(local8);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V")
	public synchronized void method3683(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub6 local16 = new Class1_Sub6(arg0);
		this.aClass254_32.method5430(local16);
	}

	@OriginalMember(owner = "client!od", name = "o", descriptor = "()V")
	@Override
	public void method3582() {
		this.method3668(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!od", name = "l", descriptor = "(II)I")
	public int method3684(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			return 7681;
		} else if (arg0 == 0) {
			return 8448;
		} else if (arg0 == 2) {
			return 34165;
		} else if (arg0 == 3) {
			return 260;
		} else if (arg0 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!od", name = "t", descriptor = "()Z")
	@Override
	public boolean method3594() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!dj;I)V")
	public void method3685(@OriginalArg(0) Class40_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method1129(), 0);
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(Z)V")
	private void method3686() {
		@Pc(15) float local15 = (float) -this.anInt4644 * this.aFloat71 / (float) this.anInt4616;
		@Pc(27) float local27 = this.aFloat71 * (float) -this.anInt4638 / (float) this.anInt4629;
		@Pc(42) float local42 = (float) (this.anInt4455 - this.anInt4644) * this.aFloat71 / (float) this.anInt4616;
		@Pc(63) float local63 = (float) (this.anInt4562 - this.anInt4638) * this.aFloat71 / (float) this.anInt4629;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local63) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local63, (double) -local27, (double) ((float) this.anInt4620 - this.aFloat62), (double) ((float) this.anInt4642 - this.aFloat62));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!od", name = "x", descriptor = "(I)V")
	public void method3687() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!je;[Lclient!gu;Z)Lclient!oa;")
	@Override
	public Class16 method3575(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class100[] arg1) {
		return new Class16_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!od", name = "z", descriptor = "()Z")
	@Override
	public boolean method3604() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "k", descriptor = "()Z")
	@Override
	public boolean method3569() {
		return true;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)I")
	@Override
	public int method3605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!od", name = "i", descriptor = "()V")
	@Override
	public void method3556() {
		if (!this.aBoolean369 || this.anInt4455 <= 0 || this.anInt4562 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt4627;
		@Pc(25) int local25 = this.anInt4648;
		@Pc(28) int local28 = this.anInt4643;
		@Pc(31) int local31 = this.anInt4623;
		this.va();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3643();
		this.method3656(false);
		this.method3621(false);
		this.method3659(false);
		this.method3668(false);
		this.method3691(null);
		this.method3652(-2);
		this.method3677(1);
		this.method3653(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt4455, this.anInt4562, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.pa(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!od", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat73 == arg0 && this.aFloat62 == arg1) {
			return;
		}
		this.aFloat62 = arg1;
		this.aFloat73 = arg0;
		this.method3670();
		if (this.anInt4633 == 3) {
			this.method3686();
			return;
		}
		if (this.anInt4633 != 2) {
			return;
		}
		this.method3648();
	}

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt4627) {
			this.anInt4627 = arg0;
		}
		if (arg2 < this.anInt4648) {
			this.anInt4648 = arg2;
		}
		if (arg3 < this.anInt4623) {
			this.anInt4623 = arg3;
		}
		if (arg1 > this.anInt4643) {
			this.anInt4643 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method3630();
		this.method3614();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(FFF)V")
	@Override
	public void method3547(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static42.aFloat95 = arg1;
		Static153.aFloat36 = arg0;
		Static78.aFloat23 = arg2;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!qc;IIII)Lclient!c;")
	@Override
	public Class33 method3602(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class33_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()Z")
	@Override
	public boolean method3536() {
		return this.aClass1_Sub4_Sub1_1 != null && this.aClass1_Sub4_Sub1_1.method868();
	}

	@OriginalMember(owner = "client!od", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass40_Sub2_3.aFloat14 + (float) arg2 * this.aClass40_Sub2_3.aFloat12 + (float) arg1 * this.aClass40_Sub2_3.aFloat19 + this.aClass40_Sub2_3.aFloat9 * (float) arg0;
		if (local28 < (float) this.anInt4620 || local28 > (float) this.anInt4642) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass40_Sub2_3.aFloat13 + this.aClass40_Sub2_3.aFloat18 * (float) arg2 + (float) arg0 * this.aClass40_Sub2_3.aFloat16 + this.aClass40_Sub2_3.aFloat10 * (float) arg1) * (float) this.anInt4616 / local28);
		@Pc(117) int local117 = (int) (((float) arg0 * this.aClass40_Sub2_3.aFloat15 + this.aClass40_Sub2_3.aFloat20 * (float) arg1 + (float) arg2 * this.aClass40_Sub2_3.aFloat11 + this.aClass40_Sub2_3.aFloat17) * (float) this.anInt4629 / local28);
		if ((float) local85 >= this.aFloat68 && (float) local85 <= this.aFloat67 && (float) local117 >= this.aFloat60 && this.aFloat66 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat60);
			arg3[0] = (int) ((float) local85 - this.aFloat68);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!od", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		if (this.aFloat59 != arg0) {
			this.aFloat59 = arg0;
			this.method3631();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!nc;)V")
	public void method3688(@OriginalArg(1) Interface10 arg0) {
		if (this.anInterface10_4 != arg0) {
			if (this.aBoolean374) {
				OpenGL.glBindBufferARB(34962, arg0.method4281());
			}
			this.anInterface10_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!od", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4562 < arg3) {
			arg3 = this.anInt4562;
		}
		if (this.anInt4455 < arg2) {
			arg2 = this.anInt4455;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt4648 = arg2;
		this.anInt4643 = arg1;
		this.anInt4623 = arg3;
		this.anInt4627 = arg0;
		OpenGL.glEnable(3089);
		this.method3630();
		this.method3614();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(BII)V")
	public void method3689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4639 = arg0;
		this.anInt4646 = arg1;
		this.method3636();
		this.method3614();
	}

	@OriginalMember(owner = "client!od", name = "u", descriptor = "()Z")
	@Override
	public boolean method3595() {
		return this.aClass119_1.method2405();
	}

	@OriginalMember(owner = "client!od", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4638 = arg1;
		this.anInt4616 = arg2;
		this.anInt4629 = arg3;
		this.anInt4644 = arg0;
		this.method3617();
		this.method3630();
		if (this.anInt4633 == 3) {
			this.method3686();
		} else if (this.anInt4633 == 2) {
			this.method3648();
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "y", descriptor = "(I)V")
	private void method3690() {
		this.method3652(-2);
		for (@Pc(14) int local14 = this.anInt4625 - 1; local14 >= 0; local14--) {
			this.method3667(local14);
			this.method3691(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3622(8448, 8448);
		this.method3647(34168, 770, 2);
		this.method3665();
		this.anInt4626 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt4614 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean358 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean354 = true;
		this.method3656(true);
		this.method3621(true);
		this.method3659(true);
		this.method3668(true);
		this.method3643();
		this.anOpenGL1.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		@Pc(135) float[] local135 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(137) int local137 = 0; local137 < 8; local137++) {
			@Pc(144) int local144 = local137 + 16384;
			OpenGL.glLightfv(local144, 4608, local135, 0);
			OpenGL.glLightf(local144, 4615, 0.0F);
			OpenGL.glLightf(local144, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt4630 = this.anInt4645 = -1;
		this.va();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!jk;B)V")
	public void method3691(@OriginalArg(0) Class5 arg0) {
		@Pc(15) Class5 local15 = this.aClass5Array1[this.anInt4649];
		if (arg0 != local15) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt7321);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt7321);
				} else if (arg0.anInt7321 != local15.anInt7321) {
					OpenGL.glDisable(local15.anInt7321);
					OpenGL.glEnable(arg0.anInt7321);
				}
				OpenGL.glBindTexture(arg0.anInt7321, arg0.method5534());
			}
			this.aClass5Array1[this.anInt4649] = arg0;
		}
		this.anInt4624 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method3563(@OriginalArg(0) Canvas arg0) {
		this.aCanvas8 = null;
		this.aLong144 = 0L;
		if (arg0 == null || arg0 == this.aCanvas7) {
			this.aLong144 = this.aLong145;
			this.aCanvas8 = this.aCanvas7;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong144 = local26;
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.aLong144 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong144);
		this.method3638();
	}

	@OriginalMember(owner = "client!od", name = "r", descriptor = "()Z")
	@Override
	public boolean method3588() {
		return true;
	}
}
