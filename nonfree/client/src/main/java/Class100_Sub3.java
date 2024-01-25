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

@OriginalClass("client!qj")
public final class Class100_Sub3 extends Class100 {

	@OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
	private int anInt7490;

	@OriginalMember(owner = "client!qj", name = "ib", descriptor = "I")
	public int anInt7521;

	@OriginalMember(owner = "client!qj", name = "Tc", descriptor = "I")
	private int anInt7606;

	@OriginalMember(owner = "client!qj", name = "od", descriptor = "I")
	public int anInt7626;

	@OriginalMember(owner = "client!qj", name = "je", descriptor = "I")
	public int anInt7664;

	@OriginalMember(owner = "client!qj", name = "ne", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!qj", name = "pe", descriptor = "Lclient!jh;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!qj", name = "qe", descriptor = "Lclient!eca;")
	private Class39_Sub2 aClass39_Sub2_1;

	@OriginalMember(owner = "client!qj", name = "ve", descriptor = "Lclient!qk;")
	private Class271 aClass271_6;

	@OriginalMember(owner = "client!qj", name = "ze", descriptor = "Lclient!jh;")
	private Interface13 anInterface13_2;

	@OriginalMember(owner = "client!qj", name = "Ce", descriptor = "I")
	private int anInt7670;

	@OriginalMember(owner = "client!qj", name = "De", descriptor = "I")
	public int anInt7671;

	@OriginalMember(owner = "client!qj", name = "Ee", descriptor = "I")
	public int anInt7672;

	@OriginalMember(owner = "client!qj", name = "Fe", descriptor = "I")
	private int anInt7673;

	@OriginalMember(owner = "client!qj", name = "Me", descriptor = "I")
	private int anInt7674;

	@OriginalMember(owner = "client!qj", name = "Oe", descriptor = "I")
	private int anInt7675;

	@OriginalMember(owner = "client!qj", name = "Pe", descriptor = "Z")
	private boolean aBoolean579;

	@OriginalMember(owner = "client!qj", name = "Qe", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!qj", name = "Re", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!qj", name = "Se", descriptor = "I")
	private int anInt7676;

	@OriginalMember(owner = "client!qj", name = "Te", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!qj", name = "Ue", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!qj", name = "Ye", descriptor = "I")
	private int anInt7677;

	@OriginalMember(owner = "client!qj", name = "df", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_1;

	@OriginalMember(owner = "client!qj", name = "ef", descriptor = "Z")
	public boolean aBoolean583;

	@OriginalMember(owner = "client!qj", name = "ff", descriptor = "F")
	public float aFloat213;

	@OriginalMember(owner = "client!qj", name = "kf", descriptor = "I")
	private int anInt7681;

	@OriginalMember(owner = "client!qj", name = "mf", descriptor = "Lclient!gv;")
	public Class131 aClass131_8;

	@OriginalMember(owner = "client!qj", name = "of", descriptor = "Z")
	private boolean aBoolean585;

	@OriginalMember(owner = "client!qj", name = "sf", descriptor = "I")
	private int anInt7684;

	@OriginalMember(owner = "client!qj", name = "tf", descriptor = "Lclient!qk;")
	public Class271 aClass271_7;

	@OriginalMember(owner = "client!qj", name = "uf", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_2;

	@OriginalMember(owner = "client!qj", name = "xf", descriptor = "Z")
	public boolean aBoolean587;

	@OriginalMember(owner = "client!qj", name = "zf", descriptor = "Z")
	public boolean aBoolean588;

	@OriginalMember(owner = "client!qj", name = "Af", descriptor = "F")
	private float aFloat218;

	@OriginalMember(owner = "client!qj", name = "Bf", descriptor = "F")
	private float aFloat219;

	@OriginalMember(owner = "client!qj", name = "Cf", descriptor = "I")
	private int anInt7686;

	@OriginalMember(owner = "client!qj", name = "Df", descriptor = "Lclient!nl;")
	private Interface18 anInterface18_4;

	@OriginalMember(owner = "client!qj", name = "Ef", descriptor = "I")
	private int anInt7687;

	@OriginalMember(owner = "client!qj", name = "Ff", descriptor = "F")
	private float aFloat220;

	@OriginalMember(owner = "client!qj", name = "Gf", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_3;

	@OriginalMember(owner = "client!qj", name = "Hf", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!qj", name = "Kf", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!qj", name = "Lf", descriptor = "Z")
	public boolean aBoolean591;

	@OriginalMember(owner = "client!qj", name = "Nf", descriptor = "I")
	public int anInt7689;

	@OriginalMember(owner = "client!qj", name = "Of", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_4;

	@OriginalMember(owner = "client!qj", name = "Pf", descriptor = "F")
	public float aFloat222;

	@OriginalMember(owner = "client!qj", name = "Qf", descriptor = "I")
	public int anInt7690;

	@OriginalMember(owner = "client!qj", name = "Rf", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_5;

	@OriginalMember(owner = "client!qj", name = "Sf", descriptor = "I")
	private int anInt7691;

	@OriginalMember(owner = "client!qj", name = "Uf", descriptor = "Ljava/lang/String;")
	private String aString68;

	@OriginalMember(owner = "client!qj", name = "Vf", descriptor = "Z")
	private boolean aBoolean593;

	@OriginalMember(owner = "client!qj", name = "Wf", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_6;

	@OriginalMember(owner = "client!qj", name = "Xf", descriptor = "F")
	public float aFloat223;

	@OriginalMember(owner = "client!qj", name = "Yf", descriptor = "Lclient!pm;")
	public Class23_Sub1 aClass23_Sub1_5;

	@OriginalMember(owner = "client!qj", name = "dg", descriptor = "Z")
	private boolean aBoolean594;

	@OriginalMember(owner = "client!qj", name = "fg", descriptor = "Lclient!gv;")
	public Class131 aClass131_9;

	@OriginalMember(owner = "client!qj", name = "gg", descriptor = "Lclient!bm;")
	private Class37_Sub1 aClass37_Sub1_1;

	@OriginalMember(owner = "client!qj", name = "ig", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!qj", name = "jg", descriptor = "Lclient!ar;")
	private Class23_Sub1_Sub1 aClass23_Sub1_Sub1_5;

	@OriginalMember(owner = "client!qj", name = "lg", descriptor = "F")
	public float aFloat224;

	@OriginalMember(owner = "client!qj", name = "ng", descriptor = "F")
	public float aFloat225;

	@OriginalMember(owner = "client!qj", name = "og", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_7;

	@OriginalMember(owner = "client!qj", name = "pg", descriptor = "Z")
	public boolean aBoolean597;

	@OriginalMember(owner = "client!qj", name = "qg", descriptor = "[Lclient!rg;")
	private Class23[] aClass23Array1;

	@OriginalMember(owner = "client!qj", name = "tg", descriptor = "Z")
	private boolean aBoolean598;

	@OriginalMember(owner = "client!qj", name = "vg", descriptor = "Z")
	public boolean aBoolean599;

	@OriginalMember(owner = "client!qj", name = "xg", descriptor = "Z")
	private boolean aBoolean601;

	@OriginalMember(owner = "client!qj", name = "Dg", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_8;

	@OriginalMember(owner = "client!qj", name = "Eg", descriptor = "I")
	public int anInt7701;

	@OriginalMember(owner = "client!qj", name = "Fg", descriptor = "I")
	public int anInt7702;

	@OriginalMember(owner = "client!qj", name = "Ig", descriptor = "I")
	private int anInt7703;

	@OriginalMember(owner = "client!qj", name = "Jg", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_9;

	@OriginalMember(owner = "client!qj", name = "Kg", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!qj", name = "Mg", descriptor = "Z")
	private boolean aBoolean607;

	@OriginalMember(owner = "client!qj", name = "Og", descriptor = "Lclient!dw;")
	private Interface3 anInterface3_4;

	@OriginalMember(owner = "client!qj", name = "Pg", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!qj", name = "Qg", descriptor = "Lclient!nl;")
	private Interface18 anInterface18_5;

	@OriginalMember(owner = "client!qj", name = "Tg", descriptor = "Lclient!vaa;")
	public Class66_Sub3 aClass66_Sub3_10;

	@OriginalMember(owner = "client!qj", name = "bh", descriptor = "I")
	private int anInt7708;

	@OriginalMember(owner = "client!qj", name = "dh", descriptor = "F")
	public float aFloat231;

	@OriginalMember(owner = "client!qj", name = "eh", descriptor = "I")
	private int anInt7710;

	@OriginalMember(owner = "client!qj", name = "gh", descriptor = "I")
	private int anInt7711;

	@OriginalMember(owner = "client!qj", name = "Bb", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!qj", name = "Wd", descriptor = "I")
	public int anInt7655 = 128;

	@OriginalMember(owner = "client!qj", name = "Gd", descriptor = "Lclient!su;")
	private final Class310 aClass310_1 = new Class310();

	@OriginalMember(owner = "client!qj", name = "ge", descriptor = "Lclient!db;")
	private final Class68_Sub1 aClass68_Sub1_1 = new Class68_Sub1();

	@OriginalMember(owner = "client!qj", name = "he", descriptor = "Lclient!db;")
	public final Class68_Sub1 aClass68_Sub1_2 = new Class68_Sub1();

	@OriginalMember(owner = "client!qj", name = "le", descriptor = "I")
	public int anInt7665 = 3;

	@OriginalMember(owner = "client!qj", name = "me", descriptor = "I")
	public int anInt7666 = 8;

	@OriginalMember(owner = "client!qj", name = "oe", descriptor = "Z")
	private boolean aBoolean578 = false;

	@OriginalMember(owner = "client!qj", name = "ke", descriptor = "Lclient!ae;")
	private final Class8 aClass8_46 = new Class8();

	@OriginalMember(owner = "client!qj", name = "te", descriptor = "[Lclient!jh;")
	private final Interface13[] anInterface13Array1 = new Interface13[4];

	@OriginalMember(owner = "client!qj", name = "se", descriptor = "I")
	private int anInt7667 = -1;

	@OriginalMember(owner = "client!qj", name = "ue", descriptor = "I")
	private int anInt7668 = -1;

	@OriginalMember(owner = "client!qj", name = "we", descriptor = "[Lclient!jh;")
	private final Interface13[] anInterface13Array2 = new Interface13[4];

	@OriginalMember(owner = "client!qj", name = "xe", descriptor = "[Lclient!jh;")
	private final Interface13[] anInterface13Array3 = new Interface13[4];

	@OriginalMember(owner = "client!qj", name = "ye", descriptor = "I")
	private int anInt7669 = -1;

	@OriginalMember(owner = "client!qj", name = "re", descriptor = "Lclient!je;")
	private final Class171 aClass171_5 = new Class171();

	@OriginalMember(owner = "client!qj", name = "Ae", descriptor = "Lclient!il;")
	private final Class162 aClass162_32 = new Class162(16);

	@OriginalMember(owner = "client!qj", name = "Be", descriptor = "Lclient!ae;")
	private final Class8 aClass8_47 = new Class8();

	@OriginalMember(owner = "client!qj", name = "Ge", descriptor = "Lclient!ae;")
	private final Class8 aClass8_48 = new Class8();

	@OriginalMember(owner = "client!qj", name = "He", descriptor = "Lclient!ae;")
	private final Class8 aClass8_49 = new Class8();

	@OriginalMember(owner = "client!qj", name = "Ie", descriptor = "Lclient!ae;")
	private final Class8 aClass8_50 = new Class8();

	@OriginalMember(owner = "client!qj", name = "Je", descriptor = "Lclient!ae;")
	private final Class8 aClass8_51 = new Class8();

	@OriginalMember(owner = "client!qj", name = "Ke", descriptor = "Lclient!ae;")
	private final Class8 aClass8_52 = new Class8();

	@OriginalMember(owner = "client!qj", name = "Le", descriptor = "Lclient!ae;")
	private final Class8 aClass8_53 = new Class8();

	@OriginalMember(owner = "client!qj", name = "Ne", descriptor = "Lclient!db;")
	public final Class68_Sub1 aClass68_Sub1_3 = new Class68_Sub1();

	@OriginalMember(owner = "client!qj", name = "Ve", descriptor = "Lclient!db;")
	public final Class68_Sub1 aClass68_Sub1_4 = new Class68_Sub1();

	@OriginalMember(owner = "client!qj", name = "We", descriptor = "Lclient!db;")
	public final Class68_Sub1 aClass68_Sub1_5 = new Class68_Sub1();

	@OriginalMember(owner = "client!qj", name = "nf", descriptor = "I")
	public int anInt7682 = -1;

	@OriginalMember(owner = "client!qj", name = "af", descriptor = "F")
	public float aFloat212 = 3584.0F;

	@OriginalMember(owner = "client!qj", name = "lf", descriptor = "F")
	public float aFloat214 = -1.0F;

	@OriginalMember(owner = "client!qj", name = "bf", descriptor = "I")
	public int bf = -1;

	@OriginalMember(owner = "client!qj", name = "yf", descriptor = "I")
	public int anInt7685 = 0;

	@OriginalMember(owner = "client!qj", name = "Tf", descriptor = "I")
	private int anInt7692 = 0;

	@OriginalMember(owner = "client!qj", name = "Mf", descriptor = "Z")
	private boolean aBoolean592 = false;

	@OriginalMember(owner = "client!qj", name = "rf", descriptor = "F")
	private float aFloat216 = 1.0F;

	@OriginalMember(owner = "client!qj", name = "qf", descriptor = "I")
	private int anInt7683 = 0;

	@OriginalMember(owner = "client!qj", name = "hg", descriptor = "I")
	private int anInt7696 = -1;

	@OriginalMember(owner = "client!qj", name = "If", descriptor = "F")
	public float aFloat221 = -1.0F;

	@OriginalMember(owner = "client!qj", name = "jf", descriptor = "[F")
	private final float[] aFloatArray59 = new float[4];

	@OriginalMember(owner = "client!qj", name = "Ze", descriptor = "I")
	private int anInt7678 = 3584;

	@OriginalMember(owner = "client!qj", name = "gf", descriptor = "I")
	private int anInt7680 = 0;

	@OriginalMember(owner = "client!qj", name = "pf", descriptor = "F")
	public float aFloat215 = 1.0F;

	@OriginalMember(owner = "client!qj", name = "rg", descriptor = "I")
	private int anInt7698 = 8448;

	@OriginalMember(owner = "client!qj", name = "cg", descriptor = "[F")
	private final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!qj", name = "cf", descriptor = "I")
	public int anInt7679 = 0;

	@OriginalMember(owner = "client!qj", name = "wf", descriptor = "F")
	public float aFloat217 = 1.0F;

	@OriginalMember(owner = "client!qj", name = "Jf", descriptor = "I")
	public int anInt7688 = 50;

	@OriginalMember(owner = "client!qj", name = "ug", descriptor = "F")
	private float aFloat226 = -1.0F;

	@OriginalMember(owner = "client!qj", name = "Ug", descriptor = "I")
	private int anInt7705 = 0;

	@OriginalMember(owner = "client!qj", name = "eg", descriptor = "I")
	public int anInt7695 = 512;

	@OriginalMember(owner = "client!qj", name = "Lg", descriptor = "[F")
	private final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!qj", name = "Xe", descriptor = "F")
	private float aFloat211 = 0.0F;

	@OriginalMember(owner = "client!qj", name = "bg", descriptor = "I")
	public int anInt7694 = 512;

	@OriginalMember(owner = "client!qj", name = "Vg", descriptor = "F")
	private float aFloat229 = 1.0F;

	@OriginalMember(owner = "client!qj", name = "ag", descriptor = "I")
	public int anInt7693 = 0;

	@OriginalMember(owner = "client!qj", name = "Gg", descriptor = "F")
	public float aFloat227 = 3584.0F;

	@OriginalMember(owner = "client!qj", name = "Hg", descriptor = "F")
	private float aFloat228 = -1.0F;

	@OriginalMember(owner = "client!qj", name = "Yg", descriptor = "Z")
	private boolean aBoolean608 = true;

	@OriginalMember(owner = "client!qj", name = "sg", descriptor = "I")
	public int anInt7699 = -1;

	@OriginalMember(owner = "client!qj", name = "Xg", descriptor = "F")
	public float aFloat230 = 1.0F;

	@OriginalMember(owner = "client!qj", name = "Sg", descriptor = "I")
	private int anInt7704 = 8448;

	@OriginalMember(owner = "client!qj", name = "Rg", descriptor = "[Lclient!gga;")
	private final Class2_Sub14[] aClass2_Sub14Array4 = new Class2_Sub14[Static389.anInt6836];

	@OriginalMember(owner = "client!qj", name = "kg", descriptor = "I")
	public int anInt7697 = 0;

	@OriginalMember(owner = "client!qj", name = "yg", descriptor = "I")
	private int anInt7700 = 0;

	@OriginalMember(owner = "client!qj", name = "Ng", descriptor = "[F")
	public final float[] aFloatArray62 = new float[4];

	@OriginalMember(owner = "client!qj", name = "ah", descriptor = "I")
	public int anInt7707 = -1;

	@OriginalMember(owner = "client!qj", name = "ch", descriptor = "I")
	private int anInt7709 = 0;

	@OriginalMember(owner = "client!qj", name = "Wg", descriptor = "[F")
	private final float[] aFloatArray63 = new float[4];

	@OriginalMember(owner = "client!qj", name = "Zf", descriptor = "Lclient!fw;")
	public Class2_Sub15_Sub1 aClass2_Sub15_Sub1_2 = new Class2_Sub15_Sub1(8192);

	@OriginalMember(owner = "client!qj", name = "fh", descriptor = "[B")
	public final byte[] aByteArray74 = new byte[16384];

	@OriginalMember(owner = "client!qj", name = "hh", descriptor = "[I")
	public int[] anIntArray511 = new int[1];

	@OriginalMember(owner = "client!qj", name = "ih", descriptor = "[I")
	public int[] anIntArray512 = new int[1];

	@OriginalMember(owner = "client!qj", name = "jh", descriptor = "[I")
	public int[] anIntArray513 = new int[1];

	@OriginalMember(owner = "client!qj", name = "Sc", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas11;

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas10;

	@OriginalMember(owner = "client!qj", name = "Ed", descriptor = "I")
	public final int anInt7641;

	@OriginalMember(owner = "client!qj", name = "ud", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!qj", name = "Lb", descriptor = "J")
	private final long aLong208;

	@OriginalMember(owner = "client!qj", name = "D", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!qj", name = "Zg", descriptor = "I")
	public final int anInt7706;

	@OriginalMember(owner = "client!qj", name = "zg", descriptor = "Z")
	public boolean aBoolean602;

	@OriginalMember(owner = "client!qj", name = "Bg", descriptor = "Z")
	public boolean aBoolean604;

	@OriginalMember(owner = "client!qj", name = "Cg", descriptor = "Z")
	private boolean aBoolean605;

	@OriginalMember(owner = "client!qj", name = "vf", descriptor = "Z")
	public boolean aBoolean586;

	@OriginalMember(owner = "client!qj", name = "mg", descriptor = "Z")
	private boolean aBoolean596;

	@OriginalMember(owner = "client!qj", name = "hf", descriptor = "Z")
	public boolean aBoolean584;

	@OriginalMember(owner = "client!qj", name = "wg", descriptor = "Z")
	public boolean aBoolean600;

	@OriginalMember(owner = "client!qj", name = "Ag", descriptor = "Z")
	private final boolean aBoolean603;

	@OriginalMember(owner = "client!qj", name = "Id", descriptor = "Lclient!taa;")
	private final Class312 aClass312_1;

	@OriginalMember(owner = "client!qj", name = "ie", descriptor = "Lclient!gk;")
	public final Class125 aClass125_1;

	@OriginalMember(owner = "client!qj", name = "Jd", descriptor = "Lclient!dk;")
	private final Class79 aClass79_1;

	@OriginalMember(owner = "client!qj", name = "Yd", descriptor = "Lclient!bf;")
	private Class2_Sub4_Sub1 aClass2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!qj", name = "Td", descriptor = "Lclient!kfa;")
	private final Class188 aClass188_1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class100_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface5 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.aCanvas10 = this.aCanvas11 = arg0;
		this.anInt7641 = arg2;
		if (!Static533.method7648("jaclib")) {
			throw new RuntimeException("");
		} else if (Static533.method7648("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong207 = this.aLong208 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt7641);
				if (this.aLong208 == 0L) {
					throw new RuntimeException("");
				}
				this.method6276();
				@Pc(341) int local341 = this.method6330();
				if (local341 != 0) {
					throw new RuntimeException("");
				}
				this.anInt7706 = this.aBoolean595 ? 33639 : 5121;
				if (this.aString68.indexOf("radeon") != -1) {
					@Pc(364) int local364 = 0;
					@Pc(366) boolean local366 = false;
					@Pc(368) boolean local368 = false;
					@Pc(377) String[] local377 = Static568.method7710(this.aString68.replace('/', ' '), ' ');
					for (@Pc(379) int local379 = 0; local379 < local377.length; local379++) {
						@Pc(385) String local385 = local377[local379];
						try {
							if (local385.length() > 0) {
								if (local385.charAt(0) == 'x' && local385.length() >= 3 && Static271.method4107(local385.substring(1, 3))) {
									local385 = local385.substring(1);
									local368 = true;
								}
								if (local385.equals("hd")) {
									local366 = true;
								} else {
									if (local385.startsWith("hd")) {
										local366 = true;
										local385 = local385.substring(2);
									}
									if (local385.length() >= 4 && Static271.method4107(local385.substring(0, 4))) {
										local364 = Static158.method2594(local385.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(452) Exception local452) {
						}
					}
					if (!local366 || local364 < 4000) {
						this.aBoolean602 = false;
					}
					if (!local368 && !local366) {
						if (local364 >= 7000 && local364 <= 9250) {
							this.aBoolean604 = false;
						}
						if (local364 >= 7000 && local364 <= 7999) {
							this.aBoolean605 = false;
						}
					}
					this.aBoolean586 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean596 = this.aBoolean605;
					this.aBoolean584 = true;
				}
				if (this.aString69.indexOf("intel") != -1) {
					this.aBoolean600 = false;
				}
				this.aBoolean603 = !this.aString69.equals("s3 graphics");
				if (this.aBoolean605) {
					try {
						@Pc(535) int[] local535 = new int[1];
						OpenGL.glGenBuffersARB(1, local535, 0);
					} catch (@Pc(541) Throwable local541) {
						throw new RuntimeException("");
					}
				}
				Static165.method2887(false, true);
				this.aBoolean578 = true;
				this.aClass312_1 = new Class312(this, super.anInterface5_10);
				this.method6310();
				this.aClass125_1 = new Class125(this);
				this.aClass79_1 = new Class79(this);
				if (this.aClass79_1.method1479()) {
					this.aClass2_Sub4_Sub1_1 = new Class2_Sub4_Sub1(this);
					if (!this.aClass2_Sub4_Sub1_1.method623()) {
						this.aClass2_Sub4_Sub1_1.method614();
						this.aClass2_Sub4_Sub1_1 = null;
					}
				}
				this.aClass188_1 = new Class188(this);
				this.method6320();
				this.method6315();
				this.method6231();
			} catch (@Pc(615) Throwable local615) {
				local615.printStackTrace();
				this.method6250();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V")
	public synchronized void method6263(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong268 = arg0;
		this.aClass8_52.method212(local7);
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "(I)V")
	private void method6264() {
		if (this.anInt7687 != 3) {
			this.anInt7687 = 3;
			this.method6274();
			this.method6336();
			this.anInt7675 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6309();
		this.method6334(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(II)I")
	public int method6265(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass79_1.method1477(arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZZ)V")
	public void method6266(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		this.method6296(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!aga;Z)Lclient!f;")
	@Override
	public Class39 method6256(@OriginalArg(0) Class13 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt428 * arg0.anInt427];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray4 == null) {
			for (local21 = 0; local21 < arg0.anInt428; local21++) {
				for (local25 = 0; local25 < arg0.anInt427; local25++) {
					@Pc(83) int local83 = arg0.anIntArray32[arg0.aByteArray3[local14++] & 0xFF];
					local12[local16++] = local83 == 0 ? 0 : local83 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt428; local21++) {
				for (local25 = 0; local25 < arg0.anInt427; local25++) {
					local12[local16++] = arg0.aByteArray4[local14] << 24 | arg0.anIntArray32[arg0.aByteArray3[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(122) Class39 local122 = this.method6226(local12, arg0.anInt427, arg0.anInt427, arg0.anInt428);
		local122.Q(arg0.anInt429, arg0.anInt430, arg0.anInt426, arg0.anInt431);
		return local122;
	}

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "(I)V")
	public void method6267() {
		if (this.anInt7675 == 16) {
			return;
		}
		this.method6264();
		this.method6288(true);
		this.method6324(true);
		this.method6270(true);
		this.method6334(1);
		this.anInt7675 = 16;
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V")
	@Override
	public void method6244(@OriginalArg(0) int arg0) {
		this.method6276();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!jh;B)V")
	public void method6268(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt7669 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7669 >= 0) {
			this.anInterface13Array3[this.anInt7669].method6349();
		}
		this.anInterface13_2 = this.anInterface13Array3[++this.anInt7669] = arg0;
		this.anInterface13_2.method6348();
	}

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "()Lclient!oa;")
	@Override
	public Class237 method6247() {
		@Pc(7) int local7 = -1;
		if (this.aString69.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString69.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString69.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class237(local7, "OpenGL", this.anInt7686, this.aString68, 0L);
	}

	@OriginalMember(owner = "client!qj", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt7521) {
			arg3 = this.anInt7521;
		}
		if (arg2 > this.anInt7626) {
			arg2 = this.anInt7626;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt7705 = arg0;
		this.anInt7709 = arg3;
		this.anInt7683 = arg1;
		this.anInt7700 = arg2;
		OpenGL.glEnable(3089);
		this.method6297();
		this.method6271();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Lclient!jh;B)V")
	public void method6269(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt7668 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt7668 >= 0) {
			this.anInterface13Array1[this.anInt7668].method6347();
		}
		this.anInterface13_1 = this.anInterface13Array1[++this.anInt7668] = arg0;
		this.anInterface13_1.method6350();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ir;I)V")
	@Override
	public void method6257(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1) {
		this.aClass310_1.method6923(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "()Z")
	@Override
	public boolean method6186() {
		return this.aBoolean607 && (!this.method6248() || this.aBoolean593);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)V")
	public void method6270(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean582 != arg0) {
			this.aBoolean582 = arg0;
			this.method6326();
			this.anInt7675 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	private void method6271() {
		if (this.anInt7700 >= this.anInt7705 && this.anInt7683 <= this.anInt7709) {
			OpenGL.glScissor(this.anInt7705 + this.anInt7680, this.anInt7692 + this.anInt7521 + -this.anInt7709, this.anInt7700 - this.anInt7705, -this.anInt7683 + this.anInt7709);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6237(@OriginalArg(0) Class39 arg0) {
		this.aClass39_Sub2_1 = (Class39_Sub2) arg0;
		@Pc(65) Class2_Sub3 local65;
		if (this.aBoolean600) {
			if (this.aClass271_6 == null) {
				this.aClass271_6 = new Class271(this);
			}
			if (this.aClass271_6 == this.anInterface13_1) {
				throw new RuntimeException();
			}
			this.method6343(this.aClass271_6);
			@Pc(164) Class2_Sub3_Sub12 local164 = (Class2_Sub3_Sub12) this.aClass162_32.method3519((long) (this.aClass39_Sub2_1.E() << 16 | this.aClass39_Sub2_1.u()));
			if (local164 == null) {
				local164 = new Class2_Sub3_Sub12(this, 6402, this.aClass39_Sub2_1.E(), this.aClass39_Sub2_1.u());
				@Pc(197) Class2_Sub3_Sub12 local197;
				for (this.anInt7673 += local164.anInt6974; this.anInt7673 > 2097152; this.anInt7673 -= local197.anInt6974) {
					local65 = this.aClass171_5.method3794();
					if (local65 == null) {
						break;
					}
					local197 = (Class2_Sub3_Sub12) local65;
					local197.method7767();
					local197.method7966();
					local197.method5833();
				}
				this.aClass162_32.method3522(local164, (long) (this.aClass39_Sub2_1.E() << 16 | this.aClass39_Sub2_1.u()));
			}
			this.aClass171_5.method3792(local164);
			this.aClass271_6.method6358(8, local164);
			this.aClass271_6.method6361(this.aClass39_Sub2_1.aClass23_Sub1_Sub1_2, 0);
		} else if (this.aBoolean594) {
			@Pc(36) Class2_Sub3_Sub4 local36 = (Class2_Sub3_Sub4) this.aClass162_32.method3519((long) (this.aClass39_Sub2_1.E() << 16 | this.aClass39_Sub2_1.u()));
			if (local36 == null) {
				local36 = new Class2_Sub3_Sub4(this, this.aClass39_Sub2_1.E(), this.aClass39_Sub2_1.u());
				@Pc(72) Class2_Sub3_Sub4 local72;
				for (this.anInt7673 += local36.anInt2988 * 4; this.anInt7673 > 2097152; this.anInt7673 -= local72.anInt2988) {
					local65 = this.aClass171_5.method3794();
					if (local65 == null) {
						break;
					}
					local72 = (Class2_Sub3_Sub4) local65;
					local72.method7767();
					local72.method7966();
					this.anOpenGL2.releasePbuffer(local72.method2424());
				}
				this.aClass162_32.method3522(local36, (long) (this.aClass39_Sub2_1.E() << 16 | this.aClass39_Sub2_1.u()));
			}
			this.aClass171_5.method3792(local36);
			this.anOpenGL2.setPbuffer(local36.method2424());
		} else {
			throw new RuntimeException("");
		}
		this.anInt7626 = arg0.E();
		this.anInt7521 = arg0.u();
		this.method6333();
		this.method6313();
		this.JA();
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "(I)V")
	private void method6272() {
		if (this.aBoolean590) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean590 = false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "(I)V")
	private void method6273() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray61, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "()Z")
	@Override
	public boolean method6218() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt7521 - local12 - arg1, arg2, 1, 32993, this.anInt7706, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6220() {
		this.method6309();
		this.method6334(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "(I)V")
	private void method6274() {
		@Pc(15) float local15 = (float) -this.anInt7697 * this.aFloat229 / (float) this.anInt7694;
		@Pc(27) float local27 = this.aFloat229 * (float) -this.anInt7693 / (float) this.anInt7695;
		@Pc(41) float local41 = this.aFloat229 * (float) (this.anInt7626 - this.anInt7697) / (float) this.anInt7694;
		@Pc(56) float local56 = (float) (this.anInt7521 - this.anInt7693) * this.aFloat229 / (float) this.anInt7695;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local41 && local56 != local27) {
			OpenGL.glOrtho((double) local15, (double) local41, (double) -local56, (double) -local27, (double) this.anInt7688, (double) this.anInt7678);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
	private void method6275() {
		Static19.aFloatArray2[1] = this.aFloat223 * this.aFloat230;
		Static19.aFloatArray2[0] = this.aFloat217 * this.aFloat223;
		Static19.aFloatArray2[2] = this.aFloat223 * this.aFloat215;
		Static19.aFloatArray2[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static19.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!qj", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat223) {
			this.aFloat223 = arg0;
			this.method6275();
		}
	}

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "(I)V")
	private void method6276() {
		@Pc(13) int local13 = 0;
		while (!this.anOpenGL2.a()) {
			if (local13++ > 5) {
				throw new RuntimeException("");
			}
			Static459.method6498(1000L);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class67 method6195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class67_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!qj", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7705 < arg0) {
			this.anInt7705 = arg0;
		}
		if (this.anInt7709 > arg3) {
			this.anInt7709 = arg3;
		}
		if (arg1 > this.anInt7683) {
			this.anInt7683 = arg1;
		}
		if (this.anInt7700 > arg2) {
			this.anInt7700 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method6297();
		this.method6271();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method6277(@OriginalArg(0) Class23 arg0) {
		@Pc(11) Class23 local11 = this.aClass23Array1[this.anInt7691];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt9352);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt9352);
				} else if (arg0.anInt9352 != local11.anInt9352) {
					OpenGL.glDisable(local11.anInt9352);
					OpenGL.glEnable(arg0.anInt9352);
				}
				OpenGL.glBindTexture(arg0.anInt9352, arg0.method7776());
			}
			this.aClass23Array1[this.anInt7691] = arg0;
		}
		this.anInt7675 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!qj", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(61) float local61;
		@Pc(49) float local49;
		if (this.aClass23_Sub1_Sub1_5 == null || this.aClass23_Sub1_Sub1_5.anInt570 < arg2 || this.aClass23_Sub1_Sub1_5.anInt578 < arg3) {
			this.aClass23_Sub1_Sub1_5 = Static407.method5923(arg3, this, arg6, arg2);
			this.aClass23_Sub1_Sub1_5.method377(false, false);
			local49 = this.aClass23_Sub1_Sub1_5.aFloat16;
			local61 = this.aClass23_Sub1_Sub1_5.aFloat15;
		} else {
			this.aClass23_Sub1_Sub1_5.method371(6406, false, arg3, arg6, arg2);
			local49 = (float) arg2 * this.aClass23_Sub1_Sub1_5.aFloat16 / (float) this.aClass23_Sub1_Sub1_5.anInt570;
			local61 = this.aClass23_Sub1_Sub1_5.aFloat15 * (float) arg3 / (float) this.aClass23_Sub1_Sub1_5.anInt578;
		}
		this.method6339();
		this.method6277(this.aClass23_Sub1_Sub1_5);
		this.method6334(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method6289(arg5);
		this.method6300(34165, 34165);
		this.method6283(0, 768, 34166);
		this.method6283(2, 770, 5890);
		this.method6332(34166, 0);
		this.method6332(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		@Pc(164) float local164 = (float) arg3 + local154;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local49);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local61, local49);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local61, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method6283(0, 768, 5890);
		this.method6283(2, 770, 34166);
		this.method6332(5890, 0);
		this.method6332(34166, 2);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()V")
	@Override
	public void method6184() {
		if (this.aClass2_Sub4_Sub1_1 != null && this.aClass2_Sub4_Sub1_1.method619()) {
			this.aClass79_1.method1471(this.aClass2_Sub4_Sub1_1);
			this.aClass312_1.method6972();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6260(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static461.aFloat248 = arg1;
		Static42.aFloat23 = arg2;
		Static389.aFloat199 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "()Z")
	@Override
	public boolean method6230() {
		return this.aClass2_Sub4_Sub1_1 != null && (this.anInt7641 <= 1 || this.aBoolean593);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(IB)V")
	public void method6278(@OriginalArg(0) int arg0) {
		this.method6266(arg0, true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!jt;Lclient!jt;FLclient!jt;)Lclient!jt;")
	@Override
	public Class37 method6210(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class37 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean591 && this.aBoolean600) {
			@Pc(15) Class37_Sub1_Sub1 local15 = null;
			@Pc(18) Class37_Sub1 local18 = (Class37_Sub1) arg0;
			@Pc(21) Class37_Sub1 local21 = (Class37_Sub1) arg1;
			@Pc(25) Class23_Sub4 local25 = local18.method6514();
			@Pc(29) Class23_Sub4 local29 = local21.method6514();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt9361 > local29.anInt9361 ? local25.anInt9361 : local29.anInt9361;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class37_Sub1_Sub1) {
					@Pc(60) Class37_Sub1_Sub1 local60 = (Class37_Sub1_Sub1) arg3;
					if (local60.method1639() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class37_Sub1_Sub1(this, local48);
				}
				if (local15.method1640(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt7678;
	}

	@OriginalMember(owner = "client!qj", name = "A", descriptor = "()V")
	@Override
	protected void method6250() {
		for (@Pc(6) Class2 local6 = this.aClass8_46.method210(); local6 != null; local6 = this.aClass8_46.method218()) {
			((Class2_Sub13_Sub1) local6).method5493();
		}
		if (this.aClass79_1 != null) {
			this.aClass79_1.method1469();
		}
		if (this.anOpenGL2 != null) {
			this.method6287();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean578) {
			Static304.method4555(false, true);
			this.aBoolean578 = false;
		}
	}

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "(I)V")
	public void method6279() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray62, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray59, 0);
	}

	@OriginalMember(owner = "client!qj", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7699 = arg2;
		this.anInt7707 = arg1;
		this.anInt7685 = arg3;
		this.aBoolean589 = true;
		this.anInt7689 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	@Override
	public void method6229(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt7655 = arg0;
		this.aClass312_1.method6972();
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(II)I")
	public int method6280(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!qj", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt7682 && arg1 == this.bf && this.anInt7679 == arg2) {
			return;
		}
		this.anInt7682 = arg0;
		this.anInt7679 = arg2;
		this.bf = arg1;
		this.method6328();
		this.method6319();
	}

	@OriginalMember(owner = "client!qj", name = "C", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6258() {
		return new Class68_Sub1();
	}

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "(I)Lclient!waa;")
	public Class23_Sub4 method6282() {
		return this.aClass37_Sub1_1 == null ? null : this.aClass37_Sub1_1.method6514();
	}

	@OriginalMember(owner = "client!qj", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean608 = arg0;
		this.method6326();
	}

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt7710;
		this.anInt7710 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class39 method6236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class39_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6201(@OriginalArg(0) Canvas arg0) {
		this.aLong207 = 0L;
		this.aCanvas10 = null;
		if (arg0 == null || this.aCanvas11 == arg0) {
			this.aLong207 = this.aLong208;
			this.aCanvas10 = this.aCanvas11;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable7.get(arg0);
			this.aLong207 = local36;
			this.aCanvas10 = arg0;
		}
		if (this.aCanvas10 == null || this.aLong207 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong207);
		this.method6315();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6207(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas11 == arg0) {
			local5 = this.aLong208;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable7.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas10 == arg0) {
			this.method6315();
		}
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt7705 || arg0 - arg2 > this.anInt7700 || arg1 + arg2 < this.anInt7683 || arg1 - arg2 > this.anInt7709) {
			return;
		}
		this.method6309();
		this.method6334(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if (this.aFloat226 > (float) local81) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 - 1.0F);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local81 <= this.aFloat228) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local81);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local72, local77);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local72, local77);
			@Pc(136) int local136 = 262144 / (arg2 * 6);
			if (local136 <= 64) {
				local136 = 64;
			} else if (local136 > 512) {
				local136 = 512;
			}
			local136 = Static285.method5287(local136);
			OpenGL.glVertex2f((float) arg2 + local72, local77);
			for (@Pc(166) int local166 = 16384 - local136; local166 > 0; local166 -= local136) {
				OpenGL.glVertex2f(Class74.aFloatArray4[local166] * (float) arg2 + local72, local77 + (float) arg2 * Class74.aFloatArray3[local166]);
			}
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(IIII)V")
	public void method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "()V")
	@Override
	public void method6228() {
		if (this.aBoolean600) {
			if (this.aClass271_6 != this.anInterface13_1) {
				throw new RuntimeException();
			}
			this.aClass271_6.method6352(0);
			this.aClass271_6.method6352(8);
			this.method6298(this.aClass271_6);
		} else if (this.aBoolean594) {
			this.aClass39_Sub2_1.da(0, 0, this.anInt7626, this.anInt7521, 0, 0);
			this.anOpenGL2.setSurface(this.aLong207);
		} else {
			throw new RuntimeException("");
		}
		this.aClass39_Sub2_1 = null;
		this.anInt7626 = this.anInt7606;
		this.anInt7521 = this.anInt7490;
		this.method6333();
		this.method6313();
		this.JA();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFIF)V")
	private void method6284(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean590) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean590 = true;
	}

	@OriginalMember(owner = "client!qj", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass68_Sub1_3.aFloat44 + this.aClass68_Sub1_3.aFloat38 * (float) arg0 + (float) arg1 * this.aClass68_Sub1_3.aFloat33 + this.aClass68_Sub1_3.aFloat35;
		if ((float) this.anInt7688 > local28 || (float) this.anInt7678 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt7694 * (this.aClass68_Sub1_3.aFloat41 * (float) arg0 + this.aClass68_Sub1_3.aFloat42 * (float) arg1 + (float) arg2 * this.aClass68_Sub1_3.aFloat40 + this.aClass68_Sub1_3.aFloat43) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt7695 * (this.aClass68_Sub1_3.aFloat39 + (float) arg2 * this.aClass68_Sub1_3.aFloat34 + this.aClass68_Sub1_3.aFloat36 * (float) arg1 + (float) arg0 * this.aClass68_Sub1_3.aFloat37) / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat231);
		arg3[1] = (int) ((float) local117 - this.aFloat224);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I[Lclient!gga;)V")
	@Override
	public void method6188(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass2_Sub14Array4[local7] = arg1[local7];
		}
		this.anInt7684 = arg0;
		if (this.anInt7687 != 1) {
			this.method6311();
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V")
	private void method6285() {
		if (this.aBoolean601 && !this.aBoolean598) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qj", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method6309();
		this.method6334(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean607) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean607) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!jt;)V")
	@Override
	public void method6252(@OriginalArg(0) Class37 arg0) {
		this.aClass37_Sub1_1 = (Class37_Sub1) arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6223(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aNativeHeap6 = ((Class2_Sub13_Sub1) arg0).aNativeHeap4;
		if (this.anInterface18_5 != null) {
			return;
		}
		@Pc(16) Class2_Sub15_Sub1 local16 = new Class2_Sub15_Sub1(80);
		if (this.aBoolean595) {
			local16.method2575(-1.0F);
			local16.method2575(-1.0F);
			local16.method2575(0.0F);
			local16.method2575(0.0F);
			local16.method2575(1.0F);
			local16.method2575(1.0F);
			local16.method2575(-1.0F);
			local16.method2575(0.0F);
			local16.method2575(1.0F);
			local16.method2575(1.0F);
			local16.method2575(1.0F);
			local16.method2575(1.0F);
			local16.method2575(0.0F);
			local16.method2575(1.0F);
			local16.method2575(0.0F);
			local16.method2575(-1.0F);
			local16.method2575(1.0F);
			local16.method2575(0.0F);
			local16.method2575(0.0F);
			local16.method2575(0.0F);
		} else {
			local16.method2573(-1.0F);
			local16.method2573(-1.0F);
			local16.method2573(0.0F);
			local16.method2573(0.0F);
			local16.method2573(1.0F);
			local16.method2573(1.0F);
			local16.method2573(-1.0F);
			local16.method2573(0.0F);
			local16.method2573(1.0F);
			local16.method2573(1.0F);
			local16.method2573(1.0F);
			local16.method2573(1.0F);
			local16.method2573(0.0F);
			local16.method2573(1.0F);
			local16.method2573(0.0F);
			local16.method2573(-1.0F);
			local16.method2573(1.0F);
			local16.method2573(0.0F);
			local16.method2573(0.0F);
			local16.method2573(0.0F);
		}
		this.anInterface18_5 = this.method6341(local16.aByteArray62, local16.anInt5241, false, 20);
		this.aClass131_9 = new Class131(this.anInterface18_5, 5126, 3, 0);
		this.aClass131_8 = new Class131(this.anInterface18_5, 5126, 2, 12);
		this.aClass310_1.method6922(this);
	}

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "()Z")
	@Override
	public boolean method6246() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "()Z")
	@Override
	public boolean method6194() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "()Z")
	@Override
	public boolean method6196() {
		return false;
	}

	@OriginalMember(owner = "client!qj", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt7688;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IFF)V")
	public void method6286(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat211 = arg1;
		this.aFloat216 = arg0;
		this.method6328();
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "()Z")
	@Override
	public boolean method6187() {
		return this.aClass188_1.method4158();
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method6309();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method6334(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean607) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean607) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
	private void method6287() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZB)V")
	public void method6288(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean585 != arg0) {
			this.aBoolean585 = arg0;
			this.method6319();
			this.anInt7675 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean589) {
			throw new RuntimeException("");
		}
		this.anInt7685 = arg3;
		this.anInt7699 = arg2;
		this.anInt7689 = arg0;
		this.anInt7707 = arg1;
		if (this.aBoolean592) {
			this.aClass188_1.aClass101_Sub7_1.method7394();
			this.aClass188_1.aClass101_Sub7_1.method7397();
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt7670 + this.anInt7671 + this.anInt7672;
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(II)V")
	public void method6289(@OriginalArg(1) int arg0) {
		Static19.aFloatArray2[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static19.aFloatArray2[3] = (float) (arg0 >>> 24) / 255.0F;
		Static19.aFloatArray2[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static19.aFloatArray2[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static19.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "()V")
	@Override
	public void method6231() {
		if (!this.aBoolean603 || this.anInt7626 <= 0 || this.anInt7521 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt7705;
		@Pc(22) int local22 = this.anInt7700;
		@Pc(25) int local25 = this.anInt7683;
		@Pc(28) int local28 = this.anInt7709;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method6333();
		this.method6288(false);
		this.method6327(false);
		this.method6324(false);
		this.method6270(false);
		this.method6277(null);
		this.method6278(-2);
		this.method6322(1);
		this.method6334(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt7626, this.anInt7521, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "(I)V")
	private void method6290() {
		this.aFloatArray61[10] = this.aFloat220;
		this.aFloatArray61[14] = this.aFloat219;
		this.aFloat212 = ((float) -this.anInt7678 + this.aFloatArray61[14]) / this.aFloatArray61[10];
		this.aFloat227 = this.anInt7678;
	}

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "(I)V")
	public void method6291() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZILclient!jaclib/memory/Buffer;I)Lclient!nl;")
	public Interface18 method6292(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Buffer arg2) {
		return (Interface18) (this.aBoolean605 ? new Class43_Sub1(this, arg0, arg2, arg1, false) : new Class44_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(JI)V")
	public synchronized void method6293(@OriginalArg(0) long arg0) {
		@Pc(7) Class2 local7 = new Class2();
		local7.aLong268 = arg0;
		this.aClass8_53.method212(local7);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BF)V")
	public void method6294(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat229) {
			this.aFloat229 = arg0;
			if (this.anInt7687 == 3) {
				this.method6274();
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class20 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class20_Sub2 local6 = (Class20_Sub2) arg5;
		@Pc(9) Class23_Sub1_Sub1 local9 = local6.aClass23_Sub1_Sub1_3;
		this.method6339();
		this.method6277(local6.aClass23_Sub1_Sub1_3);
		this.method6334(1);
		this.method6300(7681, 8448);
		this.method6283(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat16 / (float) local9.anInt586;
		@Pc(46) float local46 = local9.aFloat15 / (float) local9.anInt583;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local60 * local60)));
		@Pc(77) float local77 = local60 * local73;
		@Pc(81) float local81 = local53 * local73;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local81 + 0.35F, local77 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method6283(0, 768, 5890);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIILclient!dw;I)V")
	public void method6295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface3 arg2) {
		@Pc(7) int local7 = arg2.method7925();
		@Pc(20) int local20 = arg1 * this.method6323(local7);
		this.method6335(arg2);
		OpenGL.glDrawElements(4, arg0, local7, (long) local20 + arg2.method7924());
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZZ)V")
	public void method6296(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt7708 != arg0 || this.aBoolean592 != this.aBoolean589) {
			@Pc(16) Class23_Sub1 local16 = null;
			@Pc(18) int local18 = 0;
			@Pc(20) byte local20 = 0;
			@Pc(22) int local22 = 0;
			@Pc(29) int local29 = this.aBoolean589 ? 3 : 0;
			if (arg0 < 0) {
				this.method6272();
			} else {
				local16 = this.aClass312_1.method6974(arg0);
				@Pc(51) Class343 local51 = super.anInterface5_10.method917(arg0);
				if (local51.aByte118 == 0 && local51.aByte114 == 0) {
					this.method6272();
				} else {
					@Pc(67) int local67 = local51.aBoolean700 ? 64 : 128;
					@Pc(71) int local71 = local67 * 50;
					this.method6284(0.0F, (float) (local51.aByte118 * (this.anInt7664 % local71)) / (float) local71, (float) (local51.aByte114 * (this.anInt7664 % local71)) / (float) local71);
				}
				local18 = local51.anInt9124;
				if (!this.aBoolean589) {
					local20 = local51.aByte120;
					local22 = local51.anInt9129;
					local29 = local51.aByte117;
				}
			}
			this.aClass188_1.method4159(arg2, arg1, local20, local22, local29);
			if (!this.aClass188_1.method4156(local16, local18)) {
				this.method6277(local16);
				this.method6322(local18);
			}
			this.anInt7708 = arg0;
			this.aBoolean592 = this.aBoolean589;
		}
		this.anInt7675 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "(I)V")
	private void method6297() {
		this.aFloat225 = this.anInt7700 - this.anInt7697;
		this.aFloat222 = this.anInt7709 - this.anInt7693;
		this.aFloat224 = this.anInt7683 - this.anInt7693;
		this.aFloat231 = this.anInt7705 - this.anInt7697;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!jh;)V")
	public void method6298(@OriginalArg(1) Interface13 arg0) {
		if (this.aBoolean587) {
			this.method6338(arg0);
			this.method6303(arg0);
		} else if (this.anInt7667 >= 0 && arg0 == this.anInterface13Array2[this.anInt7667]) {
			this.anInterface13Array2[this.anInt7667--] = null;
			arg0.method6346();
			if (this.anInt7667 < 0) {
				this.anInterface13_2 = this.anInterface13_1 = null;
			} else {
				this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array2[this.anInt7667];
				this.anInterface13_2.method6345();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "()Z")
	@Override
	public boolean method6219() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFFIF)V")
	public void method6299(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static19.aFloatArray2[3] = arg2;
		Static19.aFloatArray2[0] = arg1;
		Static19.aFloatArray2[2] = arg0;
		Static19.aFloatArray2[1] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static19.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
	public void method6300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7691 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(25) boolean local25 = false;
		if (this.anInt7704 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local25 = true;
			this.anInt7704 = arg0;
		}
		if (this.anInt7698 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt7698 = arg1;
			local25 = true;
		}
		if (local25) {
			this.anInt7675 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "()V")
	@Override
	public void method6203() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)I")
	@Override
	public int method6216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI[BZI)Lclient!dw;")
	public Interface3 method6301(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		return (Interface3) (this.aBoolean605 && (!arg2 || this.aBoolean596) ? new Class43_Sub2(this, 5123, arg1, arg0, arg2) : new Class44_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
	@Override
	public int method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6235() {
		return this.aClass68_Sub1_3;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!gv;BLclient!gv;Lclient!gv;Lclient!gv;)V")
	public void method6302(@OriginalArg(0) Class131 arg0, @OriginalArg(2) Class131 arg1, @OriginalArg(3) Class131 arg2, @OriginalArg(4) Class131 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method6317(arg0.anInterface18_3);
			OpenGL.glVertexPointer(arg0.aByte47, arg0.aShort36, this.anInterface18_4.method3531(), this.anInterface18_4.method3530() + (long) arg0.aByte46);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method6317(arg3.anInterface18_3);
			OpenGL.glNormalPointer(arg3.aShort36, this.anInterface18_4.method3531(), this.anInterface18_4.method3530() + (long) arg3.aByte46);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method6317(arg1.anInterface18_3);
			OpenGL.glColorPointer(arg1.aByte47, arg1.aShort36, this.anInterface18_4.method3531(), this.anInterface18_4.method3530() + (long) arg1.aByte46);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method6317(arg2.anInterface18_3);
			OpenGL.glTexCoordPointer(arg2.aByte47, arg2.aShort36, this.anInterface18_4.method3531(), this.anInterface18_4.method3530() + (long) arg2.aByte46);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([I)V")
	@Override
	public void method6211(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7521;
		arg0[0] = this.anInt7626;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6217(@OriginalArg(0) Class68 arg0) {
		this.aClass68_Sub1_3.M(arg0);
		this.aClass68_Sub1_4.M(this.aClass68_Sub1_3);
		this.aClass68_Sub1_4.method1267();
		this.aClass68_Sub1_5.method1271(this.aClass68_Sub1_4);
		if (this.anInt7687 != 1) {
			this.method6336();
		}
	}

	@OriginalMember(owner = "client!qj", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method6270(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "()Z")
	@Override
	public boolean method6208() {
		return false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method6309();
		this.method6334(arg5);
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
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local23 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qj", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7695 = arg3;
		this.anInt7697 = arg0;
		this.anInt7693 = arg1;
		this.anInt7694 = arg2;
		this.method6342();
		this.method6297();
		if (this.anInt7687 == 3) {
			this.method6274();
		} else if (this.anInt7687 == 2) {
			this.method6273();
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Lclient!e;")
	@Override
	public Class2_Sub13 method6234(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub13_Sub1 local8 = new Class2_Sub13_Sub1(arg0);
		this.aClass8_46.method212(local8);
		return local8;
	}

	@OriginalMember(owner = "client!qj", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt7696 != arg0;
		if (local15 || arg1 != this.aFloat214 || this.aFloat221 != arg2) {
			this.anInt7696 = arg0;
			this.aFloat214 = arg1;
			this.aFloat221 = arg2;
			if (local15) {
				this.aFloat230 = (float) (this.anInt7696 & 0xFF00) / 65280.0F;
				this.aFloat215 = (float) (this.anInt7696 & 0xFF) / 255.0F;
				this.aFloat217 = (float) (this.anInt7696 & 0xFF0000) / 1.671168E7F;
				this.method6275();
			}
			this.method6316();
		}
		if (this.aFloatArray60[0] == arg3 && arg4 == this.aFloatArray60[1] && arg5 == this.aFloatArray60[2]) {
			return;
		}
		this.aFloatArray60[1] = arg4;
		this.aFloatArray60[0] = arg3;
		this.aFloatArray60[2] = arg5;
		this.aFloatArray63[0] = -arg3;
		this.aFloatArray63[2] = -arg5;
		this.aFloatArray63[1] = -arg4;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray62[2] = local142 * arg5;
		this.aFloatArray62[1] = arg4 * local142;
		this.aFloatArray62[0] = arg3 * local142;
		this.aFloatArray59[1] = -this.aFloatArray62[1];
		this.aFloatArray59[2] = -this.aFloatArray62[2];
		this.aFloatArray59[0] = -this.aFloatArray62[0];
		this.method6279();
		this.anInt7701 = (int) (arg3 * 256.0F / arg4);
		this.anInt7702 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!jh;I)V")
	public void method6303(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt7668 < 0 || this.anInterface13Array1[this.anInt7668] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface13Array1[this.anInt7668--] = null;
		arg0.method6347();
		if (this.anInt7668 >= 0) {
			this.anInterface13_1 = this.anInterface13Array1[this.anInt7668];
			this.anInterface13_1.method6350();
		} else {
			this.anInterface13_1 = null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "(I)V")
	private void method6304() {
		if (this.anInt7687 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt7626 > 0 && this.anInt7521 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt7626, (double) this.anInt7521, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt7687 = 1;
		this.anInt7675 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "(I)V")
	public void method6305() {
		if (this.anInt7675 == 8) {
			return;
		}
		this.method6331();
		this.method6288(true);
		this.method6324(true);
		this.method6270(true);
		this.method6334(1);
		this.anInt7675 = 8;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
	@Override
	public void method6242(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "(B)V")
	public void method6306() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!qj", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt7705 = 0;
		this.anInt7700 = this.anInt7626;
		this.anInt7709 = this.anInt7521;
		this.anInt7683 = 0;
		OpenGL.glDisable(3089);
		this.method6297();
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
	@Override
	public void method6239(@OriginalArg(0) int arg0) {
		this.method6287();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)V")
	public synchronized void method6307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg1);
		local8.aLong268 = arg0;
		this.aClass8_48.method212(local8);
	}

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "()Lclient!q;")
	@Override
	public Class68 method6222() {
		return this.aClass68_Sub1_1;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(ZI)V")
	public synchronized void method6308(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		this.aClass8_50.method212(local8);
	}

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "(I)V")
	private void method6309() {
		if (this.anInt7675 == 1) {
			return;
		}
		this.method6304();
		this.method6288(false);
		this.method6327(false);
		this.method6324(false);
		this.method6270(false);
		this.method6277(null);
		this.method6278(-2);
		this.method6322(1);
		this.anInt7675 = 1;
	}

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "(I)V")
	private void method6310() {
		this.aClass23Array1 = new Class23[this.anInt7690];
		this.aClass23_Sub1_5 = new Class23_Sub1(this, 3553, 6408, 1, 1);
		new Class23_Sub1(this, 3553, 6408, 1, 1);
		new Class23_Sub1(this, 3553, 6408, 1, 1);
		this.aClass66_Sub3_8 = new Class66_Sub3(this);
		this.aClass66_Sub3_5 = new Class66_Sub3(this);
		this.aClass66_Sub3_4 = new Class66_Sub3(this);
		this.aClass66_Sub3_7 = new Class66_Sub3(this);
		this.aClass66_Sub3_1 = new Class66_Sub3(this);
		this.aClass66_Sub3_2 = new Class66_Sub3(this);
		this.aClass66_Sub3_9 = new Class66_Sub3(this);
		this.aClass66_Sub3_10 = new Class66_Sub3(this);
		this.aClass66_Sub3_3 = new Class66_Sub3(this);
		this.aClass66_Sub3_6 = new Class66_Sub3(this);
		if (this.aBoolean600) {
			this.aClass271_7 = new Class271(this);
			new Class271(this);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class39 method6226(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class39_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "(B)V")
	private void method6311() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt7684; local7++) {
			@Pc(22) Class2_Sub14 local22 = this.aClass2_Sub14Array4[local7];
			Static204.aFloatArray36[0] = local22.method7694();
			@Pc(33) int local33 = local7 + 16386;
			Static204.aFloatArray36[1] = local22.method7696();
			Static204.aFloatArray36[2] = local22.method7693();
			Static204.aFloatArray36[3] = 1.0F;
			OpenGL.glLightfv(local33, 4611, Static204.aFloatArray36, 0);
			@Pc(60) int local60 = local22.method7687();
			@Pc(66) float local66 = local22.method7689() / 255.0F;
			Static204.aFloatArray36[1] = (float) (local60 >> 8 & 0xFF) * local66;
			Static204.aFloatArray36[2] = local66 * (float) (local60 & 0xFF);
			Static204.aFloatArray36[0] = local66 * (float) (local60 >> 16 & 0xFF);
			OpenGL.glLightfv(local33, 4609, Static204.aFloatArray36, 0);
			OpenGL.glLightf(local33, 4617, 1.0F / (float) (local22.method7691() * local22.method7691()));
			OpenGL.glEnable(local33);
		}
		while (this.anInt7677 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt7677 = this.anInt7684;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "()I")
	@Override
	public int method6185() {
		return 4;
	}

	@OriginalMember(owner = "client!qj", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass68_Sub1_3.aFloat44 * (float) arg2 + (float) arg0 * this.aClass68_Sub1_3.aFloat38 + this.aClass68_Sub1_3.aFloat33 * (float) arg1 + this.aClass68_Sub1_3.aFloat35;
		if ((float) this.anInt7688 > local28 || local28 > (float) this.anInt7678) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass68_Sub1_3.aFloat43 + (float) arg1 * this.aClass68_Sub1_3.aFloat42 + this.aClass68_Sub1_3.aFloat41 * (float) arg0 + this.aClass68_Sub1_3.aFloat40 * (float) arg2) * (float) this.anInt7694 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt7695 * (this.aClass68_Sub1_3.aFloat36 * (float) arg1 + this.aClass68_Sub1_3.aFloat37 * (float) arg0 + this.aClass68_Sub1_3.aFloat34 * (float) arg2 + this.aClass68_Sub1_3.aFloat39) / local28);
		if (this.aFloat231 <= (float) local85 && (float) local85 <= this.aFloat225 && this.aFloat224 <= (float) local117 && this.aFloat222 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat224);
			arg3[0] = (int) ((float) local85 - this.aFloat231);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qj", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt7700;
		arg0[0] = this.anInt7705;
		arg0[3] = this.anInt7709;
		arg0[1] = this.anInt7683;
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(B)V")
	public void method6312() {
		if (this.anInt7675 == 4) {
			return;
		}
		this.method6304();
		this.method6288(false);
		this.method6327(false);
		this.method6324(false);
		this.method6270(false);
		this.method6278(-2);
		this.method6334(1);
		this.anInt7675 = 4;
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "(B)V")
	private void method6313() {
		OpenGL.glViewport(this.anInt7680, this.anInt7692, this.anInt7626, this.anInt7521);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!db;I)V")
	public void method6314(@OriginalArg(0) Class68_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method1265(), 0);
	}

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "(I)V")
	private void method6315() {
		if (this.aCanvas10 == null) {
			this.anInt7606 = this.anInt7490 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas10.getSize();
			this.anInt7606 = local14.width;
			this.anInt7490 = local14.height;
		}
		if (this.anInterface13_1 == null) {
			this.anInt7521 = this.anInt7490;
			this.anInt7626 = this.anInt7606;
			this.method6313();
		}
		this.method6333();
		this.JA();
	}

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "(I)V")
	private void method6316() {
		Static19.aFloatArray2[1] = this.aFloat230 * this.aFloat214;
		Static19.aFloatArray2[2] = this.aFloat215 * this.aFloat214;
		Static19.aFloatArray2[0] = this.aFloat214 * this.aFloat217;
		Static19.aFloatArray2[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static19.aFloatArray2, 0);
		Static19.aFloatArray2[3] = 1.0F;
		Static19.aFloatArray2[2] = -this.aFloat221 * this.aFloat215;
		Static19.aFloatArray2[0] = this.aFloat217 * -this.aFloat221;
		Static19.aFloatArray2[1] = -this.aFloat221 * this.aFloat230;
		OpenGL.glLightfv(16385, 4609, Static19.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!nl;)V")
	public void method6317(@OriginalArg(1) Interface18 arg0) {
		if (arg0 != this.anInterface18_4) {
			if (this.aBoolean605) {
				OpenGL.glBindBufferARB(34962, arg0.method3533());
			}
			this.anInterface18_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BII)V")
	public void method6318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7680 = arg1;
		this.anInt7692 = arg0;
		this.method6313();
		this.method6271();
	}

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "(I)V")
	private void method6319() {
		if (this.aBoolean585 && this.bf >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "(B)V")
	private void method6320() {
		this.method6278(-2);
		for (@Pc(14) int local14 = this.anInt7690 - 1; local14 >= 0; local14--) {
			this.method6344(local14);
			this.method6277(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method6300(8448, 8448);
		this.method6283(2, 770, 34168);
		this.method6272();
		this.anInt7674 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt7676 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean581 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean580 = true;
		this.method6288(true);
		this.method6327(true);
		this.method6324(true);
		this.method6270(true);
		this.method6333();
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
		@Pc(123) float[] local123 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(125) int local125 = 0; local125 < 8; local125++) {
			@Pc(131) int local131 = local125 + 16384;
			OpenGL.glLightfv(local131, 4608, local123, 0);
			OpenGL.glLightf(local131, 4615, 0.0F);
			OpenGL.glLightf(local131, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt7696 = this.anInt7682 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BIII)V")
	public void method6321(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!sa;[Lclient!aga;Z)Lclient!la;")
	@Override
	public Class29 method6225(@OriginalArg(0) Class294 arg0, @OriginalArg(1) Class13[] arg1) {
		return new Class29_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(ZI)V")
	public void method6322(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method6300(7681, 7681);
		} else if (arg0 == 0) {
			this.method6300(8448, 8448);
		} else if (arg0 == 2) {
			this.method6300(34165, 7681);
		} else if (arg0 == 3) {
			this.method6300(260, 8448);
		} else if (arg0 == 4) {
			this.method6300(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6251(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (!this.aHashtable7.containsKey(arg0)) {
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
			this.aHashtable7.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!qj", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean589 = false;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6205(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class2_Sub22 local19;
		while (!this.aClass8_48.method219()) {
			local19 = (Class2_Sub22) this.aClass8_48.method217();
			Static87.anIntArray97[local11++] = (int) local19.aLong268;
			this.anInt7671 -= local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static87.anIntArray97, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static87.anIntArray97, 0);
			local11 = 0;
		}
		while (!this.aClass8_49.method219()) {
			local19 = (Class2_Sub22) this.aClass8_49.method217();
			Static87.anIntArray97[local11++] = (int) local19.aLong268;
			this.anInt7672 -= local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static87.anIntArray97, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static87.anIntArray97, 0);
			local11 = 0;
		}
		while (!this.aClass8_50.method219()) {
			local19 = (Class2_Sub22) this.aClass8_50.method217();
			Static87.anIntArray97[local11++] = local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static87.anIntArray97, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static87.anIntArray97, 0);
			local11 = 0;
		}
		while (!this.aClass8_51.method219()) {
			local19 = (Class2_Sub22) this.aClass8_51.method217();
			Static87.anIntArray97[local11++] = (int) local19.aLong268;
			this.anInt7670 -= local19.anInt3866;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static87.anIntArray97, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static87.anIntArray97, 0);
		}
		while (!this.aClass8_47.method219()) {
			local19 = (Class2_Sub22) this.aClass8_47.method217();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3866);
		}
		@Pc(207) Class2 local207;
		while (!this.aClass8_52.method219()) {
			local207 = this.aClass8_52.method217();
			OpenGL.glDeleteProgramARB((int) local207.aLong268);
		}
		while (!this.aClass8_53.method219()) {
			local207 = this.aClass8_53.method217();
			OpenGL.glDeleteObjectARB(local207.aLong268);
		}
		while (!this.aClass8_47.method219()) {
			local19 = (Class2_Sub22) this.aClass8_47.method217();
			OpenGL.glDeleteLists((int) local19.aLong268, local19.anInt3866);
		}
		this.aClass312_1.method6971();
		if (this.b() > 100663296 && this.aLong209 + 60000L < Static548.method7437()) {
			System.gc();
			this.aLong209 = Static548.method7437();
		}
		this.anInt7664 = local9;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)I")
	public int method6323(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)V")
	public void method6324(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean579 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt7675 &= 0xFFFFFFE0;
		this.aBoolean579 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ir;)V")
	@Override
	public void method6193(@OriginalArg(0) Class164 arg0) {
		this.aClass310_1.method6923(arg0, this, -1);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(III)V")
	public synchronized void method6325(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		local8.aLong268 = arg1;
		this.aClass8_49.method212(local8);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	@Override
	public void method6199(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6202(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6238();
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "()Z")
	@Override
	public boolean method6206() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "()V")
	@Override
	public void method6245() {
	}

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "()Z")
	@Override
	public boolean method6197() {
		if (this.aClass2_Sub4_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass2_Sub4_Sub1_1.method619()) {
			if (!this.aClass79_1.method1470(this.aClass2_Sub4_Sub1_1)) {
				return false;
			}
			this.aClass312_1.method6972();
		}
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "(B)V")
	private void method6326() {
		OpenGL.glDepthMask(this.aBoolean582 && this.aBoolean608);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIF)Lclient!gga;")
	@Override
	public Class2_Sub14 method6209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class2_Sub14_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "()V")
	@Override
	public void method6238() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BZ)V")
	public void method6327(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean601) {
			this.aBoolean601 = arg0;
			this.method6285();
			this.anInt7675 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt7697, this.anInt7693, this.anInt7694, this.anInt7695 };
	}

	@OriginalMember(owner = "client!qj", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt7711;
		this.anInt7711 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6227(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
	private void method6328() {
		this.aFloat218 = (float) (this.anInt7678 - this.anInt7679) - this.aFloat211;
		this.aFloat213 = this.aFloat218 - (float) this.bf * this.aFloat216;
		if ((float) this.anInt7688 > this.aFloat213) {
			this.aFloat213 = this.anInt7688;
		}
		OpenGL.glFogf(2915, this.aFloat213);
		OpenGL.glFogf(2916, this.aFloat218);
		Static19.aFloatArray2[2] = (float) (this.anInt7682 & 0xFF) / 255.0F;
		Static19.aFloatArray2[1] = (float) (this.anInt7682 & 0xFF00) / 65280.0F;
		Static19.aFloatArray2[0] = (float) (this.anInt7682 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static19.aFloatArray2, 0);
	}

	@OriginalMember(owner = "client!qj", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class20_Sub2 local6 = (Class20_Sub2) arg1;
		@Pc(9) Class23_Sub1_Sub1 local9 = local6.aClass23_Sub1_Sub1_3;
		this.method6339();
		this.method6277(local6.aClass23_Sub1_Sub1_3);
		this.method6334(1);
		this.method6300(7681, 8448);
		this.method6283(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat16 / (float) local9.anInt586;
		@Pc(46) float local46 = local9.aFloat15 / (float) local9.anInt583;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7705 - arg2), local46 * (float) (this.anInt7683 - arg3));
		OpenGL.glVertex2i(this.anInt7705, this.anInt7683);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt7705 - arg2), (float) (this.anInt7709 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt7705, this.anInt7709);
		OpenGL.glTexCoord2f((float) (this.anInt7700 - arg2) * local39, local46 * (float) (this.anInt7709 - arg3));
		OpenGL.glVertex2i(this.anInt7700, this.anInt7709);
		OpenGL.glTexCoord2f((float) (this.anInt7700 - arg2) * local39, local46 * (float) (this.anInt7683 - arg3));
		OpenGL.glVertex2i(this.anInt7700, this.anInt7683);
		OpenGL.glEnd();
		this.method6283(0, 768, 5890);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Lclient!db;I)V")
	public void method6329(@OriginalArg(0) Class68_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method1265(), 0);
	}

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "()V")
	@Override
	public void method6198() {
		this.aClass79_1.method1476();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!eg;IIII)Lclient!da;")
	@Override
	public Class66 method6191(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class66_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qj", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method6309();
		this.method6334(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f((float) arg2 + local15, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "()Z")
	@Override
	public boolean method6254() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "A", descriptor = "(I)I")
	private int method6330() {
		@Pc(5) int local5 = 0;
		this.aString69 = OpenGL.glGetString(7936).toLowerCase();
		this.aString68 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString69.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString69.indexOf("brian paul") != -1 || this.aString69.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(46) String local46 = OpenGL.glGetString(7938);
		@Pc(56) String[] local56 = Static568.method7710(local46.replace('.', ' '), ' ');
		if (local56.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(76) int local76 = Static158.method2594(local56[0]);
				@Pc(82) int local82 = Static158.method2594(local56[1]);
				this.anInt7686 = local76 * 10 + local82;
			} catch (@Pc(92) NumberFormatException local92) {
				local5 |= 0x4;
			}
		}
		if (this.anInt7686 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(128) int[] local128 = new int[1];
		OpenGL.glGetIntegerv(34018, local128, 0);
		this.anInt7690 = local128[0];
		OpenGL.glGetIntegerv(34929, local128, 0);
		this.anInt7681 = local128[0];
		OpenGL.glGetIntegerv(34930, local128, 0);
		this.anInt7703 = local128[0];
		if (this.anInt7690 < 2 || this.anInt7681 < 2 || this.anInt7703 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean595 = Stream.a();
		this.aBoolean594 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean605 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean607 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean583 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean599 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean588 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean604 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean586 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean591 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean602 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean597 = false;
		this.aBoolean600 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean587 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean606 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean593 = this.aBoolean587 & this.aBoolean606;
		OpenGL.glGetFloatv(2834, Static19.aFloatArray2, 0);
		this.aFloat228 = Static19.aFloatArray2[1];
		this.aFloat226 = Static19.aFloatArray2[0];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "(B)V")
	private void method6331() {
		if (this.anInt7687 != 2) {
			this.anInt7687 = 2;
			this.method6273();
			this.method6336();
			this.anInt7675 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIZ)V")
	public void method6332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "(I)V")
	public void method6333() {
		if (this.anInt7687 != 0) {
			this.anInt7687 = 0;
			this.anInt7675 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6190(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(IIIIII)Lclient!jt;")
	@Override
	public Class37 method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean591 ? new Class37_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!qj", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method6334(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(BI)V")
	public void method6334(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt7674) {
			return;
		}
		@Pc(37) boolean local37;
		@Pc(33) byte local33;
		if (arg0 == 1) {
			local33 = 1;
			local37 = true;
		} else if (arg0 == 2) {
			local33 = 2;
			local37 = false;
		} else if (arg0 == 128) {
			local33 = 3;
			local37 = true;
		} else {
			local33 = 0;
			local37 = false;
		}
		if (!this.aBoolean580) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean580 = true;
		}
		if (this.aBoolean581 != local37) {
			if (local37) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean581 = local37;
		}
		if (local33 != this.anInt7676) {
			if (local33 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local33 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local33 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt7676 = local33;
		}
		this.anInt7674 = arg0;
		this.anInt7675 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class20 method6240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static134.method2296(arg0, arg1, this, arg3, arg2);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class39 method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class39_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "()Z")
	@Override
	public boolean method6248() {
		return this.aClass2_Sub4_Sub1_1 != null && this.aClass2_Sub4_Sub1_1.method619();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!dw;)V")
	public void method6335(@OriginalArg(1) Interface3 arg0) {
		if (arg0 != this.anInterface3_4) {
			if (this.aBoolean605) {
				OpenGL.glBindBufferARB(34963, arg0.method7926());
			}
			this.anInterface3_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "(I)V")
	@Override
	public void method6249(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "(B)V")
	private void method6336() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass68_Sub1_4.method1265(), 0);
		if (this.aBoolean592) {
			this.aClass188_1.aClass101_Sub7_1.method7394();
		}
		this.method6279();
		this.method6311();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIB)V")
	public synchronized void method6337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub22 local8 = new Class2_Sub22(arg0);
		local8.aLong268 = arg1;
		this.aClass8_51.method212(local8);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(Lclient!jh;B)V")
	public void method6338(@OriginalArg(0) Interface13 arg0) {
		if (this.anInt7669 < 0 || arg0 != this.anInterface13Array3[this.anInt7669]) {
			throw new RuntimeException();
		}
		this.anInterface13Array3[this.anInt7669--] = null;
		arg0.method6349();
		if (this.anInt7669 >= 0) {
			this.anInterface13_2 = this.anInterface13Array3[this.anInt7669];
			this.anInterface13_2.method6348();
		} else {
			this.anInterface13_2 = null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt7665 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt7665++;
		}
		this.anInt7666 = 0x1 << this.anInt7665;
	}

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "(B)V")
	public void method6339() {
		if (this.anInt7675 == 2) {
			return;
		}
		this.method6304();
		this.method6288(false);
		this.method6327(false);
		this.method6324(false);
		this.method6270(false);
		this.method6278(-2);
		this.anInt7675 = 2;
	}

	@OriginalMember(owner = "client!qj", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass68_Sub1_3.aFloat35 + (float) arg2 * this.aClass68_Sub1_3.aFloat44 + (float) arg1 * this.aClass68_Sub1_3.aFloat33 + this.aClass68_Sub1_3.aFloat38 * (float) arg0;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass68_Sub1_3.aFloat35 + (float) arg5 * this.aClass68_Sub1_3.aFloat44 + this.aClass68_Sub1_3.aFloat38 * (float) arg3 + this.aClass68_Sub1_3.aFloat33 * (float) arg4;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt7688 && local59 < (float) this.anInt7688 || !(!((float) this.anInt7678 < local28) || !((float) this.anInt7678 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt7694 * (this.aClass68_Sub1_3.aFloat43 + this.aClass68_Sub1_3.aFloat42 * (float) arg1 + (float) arg0 * this.aClass68_Sub1_3.aFloat41 + (float) arg2 * this.aClass68_Sub1_3.aFloat40) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt7694 * (this.aClass68_Sub1_3.aFloat43 + (float) arg3 * this.aClass68_Sub1_3.aFloat41 + this.aClass68_Sub1_3.aFloat42 * (float) arg4 + (float) arg5 * this.aClass68_Sub1_3.aFloat40) / local59);
		if ((float) local123 < this.aFloat231 && (float) local155 < this.aFloat231 || (float) local123 > this.aFloat225 && this.aFloat225 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt7695 * (this.aClass68_Sub1_3.aFloat37 * (float) arg0 + (float) arg1 * this.aClass68_Sub1_3.aFloat36 + (float) arg2 * this.aClass68_Sub1_3.aFloat34 + this.aClass68_Sub1_3.aFloat39) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt7695 * (this.aClass68_Sub1_3.aFloat39 + this.aClass68_Sub1_3.aFloat37 * (float) arg3 + (float) arg4 * this.aClass68_Sub1_3.aFloat36 + (float) arg5 * this.aClass68_Sub1_3.aFloat34) / local59);
			return (!(this.aFloat224 > (float) local213) || !(this.aFloat224 > (float) local245)) && (!(this.aFloat222 < (float) local213) || !(this.aFloat222 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!qj", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt7688 == arg0 && this.anInt7678 == arg1) {
			return;
		}
		this.anInt7688 = arg0;
		this.anInt7678 = arg1;
		this.method6342();
		this.method6328();
		if (this.anInt7687 == 3) {
			this.method6274();
		} else if (this.anInt7687 == 2) {
			this.method6273();
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(BZ)V")
	public void method6340(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean598) {
			this.aBoolean598 = arg0;
			this.method6285();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "([BIZII)Lclient!nl;")
	public Interface18 method6341(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		return (Interface18) (this.aBoolean605 && (!arg2 || this.aBoolean596) ? new Class43_Sub1(this, arg3, arg0, arg1, arg2) : new Class44_Sub1(this, arg3, arg0, arg1));
	}

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "(B)V")
	private void method6342() {
		@Pc(6) float[] local6 = this.aFloatArray61;
		@Pc(24) float local24 = (float) (this.anInt7688 * -this.anInt7697) / (float) this.anInt7694;
		@Pc(39) float local39 = (float) (this.anInt7688 * (this.anInt7626 - this.anInt7697)) / (float) this.anInt7694;
		@Pc(50) float local50 = (float) (this.anInt7693 * this.anInt7688) / (float) this.anInt7695;
		@Pc(65) float local65 = (float) (this.anInt7688 * (this.anInt7693 - this.anInt7521)) / (float) this.anInt7695;
		if (local24 == local39 || local65 == local50) {
			local6[9] = 0.0F;
			local6[3] = 0.0F;
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[2] = 0.0F;
			local6[12] = 0.0F;
			local6[5] = 1.0F;
			local6[10] = 1.0F;
			local6[0] = 1.0F;
			local6[8] = 0.0F;
			local6[14] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[11] = 0.0F;
			local6[15] = 1.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt7688 * 2.0F;
			local6[15] = 0.0F;
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
			local6[5] = local79 / (local50 - local65);
			local6[8] = (local24 + local39) / (-local24 + local39);
			local6[7] = 0.0F;
			local6[0] = local79 / (local39 - local24);
			local6[12] = 0.0F;
			local6[10] = this.aFloat220 = (float) -(this.anInt7688 + this.anInt7678) / (float) (this.anInt7678 - this.anInt7688);
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[2] = 0.0F;
			local6[9] = (local65 + local50) / (-local65 + local50);
			local6[11] = -1.0F;
			local6[14] = this.aFloat219 = -(local79 * (float) this.anInt7678) / (float) (this.anInt7678 - this.anInt7688);
		}
		this.method6290();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(ILclient!jh;)V")
	public void method6343(@OriginalArg(1) Interface13 arg0) {
		if (this.aBoolean587) {
			this.method6268(arg0);
			this.method6269(arg0);
		} else if (this.anInt7667 < 3) {
			if (this.anInt7667 >= 0) {
				this.anInterface13Array2[this.anInt7667].method6346();
			}
			this.anInterface13_2 = this.anInterface13_1 = this.anInterface13Array2[++this.anInt7667] = arg0;
			this.anInterface13_2.method6345();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "()Z")
	@Override
	public boolean method6192() {
		return true;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(IZ)V")
	public void method6344(@OriginalArg(0) int arg0) {
		if (this.anInt7691 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt7691 = arg0;
		}
	}
}
