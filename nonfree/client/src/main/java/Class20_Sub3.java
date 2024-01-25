import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
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

@OriginalClass("client!qo")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!qo", name = "lb", descriptor = "Lclient!ej;")
	public static final Class94 lb = new Class94(52, 4);

	@OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
	private int anInt8579;

	@OriginalMember(owner = "client!qo", name = "Uc", descriptor = "I")
	public int anInt8691;

	@OriginalMember(owner = "client!qo", name = "Yc", descriptor = "I")
	private int anInt8695;

	@OriginalMember(owner = "client!qo", name = "Pd", descriptor = "I")
	public int anInt8737;

	@OriginalMember(owner = "client!qo", name = "Fe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!qo", name = "Ke", descriptor = "I")
	public int anInt8773;

	@OriginalMember(owner = "client!qo", name = "Oe", descriptor = "Lclient!rg;")
	private Class295 aClass295_4;

	@OriginalMember(owner = "client!qo", name = "Pe", descriptor = "Lclient!tv;")
	private Interface23 anInterface23_1;

	@OriginalMember(owner = "client!qo", name = "Te", descriptor = "Lclient!nda;")
	private Class46_Sub3 aClass46_Sub3_1;

	@OriginalMember(owner = "client!qo", name = "Ue", descriptor = "Lclient!tv;")
	private Interface23 anInterface23_2;

	@OriginalMember(owner = "client!qo", name = "We", descriptor = "I")
	public int anInt8777;

	@OriginalMember(owner = "client!qo", name = "Xe", descriptor = "I")
	public int anInt8778;

	@OriginalMember(owner = "client!qo", name = "Ze", descriptor = "I")
	private int anInt8779;

	@OriginalMember(owner = "client!qo", name = "gf", descriptor = "J")
	private long aLong214;

	@OriginalMember(owner = "client!qo", name = "hf", descriptor = "Z")
	private boolean aBoolean611;

	@OriginalMember(owner = "client!qo", name = "jf", descriptor = "Z")
	private boolean aBoolean612;

	@OriginalMember(owner = "client!qo", name = "lf", descriptor = "Z")
	private boolean aBoolean613;

	@OriginalMember(owner = "client!qo", name = "mf", descriptor = "I")
	private int anInt8780;

	@OriginalMember(owner = "client!qo", name = "nf", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!qo", name = "of", descriptor = "I")
	private int anInt8781;

	@OriginalMember(owner = "client!qo", name = "pf", descriptor = "I")
	private int anInt8782;

	@OriginalMember(owner = "client!qo", name = "sf", descriptor = "F")
	public float aFloat175;

	@OriginalMember(owner = "client!qo", name = "tf", descriptor = "Lclient!dp;")
	private Class78_Sub1 aClass78_Sub1_1;

	@OriginalMember(owner = "client!qo", name = "wf", descriptor = "I")
	public int anInt8785;

	@OriginalMember(owner = "client!qo", name = "zf", descriptor = "Z")
	public boolean aBoolean616;

	@OriginalMember(owner = "client!qo", name = "Af", descriptor = "Lclient!eba;")
	private Class85_Sub1_Sub1 aClass85_Sub1_Sub1_4;

	@OriginalMember(owner = "client!qo", name = "Bf", descriptor = "I")
	public int anInt8787;

	@OriginalMember(owner = "client!qo", name = "Cf", descriptor = "Lclient!rg;")
	public Class295 aClass295_5;

	@OriginalMember(owner = "client!qo", name = "Ef", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_1;

	@OriginalMember(owner = "client!qo", name = "Hf", descriptor = "Z")
	public boolean aBoolean617;

	@OriginalMember(owner = "client!qo", name = "If", descriptor = "Z")
	private boolean aBoolean618;

	@OriginalMember(owner = "client!qo", name = "Jf", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_2;

	@OriginalMember(owner = "client!qo", name = "Mf", descriptor = "I")
	public int anInt8790;

	@OriginalMember(owner = "client!qo", name = "Nf", descriptor = "I")
	private int anInt8791;

	@OriginalMember(owner = "client!qo", name = "Of", descriptor = "Ljava/lang/String;")
	private String aString94;

	@OriginalMember(owner = "client!qo", name = "Pf", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!qo", name = "Qf", descriptor = "F")
	public float aFloat178;

	@OriginalMember(owner = "client!qo", name = "Rf", descriptor = "Z")
	public boolean aBoolean620;

	@OriginalMember(owner = "client!qo", name = "Tf", descriptor = "I")
	public int anInt8793;

	@OriginalMember(owner = "client!qo", name = "Uf", descriptor = "I")
	private int anInt8794;

	@OriginalMember(owner = "client!qo", name = "Vf", descriptor = "Lclient!hca;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!qo", name = "Xf", descriptor = "I")
	private int anInt8795;

	@OriginalMember(owner = "client!qo", name = "Zf", descriptor = "Z")
	private boolean aBoolean621;

	@OriginalMember(owner = "client!qo", name = "ag", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_3;

	@OriginalMember(owner = "client!qo", name = "bg", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_4;

	@OriginalMember(owner = "client!qo", name = "dg", descriptor = "Z")
	private boolean aBoolean622;

	@OriginalMember(owner = "client!qo", name = "fg", descriptor = "Z")
	public boolean aBoolean623;

	@OriginalMember(owner = "client!qo", name = "ng", descriptor = "Z")
	public boolean aBoolean624;

	@OriginalMember(owner = "client!qo", name = "pg", descriptor = "Lclient!ni;")
	private Interface18 anInterface18_2;

	@OriginalMember(owner = "client!qo", name = "rg", descriptor = "I")
	private int anInt8804;

	@OriginalMember(owner = "client!qo", name = "tg", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_5;

	@OriginalMember(owner = "client!qo", name = "ug", descriptor = "Z")
	private boolean aBoolean627;

	@OriginalMember(owner = "client!qo", name = "wg", descriptor = "F")
	private float aFloat182;

	@OriginalMember(owner = "client!qo", name = "zg", descriptor = "Lclient!tp;")
	public Class85_Sub1 aClass85_Sub1_3;

	@OriginalMember(owner = "client!qo", name = "Ag", descriptor = "[Lclient!ud;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "client!qo", name = "Cg", descriptor = "F")
	public float aFloat184;

	@OriginalMember(owner = "client!qo", name = "Fg", descriptor = "Lclient!nh;")
	public Class223 aClass223_10;

	@OriginalMember(owner = "client!qo", name = "Gg", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_6;

	@OriginalMember(owner = "client!qo", name = "Hg", descriptor = "F")
	public float aFloat186;

	@OriginalMember(owner = "client!qo", name = "Ig", descriptor = "F")
	public float aFloat187;

	@OriginalMember(owner = "client!qo", name = "Kg", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_7;

	@OriginalMember(owner = "client!qo", name = "Lg", descriptor = "I")
	private int anInt8806;

	@OriginalMember(owner = "client!qo", name = "Mg", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_8;

	@OriginalMember(owner = "client!qo", name = "Ng", descriptor = "Z")
	public boolean aBoolean630;

	@OriginalMember(owner = "client!qo", name = "Og", descriptor = "F")
	private float aFloat188;

	@OriginalMember(owner = "client!qo", name = "Pg", descriptor = "Z")
	private boolean aBoolean631;

	@OriginalMember(owner = "client!qo", name = "Qg", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_9;

	@OriginalMember(owner = "client!qo", name = "Rg", descriptor = "Ljava/lang/String;")
	private String aString95;

	@OriginalMember(owner = "client!qo", name = "Sg", descriptor = "Z")
	public boolean aBoolean632;

	@OriginalMember(owner = "client!qo", name = "Vg", descriptor = "Lclient!nh;")
	public Class223 aClass223_11;

	@OriginalMember(owner = "client!qo", name = "Yg", descriptor = "Lclient!hca;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!qo", name = "ah", descriptor = "F")
	private float aFloat190;

	@OriginalMember(owner = "client!qo", name = "gh", descriptor = "Z")
	private boolean aBoolean635;

	@OriginalMember(owner = "client!qo", name = "ih", descriptor = "I")
	private int anInt8812;

	@OriginalMember(owner = "client!qo", name = "jh", descriptor = "Z")
	public boolean aBoolean636;

	@OriginalMember(owner = "client!qo", name = "kh", descriptor = "Lclient!paa;")
	public Class166_Sub3 aClass166_Sub3_10;

	@OriginalMember(owner = "client!qo", name = "lh", descriptor = "I")
	private int anInt8813;

	@OriginalMember(owner = "client!qo", name = "mh", descriptor = "Z")
	private boolean aBoolean637;

	@OriginalMember(owner = "client!qo", name = "sh", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!qo", name = "wh", descriptor = "I")
	private int anInt8816;

	@OriginalMember(owner = "client!qo", name = "yh", descriptor = "I")
	private int anInt8817;

	@OriginalMember(owner = "client!qo", name = "Bh", descriptor = "I")
	private int anInt8818;

	@OriginalMember(owner = "client!qo", name = "Ib", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!qo", name = "ne", descriptor = "I")
	public int anInt8759 = 128;

	@OriginalMember(owner = "client!qo", name = "me", descriptor = "Lclient!sn;")
	private final Class319 aClass319_1 = new Class319();

	@OriginalMember(owner = "client!qo", name = "Ae", descriptor = "Lclient!iaa;")
	private final Class30_Sub3 aClass30_Sub3_1 = new Class30_Sub3();

	@OriginalMember(owner = "client!qo", name = "Ee", descriptor = "Lclient!iaa;")
	public final Class30_Sub3 aClass30_Sub3_2 = new Class30_Sub3();

	@OriginalMember(owner = "client!qo", name = "Ge", descriptor = "I")
	public int anInt8771 = 3;

	@OriginalMember(owner = "client!qo", name = "Je", descriptor = "Z")
	private boolean aBoolean610 = false;

	@OriginalMember(owner = "client!qo", name = "Ie", descriptor = "I")
	public int anInt8772 = 8;

	@OriginalMember(owner = "client!qo", name = "He", descriptor = "Lclient!uh;")
	private final Class341 aClass341_50 = new Class341();

	@OriginalMember(owner = "client!qo", name = "Me", descriptor = "[Lclient!tv;")
	private final Interface23[] anInterface23Array1 = new Interface23[4];

	@OriginalMember(owner = "client!qo", name = "Ne", descriptor = "I")
	private int anInt8774 = -1;

	@OriginalMember(owner = "client!qo", name = "Re", descriptor = "I")
	private int anInt8775 = -1;

	@OriginalMember(owner = "client!qo", name = "Qe", descriptor = "[Lclient!tv;")
	private final Interface23[] anInterface23Array2 = new Interface23[4];

	@OriginalMember(owner = "client!qo", name = "Se", descriptor = "[Lclient!tv;")
	private final Interface23[] anInterface23Array3 = new Interface23[4];

	@OriginalMember(owner = "client!qo", name = "Ve", descriptor = "I")
	private int anInt8776 = -1;

	@OriginalMember(owner = "client!qo", name = "Ye", descriptor = "Lclient!uh;")
	private final Class341 aClass341_51;

	@OriginalMember(owner = "client!qo", name = "af", descriptor = "Lclient!uh;")
	private final Class341 aClass341_52;

	@OriginalMember(owner = "client!qo", name = "bf", descriptor = "Lclient!uh;")
	private final Class341 bf;

	@OriginalMember(owner = "client!qo", name = "cf", descriptor = "Lclient!uh;")
	private final Class341 aClass341_53;

	@OriginalMember(owner = "client!qo", name = "df", descriptor = "Lclient!uh;")
	private final Class341 aClass341_54;

	@OriginalMember(owner = "client!qo", name = "ef", descriptor = "Lclient!uh;")
	private final Class341 aClass341_55;

	@OriginalMember(owner = "client!qo", name = "ff", descriptor = "Lclient!uh;")
	private final Class341 aClass341_56;

	@OriginalMember(owner = "client!qo", name = "kf", descriptor = "Lclient!iaa;")
	public final Class30_Sub3 aClass30_Sub3_3;

	@OriginalMember(owner = "client!qo", name = "qf", descriptor = "Lclient!iaa;")
	public final Class30_Sub3 aClass30_Sub3_4;

	@OriginalMember(owner = "client!qo", name = "rf", descriptor = "Lclient!iaa;")
	public final Class30_Sub3 aClass30_Sub3_5;

	@OriginalMember(owner = "client!qo", name = "uf", descriptor = "I")
	private int anInt8783;

	@OriginalMember(owner = "client!qo", name = "Kf", descriptor = "F")
	private float aFloat177;

	@OriginalMember(owner = "client!qo", name = "xf", descriptor = "I")
	private int anInt8786;

	@OriginalMember(owner = "client!qo", name = "Ff", descriptor = "F")
	public float aFloat176;

	@OriginalMember(owner = "client!qo", name = "eg", descriptor = "I")
	public int anInt8797;

	@OriginalMember(owner = "client!qo", name = "vf", descriptor = "I")
	public int anInt8784;

	@OriginalMember(owner = "client!qo", name = "Yf", descriptor = "F")
	private float aFloat179;

	@OriginalMember(owner = "client!qo", name = "gg", descriptor = "I")
	private int anInt8798;

	@OriginalMember(owner = "client!qo", name = "og", descriptor = "F")
	public float aFloat180;

	@OriginalMember(owner = "client!qo", name = "cg", descriptor = "I")
	private int anInt8796;

	@OriginalMember(owner = "client!qo", name = "Bg", descriptor = "F")
	private float aFloat183;

	@OriginalMember(owner = "client!qo", name = "ig", descriptor = "I")
	public int anInt8800;

	@OriginalMember(owner = "client!qo", name = "Eg", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!qo", name = "xg", descriptor = "[F")
	public final float[] aFloatArray75;

	@OriginalMember(owner = "client!qo", name = "hg", descriptor = "I")
	public int anInt8799;

	@OriginalMember(owner = "client!qo", name = "jg", descriptor = "[F")
	private final float[] aFloatArray74;

	@OriginalMember(owner = "client!qo", name = "vg", descriptor = "F")
	public float aFloat181;

	@OriginalMember(owner = "client!qo", name = "Sf", descriptor = "I")
	public int anInt8792;

	@OriginalMember(owner = "client!qo", name = "mg", descriptor = "I")
	private int anInt8803;

	@OriginalMember(owner = "client!qo", name = "bh", descriptor = "I")
	private int anInt8809;

	@OriginalMember(owner = "client!qo", name = "dh", descriptor = "F")
	private float aFloat191;

	@OriginalMember(owner = "client!qo", name = "Lf", descriptor = "I")
	private int anInt8789;

	@OriginalMember(owner = "client!qo", name = "fh", descriptor = "Z")
	private boolean aBoolean634;

	@OriginalMember(owner = "client!qo", name = "Wg", descriptor = "[F")
	private final float[] aFloatArray76;

	@OriginalMember(owner = "client!qo", name = "Xg", descriptor = "F")
	private float aFloat189;

	@OriginalMember(owner = "client!qo", name = "yg", descriptor = "I")
	public int anInt8805;

	@OriginalMember(owner = "client!qo", name = "hh", descriptor = "I")
	private int anInt8811;

	@OriginalMember(owner = "client!qo", name = "lg", descriptor = "I")
	public int anInt8802;

	@OriginalMember(owner = "client!qo", name = "ch", descriptor = "I")
	public int anInt8810;

	@OriginalMember(owner = "client!qo", name = "oh", descriptor = "I")
	private int anInt8815;

	@OriginalMember(owner = "client!qo", name = "Df", descriptor = "[F")
	private final float[] aFloatArray73;

	@OriginalMember(owner = "client!qo", name = "qh", descriptor = "Z")
	private boolean aBoolean639;

	@OriginalMember(owner = "client!qo", name = "rh", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!qo", name = "eh", descriptor = "[Lclient!ab;")
	private final Class2_Sub1[] aClass2_Sub1Array5;

	@OriginalMember(owner = "client!qo", name = "Zg", descriptor = "I")
	public int anInt8808;

	@OriginalMember(owner = "client!qo", name = "nh", descriptor = "I")
	private int anInt8814;

	@OriginalMember(owner = "client!qo", name = "vh", descriptor = "F")
	public float aFloat195;

	@OriginalMember(owner = "client!qo", name = "uh", descriptor = "F")
	public float aFloat194;

	@OriginalMember(owner = "client!qo", name = "Ug", descriptor = "I")
	public int anInt8807;

	@OriginalMember(owner = "client!qo", name = "xh", descriptor = "[F")
	private final float[] aFloatArray77;

	@OriginalMember(owner = "client!qo", name = "Gf", descriptor = "I")
	public int anInt8788;

	@OriginalMember(owner = "client!qo", name = "Wf", descriptor = "Lclient!gh;")
	public Class2_Sub11_Sub1 aClass2_Sub11_Sub1_1;

	@OriginalMember(owner = "client!qo", name = "zh", descriptor = "[B")
	public final byte[] aByteArray111;

	@OriginalMember(owner = "client!qo", name = "Ah", descriptor = "[I")
	public int[] anIntArray559;

	@OriginalMember(owner = "client!qo", name = "Dh", descriptor = "[I")
	public int[] anIntArray561;

	@OriginalMember(owner = "client!qo", name = "Ch", descriptor = "[I")
	public int[] anIntArray560;

	@OriginalMember(owner = "client!qo", name = "Fc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas9;

	@OriginalMember(owner = "client!qo", name = "Gb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas8;

	@OriginalMember(owner = "client!qo", name = "oe", descriptor = "I")
	public final int anInt8760;

	@OriginalMember(owner = "client!qo", name = "rd", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!qo", name = "kb", descriptor = "J")
	private final long aLong212;

	@OriginalMember(owner = "client!qo", name = "Pc", descriptor = "J")
	private long aLong213;

	@OriginalMember(owner = "client!qo", name = "kg", descriptor = "I")
	public final int anInt8801;

	@OriginalMember(owner = "client!qo", name = "th", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!qo", name = "Dg", descriptor = "Z")
	public boolean aBoolean628;

	@OriginalMember(owner = "client!qo", name = "qg", descriptor = "Z")
	public boolean aBoolean625;

	@OriginalMember(owner = "client!qo", name = "Jg", descriptor = "Z")
	public boolean aBoolean629;

	@OriginalMember(owner = "client!qo", name = "Tg", descriptor = "Z")
	public boolean aBoolean633;

	@OriginalMember(owner = "client!qo", name = "ph", descriptor = "Z")
	private boolean aBoolean638;

	@OriginalMember(owner = "client!qo", name = "sg", descriptor = "Z")
	public boolean aBoolean626;

	@OriginalMember(owner = "client!qo", name = "yf", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!qo", name = "ye", descriptor = "Lclient!eo;")
	private final Class97 aClass97_1;

	@OriginalMember(owner = "client!qo", name = "Le", descriptor = "Lclient!qi;")
	public final Class279 aClass279_1;

	@OriginalMember(owner = "client!qo", name = "ve", descriptor = "Lclient!hh;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!qo", name = "we", descriptor = "Lclient!rda;")
	private Class2_Sub17_Sub1 aClass2_Sub17_Sub1_1;

	@OriginalMember(owner = "client!qo", name = "ie", descriptor = "Lclient!mea;")
	private final Class205 aClass205_1;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class20_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class211();
		new Class99(16);
		this.aClass341_51 = new Class341();
		this.aClass341_52 = new Class341();
		this.bf = new Class341();
		this.aClass341_53 = new Class341();
		this.aClass341_54 = new Class341();
		this.aClass341_55 = new Class341();
		this.aClass341_56 = new Class341();
		this.aClass30_Sub3_3 = new Class30_Sub3();
		this.aClass30_Sub3_4 = new Class30_Sub3();
		this.aClass30_Sub3_5 = new Class30_Sub3();
		this.anInt8783 = 0;
		this.aFloat177 = 0.0F;
		this.anInt8786 = 0;
		this.aFloat176 = 1.0F;
		this.anInt8797 = -1;
		this.anInt8784 = 512;
		this.aFloat179 = -1.0F;
		this.anInt8798 = -1;
		this.aFloat180 = 1.0F;
		this.anInt8796 = 8448;
		this.aFloat183 = -1.0F;
		this.anInt8800 = 0;
		this.aFloat185 = -1.0F;
		this.aFloatArray75 = new float[4];
		this.anInt8799 = 0;
		this.aFloatArray74 = new float[4];
		this.aFloat181 = 1.0F;
		this.anInt8792 = 512;
		this.anInt8803 = 3584;
		this.anInt8809 = 0;
		this.aFloat191 = 1.0F;
		this.anInt8789 = 0;
		this.aBoolean634 = false;
		this.aFloatArray76 = new float[4];
		this.aFloat189 = 1.0F;
		this.anInt8805 = 50;
		this.anInt8811 = 8448;
		this.anInt8802 = 0;
		this.anInt8810 = -1;
		this.anInt8815 = 0;
		this.aFloatArray73 = new float[16];
		this.aBoolean639 = true;
		this.aFloat192 = -1.0F;
		this.aClass2_Sub1Array5 = new Class2_Sub1[Static260.anInt8324];
		this.anInt8808 = 0;
		this.anInt8814 = 0;
		this.aFloat195 = 3584.0F;
		this.aFloat194 = 3584.0F;
		this.anInt8807 = -1;
		this.aFloatArray77 = new float[4];
		this.anInt8788 = -1;
		this.aClass2_Sub11_Sub1_1 = new Class2_Sub11_Sub1(8192);
		this.aByteArray111 = new byte[16384];
		this.anIntArray559 = new int[1];
		this.anIntArray561 = new int[1];
		this.anIntArray560 = new int[1];
		this.aCanvas8 = this.aCanvas9 = arg0;
		this.anInt8760 = arg2;
		if (!Static472.method7443("jaclib")) {
			throw new RuntimeException("");
		} else if (Static472.method7443("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong213 = this.aLong212 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8760);
				if (this.aLong212 == 0L) {
					throw new RuntimeException("");
				}
				this.method7363();
				@Pc(335) int local335 = this.method7361();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8801 = this.aBoolean616 ? 33639 : 5121;
				if (this.aString94.indexOf("radeon") != -1) {
					@Pc(361) int local361 = 0;
					@Pc(363) boolean local363 = false;
					@Pc(365) boolean local365 = false;
					@Pc(374) String[] local374 = Static62.method1946(' ', this.aString94.replace('/', ' '));
					for (@Pc(376) int local376 = 0; local376 < local374.length; local376++) {
						@Pc(382) String local382 = local374[local376];
						try {
							if (local382.length() > 0) {
								if (local382.charAt(0) == 'x' && local382.length() >= 3 && Static202.method4067(local382.substring(1, 3))) {
									local382 = local382.substring(1);
									local365 = true;
								}
								if (local382.equals("hd")) {
									local363 = true;
								} else {
									if (local382.startsWith("hd")) {
										local363 = true;
										local382 = local382.substring(2);
									}
									if (local382.length() >= 4 && Static202.method4067(local382.substring(0, 4))) {
										local361 = Static562.method8436(local382.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(452) Exception local452) {
						}
					}
					if (!local365 && !local363) {
						if (local361 >= 7000 && local361 <= 7999) {
							this.aBoolean640 = false;
						}
						if (local361 >= 7000 && local361 <= 9250) {
							this.aBoolean628 = false;
						}
					}
					if (!local363 || local361 < 4000) {
						this.aBoolean625 = false;
					}
					this.aBoolean629 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean633 = true;
					this.aBoolean638 = this.aBoolean640;
				}
				if (this.aString95.indexOf("intel") != -1) {
					this.aBoolean626 = false;
				}
				this.aBoolean615 = !this.aString95.equals("s3 graphics");
				if (this.aBoolean640) {
					try {
						@Pc(535) int[] local535 = new int[1];
						OpenGL.glGenBuffersARB(1, local535, 0);
					} catch (@Pc(541) Throwable local541) {
						throw new RuntimeException("");
					}
				}
				Static100.method2647(false, true);
				this.aBoolean610 = true;
				this.aClass97_1 = new Class97(this, super.anInterface4_12);
				this.method7373();
				this.aClass279_1 = new Class279(this);
				this.aClass131_1 = new Class131(this);
				if (this.aClass131_1.method4134()) {
					this.aClass2_Sub17_Sub1_1 = new Class2_Sub17_Sub1(this);
					if (!this.aClass2_Sub17_Sub1_1.method7516()) {
						this.aClass2_Sub17_Sub1_1.method7512();
						this.aClass2_Sub17_Sub1_1 = null;
					}
				}
				this.aClass205_1 = new Class205(this);
				this.method7378();
				this.method7332();
				this.method7276();
			} catch (@Pc(615) Throwable local615) {
				local615.printStackTrace();
				this.method7255();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qo", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8810 == arg0 && this.anInt8788 == arg1 && this.anInt8802 == arg2) {
			return;
		}
		this.anInt8788 = arg1;
		this.anInt8810 = arg0;
		this.anInt8802 = arg2;
		this.method7390();
		this.method7319();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
	public void method7315(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean618 != arg0) {
			this.aBoolean618 = arg0;
			this.method7355();
			this.anInt8782 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!bh;IIII)Lclient!ka;")
	@Override
	public Class166 method7228(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class166_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)V")
	public void method7316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8816 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(14) boolean local14 = false;
		if (this.anInt8796 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local14 = true;
			this.anInt8796 = arg0;
		}
		if (this.anInt8811 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt8811 = arg1;
			local14 = true;
		}
		if (local14) {
			this.anInt8782 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)V")
	private void method7317() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray73, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!wh;)V")
	@Override
	public void method7256(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub1_1 = (Class78_Sub1) arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZI[BI)Lclient!hca;")
	public Interface11 method7318(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface11) (this.aBoolean640 && (!arg0 || this.aBoolean638) ? new Class34_Sub1(this, arg1, arg2, arg3, arg0) : new Class67_Sub1(this, arg1, arg2, arg3));
	}

	@OriginalMember(owner = "client!qo", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8784 = arg2;
		this.anInt8792 = arg3;
		this.anInt8800 = arg1;
		this.anInt8808 = arg0;
		this.method7393();
		this.method7359();
		if (this.anInt8813 == 3) {
			this.method7334();
		} else if (this.anInt8813 == 2) {
			this.method7317();
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	private void method7319() {
		if (this.aBoolean621 && this.anInt8788 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III[BZ)Lclient!ni;")
	public Interface18 method7320(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) boolean arg2) {
		return (Interface18) (this.aBoolean640 && (!arg2 || this.aBoolean638) ? new Class34_Sub2(this, 5123, arg1, arg0, arg2) : new Class67_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(Z)V")
	public void method7321() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIF)Lclient!ab;")
	@Override
	public Class2_Sub1 method7293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "(I)V")
	public void method7322() {
		if (this.anInt8782 == 4) {
			return;
		}
		this.method7350();
		this.method7394(false);
		this.method7315(false);
		this.method7339(false);
		this.method7335(false);
		this.method7344(-2);
		this.method7340(1);
		this.anInt8782 = 4;
	}

	@OriginalMember(owner = "client!qo", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt8803;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class85_Sub1_Sub1 local9 = local6.aClass85_Sub1_Sub1_1;
		this.method7379();
		this.method7358(local6.aClass85_Sub1_Sub1_1);
		this.method7340(1);
		this.method7316(7681, 8448);
		this.method7349(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat95 / (float) local9.anInt3123;
		@Pc(46) float local46 = local9.aFloat96 / (float) local9.anInt3122;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		@Pc(75) float local75 = local52 * local71;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(94) float local94 = local58 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local75 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local94);
		OpenGL.glEnd();
		this.method7349(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qo", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8808, this.anInt8800, this.anInt8784, this.anInt8792 };
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IBI)V")
	public synchronized void method7324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub43 local8 = new Class2_Sub43(arg1);
		local8.aLong278 = arg0;
		this.bf.method8528(local8);
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "(II)V")
	public void method7325(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8816) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8816 = arg0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;ZII)Lclient!hca;")
	public Interface11 method7326(@OriginalArg(1) Buffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface11) (this.aBoolean640 ? new Class34_Sub1(this, arg1, arg0, arg2, false) : new Class67_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "(I)V")
	private void method7327() {
		if (this.anInt8813 != 2) {
			this.anInt8813 = 2;
			this.method7317();
			this.method7341();
			this.anInt8782 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "()Z")
	@Override
	public boolean method7247() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "(I)Lclient!q;")
	public Class85_Sub3 method7328() {
		return this.aClass78_Sub1_1 == null ? null : this.aClass78_Sub1_1.method7091();
	}

	@OriginalMember(owner = "client!qo", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg2 * this.aClass30_Sub3_3.aFloat146 + (float) arg1 * this.aClass30_Sub3_3.aFloat138 + this.aClass30_Sub3_3.aFloat139 * (float) arg0 + this.aClass30_Sub3_3.aFloat137;
		if ((float) this.anInt8805 > local28 || (float) this.anInt8803 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass30_Sub3_3.aFloat135 + this.aClass30_Sub3_3.aFloat136 * (float) arg1 + (float) arg0 * this.aClass30_Sub3_3.aFloat143 + this.aClass30_Sub3_3.aFloat145 * (float) arg2) * (float) this.anInt8784 / (float) arg3);
		@Pc(119) int local119 = (int) ((float) this.anInt8792 * (this.aClass30_Sub3_3.aFloat144 + this.aClass30_Sub3_3.aFloat140 * (float) arg0 + (float) arg1 * this.aClass30_Sub3_3.aFloat142 + (float) arg2 * this.aClass30_Sub3_3.aFloat141) / (float) arg3);
		if ((float) local86 >= this.aFloat193 && this.aFloat186 >= (float) local86 && this.aFloat187 <= (float) local119 && this.aFloat184 >= (float) local119) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local119 - this.aFloat187);
			arg4[0] = (int) ((float) local86 - this.aFloat193);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qo", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean632) {
			throw new RuntimeException("");
		}
		this.anInt8790 = arg0;
		this.anInt8797 = arg1;
		this.anInt8807 = arg2;
		this.anInt8799 = arg3;
		if (this.aBoolean634) {
			this.aClass205_1.aClass19_Sub1_1.method387();
			this.aClass205_1.aClass19_Sub1_1.method389();
		}
	}

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "(I)V")
	private void method7329() {
		if (this.anInt8813 != 3) {
			this.anInt8813 = 3;
			this.method7334();
			this.method7341();
			this.anInt8782 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "()Z")
	@Override
	public boolean method7258() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FIF)V")
	public void method7331(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat177 = arg0;
		this.aFloat191 = arg1;
		this.method7390();
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)V")
	private void method7332() {
		if (this.aCanvas8 == null) {
			this.anInt8695 = this.anInt8579 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas8.getSize();
			this.anInt8695 = local10.width;
			this.anInt8579 = local10.height;
		}
		if (this.anInterface23_1 == null) {
			this.anInt8737 = this.anInt8695;
			this.anInt8691 = this.anInt8579;
			this.method7396();
		}
		this.method7342();
		this.la();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIZI)V")
	public void method7333(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != this.anInt8794 || this.aBoolean634 != this.aBoolean632) {
			@Pc(22) Class85_Sub1 local22 = null;
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(35) int local35 = this.aBoolean632 ? 3 : 0;
			if (arg1 < 0) {
				this.method7354();
			} else {
				local22 = this.aClass97_1.method3032(arg1);
				@Pc(49) Class127 local49 = super.anInterface4_12.method8048(arg1);
				if (local49.aByte73 == 0 && local49.aByte77 == 0) {
					this.method7354();
				} else {
					@Pc(62) int local62 = local49.aBoolean335 ? 64 : 128;
					@Pc(66) int local66 = local62 * 50;
					this.method7386((float) (this.anInt8773 % local66 * local49.aByte77) / (float) local66, 0.0F, (float) (local49.aByte73 * (this.anInt8773 % local66)) / (float) local66);
				}
				if (!this.aBoolean632) {
					local35 = local49.aByte78;
					local28 = local49.anInt4661;
					local26 = local49.aByte75;
				}
				local24 = local49.anInt4660;
			}
			this.aClass205_1.method5880(local26, arg0, local35, local28, arg2);
			if (!this.aClass205_1.method5881(local24, local22)) {
				this.method7358(local22);
				this.method7348(local24);
			}
			this.aBoolean634 = this.aBoolean632;
			this.anInt8794 = arg1;
		}
		this.anInt8782 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(B)V")
	private void method7334() {
		@Pc(15) float local15 = (float) -this.anInt8808 * this.aFloat189 / (float) this.anInt8784;
		@Pc(27) float local27 = this.aFloat189 * (float) -this.anInt8800 / (float) this.anInt8792;
		@Pc(42) float local42 = this.aFloat189 * (float) (this.anInt8737 - this.anInt8808) / (float) this.anInt8784;
		@Pc(56) float local56 = this.aFloat189 * (float) (this.anInt8691 - this.anInt8800) / (float) this.anInt8792;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) this.anInt8805, (double) this.anInt8803);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()Z")
	@Override
	public boolean method7230() {
		return this.aClass2_Sub17_Sub1_1 != null && (this.anInt8760 <= 1 || this.aBoolean627);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
	public void method7335(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean612 != arg0) {
			this.aBoolean612 = arg0;
			this.method7382();
			this.anInt8782 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt8786;
		arg0[3] = this.anInt8789;
		arg0[0] = this.anInt8815;
		arg0[2] = this.anInt8809;
	}

	@OriginalMember(owner = "client!qo", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(49) float local49;
		if (this.aClass85_Sub1_Sub1_4 == null || this.aClass85_Sub1_Sub1_4.anInt3117 < arg2 || this.aClass85_Sub1_Sub1_4.anInt3121 < arg3) {
			this.aClass85_Sub1_Sub1_4 = Static163.method3529(arg6, arg3, this, arg2);
			this.aClass85_Sub1_Sub1_4.method2893(false, false);
			local45 = this.aClass85_Sub1_Sub1_4.aFloat96;
			local49 = this.aClass85_Sub1_Sub1_4.aFloat95;
		} else {
			this.aClass85_Sub1_Sub1_4.method2898(arg2, false, arg3, 6406, arg6);
			local45 = (float) arg3 * this.aClass85_Sub1_Sub1_4.aFloat96 / (float) this.aClass85_Sub1_Sub1_4.anInt3121;
			local49 = (float) arg2 * this.aClass85_Sub1_Sub1_4.aFloat95 / (float) this.aClass85_Sub1_Sub1_4.anInt3117;
		}
		this.method7379();
		this.method7358(this.aClass85_Sub1_Sub1_4);
		this.method7340(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method7395(arg5);
		this.method7316(34165, 34165);
		this.method7349(34166, 768, 0);
		this.method7349(5890, 770, 2);
		this.method7362(0, 34166);
		this.method7362(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		@Pc(164) float local164 = (float) arg3 + local154;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local49);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local45, local49);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method7349(5890, 768, 0);
		this.method7349(34166, 770, 2);
		this.method7362(0, 5890);
		this.method7362(2, 34166);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!mda;)V")
	@Override
	public void method7287(@OriginalArg(0) Class203 arg0) {
		this.aClass319_1.method7899(this, -1, arg0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFBF)V")
	public void method7336(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static512.aFloatArray80[2] = arg2;
		Static512.aFloatArray80[0] = arg1;
		Static512.aFloatArray80[1] = arg3;
		Static512.aFloatArray80[3] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static512.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method7241(@OriginalArg(0) Class30 arg0) {
		this.aClass30_Sub3_3.method4653(arg0);
		this.aClass30_Sub3_4.method4653(this.aClass30_Sub3_3);
		this.aClass30_Sub3_4.method4395();
		this.aClass30_Sub3_5.method4399(this.aClass30_Sub3_4);
		if (this.anInt8813 != 1) {
			this.method7341();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!hca;)V")
	public void method7337(@OriginalArg(1) Interface11 arg0) {
		if (arg0 != this.anInterface11_5) {
			if (this.aBoolean640) {
				OpenGL.glBindBufferARB(34962, arg0.method5045());
			}
			this.anInterface11_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7279() {
		this.method7365();
		this.method7340(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "()V")
	@Override
	public void method7275() {
		if (this.aBoolean626) {
			if (this.anInterface23_1 != this.aClass295_4) {
				throw new RuntimeException();
			}
			this.aClass295_4.method7562(0);
			this.aClass295_4.method7562(8);
			this.method7357(this.aClass295_4);
		} else if (this.aBoolean637) {
			this.aClass46_Sub3_1.method6218(0, 0, this.anInt8737, this.anInt8691, 0, 0);
			this.anOpenGL2.setSurface(this.aLong213);
		} else {
			throw new RuntimeException("");
		}
		this.anInt8737 = this.anInt8695;
		this.aClass46_Sub3_1 = null;
		this.anInt8691 = this.anInt8579;
		this.method7342();
		this.method7396();
		this.la();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!tv;I)V")
	public void method7338(@OriginalArg(0) Interface23 arg0) {
		if (this.anInt8775 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8775 >= 0) {
			this.anInterface23Array1[this.anInt8775].method7559();
		}
		this.anInterface23_1 = this.anInterface23Array1[++this.anInt8775] = arg0;
		this.anInterface23_1.method7556();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IZ)V")
	public void method7339(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean614) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean614 = arg0;
		this.anInt8782 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!oea;[Lclient!rh;Z)Lclient!da;")
	@Override
	public Class68 method7289(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class296[] arg1) {
		return new Class68_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qo", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method7365();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method7340(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean631) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean631) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qo", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt8798 != arg0;
		if (local15 || this.aFloat185 != arg1 || arg2 != this.aFloat192) {
			this.aFloat185 = arg1;
			this.anInt8798 = arg0;
			this.aFloat192 = arg2;
			if (local15) {
				this.aFloat181 = (float) (this.anInt8798 & 0xFF) / 255.0F;
				this.aFloat176 = (float) (this.anInt8798 & 0xFF0000) / 1.671168E7F;
				this.aFloat180 = (float) (this.anInt8798 & 0xFF00) / 65280.0F;
				this.method7374();
			}
			this.method7366();
		}
		if (arg3 == this.aFloatArray76[0] && this.aFloatArray76[1] == arg4 && this.aFloatArray76[2] == arg5) {
			return;
		}
		this.aFloatArray76[2] = arg5;
		this.aFloatArray76[1] = arg4;
		this.aFloatArray76[0] = arg3;
		this.aFloatArray77[0] = -arg3;
		this.aFloatArray77[2] = -arg5;
		this.aFloatArray77[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray75[0] = local142 * arg3;
		this.aFloatArray75[2] = arg5 * local142;
		this.aFloatArray75[1] = local142 * arg4;
		this.aFloatArray74[2] = -this.aFloatArray75[2];
		this.aFloatArray74[1] = -this.aFloatArray75[1];
		this.aFloatArray74[0] = -this.aFloatArray75[0];
		this.method7383();
		this.anInt8787 = (int) (arg5 * 256.0F / arg4);
		this.anInt8785 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(II)I")
	@Override
	public int method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qo", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method7340(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
	@Override
	public void method7253() {
	}

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "(II)V")
	public void method7340(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt8781) {
			return;
		}
		@Pc(22) boolean local22;
		@Pc(20) byte local20;
		if (arg0 == 1) {
			local20 = 1;
			local22 = true;
		} else if (arg0 == 2) {
			local20 = 2;
			local22 = false;
		} else if (arg0 == 128) {
			local20 = 3;
			local22 = true;
		} else {
			local22 = false;
			local20 = 0;
		}
		if (!this.aBoolean611) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean611 = true;
		}
		if (local22 != this.aBoolean613) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean613 = local22;
		}
		if (local20 != this.anInt8780) {
			if (local20 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local20 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local20 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8780 = local20;
		}
		this.anInt8781 = arg0;
		this.anInt8782 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(B)V")
	private void method7341() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass30_Sub3_4.method4393(), 0);
		if (this.aBoolean634) {
			this.aClass205_1.aClass19_Sub1_1.method387();
		}
		this.method7383();
		this.method7370();
	}

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "(I)V")
	public void method7342() {
		if (this.anInt8813 != 0) {
			this.anInt8782 &= 0xFFFFFFE0;
			this.anInt8813 = 0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIII)V")
	public void method7343(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!qo", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7365();
		this.method7340(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "(I)V")
	@Override
	public void method7299(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8759 = arg0;
		this.aClass97_1.method3028();
	}

	@OriginalMember(owner = "client!qo", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat175 != arg0) {
			this.aFloat175 = arg0;
			this.method7374();
		}
	}

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "(II)V")
	public void method7344(@OriginalArg(0) int arg0) {
		this.method7388(true, arg0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZLclient!iaa;)V")
	public void method7345(@OriginalArg(1) Class30_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4393(), 0);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIIZ)Lclient!mi;")
	@Override
	public Class46 method7286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class46_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILclient!ni;I)V")
	public void method7346(@OriginalArg(0) int arg0, @OriginalArg(3) Interface18 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method9226();
		@Pc(20) int local20 = arg2 * this.method7372(local7);
		this.method7380(arg1);
		OpenGL.glDrawElements(4, arg0, local7, arg1.method9228() + (long) local20);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7249(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class2_Sub43 local19;
		while (!this.aClass341_52.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_52.method8526();
			Static492.anIntArray589[local7++] = (int) local19.aLong278;
			this.anInt8777 -= local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static492.anIntArray589, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static492.anIntArray589, 0);
			local7 = 0;
		}
		while (!this.bf.method8531()) {
			local19 = (Class2_Sub43) this.bf.method8526();
			Static492.anIntArray589[local7++] = (int) local19.aLong278;
			this.anInt8778 -= local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static492.anIntArray589, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static492.anIntArray589, 0);
			local7 = 0;
		}
		while (!this.aClass341_53.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_53.method8526();
			Static492.anIntArray589[local7++] = local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static492.anIntArray589, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static492.anIntArray589, 0);
			local7 = 0;
		}
		while (!this.aClass341_54.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_54.method8526();
			Static492.anIntArray589[local7++] = (int) local19.aLong278;
			this.anInt8779 -= local19.anInt9046;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static492.anIntArray589, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static492.anIntArray589, 0);
		}
		while (!this.aClass341_51.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_51.method8526();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9046);
		}
		@Pc(209) Class2 local209;
		while (!this.aClass341_55.method8531()) {
			local209 = this.aClass341_55.method8526();
			OpenGL.glDeleteProgramARB((int) local209.aLong278);
		}
		while (!this.aClass341_56.method8531()) {
			local209 = this.aClass341_56.method8526();
			OpenGL.glDeleteObjectARB(local209.aLong278);
		}
		while (!this.aClass341_51.method8531()) {
			local19 = (Class2_Sub43) this.aClass341_51.method8526();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9046);
		}
		this.aClass97_1.method3034();
		if (this.E() > 100663296 && this.aLong214 + 60000L < Static277.method5091()) {
			System.gc();
			this.aLong214 = Static277.method5091();
		}
		this.anInt8773 = local11;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method7312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7365();
		this.method7340(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(48) float local48 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local23 * local23)));
			local16 *= local48;
			local23 *= local48;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local23 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "(I)V")
	public void method7347() {
		if (this.anInt8782 == 16) {
			return;
		}
		this.method7329();
		this.method7394(true);
		this.method7339(true);
		this.method7335(true);
		this.method7340(1);
		this.anInt8782 = 16;
	}

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "(II)V")
	public void method7348(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method7316(7681, 7681);
		} else if (arg0 == 0) {
			this.method7316(8448, 8448);
		} else if (arg0 == 2) {
			this.method7316(34165, 7681);
		} else if (arg0 == 3) {
			this.method7316(260, 8448);
		} else if (arg0 == 4) {
			this.method7316(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "()Z")
	@Override
	public boolean method7298() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIBI)V")
	public void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "(I)V")
	private void method7350() {
		if (this.anInt8813 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8737 > 0 && this.anInt8691 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8737, (double) this.anInt8691, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8813 = 1;
		this.anInt8782 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!tv;)V")
	public void method7351(@OriginalArg(1) Interface23 arg0) {
		if (this.anInt8775 < 0 || this.anInterface23Array1[this.anInt8775] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface23Array1[this.anInt8775--] = null;
		arg0.method7559();
		if (this.anInt8775 < 0) {
			this.anInterface23_1 = null;
		} else {
			this.anInterface23_1 = this.anInterface23Array1[this.anInt8775];
			this.anInterface23_1.method7556();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BI)V")
	public synchronized void method7352(@OriginalArg(1) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong278 = arg0;
		this.aClass341_55.method8528(local7);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!iaa;)V")
	public void method7353(@OriginalArg(1) Class30_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4393(), 0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7303(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static399.aFloat165 = arg2;
		Static6.aFloat7 = arg0;
		Static145.aFloat104 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7304(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas9) {
			throw new RuntimeException();
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable6.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "(I)V")
	private void method7354() {
		if (this.aBoolean635) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean635 = false;
		}
	}

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "()Z")
	@Override
	public boolean method7273() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt8815 || this.anInt8809 < arg0 - arg2 || this.anInt8786 > arg1 + arg2 || this.anInt8789 < arg1 - arg2) {
			return;
		}
		this.method7365();
		this.method7340(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if (this.aFloat183 > (float) local81) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 - 1.0F);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat179 >= (float) local81) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local81);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local72, local77);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local72, local77);
			@Pc(150) int local150 = 262144 / (arg2 * 6);
			if (local150 <= 64) {
				local150 = 64;
			} else if (local150 > 512) {
				local150 = 512;
			}
			local150 = Static14.method293(local150);
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			for (@Pc(177) int local177 = 16384 - local150; local177 > 0; local177 -= local150) {
				OpenGL.glVertex2f((float) arg2 * Class2_Sub5.aFloatArray84[local177] + local72, (float) arg2 * Class2_Sub5.aFloatArray83[local177] + local77);
			}
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)V")
	@Override
	public void method7262(@OriginalArg(0) int arg0) {
		this.method7363();
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "(B)V")
	private void method7355() {
		if (this.aBoolean618 && !this.aBoolean622) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "()V")
	@Override
	protected void method7255() {
		for (@Pc(6) Class2 local6 = this.aClass341_50.method8524(); local6 != null; local6 = this.aClass341_50.method8519()) {
			((Class2_Sub2_Sub1) local6).method248();
		}
		if (this.aClass131_1 != null) {
			this.aClass131_1.method4133();
		}
		if (this.anOpenGL2 != null) {
			this.method7384();
			@Pc(40) Enumeration local40 = this.aHashtable6.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable6.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean610) {
			Static585.method8659(true, false);
			this.aBoolean610 = false;
		}
	}

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "()V")
	@Override
	public void method7276() {
		if (!this.aBoolean615 || this.anInt8737 <= 0 || this.anInt8691 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt8815;
		@Pc(25) int local25 = this.anInt8809;
		@Pc(28) int local28 = this.anInt8786;
		@Pc(31) int local31 = this.anInt8789;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7342();
		this.method7394(false);
		this.method7315(false);
		this.method7339(false);
		this.method7335(false);
		this.method7358(null);
		this.method7344(-2);
		this.method7348(1);
		this.method7340(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8737, this.anInt8691, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(IIIIII)Lclient!wh;")
	@Override
	public Class78 method7300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean636 ? new Class78_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(JZ)V")
	public synchronized void method7356(@OriginalArg(0) long arg0) {
		@Pc(13) Class2 local13 = new Class2();
		local13.aLong278 = arg0;
		this.aClass341_56.method8528(local13);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(ILclient!tv;)V")
	public void method7357(@OriginalArg(1) Interface23 arg0) {
		if (this.aBoolean624) {
			this.method7392(arg0);
			this.method7351(arg0);
		} else if (this.anInt8776 >= 0 && this.anInterface23Array3[this.anInt8776] == arg0) {
			this.anInterface23Array3[this.anInt8776--] = null;
			arg0.method7557();
			if (this.anInt8776 < 0) {
				this.anInterface23_2 = this.anInterface23_1 = null;
			} else {
				this.anInterface23_2 = this.anInterface23_1 = this.anInterface23Array3[this.anInt8776];
				this.anInterface23_2.method7555();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!ud;)V")
	public void method7358(@OriginalArg(1) Class85 arg0) {
		@Pc(20) Class85 local20 = this.aClass85Array1[this.anInt8816];
		if (local20 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local20.anInt10892);
			} else {
				if (local20 == null) {
					OpenGL.glEnable(arg0.anInt10892);
				} else if (arg0.anInt10892 != local20.anInt10892) {
					OpenGL.glDisable(local20.anInt10892);
					OpenGL.glEnable(arg0.anInt10892);
				}
				OpenGL.glBindTexture(arg0.anInt10892, arg0.method9098());
			}
			this.aClass85Array1[this.anInt8816] = arg0;
		}
		this.anInt8782 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "()V")
	@Override
	public void method7313() {
		if (this.aClass2_Sub17_Sub1_1 != null && this.aClass2_Sub17_Sub1_1.method7509()) {
			this.aClass131_1.method4132(this.aClass2_Sub17_Sub1_1);
			this.aClass97_1.method3028();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == arg2 && arg1 == arg3) {
			return;
		}
		this.method7365();
		this.method7340(1);
		@Pc(29) float local29 = (float) arg2 - (float) arg0;
		@Pc(35) float local35 = (float) arg3 - (float) arg1;
		@Pc(48) float local48 = (float) (1.0D / Math.sqrt((double) (local35 * local35 + local29 * local29)));
		@Pc(52) float local52 = local29 * local48;
		@Pc(56) float local56 = local35 * local48;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(77) int local77 = arg7 % (arg5 + arg6);
		@Pc(82) float local82 = (float) arg5 * local52;
		@Pc(87) float local87 = local56 * (float) arg5;
		@Pc(89) float local89 = 0.0F;
		@Pc(91) float local91 = 0.0F;
		@Pc(93) float local93 = local82;
		@Pc(95) float local95 = local87;
		if (local77 <= arg5) {
			local95 = (float) (arg5 - local77) * local56;
			local93 = local52 * (float) (arg5 - local77);
		} else {
			local91 = (float) (arg6 + arg5 - local77) * local56;
			local89 = (float) (arg6 + arg5 - local77) * local52;
		}
		@Pc(141) float local141 = local89 + (float) arg0 + 0.35F;
		@Pc(148) float local148 = (float) arg1 + local91 + 0.35F;
		@Pc(153) float local153 = local52 * (float) arg6;
		@Pc(158) float local158 = local56 * (float) arg6;
		while (true) {
			if (arg2 <= arg0) {
				if ((float) arg2 + 0.35F > local141) {
					break;
				}
				if (local141 + local93 < (float) arg2) {
					local93 = (float) arg2 - local141;
				}
			} else {
				if (local141 > (float) arg2 + 0.35F) {
					break;
				}
				if (local141 + local93 > (float) arg2) {
					local93 = (float) arg2 - local141;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local148) {
					break;
				}
				if (local95 + local148 < (float) arg3) {
					local95 = (float) arg3 - local148;
				}
			} else {
				if ((float) arg3 + 0.35F < local148) {
					break;
				}
				if (local95 + local148 > (float) arg3) {
					local95 = (float) arg3 - local148;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local141, local148);
			OpenGL.glVertex2f(local141 + local93, local95 + local148);
			OpenGL.glEnd();
			local148 += local95 + local158;
			local141 += local153 + local93;
			local93 = local82;
			local95 = local87;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7246(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas9 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable6.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(26) Class local26 = Class.forName("java.awt.Canvas");
				@Pc(36) Method local36 = local26.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local36.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(48) Exception local48) {
			}
			@Pc(53) long local53 = this.anOpenGL2.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable6.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "(B)V")
	private void method7359() {
		this.aFloat186 = this.anInt8809 - this.anInt8808;
		this.aFloat193 = this.anInt8815 - this.anInt8808;
		this.aFloat187 = this.anInt8786 - this.anInt8800;
		this.aFloat184 = this.anInt8789 - this.anInt8800;
	}

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class2_Sub2 method7305(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub1 local8 = new Class2_Sub2_Sub1(arg0);
		this.aClass341_50.method8528(local8);
		return local8;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class65 method7251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class65_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "()Z")
	@Override
	public boolean method7285() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(ILclient!tv;)V")
	public void method7360(@OriginalArg(1) Interface23 arg0) {
		if (this.aBoolean624) {
			this.method7369(arg0);
			this.method7338(arg0);
		} else if (this.anInt8776 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8776 >= 0) {
				this.anInterface23Array3[this.anInt8776].method7557();
			}
			this.anInterface23_2 = this.anInterface23_1 = this.anInterface23Array3[++this.anInt8776] = arg0;
			this.anInterface23_2.method7555();
		}
	}

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "(B)I")
	private int method7361() {
		@Pc(5) int local5 = 0;
		this.aString95 = OpenGL.glGetString(7936).toLowerCase();
		this.aString94 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString95.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString95.indexOf("brian paul") != -1 || this.aString95.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static62.method1946(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(62) int local62 = Static562.method8436(local52[0]);
				@Pc(68) int local68 = Static562.method8436(local52[1]);
				this.anInt8791 = local62 * 10 + local68;
			} catch (@Pc(78) NumberFormatException local78) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt8791 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(124) int[] local124 = new int[1];
		OpenGL.glGetIntegerv(34018, local124, 0);
		this.anInt8793 = local124[0];
		OpenGL.glGetIntegerv(34929, local124, 0);
		this.anInt8795 = local124[0];
		OpenGL.glGetIntegerv(34930, local124, 0);
		this.anInt8804 = local124[0];
		if (this.anInt8793 < 2 || this.anInt8795 < 2 || this.anInt8804 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean616 = Stream.c();
		this.aBoolean637 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean640 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean631 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean630 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean619 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean617 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean628 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean629 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean636 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean625 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean620 = false;
		this.aBoolean626 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean624 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean623 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean627 = this.aBoolean623 & this.aBoolean624;
		OpenGL.glGetFloatv(2834, Static512.aFloatArray80, 0);
		this.aFloat183 = Static512.aFloatArray80[0];
		this.aFloat179 = Static512.aFloatArray80[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(19) Class1_Sub1 local19 = (Class1_Sub1) arg5;
		@Pc(22) Class85_Sub1_Sub1 local22 = local19.aClass85_Sub1_Sub1_1;
		this.method7379();
		this.method7358(local19.aClass85_Sub1_Sub1_1);
		this.method7340(1);
		this.method7316(7681, 8448);
		this.method7349(34167, 768, 0);
		@Pc(52) float local52 = local22.aFloat95 / (float) local22.anInt3123;
		@Pc(59) float local59 = local22.aFloat96 / (float) local22.anInt3122;
		@Pc(66) float local66 = (float) -arg0 + (float) arg2;
		@Pc(72) float local72 = (float) arg3 - (float) arg1;
		@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local66 * local66 + local72 * local72)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(104) float local104 = local66 * local85;
		@Pc(108) float local108 = local72 * local85;
		@Pc(114) int local114 = arg10 % (arg9 + arg8);
		@Pc(119) float local119 = (float) arg8 * local104;
		@Pc(124) float local124 = local108 * (float) arg8;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = local119;
		@Pc(132) float local132 = local124;
		if (local114 <= arg8) {
			local130 = local104 * (float) (arg8 - local114);
			local132 = local108 * (float) (arg8 - local114);
		} else {
			local128 = (float) (arg8 + arg9 - local114) * local108;
			local126 = (float) (arg8 + arg9 - local114) * local104;
		}
		@Pc(181) float local181 = local126 + (float) arg0 + 0.35F;
		@Pc(188) float local188 = (float) arg1 + local128 + 0.35F;
		@Pc(193) float local193 = (float) arg9 * local104;
		@Pc(198) float local198 = (float) arg9 * local108;
		while (true) {
			if (arg2 > arg0) {
				if (local181 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local181 + local130) {
					local130 = (float) arg2 - local181;
				}
			} else {
				if ((float) arg2 + 0.35F > local181) {
					break;
				}
				if ((float) arg2 > local181 + local130) {
					local130 = (float) arg2 - local181;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local188) {
					break;
				}
				if ((float) arg3 > local188 + local132) {
					local132 = (float) arg3 - local188;
				}
			} else {
				if (local188 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local132 + local188) {
					local132 = (float) arg3 - local188;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local52 * ((float) -arg6 + local181), local59 * ((float) -arg7 + local188));
			OpenGL.glVertex2f(local181, local188);
			OpenGL.glTexCoord2f((local181 + local130 - (float) arg6) * local52, ((float) -arg7 + local188 + local132) * local59);
			OpenGL.glVertex2f(local130 + local181, local188 + local132);
			OpenGL.glEnd();
			local181 += local130 + local193;
			local188 += local132 + local198;
			local132 = local124;
			local130 = local119;
		}
		this.method7349(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qo", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt8771 = 0;
		while (arg0 > 1) {
			this.anInt8771++;
			arg0 >>= 0x1;
		}
		this.anInt8772 = 0x1 << this.anInt8771;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static291.method5253(arg0, arg2, arg3, this, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([I)V")
	@Override
	public void method7235(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8737;
		arg0[1] = this.anInt8691;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7254(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aNativeHeap6 = ((Class2_Sub2_Sub1) arg0).aNativeHeap1;
		if (this.anInterface11_4 != null) {
			return;
		}
		@Pc(16) Class2_Sub11_Sub1 local16 = new Class2_Sub11_Sub1(80);
		if (this.aBoolean616) {
			local16.method3862(-1.0F);
			local16.method3862(-1.0F);
			local16.method3862(0.0F);
			local16.method3862(0.0F);
			local16.method3862(1.0F);
			local16.method3862(1.0F);
			local16.method3862(-1.0F);
			local16.method3862(0.0F);
			local16.method3862(1.0F);
			local16.method3862(1.0F);
			local16.method3862(1.0F);
			local16.method3862(1.0F);
			local16.method3862(0.0F);
			local16.method3862(1.0F);
			local16.method3862(0.0F);
			local16.method3862(-1.0F);
			local16.method3862(1.0F);
			local16.method3862(0.0F);
			local16.method3862(0.0F);
			local16.method3862(0.0F);
		} else {
			local16.method3861(-1.0F);
			local16.method3861(-1.0F);
			local16.method3861(0.0F);
			local16.method3861(0.0F);
			local16.method3861(1.0F);
			local16.method3861(1.0F);
			local16.method3861(-1.0F);
			local16.method3861(0.0F);
			local16.method3861(1.0F);
			local16.method3861(1.0F);
			local16.method3861(1.0F);
			local16.method3861(1.0F);
			local16.method3861(0.0F);
			local16.method3861(1.0F);
			local16.method3861(0.0F);
			local16.method3861(-1.0F);
			local16.method3861(1.0F);
			local16.method3861(0.0F);
			local16.method3861(0.0F);
			local16.method3861(0.0F);
		}
		this.anInterface11_4 = this.method7318(false, 20, local16.aByteArray128, local16.anInt10066);
		this.aClass223_11 = new Class223(this.anInterface11_4, 5126, 3, 0);
		this.aClass223_10 = new Class223(this.anInterface11_4, 5126, 2, 12);
		this.aClass319_1.method7902(this);
	}

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class85_Sub1_Sub1 local9 = local6.aClass85_Sub1_Sub1_1;
		this.method7379();
		this.method7358(local6.aClass85_Sub1_Sub1_1);
		this.method7340(1);
		this.method7316(7681, 8448);
		this.method7349(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat95 / (float) local9.anInt3123;
		@Pc(46) float local46 = local9.aFloat96 / (float) local9.anInt3122;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8815 - arg2), (float) (this.anInt8786 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8815, this.anInt8786);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8815 - arg2), local46 * (float) (this.anInt8789 - arg3));
		OpenGL.glVertex2i(this.anInt8815, this.anInt8789);
		OpenGL.glTexCoord2f((float) (this.anInt8809 - arg2) * local39, (float) (this.anInt8789 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8809, this.anInt8789);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8809 - arg2), local46 * (float) (this.anInt8786 - arg3));
		OpenGL.glVertex2i(this.anInt8809, this.anInt8786);
		OpenGL.glEnd();
		this.method7349(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "()Z")
	@Override
	public boolean method7297() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)Lclient!vm;")
	@Override
	public Interface25 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZIII)V")
	public void method7362(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "(I)V")
	private void method7363() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static190.method3914(1000L);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7312(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!qo", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8790 = arg0;
		this.anInt8807 = arg2;
		this.anInt8797 = arg1;
		this.aBoolean632 = true;
		this.anInt8799 = arg3;
	}

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "(I)V")
	private void method7364() {
		this.aFloatArray73[10] = this.aFloat190;
		this.aFloatArray73[14] = this.aFloat188;
		this.aFloat195 = this.anInt8803;
		this.aFloat194 = (this.aFloatArray73[14] - (float) this.anInt8803) / this.aFloatArray73[10];
	}

	@OriginalMember(owner = "client!qo", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8786 < arg1) {
			this.anInt8786 = arg1;
		}
		if (this.anInt8789 > arg3) {
			this.anInt8789 = arg3;
		}
		if (this.anInt8815 < arg0) {
			this.anInt8815 = arg0;
		}
		if (arg2 < this.anInt8809) {
			this.anInt8809 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method7359();
		this.method7398();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7272(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas9 == arg0) {
			local5 = this.aLong212;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable6.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas8 == arg0) {
			this.method7332();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([IIIIIZ)Lclient!mi;")
	@Override
	public Class46 method7314(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class46_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "(B)V")
	private void method7365() {
		if (this.anInt8782 == 1) {
			return;
		}
		this.method7350();
		this.method7394(false);
		this.method7315(false);
		this.method7339(false);
		this.method7335(false);
		this.method7358(null);
		this.method7344(-2);
		this.method7348(1);
		this.anInt8782 = 1;
	}

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "(I)V")
	private void method7366() {
		Static512.aFloatArray80[3] = 1.0F;
		Static512.aFloatArray80[0] = this.aFloat185 * this.aFloat176;
		Static512.aFloatArray80[1] = this.aFloat180 * this.aFloat185;
		Static512.aFloatArray80[2] = this.aFloat181 * this.aFloat185;
		OpenGL.glLightfv(16384, 4609, Static512.aFloatArray80, 0);
		Static512.aFloatArray80[2] = this.aFloat181 * -this.aFloat192;
		Static512.aFloatArray80[3] = 1.0F;
		Static512.aFloatArray80[1] = this.aFloat180 * -this.aFloat192;
		Static512.aFloatArray80[0] = this.aFloat176 * -this.aFloat192;
		OpenGL.glLightfv(16385, 4609, Static512.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	public synchronized void method7367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub43 local8 = new Class2_Sub43(arg0);
		local8.aLong278 = arg1;
		this.aClass341_52.method8528(local8);
	}

	@OriginalMember(owner = "client!qo", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt8818;
		this.anInt8818 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(BI)I")
	public int method7368(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Lclient!tv;I)V")
	public void method7369(@OriginalArg(0) Interface23 arg0) {
		if (this.anInt8774 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8774 >= 0) {
			this.anInterface23Array2[this.anInt8774].method7554();
		}
		this.anInterface23_2 = this.anInterface23Array2[++this.anInt8774] = arg0;
		this.anInterface23_2.method7558();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method7365();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method7340(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean631) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean631) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qo", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass30_Sub3_3.aFloat137 + (float) arg0 * this.aClass30_Sub3_3.aFloat139 + this.aClass30_Sub3_3.aFloat138 * (float) arg1 + this.aClass30_Sub3_3.aFloat146 * (float) arg2;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((this.aClass30_Sub3_3.aFloat135 + this.aClass30_Sub3_3.aFloat145 * (float) arg2 + this.aClass30_Sub3_3.aFloat136 * (float) arg1 + this.aClass30_Sub3_3.aFloat143 * (float) arg0) * (float) this.anInt8784 / local28);
		@Pc(109) int local109 = (int) (((float) arg0 * this.aClass30_Sub3_3.aFloat140 + this.aClass30_Sub3_3.aFloat142 * (float) arg1 + this.aClass30_Sub3_3.aFloat141 * (float) arg2 + this.aClass30_Sub3_3.aFloat144) * (float) this.anInt8792 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat193);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local109 - this.aFloat187);
	}

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method7257() {
		return new Class30_Sub3();
	}

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "()Z")
	@Override
	public boolean method7274() {
		if (this.aClass2_Sub17_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub17_Sub1_1.method7509()) {
			if (!this.aClass131_1.method4128(this.aClass2_Sub17_Sub1_1)) {
				return false;
			}
			this.aClass97_1.method3028();
		}
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "(I)V")
	private void method7370() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt8812; local7++) {
			@Pc(14) Class2_Sub1 local14 = this.aClass2_Sub1Array5[local7];
			Static71.aFloatArray38[0] = local14.method3969();
			@Pc(25) int local25 = local7 + 16386;
			Static71.aFloatArray38[1] = local14.method3967();
			Static71.aFloatArray38[2] = local14.method3962();
			Static71.aFloatArray38[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static71.aFloatArray38, 0);
			@Pc(52) int local52 = local14.method3965();
			@Pc(58) float local58 = local14.method3966() / 255.0F;
			Static71.aFloatArray38[2] = (float) (local52 & 0xFF) * local58;
			Static71.aFloatArray38[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static71.aFloatArray38[1] = (float) (local52 >> 8 & 0xFF) * local58;
			OpenGL.glLightfv(local25, 4609, Static71.aFloatArray38, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method3968() * local14.method3968()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt8806) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt8806 = this.anInt8812;
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "(B)V")
	public void method7371() {
		if (this.anInt8782 == 8) {
			return;
		}
		this.method7327();
		this.method7394(true);
		this.method7339(true);
		this.method7335(true);
		this.method7340(1);
		this.anInt8782 = 8;
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "(II)I")
	public int method7372(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!mda;I)V")
	@Override
	public void method7288(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1) {
		this.aClass319_1.method7899(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(Z)V")
	private void method7373() {
		this.aClass85Array1 = new Class85[this.anInt8793];
		this.aClass85_Sub1_3 = new Class85_Sub1(this, 3553, 6408, 1, 1);
		new Class85_Sub1(this, 3553, 6408, 1, 1);
		new Class85_Sub1(this, 3553, 6408, 1, 1);
		this.aClass166_Sub3_10 = new Class166_Sub3(this);
		this.aClass166_Sub3_7 = new Class166_Sub3(this);
		this.aClass166_Sub3_4 = new Class166_Sub3(this);
		this.aClass166_Sub3_6 = new Class166_Sub3(this);
		this.aClass166_Sub3_8 = new Class166_Sub3(this);
		this.aClass166_Sub3_1 = new Class166_Sub3(this);
		this.aClass166_Sub3_3 = new Class166_Sub3(this);
		this.aClass166_Sub3_5 = new Class166_Sub3(this);
		this.aClass166_Sub3_9 = new Class166_Sub3(this);
		this.aClass166_Sub3_2 = new Class166_Sub3(this);
		if (this.aBoolean626) {
			this.aClass295_5 = new Class295(this);
			new Class295(this);
		}
	}

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "(I)V")
	private void method7374() {
		Static512.aFloatArray80[3] = 1.0F;
		Static512.aFloatArray80[0] = this.aFloat175 * this.aFloat176;
		Static512.aFloatArray80[2] = this.aFloat181 * this.aFloat175;
		Static512.aFloatArray80[1] = this.aFloat180 * this.aFloat175;
		OpenGL.glLightModelfv(2899, Static512.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "()Lclient!fia;")
	@Override
	public Class108 method7240() {
		@Pc(7) int local7 = -1;
		if (this.aString95.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString95.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString95.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class108(local7, "OpenGL", this.anInt8791, this.aString94, 0L);
	}

	@OriginalMember(owner = "client!qo", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass30_Sub3_3.aFloat138 + this.aClass30_Sub3_3.aFloat139 * (float) arg0 + this.aClass30_Sub3_3.aFloat146 * (float) arg2 + this.aClass30_Sub3_3.aFloat137;
		if (local28 < (float) this.anInt8805 || local28 > (float) this.anInt8803) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt8784 * ((float) arg1 * this.aClass30_Sub3_3.aFloat136 + this.aClass30_Sub3_3.aFloat143 * (float) arg0 + this.aClass30_Sub3_3.aFloat145 * (float) arg2 + this.aClass30_Sub3_3.aFloat135) / local28);
		@Pc(117) int local117 = (int) ((this.aClass30_Sub3_3.aFloat144 + (float) arg0 * this.aClass30_Sub3_3.aFloat140 + this.aClass30_Sub3_3.aFloat142 * (float) arg1 + this.aClass30_Sub3_3.aFloat141 * (float) arg2) * (float) this.anInt8792 / local28);
		if (this.aFloat193 <= (float) local85 && (float) local85 <= this.aFloat186 && this.aFloat187 <= (float) local117 && this.aFloat184 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat193);
			arg3[1] = (int) ((float) local117 - this.aFloat187);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "(I)V")
	public void method7375() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!qo", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!is;)V")
	@Override
	public void method7290(@OriginalArg(0) Interface14 arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt8737 < arg2) {
			arg2 = this.anInt8737;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt8691 < arg3) {
			arg3 = this.anInt8691;
		}
		this.anInt8809 = arg2;
		this.anInt8789 = arg3;
		this.anInt8786 = arg1;
		this.anInt8815 = arg0;
		OpenGL.glEnable(3089);
		this.method7359();
		this.method7398();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BF)V")
	public void method7376(@OriginalArg(1) float arg0) {
		if (this.aFloat189 != arg0) {
			this.aFloat189 = arg0;
			if (this.anInt8813 == 3) {
				this.method7334();
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8786 = 0;
		this.anInt8789 = this.anInt8691;
		this.anInt8809 = this.anInt8737;
		this.anInt8815 = 0;
		OpenGL.glDisable(3089);
		this.method7359();
	}

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean639 = arg0;
		this.method7382();
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "()V")
	@Override
	public void method7266() {
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
	public void method7377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8814 = arg0;
		this.anInt8783 = arg1;
		this.method7396();
		this.method7398();
	}

	@OriginalMember(owner = "client!qo", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = (float) arg2 * this.aClass30_Sub3_3.aFloat146 + (float) arg0 * this.aClass30_Sub3_3.aFloat139 + (float) arg1 * this.aClass30_Sub3_3.aFloat138 + this.aClass30_Sub3_3.aFloat137;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass30_Sub3_3.aFloat146 + (float) arg4 * this.aClass30_Sub3_3.aFloat138 + this.aClass30_Sub3_3.aFloat139 * (float) arg3 + this.aClass30_Sub3_3.aFloat137;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt8805 > local32 && (float) this.anInt8805 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt8803 && local63 > (float) this.anInt8803) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass30_Sub3_3.aFloat145 * (float) arg2 + this.aClass30_Sub3_3.aFloat136 * (float) arg1 + this.aClass30_Sub3_3.aFloat143 * (float) arg0 + this.aClass30_Sub3_3.aFloat135) * (float) this.anInt8784 / local32);
		@Pc(167) int local167 = (int) ((float) this.anInt8784 * ((float) arg5 * this.aClass30_Sub3_3.aFloat145 + this.aClass30_Sub3_3.aFloat143 * (float) arg3 + this.aClass30_Sub3_3.aFloat136 * (float) arg4 + this.aClass30_Sub3_3.aFloat135) / local63);
		if ((float) local135 < this.aFloat193 && this.aFloat193 > (float) local167) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat186 && (float) local167 > this.aFloat186) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((float) this.anInt8792 * (this.aClass30_Sub3_3.aFloat141 * (float) arg2 + (float) arg1 * this.aClass30_Sub3_3.aFloat142 + (float) arg0 * this.aClass30_Sub3_3.aFloat140 + this.aClass30_Sub3_3.aFloat144) / local32);
		@Pc(265) int local265 = (int) ((this.aClass30_Sub3_3.aFloat144 + (float) arg3 * this.aClass30_Sub3_3.aFloat140 + (float) arg4 * this.aClass30_Sub3_3.aFloat142 + this.aClass30_Sub3_3.aFloat141 * (float) arg5) * (float) this.anInt8792 / local63);
		if ((float) local233 < this.aFloat187 && this.aFloat187 > (float) local265) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat184 && (float) local265 > this.aFloat184) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "()Z")
	@Override
	public boolean method7296() {
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)Lclient!mi;")
	@Override
	public Class46 method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class46_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)V")
	@Override
	public void method7281(@OriginalArg(0) int arg0) {
		this.method7384();
	}

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "(I)V")
	private void method7378() {
		this.method7344(-2);
		for (@Pc(14) int local14 = this.anInt8793 - 1; local14 >= 0; local14--) {
			this.method7325(local14);
			this.method7358(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7316(8448, 8448);
		this.method7349(34168, 770, 2);
		this.method7354();
		this.anInt8781 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8780 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean613 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean611 = true;
		this.method7394(true);
		this.method7315(true);
		this.method7339(true);
		this.method7335(true);
		this.method7342();
		this.anOpenGL2.setSwapInterval(0);
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
		@Pc(125) float[] local125 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(127) int local127 = 0; local127 < 8; local127++) {
			@Pc(133) int local133 = local127 + 16384;
			OpenGL.glLightfv(local133, 4608, local125, 0);
			OpenGL.glLightf(local133, 4615, 0.0F);
			OpenGL.glLightf(local133, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8798 = this.anInt8810 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "(I)V")
	public void method7379() {
		if (this.anInt8782 == 2) {
			return;
		}
		this.method7350();
		this.method7394(false);
		this.method7315(false);
		this.method7339(false);
		this.method7335(false);
		this.method7344(-2);
		this.anInt8782 = 2;
	}

	@OriginalMember(owner = "client!qo", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt8817;
		this.anInt8817 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!ni;)V")
	public void method7380(@OriginalArg(1) Interface18 arg0) {
		if (this.anInterface18_2 != arg0) {
			if (this.aBoolean640) {
				OpenGL.glBindBufferARB(34963, arg0.method9225());
			}
			this.anInterface18_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!nh;Lclient!nh;ILclient!nh;Lclient!nh;)V")
	public void method7381(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(3) Class223 arg2, @OriginalArg(4) Class223 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method7337(arg0.anInterface11_2);
			OpenGL.glVertexPointer(arg0.aByte111, arg0.aShort84, this.anInterface11_5.method5048(), this.anInterface11_5.method5047() + (long) arg0.aByte110);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method7337(arg3.anInterface11_2);
			OpenGL.glNormalPointer(arg3.aShort84, this.anInterface11_5.method5048(), this.anInterface11_5.method5047() + (long) arg3.aByte110);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method7337(arg1.anInterface11_2);
			OpenGL.glColorPointer(arg1.aByte111, arg1.aShort84, this.anInterface11_5.method5048(), this.anInterface11_5.method5047() + (long) arg1.aByte110);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method7337(arg2.anInterface11_2);
			OpenGL.glTexCoordPointer(arg2.aByte111, arg2.aShort84, this.anInterface11_5.method5048(), this.anInterface11_5.method5047() + (long) arg2.aByte110);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "()I")
	@Override
	public int method7307() {
		return 4;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!he;Lclient!vm;)Lclient!is;")
	@Override
	public Interface14 method7237(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Interface25 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method7243() {
		return this.aClass30_Sub3_3;
	}

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "(I)V")
	private void method7382() {
		OpenGL.glDepthMask(this.aBoolean612 && this.aBoolean639);
	}

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "()Lclient!bca;")
	@Override
	public Class30 method7308() {
		return this.aClass30_Sub3_1;
	}

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8805;
	}

	@OriginalMember(owner = "client!qo", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7335(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Z)V")
	@Override
	public void method7250(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "(I)V")
	public void method7383() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray75, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray74, 0);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "()Z")
	@Override
	public boolean method7242() {
		return this.aClass205_1.method5885();
	}

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "()Z")
	@Override
	public boolean method7269() {
		return this.aClass2_Sub17_Sub1_1 != null && this.aClass2_Sub17_Sub1_1.method7509();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[Lclient!ab;)V")
	@Override
	public void method7245(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub1Array5[local3] = arg1[local3];
		}
		this.anInt8812 = arg0;
		if (this.anInt8813 != 1) {
			this.method7370();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	@Override
	public void method7233(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "(I)V")
	private void method7384() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!qo", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean632 = false;
	}

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg2 * this.aClass30_Sub3_3.aFloat146 + (float) arg1 * this.aClass30_Sub3_3.aFloat138 + (float) arg0 * this.aClass30_Sub3_3.aFloat139 + this.aClass30_Sub3_3.aFloat137;
		@Pc(55) float local55 = (float) arg5 * this.aClass30_Sub3_3.aFloat146 + this.aClass30_Sub3_3.aFloat139 * (float) arg3 + (float) arg4 * this.aClass30_Sub3_3.aFloat138 + this.aClass30_Sub3_3.aFloat137;
		@Pc(57) int local57 = 0;
		if (local30 < (float) this.anInt8805 && (float) this.anInt8805 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt8803 < local30 && local55 > (float) this.anInt8803) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt8784 * (this.aClass30_Sub3_3.aFloat145 * (float) arg2 + this.aClass30_Sub3_3.aFloat136 * (float) arg1 + this.aClass30_Sub3_3.aFloat143 * (float) arg0 + this.aClass30_Sub3_3.aFloat135) / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt8784 * (this.aClass30_Sub3_3.aFloat135 + this.aClass30_Sub3_3.aFloat145 * (float) arg5 + (float) arg3 * this.aClass30_Sub3_3.aFloat143 + this.aClass30_Sub3_3.aFloat136 * (float) arg4) / (float) arg6);
		if (this.aFloat193 > (float) local124 && this.aFloat193 > (float) local157) {
			local57 |= 0x1;
		} else if (this.aFloat186 < (float) local124 && (float) local157 > this.aFloat186) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass30_Sub3_3.aFloat144 + this.aClass30_Sub3_3.aFloat141 * (float) arg2 + this.aClass30_Sub3_3.aFloat140 * (float) arg0 + (float) arg1 * this.aClass30_Sub3_3.aFloat142) * (float) this.anInt8792 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt8792 * ((float) arg5 * this.aClass30_Sub3_3.aFloat141 + (float) arg4 * this.aClass30_Sub3_3.aFloat142 + this.aClass30_Sub3_3.aFloat140 * (float) arg3 + this.aClass30_Sub3_3.aFloat144) / (float) arg6);
		if (this.aFloat187 > (float) local224 && (float) local257 < this.aFloat187) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat184 && this.aFloat184 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "(II)I")
	public int method7385(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFB)V")
	private void method7386(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean635) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean635 = true;
	}

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "(II)V")
	public synchronized void method7387(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub43 local8 = new Class2_Sub43(arg0);
		this.aClass341_53.method8528(local8);
	}

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "()V")
	@Override
	public void method7301() {
		this.aClass131_1.method4126();
	}

	@OriginalMember(owner = "client!qo", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7365();
		this.method7340(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt8779 + this.anInt8778 + this.anInt8777;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!wh;Lclient!wh;FLclient!wh;)Lclient!wh;")
	@Override
	public Class78 method7309(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class78 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean636 && this.aBoolean626) {
			@Pc(15) Class78_Sub1_Sub2 local15 = null;
			@Pc(18) Class78_Sub1 local18 = (Class78_Sub1) arg0;
			@Pc(21) Class78_Sub1 local21 = (Class78_Sub1) arg1;
			@Pc(25) Class85_Sub3 local25 = local18.method7091();
			@Pc(29) Class85_Sub3 local29 = local21.method7091();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt8238 >= local25.anInt8238 ? local29.anInt8238 : local25.anInt8238;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class78_Sub1_Sub2) {
					@Pc(56) Class78_Sub1_Sub2 local56 = (Class78_Sub1_Sub2) arg3;
					if (local44 == local56.method7096()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class78_Sub1_Sub2(this, local44);
				}
				if (local15.method7095(local25, arg2, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7280(@OriginalArg(0) Canvas arg0) {
		this.aCanvas8 = null;
		this.aLong213 = 0L;
		if (arg0 == null || arg0 == this.aCanvas9) {
			this.aCanvas8 = this.aCanvas9;
			this.aLong213 = this.aLong212;
		} else if (this.aHashtable6.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable6.get(arg0);
			this.aLong213 = local36;
			this.aCanvas8 = arg0;
		}
		if (this.aCanvas8 == null || this.aLong213 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong213);
		this.method7332();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V")
	public void method7388(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method7333(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(II)I")
	@Override
	public int method7270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7310(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7229(arg2, arg3);
	}

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "(I)V")
	private void method7390() {
		this.aFloat182 = (float) (this.anInt8803 - this.anInt8802) - this.aFloat177;
		this.aFloat178 = this.aFloat182 - this.aFloat191 * (float) this.anInt8788;
		if ((float) this.anInt8805 > this.aFloat178) {
			this.aFloat178 = this.anInt8805;
		}
		OpenGL.glFogf(2915, this.aFloat178);
		OpenGL.glFogf(2916, this.aFloat182);
		Static512.aFloatArray80[0] = (float) (this.anInt8810 & 0xFF0000) / 1.671168E7F;
		Static512.aFloatArray80[1] = (float) (this.anInt8810 & 0xFF00) / 65280.0F;
		Static512.aFloatArray80[2] = (float) (this.anInt8810 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static512.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V")
	public void method7391(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean622) {
			this.aBoolean622 = arg0;
			this.method7355();
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V")
	@Override
	public void method7229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8805 && this.anInt8803 == arg1) {
			return;
		}
		this.anInt8805 = arg0;
		this.anInt8803 = arg1;
		this.method7393();
		this.method7390();
		if (this.anInt8813 == 3) {
			this.method7334();
			return;
		}
		if (this.anInt8813 != 2) {
			return;
		}
		this.method7317();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass131_1.method4129(arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(ILclient!tv;)V")
	public void method7392(@OriginalArg(1) Interface23 arg0) {
		if (this.anInt8774 < 0 || arg0 != this.anInterface23Array2[this.anInt8774]) {
			throw new RuntimeException();
		}
		this.anInterface23Array2[this.anInt8774--] = null;
		arg0.method7554();
		if (this.anInt8774 < 0) {
			this.anInterface23_2 = null;
		} else {
			this.anInterface23_2 = this.anInterface23Array2[this.anInt8774];
			this.anInterface23_2.method7558();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	@Override
	public void method7234(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(II)Lclient!he;")
	@Override
	public Interface12 method7268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "(I)V")
	private void method7393() {
		@Pc(6) float[] local6 = this.aFloatArray73;
		@Pc(18) float local18 = (float) (this.anInt8805 * -this.anInt8808) / (float) this.anInt8784;
		@Pc(32) float local32 = (float) ((this.anInt8737 - this.anInt8808) * this.anInt8805) / (float) this.anInt8784;
		@Pc(49) float local49 = (float) (this.anInt8805 * this.anInt8800) / (float) this.anInt8792;
		@Pc(64) float local64 = (float) ((this.anInt8800 - this.anInt8691) * this.anInt8805) / (float) this.anInt8792;
		if (local32 == local18 || local64 == local49) {
			local6[13] = 0.0F;
			local6[15] = 1.0F;
			local6[3] = 0.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
			local6[8] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[10] = 1.0F;
			local6[14] = 0.0F;
			local6[5] = 1.0F;
			local6[0] = 1.0F;
			local6[9] = 0.0F;
			local6[2] = 0.0F;
		} else {
			@Pc(144) float local144 = (float) this.anInt8805 * 2.0F;
			local6[1] = 0.0F;
			local6[5] = local144 / (local49 - local64);
			local6[9] = (local49 + local64) / (-local64 + local49);
			local6[3] = 0.0F;
			local6[4] = 0.0F;
			local6[8] = (local32 + local18) / (local32 - local18);
			local6[7] = 0.0F;
			local6[14] = this.aFloat188 = -((float) this.anInt8803 * local144) / (float) (this.anInt8803 - this.anInt8805);
			local6[2] = 0.0F;
			local6[11] = -1.0F;
			local6[15] = 0.0F;
			local6[10] = this.aFloat190 = (float) -(this.anInt8803 + this.anInt8805) / (float) (this.anInt8803 - this.anInt8805);
			local6[12] = 0.0F;
			local6[0] = local144 / (local32 - local18);
			local6[13] = 0.0F;
			local6[6] = 0.0F;
		}
		this.method7364();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "()V")
	@Override
	public void method7236() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!rh;Z)Lclient!mi;")
	@Override
	public Class46 method7294(@OriginalArg(0) Class296 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt9028 * arg0.anInt9024];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray116 == null) {
			for (local21 = 0; local21 < arg0.anInt9024; local21++) {
				for (local25 = 0; local25 < arg0.anInt9028; local25++) {
					@Pc(83) int local83 = arg0.anIntArray582[arg0.aByteArray117[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt9024; local21++) {
				for (local25 = 0; local25 < arg0.anInt9028; local25++) {
					local12[local16++] = arg0.aByteArray116[local14] << 24 | arg0.anIntArray582[arg0.aByteArray117[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(120) Class46 local120 = this.method7265(arg0.anInt9028, local12, arg0.anInt9028, arg0.anInt9024);
		local120.method6224(arg0.anInt9029, arg0.anInt9026, arg0.anInt9025, arg0.anInt9027);
		return local120;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(ZI)V")
	public void method7394(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean621) {
			this.aBoolean621 = arg0;
			this.method7319();
			this.anInt8782 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "(II)V")
	public void method7395(@OriginalArg(0) int arg0) {
		Static512.aFloatArray80[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static512.aFloatArray80[3] = (float) (arg0 >>> 24) / 255.0F;
		Static512.aFloatArray80[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static512.aFloatArray80[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static512.aFloatArray80, 0);
	}

	@OriginalMember(owner = "client!qo", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt8691 - arg1 - local12, arg2, 1, 32993, this.anInt8801, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(Z)V")
	private void method7396() {
		OpenGL.glViewport(this.anInt8783, this.anInt8814, this.anInt8737, this.anInt8691);
	}

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "()Z")
	@Override
	public boolean method7302() {
		return this.aBoolean631 && (!this.method7269() || this.aBoolean627);
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(III)V")
	public synchronized void method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub43 local12 = new Class2_Sub43(arg1);
		local12.aLong278 = arg0;
		this.aClass341_54.method8528(local12);
	}

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "(B)V")
	private void method7398() {
		if (this.anInt8815 <= this.anInt8809 && this.anInt8786 <= this.anInt8789) {
			OpenGL.glScissor(this.anInt8783 + this.anInt8815, this.anInt8814 + this.anInt8691 - this.anInt8789, this.anInt8809 - this.anInt8815, -this.anInt8786 + this.anInt8789);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "()Z")
	@Override
	public boolean method7311() {
		return false;
	}
}
