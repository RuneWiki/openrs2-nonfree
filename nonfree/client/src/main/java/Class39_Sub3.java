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

@OriginalClass("client!os")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	private int anInt6540;

	@OriginalMember(owner = "client!os", name = "X", descriptor = "I")
	private int anInt6562;

	@OriginalMember(owner = "client!os", name = "sd", descriptor = "I")
	public int anInt6678;

	@OriginalMember(owner = "client!os", name = "Qd", descriptor = "I")
	public int anInt6701;

	@OriginalMember(owner = "client!os", name = "pe", descriptor = "I")
	public int anInt6717;

	@OriginalMember(owner = "client!os", name = "se", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!os", name = "xe", descriptor = "Lclient!ru;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!os", name = "ze", descriptor = "Lclient!ru;")
	private Interface18 anInterface18_2;

	@OriginalMember(owner = "client!os", name = "Ce", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!os", name = "De", descriptor = "I")
	public int anInt6722;

	@OriginalMember(owner = "client!os", name = "Ee", descriptor = "I")
	private int anInt6723;

	@OriginalMember(owner = "client!os", name = "Me", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_1;

	@OriginalMember(owner = "client!os", name = "Ne", descriptor = "F")
	public float aFloat154;

	@OriginalMember(owner = "client!os", name = "Oe", descriptor = "I")
	private int anInt6725;

	@OriginalMember(owner = "client!os", name = "Pe", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!os", name = "Qe", descriptor = "J")
	private long aLong165;

	@OriginalMember(owner = "client!os", name = "Ue", descriptor = "I")
	private int anInt6728;

	@OriginalMember(owner = "client!os", name = "We", descriptor = "I")
	private int anInt6729;

	@OriginalMember(owner = "client!os", name = "Xe", descriptor = "Lclient!vb;")
	public Class293 aClass293_6;

	@OriginalMember(owner = "client!os", name = "Ze", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!os", name = "bf", descriptor = "Lclient!jv;")
	public Class63_Sub2 bf;

	@OriginalMember(owner = "client!os", name = "cf", descriptor = "F")
	public float aFloat159;

	@OriginalMember(owner = "client!os", name = "ef", descriptor = "F")
	public float aFloat161;

	@OriginalMember(owner = "client!os", name = "gf", descriptor = "Z")
	public boolean aBoolean485;

	@OriginalMember(owner = "client!os", name = "kf", descriptor = "I")
	private int anInt6731;

	@OriginalMember(owner = "client!os", name = "lf", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_2;

	@OriginalMember(owner = "client!os", name = "rf", descriptor = "Lclient!gg;")
	private Class19_Sub2_Sub1 aClass19_Sub2_Sub1_5;

	@OriginalMember(owner = "client!os", name = "tf", descriptor = "Z")
	private boolean aBoolean488;

	@OriginalMember(owner = "client!os", name = "uf", descriptor = "Z")
	private boolean aBoolean489;

	@OriginalMember(owner = "client!os", name = "yf", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_3;

	@OriginalMember(owner = "client!os", name = "zf", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!os", name = "Bf", descriptor = "F")
	private float aFloat165;

	@OriginalMember(owner = "client!os", name = "Ff", descriptor = "I")
	public int anInt6738;

	@OriginalMember(owner = "client!os", name = "If", descriptor = "Z")
	private boolean aBoolean492;

	@OriginalMember(owner = "client!os", name = "Jf", descriptor = "I")
	private int anInt6741;

	@OriginalMember(owner = "client!os", name = "Kf", descriptor = "I")
	public int anInt6742;

	@OriginalMember(owner = "client!os", name = "Mf", descriptor = "I")
	public int anInt6744;

	@OriginalMember(owner = "client!os", name = "Qf", descriptor = "Ljava/lang/String;")
	private String aString140;

	@OriginalMember(owner = "client!os", name = "Tf", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_4;

	@OriginalMember(owner = "client!os", name = "Uf", descriptor = "Z")
	private boolean aBoolean493;

	@OriginalMember(owner = "client!os", name = "Zf", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_5;

	@OriginalMember(owner = "client!os", name = "ag", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_6;

	@OriginalMember(owner = "client!os", name = "cg", descriptor = "F")
	private float aFloat170;

	@OriginalMember(owner = "client!os", name = "eg", descriptor = "Lclient!lq;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!os", name = "fg", descriptor = "Lclient!af;")
	public Class11 aClass11_12;

	@OriginalMember(owner = "client!os", name = "gg", descriptor = "Lclient!eea;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!os", name = "hg", descriptor = "Z")
	private boolean aBoolean494;

	@OriginalMember(owner = "client!os", name = "jg", descriptor = "Lclient!ot;")
	public Class19_Sub2 aClass19_Sub2_5;

	@OriginalMember(owner = "client!os", name = "kg", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_7;

	@OriginalMember(owner = "client!os", name = "lg", descriptor = "F")
	public float aFloat171;

	@OriginalMember(owner = "client!os", name = "mg", descriptor = "F")
	public float aFloat172;

	@OriginalMember(owner = "client!os", name = "ng", descriptor = "Lclient!af;")
	public Class11 aClass11_13;

	@OriginalMember(owner = "client!os", name = "pg", descriptor = "Lclient!dl;")
	private Class58_Sub1 aClass58_Sub1_1;

	@OriginalMember(owner = "client!os", name = "qg", descriptor = "Ljava/lang/String;")
	private String aString141;

	@OriginalMember(owner = "client!os", name = "wg", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!os", name = "yg", descriptor = "Lclient!ol;")
	public Class181_Sub3 aClass181_Sub3_3;

	@OriginalMember(owner = "client!os", name = "zg", descriptor = "Z")
	private boolean aBoolean498;

	@OriginalMember(owner = "client!os", name = "Ag", descriptor = "F")
	private float aFloat176;

	@OriginalMember(owner = "client!os", name = "Bg", descriptor = "Z")
	public boolean aBoolean499;

	@OriginalMember(owner = "client!os", name = "Cg", descriptor = "Z")
	public boolean aBoolean500;

	@OriginalMember(owner = "client!os", name = "Dg", descriptor = "[Lclient!baa;")
	private Class19[] aClass19Array1;

	@OriginalMember(owner = "client!os", name = "Fg", descriptor = "I")
	private int anInt6752;

	@OriginalMember(owner = "client!os", name = "Gg", descriptor = "Lclient!ol;")
	public Class181_Sub3 aClass181_Sub3_4;

	@OriginalMember(owner = "client!os", name = "Hg", descriptor = "I")
	private int anInt6753;

	@OriginalMember(owner = "client!os", name = "Ig", descriptor = "I")
	private int anInt6754;

	@OriginalMember(owner = "client!os", name = "Jg", descriptor = "Lclient!lq;")
	private Interface10 anInterface10_6;

	@OriginalMember(owner = "client!os", name = "Kg", descriptor = "I")
	private int anInt6755;

	@OriginalMember(owner = "client!os", name = "Mg", descriptor = "Z")
	public boolean aBoolean502;

	@OriginalMember(owner = "client!os", name = "Ng", descriptor = "I")
	private int anInt6757;

	@OriginalMember(owner = "client!os", name = "Pg", descriptor = "I")
	public int anInt6758;

	@OriginalMember(owner = "client!os", name = "Qg", descriptor = "Z")
	public boolean aBoolean504;

	@OriginalMember(owner = "client!os", name = "Rg", descriptor = "Z")
	public boolean aBoolean505;

	@OriginalMember(owner = "client!os", name = "Sg", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_8;

	@OriginalMember(owner = "client!os", name = "Tg", descriptor = "Lclient!jv;")
	public Class63_Sub2 aClass63_Sub2_9;

	@OriginalMember(owner = "client!os", name = "Vg", descriptor = "Z")
	private boolean aBoolean507;

	@OriginalMember(owner = "client!os", name = "Wg", descriptor = "Z")
	private boolean aBoolean508;

	@OriginalMember(owner = "client!os", name = "Xg", descriptor = "Z")
	public boolean aBoolean509;

	@OriginalMember(owner = "client!os", name = "Zg", descriptor = "I")
	private int anInt6760;

	@OriginalMember(owner = "client!os", name = "ah", descriptor = "Z")
	private boolean aBoolean510;

	@OriginalMember(owner = "client!os", name = "bh", descriptor = "Z")
	public boolean aBoolean511;

	@OriginalMember(owner = "client!os", name = "fh", descriptor = "I")
	private int anInt6761;

	@OriginalMember(owner = "client!os", name = "gh", descriptor = "I")
	private int anInt6762;

	@OriginalMember(owner = "client!os", name = "s", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!os", name = "fe", descriptor = "I")
	public int anInt6712 = 128;

	@OriginalMember(owner = "client!os", name = "ee", descriptor = "Lclient!dn;")
	private final Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!os", name = "ke", descriptor = "Lclient!ol;")
	private final Class181_Sub3 aClass181_Sub3_1 = new Class181_Sub3();

	@OriginalMember(owner = "client!os", name = "le", descriptor = "Lclient!ol;")
	public final Class181_Sub3 aClass181_Sub3_2 = new Class181_Sub3();

	@OriginalMember(owner = "client!os", name = "ne", descriptor = "I")
	public int anInt6716 = 3;

	@OriginalMember(owner = "client!os", name = "me", descriptor = "I")
	public int anInt6715 = 8;

	@OriginalMember(owner = "client!os", name = "qe", descriptor = "Z")
	private boolean aBoolean483 = false;

	@OriginalMember(owner = "client!os", name = "re", descriptor = "Lclient!rk;")
	private final Class249 aClass249_39 = new Class249();

	@OriginalMember(owner = "client!os", name = "te", descriptor = "[Lclient!ru;")
	private final Interface18[] anInterface18Array1 = new Interface18[4];

	@OriginalMember(owner = "client!os", name = "we", descriptor = "I")
	private int anInt6720 = -1;

	@OriginalMember(owner = "client!os", name = "ye", descriptor = "[Lclient!ru;")
	private final Interface18[] anInterface18Array2 = new Interface18[4];

	@OriginalMember(owner = "client!os", name = "ue", descriptor = "I")
	private int anInt6718 = -1;

	@OriginalMember(owner = "client!os", name = "ve", descriptor = "I")
	private int anInt6719 = -1;

	@OriginalMember(owner = "client!os", name = "Ae", descriptor = "[Lclient!ru;")
	private final Interface18[] anInterface18Array3 = new Interface18[4];

	@OriginalMember(owner = "client!os", name = "Be", descriptor = "Lclient!rk;")
	private final Class249 aClass249_40;

	@OriginalMember(owner = "client!os", name = "Fe", descriptor = "Lclient!rk;")
	private final Class249 aClass249_41;

	@OriginalMember(owner = "client!os", name = "Ge", descriptor = "Lclient!rk;")
	private final Class249 aClass249_42;

	@OriginalMember(owner = "client!os", name = "He", descriptor = "Lclient!rk;")
	private final Class249 aClass249_43;

	@OriginalMember(owner = "client!os", name = "Ie", descriptor = "Lclient!rk;")
	private final Class249 aClass249_44;

	@OriginalMember(owner = "client!os", name = "Je", descriptor = "Lclient!rk;")
	private final Class249 aClass249_45;

	@OriginalMember(owner = "client!os", name = "Ke", descriptor = "Lclient!rk;")
	private final Class249 aClass249_46;

	@OriginalMember(owner = "client!os", name = "Se", descriptor = "F")
	public float aFloat156;

	@OriginalMember(owner = "client!os", name = "Te", descriptor = "I")
	private int anInt6727;

	@OriginalMember(owner = "client!os", name = "nf", descriptor = "I")
	public int anInt6732;

	@OriginalMember(owner = "client!os", name = "jf", descriptor = "F")
	public float aFloat162;

	@OriginalMember(owner = "client!os", name = "of", descriptor = "I")
	private int anInt6733;

	@OriginalMember(owner = "client!os", name = "Hf", descriptor = "I")
	private int anInt6740;

	@OriginalMember(owner = "client!os", name = "Df", descriptor = "I")
	public int anInt6736;

	@OriginalMember(owner = "client!os", name = "af", descriptor = "F")
	public float aFloat158;

	@OriginalMember(owner = "client!os", name = "Sf", descriptor = "I")
	public int anInt6747;

	@OriginalMember(owner = "client!os", name = "Ef", descriptor = "I")
	public int anInt6737;

	@OriginalMember(owner = "client!os", name = "Xf", descriptor = "F")
	public float aFloat168;

	@OriginalMember(owner = "client!os", name = "Rf", descriptor = "I")
	public int anInt6746;

	@OriginalMember(owner = "client!os", name = "Ye", descriptor = "I")
	private int anInt6730;

	@OriginalMember(owner = "client!os", name = "Re", descriptor = "I")
	public int anInt6726;

	@OriginalMember(owner = "client!os", name = "xf", descriptor = "[F")
	private final float[] aFloatArray52;

	@OriginalMember(owner = "client!os", name = "Vf", descriptor = "I")
	private int anInt6748;

	@OriginalMember(owner = "client!os", name = "Le", descriptor = "I")
	private int anInt6724;

	@OriginalMember(owner = "client!os", name = "rg", descriptor = "I")
	public int anInt6751;

	@OriginalMember(owner = "client!os", name = "ug", descriptor = "F")
	public float aFloat174;

	@OriginalMember(owner = "client!os", name = "xg", descriptor = "F")
	private float aFloat175;

	@OriginalMember(owner = "client!os", name = "og", descriptor = "F")
	public float aFloat173;

	@OriginalMember(owner = "client!os", name = "dg", descriptor = "[F")
	private final float[] aFloatArray54;

	@OriginalMember(owner = "client!os", name = "Wf", descriptor = "F")
	public float aFloat167;

	@OriginalMember(owner = "client!os", name = "Lf", descriptor = "I")
	private int anInt6743;

	@OriginalMember(owner = "client!os", name = "tg", descriptor = "[Lclient!at;")
	private final Class2_Sub5[] aClass2_Sub5Array5;

	@OriginalMember(owner = "client!os", name = "Af", descriptor = "F")
	private float aFloat164;

	@OriginalMember(owner = "client!os", name = "Gf", descriptor = "I")
	private int anInt6739;

	@OriginalMember(owner = "client!os", name = "Nf", descriptor = "[F")
	public final float[] aFloatArray53;

	@OriginalMember(owner = "client!os", name = "Pf", descriptor = "I")
	public int anInt6745;

	@OriginalMember(owner = "client!os", name = "vf", descriptor = "[F")
	private final float[] aFloatArray51;

	@OriginalMember(owner = "client!os", name = "qf", descriptor = "I")
	public int anInt6734;

	@OriginalMember(owner = "client!os", name = "Og", descriptor = "Z")
	private boolean aBoolean503;

	@OriginalMember(owner = "client!os", name = "bg", descriptor = "I")
	private int anInt6749;

	@OriginalMember(owner = "client!os", name = "ff", descriptor = "[F")
	private final float[] aFloatArray50;

	@OriginalMember(owner = "client!os", name = "df", descriptor = "F")
	public float aFloat160;

	@OriginalMember(owner = "client!os", name = "ig", descriptor = "I")
	private int anInt6750;

	@OriginalMember(owner = "client!os", name = "mf", descriptor = "F")
	private float aFloat163;

	@OriginalMember(owner = "client!os", name = "Yf", descriptor = "F")
	private float aFloat169;

	@OriginalMember(owner = "client!os", name = "Lg", descriptor = "I")
	public int anInt6756;

	@OriginalMember(owner = "client!os", name = "Of", descriptor = "F")
	private float aFloat166;

	@OriginalMember(owner = "client!os", name = "Yg", descriptor = "I")
	public int anInt6759;

	@OriginalMember(owner = "client!os", name = "hf", descriptor = "Lclient!ke;")
	public Class2_Sub29_Sub1 aClass2_Sub29_Sub1_2;

	@OriginalMember(owner = "client!os", name = "dh", descriptor = "[I")
	public int[] anIntArray515;

	@OriginalMember(owner = "client!os", name = "ch", descriptor = "[B")
	public final byte[] aByteArray97;

	@OriginalMember(owner = "client!os", name = "eh", descriptor = "[I")
	public int[] anIntArray516;

	@OriginalMember(owner = "client!os", name = "hh", descriptor = "[I")
	public int[] anIntArray517;

	@OriginalMember(owner = "client!os", name = "Pb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!os", name = "Rc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!os", name = "de", descriptor = "I")
	public final int anInt6711;

	@OriginalMember(owner = "client!os", name = "Pc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!os", name = "Vb", descriptor = "J")
	private final long aLong164;

	@OriginalMember(owner = "client!os", name = "db", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!os", name = "wf", descriptor = "I")
	public final int anInt6735;

	@OriginalMember(owner = "client!os", name = "sg", descriptor = "Z")
	public boolean aBoolean495;

	@OriginalMember(owner = "client!os", name = "Cf", descriptor = "Z")
	public boolean aBoolean491;

	@OriginalMember(owner = "client!os", name = "vg", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!os", name = "Ug", descriptor = "Z")
	public boolean aBoolean506;

	@OriginalMember(owner = "client!os", name = "Eg", descriptor = "Z")
	public boolean aBoolean501;

	@OriginalMember(owner = "client!os", name = "pf", descriptor = "Z")
	private boolean aBoolean486;

	@OriginalMember(owner = "client!os", name = "Ve", descriptor = "Z")
	public boolean aBoolean484;

	@OriginalMember(owner = "client!os", name = "sf", descriptor = "Z")
	private final boolean aBoolean487;

	@OriginalMember(owner = "client!os", name = "Vd", descriptor = "Lclient!er;")
	private final Class77 aClass77_1;

	@OriginalMember(owner = "client!os", name = "oe", descriptor = "Lclient!wda;")
	public final Class311 aClass311_1;

	@OriginalMember(owner = "client!os", name = "Yd", descriptor = "Lclient!lg;")
	private final Class175 aClass175_1;

	@OriginalMember(owner = "client!os", name = "he", descriptor = "Lclient!aaa;")
	private Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!os", name = "Xd", descriptor = "Lclient!wr;")
	private final Class318 aClass318_1;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;I)V")
	public Class39_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class185();
		new Class127(16);
		this.aClass249_40 = new Class249();
		this.aClass249_41 = new Class249();
		this.aClass249_42 = new Class249();
		this.aClass249_43 = new Class249();
		this.aClass249_44 = new Class249();
		this.aClass249_45 = new Class249();
		this.aClass249_46 = new Class249();
		this.aFloat156 = 3000.0F;
		this.anInt6727 = 0;
		this.anInt6732 = 0;
		this.aFloat162 = 3584.0F;
		this.anInt6733 = 0;
		this.anInt6740 = 8448;
		this.anInt6736 = 0;
		this.aFloat158 = 3584.0F;
		this.anInt6747 = -1;
		this.anInt6737 = -1;
		this.aFloat168 = -1.0F;
		this.anInt6746 = 0;
		this.anInt6730 = 0;
		this.anInt6726 = 512;
		this.aFloatArray52 = new float[16];
		this.anInt6748 = 0;
		this.anInt6724 = 0;
		this.anInt6751 = 512;
		this.aFloat174 = 1.0F;
		this.aFloat175 = -1.0F;
		this.aFloat173 = 1.0F;
		this.aFloatArray54 = new float[4];
		this.aFloat167 = -1.0F;
		this.anInt6743 = 8448;
		this.aClass2_Sub5Array5 = new Class2_Sub5[Static279.anInt5137];
		this.aFloat164 = 0.0F;
		this.anInt6739 = 0;
		this.aFloatArray53 = new float[4];
		this.anInt6745 = 3584;
		this.aFloatArray51 = new float[4];
		this.anInt6734 = 0;
		this.aBoolean503 = true;
		this.anInt6749 = -1;
		this.aFloatArray50 = new float[4];
		this.aFloat160 = 1.0F;
		this.anInt6750 = -1;
		this.aFloat163 = -1.0F;
		this.aFloat169 = 1.0F;
		this.anInt6756 = -1;
		this.aFloat166 = 1.0F;
		this.anInt6759 = 50;
		this.aClass2_Sub29_Sub1_2 = new Class2_Sub29_Sub1(8192);
		this.anIntArray515 = new int[1];
		this.aByteArray97 = new byte[16384];
		this.anIntArray516 = new int[1];
		this.anIntArray517 = new int[1];
		this.aCanvas11 = this.aCanvas10 = arg0;
		this.anInt6711 = arg2;
		if (!Static467.method7030("jaclib")) {
			throw new RuntimeException("");
		} else if (Static467.method7030("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong163 = this.aLong164 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt6711);
				if (this.aLong164 == 0L) {
					throw new RuntimeException("");
				}
				this.method5739();
				@Pc(318) int local318 = this.method5678();
				if (local318 != 0) {
					throw new RuntimeException("");
				}
				this.anInt6735 = this.aBoolean485 ? 33639 : 5121;
				@Pc(344) int local344;
				if (this.aString140.indexOf("radeon") != -1) {
					local344 = 0;
					@Pc(346) boolean local346 = false;
					@Pc(348) boolean local348 = false;
					@Pc(357) String[] local357 = Static225.method3542(' ', this.aString140.replace('/', ' '));
					for (@Pc(359) int local359 = 0; local359 < local357.length; local359++) {
						@Pc(365) String local365 = local357[local359];
						try {
							if (local365.length() > 0) {
								if (local365.charAt(0) == 'x' && local365.length() >= 3 && Static9.method378(local365.substring(1, 3))) {
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
									if (local365.length() >= 4 && Static9.method378(local365.substring(0, 4))) {
										local344 = Static359.method5799(local365.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(428) Exception local428) {
						}
					}
					if (!local346 || local344 < 4000) {
						this.aBoolean495 = false;
					}
					if (!local348 && !local346) {
						if (local344 >= 7000 && local344 <= 9250) {
							this.aBoolean491 = false;
						}
						if (local344 >= 7000 && local344 <= 7999) {
							this.aBoolean496 = false;
						}
					}
					this.aBoolean506 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean501 = true;
					this.aBoolean486 = this.aBoolean496;
				}
				if (this.aString141.indexOf("intel") != -1) {
					this.aBoolean484 = false;
				}
				this.aBoolean487 = !this.aString141.equals("s3 graphics");
				if (this.aBoolean496) {
					try {
						@Pc(509) int[] local509 = new int[1];
						OpenGL.glGenBuffersARB(1, local509, 0);
					} catch (@Pc(515) Throwable local515) {
						throw new RuntimeException("");
					}
				}
				Static368.method5873(false, true);
				this.aBoolean483 = true;
				this.aClass77_1 = new Class77(this, super.anInterface12_15);
				this.method5684();
				this.aClass311_1 = new Class311(this);
				this.aClass175_1 = new Class175(this);
				if (this.aClass175_1.method4351()) {
					this.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1(this);
					if (!this.aClass2_Sub1_Sub1_1.method264()) {
						this.aClass2_Sub1_Sub1_1.method256();
						this.aClass2_Sub1_Sub1_1 = null;
					}
				}
				this.aClass318_1 = new Class318(this);
				this.method5714();
				this.method5687();
				OpenGL.glClear(16640);
				local344 = 0;
				while (true) {
					try {
						this.anOpenGL1.swapBuffers();
						break;
					} catch (@Pc(594) Exception local594) {
						if (local344++ > 5) {
							throw new RuntimeException("");
						}
						Static379.method5233(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(614) Throwable local614) {
				local614.printStackTrace();
				this.method6055();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)I")
	private int method5678() {
		this.aString141 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString140 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString141.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString141.indexOf("brian paul") != -1 || this.aString141.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(50) String local50 = OpenGL.glGetString(7938);
		@Pc(58) String[] local58 = Static225.method3542(' ', local50.replace('.', ' '));
		if (local58.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(74) int local74 = Static359.method5799(local58[0]);
				@Pc(80) int local80 = Static359.method5799(local58[1]);
				this.anInt6729 = local74 * 10 + local80;
			} catch (@Pc(89) NumberFormatException local89) {
				local10 |= 0x4;
			}
		}
		if (this.anInt6729 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(123) int[] local123 = new int[1];
		OpenGL.glGetIntegerv(34018, local123, 0);
		this.anInt6744 = local123[0];
		OpenGL.glGetIntegerv(34929, local123, 0);
		this.anInt6741 = local123[0];
		OpenGL.glGetIntegerv(34930, local123, 0);
		this.anInt6755 = local123[0];
		if (this.anInt6744 < 2 || this.anInt6741 < 2 || this.anInt6755 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean485 = Stream.a();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean496 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean510 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean505 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean504 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean500 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean491 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean506 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean499 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean495 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean490 = false;
		this.aBoolean484 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean511 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean502 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean492 = this.aBoolean502 & this.aBoolean511;
		OpenGL.glGetFloatv(2834, Static269.aFloatArray34, 0);
		this.aFloat175 = Static269.aFloatArray34[1];
		this.aFloat163 = Static269.aFloatArray34[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
	@Override
	public void method6012(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6712 = arg0;
		this.aClass77_1.method2234();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class75 method6081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class75_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V")
	private void method5679() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6760; local7++) {
			@Pc(14) Class2_Sub5 local14 = this.aClass2_Sub5Array5[local7];
			@Pc(19) int local19 = local7 + 16386;
			Static19.aFloatArray3[0] = local14.method1672();
			Static19.aFloatArray3[1] = local14.method1671();
			Static19.aFloatArray3[2] = local14.method1662();
			Static19.aFloatArray3[3] = 1.0F;
			OpenGL.glLightfv(local19, 4611, Static19.aFloatArray3, 0);
			@Pc(53) int local53 = local14.method1669();
			@Pc(59) float local59 = local14.method1665() / 255.0F;
			Static19.aFloatArray3[2] = local59 * (float) (local53 & 0xFF);
			Static19.aFloatArray3[0] = (float) (local53 >> 16 & 0xFF) * local59;
			Static19.aFloatArray3[1] = (float) (local53 >> 8 & 0xFF) * local59;
			OpenGL.glLightfv(local19, 4609, Static19.aFloatArray3, 0);
			OpenGL.glLightf(local19, 4617, 1.0F / (float) (local14.method1666() * local14.method1666()));
			OpenGL.glEnable(local19);
		}
		while (this.anInt6752 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6752 = this.anInt6760;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt6759;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIBI)V")
	public void method5680(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method6032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class209 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class209_Sub1 local6 = (Class209_Sub1) arg5;
		@Pc(9) Class19_Sub2_Sub1 local9 = local6.aClass19_Sub2_Sub1_4;
		this.method5722();
		this.method5719(local6.aClass19_Sub2_Sub1_4);
		this.method5704(1);
		this.method5760(7681, 8448);
		this.method5709(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat54 / (float) local9.anInt2885;
		@Pc(46) float local46 = local9.aFloat53 / (float) local9.anInt2889;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local52 * local52)));
		@Pc(76) float local76 = local52 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local76 + 0.35F, (float) arg3 + 0.35F + local95);
		OpenGL.glEnd();
		this.method5709(5890, 0, 768);
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5694();
		this.method5704(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
	private void method5681() {
		if (this.aBoolean507) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean507 = false;
		}
	}

	@OriginalMember(owner = "client!os", name = "t", descriptor = "()V")
	@Override
	protected void method6055() {
		for (@Pc(10) Class2 local10 = this.aClass249_39.method6527(); local10 != null; local10 = this.aClass249_39.method6525()) {
			((Class2_Sub4_Sub2) local10).method6915();
		}
		if (this.aClass175_1 != null) {
			this.aClass175_1.method4345();
		}
		if (this.anOpenGL1 != null) {
			this.method5759();
			@Pc(40) Enumeration local40 = this.aHashtable4.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable4.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean483) {
			Static456.method6972(false, true);
			this.aBoolean483 = false;
		}
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "()V")
	@Override
	public void method6023() {
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!lh;Lclient!lh;FLclient!lh;)Lclient!lh;")
	@Override
	public Class58 method6045(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class58 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean499 && this.aBoolean484) {
			@Pc(15) Class58_Sub1_Sub1 local15 = null;
			@Pc(18) Class58_Sub1 local18 = (Class58_Sub1) arg0;
			@Pc(21) Class58_Sub1 local21 = (Class58_Sub1) arg1;
			@Pc(25) Class19_Sub1 local25 = local18.method6988();
			@Pc(29) Class19_Sub1 local29 = local21.method6988();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt815 < local25.anInt815 ? local25.anInt815 : local29.anInt815;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class58_Sub1_Sub1) {
					@Pc(60) Class58_Sub1_Sub1 local60 = (Class58_Sub1_Sub1) arg3;
					if (local48 == local60.method3290()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class58_Sub1_Sub1(this, local48);
				}
				if (local15.method3289(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!os", name = "IA", descriptor = "(III[I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass181_Sub3_3.aFloat150 + this.aClass181_Sub3_3.aFloat147 * (float) arg0 + (float) arg1 * this.aClass181_Sub3_3.aFloat153 + this.aClass181_Sub3_3.aFloat148 * (float) arg2;
		if ((float) this.anInt6759 > local28 || (float) this.anInt6745 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) (((float) arg2 * this.aClass181_Sub3_3.aFloat149 + (float) arg1 * this.aClass181_Sub3_3.aFloat143 + (float) arg0 * this.aClass181_Sub3_3.aFloat146 + this.aClass181_Sub3_3.aFloat145) * (float) this.anInt6751 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt6726 * (this.aClass181_Sub3_3.aFloat152 + (float) arg2 * this.aClass181_Sub3_3.aFloat144 + (float) arg1 * this.aClass181_Sub3_3.aFloat151 + (float) arg0 * this.aClass181_Sub3_3.aFloat142) / local28);
		if (this.aFloat161 <= (float) local85 && (float) local85 <= this.aFloat154 && this.aFloat157 <= (float) local117 && this.aFloat171 >= (float) local117) {
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat161);
			arg3[1] = (int) ((float) local117 - this.aFloat157);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "()Lclient!rr;")
	@Override
	public Class254 method6009() {
		@Pc(7) int local7 = -1;
		if (this.aString141.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString141.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString141.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class254(local7, "OpenGL", this.anInt6729, this.aString140, 0L);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIZZ)V")
	public void method5682(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt6757) {
			if (arg1 < 0) {
				this.method5681();
				this.method5719(null);
				this.method5699(0);
				if (!this.aBoolean509) {
					this.aClass318_1.method7784(0, arg0, 0, 0, arg2);
				}
			} else {
				@Pc(45) Class19_Sub2 local45 = this.aClass77_1.method2236(arg1);
				@Pc(51) Class204 local51 = super.anInterface12_15.method2573(arg1);
				if (local51.aByte87 == 0 && local51.aByte84 == 0) {
					this.method5681();
				} else {
					@Pc(72) int local72 = local51.aBoolean454 ? 64 : 128;
					@Pc(76) int local76 = local72 * 50;
					this.method5716((float) (local51.aByte84 * (this.anInt6717 % local76)) / (float) local76, 0.0F, (float) (this.anInt6717 % local76 * local51.aByte87) / (float) local76);
				}
				if (this.aBoolean509) {
					this.method5719(local45);
					this.method5699(local51.anInt6219);
				} else {
					this.aClass318_1.method7784(local51.anInt6222, arg0, local51.aByte86, local51.aByte85, arg2);
					if (!this.aClass318_1.method7782(local45, local51.anInt6219)) {
						this.method5719(local45);
						this.method5699(local51.anInt6219);
					}
				}
			}
			this.anInt6757 = arg1;
		}
		this.anInt6725 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "()V")
	@Override
	public void method6031() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!os", name = "L", descriptor = "(I)V")
	@Override
	public void L(@OriginalArg(0) int arg0) {
		this.anInt6716 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6716++;
		}
		this.anInt6715 = 0x1 << this.anInt6716;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)I")
	@Override
	public int method6028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ru;B)V")
	public void method5683(@OriginalArg(0) Interface18 arg0) {
		if (this.anInt6720 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6720 >= 0) {
			this.anInterface18Array2[this.anInt6720].method7357();
		}
		this.anInterface18_1 = this.anInterface18Array2[++this.anInt6720] = arg0;
		this.anInterface18_1.method7358();
	}

	@OriginalMember(owner = "client!os", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		@Pc(6) int local6 = this.anInt6762;
		this.anInt6762 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!os", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aBoolean509 = false;
		this.aClass318_1.method7784(0, false, 0, 0, false);
		this.method5732();
		this.method5710();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)Lclient!lh;")
	@Override
	public Class58 method6040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean499 ? new Class58_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(Z)V")
	private void method5684() {
		this.aClass181_Sub3_3 = new Class181_Sub3();
		this.aClass181_Sub3_4 = new Class181_Sub3();
		this.aClass19Array1 = new Class19[this.anInt6744];
		this.aClass19_Sub2_5 = new Class19_Sub2(this, 3553, 6408, 1, 1);
		new Class19_Sub2(this, 3553, 6408, 1, 1);
		new Class19_Sub2(this, 3553, 6408, 1, 1);
		this.aClass63_Sub2_8 = new Class63_Sub2(this);
		this.aClass63_Sub2_4 = new Class63_Sub2(this);
		this.aClass63_Sub2_5 = new Class63_Sub2(this);
		this.aClass63_Sub2_6 = new Class63_Sub2(this);
		this.aClass63_Sub2_1 = new Class63_Sub2(this);
		this.aClass63_Sub2_9 = new Class63_Sub2(this);
		this.aClass63_Sub2_3 = new Class63_Sub2(this);
		this.aClass63_Sub2_7 = new Class63_Sub2(this);
		this.bf = new Class63_Sub2(this);
		this.aClass63_Sub2_2 = new Class63_Sub2(this);
		if (this.aBoolean484) {
			this.aClass293_6 = new Class293(this);
			new Class293(this);
		}
	}

	@OriginalMember(owner = "client!os", name = "u", descriptor = "()V")
	@Override
	public void method6056() {
		this.method5708(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6736 = arg1;
		this.anInt6751 = arg2;
		this.anInt6726 = arg3;
		this.anInt6734 = arg0;
		this.method5707();
		this.method5705();
		if (this.anInt6731 == 3) {
			this.method5740();
		} else if (this.anInt6731 == 2) {
			this.method5730();
			return;
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6051(@OriginalArg(0) Canvas arg0) {
		this.aCanvas11 = null;
		this.aLong163 = 0L;
		if (arg0 == null || this.aCanvas10 == arg0) {
			this.aLong163 = this.aLong164;
			this.aCanvas11 = this.aCanvas10;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable4.get(arg0);
			this.aLong163 = local26;
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.aLong163 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong163);
		this.method5687();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)I")
	public int method5685(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(II)V")
	public void method5686(@OriginalArg(0) int arg0) {
		this.method5715(arg0, true);
	}

	@OriginalMember(owner = "client!os", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg2 * this.aClass181_Sub3_3.aFloat148 + this.aClass181_Sub3_3.aFloat147 * (float) arg0 + (float) arg1 * this.aClass181_Sub3_3.aFloat153 + this.aClass181_Sub3_3.aFloat150;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass181_Sub3_3.aFloat148 * (float) arg5 + this.aClass181_Sub3_3.aFloat153 * (float) arg4 + (float) arg3 * this.aClass181_Sub3_3.aFloat147 + this.aClass181_Sub3_3.aFloat150;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt6759 && (float) this.anInt6759 > local59 || !(!(local28 > (float) this.anInt6745) || !((float) this.anInt6745 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt6751 * ((float) arg0 * this.aClass181_Sub3_3.aFloat146 + (float) arg1 * this.aClass181_Sub3_3.aFloat143 + this.aClass181_Sub3_3.aFloat149 * (float) arg2 + this.aClass181_Sub3_3.aFloat145) / local28);
		@Pc(155) int local155 = (int) ((this.aClass181_Sub3_3.aFloat149 * (float) arg5 + this.aClass181_Sub3_3.aFloat143 * (float) arg4 + this.aClass181_Sub3_3.aFloat146 * (float) arg3 + this.aClass181_Sub3_3.aFloat145) * (float) this.anInt6751 / local59);
		if (this.aFloat161 > (float) local123 && (float) local155 < this.aFloat161 || (float) local123 > this.aFloat154 && this.aFloat154 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass181_Sub3_3.aFloat151 * (float) arg1 + (float) arg0 * this.aClass181_Sub3_3.aFloat142 + this.aClass181_Sub3_3.aFloat144 * (float) arg2 + this.aClass181_Sub3_3.aFloat152) * (float) this.anInt6726 / local28);
			@Pc(245) int local245 = (int) ((this.aClass181_Sub3_3.aFloat152 + this.aClass181_Sub3_3.aFloat142 * (float) arg3 + (float) arg4 * this.aClass181_Sub3_3.aFloat151 + (float) arg5 * this.aClass181_Sub3_3.aFloat144) * (float) this.anInt6726 / local59);
			return (!((float) local213 < this.aFloat157) || !((float) local245 < this.aFloat157)) && (!(this.aFloat171 < (float) local213) || !((float) local245 > this.aFloat171));
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(B)V")
	private void method5687() {
		if (this.aCanvas11 == null) {
			this.anInt6540 = this.anInt6562 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt6540 = local18.width;
			this.anInt6562 = local18.height;
		}
		if (this.anInterface18_2 == null) {
			this.anInt6678 = this.anInt6540;
			this.anInt6701 = this.anInt6562;
			this.method5726();
		}
		this.method5741();
		this.n();
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "(I)V")
	private void method5688() {
		if (this.aFloat172 == 0.0F) {
			this.aFloatArray52[14] = this.aFloat176;
			this.aFloatArray52[10] = this.aFloat165;
		} else {
			@Pc(13) float local13 = this.aFloat156 / (this.aFloat172 + this.aFloat156);
			@Pc(17) float local17 = local13 * local13;
			@Pc(32) float local32 = (1.0F - local13) * -this.aFloat176 * (1.0F - local13) / this.aFloat172;
			this.aFloatArray52[10] = local32 + this.aFloat165;
			this.aFloatArray52[14] = local17 * this.aFloat176;
		}
		this.aFloat162 = ((float) -this.anInt6745 + this.aFloatArray52[14]) / this.aFloatArray52[10];
		this.aFloat158 = (float) this.anInt6745 - this.aFloat172;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[BIZI)Lclient!lq;")
	public Interface10 method5689(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface10) (this.aBoolean496 && (!arg3 || this.aBoolean486) ? new Class84_Sub1(this, arg2, arg1, arg0, arg3) : new Class45_Sub1(this, arg2, arg1, arg0));
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(II)I")
	public int method5690(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(II)I")
	public int method5691(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(II)V")
	public synchronized void method5692(@OriginalArg(1) int arg0) {
		@Pc(13) Class2 local13 = new Class2();
		local13.aLong241 = arg0;
		this.aClass249_45.method6523(local13);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZLclient!ru;)V")
	public void method5693(@OriginalArg(1) Interface18 arg0) {
		if (this.anInt6719 < 0 || this.anInterface18Array3[this.anInt6719] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface18Array3[this.anInt6719--] = null;
		arg0.method7353();
		if (this.anInt6719 >= 0) {
			this.anInterface18_2 = this.anInterface18Array3[this.anInt6719];
			this.anInterface18_2.method7354();
		} else {
			this.anInterface18_2 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "k", descriptor = "(I)V")
	private void method5694() {
		if (this.anInt6725 == 1) {
			return;
		}
		this.method5752();
		this.method5695(false);
		this.method5736(false);
		this.method5744(false);
		this.method5708(false);
		this.method5719(null);
		this.method5686(-2);
		this.method5699(1);
		this.anInt6725 = 1;
	}

	@OriginalMember(owner = "client!os", name = "N", descriptor = "(IIII)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt6701) {
			arg3 = this.anInt6701;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt6678 < arg2) {
			arg2 = this.anInt6678;
		}
		this.anInt6739 = arg0;
		this.anInt6724 = arg3;
		this.anInt6748 = arg1;
		this.anInt6733 = arg2;
		OpenGL.glEnable(3089);
		this.method5705();
		this.method5735();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZB)V")
	public void method5695(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean498 != arg0) {
			this.aBoolean498 = arg0;
			this.method5710();
			this.anInt6725 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BLclient!ru;)V")
	public void method5696(@OriginalArg(1) Interface18 arg0) {
		if (this.aBoolean511) {
			this.method5706(arg0);
			this.method5693(arg0);
		} else if (this.anInt6718 >= 0 && arg0 == this.anInterface18Array1[this.anInt6718]) {
			this.anInterface18Array1[this.anInt6718--] = null;
			arg0.method7355();
			if (this.anInt6718 < 0) {
				this.anInterface18_1 = this.anInterface18_2 = null;
			} else {
				this.anInterface18_1 = this.anInterface18_2 = this.anInterface18Array1[this.anInt6718];
				this.anInterface18_1.method7356();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!os", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(45) float local45;
		if (this.aClass19_Sub2_Sub1_5 == null || this.aClass19_Sub2_Sub1_5.anInt2873 < arg2 || arg3 > this.aClass19_Sub2_Sub1_5.anInt2872) {
			this.aClass19_Sub2_Sub1_5 = Static538.method7756(arg6, arg3, this, arg2);
			this.aClass19_Sub2_Sub1_5.method2691(false, false);
			local45 = this.aClass19_Sub2_Sub1_5.aFloat54;
			local49 = this.aClass19_Sub2_Sub1_5.aFloat53;
		} else {
			this.aClass19_Sub2_Sub1_5.method2697(arg2, false, arg6, 6406, arg3);
			local49 = (float) arg3 * this.aClass19_Sub2_Sub1_5.aFloat53 / (float) this.aClass19_Sub2_Sub1_5.anInt2872;
			local45 = (float) arg2 * this.aClass19_Sub2_Sub1_5.aFloat54 / (float) this.aClass19_Sub2_Sub1_5.anInt2873;
		}
		this.method5722();
		this.method5719(this.aClass19_Sub2_Sub1_5);
		this.method5704(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5751(arg5);
		this.method5760(34165, 34165);
		this.method5709(34166, 0, 768);
		this.method5709(5890, 2, 770);
		this.method5680(34166, 0);
		this.method5680(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		OpenGL.glBegin(7);
		@Pc(166) float local166 = local154 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local151, local166);
		OpenGL.glTexCoord2f(local49, local45);
		OpenGL.glVertex2f(local159, local166);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method5709(5890, 0, 768);
		this.method5709(34166, 2, 770);
		this.method5680(5890, 0);
		this.method5680(34166, 2);
	}

	@OriginalMember(owner = "client!os", name = "B", descriptor = "()V")
	@Override
	public void method6076() {
		if (this.aClass2_Sub1_Sub1_1 != null && this.aClass2_Sub1_Sub1_1.method251()) {
			this.aClass175_1.method4344(this.aClass2_Sub1_Sub1_1);
			this.aClass77_1.method2234();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!ru;)V")
	public void method5697(@OriginalArg(1) Interface18 arg0) {
		if (this.aBoolean511) {
			this.method5683(arg0);
			this.method5701(arg0);
		} else if (this.anInt6718 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt6718 >= 0) {
				this.anInterface18Array1[this.anInt6718].method7355();
			}
			this.anInterface18_1 = this.anInterface18_2 = this.anInterface18Array1[++this.anInt6718] = arg0;
			this.anInterface18_1.method7356();
		}
	}

	@OriginalMember(owner = "client!os", name = "M", descriptor = "(F)V")
	@Override
	public void M(@OriginalArg(0) float arg0) {
		if (this.aFloat159 != arg0) {
			this.aFloat159 = arg0;
			this.method5721();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(FFI)V")
	public void method5698(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat164 = arg0;
		this.aFloat166 = arg1;
		if (!this.aBoolean509) {
			this.method5732();
		}
	}

	@OriginalMember(owner = "client!os", name = "C", descriptor = "()Z")
	@Override
	public boolean method6080() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "F", descriptor = "(IIII)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6748 < arg1) {
			this.anInt6748 = arg1;
		}
		if (this.anInt6724 > arg3) {
			this.anInt6724 = arg3;
		}
		if (this.anInt6733 > arg2) {
			this.anInt6733 = arg2;
		}
		if (this.anInt6739 < arg0) {
			this.anInt6739 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method5705();
		this.method5735();
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "()Z")
	@Override
	public boolean method6013() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IB)V")
	public void method5699(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5760(7681, 7681);
		} else if (arg0 == 0) {
			this.method5760(8448, 8448);
		} else if (arg0 == 2) {
			this.method5760(34165, 7681);
		} else if (arg0 == 3) {
			this.method5760(260, 8448);
		} else if (arg0 == 4) {
			this.method5760(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!os", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt6749;
		if (local11 || arg1 != this.aFloat167 || arg2 != this.aFloat168) {
			this.aFloat168 = arg2;
			this.anInt6749 = arg0;
			this.aFloat167 = arg1;
			if (local11) {
				this.aFloat174 = (float) (this.anInt6749 & 0xFF) / 255.0F;
				this.aFloat173 = (float) (this.anInt6749 & 0xFF0000) / 1.671168E7F;
				this.aFloat160 = (float) (this.anInt6749 & 0xFF00) / 65280.0F;
				this.method5721();
			}
			this.method5749();
		}
		if (this.aFloatArray50[0] == arg3 && this.aFloatArray50[1] == arg4 && arg5 == this.aFloatArray50[2]) {
			return;
		}
		this.aFloatArray50[1] = arg4;
		this.aFloatArray50[2] = arg5;
		this.aFloatArray50[0] = arg3;
		this.aFloatArray54[1] = -arg4;
		this.aFloatArray54[0] = -arg3;
		this.aFloatArray54[2] = -arg5;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray53[0] = arg3 * local138;
		this.aFloatArray53[1] = arg4 * local138;
		this.aFloatArray53[2] = local138 * arg5;
		this.aFloatArray51[1] = -this.aFloatArray53[1];
		this.aFloatArray51[0] = -this.aFloatArray53[0];
		this.aFloatArray51[2] = -this.aFloatArray53[2];
		this.method5717();
		this.anInt6758 = (int) (arg5 * 256.0F / arg4);
		this.anInt6742 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(FZ)V")
	public void method5700(@OriginalArg(0) float arg0) {
		if (arg0 == this.aFloat169) {
			return;
		}
		this.aFloat169 = arg0;
		if (this.anInt6731 == 3) {
			this.method5740();
			return;
		}
	}

	@OriginalMember(owner = "client!os", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.method5704(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6083(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(BLclient!ru;)V")
	public void method5701(@OriginalArg(1) Interface18 arg0) {
		if (this.anInt6719 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6719 >= 0) {
			this.anInterface18Array3[this.anInt6719].method7353();
		}
		this.anInterface18_2 = this.anInterface18Array3[++this.anInt6719] = arg0;
		this.anInterface18_2.method7354();
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "(I)V")
	public void method5702() {
		if (this.anInt6725 == 16) {
			return;
		}
		this.method5757();
		this.method5695(true);
		this.method5744(true);
		this.method5708(true);
		this.method5704(1);
		this.anInt6725 = 16;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BII)V")
	public synchronized void method5703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub32 local8 = new Class2_Sub32(arg1);
		local8.aLong241 = arg0;
		this.aClass249_42.method6523(local8);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method6050(@OriginalArg(0) Class2_Sub4 arg0) {
		this.aNativeHeap4 = ((Class2_Sub4_Sub2) arg0).aNativeHeap6;
		if (this.anInterface10_6 != null) {
			return;
		}
		@Pc(16) Class2_Sub29_Sub1 local16 = new Class2_Sub29_Sub1(80);
		if (this.aBoolean485) {
			local16.method3899(-1.0F);
			local16.method3899(-1.0F);
			local16.method3899(0.0F);
			local16.method3899(0.0F);
			local16.method3899(1.0F);
			local16.method3899(1.0F);
			local16.method3899(-1.0F);
			local16.method3899(0.0F);
			local16.method3899(1.0F);
			local16.method3899(1.0F);
			local16.method3899(1.0F);
			local16.method3899(1.0F);
			local16.method3899(0.0F);
			local16.method3899(1.0F);
			local16.method3899(0.0F);
			local16.method3899(-1.0F);
			local16.method3899(1.0F);
			local16.method3899(0.0F);
			local16.method3899(0.0F);
			local16.method3899(0.0F);
		} else {
			local16.method3902(-1.0F);
			local16.method3902(-1.0F);
			local16.method3902(0.0F);
			local16.method3902(0.0F);
			local16.method3902(1.0F);
			local16.method3902(1.0F);
			local16.method3902(-1.0F);
			local16.method3902(0.0F);
			local16.method3902(1.0F);
			local16.method3902(1.0F);
			local16.method3902(1.0F);
			local16.method3902(1.0F);
			local16.method3902(0.0F);
			local16.method3902(1.0F);
			local16.method3902(0.0F);
			local16.method3902(-1.0F);
			local16.method3902(1.0F);
			local16.method3902(0.0F);
			local16.method3902(0.0F);
			local16.method3902(0.0F);
		}
		this.anInterface10_6 = this.method5689(local16.anInt6132, local16.aByteArray96, 20, false);
		this.aClass11_12 = new Class11(this.anInterface10_6, 5126, 3, 0);
		this.aClass11_13 = new Class11(this.anInterface10_6, 5126, 2, 12);
		this.aClass59_1.method1705(this);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!r;Lclient!oaa;Lclient!m;Lclient!gr;I)V")
	@Override
	public void method6020(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4 arg3) {
		arg0.method7700(arg2, arg3, 0);
		this.method6019(arg1);
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6057(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas10) {
			local5 = this.aLong164;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable4.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas11 == arg0) {
			this.method5687();
		}
	}

	@OriginalMember(owner = "client!os", name = "D", descriptor = "()Z")
	@Override
	public boolean method6082() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "s", descriptor = "()Z")
	@Override
	public boolean method6054() {
		return this.aBoolean510 && (!this.method6043() || this.aBoolean492);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method6015(@OriginalArg(0) Class181 arg0) {
		this.aClass181_Sub3_3 = (Class181_Sub3) arg0;
		this.aClass181_Sub3_4.method5496(this.aClass181_Sub3_3);
		if (this.anInt6731 != 1) {
			this.method5720();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)V")
	public void method5704(@OriginalArg(1) int arg0) {
		if (this.anInt6754 == arg0) {
			return;
		}
		@Pc(28) boolean local28;
		@Pc(26) byte local26;
		if (arg0 == 1) {
			local28 = true;
			local26 = 1;
		} else if (arg0 == 2) {
			local26 = 2;
			local28 = false;
		} else if (arg0 == 128) {
			local28 = true;
			local26 = 3;
		} else {
			local26 = 0;
			local28 = false;
		}
		if (!this.aBoolean493) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean493 = true;
		}
		if (this.aBoolean508 != local28) {
			if (local28) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean508 = local28;
		}
		if (local26 != this.anInt6753) {
			if (local26 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local26 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local26 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt6753 = local26;
		}
		this.anInt6754 = arg0;
		this.anInt6725 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIF)Lclient!at;")
	@Override
	public Class2_Sub5 method6077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub5_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6007(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas10) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(Z)V")
	@Override
	public void method6058(@OriginalArg(0) boolean arg0) {
		this.aBoolean503 = arg0;
		this.method5723();
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(Z)V")
	private void method5705() {
		this.aFloat161 = this.anInt6739 - this.anInt6734;
		this.aFloat171 = this.anInt6724 - this.anInt6736;
		this.aFloat154 = this.anInt6733 - this.anInt6734;
		this.aFloat157 = this.anInt6748 - this.anInt6736;
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)V")
	@Override
	public void method6047(@OriginalArg(0) int arg0) {
		this.method5739();
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6038(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable4.containsKey(arg0)) {
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
			this.aHashtable4.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6006() {
		this.method5694();
		this.method5704(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "()Lclient!m;")
	@Override
	public Class181 method6035() {
		return new Class181_Sub3();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ru;I)V")
	public void method5706(@OriginalArg(0) Interface18 arg0) {
		if (this.anInt6720 < 0 || arg0 != this.anInterface18Array2[this.anInt6720]) {
			throw new RuntimeException();
		}
		this.anInterface18Array2[this.anInt6720--] = null;
		arg0.method7357();
		if (this.anInt6720 >= 0) {
			this.anInterface18_1 = this.anInterface18Array2[this.anInt6720];
			this.anInterface18_1.method7358();
		} else {
			this.anInterface18_1 = null;
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
	private void method5707() {
		@Pc(6) float[] local6 = this.aFloatArray52;
		@Pc(23) float local23 = (float) (-this.anInt6734 * this.anInt6759) / (float) this.anInt6751;
		@Pc(37) float local37 = (float) (this.anInt6759 * (this.anInt6678 - this.anInt6734)) / (float) this.anInt6751;
		@Pc(48) float local48 = (float) (this.anInt6759 * this.anInt6736) / (float) this.anInt6726;
		@Pc(63) float local63 = (float) (this.anInt6759 * (this.anInt6736 - this.anInt6701)) / (float) this.anInt6726;
		if (local23 == local37 || local63 == local48) {
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = 1.0F;
			local6[4] = 0.0F;
			local6[10] = 1.0F;
			local6[0] = 1.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
			local6[8] = 0.0F;
			local6[13] = 0.0F;
			local6[15] = 1.0F;
			local6[6] = 0.0F;
			local6[1] = 0.0F;
		} else {
			@Pc(77) float local77 = (float) this.anInt6759 * 2.0F;
			local6[11] = -1.0F;
			local6[13] = 0.0F;
			local6[8] = (local37 + local23) / (-local23 + local37);
			local6[6] = 0.0F;
			local6[14] = this.aFloat176 = -(local77 * (float) this.anInt6745) / (float) (this.anInt6745 - this.anInt6759);
			local6[0] = local77 / (local37 - local23);
			local6[15] = 0.0F;
			local6[7] = 0.0F;
			local6[10] = this.aFloat165 = (float) -(this.anInt6745 + this.anInt6759) / (float) (this.anInt6745 - this.anInt6759);
			local6[5] = local77 / (local48 - local63);
			local6[1] = 0.0F;
			local6[12] = 0.0F;
			local6[2] = 0.0F;
			local6[4] = 0.0F;
			local6[9] = (local63 + local48) / (local48 - local63);
			local6[3] = 0.0F;
		}
		this.method5688();
	}

	@OriginalMember(owner = "client!os", name = "o", descriptor = "()Z")
	@Override
	public boolean method6037() {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "P", descriptor = "()F")
	@Override
	public float P() {
		return this.aFloat156;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(ZI)V")
	public void method5708(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean497) {
			this.aBoolean497 = arg0;
			this.method5723();
			this.anInt6725 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!os", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class209_Sub1 local6 = (Class209_Sub1) arg1;
		@Pc(9) Class19_Sub2_Sub1 local9 = local6.aClass19_Sub2_Sub1_4;
		this.method5722();
		this.method5719(local6.aClass19_Sub2_Sub1_4);
		this.method5704(1);
		this.method5760(7681, 8448);
		this.method5709(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat54 / (float) local9.anInt2885;
		@Pc(46) float local46 = local9.aFloat53 / (float) local9.anInt2889;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6739 - arg2) * local39, (float) (this.anInt6748 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6739, this.anInt6748);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6739 - arg2), local46 * (float) (this.anInt6724 - arg3));
		OpenGL.glVertex2i(this.anInt6739, this.anInt6724);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6733 - arg2), local46 * (float) (this.anInt6724 - arg3));
		OpenGL.glVertex2i(this.anInt6733, this.anInt6724);
		OpenGL.glTexCoord2f((float) (this.anInt6733 - arg2) * local39, (float) (this.anInt6748 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6733, this.anInt6748);
		OpenGL.glEnd();
		this.method5709(5890, 0, 768);
	}

	@OriginalMember(owner = "client!os", name = "k", descriptor = "()V")
	@Override
	public void method6034() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ZIII)V")
	public void method5709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!os", name = "x", descriptor = "()Z")
	@Override
	public boolean method6065() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(B)V")
	private void method5710() {
		if (this.aBoolean498 && this.aBoolean509 | this.anInt6756 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!os", name = "q", descriptor = "()Z")
	@Override
	public boolean method6043() {
		return this.aClass2_Sub1_Sub1_1 != null && this.aClass2_Sub1_Sub1_1.method251();
	}

	@OriginalMember(owner = "client!os", name = "ra", descriptor = "()F")
	@Override
	public float ra() {
		return this.aFloat172;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!dd;[Lclient!qr;Z)Lclient!ra;")
	@Override
	public Class47 method6078(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class241[] arg1) {
		return new Class47_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(B)V")
	private void method5711() {
		if (this.aBoolean489 && !this.aBoolean494) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method5694();
		this.method5704(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean510) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean510) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(B)V")
	public void method5712() {
		if (this.anInt6725 == 8) {
			return;
		}
		this.method5725();
		this.method5695(true);
		this.method5744(true);
		this.method5708(true);
		this.method5704(1);
		this.anInt6725 = 8;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(ZI)V")
	public void method5713(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean494) {
			this.aBoolean494 = arg0;
			this.method5711();
		}
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(B)V")
	private void method5714() {
		this.method5686(-2);
		for (@Pc(14) int local14 = this.anInt6744 - 1; local14 >= 0; local14--) {
			this.method5750(local14);
			this.method5719(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5760(8448, 8448);
		this.method5709(34168, 2, 770);
		this.method5681();
		this.anInt6754 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6753 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean508 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean493 = true;
		this.method5695(true);
		this.method5736(true);
		this.method5744(true);
		this.method5708(true);
		this.method5741();
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
		@Pc(131) float[] local131 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(133) int local133 = 0; local133 < 8; local133++) {
			@Pc(139) int local139 = local133 + 16384;
			OpenGL.glLightfv(local139, 4608, local131, 0);
			OpenGL.glLightf(local139, 4615, 0.0F);
			OpenGL.glLightf(local139, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6749 = this.anInt6737 = -1;
		this.n();
	}

	@OriginalMember(owner = "client!os", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt6748 = 0;
		this.anInt6724 = this.anInt6701;
		this.anInt6739 = 0;
		this.anInt6733 = this.anInt6678;
		OpenGL.glDisable(3089);
		this.method5705();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)V")
	public void method5715(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method5682(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(FFFB)V")
	private void method5716(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean507) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean507 = true;
	}

	@OriginalMember(owner = "client!os", name = "z", descriptor = "()Z")
	@Override
	public boolean method6073() {
		return this.aClass318_1.method7783();
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method5694();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method5704(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean510) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean510) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6064(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6034();
	}

	@OriginalMember(owner = "client!os", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		@Pc(6) int local6 = this.anInt6761;
		this.anInt6761 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!os", name = "m", descriptor = "(I)V")
	public void method5717() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray53, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray51, 0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!eea;)V")
	public void method5718(@OriginalArg(1) Interface5 arg0) {
		if (this.anInterface5_3 != arg0) {
			if (this.aBoolean496) {
				OpenGL.glBindBufferARB(34963, arg0.method6823());
			}
			this.anInterface5_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!qr;Z)Lclient!ha;")
	@Override
	public Class35 method6018(@OriginalArg(0) Class241 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt7604 * arg0.anInt7606];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray101 == null) {
			for (local21 = 0; local21 < arg0.anInt7604; local21++) {
				for (local25 = 0; local25 < arg0.anInt7606; local25++) {
					@Pc(38) int local38 = arg0.anIntArray589[arg0.aByteArray102[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt7604; local21++) {
				for (local25 = 0; local25 < arg0.anInt7606; local25++) {
					local12[local16++] = arg0.anIntArray589[arg0.aByteArray102[local14] & 0xFF] | arg0.aByteArray101[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(122) Class35 local122 = this.method6049(local12, arg0.anInt7606, arg0.anInt7606, arg0.anInt7604);
		local122.KA(arg0.anInt7603, arg0.anInt7605, arg0.anInt7601, arg0.anInt7602);
		return local122;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!baa;I)V")
	public void method5719(@OriginalArg(0) Class19 arg0) {
		@Pc(11) Class19 local11 = this.aClass19Array1[this.anInt6728];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5629);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5629);
				} else if (local11.anInt5629 != arg0.anInt5629) {
					OpenGL.glDisable(local11.anInt5629);
					OpenGL.glEnable(arg0.anInt5629);
				}
				OpenGL.glBindTexture(arg0.anInt5629, arg0.method4801());
			}
			this.aClass19Array1[this.anInt6728] = arg0;
		}
		this.anInt6725 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!os", name = "r", descriptor = "()I")
	@Override
	public int method6053() {
		return 4;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)V")
	@Override
	public void method6044(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(B)V")
	private void method5720() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass181_Sub3_3.method5494(), 0);
		if (this.aBoolean509) {
			this.aClass318_1.aClass93_Sub2_1.method2713();
		}
		this.method5717();
		this.method5679();
	}

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(Z)V")
	private void method5721() {
		Static269.aFloatArray34[0] = this.aFloat159 * this.aFloat173;
		Static269.aFloatArray34[3] = 1.0F;
		Static269.aFloatArray34[1] = this.aFloat159 * this.aFloat160;
		Static269.aFloatArray34[2] = this.aFloat159 * this.aFloat174;
		OpenGL.glLightModelfv(2899, Static269.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "()Lclient!m;")
	@Override
	public Class181 method6022() {
		return this.aClass181_Sub3_1;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(Z)V")
	public void method5722() {
		if (this.anInt6725 == 2) {
			return;
		}
		this.method5752();
		this.method5695(false);
		this.method5736(false);
		this.method5744(false);
		this.method5708(false);
		this.method5686(-2);
		this.anInt6725 = 2;
	}

	@OriginalMember(owner = "client!os", name = "n", descriptor = "(I)V")
	private void method5723() {
		OpenGL.glDepthMask(this.aBoolean497 && this.aBoolean503);
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5694();
		this.method5704(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		@Pc(37) float local37 = (float) (1.0D / Math.sqrt((double) (local17 * local17 + local24 * local24)));
		@Pc(41) float local41 = local24 * local37;
		@Pc(45) float local45 = local17 * local37;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local45 + 0.35F, (float) arg3 + 0.35F + local41);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!os", name = "j", descriptor = "(B)V")
	public void method5724() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "(Z)V")
	private void method5725() {
		if (this.anInt6731 != 2) {
			this.anInt6731 = 2;
			this.method5730();
			this.method5720();
			this.anInt6725 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!os", name = "o", descriptor = "(I)V")
	private void method5726() {
		OpenGL.glViewport(this.anInt6730, this.anInt6727, this.anInt6678, this.anInt6701);
	}

	@OriginalMember(owner = "client!os", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6738 = arg0;
		this.anInt6746 = arg3;
		this.anInt6747 = arg2;
		this.anInt6750 = arg1;
		this.aBoolean509 = true;
		this.aClass318_1.method7784(0, false, 0, 3, false);
		this.aClass318_1.aClass93_Sub2_1.method2713();
		this.method5732();
		this.method5710();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([Lclient!r;Lclient!oaa;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6030(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) Class6_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method6046(arg0, arg2, arg3, arg4);
		this.method6019(arg1);
	}

	@OriginalMember(owner = "client!os", name = "k", descriptor = "(B)Lclient!bo;")
	public Class19_Sub1 method5727() {
		return this.aClass58_Sub1_1 == null ? null : this.aClass58_Sub1_1.method6988();
	}

	@OriginalMember(owner = "client!os", name = "l", descriptor = "(B)V")
	public void method5728() {
		if (this.anInt6725 == 4) {
			return;
		}
		this.method5752();
		this.method5695(false);
		this.method5736(false);
		this.method5744(false);
		this.method5708(false);
		this.method5686(-2);
		this.method5704(1);
		this.anInt6725 = 4;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6008(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub32 local19;
		while (!this.aClass249_41.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_41.method6529();
			Static52.anIntArray79[local11++] = (int) local19.aLong241;
			this.anInt6722 -= local19.anInt5391;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static52.anIntArray79, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static52.anIntArray79, 0);
			local11 = 0;
		}
		while (!this.aClass249_42.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_42.method6529();
			Static52.anIntArray79[local11++] = (int) local19.aLong241;
			this.anInt6721 -= local19.anInt5391;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static52.anIntArray79, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static52.anIntArray79, 0);
			local11 = 0;
		}
		while (!this.aClass249_43.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_43.method6529();
			Static52.anIntArray79[local11++] = local19.anInt5391;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static52.anIntArray79, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static52.anIntArray79, 0);
			local11 = 0;
		}
		while (!this.aClass249_44.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_44.method6529();
			Static52.anIntArray79[local11++] = (int) local19.aLong241;
			this.anInt6723 -= local19.anInt5391;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static52.anIntArray79, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static52.anIntArray79, 0);
		}
		while (!this.aClass249_40.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_40.method6529();
			OpenGL.glDeleteLists((int) local19.aLong241, local19.anInt5391);
		}
		@Pc(215) Class2 local215;
		while (!this.aClass249_45.method6519()) {
			local215 = this.aClass249_45.method6529();
			OpenGL.glDeleteProgramARB((int) local215.aLong241);
		}
		while (!this.aClass249_46.method6519()) {
			local215 = this.aClass249_46.method6529();
			OpenGL.glDeleteObjectARB(local215.aLong241);
		}
		while (!this.aClass249_40.method6519()) {
			local19 = (Class2_Sub32) this.aClass249_40.method6529();
			OpenGL.glDeleteLists((int) local19.aLong241, local19.anInt5391);
		}
		this.aClass77_1.method2232();
		if (this.U() > 100663296 && this.aLong165 + 60000L < Static143.method2502()) {
			System.gc();
			this.aLong165 = Static143.method2502();
		}
		this.anInt6717 = local9;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIB)V")
	public synchronized void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub32 local8 = new Class2_Sub32(arg1);
		local8.aLong241 = arg0;
		this.aClass249_41.method6523(local8);
	}

	@OriginalMember(owner = "client!os", name = "m", descriptor = "(B)V")
	private void method5730() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray52, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!lq;Z)V")
	public void method5731(@OriginalArg(0) Interface10 arg0) {
		if (this.anInterface10_5 != arg0) {
			if (this.aBoolean496) {
				OpenGL.glBindBufferARB(34962, arg0.method3586());
			}
			this.anInterface10_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!lh;)V")
	@Override
	public void method6059(@OriginalArg(0) Class58 arg0) {
		this.aClass58_Sub1_1 = (Class58_Sub1) arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass175_1.method4350(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class35 method6072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class35_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!os", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt6723 + this.anInt6722 + this.anInt6721;
	}

	@OriginalMember(owner = "client!os", name = "p", descriptor = "(I)V")
	private void method5732() {
		@Pc(15) int local15;
		if (this.aBoolean509) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local15 = this.anInt6750;
		} else {
			this.aFloat170 = (float) (this.anInt6745 - this.anInt6732) - this.aFloat164;
			this.aFloat155 = this.aFloat170 - (float) this.anInt6756 * this.aFloat166;
			if ((float) this.anInt6759 > this.aFloat155) {
				this.aFloat155 = this.anInt6759;
			}
			OpenGL.glFogf(2915, this.aFloat155);
			OpenGL.glFogf(2916, this.aFloat170);
			local15 = this.anInt6737;
		}
		Static269.aFloatArray34[0] = (float) (local15 & 0xFF0000) / 1.671168E7F;
		Static269.aFloatArray34[1] = (float) (local15 & 0xFF00) / 65280.0F;
		Static269.aFloatArray34[2] = (float) (local15 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static269.aFloatArray34, 0);
		if (this.aBoolean509) {
			this.aClass318_1.aClass93_Sub2_1.method2714();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI[BZI)Lclient!eea;")
	public Interface5 method5733(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		return (Interface5) (this.aBoolean496 && (!arg2 || this.aBoolean486) ? new Class84_Sub2(this, 5123, arg1, arg0, arg2) : new Class45_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!os", name = "h", descriptor = "()Z")
	@Override
	public boolean method6025() {
		if (this.aClass2_Sub1_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub1_Sub1_1.method251()) {
			if (!this.aClass175_1.method4348(this.aClass2_Sub1_Sub1_1)) {
				return false;
			}
			this.aClass77_1.method2234();
		}
		return true;
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(Z)V")
	public void method5734() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!os", name = "JA", descriptor = "(IIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean509) {
			throw new RuntimeException("");
		}
		this.anInt6750 = arg1;
		this.anInt6746 = arg3;
		this.anInt6738 = arg0;
		this.anInt6747 = arg2;
		this.aClass318_1.aClass93_Sub2_1.method2713();
		this.method5732();
	}

	@OriginalMember(owner = "client!os", name = "n", descriptor = "(B)V")
	private void method5735() {
		if (this.anInt6733 >= this.anInt6739 && this.anInt6724 >= this.anInt6748) {
			OpenGL.glScissor(this.anInt6739 + this.anInt6730, -this.anInt6724 + this.anInt6701 + this.anInt6727, this.anInt6733 - this.anInt6739, this.anInt6724 - this.anInt6748);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
	public void method5736(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean489 != arg0) {
			this.aBoolean489 = arg0;
			this.method5711();
			this.anInt6725 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ol;I)V")
	public void method5737(@OriginalArg(0) Class181_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method5494(), 0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!jaclib/memory/Buffer;IIZ)Lclient!lq;")
	public Interface10 method5738(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1, @OriginalArg(2) int arg2) {
		return (Interface10) (this.aBoolean496 ? new Class84_Sub1(this, arg0, arg1, arg2, false) : new Class45_Sub1(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!os", name = "q", descriptor = "(I)V")
	private void method5739() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL1.b()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static379.method5233(1000L);
		}
	}

	@OriginalMember(owner = "client!os", name = "y", descriptor = "()Z")
	@Override
	public boolean method6066() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "e", descriptor = "(I)Lclient!u;")
	@Override
	public Class2_Sub4 method6033(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub4_Sub2 local8 = new Class2_Sub4_Sub2(arg0);
		this.aClass249_39.method6523(local8);
		return local8;
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "()Z")
	@Override
	public boolean method6024() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "([I)V")
	@Override
	public void d(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6748;
		arg0[3] = this.anInt6724;
		arg0[0] = this.anInt6739;
		arg0[2] = this.anInt6733;
	}

	@OriginalMember(owner = "client!os", name = "ta", descriptor = "(II)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6759 && this.anInt6745 == arg1) {
			return;
		}
		this.anInt6745 = arg1;
		this.anInt6759 = arg0;
		this.method5707();
		this.method5732();
		if (this.anInt6731 == 3) {
			this.method5740();
			return;
		}
		if (this.anInt6731 != 2) {
			return;
		}
		this.method5730();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!bt;IIII)Lclient!r;")
	@Override
	public Class63 method6011(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "()Z")
	@Override
	public boolean method6026() {
		return this.aClass2_Sub1_Sub1_1 != null && (this.anInt6711 <= 1 || this.aBoolean492);
	}

	@OriginalMember(owner = "client!os", name = "r", descriptor = "(I)V")
	private void method5740() {
		@Pc(15) float local15 = (float) -this.anInt6734 * this.aFloat169 / (float) this.anInt6751;
		@Pc(27) float local27 = (float) -this.anInt6736 * this.aFloat169 / (float) this.anInt6726;
		@Pc(42) float local42 = this.aFloat169 * (float) (this.anInt6678 - this.anInt6734) / (float) this.anInt6751;
		@Pc(56) float local56 = (float) (this.anInt6701 - this.anInt6736) * this.aFloat169 / (float) this.anInt6726;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local56) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local56, (double) -local27, (double) ((float) this.anInt6759 - this.aFloat172), (double) ((float) this.anInt6745 - this.aFloat172));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!os", name = "CA", descriptor = "()I")
	@Override
	public int CA() {
		return this.anInt6745;
	}

	@OriginalMember(owner = "client!os", name = "o", descriptor = "(B)V")
	public void method5741() {
		if (this.anInt6731 != 0) {
			this.anInt6725 &= 0xFFFFFFE0;
			this.anInt6731 = 0;
		}
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(IIII)V")
	public void method5742(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(BI)V")
	public synchronized void method5743(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub32 local8 = new Class2_Sub32(arg0);
		this.aClass249_43.method6523(local8);
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IZ)V")
	public void method5744(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean488) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt6725 &= 0xFFFFFFE0;
		this.aBoolean488 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!gr;I)V")
	@Override
	public void method6046(@OriginalArg(0) Class63[] arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class6_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method7700(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(FFFIF)V")
	public void method5745(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static269.aFloatArray34[0] = arg0;
		Static269.aFloatArray34[2] = arg3;
		Static269.aFloatArray34[3] = arg2;
		Static269.aFloatArray34[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static269.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "()Z")
	@Override
	public boolean method6014() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(JI)V")
	public synchronized void method5748(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong241 = arg0;
		this.aClass249_46.method6523(local7);
	}

	@OriginalMember(owner = "client!os", name = "s", descriptor = "(I)V")
	private void method5749() {
		Static269.aFloatArray34[2] = this.aFloat167 * this.aFloat174;
		Static269.aFloatArray34[0] = this.aFloat173 * this.aFloat167;
		Static269.aFloatArray34[3] = 1.0F;
		Static269.aFloatArray34[1] = this.aFloat160 * this.aFloat167;
		OpenGL.glLightfv(16384, 4609, Static269.aFloatArray34, 0);
		Static269.aFloatArray34[2] = -this.aFloat168 * this.aFloat174;
		Static269.aFloatArray34[1] = this.aFloat160 * -this.aFloat168;
		Static269.aFloatArray34[3] = 1.0F;
		Static269.aFloatArray34[0] = this.aFloat173 * -this.aFloat168;
		OpenGL.glLightfv(16385, 4609, Static269.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	@Override
	public void method6010(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(IB)V")
	public void method5750(@OriginalArg(0) int arg0) {
		if (this.anInt6728 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6728 = arg0;
		}
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(II)V")
	public void method5751(@OriginalArg(1) int arg0) {
		Static269.aFloatArray34[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static269.aFloatArray34[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static269.aFloatArray34[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static269.aFloatArray34[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static269.aFloatArray34, 0);
	}

	@OriginalMember(owner = "client!os", name = "m", descriptor = "()Z")
	@Override
	public boolean method6036() {
		return true;
	}

	@OriginalMember(owner = "client!os", name = "UA", descriptor = "(IIIII)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5694();
		this.method5704(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!os", name = "E", descriptor = "(III)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6737 && arg1 == this.anInt6756 && arg2 == this.anInt6732) {
			return;
		}
		this.anInt6756 = arg1;
		this.anInt6737 = arg0;
		this.anInt6732 = arg2;
		if (!this.aBoolean509) {
			this.method5732();
			this.method5710();
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6069(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static75.aFloat26 = arg1;
		Static41.aFloat18 = arg0;
		Static423.aFloat208 = arg2;
	}

	@OriginalMember(owner = "client!os", name = "la", descriptor = "(FF)V")
	@Override
	public void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat156 == arg0 && this.aFloat172 == arg1) {
			return;
		}
		this.aFloat172 = arg1;
		this.aFloat156 = arg0;
		this.method5688();
		if (this.anInt6731 == 3) {
			this.method5740();
		} else if (this.anInt6731 == 2) {
			this.method5730();
			return;
		}
	}

	@OriginalMember(owner = "client!os", name = "A", descriptor = "()Z")
	@Override
	public boolean method6075() {
		return false;
	}

	@OriginalMember(owner = "client!os", name = "t", descriptor = "(I)V")
	private void method5752() {
		if (this.anInt6731 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6678 > 0 && this.anInt6701 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6678, (double) this.anInt6701, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6725 &= 0xFFFFFFE7;
		this.anInt6731 = 1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!ol;Z)V")
	public void method5753(@OriginalArg(0) Class181_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method5494(), 0);
	}

	@OriginalMember(owner = "client!os", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6701 - local12 - arg1, arg2, 1, 32993, this.anInt6735, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!af;Lclient!af;Lclient!af;ILclient!af;)V")
	public void method5754(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(4) Class11 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5731(arg0.anInterface10_1);
			OpenGL.glVertexPointer(arg0.aByte6, arg0.aShort10, this.anInterface10_5.method3588(), this.anInterface10_5.method3587() + (long) arg0.aByte5);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5731(arg3.anInterface10_1);
			OpenGL.glNormalPointer(arg3.aShort10, this.anInterface10_5.method3588(), this.anInterface10_5.method3587() + (long) arg3.aByte5);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5731(arg1.anInterface10_1);
			OpenGL.glColorPointer(arg1.aByte6, arg1.aShort10, this.anInterface10_5.method3588(), this.anInterface10_5.method3587() + (long) arg1.aByte5);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5731(arg2.anInterface10_1);
			OpenGL.glTexCoordPointer(arg2.aByte6, arg2.aShort10, this.anInterface10_5.method3588(), this.anInterface10_5.method3587() + (long) arg2.aByte5);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!eea;III)V")
	public void method5755(@OriginalArg(1) Interface5 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method6822();
		@Pc(14) int local14 = arg2 * this.method5691(local7);
		this.method5718(arg0);
		OpenGL.glDrawElements(4, arg1, local7, arg0.method6821() + (long) local14);
	}

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
	@Override
	public void method6074(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	public synchronized void method5756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class2_Sub32 local14 = new Class2_Sub32(arg1);
		local14.aLong241 = arg0;
		this.aClass249_44.method6523(local14);
	}

	@OriginalMember(owner = "client!os", name = "u", descriptor = "(I)V")
	private void method5757() {
		if (this.anInt6731 != 3) {
			this.anInt6731 = 3;
			this.method5740();
			this.method5720();
			this.anInt6725 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(III)V")
	public void method5758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6730 = arg1;
		this.anInt6727 = arg0;
		this.method5726();
		this.method5735();
	}

	@OriginalMember(owner = "client!os", name = "q", descriptor = "(B)V")
	private void method5759() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!os", name = "v", descriptor = "()V")
	@Override
	public void method6062() {
		if (!this.aBoolean487 || this.anInt6678 <= 0 || this.anInt6701 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt6739;
		@Pc(19) int local19 = this.anInt6733;
		@Pc(22) int local22 = this.anInt6748;
		@Pc(25) int local25 = this.anInt6724;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5741();
		this.method5695(false);
		this.method5736(false);
		this.method5744(false);
		this.method5708(false);
		this.method5719(null);
		this.method5686(-2);
		this.method5699(1);
		this.method5704(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6678, this.anInt6701, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
	public void method5760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6728 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (arg0 != this.anInt6743) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt6743 = arg0;
			local21 = true;
		}
		if (arg1 != this.anInt6740) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local21 = true;
			this.anInt6740 = arg1;
		}
		if (local21) {
			this.anInt6725 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class35 method6049(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class35_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[Lclient!at;)V")
	@Override
	public void method6063(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass2_Sub5Array5[local3] = arg1[local3];
		}
		this.anInt6760 = arg0;
		if (this.anInt6731 != 1) {
			this.method5679();
		}
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V")
	@Override
	public void method6027(@OriginalArg(0) int arg0) {
		this.method5759();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class209 method6017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static117.method2257(arg1, arg2, arg3, this, arg0);
	}

	@OriginalMember(owner = "client!os", name = "A", descriptor = "(IIIII)V")
	@Override
	protected void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt6739 || this.anInt6733 < arg0 - arg2 || this.anInt6748 > arg2 + arg1 || this.anInt6724 < arg1 - arg2) {
			return;
		}
		this.method5694();
		this.method5704(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(75) float local75 = (float) arg0 + 0.35F;
		@Pc(80) float local80 = (float) arg1 + 0.35F;
		@Pc(84) int local84 = arg2 << 1;
		if (this.aFloat163 > (float) local84) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local75 + 1.0F, local80 + 1.0F);
			OpenGL.glVertex2f(local75 + 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, -1.0F + local80);
			OpenGL.glVertex2f(local75 - 1.0F, local80 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat175 >= (float) local84) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local84);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local75, local80);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local75, local80);
			@Pc(139) int local139 = 262144 / (arg2 * 6);
			if (local139 <= 64) {
				local139 = 64;
			} else if (local139 > 512) {
				local139 = 512;
			}
			local139 = Static266.method4292(local139);
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			for (@Pc(166) int local166 = 16384 - local139; local166 > 0; local166 -= local139) {
				OpenGL.glVertex2f(local75 + (float) arg2 * Class96.aFloatArray16[local166], Class96.aFloatArray17[local166] * (float) arg2 + local80);
			}
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(II)I")
	@Override
	public int method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!os", name = "p", descriptor = "()V")
	@Override
	public void method6041() {
		this.aClass175_1.method4343();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!oaa;)V")
	@Override
	public void method6019(@OriginalArg(0) Class208 arg0) {
		this.aClass59_1.method1704(arg0, this);
	}
}
