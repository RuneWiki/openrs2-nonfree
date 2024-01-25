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

@OriginalClass("client!jj")
public final class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
	private int anInt4462;

	@OriginalMember(owner = "client!jj", name = "eb", descriptor = "I")
	public int anInt4471;

	@OriginalMember(owner = "client!jj", name = "ub", descriptor = "I")
	public int anInt4485;

	@OriginalMember(owner = "client!jj", name = "gd", descriptor = "I")
	private int anInt4571;

	@OriginalMember(owner = "client!jj", name = "pe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!jj", name = "re", descriptor = "I")
	public int anInt4623;

	@OriginalMember(owner = "client!jj", name = "xe", descriptor = "Lclient!cu;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!jj", name = "Be", descriptor = "Lclient!cu;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!jj", name = "Ee", descriptor = "I")
	public int anInt4628;

	@OriginalMember(owner = "client!jj", name = "Fe", descriptor = "I")
	public int anInt4629;

	@OriginalMember(owner = "client!jj", name = "Ge", descriptor = "I")
	private int anInt4630;

	@OriginalMember(owner = "client!jj", name = "Ue", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!jj", name = "Ve", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_1;

	@OriginalMember(owner = "client!jj", name = "We", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_2;

	@OriginalMember(owner = "client!jj", name = "Xe", descriptor = "Z")
	public boolean aBoolean274;

	@OriginalMember(owner = "client!jj", name = "Ye", descriptor = "Lclient!hp;")
	public Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!jj", name = "Ze", descriptor = "Lclient!as;")
	public Class19 aClass19_7;

	@OriginalMember(owner = "client!jj", name = "af", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_3;

	@OriginalMember(owner = "client!jj", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!jj", name = "ef", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_4;

	@OriginalMember(owner = "client!jj", name = "hf", descriptor = "I")
	private int anInt4635;

	@OriginalMember(owner = "client!jj", name = "jf", descriptor = "I")
	private int anInt4636;

	@OriginalMember(owner = "client!jj", name = "kf", descriptor = "I")
	private int anInt4637;

	@OriginalMember(owner = "client!jj", name = "lf", descriptor = "F")
	private float aFloat186;

	@OriginalMember(owner = "client!jj", name = "mf", descriptor = "Lclient!og;")
	private Class4_Sub2_Sub1 aClass4_Sub2_Sub1_2;

	@OriginalMember(owner = "client!jj", name = "pf", descriptor = "Lclient!as;")
	public Class19 aClass19_8;

	@OriginalMember(owner = "client!jj", name = "qf", descriptor = "Z")
	public boolean aBoolean276;

	@OriginalMember(owner = "client!jj", name = "rf", descriptor = "Z")
	private boolean aBoolean277;

	@OriginalMember(owner = "client!jj", name = "sf", descriptor = "Z")
	public boolean aBoolean278;

	@OriginalMember(owner = "client!jj", name = "tf", descriptor = "Lclient!pi;")
	private Interface11 anInterface11_4;

	@OriginalMember(owner = "client!jj", name = "uf", descriptor = "I")
	public int anInt4638;

	@OriginalMember(owner = "client!jj", name = "wf", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!jj", name = "yf", descriptor = "Z")
	private boolean aBoolean280;

	@OriginalMember(owner = "client!jj", name = "zf", descriptor = "Lclient!pi;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!jj", name = "Bf", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!jj", name = "Cf", descriptor = "F")
	public float aFloat189;

	@OriginalMember(owner = "client!jj", name = "Ff", descriptor = "I")
	public int anInt4643;

	@OriginalMember(owner = "client!jj", name = "Hf", descriptor = "Z")
	private boolean aBoolean283;

	@OriginalMember(owner = "client!jj", name = "If", descriptor = "Lclient!fs;")
	public Class103 aClass103_1;

	@OriginalMember(owner = "client!jj", name = "Jf", descriptor = "I")
	private int anInt4644;

	@OriginalMember(owner = "client!jj", name = "Mf", descriptor = "Ljava/lang/String;")
	private String aString45;

	@OriginalMember(owner = "client!jj", name = "Of", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!jj", name = "Rf", descriptor = "F")
	private float aFloat192;

	@OriginalMember(owner = "client!jj", name = "Sf", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_5;

	@OriginalMember(owner = "client!jj", name = "Uf", descriptor = "Z")
	public boolean aBoolean285;

	@OriginalMember(owner = "client!jj", name = "ag", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_6;

	@OriginalMember(owner = "client!jj", name = "cg", descriptor = "I")
	private int anInt4649;

	@OriginalMember(owner = "client!jj", name = "dg", descriptor = "I")
	private int anInt4650;

	@OriginalMember(owner = "client!jj", name = "fg", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_7;

	@OriginalMember(owner = "client!jj", name = "gg", descriptor = "I")
	public int anInt4651;

	@OriginalMember(owner = "client!jj", name = "jg", descriptor = "I")
	private int anInt4654;

	@OriginalMember(owner = "client!jj", name = "ng", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!jj", name = "pg", descriptor = "Lclient!ol;")
	public Class78_Sub3 aClass78_Sub3_3;

	@OriginalMember(owner = "client!jj", name = "rg", descriptor = "Z")
	public boolean aBoolean290;

	@OriginalMember(owner = "client!jj", name = "tg", descriptor = "[Lclient!aba;")
	private Class4[] aClass4Array1;

	@OriginalMember(owner = "client!jj", name = "ug", descriptor = "J")
	private long aLong143;

	@OriginalMember(owner = "client!jj", name = "vg", descriptor = "F")
	public float aFloat197;

	@OriginalMember(owner = "client!jj", name = "wg", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!jj", name = "xg", descriptor = "F")
	public float aFloat198;

	@OriginalMember(owner = "client!jj", name = "yg", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!jj", name = "zg", descriptor = "I")
	private int anInt4659;

	@OriginalMember(owner = "client!jj", name = "Cg", descriptor = "I")
	private int anInt4660;

	@OriginalMember(owner = "client!jj", name = "Dg", descriptor = "F")
	private float aFloat201;

	@OriginalMember(owner = "client!jj", name = "Eg", descriptor = "Z")
	private boolean aBoolean291;

	@OriginalMember(owner = "client!jj", name = "Fg", descriptor = "Lclient!gw;")
	private Interface6 anInterface6_3;

	@OriginalMember(owner = "client!jj", name = "Gg", descriptor = "Z")
	private boolean aBoolean292;

	@OriginalMember(owner = "client!jj", name = "Jg", descriptor = "Z")
	public boolean aBoolean293;

	@OriginalMember(owner = "client!jj", name = "Mg", descriptor = "I")
	private int anInt4663;

	@OriginalMember(owner = "client!jj", name = "Ng", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_8;

	@OriginalMember(owner = "client!jj", name = "Qg", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!jj", name = "Rg", descriptor = "Z")
	private boolean aBoolean295;

	@OriginalMember(owner = "client!jj", name = "Tg", descriptor = "I")
	public int anInt4665;

	@OriginalMember(owner = "client!jj", name = "Ug", descriptor = "Lclient!ev;")
	private Class92_Sub1 aClass92_Sub1_1;

	@OriginalMember(owner = "client!jj", name = "Vg", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_9;

	@OriginalMember(owner = "client!jj", name = "Wg", descriptor = "Lclient!la;")
	public Class36_Sub2 aClass36_Sub2_10;

	@OriginalMember(owner = "client!jj", name = "Xg", descriptor = "Ljava/lang/String;")
	private String aString46;

	@OriginalMember(owner = "client!jj", name = "Yg", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!jj", name = "ah", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!jj", name = "bh", descriptor = "Lclient!ol;")
	public Class78_Sub3 aClass78_Sub3_4;

	@OriginalMember(owner = "client!jj", name = "ch", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!jj", name = "gh", descriptor = "I")
	private int anInt4668;

	@OriginalMember(owner = "client!jj", name = "kh", descriptor = "I")
	private int anInt4669;

	@OriginalMember(owner = "client!jj", name = "jb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!jj", name = "je", descriptor = "I")
	public int anInt4619 = 128;

	@OriginalMember(owner = "client!jj", name = "de", descriptor = "Lclient!hc;")
	private final Class124 aClass124_1 = new Class124();

	@OriginalMember(owner = "client!jj", name = "ne", descriptor = "Lclient!ol;")
	private final Class78_Sub3 aClass78_Sub3_1 = new Class78_Sub3();

	@OriginalMember(owner = "client!jj", name = "oe", descriptor = "Lclient!ol;")
	public final Class78_Sub3 aClass78_Sub3_2 = new Class78_Sub3();

	@OriginalMember(owner = "client!jj", name = "qe", descriptor = "I")
	public int anInt4622 = 3;

	@OriginalMember(owner = "client!jj", name = "ue", descriptor = "Z")
	private boolean aBoolean270 = false;

	@OriginalMember(owner = "client!jj", name = "te", descriptor = "I")
	public int anInt4624 = 8;

	@OriginalMember(owner = "client!jj", name = "se", descriptor = "Lclient!fea;")
	private final Class99 aClass99_29 = new Class99();

	@OriginalMember(owner = "client!jj", name = "we", descriptor = "I")
	private int anInt4625 = -1;

	@OriginalMember(owner = "client!jj", name = "ye", descriptor = "[Lclient!cu;")
	private final Interface2[] anInterface2Array1 = new Interface2[4];

	@OriginalMember(owner = "client!jj", name = "Ae", descriptor = "I")
	private int anInt4627 = -1;

	@OriginalMember(owner = "client!jj", name = "De", descriptor = "[Lclient!cu;")
	private final Interface2[] anInterface2Array3 = new Interface2[4];

	@OriginalMember(owner = "client!jj", name = "Ce", descriptor = "[Lclient!cu;")
	private final Interface2[] anInterface2Array2 = new Interface2[4];

	@OriginalMember(owner = "client!jj", name = "ze", descriptor = "I")
	private int anInt4626 = -1;

	@OriginalMember(owner = "client!jj", name = "He", descriptor = "Lclient!fea;")
	private final Class99 aClass99_30;

	@OriginalMember(owner = "client!jj", name = "Ie", descriptor = "Lclient!fea;")
	private final Class99 aClass99_31;

	@OriginalMember(owner = "client!jj", name = "Je", descriptor = "Lclient!fea;")
	private final Class99 aClass99_32;

	@OriginalMember(owner = "client!jj", name = "Ke", descriptor = "Lclient!fea;")
	private final Class99 aClass99_33;

	@OriginalMember(owner = "client!jj", name = "Le", descriptor = "Lclient!fea;")
	private final Class99 aClass99_34;

	@OriginalMember(owner = "client!jj", name = "Me", descriptor = "Lclient!fea;")
	private final Class99 aClass99_35;

	@OriginalMember(owner = "client!jj", name = "Ne", descriptor = "Lclient!fea;")
	private final Class99 aClass99_36;

	@OriginalMember(owner = "client!jj", name = "df", descriptor = "I")
	private int anInt4633;

	@OriginalMember(owner = "client!jj", name = "of", descriptor = "F")
	public float aFloat188;

	@OriginalMember(owner = "client!jj", name = "Qe", descriptor = "[F")
	private final float[] aFloatArray30;

	@OriginalMember(owner = "client!jj", name = "Kf", descriptor = "I")
	public int anInt4645;

	@OriginalMember(owner = "client!jj", name = "Df", descriptor = "[F")
	private final float[] aFloatArray31;

	@OriginalMember(owner = "client!jj", name = "Te", descriptor = "[Lclient!uca;")
	private final Class5_Sub10[] aClass5_Sub10Array4;

	@OriginalMember(owner = "client!jj", name = "Re", descriptor = "F")
	public float aFloat185;

	@OriginalMember(owner = "client!jj", name = "Nf", descriptor = "F")
	public float aFloat190;

	@OriginalMember(owner = "client!jj", name = "nf", descriptor = "F")
	private float aFloat187;

	@OriginalMember(owner = "client!jj", name = "Ef", descriptor = "I")
	private int anInt4642;

	@OriginalMember(owner = "client!jj", name = "hg", descriptor = "I")
	public int anInt4652;

	@OriginalMember(owner = "client!jj", name = "lg", descriptor = "F")
	private float aFloat195;

	@OriginalMember(owner = "client!jj", name = "gf", descriptor = "I")
	public int anInt4634;

	@OriginalMember(owner = "client!jj", name = "qg", descriptor = "I")
	public int anInt4656;

	@OriginalMember(owner = "client!jj", name = "sg", descriptor = "I")
	private int anInt4657;

	@OriginalMember(owner = "client!jj", name = "kg", descriptor = "F")
	private float aFloat194;

	@OriginalMember(owner = "client!jj", name = "Af", descriptor = "I")
	private int anInt4641;

	@OriginalMember(owner = "client!jj", name = "Tf", descriptor = "I")
	private int anInt4647;

	@OriginalMember(owner = "client!jj", name = "ig", descriptor = "I")
	public int anInt4653;

	@OriginalMember(owner = "client!jj", name = "Lf", descriptor = "I")
	public int anInt4646;

	@OriginalMember(owner = "client!jj", name = "mg", descriptor = "I")
	private int anInt4655;

	@OriginalMember(owner = "client!jj", name = "og", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!jj", name = "Yf", descriptor = "I")
	public int anInt4648;

	@OriginalMember(owner = "client!jj", name = "vf", descriptor = "I")
	private int anInt4639;

	@OriginalMember(owner = "client!jj", name = "xf", descriptor = "I")
	private int anInt4640;

	@OriginalMember(owner = "client!jj", name = "Ag", descriptor = "[F")
	public final float[] aFloatArray34;

	@OriginalMember(owner = "client!jj", name = "cf", descriptor = "I")
	public int anInt4632;

	@OriginalMember(owner = "client!jj", name = "Lg", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!jj", name = "Pg", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!jj", name = "Sg", descriptor = "F")
	private float aFloat205;

	@OriginalMember(owner = "client!jj", name = "Pf", descriptor = "[F")
	private final float[] aFloatArray32;

	@OriginalMember(owner = "client!jj", name = "Hg", descriptor = "F")
	private float aFloat202;

	@OriginalMember(owner = "client!jj", name = "bg", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!jj", name = "Og", descriptor = "I")
	public int anInt4664;

	@OriginalMember(owner = "client!jj", name = "Bg", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!jj", name = "Kg", descriptor = "I")
	private int anInt4662;

	@OriginalMember(owner = "client!jj", name = "Wf", descriptor = "[F")
	private final float[] aFloatArray33;

	@OriginalMember(owner = "client!jj", name = "dh", descriptor = "I")
	public int anInt4666;

	@OriginalMember(owner = "client!jj", name = "Ig", descriptor = "I")
	private int anInt4661;

	@OriginalMember(owner = "client!jj", name = "Zg", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!jj", name = "eh", descriptor = "I")
	public int anInt4667;

	@OriginalMember(owner = "client!jj", name = "Zf", descriptor = "Lclient!jv;")
	public Class5_Sub3_Sub2 aClass5_Sub3_Sub2_3;

	@OriginalMember(owner = "client!jj", name = "fh", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!jj", name = "hh", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!jj", name = "ih", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!jj", name = "jh", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!jj", name = "Nd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!jj", name = "lc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!jj", name = "fe", descriptor = "I")
	public final int anInt4615;

	@OriginalMember(owner = "client!jj", name = "ic", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "J")
	private final long aLong141;

	@OriginalMember(owner = "client!jj", name = "Xc", descriptor = "J")
	private long aLong142;

	@OriginalMember(owner = "client!jj", name = "Pe", descriptor = "I")
	public final int anInt4631;

	@OriginalMember(owner = "client!jj", name = "Vf", descriptor = "Z")
	public boolean aBoolean286;

	@OriginalMember(owner = "client!jj", name = "Xf", descriptor = "Z")
	public boolean aBoolean287;

	@OriginalMember(owner = "client!jj", name = "ff", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!jj", name = "Oe", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!jj", name = "eg", descriptor = "Z")
	private boolean aBoolean288;

	@OriginalMember(owner = "client!jj", name = "Qf", descriptor = "Z")
	public boolean aBoolean284;

	@OriginalMember(owner = "client!jj", name = "Gf", descriptor = "Z")
	public boolean aBoolean282;

	@OriginalMember(owner = "client!jj", name = "Se", descriptor = "Z")
	private final boolean aBoolean272;

	@OriginalMember(owner = "client!jj", name = "Sd", descriptor = "Lclient!ba;")
	private final Class20 aClass20_1;

	@OriginalMember(owner = "client!jj", name = "ve", descriptor = "Lclient!nv;")
	public final Class215 aClass215_1;

	@OriginalMember(owner = "client!jj", name = "Vd", descriptor = "Lclient!ph;")
	private final Class232 aClass232_1;

	@OriginalMember(owner = "client!jj", name = "me", descriptor = "Lclient!tu;")
	private Class5_Sub8_Sub1 aClass5_Sub8_Sub1_1;

	@OriginalMember(owner = "client!jj", name = "Td", descriptor = "Lclient!rd;")
	private final Class252 aClass252_1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;I)V")
	public Class62_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class187();
		new Class42(16);
		this.aClass99_30 = new Class99();
		this.aClass99_31 = new Class99();
		this.aClass99_32 = new Class99();
		this.aClass99_33 = new Class99();
		this.aClass99_34 = new Class99();
		this.aClass99_35 = new Class99();
		this.aClass99_36 = new Class99();
		this.anInt4633 = 8448;
		this.aFloat188 = 3584.0F;
		this.aFloatArray30 = new float[16];
		this.anInt4645 = 0;
		this.aFloatArray31 = new float[4];
		this.aClass5_Sub10Array4 = new Class5_Sub10[Static96.anInt2185];
		this.aFloat185 = 1.0F;
		this.aFloat190 = 1.0F;
		this.aFloat187 = 1.0F;
		this.anInt4642 = -1;
		this.anInt4652 = 512;
		this.aFloat195 = -1.0F;
		this.anInt4634 = -1;
		this.anInt4656 = 50;
		this.anInt4657 = 0;
		this.aFloat194 = -1.0F;
		this.anInt4641 = 0;
		this.anInt4647 = 0;
		this.anInt4653 = -1;
		this.anInt4646 = 0;
		this.anInt4655 = -1;
		this.aBoolean289 = true;
		this.anInt4648 = -1;
		this.anInt4639 = 0;
		this.anInt4640 = 0;
		this.aFloatArray34 = new float[4];
		this.anInt4632 = 3584;
		this.aFloat203 = 3000.0F;
		this.aFloat204 = 1.0F;
		this.aFloat205 = 1.0F;
		this.aFloatArray32 = new float[4];
		this.aFloat202 = 0.0F;
		this.aFloat193 = 3584.0F;
		this.anInt4664 = 0;
		this.aFloat200 = -1.0F;
		this.anInt4662 = 8448;
		this.aFloatArray33 = new float[4];
		this.anInt4666 = 0;
		this.anInt4661 = 0;
		this.aFloat206 = -1.0F;
		this.anInt4667 = 512;
		this.aClass5_Sub3_Sub2_3 = new Class5_Sub3_Sub2(8192);
		this.aByteArray56 = new byte[16384];
		this.anIntArray300 = new int[1];
		this.anIntArray301 = new int[1];
		this.anIntArray302 = new int[1];
		this.aCanvas9 = this.aCanvas10 = arg0;
		this.anInt4615 = arg2;
		if (!Static66.method1216("jaclib")) {
			throw new RuntimeException("");
		} else if (Static66.method1216("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong142 = this.aLong141 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt4615);
				if (this.aLong141 == 0L) {
					throw new RuntimeException("");
				}
				this.method3986();
				@Pc(320) int local320 = this.method4002();
				if (local320 != 0) {
					throw new RuntimeException("");
				}
				this.anInt4631 = this.aBoolean278 ? 33639 : 5121;
				@Pc(344) int local344;
				if (this.aString45.indexOf("radeon") != -1) {
					local344 = 0;
					@Pc(346) boolean local346 = false;
					@Pc(348) boolean local348 = false;
					@Pc(357) String[] local357 = Static514.method7107(' ', this.aString45.replace('/', ' '));
					for (@Pc(359) int local359 = 0; local359 < local357.length; local359++) {
						@Pc(365) String local365 = local357[local359];
						try {
							if (local365.length() > 0) {
								if (local365.charAt(0) == 'x' && local365.length() >= 3 && Static359.method5525(local365.substring(1, 3))) {
									local365 = local365.substring(1);
									local348 = true;
								}
								if (local365.equals("hd")) {
									local346 = true;
								} else {
									if (local365.startsWith("hd")) {
										local346 = true;
										local365 = local365.substring(2);
									}
									if (local365.length() >= 4 && Static359.method5525(local365.substring(0, 4))) {
										local344 = Static412.method5992(local365.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(430) Exception local430) {
						}
					}
					if (!local346 || local344 < 4000) {
						this.aBoolean286 = false;
					}
					if (!local348 && !local346) {
						if (local344 >= 7000 && local344 <= 9250) {
							this.aBoolean287 = false;
						}
						if (local344 >= 7000 && local344 <= 7999) {
							this.aBoolean275 = false;
						}
					}
					this.aBoolean271 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean288 = this.aBoolean275;
					this.aBoolean284 = true;
				}
				if (this.aString46.indexOf("intel") != -1) {
					this.aBoolean282 = false;
				}
				this.aBoolean272 = !this.aString46.equals("s3 graphics");
				if (this.aBoolean275) {
					try {
						@Pc(515) int[] local515 = new int[1];
						OpenGL.glGenBuffersARB(1, local515, 0);
					} catch (@Pc(521) Throwable local521) {
						throw new RuntimeException("");
					}
				}
				Static265.method4417(true, false);
				this.aBoolean270 = true;
				this.aClass20_1 = new Class20(this, super.anInterface8_145);
				this.method3954();
				this.aClass215_1 = new Class215(this);
				this.aClass232_1 = new Class232(this);
				if (this.aClass232_1.method5657()) {
					this.aClass5_Sub8_Sub1_1 = new Class5_Sub8_Sub1(this);
					if (!this.aClass5_Sub8_Sub1_1.method6719()) {
						this.aClass5_Sub8_Sub1_1.method6711();
						this.aClass5_Sub8_Sub1_1 = null;
					}
				}
				this.aClass252_1 = new Class252(this);
				this.method3995();
				this.method3935();
				OpenGL.glClear(16640);
				local344 = 0;
				while (true) {
					try {
						this.anOpenGL1.swapBuffers();
						break;
					} catch (@Pc(600) Exception local600) {
						if (local344++ > 5) {
							throw new RuntimeException("");
						}
						Static213.method3465(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(618) Throwable local618) {
				local618.printStackTrace();
				this.method7037();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
	public void method3932(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean279) {
			this.aBoolean279 = arg0;
			this.method3944();
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IZ)V")
	public void method3933(@OriginalArg(0) int arg0) {
		this.method3950(true, arg0);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IIIIII)Lclient!kk;")
	@Override
	public Class92 method7046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean276 ? new Class92_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6995() {
		this.method3969();
		this.method3979(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	private void method3934() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray30, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "()Z")
	@Override
	public boolean method7062() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "la", descriptor = "(FF)V")
	@Override
	public void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat203 == arg0 && arg1 == this.aFloat189) {
			return;
		}
		this.aFloat189 = arg1;
		this.aFloat203 = arg0;
		this.method3943();
		if (this.anInt4637 == 3) {
			this.method4004();
			return;
		}
		if (this.anInt4637 != 2) {
			return;
		}
		this.method3934();
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(I)V")
	private void method3935() {
		if (this.aCanvas9 == null) {
			this.anInt4462 = this.anInt4571 = 0;
		} else {
			@Pc(10) Dimension local10 = this.aCanvas9.getSize();
			this.anInt4462 = local10.width;
			this.anInt4571 = local10.height;
		}
		if (this.anInterface2_1 == null) {
			this.anInt4485 = this.anInt4571;
			this.anInt4471 = this.anInt4462;
			this.method3952();
		}
		this.method3955();
		this.n();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4666 = arg0;
		this.anInt4645 = arg1;
		this.anInt4667 = arg3;
		this.anInt4652 = arg2;
		this.method3946();
		this.method3988();
		if (this.anInt4637 == 3) {
			this.method4004();
		} else if (this.anInt4637 == 2) {
			this.method3934();
		}
	}

	@OriginalMember(owner = "client!jj", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		@Pc(6) int local6 = this.anInt4668;
		this.anInt4668 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!pi;B)V")
	public void method3936(@OriginalArg(0) Interface11 arg0) {
		if (this.anInterface11_5 != arg0) {
			if (this.aBoolean275) {
				OpenGL.glBindBufferARB(34962, arg0.method5916());
			}
			this.anInterface11_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	@Override
	public void method6996(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt4619 = arg0;
		this.aClass20_1.method666();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB)V")
	public synchronized void method3937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub27 local8 = new Class5_Sub27(arg1);
		local8.aLong253 = arg0;
		this.aClass99_31.method2513(local8);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!gw;III)V")
	public void method3938(@OriginalArg(1) Interface6 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method6019();
		@Pc(14) int local14 = arg1 * this.method3947(local7);
		this.method3949(arg0);
		OpenGL.glDrawElements(4, arg2, local7, (long) local14 + arg0.method6020());
	}

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "()Z")
	@Override
	public boolean method7053() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(Z)V")
	@Override
	public void method7058(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(I)V")
	private void method3939() {
		if (this.aBoolean292 && this.aBoolean290 | this.anInt4653 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IJ)V")
	public synchronized void method3940(@OriginalArg(1) long arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong253 = arg0;
		this.aClass99_36.method2513(local7);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7036(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class25 method7021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class25_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "()Z")
	@Override
	public boolean method7044() {
		return this.aClass252_1.method6029();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFBFF)V")
	public void method3941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static313.aFloatArray50[3] = arg2;
		Static313.aFloatArray50[2] = arg1;
		Static313.aFloatArray50[0] = arg3;
		Static313.aFloatArray50[1] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static313.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!jj", name = "CA", descriptor = "()I")
	@Override
	public int CA() {
		return this.anInt4632;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IZ)V")
	public void method3942(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean292 != arg0) {
			this.aBoolean292 = arg0;
			this.method3939();
			this.anInt4660 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!r;")
	@Override
	public Class36 method7012(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class36_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(I)V")
	private void method3943() {
		if (this.aFloat189 == 0.0F) {
			this.aFloatArray30[10] = this.aFloat192;
			this.aFloatArray30[14] = this.aFloat186;
		} else {
			@Pc(23) float local23 = this.aFloat203 / (this.aFloat189 + this.aFloat203);
			@Pc(27) float local27 = local23 * local23;
			@Pc(42) float local42 = (1.0F - local23) * -this.aFloat186 * (1.0F - local23) / this.aFloat189;
			this.aFloatArray30[14] = this.aFloat186 * local27;
			this.aFloatArray30[10] = this.aFloat192 + local42;
		}
		this.aFloat193 = ((float) -this.anInt4632 + this.aFloatArray30[14]) / this.aFloatArray30[10];
		this.aFloat188 = (float) this.anInt4632 - this.aFloat189;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V")
	private void method3944() {
		if (this.aBoolean295 && !this.aBoolean279) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cu;B)V")
	public void method3945(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt4626 < 0 || this.anInterface2Array1[this.anInt4626] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface2Array1[this.anInt4626--] = null;
		arg0.method2734();
		if (this.anInt4626 >= 0) {
			this.anInterface2_2 = this.anInterface2Array1[this.anInt4626];
			this.anInterface2_2.method2733();
		} else {
			this.anInterface2_2 = null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(I)V")
	private void method3946() {
		@Pc(6) float[] local6 = this.aFloatArray30;
		@Pc(26) float local26 = (float) (-this.anInt4666 * this.anInt4656) / (float) this.anInt4652;
		@Pc(41) float local41 = (float) ((this.anInt4471 - this.anInt4666) * this.anInt4656) / (float) this.anInt4652;
		@Pc(52) float local52 = (float) (this.anInt4656 * this.anInt4645) / (float) this.anInt4667;
		@Pc(67) float local67 = (float) (this.anInt4656 * (this.anInt4645 - this.anInt4485)) / (float) this.anInt4667;
		if (local41 == local26 || local52 == local67) {
			local6[0] = 1.0F;
			local6[8] = 0.0F;
			local6[5] = 1.0F;
			local6[15] = 1.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[4] = 0.0F;
			local6[10] = 1.0F;
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[9] = 0.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt4656 * 2.0F;
			local6[7] = 0.0F;
			local6[9] = (local67 + local52) / (-local67 + local52);
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[8] = (local26 + local41) / (local41 - local26);
			local6[1] = 0.0F;
			local6[6] = 0.0F;
			local6[5] = local81 / (local52 - local67);
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[0] = local81 / (local41 - local26);
			local6[10] = this.aFloat192 = (float) -(this.anInt4632 + this.anInt4656) / (float) (this.anInt4632 - this.anInt4656);
			local6[2] = 0.0F;
			local6[14] = this.aFloat186 = -((float) this.anInt4632 * local81) / (float) (this.anInt4632 - this.anInt4656);
			local6[15] = 0.0F;
			local6[11] = -1.0F;
		}
		this.method3943();
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt4656;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)I")
	public int method3947(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cu;Z)V")
	public void method3948(@OriginalArg(0) Interface2 arg0) {
		if (this.aBoolean297) {
			this.method3959(arg0);
			this.method4010(arg0);
		} else if (this.anInt4625 < 3) {
			if (this.anInt4625 >= 0) {
				this.anInterface2Array3[this.anInt4625].method2732();
			}
			this.anInterface2_2 = this.anInterface2_1 = this.anInterface2Array3[++this.anInt4625] = arg0;
			this.anInterface2_2.method2735();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "()V")
	@Override
	public void method7065() {
		if (!this.aBoolean272 || this.anInt4471 <= 0 || this.anInt4485 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt4657;
		@Pc(22) int local22 = this.anInt4661;
		@Pc(25) int local25 = this.anInt4647;
		@Pc(28) int local28 = this.anInt4640;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3955();
		this.method3942(false);
		this.method3970(false);
		this.method3961(false);
		this.method3989(false);
		this.method4007(null);
		this.method3933(-2);
		this.method3999(1);
		this.method3979(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt4471, this.anInt4485, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!gw;)V")
	public void method3949(@OriginalArg(1) Interface6 arg0) {
		if (this.anInterface6_3 != arg0) {
			if (this.aBoolean275) {
				OpenGL.glBindBufferARB(34963, arg0.method6018());
			}
			this.anInterface6_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZII)V")
	public void method3950(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method3974(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "P", descriptor = "()F")
	@Override
	public float P() {
		return this.aFloat203;
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "(I)V")
	private void method3951() {
		if (this.anInt4637 != 3) {
			this.anInt4637 = 3;
			this.method4004();
			this.method3998();
			this.anInt4660 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "()V")
	@Override
	public void method7035() {
		this.aClass232_1.method5655();
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
	private void method3952() {
		OpenGL.glViewport(this.anInt4641, this.anInt4639, this.anInt4471, this.anInt4485);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[BZIB)Lclient!gw;")
	public Interface6 method3953(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return (Interface6) (this.aBoolean275 && (!arg1 || this.aBoolean288) ? new Class158_Sub2(this, 5123, arg0, arg2, arg1) : new Class113_Sub2(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
	private void method3954() {
		this.aClass78_Sub3_4 = new Class78_Sub3();
		this.aClass78_Sub3_3 = new Class78_Sub3();
		this.aClass4Array1 = new Class4[this.anInt4651];
		this.aClass4_Sub2_1 = new Class4_Sub2(this, 3553, 6408, 1, 1);
		new Class4_Sub2(this, 3553, 6408, 1, 1);
		new Class4_Sub2(this, 3553, 6408, 1, 1);
		this.aClass36_Sub2_3 = new Class36_Sub2(this);
		this.aClass36_Sub2_2 = new Class36_Sub2(this);
		this.aClass36_Sub2_9 = new Class36_Sub2(this);
		this.aClass36_Sub2_10 = new Class36_Sub2(this);
		this.aClass36_Sub2_8 = new Class36_Sub2(this);
		this.aClass36_Sub2_7 = new Class36_Sub2(this);
		this.aClass36_Sub2_4 = new Class36_Sub2(this);
		this.aClass36_Sub2_6 = new Class36_Sub2(this);
		this.aClass36_Sub2_5 = new Class36_Sub2(this);
		this.aClass36_Sub2_1 = new Class36_Sub2(this);
		if (this.aBoolean282) {
			this.aClass103_1 = new Class103(this);
			new Class103(this);
		}
	}

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "(I)V")
	public void method3955() {
		if (this.anInt4637 != 0) {
			this.anInt4637 = 0;
			this.anInt4660 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!fba;Z)Lclient!ha;")
	@Override
	public Class25 method6998(@OriginalArg(0) Class96 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt2722 * arg0.anInt2718];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray41 == null) {
			for (local21 = 0; local21 < arg0.anInt2718; local21++) {
				for (local25 = 0; local25 < arg0.anInt2722; local25++) {
					@Pc(38) int local38 = arg0.anIntArray229[arg0.aByteArray42[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2718; local21++) {
				for (local25 = 0; local25 < arg0.anInt2722; local25++) {
					local12[local16++] = arg0.anIntArray229[arg0.aByteArray42[local14] & 0xFF] | arg0.aByteArray41[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(123) Class25 local123 = this.method7021(local12, arg0.anInt2722, arg0.anInt2722, arg0.anInt2718);
		local123.KA(arg0.anInt2719, arg0.anInt2720, arg0.anInt2723, arg0.anInt2721);
		return local123;
	}

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "()V")
	@Override
	public void method7039() {
		if (this.aClass5_Sub8_Sub1_1 != null && this.aClass5_Sub8_Sub1_1.method6718()) {
			this.aClass232_1.method5654(this.aClass5_Sub8_Sub1_1);
			this.aClass20_1.method666();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)V")
	public void method3956(@OriginalArg(1) int arg0) {
		Static313.aFloatArray50[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static313.aFloatArray50[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static313.aFloatArray50[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static313.aFloatArray50[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static313.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIB)V")
	public void method3957(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
	public void method3958() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!cu;)V")
	public void method3959(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt4626 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4626 >= 0) {
			this.anInterface2Array1[this.anInt4626].method2734();
		}
		this.anInterface2_2 = this.anInterface2Array1[++this.anInt4626] = arg0;
		this.anInterface2_2.method2733();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!r;Lclient!sh;Lclient!m;Lclient!paa;I)V")
	@Override
	public void method7066(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6 arg3) {
		arg0.method7360(arg2, arg3, 0);
		this.method7002(arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
	public synchronized void method3960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub27 local8 = new Class5_Sub27(arg1);
		local8.aLong253 = arg0;
		this.aClass99_34.method2513(local8);
	}

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "()Z")
	@Override
	public boolean method7063() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!kk;)V")
	@Override
	public void method7067(@OriginalArg(0) Class92 arg0) {
		this.aClass92_Sub1_1 = (Class92_Sub1) arg0;
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V")
	@Override
	public void method7060(@OriginalArg(0) int arg0) {
		this.method4008();
	}

	@OriginalMember(owner = "client!jj", name = "ta", descriptor = "(II)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4656 == arg0 && this.anInt4632 == arg1) {
			return;
		}
		this.anInt4656 = arg0;
		this.anInt4632 = arg1;
		this.method3946();
		this.method3992();
		if (this.anInt4637 == 3) {
			this.method4004();
		} else if (this.anInt4637 == 2) {
			this.method3934();
			return;
		}
	}

	@OriginalMember(owner = "client!jj", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass78_Sub3_4.aFloat288 * (float) arg0 + this.aClass78_Sub3_4.aFloat289 * (float) arg1 + this.aClass78_Sub3_4.aFloat287 * (float) arg2 + this.aClass78_Sub3_4.aFloat284;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg4 * this.aClass78_Sub3_4.aFloat289 + (float) arg3 * this.aClass78_Sub3_4.aFloat288 + (float) arg5 * this.aClass78_Sub3_4.aFloat287 + this.aClass78_Sub3_4.aFloat284;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt4656 && local59 < (float) this.anInt4656 || !(!((float) this.anInt4632 < local28) || !(local59 > (float) this.anInt4632))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt4652 * (this.aClass78_Sub3_4.aFloat285 + this.aClass78_Sub3_4.aFloat291 * (float) arg2 + this.aClass78_Sub3_4.aFloat286 * (float) arg0 + (float) arg1 * this.aClass78_Sub3_4.aFloat290) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt4652 * (this.aClass78_Sub3_4.aFloat291 * (float) arg5 + this.aClass78_Sub3_4.aFloat290 * (float) arg4 + (float) arg3 * this.aClass78_Sub3_4.aFloat286 + this.aClass78_Sub3_4.aFloat285) / local59);
		if (this.aFloat199 > (float) local123 && this.aFloat199 > (float) local155 || this.aFloat207 < (float) local123 && this.aFloat207 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass78_Sub3_4.aFloat280 + this.aClass78_Sub3_4.aFloat281 * (float) arg2 + (float) arg1 * this.aClass78_Sub3_4.aFloat283 + (float) arg0 * this.aClass78_Sub3_4.aFloat282) * (float) this.anInt4667 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt4667 * (this.aClass78_Sub3_4.aFloat280 + this.aClass78_Sub3_4.aFloat282 * (float) arg3 + this.aClass78_Sub3_4.aFloat283 * (float) arg4 + this.aClass78_Sub3_4.aFloat281 * (float) arg5) / local59);
			return (!(this.aFloat198 > (float) local213) || !(this.aFloat198 > (float) local245)) && (!((float) local213 > this.aFloat196) || !((float) local245 > this.aFloat196));
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass232_1.method5660(arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "()Lclient!dp;")
	@Override
	public Class68 method7016() {
		@Pc(7) int local7 = -1;
		if (this.aString46.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString46.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString46.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class68(local7, "OpenGL", this.anInt4644, this.aString45, 0L);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "()Z")
	@Override
	public boolean method7005() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
	@Override
	public int method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZ)V")
	public void method3961(@OriginalArg(1) boolean arg0) {
		if (this.bf == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.bf = arg0;
		this.anInt4660 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "(III)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt4634 && this.anInt4653 == arg1 && this.anInt4646 == arg2) {
			return;
		}
		this.anInt4646 = arg2;
		this.anInt4653 = arg1;
		this.anInt4634 = arg0;
		if (this.aBoolean290) {
			return;
		}
		this.method3992();
		this.method3939();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!sh;)V")
	@Override
	public void method7002(@OriginalArg(0) Class267 arg0) {
		this.aClass124_1.method3061(arg0, this);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!cu;)V")
	public void method3962(@OriginalArg(1) Interface2 arg0) {
		if (this.aBoolean297) {
			this.method3945(arg0);
			this.method4012(arg0);
		} else if (this.anInt4625 >= 0 && this.anInterface2Array3[this.anInt4625] == arg0) {
			this.anInterface2Array3[this.anInt4625--] = null;
			arg0.method2732();
			if (this.anInt4625 >= 0) {
				this.anInterface2_2 = this.anInterface2_1 = this.anInterface2Array3[this.anInt4625];
				this.anInterface2_2.method2735();
			} else {
				this.anInterface2_2 = this.anInterface2_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt4630 + this.anInt4629 + this.anInt4628;
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(B)V")
	private void method3963() {
		Static313.aFloatArray50[2] = this.aFloat206 * this.aFloat190;
		Static313.aFloatArray50[3] = 1.0F;
		Static313.aFloatArray50[1] = this.aFloat185 * this.aFloat206;
		Static313.aFloatArray50[0] = this.aFloat206 * this.aFloat204;
		OpenGL.glLightfv(16384, 4609, Static313.aFloatArray50, 0);
		Static313.aFloatArray50[2] = this.aFloat190 * -this.aFloat200;
		Static313.aFloatArray50[0] = -this.aFloat200 * this.aFloat204;
		Static313.aFloatArray50[1] = this.aFloat185 * -this.aFloat200;
		Static313.aFloatArray50[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static313.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "()V")
	@Override
	public void method7025() {
	}

	@OriginalMember(owner = "client!jj", name = "IA", descriptor = "(III[I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass78_Sub3_4.aFloat284 + (float) arg2 * this.aClass78_Sub3_4.aFloat287 + this.aClass78_Sub3_4.aFloat289 * (float) arg1 + this.aClass78_Sub3_4.aFloat288 * (float) arg0;
		if (local28 < (float) this.anInt4656 || local28 > (float) this.anInt4632) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt4652 * (this.aClass78_Sub3_4.aFloat290 * (float) arg1 + (float) arg0 * this.aClass78_Sub3_4.aFloat286 + this.aClass78_Sub3_4.aFloat291 * (float) arg2 + this.aClass78_Sub3_4.aFloat285) / local28);
		@Pc(117) int local117 = (int) (((float) arg2 * this.aClass78_Sub3_4.aFloat281 + (float) arg1 * this.aClass78_Sub3_4.aFloat283 + (float) arg0 * this.aClass78_Sub3_4.aFloat282 + this.aClass78_Sub3_4.aFloat280) * (float) this.anInt4667 / local28);
		if (this.aFloat199 <= (float) local85 && this.aFloat207 >= (float) local85 && this.aFloat198 <= (float) local117 && this.aFloat196 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat199);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat198);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "()Z")
	@Override
	public boolean method7033() {
		if (this.aClass5_Sub8_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub8_Sub1_1.method6718()) {
			if (!this.aClass232_1.method5653(this.aClass5_Sub8_Sub1_1)) {
				return false;
			}
			this.aClass20_1.method666();
		}
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "M", descriptor = "(F)V")
	@Override
	public void M(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat191) {
			this.aFloat191 = arg0;
			this.method3966();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([BIZII)Lclient!pi;")
	public Interface11 method3964(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface11) (this.aBoolean275 && (!arg1 || this.aBoolean288) ? new Class158_Sub1(this, arg2, arg0, arg3, arg1) : new Class113_Sub1(this, arg2, arg0, arg3));
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FB)V")
	public void method3965(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat187) {
			this.aFloat187 = arg0;
			if (this.anInt4637 == 3) {
				this.method4004();
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "JA", descriptor = "(IIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean290) {
			throw new RuntimeException("");
		}
		this.anInt4638 = arg0;
		this.anInt4664 = arg3;
		this.anInt4642 = arg1;
		this.anInt4648 = arg2;
		this.aClass252_1.aClass44_Sub1_1.method1137();
		this.method3992();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7019(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class30_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7360(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3969();
		this.method3979(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "(I)V")
	private void method3966() {
		Static313.aFloatArray50[3] = 1.0F;
		Static313.aFloatArray50[2] = this.aFloat190 * this.aFloat191;
		Static313.aFloatArray50[1] = this.aFloat185 * this.aFloat191;
		Static313.aFloatArray50[0] = this.aFloat204 * this.aFloat191;
		OpenGL.glLightModelfv(2899, Static313.aFloatArray50, 0);
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V")
	public void method3967() {
		if (this.anInt4660 == 8) {
			return;
		}
		this.method3968();
		this.method3942(true);
		this.method3961(true);
		this.method3989(true);
		this.method3979(1);
		this.anInt4660 = 8;
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "(B)V")
	private void method3968() {
		if (this.anInt4637 != 2) {
			this.anInt4637 = 2;
			this.method3934();
			this.method3998();
			this.anInt4660 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "(B)V")
	private void method3969() {
		if (this.anInt4660 == 1) {
			return;
		}
		this.method3980();
		this.method3942(false);
		this.method3970(false);
		this.method3961(false);
		this.method3989(false);
		this.method4007(null);
		this.method3933(-2);
		this.method3999(1);
		this.anInt4660 = 1;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7038(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas10) {
			local5 = this.aLong141;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable5.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas9 == arg0) {
			this.method3935();
		}
	}

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "()V")
	@Override
	protected void method7037() {
		for (@Pc(6) Class5 local6 = this.aClass99_29.method2526(); local6 != null; local6 = this.aClass99_29.method2519()) {
			((Class5_Sub29_Sub2) local6).method7249();
		}
		if (this.aClass232_1 != null) {
			this.aClass232_1.method5652();
		}
		if (this.anOpenGL1 != null) {
			this.method4008();
			@Pc(40) Enumeration local40 = this.aHashtable5.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable5.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean270) {
			Static135.method2550(false, true);
			this.aBoolean270 = false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7041(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static172.aFloat367 = arg2;
		Static170.aFloat162 = arg0;
		Static116.aFloat134 = arg1;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(IZ)V")
	public void method3970(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean295 != arg0) {
			this.aBoolean295 = arg0;
			this.method3944();
			this.anInt4660 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "()V")
	@Override
	public void method7030() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)I")
	public int method3971(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class25 method7003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class25_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jj", name = "F", descriptor = "(IIII)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt4657) {
			this.anInt4657 = arg0;
		}
		if (arg2 < this.anInt4661) {
			this.anInt4661 = arg2;
		}
		if (this.anInt4647 < arg1) {
			this.anInt4647 = arg1;
		}
		if (arg3 < this.anInt4640) {
			this.anInt4640 = arg3;
		}
		OpenGL.glEnable(3089);
		this.method3988();
		this.method3981();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class131 method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class131_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class87 method7006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static216.method7279(this, arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "(I)V")
	private void method3972() {
		OpenGL.glDepthMask(this.aBoolean281 && this.aBoolean289);
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "()V")
	@Override
	public void method7004() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(Z)V")
	private void method3973() {
		if (this.aBoolean283) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean283 = false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aBoolean290 = false;
		this.aClass252_1.method6031(false, 0, false, 0, 0);
		this.method3992();
		this.method3939();
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7048(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class5_Sub27 local19;
		while (!this.aClass99_31.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_31.method2516();
			Static482.anIntArray653[local11++] = (int) local19.aLong253;
			this.anInt4628 -= local19.anInt4812;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static482.anIntArray653, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static482.anIntArray653, 0);
			local11 = 0;
		}
		while (!this.aClass99_32.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_32.method2516();
			Static482.anIntArray653[local11++] = (int) local19.aLong253;
			this.anInt4629 -= local19.anInt4812;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static482.anIntArray653, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static482.anIntArray653, 0);
			local11 = 0;
		}
		while (!this.aClass99_33.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_33.method2516();
			Static482.anIntArray653[local11++] = local19.anInt4812;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static482.anIntArray653, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static482.anIntArray653, 0);
			local11 = 0;
		}
		while (!this.aClass99_34.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_34.method2516();
			Static482.anIntArray653[local11++] = (int) local19.aLong253;
			this.anInt4630 -= local19.anInt4812;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static482.anIntArray653, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static482.anIntArray653, 0);
		}
		while (!this.aClass99_30.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_30.method2516();
			OpenGL.glDeleteLists((int) local19.aLong253, local19.anInt4812);
		}
		@Pc(213) Class5 local213;
		while (!this.aClass99_35.method2523()) {
			local213 = this.aClass99_35.method2516();
			OpenGL.glDeleteProgramARB((int) local213.aLong253);
		}
		while (!this.aClass99_36.method2523()) {
			local213 = this.aClass99_36.method2516();
			OpenGL.glDeleteObjectARB(local213.aLong253);
		}
		while (!this.aClass99_30.method2523()) {
			local19 = (Class5_Sub27) this.aClass99_30.method2516();
			OpenGL.glDeleteLists((int) local19.aLong253, local19.anInt4812);
		}
		this.aClass20_1.method667();
		if (this.U() > 100663296 && Static105.method2132() > this.aLong143 + 60000L) {
			System.gc();
			this.aLong143 = Static105.method2132();
		}
		this.anInt4623 = local9;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[Lclient!uca;)V")
	@Override
	public void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub10[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass5_Sub10Array4[local7] = arg1[local7];
		}
		this.anInt4663 = arg0;
		if (this.anInt4637 != 1) {
			this.method3990();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method7068(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub3_4 = (Class78_Sub3) arg0;
		this.aClass78_Sub3_3.method5515(this.aClass78_Sub3_4);
		if (this.anInt4637 != 1) {
			this.method3998();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZZI)V")
	public void method3974(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt4659 != arg2) {
			if (arg2 < 0) {
				this.method3973();
				this.method4007(null);
				this.method3999(0);
				if (!this.aBoolean290) {
					this.aClass252_1.method6031(arg0, 0, arg1, 0, 0);
				}
			} else {
				@Pc(20) Class4_Sub2 local20 = this.aClass20_1.method668(arg2);
				@Pc(26) Class271 local26 = super.anInterface8_145.method7237(arg2);
				if (local26.aByte82 == 0 && local26.aByte81 == 0) {
					this.method3973();
				} else {
					@Pc(50) int local50 = local26.aBoolean558 ? 64 : 128;
					@Pc(54) int local54 = local50 * 50;
					this.method3997((float) (this.anInt4623 % local54 * local26.aByte82) / (float) local54, (float) (this.anInt4623 % local54 * local26.aByte81) / (float) local54, 0.0F);
				}
				if (this.aBoolean290) {
					this.method4007(local20);
					this.method3999(local26.anInt7867);
				} else {
					this.aClass252_1.method6031(arg0, local26.anInt7866, arg1, local26.aByte79, local26.aByte78);
					if (!this.aClass252_1.method6028(local26.anInt7867, local20)) {
						this.method4007(local20);
						this.method3999(local26.anInt7867);
					}
				}
			}
			this.anInt4659 = arg2;
		}
		this.anInt4660 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!jj", name = "UA", descriptor = "(IIIII)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3969();
		this.method3979(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BFF)V")
	public void method3975(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat205 = arg0;
		this.aFloat202 = arg1;
		if (!this.aBoolean290) {
			this.method3992();
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V")
	public synchronized void method3976(@OriginalArg(1) int arg0) {
		@Pc(7) Class5 local7 = new Class5();
		local7.aLong253 = arg0;
		this.aClass99_35.method2513(local7);
	}

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class87_Sub1 local6 = (Class87_Sub1) arg1;
		@Pc(9) Class4_Sub2_Sub1 local9 = local6.aClass4_Sub2_Sub1_1;
		this.method3978();
		this.method4007(local6.aClass4_Sub2_Sub1_1);
		this.method3979(1);
		this.method4011(8448, 7681);
		this.method3984(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat278 / (float) local9.anInt6596;
		@Pc(46) float local46 = local9.aFloat277 / (float) local9.anInt6595;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4657 - arg2), local46 * (float) (this.anInt4647 - arg3));
		OpenGL.glVertex2i(this.anInt4657, this.anInt4647);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4657 - arg2), (float) (this.anInt4640 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt4657, this.anInt4640);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt4661 - arg2), local46 * (float) (this.anInt4640 - arg3));
		OpenGL.glVertex2i(this.anInt4661, this.anInt4640);
		OpenGL.glTexCoord2f((float) (this.anInt4661 - arg2) * local39, local46 * (float) (this.anInt4647 - arg3));
		OpenGL.glVertex2i(this.anInt4661, this.anInt4647);
		OpenGL.glEnd();
		this.method3984(5890, 0, 768);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	@Override
	public void method7001(@OriginalArg(0) int arg0) {
		this.method3986();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method6991(@OriginalArg(0) Class5_Sub29 arg0) {
		this.aNativeHeap3 = ((Class5_Sub29_Sub2) arg0).aNativeHeap6;
		if (this.anInterface11_4 != null) {
			return;
		}
		@Pc(16) Class5_Sub3_Sub2 local16 = new Class5_Sub3_Sub2(80);
		if (this.aBoolean278) {
			local16.method4236(-1.0F);
			local16.method4236(-1.0F);
			local16.method4236(0.0F);
			local16.method4236(0.0F);
			local16.method4236(1.0F);
			local16.method4236(1.0F);
			local16.method4236(-1.0F);
			local16.method4236(0.0F);
			local16.method4236(1.0F);
			local16.method4236(1.0F);
			local16.method4236(1.0F);
			local16.method4236(1.0F);
			local16.method4236(0.0F);
			local16.method4236(1.0F);
			local16.method4236(0.0F);
			local16.method4236(-1.0F);
			local16.method4236(1.0F);
			local16.method4236(0.0F);
			local16.method4236(0.0F);
			local16.method4236(0.0F);
		} else {
			local16.method4235(-1.0F);
			local16.method4235(-1.0F);
			local16.method4235(0.0F);
			local16.method4235(0.0F);
			local16.method4235(1.0F);
			local16.method4235(1.0F);
			local16.method4235(-1.0F);
			local16.method4235(0.0F);
			local16.method4235(1.0F);
			local16.method4235(1.0F);
			local16.method4235(1.0F);
			local16.method4235(1.0F);
			local16.method4235(0.0F);
			local16.method4235(1.0F);
			local16.method4235(0.0F);
			local16.method4235(-1.0F);
			local16.method4235(1.0F);
			local16.method4235(0.0F);
			local16.method4235(0.0F);
			local16.method4235(0.0F);
		}
		this.anInterface11_4 = this.method3964(local16.aByteArray66, false, 20, local16.anInt4960);
		this.aClass19_8 = new Class19(this.anInterface11_4, 5126, 3, 0);
		this.aClass19_7 = new Class19(this.anInterface11_4, 5126, 2, 12);
		this.aClass124_1.method3059(this);
	}

	@OriginalMember(owner = "client!jj", name = "x", descriptor = "()Z")
	@Override
	public boolean method7047() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "()Z")
	@Override
	public boolean method7050() {
		return this.aClass5_Sub8_Sub1_1 != null && (this.anInt4615 <= 1 || this.aBoolean296);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IZZI)Lclient!pi;")
	public Interface11 method3977(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return (Interface11) (this.aBoolean275 ? new Class158_Sub1(this, arg1, arg0, arg2, false) : new Class113_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(Z)V")
	public void method3978() {
		if (this.anInt4660 == 2) {
			return;
		}
		this.method3980();
		this.method3942(false);
		this.method3970(false);
		this.method3961(false);
		this.method3989(false);
		this.method3933(-2);
		this.anInt4660 = 2;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
	public void method3979(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt4636) {
			return;
		}
		@Pc(17) boolean local17;
		@Pc(21) byte local21;
		if (arg0 == 1) {
			local21 = 1;
			local17 = true;
		} else if (arg0 == 2) {
			local17 = false;
			local21 = 2;
		} else if (arg0 == 128) {
			local21 = 3;
			local17 = true;
		} else {
			local17 = false;
			local21 = 0;
		}
		if (!this.aBoolean280) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean280 = true;
		}
		if (this.aBoolean291 != local17) {
			if (local17) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean291 = local17;
		}
		if (local21 != this.anInt4650) {
			if (local21 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local21 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local21 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt4650 = local21;
		}
		this.anInt4636 = arg0;
		this.anInt4660 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "(B)V")
	private void method3980() {
		if (this.anInt4637 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt4471 > 0 && this.anInt4485 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt4471, (double) this.anInt4485, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt4637 = 1;
		this.anInt4660 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt4655;
		if (local11 || arg1 != this.aFloat206 || arg2 != this.aFloat200) {
			this.aFloat200 = arg2;
			this.anInt4655 = arg0;
			this.aFloat206 = arg1;
			if (local11) {
				this.aFloat190 = (float) (this.anInt4655 & 0xFF) / 255.0F;
				this.aFloat204 = (float) (this.anInt4655 & 0xFF0000) / 1.671168E7F;
				this.aFloat185 = (float) (this.anInt4655 & 0xFF00) / 65280.0F;
				this.method3966();
			}
			this.method3963();
		}
		if (arg3 == this.aFloatArray33[0] && this.aFloatArray33[1] == arg4 && arg5 == this.aFloatArray33[2]) {
			return;
		}
		this.aFloatArray33[2] = arg5;
		this.aFloatArray33[0] = arg3;
		this.aFloatArray33[1] = arg4;
		this.aFloatArray31[2] = -arg5;
		this.aFloatArray31[1] = -arg4;
		this.aFloatArray31[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray34[0] = local138 * arg3;
		this.aFloatArray34[1] = local138 * arg4;
		this.aFloatArray34[2] = arg5 * local138;
		this.aFloatArray32[0] = -this.aFloatArray34[0];
		this.aFloatArray32[2] = -this.aFloatArray34[2];
		this.aFloatArray32[1] = -this.aFloatArray34[1];
		this.method4001();
		this.anInt4665 = (int) (arg3 * 256.0F / arg4);
		this.anInt4643 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIF)Lclient!uca;")
	@Override
	public Class5_Sub10 method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub10_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()V")
	@Override
	public void method6999() {
		this.method3989(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "(B)V")
	private void method3981() {
		if (this.anInt4661 >= this.anInt4657 && this.anInt4647 <= this.anInt4640) {
			OpenGL.glScissor(this.anInt4657 + this.anInt4641, this.anInt4639 - (-this.anInt4485 + this.anInt4640), this.anInt4661 - this.anInt4657, this.anInt4640 + -this.anInt4647);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "(I)V")
	public void method3982() {
		if (this.anInt4660 == 16) {
			return;
		}
		this.method3951();
		this.method3942(true);
		this.method3961(true);
		this.method3989(true);
		this.method3979(1);
		this.anInt4660 = 16;
	}

	@OriginalMember(owner = "client!jj", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		@Pc(6) int local6 = this.anInt4669;
		this.anInt4669 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7055(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7030();
	}

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt4485 - arg1 - local12, arg2, 1, 32993, this.anInt4631, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "()Z")
	@Override
	public boolean method7031() {
		return this.aClass5_Sub8_Sub1_1 != null && this.aClass5_Sub8_Sub1_1.method6718();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7014(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable5.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lclient!r;Lclient!sh;Lclient!m;[Lclient!paa;I)V")
	@Override
	public void method7008(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6[] arg3, @OriginalArg(4) int arg4) {
		this.method7019(arg0, arg2, arg3, arg4);
		this.method7002(arg1);
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(II)V")
	public synchronized void method3983(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub27 local8 = new Class5_Sub27(arg0);
		this.aClass99_33.method2513(local8);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IIII)V")
	public void method3984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
	public void method3985(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4639 = arg1;
		this.anInt4641 = arg0;
		this.method3952();
		this.method3981();
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(Z)V")
	private void method3986() {
		@Pc(16) int local16 = 0;
		while (!this.anOpenGL1.a()) {
			if (local16++ > 5) {
				throw new RuntimeException("");
			}
			Static213.method3465(1000L);
		}
	}

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "(I)V")
	public void method3987() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "(B)V")
	private void method3988() {
		this.aFloat199 = this.anInt4657 - this.anInt4666;
		this.aFloat207 = this.anInt4661 - this.anInt4666;
		this.aFloat196 = this.anInt4640 - this.anInt4645;
		this.aFloat198 = this.anInt4647 - this.anInt4645;
	}

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "()I")
	@Override
	public int method7034() {
		return 4;
	}

	@OriginalMember(owner = "client!jj", name = "ra", descriptor = "()F")
	@Override
	public float ra() {
		return this.aFloat189;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)Lclient!u;")
	@Override
	public Class5_Sub29 method7010(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub29_Sub2 local8 = new Class5_Sub29_Sub2(arg0);
		this.aClass99_29.method2513(local8);
		return local8;
	}

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "(IIII)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt4471) {
			arg2 = this.anInt4471;
		}
		if (this.anInt4485 < arg3) {
			arg3 = this.anInt4485;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt4657 = arg0;
		this.anInt4640 = arg3;
		this.anInt4661 = arg2;
		this.anInt4647 = arg1;
		OpenGL.glEnable(3089);
		this.method3988();
		this.method3981();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V")
	public void method3989(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean281 != arg0) {
			this.aBoolean281 = arg0;
			this.method3972();
			this.anInt4660 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.method3979(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!jj", name = "u", descriptor = "(I)V")
	private void method3990() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt4663; local13++) {
			@Pc(20) Class5_Sub10 local20 = this.aClass5_Sub10Array4[local13];
			@Pc(24) int local24 = local13 + 16386;
			Static313.aFloatArray51[0] = local20.method5189();
			Static313.aFloatArray51[1] = local20.method5190();
			Static313.aFloatArray51[2] = local20.method5183();
			Static313.aFloatArray51[3] = 1.0F;
			OpenGL.glLightfv(local24, 4611, Static313.aFloatArray51, 0);
			@Pc(58) int local58 = local20.method5185();
			@Pc(64) float local64 = local20.method5184() / 255.0F;
			Static313.aFloatArray51[1] = (float) (local58 >> 8 & 0xFF) * local64;
			Static313.aFloatArray51[0] = local64 * (float) (local58 >> 16 & 0xFF);
			Static313.aFloatArray51[2] = local64 * (float) (local58 & 0xFF);
			OpenGL.glLightfv(local24, 4609, Static313.aFloatArray51, 0);
			OpenGL.glLightf(local24, 4617, 1.0F / (float) (local20.method5191() * local20.method5191()));
			OpenGL.glEnable(local24);
		}
		while (this.anInt4649 > local13) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt4649 = this.anInt4663;
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "()Z")
	@Override
	public boolean method7007() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IBI)V")
	public synchronized void method3991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub27 local12 = new Class5_Sub27(arg0);
		local12.aLong253 = arg1;
		this.aClass99_32.method2513(local12);
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "(B)V")
	private void method3992() {
		@Pc(15) int local15;
		if (this.aBoolean290) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt4642;
		} else {
			this.aFloat201 = (float) (this.anInt4632 - this.anInt4646) - this.aFloat202;
			this.aFloat197 = this.aFloat201 - (float) this.anInt4653 * this.aFloat205;
			if ((float) this.anInt4656 > this.aFloat197) {
				this.aFloat197 = this.anInt4656;
			}
			OpenGL.glFogf(2915, this.aFloat197);
			OpenGL.glFogf(2916, this.aFloat201);
			local15 = this.anInt4634;
		}
		Static313.aFloatArray50[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static313.aFloatArray50[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static313.aFloatArray50[2] = (float) (local15 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static313.aFloatArray50, 0);
		if (this.aBoolean290) {
			this.aClass252_1.aClass44_Sub1_1.method1135();
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	@Override
	public void method6997(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7022(@OriginalArg(0) boolean arg0) {
		this.aBoolean289 = arg0;
		this.method3972();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!ol;)V")
	public void method3993(@OriginalArg(1) Class78_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5517(), 0);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7015(@OriginalArg(0) Canvas arg0) {
		this.aLong142 = 0L;
		this.aCanvas9 = null;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.aLong142 = this.aLong141;
			this.aCanvas9 = this.aCanvas10;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable5.get(arg0);
			this.aLong142 = local26;
			this.aCanvas9 = arg0;
		}
		if (this.aCanvas9 == null || this.aLong142 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong142);
		this.method3935();
	}

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "()Lclient!m;")
	@Override
	public Class78 method7011() {
		return new Class78_Sub3();
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7026(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (!this.aHashtable5.containsKey(arg0)) {
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
			this.aHashtable5.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "(B)V")
	public void method3994() {
		if (this.anInt4660 == 4) {
			return;
		}
		this.method3980();
		this.method3942(false);
		this.method3970(false);
		this.method3961(false);
		this.method3989(false);
		this.method3933(-2);
		this.method3979(1);
		this.anInt4660 = 4;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!rl;[Lclient!fba;Z)Lclient!ra;")
	@Override
	public Class13 method7054(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class96[] arg1) {
		return new Class13_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "(B)V")
	private void method3995() {
		this.method3933(-2);
		for (@Pc(14) int local14 = this.anInt4651 - 1; local14 >= 0; local14--) {
			this.method4009(local14);
			this.method4007(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method4011(8448, 8448);
		this.method3984(34168, 2, 770);
		this.method3973();
		this.anInt4636 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt4650 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean291 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean280 = true;
		this.method3942(true);
		this.method3970(true);
		this.method3961(true);
		this.method3989(true);
		this.method3955();
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
		@Pc(129) float[] local129 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(131) int local131 = 0; local131 < 8; local131++) {
			@Pc(139) int local139 = local131 + 16384;
			OpenGL.glLightfv(local139, 4608, local129, 0);
			OpenGL.glLightf(local139, 4615, 0.0F);
			OpenGL.glLightf(local139, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt4655 = this.anInt4634 = -1;
		this.n();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3969();
		this.method3979(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		@Pc(35) float local35 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local16 * local16)));
		@Pc(39) float local39 = local22 * local35;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(58) float local58 = local16 * local35;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local58 + (float) arg2 + 0.35F, (float) arg3 + 0.35F + local39);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "()Z")
	@Override
	public boolean method7028() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "(B)Lclient!oj;")
	public Class4_Sub4 method3996() {
		return this.aClass92_Sub1_1 == null ? null : this.aClass92_Sub1_1.method6804();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(FFFI)V")
	private void method3997(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean283) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean283 = true;
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "(B)V")
	private void method3998() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass78_Sub3_4.method5517(), 0);
		if (this.aBoolean290) {
			this.aClass252_1.aClass44_Sub1_1.method1137();
		}
		this.method4001();
		this.method3990();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V")
	@Override
	public void method7027(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class87_Sub1 local6 = (Class87_Sub1) arg5;
		@Pc(9) Class4_Sub2_Sub1 local9 = local6.aClass4_Sub2_Sub1_1;
		this.method3978();
		this.method4007(local6.aClass4_Sub2_Sub1_1);
		this.method3979(1);
		this.method4011(8448, 7681);
		this.method3984(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat278 / (float) local9.anInt6596;
		@Pc(46) float local46 = local9.aFloat277 / (float) local9.anInt6595;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local53 * local53)));
		@Pc(76) float local76 = local53 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local76 + 0.35F, local95 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method3984(5890, 0, 768);
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(II)V")
	public void method3999(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method4011(7681, 7681);
		} else if (arg0 == 0) {
			this.method4011(8448, 8448);
		} else if (arg0 == 2) {
			this.method4011(7681, 34165);
		} else if (arg0 == 3) {
			this.method4011(8448, 260);
		} else if (arg0 == 4) {
			this.method4011(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "()Z")
	@Override
	public boolean method7049() {
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!as;ZLclient!as;Lclient!as;Lclient!as;)V")
	public void method4000(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) Class19 arg2, @OriginalArg(4) Class19 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3936(arg3.anInterface11_1);
			OpenGL.glVertexPointer(arg3.aByte2, arg3.aShort1, this.anInterface11_5.method5917(), this.anInterface11_5.method5915() + (long) arg3.aByte1);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3936(arg1.anInterface11_1);
			OpenGL.glNormalPointer(arg1.aShort1, this.anInterface11_5.method5917(), this.anInterface11_5.method5915() + (long) arg1.aByte1);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3936(arg2.anInterface11_1);
			OpenGL.glColorPointer(arg2.aByte2, arg2.aShort1, this.anInterface11_5.method5917(), this.anInterface11_5.method5915() + (long) arg2.aByte1);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3936(arg0.anInterface11_1);
			OpenGL.glTexCoordPointer(arg0.aByte2, arg0.aShort1, this.anInterface11_5.method5917(), this.anInterface11_5.method5915() + (long) arg0.aByte1);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()Lclient!m;")
	@Override
	public Class78 method6994() {
		return this.aClass78_Sub3_1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method3969();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method3979(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean277) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean277) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!kk;Lclient!kk;FLclient!kk;)Lclient!kk;")
	@Override
	public Class92 method7052(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class92 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean276 && this.aBoolean282) {
			@Pc(15) Class92_Sub1_Sub2 local15 = null;
			@Pc(18) Class92_Sub1 local18 = (Class92_Sub1) arg0;
			@Pc(21) Class92_Sub1 local21 = (Class92_Sub1) arg1;
			@Pc(25) Class4_Sub4 local25 = local18.method6804();
			@Pc(29) Class4_Sub4 local29 = local21.method6804();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt6710 >= local25.anInt6710 ? local29.anInt6710 : local25.anInt6710;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class92_Sub1_Sub2) {
					@Pc(56) Class92_Sub1_Sub2 local56 = (Class92_Sub1_Sub2) arg3;
					if (local44 == local56.method6808()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class92_Sub1_Sub2(this, local44);
				}
				if (local15.method6809(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "(I)V")
	public void method4001() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray34, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray32, 0);
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "([I)V")
	@Override
	public void d(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt4647;
		arg0[2] = this.anInt4661;
		arg0[0] = this.anInt4657;
		arg0[3] = this.anInt4640;
	}

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "(I)I")
	private int method4002() {
		@Pc(5) int local5 = 0;
		this.aString46 = OpenGL.glGetString(7936).toLowerCase();
		this.aString45 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString46.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString46.indexOf("brian paul") != -1 || this.aString46.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static514.method7107(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(62) int local62 = Static412.method5992(local52[0]);
				@Pc(68) int local68 = Static412.method5992(local52[1]);
				this.anInt4644 = local62 * 10 + local68;
			} catch (@Pc(78) NumberFormatException local78) {
				local5 |= 0x4;
			}
		} else {
			local5 |= 0x4;
		}
		if (this.anInt4644 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(119) int[] local119 = new int[1];
		OpenGL.glGetIntegerv(34018, local119, 0);
		this.anInt4651 = local119[0];
		OpenGL.glGetIntegerv(34929, local119, 0);
		this.anInt4658 = local119[0];
		OpenGL.glGetIntegerv(34930, local119, 0);
		this.anInt4654 = local119[0];
		if (this.anInt4651 < 2 || this.anInt4658 < 2 || this.anInt4654 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean278 = Stream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean275 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean277 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean294 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean293 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean274 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean287 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean271 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean276 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean286 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean273 = false;
		this.aBoolean282 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean297 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean285 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean296 = this.aBoolean285 & this.aBoolean297;
		OpenGL.glGetFloatv(2834, Static313.aFloatArray50, 0);
		this.aFloat195 = Static313.aFloatArray50[0];
		this.aFloat194 = Static313.aFloatArray50[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "(I)V")
	@Override
	public void L(@OriginalArg(0) int arg0) {
		this.anInt4622 = 0;
		while (arg0 > 1) {
			this.anInt4622++;
			arg0 >>= 0x1;
		}
		this.anInt4624 = 0x1 << this.anInt4622;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(IIII)V")
	public void method4003(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "(B)V")
	private void method4004() {
		@Pc(15) float local15 = this.aFloat187 * (float) -this.anInt4666 / (float) this.anInt4652;
		@Pc(27) float local27 = this.aFloat187 * (float) -this.anInt4645 / (float) this.anInt4667;
		@Pc(42) float local42 = this.aFloat187 * (float) (this.anInt4471 - this.anInt4666) / (float) this.anInt4652;
		@Pc(56) float local56 = this.aFloat187 * (float) (this.anInt4485 - this.anInt4645) / (float) this.anInt4667;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) ((float) this.anInt4656 - this.aFloat189), (double) ((float) this.anInt4632 - this.aFloat189));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "()Z")
	@Override
	public boolean method7023() {
		return this.aBoolean277 && (!this.method7031() || this.aBoolean296);
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(IZ)I")
	public int method4005(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(ILclient!ol;)V")
	public void method4006(@OriginalArg(1) Class78_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5517(), 0);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!aba;)V")
	public void method4007(@OriginalArg(1) Class4 arg0) {
		@Pc(11) Class4 local11 = this.aClass4Array1[this.anInt4635];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt6708);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt6708);
				} else if (arg0.anInt6708 != local11.anInt6708) {
					OpenGL.glDisable(local11.anInt6708);
					OpenGL.glEnable(arg0.anInt6708);
				}
				OpenGL.glBindTexture(arg0.anInt6708, arg0.method5493());
			}
			this.aClass4Array1[this.anInt4635] = arg0;
		}
		this.anInt4660 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)I")
	@Override
	public int method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "()Z")
	@Override
	public boolean method7000() {
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "(B)V")
	private void method4008() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "(IIIII)V")
	@Override
	protected void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt4657 > arg0 + arg2 || this.anInt4661 < arg0 - arg2 || arg2 + arg1 < this.anInt4647 || this.anInt4640 < arg1 - arg2) {
			return;
		}
		this.method3969();
		this.method3979(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(74) float local74 = (float) arg0 + 0.35F;
		@Pc(79) float local79 = (float) arg1 + 0.35F;
		@Pc(83) int local83 = arg2 << 1;
		if ((float) local83 < this.aFloat195) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local74 + 1.0F, local79 + 1.0F);
			OpenGL.glVertex2f(local74 + 1.0F, local79 - 1.0F);
			OpenGL.glVertex2f(local74 - 1.0F, -1.0F + local79);
			OpenGL.glVertex2f(local74 - 1.0F, local79 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat194 >= (float) local83) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local83);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local74, local79);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local74, local79);
			@Pc(138) int local138 = 262144 / (arg2 * 6);
			if (local138 <= 64) {
				local138 = 64;
			} else if (local138 > 512) {
				local138 = 512;
			}
			local138 = Static7.method265(local138);
			OpenGL.glVertex2f(local74 + (float) arg2, local79);
			for (@Pc(167) int local167 = 16384 - local138; local167 > 0; local167 -= local138) {
				OpenGL.glVertex2f(Class5_Sub1_Sub34.aFloatArray66[local167] * (float) arg2 + local74, Class5_Sub1_Sub34.aFloatArray65[local167] * (float) arg2 + local79);
			}
			OpenGL.glVertex2f(local74 + (float) arg2, local79);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method3969();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method3979(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean277) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean277) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(ZI)V")
	public void method4009(@OriginalArg(1) int arg0) {
		if (this.anInt4635 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt4635 = arg0;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method4010(@OriginalArg(0) Interface2 arg0) {
		if (this.anInt4627 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt4627 >= 0) {
			this.anInterface2Array2[this.anInt4627].method2736();
		}
		this.anInterface2_1 = this.anInterface2Array2[++this.anInt4627] = arg0;
		this.anInterface2_1.method2731();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
	public void method4011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4635 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (this.anInt4633 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt4633 = arg1;
			local17 = true;
		}
		if (arg0 != this.anInt4662) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local17 = true;
			this.anInt4662 = arg0;
		}
		if (local17) {
			this.anInt4660 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt4640 = this.anInt4485;
		this.anInt4657 = 0;
		this.anInt4647 = 0;
		this.anInt4661 = this.anInt4471;
		OpenGL.glDisable(3089);
		this.method3988();
	}

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4664 = arg3;
		this.aBoolean290 = true;
		this.anInt4642 = arg1;
		this.anInt4638 = arg0;
		this.anInt4648 = arg2;
		this.aClass252_1.method6031(false, 0, false, 0, 3);
		this.aClass252_1.aClass44_Sub1_1.method1137();
		this.method3992();
		this.method3939();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLclient!cu;)V")
	public void method4012(@OriginalArg(1) Interface2 arg0) {
		if (this.anInt4627 < 0 || arg0 != this.anInterface2Array2[this.anInt4627]) {
			throw new RuntimeException();
		}
		this.anInterface2Array2[this.anInt4627--] = null;
		arg0.method2736();
		if (this.anInt4627 >= 0) {
			this.anInterface2_1 = this.anInterface2Array2[this.anInt4627];
			this.anInterface2_1.method2731();
		} else {
			this.anInterface2_1 = null;
		}
	}

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "()Z")
	@Override
	public boolean method7020() {
		return false;
	}

	@OriginalMember(owner = "client!jj", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(53) float local53;
		@Pc(41) float local41;
		if (this.aClass4_Sub2_Sub1_2 == null || this.aClass4_Sub2_Sub1_2.anInt6587 < arg2 || this.aClass4_Sub2_Sub1_2.anInt6588 < arg3) {
			this.aClass4_Sub2_Sub1_2 = Static302.method4982(this, arg3, arg6, arg2);
			this.aClass4_Sub2_Sub1_2.method5467(false, false);
			local53 = this.aClass4_Sub2_Sub1_2.aFloat277;
			local41 = this.aClass4_Sub2_Sub1_2.aFloat278;
		} else {
			this.aClass4_Sub2_Sub1_2.method5465(arg6, arg2, false, arg3, 6406);
			local41 = this.aClass4_Sub2_Sub1_2.aFloat278 * (float) arg2 / (float) this.aClass4_Sub2_Sub1_2.anInt6587;
			local53 = this.aClass4_Sub2_Sub1_2.aFloat277 * (float) arg3 / (float) this.aClass4_Sub2_Sub1_2.anInt6588;
		}
		this.method3978();
		this.method4007(this.aClass4_Sub2_Sub1_2);
		this.method3979(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3956(arg5);
		this.method4011(34165, 34165);
		this.method3984(34166, 0, 768);
		this.method3984(5890, 2, 770);
		this.method4003(0, 34166);
		this.method4003(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = (float) arg2 + local143;
		@Pc(156) float local156 = (float) arg3 + local146;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local41);
		OpenGL.glVertex2f(local143, local156);
		OpenGL.glTexCoord2f(local53, local41);
		OpenGL.glVertex2f(local151, local156);
		OpenGL.glTexCoord2f(local53, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method3984(5890, 0, 768);
		this.method3984(34166, 2, 770);
		this.method4003(0, 5890);
		this.method4003(2, 34166);
	}
}
