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

@OriginalClass("client!wh")
public final class Class100_Sub3 extends Class100 {

	@OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
	public int anInt10422;

	@OriginalMember(owner = "client!wh", name = "yb", descriptor = "I")
	public int anInt10436;

	@OriginalMember(owner = "client!wh", name = "ic", descriptor = "I")
	private int anInt10472;

	@OriginalMember(owner = "client!wh", name = "vd", descriptor = "I")
	private int anInt10536;

	@OriginalMember(owner = "client!wh", name = "Be", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!wh", name = "Ce", descriptor = "I")
	public int anInt10585;

	@OriginalMember(owner = "client!wh", name = "Ke", descriptor = "Lclient!ko;")
	private Class32_Sub3 aClass32_Sub3_1;

	@OriginalMember(owner = "client!wh", name = "Le", descriptor = "Lclient!qk;")
	private Interface22 anInterface22_1;

	@OriginalMember(owner = "client!wh", name = "Ne", descriptor = "Lclient!iha;")
	private Class149 aClass149_6;

	@OriginalMember(owner = "client!wh", name = "Qe", descriptor = "Lclient!qk;")
	private Interface22 anInterface22_2;

	@OriginalMember(owner = "client!wh", name = "Re", descriptor = "I")
	public int anInt10591;

	@OriginalMember(owner = "client!wh", name = "Se", descriptor = "I")
	private int anInt10592;

	@OriginalMember(owner = "client!wh", name = "Ue", descriptor = "I")
	public int anInt10593;

	@OriginalMember(owner = "client!wh", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!wh", name = "cf", descriptor = "I")
	private int anInt10594;

	@OriginalMember(owner = "client!wh", name = "df", descriptor = "J")
	private long aLong275;

	@OriginalMember(owner = "client!wh", name = "ef", descriptor = "Z")
	private boolean aBoolean694;

	@OriginalMember(owner = "client!wh", name = "ff", descriptor = "I")
	private int anInt10595;

	@OriginalMember(owner = "client!wh", name = "gf", descriptor = "Z")
	private boolean aBoolean695;

	@OriginalMember(owner = "client!wh", name = "hf", descriptor = "Z")
	private boolean aBoolean696;

	@OriginalMember(owner = "client!wh", name = "jf", descriptor = "Z")
	private boolean aBoolean697;

	@OriginalMember(owner = "client!wh", name = "nf", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "client!wh", name = "of", descriptor = "Lclient!iba;")
	private Class3_Sub2_Sub1 aClass3_Sub2_Sub1_5;

	@OriginalMember(owner = "client!wh", name = "rf", descriptor = "Lclient!iha;")
	public Class149 aClass149_7;

	@OriginalMember(owner = "client!wh", name = "sf", descriptor = "Z")
	private boolean aBoolean699;

	@OriginalMember(owner = "client!wh", name = "tf", descriptor = "F")
	private float aFloat210;

	@OriginalMember(owner = "client!wh", name = "uf", descriptor = "I")
	private int anInt10596;

	@OriginalMember(owner = "client!wh", name = "vf", descriptor = "Z")
	public boolean aBoolean700;

	@OriginalMember(owner = "client!wh", name = "xf", descriptor = "Z")
	public boolean aBoolean701;

	@OriginalMember(owner = "client!wh", name = "yf", descriptor = "I")
	private int anInt10598;

	@OriginalMember(owner = "client!wh", name = "Df", descriptor = "Lclient!aw;")
	public Class3_Sub2 aClass3_Sub2_6;

	@OriginalMember(owner = "client!wh", name = "Ef", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_1;

	@OriginalMember(owner = "client!wh", name = "Ff", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_2;

	@OriginalMember(owner = "client!wh", name = "Hf", descriptor = "F")
	private float aFloat214;

	@OriginalMember(owner = "client!wh", name = "If", descriptor = "I")
	private int anInt10601;

	@OriginalMember(owner = "client!wh", name = "Jf", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_3;

	@OriginalMember(owner = "client!wh", name = "Lf", descriptor = "I")
	private int anInt10603;

	@OriginalMember(owner = "client!wh", name = "Nf", descriptor = "I")
	private int anInt10605;

	@OriginalMember(owner = "client!wh", name = "Of", descriptor = "I")
	public int anInt10606;

	@OriginalMember(owner = "client!wh", name = "Sf", descriptor = "Ljava/lang/String;")
	private String aString118;

	@OriginalMember(owner = "client!wh", name = "Tf", descriptor = "Z")
	public boolean aBoolean704;

	@OriginalMember(owner = "client!wh", name = "Vf", descriptor = "F")
	public float aFloat215;

	@OriginalMember(owner = "client!wh", name = "Xf", descriptor = "I")
	public int anInt10610;

	@OriginalMember(owner = "client!wh", name = "Zf", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_4;

	@OriginalMember(owner = "client!wh", name = "ag", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_5;

	@OriginalMember(owner = "client!wh", name = "bg", descriptor = "I")
	private int anInt10612;

	@OriginalMember(owner = "client!wh", name = "dg", descriptor = "Lclient!cl;")
	public Class55 aClass55_15;

	@OriginalMember(owner = "client!wh", name = "eg", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_6;

	@OriginalMember(owner = "client!wh", name = "gg", descriptor = "Lclient!wia;")
	private Interface27 anInterface27_6;

	@OriginalMember(owner = "client!wh", name = "hg", descriptor = "Z")
	public boolean aBoolean706;

	@OriginalMember(owner = "client!wh", name = "ig", descriptor = "F")
	public float aFloat216;

	@OriginalMember(owner = "client!wh", name = "kg", descriptor = "I")
	public int anInt10615;

	@OriginalMember(owner = "client!wh", name = "mg", descriptor = "Z")
	public boolean aBoolean707;

	@OriginalMember(owner = "client!wh", name = "og", descriptor = "F")
	private float aFloat218;

	@OriginalMember(owner = "client!wh", name = "qg", descriptor = "Z")
	public boolean aBoolean709;

	@OriginalMember(owner = "client!wh", name = "rg", descriptor = "F")
	public float aFloat219;

	@OriginalMember(owner = "client!wh", name = "ug", descriptor = "Lclient!nm;")
	private Class57_Sub1 aClass57_Sub1_1;

	@OriginalMember(owner = "client!wh", name = "yg", descriptor = "Z")
	private boolean aBoolean711;

	@OriginalMember(owner = "client!wh", name = "zg", descriptor = "[Lclient!me;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!wh", name = "Cg", descriptor = "Z")
	private boolean aBoolean712;

	@OriginalMember(owner = "client!wh", name = "Dg", descriptor = "Z")
	private boolean aBoolean713;

	@OriginalMember(owner = "client!wh", name = "Eg", descriptor = "Lclient!cl;")
	public Class55 aClass55_16;

	@OriginalMember(owner = "client!wh", name = "Fg", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!wh", name = "Kg", descriptor = "Lclient!gh;")
	private Interface10 anInterface10_5;

	@OriginalMember(owner = "client!wh", name = "Og", descriptor = "F")
	public float aFloat223;

	@OriginalMember(owner = "client!wh", name = "Pg", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_7;

	@OriginalMember(owner = "client!wh", name = "Qg", descriptor = "F")
	public float aFloat224;

	@OriginalMember(owner = "client!wh", name = "Sg", descriptor = "I")
	private int anInt10623;

	@OriginalMember(owner = "client!wh", name = "Tg", descriptor = "Z")
	private boolean aBoolean715;

	@OriginalMember(owner = "client!wh", name = "Ug", descriptor = "I")
	private int anInt10624;

	@OriginalMember(owner = "client!wh", name = "Vg", descriptor = "Lclient!wia;")
	private Interface27 anInterface27_7;

	@OriginalMember(owner = "client!wh", name = "Zg", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_8;

	@OriginalMember(owner = "client!wh", name = "ah", descriptor = "I")
	public int anInt10626;

	@OriginalMember(owner = "client!wh", name = "bh", descriptor = "Z")
	private boolean aBoolean716;

	@OriginalMember(owner = "client!wh", name = "eh", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!wh", name = "gh", descriptor = "Z")
	public boolean aBoolean719;

	@OriginalMember(owner = "client!wh", name = "hh", descriptor = "Z")
	public boolean aBoolean720;

	@OriginalMember(owner = "client!wh", name = "ih", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_9;

	@OriginalMember(owner = "client!wh", name = "jh", descriptor = "Lclient!as;")
	public Class24_Sub1 aClass24_Sub1_10;

	@OriginalMember(owner = "client!wh", name = "kh", descriptor = "Z")
	public boolean aBoolean721;

	@OriginalMember(owner = "client!wh", name = "oh", descriptor = "F")
	public float aFloat229;

	@OriginalMember(owner = "client!wh", name = "vh", descriptor = "I")
	private int anInt10630;

	@OriginalMember(owner = "client!wh", name = "xh", descriptor = "I")
	private int anInt10631;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!wh", name = "we", descriptor = "I")
	public int anInt10583 = 128;

	@OriginalMember(owner = "client!wh", name = "pe", descriptor = "Lclient!iaa;")
	private final Class144 aClass144_1 = new Class144();

	@OriginalMember(owner = "client!wh", name = "xe", descriptor = "Lclient!ou;")
	private final Class154_Sub3 aClass154_Sub3_1 = new Class154_Sub3();

	@OriginalMember(owner = "client!wh", name = "ze", descriptor = "Lclient!ou;")
	public final Class154_Sub3 aClass154_Sub3_2 = new Class154_Sub3();

	@OriginalMember(owner = "client!wh", name = "De", descriptor = "I")
	public int anInt10586 = 8;

	@OriginalMember(owner = "client!wh", name = "Ge", descriptor = "I")
	public int anInt10587 = 3;

	@OriginalMember(owner = "client!wh", name = "Fe", descriptor = "Z")
	private boolean aBoolean693 = false;

	@OriginalMember(owner = "client!wh", name = "Ae", descriptor = "Lclient!ada;")
	private final Class8 aClass8_67 = new Class8();

	@OriginalMember(owner = "client!wh", name = "Ie", descriptor = "[Lclient!qk;")
	private final Interface22[] anInterface22Array1 = new Interface22[4];

	@OriginalMember(owner = "client!wh", name = "Je", descriptor = "[Lclient!qk;")
	private final Interface22[] anInterface22Array2 = new Interface22[4];

	@OriginalMember(owner = "client!wh", name = "He", descriptor = "I")
	private int anInt10588 = -1;

	@OriginalMember(owner = "client!wh", name = "Pe", descriptor = "I")
	private int anInt10590 = -1;

	@OriginalMember(owner = "client!wh", name = "Oe", descriptor = "I")
	private int anInt10589 = -1;

	@OriginalMember(owner = "client!wh", name = "Me", descriptor = "[Lclient!qk;")
	private final Interface22[] anInterface22Array3 = new Interface22[4];

	@OriginalMember(owner = "client!wh", name = "Te", descriptor = "Lclient!ada;")
	private final Class8 aClass8_68;

	@OriginalMember(owner = "client!wh", name = "Ve", descriptor = "Lclient!ada;")
	private final Class8 aClass8_69;

	@OriginalMember(owner = "client!wh", name = "We", descriptor = "Lclient!ada;")
	private final Class8 aClass8_70;

	@OriginalMember(owner = "client!wh", name = "Xe", descriptor = "Lclient!ada;")
	private final Class8 aClass8_71;

	@OriginalMember(owner = "client!wh", name = "Ye", descriptor = "Lclient!ada;")
	private final Class8 aClass8_72;

	@OriginalMember(owner = "client!wh", name = "Ze", descriptor = "Lclient!ada;")
	private final Class8 aClass8_73;

	@OriginalMember(owner = "client!wh", name = "af", descriptor = "Lclient!ada;")
	private final Class8 aClass8_74;

	@OriginalMember(owner = "client!wh", name = "kf", descriptor = "Lclient!ou;")
	public final Class154_Sub3 aClass154_Sub3_3;

	@OriginalMember(owner = "client!wh", name = "lf", descriptor = "Lclient!ou;")
	public final Class154_Sub3 aClass154_Sub3_4;

	@OriginalMember(owner = "client!wh", name = "mf", descriptor = "Lclient!ou;")
	public final Class154_Sub3 aClass154_Sub3_5;

	@OriginalMember(owner = "client!wh", name = "wf", descriptor = "I")
	public int anInt10597;

	@OriginalMember(owner = "client!wh", name = "zf", descriptor = "I")
	private int anInt10599;

	@OriginalMember(owner = "client!wh", name = "Cf", descriptor = "I")
	private int anInt10600;

	@OriginalMember(owner = "client!wh", name = "Bf", descriptor = "F")
	public float aFloat212;

	@OriginalMember(owner = "client!wh", name = "ng", descriptor = "I")
	public int anInt10616;

	@OriginalMember(owner = "client!wh", name = "Yf", descriptor = "I")
	public int anInt10611;

	@OriginalMember(owner = "client!wh", name = "Uf", descriptor = "I")
	private int anInt10608;

	@OriginalMember(owner = "client!wh", name = "sg", descriptor = "F")
	private float aFloat220;

	@OriginalMember(owner = "client!wh", name = "fg", descriptor = "I")
	public int anInt10613;

	@OriginalMember(owner = "client!wh", name = "pg", descriptor = "Z")
	private boolean aBoolean708;

	@OriginalMember(owner = "client!wh", name = "Qf", descriptor = "I")
	public int anInt10607;

	@OriginalMember(owner = "client!wh", name = "jg", descriptor = "I")
	public int anInt10614;

	@OriginalMember(owner = "client!wh", name = "tg", descriptor = "I")
	private int anInt10617;

	@OriginalMember(owner = "client!wh", name = "Ag", descriptor = "I")
	public int anInt10619;

	@OriginalMember(owner = "client!wh", name = "Kf", descriptor = "I")
	public int anInt10602;

	@OriginalMember(owner = "client!wh", name = "Gg", descriptor = "[F")
	private final float[] aFloatArray81;

	@OriginalMember(owner = "client!wh", name = "Lg", descriptor = "F")
	public float aFloat222;

	@OriginalMember(owner = "client!wh", name = "qf", descriptor = "[F")
	private final float[] aFloatArray79;

	@OriginalMember(owner = "client!wh", name = "Wg", descriptor = "F")
	private float aFloat226;

	@OriginalMember(owner = "client!wh", name = "Bg", descriptor = "[F")
	public final float[] aFloatArray80;

	@OriginalMember(owner = "client!wh", name = "Wf", descriptor = "I")
	private int anInt10609;

	@OriginalMember(owner = "client!wh", name = "Mf", descriptor = "I")
	private int anInt10604;

	@OriginalMember(owner = "client!wh", name = "dh", descriptor = "F")
	public float aFloat228;

	@OriginalMember(owner = "client!wh", name = "Xg", descriptor = "F")
	private float aFloat227;

	@OriginalMember(owner = "client!wh", name = "Yg", descriptor = "I")
	private int anInt10625;

	@OriginalMember(owner = "client!wh", name = "Af", descriptor = "F")
	private float aFloat211;

	@OriginalMember(owner = "client!wh", name = "Gf", descriptor = "F")
	public float aFloat213;

	@OriginalMember(owner = "client!wh", name = "mh", descriptor = "I")
	public int anInt10628;

	@OriginalMember(owner = "client!wh", name = "Ng", descriptor = "I")
	private int anInt10622;

	@OriginalMember(owner = "client!wh", name = "ch", descriptor = "I")
	private int anInt10627;

	@OriginalMember(owner = "client!wh", name = "Jg", descriptor = "F")
	public float aFloat221;

	@OriginalMember(owner = "client!wh", name = "vg", descriptor = "[Lclient!raa;")
	private final Class6_Sub1[] aClass6_Sub1Array6;

	@OriginalMember(owner = "client!wh", name = "Hg", descriptor = "[F")
	private final float[] aFloatArray82;

	@OriginalMember(owner = "client!wh", name = "Rf", descriptor = "Z")
	private boolean aBoolean703;

	@OriginalMember(owner = "client!wh", name = "lg", descriptor = "F")
	public float aFloat217;

	@OriginalMember(owner = "client!wh", name = "qh", descriptor = "F")
	private float aFloat230;

	@OriginalMember(owner = "client!wh", name = "Mg", descriptor = "I")
	public int anInt10621;

	@OriginalMember(owner = "client!wh", name = "Rg", descriptor = "F")
	public float aFloat225;

	@OriginalMember(owner = "client!wh", name = "sh", descriptor = "I")
	public int anInt10629;

	@OriginalMember(owner = "client!wh", name = "Ig", descriptor = "I")
	private int anInt10620;

	@OriginalMember(owner = "client!wh", name = "rh", descriptor = "[F")
	private final float[] aFloatArray83;

	@OriginalMember(owner = "client!wh", name = "th", descriptor = "Lclient!sea;")
	public Class6_Sub40_Sub1 aClass6_Sub40_Sub1_3;

	@OriginalMember(owner = "client!wh", name = "uh", descriptor = "[I")
	public int[] anIntArray639;

	@OriginalMember(owner = "client!wh", name = "yh", descriptor = "[B")
	public final byte[] aByteArray123;

	@OriginalMember(owner = "client!wh", name = "wh", descriptor = "[I")
	public int[] anIntArray640;

	@OriginalMember(owner = "client!wh", name = "zh", descriptor = "[I")
	public int[] anIntArray641;

	@OriginalMember(owner = "client!wh", name = "te", descriptor = "I")
	public final int anInt10580;

	@OriginalMember(owner = "client!wh", name = "Xd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas13;

	@OriginalMember(owner = "client!wh", name = "wb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!wh", name = "pd", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!wh", name = "bb", descriptor = "J")
	private final long aLong274;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "J")
	private long aLong273;

	@OriginalMember(owner = "client!wh", name = "xg", descriptor = "I")
	public final int anInt10618;

	@OriginalMember(owner = "client!wh", name = "ph", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "client!wh", name = "lh", descriptor = "Z")
	public boolean aBoolean722;

	@OriginalMember(owner = "client!wh", name = "nh", descriptor = "Z")
	public boolean aBoolean723;

	@OriginalMember(owner = "client!wh", name = "wg", descriptor = "Z")
	public boolean aBoolean710;

	@OriginalMember(owner = "client!wh", name = "cg", descriptor = "Z")
	public boolean aBoolean705;

	@OriginalMember(owner = "client!wh", name = "fh", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!wh", name = "pf", descriptor = "Z")
	public boolean aBoolean698;

	@OriginalMember(owner = "client!wh", name = "Pf", descriptor = "Z")
	private final boolean aBoolean702;

	@OriginalMember(owner = "client!wh", name = "le", descriptor = "Lclient!br;")
	private final Class42 aClass42_1;

	@OriginalMember(owner = "client!wh", name = "Ee", descriptor = "Lclient!dja;")
	public final Class66 aClass66_1;

	@OriginalMember(owner = "client!wh", name = "re", descriptor = "Lclient!hk;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!wh", name = "oe", descriptor = "Lclient!ida;")
	private Class6_Sub25_Sub1 aClass6_Sub25_Sub1_1;

	@OriginalMember(owner = "client!wh", name = "ne", descriptor = "Lclient!td;")
	private final Class317 aClass317_1;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class100_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class286();
		new Class128(16);
		this.aClass8_68 = new Class8();
		this.aClass8_69 = new Class8();
		this.aClass8_70 = new Class8();
		this.aClass8_71 = new Class8();
		this.aClass8_72 = new Class8();
		this.aClass8_73 = new Class8();
		this.aClass8_74 = new Class8();
		this.aClass154_Sub3_3 = new Class154_Sub3();
		this.aClass154_Sub3_4 = new Class154_Sub3();
		this.aClass154_Sub3_5 = new Class154_Sub3();
		this.anInt10597 = -1;
		this.anInt10599 = 0;
		this.anInt10600 = 0;
		this.aFloat212 = 3584.0F;
		this.anInt10616 = -1;
		this.anInt10611 = 0;
		this.anInt10608 = 0;
		this.aFloat220 = -1.0F;
		this.anInt10613 = 512;
		this.aBoolean708 = false;
		this.anInt10607 = 0;
		this.anInt10614 = 512;
		this.anInt10617 = 0;
		this.anInt10619 = -1;
		this.anInt10602 = -1;
		this.aFloatArray81 = new float[16];
		this.aFloat222 = 1.0F;
		this.aFloatArray79 = new float[4];
		this.aFloat226 = 1.0F;
		this.aFloatArray80 = new float[4];
		this.anInt10609 = 8448;
		this.anInt10604 = 3584;
		this.aFloat228 = -1.0F;
		this.aFloat227 = 1.0F;
		this.anInt10625 = 0;
		this.aFloat211 = -1.0F;
		this.aFloat213 = 3584.0F;
		this.anInt10628 = 50;
		this.anInt10622 = 0;
		this.anInt10627 = 8448;
		this.aFloat221 = 1.0F;
		this.aClass6_Sub1Array6 = new Class6_Sub1[Static89.anInt6696];
		this.aFloatArray82 = new float[4];
		this.aBoolean703 = true;
		this.aFloat217 = 1.0F;
		this.aFloat230 = 0.0F;
		this.anInt10621 = 0;
		this.aFloat225 = -1.0F;
		this.anInt10629 = 0;
		this.anInt10620 = -1;
		this.aFloatArray83 = new float[4];
		this.aClass6_Sub40_Sub1_3 = new Class6_Sub40_Sub1(8192);
		this.anIntArray639 = new int[1];
		this.aByteArray123 = new byte[16384];
		this.anIntArray640 = new int[1];
		this.anIntArray641 = new int[1];
		this.anInt10580 = arg2;
		this.aCanvas12 = this.aCanvas13 = arg0;
		if (!Static96.method1571("jaclib")) {
			throw new RuntimeException("");
		} else if (Static96.method1571("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong273 = this.aLong274 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt10580);
				if (this.aLong274 == 0L) {
					throw new RuntimeException("");
				}
				this.method8874();
				@Pc(335) int local335 = this.method8939();
				if (local335 != 0) {
					throw new RuntimeException("");
				}
				this.anInt10618 = this.aBoolean700 ? 33639 : 5121;
				if (this.aString118.indexOf("radeon") != -1) {
					@Pc(359) int local359 = 0;
					@Pc(361) boolean local361 = false;
					@Pc(363) boolean local363 = false;
					@Pc(372) String[] local372 = Static513.method7614(this.aString118.replace('/', ' '), ' ');
					for (@Pc(374) int local374 = 0; local374 < local372.length; local374++) {
						@Pc(380) String local380 = local372[local374];
						try {
							if (local380.length() > 0) {
								if (local380.charAt(0) == 'x' && local380.length() >= 3 && Static511.method7587(local380.substring(1, 3))) {
									local380 = local380.substring(1);
									local363 = true;
								}
								if (local380.equals("hd")) {
									local361 = true;
								} else {
									if (local380.startsWith("hd")) {
										local361 = true;
										local380 = local380.substring(2);
									}
									if (local380.length() >= 4 && Static511.method7587(local380.substring(0, 4))) {
										local359 = Static355.method5682(local380.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local363 && !local361) {
						if (local359 >= 7000 && local359 <= 7999) {
							this.aBoolean724 = false;
						}
						if (local359 >= 7000 && local359 <= 9250) {
							this.aBoolean722 = false;
						}
					}
					if (!local361 || local359 < 4000) {
						this.aBoolean723 = false;
					}
					this.aBoolean710 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean705 = true;
					this.aBoolean718 = this.aBoolean724;
				}
				if (this.aString117.indexOf("intel") != -1) {
					this.aBoolean698 = false;
				}
				this.aBoolean702 = !this.aString117.equals("s3 graphics");
				if (this.aBoolean724) {
					try {
						@Pc(530) int[] local530 = new int[1];
						OpenGL.glGenBuffersARB(1, local530, 0);
					} catch (@Pc(536) Throwable local536) {
						throw new RuntimeException("");
					}
				}
				Static125.method9040(false, true);
				this.aBoolean693 = true;
				this.aClass42_1 = new Class42(this, super.anInterface4_12);
				this.method8871();
				this.aClass66_1 = new Class66(this);
				this.aClass135_1 = new Class135(this);
				if (this.aClass135_1.method3661()) {
					this.aClass6_Sub25_Sub1_1 = new Class6_Sub25_Sub1(this);
					if (!this.aClass6_Sub25_Sub1_1.method4004()) {
						this.aClass6_Sub25_Sub1_1.method3989();
						this.aClass6_Sub25_Sub1_1 = null;
					}
				}
				this.aClass317_1 = new Class317(this);
				this.method8898();
				this.method8878();
				this.method8806();
			} catch (@Pc(610) Throwable local610) {
				local610.printStackTrace();
				this.method8826();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "()V")
	@Override
	public void method8849() {
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
	public void method8857() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray80, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray82, 0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!fg;Z)Lclient!pga;")
	@Override
	public Class32 method8773(@OriginalArg(0) Class98 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt2799 * arg0.anInt2796];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray44 == null) {
			for (local21 = 0; local21 < arg0.anInt2799; local21++) {
				for (local25 = 0; local25 < arg0.anInt2796; local25++) {
					@Pc(38) int local38 = arg0.anIntArray184[arg0.aByteArray45[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2799; local21++) {
				for (local25 = 0; local25 < arg0.anInt2796; local25++) {
					local12[local16++] = arg0.aByteArray44[local14] << 24 | arg0.anIntArray184[arg0.aByteArray45[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(124) Class32 local124 = this.method8847(arg0.anInt2799, arg0.anInt2796, local12, arg0.anInt2796);
		local124.method5073(arg0.anInt2797, arg0.anInt2798, arg0.anInt2794, arg0.anInt2795);
		return local124;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)V")
	public void method8858(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean697 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt10594 &= 0xFFFFFFE0;
		this.aBoolean697 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "(I)V")
	private void method8859() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass154_Sub3_4.method6578(), 0);
		if (this.aBoolean708) {
			this.aClass317_1.aClass11_Sub8_1.method7752();
		}
		this.method8857();
		this.method8870();
	}

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "(I)V")
	private void method8860() {
		if (this.anInt10605 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt10422 > 0 && this.anInt10436 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt10422, (double) this.anInt10436, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt10594 &= 0xFFFFFFE7;
		this.anInt10605 = 1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	public void method8861(@OriginalArg(0) int arg0) {
		if (this.anInt10603 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt10603 = arg0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!gh;I)V")
	public void method8862(@OriginalArg(0) Interface10 arg0) {
		if (arg0 != this.anInterface10_5) {
			if (this.aBoolean724) {
				OpenGL.glBindBufferARB(34963, arg0.method1316());
			}
			this.anInterface10_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!pk;)V")
	@Override
	public void method8794(@OriginalArg(0) Interface20 arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8834(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = this.aClass154_Sub3_3.aFloat152 + this.aClass154_Sub3_3.aFloat154 * (float) arg1 + (float) arg0 * this.aClass154_Sub3_3.aFloat159 + this.aClass154_Sub3_3.aFloat158 * (float) arg2;
		@Pc(55) float local55 = this.aClass154_Sub3_3.aFloat152 + this.aClass154_Sub3_3.aFloat158 * (float) arg5 + (float) arg4 * this.aClass154_Sub3_3.aFloat154 + (float) arg3 * this.aClass154_Sub3_3.aFloat159;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt10628 > local30 && (float) this.anInt10628 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt10604 < local30 && (float) this.anInt10604 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((float) this.anInt10613 * (this.aClass154_Sub3_3.aFloat155 * (float) arg1 + (float) arg0 * this.aClass154_Sub3_3.aFloat151 + this.aClass154_Sub3_3.aFloat161 * (float) arg2 + this.aClass154_Sub3_3.aFloat156) / (float) arg6);
		@Pc(157) int local157 = (int) ((float) this.anInt10613 * (this.aClass154_Sub3_3.aFloat161 * (float) arg5 + this.aClass154_Sub3_3.aFloat151 * (float) arg3 + (float) arg4 * this.aClass154_Sub3_3.aFloat155 + this.aClass154_Sub3_3.aFloat156) / (float) arg6);
		if (this.aFloat223 > (float) local124 && this.aFloat223 > (float) local157) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat224 && this.aFloat224 < (float) local157) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass154_Sub3_3.aFloat160 + this.aClass154_Sub3_3.aFloat157 * (float) arg0 + (float) arg1 * this.aClass154_Sub3_3.aFloat153 + (float) arg2 * this.aClass154_Sub3_3.aFloat150) * (float) this.anInt10614 / (float) arg6);
		@Pc(257) int local257 = (int) (((float) arg4 * this.aClass154_Sub3_3.aFloat153 + (float) arg3 * this.aClass154_Sub3_3.aFloat157 + this.aClass154_Sub3_3.aFloat150 * (float) arg5 + this.aClass154_Sub3_3.aFloat160) * (float) this.anInt10614 / (float) arg6);
		if ((float) local224 < this.aFloat229 && (float) local257 < this.aFloat229) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat216 && this.aFloat216 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZ)Lclient!pga;")
	@Override
	public Class32 method8823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class32_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZZ)V")
	public void method8863(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean716) {
			this.aBoolean716 = arg0;
			this.method8929();
			this.anInt10594 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(ZZ)V")
	public void method8864(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean694 != arg0) {
			this.aBoolean694 = arg0;
			this.method8937();
			this.anInt10594 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "(I)V")
	private void method8866() {
		this.aFloat224 = (float) (this.anInt10608 - this.anInt10621);
		this.aFloat223 = (float) (this.anInt10622 - this.anInt10621);
		this.aFloat229 = (float) (this.anInt10599 - this.anInt10607);
		this.aFloat216 = (float) (this.anInt10600 - this.anInt10607);
	}

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "()Z")
	@Override
	public boolean method8825() {
		return false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI)V")
	public void method8867(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean712 != arg0) {
			this.aBoolean712 = arg0;
			this.method8932();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!qk;I)V")
	public void method8868(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt10590 < 0 || this.anInterface22Array2[this.anInt10590] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface22Array2[this.anInt10590--] = null;
		arg0.method4086();
		if (this.anInt10590 >= 0) {
			this.anInterface22_1 = this.anInterface22Array2[this.anInt10590];
			this.anInterface22_1.method4090();
		} else {
			this.anInterface22_1 = null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass154_Sub3_3.aFloat159 * (float) arg0 + this.aClass154_Sub3_3.aFloat154 * (float) arg1 + this.aClass154_Sub3_3.aFloat158 * (float) arg2 + this.aClass154_Sub3_3.aFloat152;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass154_Sub3_3.aFloat152 + this.aClass154_Sub3_3.aFloat158 * (float) arg5 + (float) arg4 * this.aClass154_Sub3_3.aFloat154 + (float) arg3 * this.aClass154_Sub3_3.aFloat159;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt10628 > local32 && (float) this.anInt10628 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt10604 && (float) this.anInt10604 < local63) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass154_Sub3_3.aFloat155 * (float) arg1 + this.aClass154_Sub3_3.aFloat151 * (float) arg0 + this.aClass154_Sub3_3.aFloat161 * (float) arg2 + this.aClass154_Sub3_3.aFloat156) * (float) this.anInt10613 / local32);
		@Pc(167) int local167 = (int) ((this.aClass154_Sub3_3.aFloat156 + (float) arg5 * this.aClass154_Sub3_3.aFloat161 + (float) arg3 * this.aClass154_Sub3_3.aFloat151 + (float) arg4 * this.aClass154_Sub3_3.aFloat155) * (float) this.anInt10613 / local63);
		if ((float) local135 < this.aFloat223 && (float) local167 < this.aFloat223) {
			local7 |= 0x1;
		} else if (this.aFloat224 < (float) local135 && this.aFloat224 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass154_Sub3_3.aFloat157 * (float) arg0 + this.aClass154_Sub3_3.aFloat153 * (float) arg1 + this.aClass154_Sub3_3.aFloat150 * (float) arg2 + this.aClass154_Sub3_3.aFloat160) * (float) this.anInt10614 / local32);
		@Pc(265) int local265 = (int) ((this.aClass154_Sub3_3.aFloat160 + this.aClass154_Sub3_3.aFloat157 * (float) arg3 + (float) arg4 * this.aClass154_Sub3_3.aFloat153 + this.aClass154_Sub3_3.aFloat150 * (float) arg5) * (float) this.anInt10614 / local63);
		if ((float) local233 < this.aFloat229 && (float) local265 < this.aFloat229) {
			local7 |= 0x4;
		} else if ((float) local233 > this.aFloat216 && (float) local265 > this.aFloat216) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg5;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_2;
		this.method8904();
		this.method8925(local6.aClass3_Sub2_Sub1_2);
		this.method8876(1);
		this.method8880(8448, 7681);
		this.method8889(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat73 / (float) local9.anInt4469;
		@Pc(46) float local46 = local9.aFloat74 / (float) local9.anInt4472;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local58 * local58)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(90) float local90 = local58 * local71;
		@Pc(94) float local94 = local52 * local71;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local94 + (float) arg2 + 0.35F, local90 + 0.35F + (float) arg3);
		OpenGL.glEnd();
		this.method8889(5890, 0, 768);
	}

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "()Z")
	@Override
	public boolean method8856() {
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(19) Class1_Sub1 local19 = (Class1_Sub1) arg5;
		@Pc(22) Class3_Sub2_Sub1 local22 = local19.aClass3_Sub2_Sub1_2;
		this.method8904();
		this.method8925(local19.aClass3_Sub2_Sub1_2);
		this.method8876(1);
		this.method8880(8448, 7681);
		this.method8889(34167, 0, 768);
		@Pc(52) float local52 = local22.aFloat73 / (float) local22.anInt4469;
		@Pc(59) float local59 = local22.aFloat74 / (float) local22.anInt4472;
		@Pc(65) float local65 = (float) arg2 - (float) arg0;
		@Pc(72) float local72 = (float) -arg1 + (float) arg3;
		@Pc(85) float local85 = (float) (1.0D / Math.sqrt((double) (local65 * local65 + local72 * local72)));
		@Pc(91) int local91 = arg10 % (arg8 + arg9);
		@Pc(95) float local95 = local65 * local85;
		@Pc(99) float local99 = local72 * local85;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(119) float local119 = (float) arg8 * local95;
		@Pc(124) float local124 = (float) arg8 * local99;
		@Pc(126) float local126 = 0.0F;
		@Pc(128) float local128 = 0.0F;
		@Pc(130) float local130 = local119;
		@Pc(132) float local132 = local124;
		if (local91 > arg8) {
			local128 = (float) (arg8 + arg9 - local91) * local99;
			local126 = local95 * (float) (arg8 + arg9 - local91);
		} else {
			local132 = (float) (arg8 - local91) * local99;
			local130 = (float) (arg8 - local91) * local95;
		}
		@Pc(180) float local180 = local126 + (float) arg0 + 0.35F;
		@Pc(187) float local187 = local128 + (float) arg1 + 0.35F;
		@Pc(192) float local192 = (float) arg9 * local95;
		@Pc(197) float local197 = (float) arg9 * local99;
		while (true) {
			if (arg2 > arg0) {
				if (local180 > (float) arg2 + 0.35F) {
					break;
				}
				if (local180 + local130 > (float) arg2) {
					local130 = (float) arg2 - local180;
				}
			} else {
				if (local180 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local180 + local130) {
					local130 = (float) arg2 - local180;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local187) {
					break;
				}
				if ((float) arg3 > local132 + local187) {
					local132 = (float) arg3 - local187;
				}
			} else {
				if (local187 > (float) arg3 + 0.35F) {
					break;
				}
				if (local187 + local132 > (float) arg3) {
					local132 = (float) arg3 - local187;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local180 - (float) arg6) * local52, (local187 - (float) arg7) * local59);
			OpenGL.glVertex2f(local180, local187);
			OpenGL.glTexCoord2f(local52 * (local180 + local130 - (float) arg6), local59 * ((float) -arg7 + local132 + local187));
			OpenGL.glVertex2f(local180 + local130, local187 + local132);
			OpenGL.glEnd();
			local180 += local192 + local130;
			local187 += local197 + local132;
			local132 = local124;
			local130 = local119;
		}
		this.method8889(5890, 0, 768);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()Lclient!kaa;")
	@Override
	public Class168 method8779() {
		@Pc(7) int local7 = -1;
		if (this.aString117.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString117.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString117.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class168(local7, "OpenGL", this.anInt10624, this.aString118, 0L);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BIZZ)V")
	public void method8869(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt10596 != arg0 || this.aBoolean704 != this.aBoolean708) {
			@Pc(14) Class3_Sub2 local14 = null;
			@Pc(16) int local16 = 0;
			@Pc(18) byte local18 = 0;
			@Pc(20) int local20 = 0;
			@Pc(27) int local27 = this.aBoolean704 ? 3 : 0;
			if (arg0 < 0) {
				this.method8899();
			} else {
				local14 = this.aClass42_1.method914(arg0);
				@Pc(41) Class325 local41 = super.anInterface4_12.method895(arg0);
				if (local41.aByte116 == 0 && local41.aByte111 == 0) {
					this.method8899();
				} else {
					@Pc(62) int local62 = local41.aBoolean633 ? 64 : 128;
					@Pc(66) int local66 = local62 * 50;
					this.method8872((float) (local41.aByte111 * (this.anInt10585 % local66)) / (float) local66, (float) (local41.aByte116 * (this.anInt10585 % local66)) / (float) local66, 0.0F);
				}
				if (!this.aBoolean704) {
					local18 = local41.aByte112;
					local27 = local41.aByte115;
					local20 = local41.anInt9368;
				}
				local16 = local41.anInt9370;
			}
			this.aClass317_1.method7920(local18, arg2, arg1, local20, local27);
			if (!this.aClass317_1.method7918(local14, local16)) {
				this.method8925(local14);
				this.method8903(local16);
			}
			this.anInt10596 = arg0;
			this.aBoolean708 = this.aBoolean704;
		}
		this.anInt10594 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V")
	@Override
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt10628;
	}

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "()Z")
	@Override
	public boolean method8798() {
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	private void method8870() {
		@Pc(13) int local13;
		for (local13 = 0; local13 < this.anInt10601; local13++) {
			@Pc(20) Class6_Sub1 local20 = this.aClass6_Sub1Array6[local13];
			Static554.aFloatArray12[0] = (float) local20.method8264();
			@Pc(31) int local31 = local13 + 16386;
			Static554.aFloatArray12[1] = (float) local20.method8267();
			Static554.aFloatArray12[2] = (float) local20.method8260();
			Static554.aFloatArray12[3] = 1.0F;
			OpenGL.glLightfv(local31, 4611, Static554.aFloatArray12, 0);
			@Pc(58) int local58 = local20.method8265();
			@Pc(64) float local64 = local20.method8266() / 255.0F;
			Static554.aFloatArray12[0] = (float) (local58 >> 16 & 0xFF) * local64;
			Static554.aFloatArray12[2] = local64 * (float) (local58 & 0xFF);
			Static554.aFloatArray12[1] = (float) (local58 >> 8 & 0xFF) * local64;
			OpenGL.glLightfv(local31, 4609, Static554.aFloatArray12, 0);
			OpenGL.glLightf(local31, 4617, 1.0F / (float) (local20.method8268() * local20.method8268()));
			OpenGL.glEnable(local31);
		}
		while (local13 < this.anInt10612) {
			OpenGL.glDisable(local13 + 16386);
			local13++;
		}
		this.anInt10612 = this.anInt10601;
	}

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "()Z")
	@Override
	public boolean method8799() {
		return false;
	}

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass154_Sub3_3.aFloat158 + this.aClass154_Sub3_3.aFloat159 * (float) arg0 + this.aClass154_Sub3_3.aFloat154 * (float) arg1 + this.aClass154_Sub3_3.aFloat152;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((float) this.anInt10613 * ((float) arg1 * this.aClass154_Sub3_3.aFloat155 + this.aClass154_Sub3_3.aFloat151 * (float) arg0 + (float) arg2 * this.aClass154_Sub3_3.aFloat161 + this.aClass154_Sub3_3.aFloat156) / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat223);
		@Pc(119) int local119 = (int) ((float) this.anInt10614 * ((float) arg2 * this.aClass154_Sub3_3.aFloat150 + this.aClass154_Sub3_3.aFloat157 * (float) arg0 + this.aClass154_Sub3_3.aFloat153 * (float) arg1 + this.aClass154_Sub3_3.aFloat160) / local28);
		arg3[1] = (int) ((float) local119 - this.aFloat229);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8788(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.aLong273 = 0L;
		if (arg0 == null || arg0 == this.aCanvas13) {
			this.aLong273 = this.aLong274;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable7.get(arg0);
			this.aLong273 = local26;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong273 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong273);
		this.method8878();
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8785() {
		return this.aClass154_Sub3_1;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "()Z")
	@Override
	public boolean method8784() {
		return this.aClass6_Sub25_Sub1_1 != null && this.aClass6_Sub25_Sub1_1.method3997();
	}

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "(I)V")
	private void method8871() {
		this.aClass3Array1 = new Class3[this.anInt10610];
		this.aClass3_Sub2_6 = new Class3_Sub2(this, 3553, 6408, 1, 1);
		new Class3_Sub2(this, 3553, 6408, 1, 1);
		new Class3_Sub2(this, 3553, 6408, 1, 1);
		this.aClass24_Sub1_4 = new Class24_Sub1(this);
		this.aClass24_Sub1_7 = new Class24_Sub1(this);
		this.aClass24_Sub1_8 = new Class24_Sub1(this);
		this.aClass24_Sub1_2 = new Class24_Sub1(this);
		this.aClass24_Sub1_3 = new Class24_Sub1(this);
		this.aClass24_Sub1_10 = new Class24_Sub1(this);
		this.aClass24_Sub1_5 = new Class24_Sub1(this);
		this.aClass24_Sub1_9 = new Class24_Sub1(this);
		this.aClass24_Sub1_1 = new Class24_Sub1(this);
		this.aClass24_Sub1_6 = new Class24_Sub1(this);
		if (this.aBoolean698) {
			this.aClass149_7 = new Class149(this);
			new Class149(this);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IFFF)V")
	private void method8872(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean713) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean713 = true;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8787(@OriginalArg(0) Class6_Sub8 arg0) {
		this.aNativeHeap6 = ((Class6_Sub8_Sub1) arg0).aNativeHeap1;
		if (this.anInterface27_7 != null) {
			return;
		}
		@Pc(16) Class6_Sub40_Sub1 local16 = new Class6_Sub40_Sub1(80);
		if (this.aBoolean700) {
			local16.method7692(-1.0F);
			local16.method7692(-1.0F);
			local16.method7692(0.0F);
			local16.method7692(0.0F);
			local16.method7692(1.0F);
			local16.method7692(1.0F);
			local16.method7692(-1.0F);
			local16.method7692(0.0F);
			local16.method7692(1.0F);
			local16.method7692(1.0F);
			local16.method7692(1.0F);
			local16.method7692(1.0F);
			local16.method7692(0.0F);
			local16.method7692(1.0F);
			local16.method7692(0.0F);
			local16.method7692(-1.0F);
			local16.method7692(1.0F);
			local16.method7692(0.0F);
			local16.method7692(0.0F);
			local16.method7692(0.0F);
		} else {
			local16.method7691(-1.0F);
			local16.method7691(-1.0F);
			local16.method7691(0.0F);
			local16.method7691(0.0F);
			local16.method7691(1.0F);
			local16.method7691(1.0F);
			local16.method7691(-1.0F);
			local16.method7691(0.0F);
			local16.method7691(1.0F);
			local16.method7691(1.0F);
			local16.method7691(1.0F);
			local16.method7691(1.0F);
			local16.method7691(0.0F);
			local16.method7691(1.0F);
			local16.method7691(0.0F);
			local16.method7691(-1.0F);
			local16.method7691(1.0F);
			local16.method7691(0.0F);
			local16.method7691(0.0F);
			local16.method7691(0.0F);
		}
		this.anInterface27_7 = this.method8883(false, local16.aByteArray113, local16.anInt10169, 20);
		this.aClass55_15 = new Class55(this.anInterface27_7, 5126, 3, 0);
		this.aClass55_16 = new Class55(this.anInterface27_7, 5126, 2, 12);
		this.aClass144_1.method3867(this);
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(II)V")
	public synchronized void method8873(@OriginalArg(0) int arg0) {
		@Pc(7) Class6 local7 = new Class6();
		local7.aLong278 = (long) arg0;
		this.aClass8_73.method157(local7);
	}

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "(I)V")
	private void method8874() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL2.b()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static179.method3254(1000L);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	public synchronized void method8875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub48 local8 = new Class6_Sub48(arg0);
		local8.aLong278 = (long) arg1;
		this.aClass8_72.method157(local8);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!om;)V")
	@Override
	public void method8783(@OriginalArg(0) Class57 arg0) {
		this.aClass57_Sub1_1 = (Class57_Sub1) arg0;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(ZI)V")
	public void method8876(@OriginalArg(1) int arg0) {
		if (arg0 == this.bf) {
			return;
		}
		@Pc(14) boolean local14;
		@Pc(16) byte local16;
		if (arg0 == 1) {
			local14 = true;
			local16 = 1;
		} else if (arg0 == 2) {
			local14 = false;
			local16 = 2;
		} else if (arg0 == 128) {
			local14 = true;
			local16 = 3;
		} else {
			local14 = false;
			local16 = 0;
		}
		if (!this.aBoolean696) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean696 = true;
		}
		if (local14 != this.aBoolean695) {
			if (local14) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean695 = local14;
		}
		if (local16 != this.anInt10595) {
			if (local16 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local16 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local16 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt10595 = local16;
		}
		this.anInt10594 &= 0xFFFFFFE3;
		this.bf = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt10436 - arg1 - local12, arg2, 1, 32993, this.anInt10618, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!wh", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method8876(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IF)V")
	public void method8877(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat226) {
			this.aFloat226 = arg0;
			if (this.anInt10605 == 3) {
				this.method8892();
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8855(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method8800(arg2, arg3);
	}

	@OriginalMember(owner = "client!wh", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = this.anInt10620 != arg0;
		if (local11 || this.aFloat228 != arg1 || this.aFloat225 != arg2) {
			this.aFloat225 = arg2;
			this.anInt10620 = arg0;
			this.aFloat228 = arg1;
			if (local11) {
				this.aFloat222 = (float) (this.anInt10620 & 0xFF00) / 65280.0F;
				this.aFloat221 = (float) (this.anInt10620 & 0xFF0000) / 1.671168E7F;
				this.aFloat217 = (float) (this.anInt10620 & 0xFF) / 255.0F;
				this.method8940();
			}
			this.method8882();
		}
		if (arg3 == this.aFloatArray83[0] && this.aFloatArray83[1] == arg4 && this.aFloatArray83[2] == arg5) {
			return;
		}
		this.aFloatArray83[1] = arg4;
		this.aFloatArray83[2] = arg5;
		this.aFloatArray83[0] = arg3;
		this.aFloatArray79[0] = -arg3;
		this.aFloatArray79[2] = -arg5;
		this.aFloatArray79[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5)));
		this.aFloatArray80[0] = arg3 * local138;
		this.aFloatArray80[2] = local138 * arg5;
		this.aFloatArray80[1] = local138 * arg4;
		this.aFloatArray82[1] = -this.aFloatArray80[1];
		this.aFloatArray82[0] = -this.aFloatArray80[0];
		this.aFloatArray82[2] = -this.aFloatArray80[2];
		this.method8857();
		this.anInt10615 = (int) (arg5 * 256.0F / arg4);
		this.anInt10606 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(II)I")
	@Override
	public int method8821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "(I)V")
	private void method8878() {
		if (this.aCanvas12 == null) {
			this.anInt10536 = this.anInt10472 = 0;
		} else {
			@Pc(16) Dimension local16 = this.aCanvas12.getSize();
			this.anInt10536 = local16.width;
			this.anInt10472 = local16.height;
		}
		if (this.anInterface22_1 == null) {
			this.anInt10436 = this.anInt10472;
			this.anInt10422 = this.anInt10536;
			this.method8900();
		}
		this.method8907();
		this.la();
	}

	@OriginalMember(owner = "client!wh", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean704 = true;
		this.anInt10602 = arg1;
		this.anInt10611 = arg3;
		this.anInt10626 = arg0;
		this.anInt10619 = arg2;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Z)V")
	@Override
	public void method8802(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean704) {
			throw new RuntimeException("");
		}
		this.anInt10626 = arg0;
		this.anInt10619 = arg2;
		this.anInt10602 = arg1;
		this.anInt10611 = arg3;
		if (this.aBoolean708) {
			this.aClass317_1.aClass11_Sub8_1.method7752();
			this.aClass317_1.aClass11_Sub8_1.method7755();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!dk;")
	@Override
	public Interface5 method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
	@Override
	public void method8803() {
	}

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "()Z")
	@Override
	public boolean method8853() {
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	@Override
	public void method8805(@OriginalArg(0) int arg0) {
		this.method8874();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!of;)V")
	@Override
	public void method8844(@OriginalArg(0) Class236 arg0) {
		this.aClass144_1.method3871(arg0, -1, this);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!qk;)V")
	public void method8879(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt10589 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt10589 >= 0) {
			this.anInterface22Array3[this.anInt10589].method4088();
		}
		this.anInterface22_2 = this.anInterface22Array3[++this.anInt10589] = arg0;
		this.anInterface22_2.method4087();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)V")
	public void method8880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt10603 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (this.anInt10609 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt10609 = arg1;
			local17 = true;
		}
		if (this.anInt10627 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local17 = true;
			this.anInt10627 = arg0;
		}
		if (local17) {
			this.anInt10594 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(BII)V")
	public synchronized void method8881(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub48 local8 = new Class6_Sub48(arg1);
		local8.aLong278 = (long) arg0;
		this.aClass8_70.method157(local8);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!hia;[Lclient!fg;Z)Lclient!da;")
	@Override
	public Class50 method8808(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class98[] arg1) {
		return new Class50_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "(I)V")
	private void method8882() {
		Static378.aFloatArray55[0] = this.aFloat221 * this.aFloat228;
		Static378.aFloatArray55[2] = this.aFloat217 * this.aFloat228;
		Static378.aFloatArray55[3] = 1.0F;
		Static378.aFloatArray55[1] = this.aFloat228 * this.aFloat222;
		OpenGL.glLightfv(16384, 4609, Static378.aFloatArray55, 0);
		Static378.aFloatArray55[1] = this.aFloat222 * -this.aFloat225;
		Static378.aFloatArray55[3] = 1.0F;
		Static378.aFloatArray55[2] = -this.aFloat225 * this.aFloat217;
		Static378.aFloatArray55[0] = this.aFloat221 * -this.aFloat225;
		OpenGL.glLightfv(16385, 4609, Static378.aFloatArray55, 0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZI[BII)Lclient!wia;")
	public Interface27 method8883(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return (Interface27) (this.aBoolean724 && (!arg0 || this.aBoolean718) ? new Class44_Sub2(this, arg3, arg1, arg2, arg0) : new Class54_Sub2(this, arg3, arg1, arg2));
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(Z)V")
	private void method8884() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray81, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8792() {
		this.method8905();
		this.method8876(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[Lclient!raa;)V")
	@Override
	public void method8828(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub1[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass6_Sub1Array6[local7] = arg1[local7];
		}
		this.anInt10601 = arg0;
		if (this.anInt10605 != 1) {
			this.method8870();
		}
	}

	@OriginalMember(owner = "client!wh", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10614 = arg3;
		this.anInt10613 = arg2;
		this.anInt10621 = arg0;
		this.anInt10607 = arg1;
		this.method8902();
		this.method8866();
		if (this.anInt10605 == 3) {
			this.method8892();
		} else if (this.anInt10605 == 2) {
			this.method8884();
			return;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!cl;ILclient!cl;Lclient!cl;Lclient!cl;)V")
	public void method8885(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) Class55 arg3) {
		if (arg0 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method8913(arg0.anInterface27_2);
			OpenGL.glVertexPointer(arg0.aByte35, arg0.aShort25, this.anInterface27_6.method4868(), this.anInterface27_6.method4869() + (long) arg0.aByte36);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method8913(arg3.anInterface27_2);
			OpenGL.glNormalPointer(arg3.aShort25, this.anInterface27_6.method4868(), this.anInterface27_6.method4869() + (long) arg3.aByte36);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method8913(arg1.anInterface27_2);
			OpenGL.glColorPointer(arg1.aByte35, arg1.aShort25, this.anInterface27_6.method4868(), this.anInterface27_6.method4869() + (long) arg1.aByte36);
			OpenGL.glEnableClientState(32886);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method8913(arg2.anInterface27_2);
			OpenGL.glTexCoordPointer(arg2.aByte35, arg2.aShort25, this.anInterface27_6.method4868(), this.anInterface27_6.method4869() + (long) arg2.aByte36);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(Z)V")
	public void method8886() {
		if (this.anInt10594 == 8) {
			return;
		}
		this.method8941();
		this.method8863(true);
		this.method8858(true);
		this.method8864(true);
		this.method8876(1);
		this.anInt10594 = 8;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZZLclient!jaclib/memory/Buffer;I)Lclient!wia;")
	public Interface27 method8887(@OriginalArg(0) int arg0, @OriginalArg(3) Buffer arg1, @OriginalArg(4) int arg2) {
		return (Interface27) (this.aBoolean724 ? new Class44_Sub2(this, arg2, arg1, arg0, false) : new Class54_Sub2(this, arg2, arg1));
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method8850(@OriginalArg(0) Class154 arg0) {
		this.aClass154_Sub3_3.method6563(arg0);
		this.aClass154_Sub3_4.method6563(this.aClass154_Sub3_3);
		this.aClass154_Sub3_4.method6582();
		this.aClass154_Sub3_5.method6579(this.aClass154_Sub3_4);
		if (this.anInt10605 != 1) {
			this.method8859();
		}
	}

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "()Z")
	@Override
	public boolean method8816() {
		return this.aClass317_1.method7917();
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method8905();
		this.method8876(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean711) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean711) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(Z)V")
	private void method8888() {
		this.aFloatArray81[10] = this.aFloat210;
		this.aFloatArray81[14] = this.aFloat218;
		this.aFloat212 = (this.aFloatArray81[14] - (float) this.anInt10604) / this.aFloatArray81[10];
		this.aFloat213 = (float) this.anInt10604;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIII)V")
	public void method8889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	private void method8890() {
		if (this.anInt10608 >= this.anInt10622 && this.anInt10599 <= this.anInt10600) {
			OpenGL.glScissor(this.anInt10622 + this.anInt10617, -this.anInt10600 + this.anInt10625 + this.anInt10436, this.anInt10608 - this.anInt10622, -this.anInt10599 + this.anInt10600);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "(II)V")
	public void method8891(@OriginalArg(1) int arg0) {
		Static378.aFloatArray55[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static378.aFloatArray55[3] = (float) (arg0 >>> 24) / 255.0F;
		Static378.aFloatArray55[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static378.aFloatArray55[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static378.aFloatArray55, 0);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "(I)V")
	private void method8892() {
		@Pc(15) float local15 = this.aFloat226 * (float) -this.anInt10621 / (float) this.anInt10613;
		@Pc(27) float local27 = (float) -this.anInt10607 * this.aFloat226 / (float) this.anInt10614;
		@Pc(42) float local42 = (float) (this.anInt10422 - this.anInt10621) * this.aFloat226 / (float) this.anInt10613;
		@Pc(61) float local61 = (float) (this.anInt10436 - this.anInt10607) * this.aFloat226 / (float) this.anInt10614;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local61 != local27) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local61, (double) -local27, (double) this.anInt10628, (double) this.anInt10604);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8797(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas13 == arg0) {
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

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "(I)V")
	private void method8893() {
		this.aFloat214 = (float) (this.anInt10604 - this.anInt10629) - this.aFloat230;
		this.aFloat215 = this.aFloat214 - (float) this.anInt10597 * this.aFloat227;
		if ((float) this.anInt10628 > this.aFloat215) {
			this.aFloat215 = (float) this.anInt10628;
		}
		OpenGL.glFogf(2915, this.aFloat215);
		OpenGL.glFogf(2916, this.aFloat214);
		Static378.aFloatArray55[2] = (float) (this.anInt10616 & 0xFF) / 255.0F;
		Static378.aFloatArray55[0] = (float) (this.anInt10616 & 0xFF0000) / 1.671168E7F;
		Static378.aFloatArray55[1] = (float) (this.anInt10616 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static378.aFloatArray55, 0);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)I")
	public int method8894(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(II)V")
	public void method8895(@OriginalArg(0) int arg0) {
		this.method8927(true, arg0);
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(Lclient!qk;I)V")
	public void method8896(@OriginalArg(0) Interface22 arg0) {
		if (this.aBoolean720) {
			this.method8917(arg0);
			this.method8868(arg0);
		} else if (this.anInt10588 >= 0 && this.anInterface22Array1[this.anInt10588] == arg0) {
			this.anInterface22Array1[this.anInt10588--] = null;
			arg0.method4085();
			if (this.anInt10588 >= 0) {
				this.anInterface22_2 = this.anInterface22_1 = this.anInterface22Array1[this.anInt10588];
				this.anInterface22_2.method4089();
			} else {
				this.anInterface22_2 = this.anInterface22_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "(I)V")
	public void method8897() {
		if (this.anInt10594 == 4) {
			return;
		}
		this.method8860();
		this.method8863(false);
		this.method8926(false);
		this.method8858(false);
		this.method8864(false);
		this.method8895(-2);
		this.method8876(1);
		this.anInt10594 = 4;
	}

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "(I)V")
	private void method8898() {
		this.method8895(-2);
		for (@Pc(20) int local20 = this.anInt10610 - 1; local20 >= 0; local20--) {
			this.method8861(local20);
			this.method8925((Class3) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method8880(8448, 8448);
		this.method8889(34168, 2, 770);
		this.method8899();
		this.bf = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt10595 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean695 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean696 = true;
		this.method8863(true);
		this.method8926(true);
		this.method8858(true);
		this.method8864(true);
		this.method8907();
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
		@Pc(129) float[] local129 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(131) int local131 = 0; local131 < 8; local131++) {
			@Pc(137) int local137 = local131 + 16384;
			OpenGL.glLightfv(local137, 4608, local129, 0);
			OpenGL.glLightf(local137, 4615, 0.0F);
			OpenGL.glLightf(local137, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt10620 = this.anInt10616 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt10631;
		this.anInt10631 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean703 = arg0;
		this.method8937();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!of;I)V")
	@Override
	public void method8831(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1) {
		this.aClass144_1.method3871(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	private void method8899() {
		if (this.aBoolean713) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean713 = false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)V")
	private void method8900() {
		OpenGL.glViewport(this.anInt10617, this.anInt10625, this.anInt10422, this.anInt10436);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method8905();
		this.method8876(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		if (local16 == 0.0F && local23 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(44) float local44 = (float) (1.0D / Math.sqrt((double) (local23 * local23 + local16 * local16)));
			local23 *= local44;
			local16 *= local44;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, (float) arg3 + local23 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "()V")
	@Override
	public void method8851() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZILclient!gh;II)V")
	public void method8901(@OriginalArg(2) Interface10 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(11) int local11 = arg0.method1315();
		@Pc(18) int local18 = arg1 * this.method8894(local11);
		this.method8862(arg0);
		OpenGL.glDrawElements(4, arg2, local11, arg0.method1318() + (long) local18);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "()I")
	@Override
	public int method8780() {
		return 4;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!dh;IIII)Lclient!ka;")
	@Override
	public Class24 method8770(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(B)V")
	private void method8902() {
		@Pc(10) float[] local10 = this.aFloatArray81;
		@Pc(22) float local22 = (float) (-this.anInt10621 * this.anInt10628) / (float) this.anInt10613;
		@Pc(37) float local37 = (float) ((this.anInt10422 - this.anInt10621) * this.anInt10628) / (float) this.anInt10613;
		@Pc(48) float local48 = (float) (this.anInt10628 * this.anInt10607) / (float) this.anInt10614;
		@Pc(62) float local62 = (float) (this.anInt10628 * (this.anInt10607 - this.anInt10436)) / (float) this.anInt10614;
		if (local22 == local37 || local62 == local48) {
			local10[1] = 0.0F;
			local10[10] = 1.0F;
			local10[9] = 0.0F;
			local10[5] = 1.0F;
			local10[14] = 0.0F;
			local10[11] = 0.0F;
			local10[13] = 0.0F;
			local10[12] = 0.0F;
			local10[4] = 0.0F;
			local10[2] = 0.0F;
			local10[8] = 0.0F;
			local10[7] = 0.0F;
			local10[6] = 0.0F;
			local10[15] = 1.0F;
			local10[0] = 1.0F;
			local10[3] = 0.0F;
		} else {
			@Pc(76) float local76 = (float) this.anInt10628 * 2.0F;
			local10[4] = 0.0F;
			local10[6] = 0.0F;
			local10[2] = 0.0F;
			local10[10] = this.aFloat210 = (float) -(this.anInt10604 + this.anInt10628) / (float) (this.anInt10604 - this.anInt10628);
			local10[13] = 0.0F;
			local10[12] = 0.0F;
			local10[8] = (local22 + local37) / (local37 - local22);
			local10[0] = local76 / (local37 - local22);
			local10[3] = 0.0F;
			local10[1] = 0.0F;
			local10[15] = 0.0F;
			local10[5] = local76 / (local48 - local62);
			local10[7] = 0.0F;
			local10[9] = (local62 + local48) / (-local62 + local48);
			local10[14] = this.aFloat218 = -(local76 * (float) this.anInt10604) / (float) (this.anInt10604 - this.anInt10628);
			local10[11] = -1.0F;
		}
		this.method8888();
	}

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "(II)V")
	public void method8903(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method8880(7681, 7681);
		} else if (arg0 == 0) {
			this.method8880(8448, 8448);
		} else if (arg0 == 2) {
			this.method8880(7681, 34165);
		} else if (arg0 == 3) {
			this.method8880(8448, 260);
			return;
		} else if (arg0 == 4) {
			this.method8880(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "()Z")
	@Override
	public boolean method8809() {
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt10622 > arg2 + arg0 || arg0 - arg2 > this.anInt10608 || arg1 + arg2 < this.anInt10599 || arg1 - arg2 > this.anInt10600) {
			return;
		}
		this.method8905();
		this.method8876(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(76) float local76 = (float) arg0 + 0.35F;
		@Pc(81) float local81 = (float) arg1 + 0.35F;
		@Pc(85) int local85 = arg2 << 1;
		if (this.aFloat220 > (float) local85) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local76 + 1.0F, local81 + 1.0F);
			OpenGL.glVertex2f(local76 + 1.0F, local81 - 1.0F);
			OpenGL.glVertex2f(local76 - 1.0F, local81 - 1.0F);
			OpenGL.glVertex2f(local76 - 1.0F, local81 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat211 >= (float) local85) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local85);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local76, local81);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local76, local81);
			@Pc(140) int local140 = 262144 / (arg2 * 6);
			if (local140 <= 64) {
				local140 = 64;
			} else if (local140 > 512) {
				local140 = 512;
			}
			local140 = Static600.method8449(local140);
			OpenGL.glVertex2f((float) arg2 + local76, local81);
			for (@Pc(169) int local169 = 16384 - local140; local169 > 0; local169 -= local140) {
				OpenGL.glVertex2f(Class287.aFloatArray75[local169] * (float) arg2 + local76, local81 + Class287.aFloatArray74[local169] * (float) arg2);
			}
			OpenGL.glVertex2f(local76 + (float) arg2, local81);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "()Z")
	@Override
	public boolean method8795() {
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	@Override
	public void method8817(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "()V")
	@Override
	protected void method8826() {
		for (@Pc(6) Class6 local6 = this.aClass8_67.method149(); local6 != null; local6 = this.aClass8_67.method155()) {
			((Class6_Sub8_Sub1) local6).method1313();
		}
		if (this.aClass135_1 != null) {
			this.aClass135_1.method3655();
		}
		if (this.anOpenGL2 != null) {
			this.method8931();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean693) {
			Static252.method4536(false, true);
			this.aBoolean693 = false;
		}
	}

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "(I)V")
	@Override
	public void method8824(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt10583 = arg0;
		this.aClass42_1.method912();
	}

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wh", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass154_Sub3_3.aFloat159 * (float) arg0 + this.aClass154_Sub3_3.aFloat154 * (float) arg1 + this.aClass154_Sub3_3.aFloat158 * (float) arg2 + this.aClass154_Sub3_3.aFloat152;
		if ((float) this.anInt10628 > local28 || local28 > (float) this.anInt10604) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((this.aClass154_Sub3_3.aFloat161 * (float) arg2 + this.aClass154_Sub3_3.aFloat151 * (float) arg0 + this.aClass154_Sub3_3.aFloat155 * (float) arg1 + this.aClass154_Sub3_3.aFloat156) * (float) this.anInt10613 / (float) arg3);
		@Pc(119) int local119 = (int) (((float) arg0 * this.aClass154_Sub3_3.aFloat157 + this.aClass154_Sub3_3.aFloat153 * (float) arg1 + this.aClass154_Sub3_3.aFloat150 * (float) arg2 + this.aClass154_Sub3_3.aFloat160) * (float) this.anInt10614 / (float) arg3);
		if (this.aFloat223 <= (float) local86 && (float) local86 <= this.aFloat224 && this.aFloat229 <= (float) local119 && this.aFloat216 >= (float) local119) {
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local86 - this.aFloat223);
			arg4[1] = (int) ((float) local119 - this.aFloat229);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([IIIIIZ)Lclient!pga;")
	@Override
	public Class32 method8777(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class32_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class199 method8810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class199_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)I")
	@Override
	public int method8820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "(I)V")
	public void method8904() {
		if (this.anInt10594 == 2) {
			return;
		}
		this.method8860();
		this.method8863(false);
		this.method8926(false);
		this.method8858(false);
		this.method8864(false);
		this.method8895(-2);
		this.anInt10594 = 2;
	}

	@OriginalMember(owner = "client!wh", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat219) {
			this.aFloat219 = arg0;
			this.method8940();
		}
	}

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "(I)V")
	private void method8905() {
		if (this.anInt10594 == 1) {
			return;
		}
		this.method8860();
		this.method8863(false);
		this.method8926(false);
		this.method8858(false);
		this.method8864(false);
		this.method8925((Class3) null);
		this.method8895(-2);
		this.method8903(1);
		this.anInt10594 = 1;
	}

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "()Z")
	@Override
	public boolean method8836() {
		return this.aClass6_Sub25_Sub1_1 != null && (this.anInt10580 <= 1 || this.aBoolean699);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8819(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static124.aFloat31 = arg1;
		Static50.aFloat16 = arg2;
		Static68.aFloat23 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8905();
		this.method8876(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!wh", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass154_Sub3_3.aFloat159 * (float) arg0 + (float) arg1 * this.aClass154_Sub3_3.aFloat154 + (float) arg2 * this.aClass154_Sub3_3.aFloat158 + this.aClass154_Sub3_3.aFloat152;
		if ((float) this.anInt10628 > local28 || (float) this.anInt10604 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass154_Sub3_3.aFloat156 + (float) arg2 * this.aClass154_Sub3_3.aFloat161 + (float) arg0 * this.aClass154_Sub3_3.aFloat151 + this.aClass154_Sub3_3.aFloat155 * (float) arg1) * (float) this.anInt10613 / local28);
		@Pc(117) int local117 = (int) ((this.aClass154_Sub3_3.aFloat160 + (float) arg0 * this.aClass154_Sub3_3.aFloat157 + (float) arg1 * this.aClass154_Sub3_3.aFloat153 + this.aClass154_Sub3_3.aFloat150 * (float) arg2) * (float) this.anInt10614 / local28);
		if (this.aFloat223 <= (float) local85 && this.aFloat224 >= (float) local85 && (float) local117 >= this.aFloat229 && this.aFloat216 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat229);
			arg3[0] = (int) ((float) local85 - this.aFloat223);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "([I)V")
	@Override
	public void method8812(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt10422;
		arg0[1] = this.anInt10436;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!qk;B)V")
	public void method8906(@OriginalArg(0) Interface22 arg0) {
		if (this.anInt10590 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt10590 >= 0) {
			this.anInterface22Array2[this.anInt10590].method4086();
		}
		this.anInterface22_1 = this.anInterface22Array2[++this.anInt10590] = arg0;
		this.anInterface22_1.method4090();
	}

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt10616 && arg1 == this.anInt10597 && this.anInt10629 == arg2) {
			return;
		}
		this.anInt10597 = arg1;
		this.anInt10629 = arg2;
		this.anInt10616 = arg0;
		this.method8893();
		this.method8929();
	}

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "(I)V")
	public void method8907() {
		if (this.anInt10605 != 0) {
			this.anInt10605 = 0;
			this.anInt10594 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass3_Sub2_Sub1_5 == null || arg2 > this.aClass3_Sub2_Sub1_5.anInt4460 || arg3 > this.aClass3_Sub2_Sub1_5.anInt4455) {
			this.aClass3_Sub2_Sub1_5 = Static318.method5302(arg3, arg2, this, arg6);
			this.aClass3_Sub2_Sub1_5.method3904(false, false);
			local57 = this.aClass3_Sub2_Sub1_5.aFloat73;
			local45 = this.aClass3_Sub2_Sub1_5.aFloat74;
		} else {
			this.aClass3_Sub2_Sub1_5.method3903(arg2, arg6, arg3, 6406, false);
			local45 = this.aClass3_Sub2_Sub1_5.aFloat74 * (float) arg3 / (float) this.aClass3_Sub2_Sub1_5.anInt4455;
			local57 = this.aClass3_Sub2_Sub1_5.aFloat73 * (float) arg2 / (float) this.aClass3_Sub2_Sub1_5.anInt4460;
		}
		this.method8904();
		this.method8925(this.aClass3_Sub2_Sub1_5);
		this.method8876(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method8891(arg5);
		this.method8880(34165, 34165);
		this.method8889(34166, 0, 768);
		this.method8889(5890, 2, 770);
		this.method8923(34166, 0);
		this.method8923(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local57);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local45, local57);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method8889(5890, 0, 768);
		this.method8889(34166, 2, 770);
		this.method8923(5890, 0);
		this.method8923(34166, 2);
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)Lclient!za;")
	@Override
	public Class6_Sub8 method8841(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub8_Sub1 local8 = new Class6_Sub8_Sub1(arg0);
		this.aClass8_67.method157(local8);
		return local8;
	}

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "()V")
	@Override
	public void method8854() {
		if (this.aBoolean698) {
			if (this.aClass149_6 != this.anInterface22_1) {
				throw new RuntimeException();
			}
			this.aClass149_6.method4104(0);
			this.aClass149_6.method4104(8);
			this.method8896(this.aClass149_6);
		} else if (this.aBoolean715) {
			this.aClass32_Sub3_1.method5091(0, 0, this.anInt10422, this.anInt10436, 0, 0);
			this.anOpenGL2.setSurface(this.aLong273);
		} else {
			throw new RuntimeException("");
		}
		this.anInt10422 = this.anInt10536;
		this.anInt10436 = this.anInt10472;
		this.aClass32_Sub3_1 = null;
		this.method8907();
		this.method8900();
		this.la();
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)Lclient!bi;")
	@Override
	public Interface2 method8807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "(I)Lclient!nc;")
	public Class3_Sub4 method8908() {
		return this.aClass57_Sub1_1 == null ? null : this.aClass57_Sub1_1.method1534();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8781(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "(I)V")
	public void method8909() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "(II)V")
	public synchronized void method8910(@OriginalArg(0) int arg0) {
		@Pc(14) Class6_Sub48 local14 = new Class6_Sub48(arg0);
		this.aClass8_71.method157(local14);
	}

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "(I)V")
	private void method8911() {
		if (this.anInt10605 != 3) {
			this.anInt10605 = 3;
			this.method8892();
			this.method8859();
			this.anInt10594 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIZ)Lclient!pga;")
	@Override
	public Class32 method8804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class32_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8830() {
		return this.aClass154_Sub3_3;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(IIII)V")
	public void method8912(@OriginalArg(0) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLclient!wia;)V")
	public void method8913(@OriginalArg(1) Interface27 arg0) {
		if (arg0 != this.anInterface27_6) {
			if (this.aBoolean724) {
				OpenGL.glBindBufferARB(34962, arg0.method4866());
			}
			this.anInterface27_6 = arg0;
		}
	}

	@OriginalMember(owner = "client!wh", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean704 = false;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)V")
	public synchronized void method8914(@OriginalArg(0) long arg0) {
		@Pc(12) Class6 local12 = new Class6();
		local12.aLong278 = arg0;
		this.aClass8_74.method157(local12);
	}

	@OriginalMember(owner = "client!wh", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method8905();
		this.method8876(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean711) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean711) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!ou;)V")
	public void method8915(@OriginalArg(1) Class154_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6578(), 0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z[BIII)Lclient!gh;")
	public Interface10 method8916(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		return (Interface10) (this.aBoolean724 && (!arg0 || this.aBoolean718) ? new Class44_Sub1(this, 5123, arg1, arg2, arg0) : new Class54_Sub1(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!wh", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method8864(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "()Z")
	@Override
	public boolean method8811() {
		if (this.aClass6_Sub25_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass6_Sub25_Sub1_1.method3997()) {
			if (!this.aClass135_1.method3653(this.aClass6_Sub25_Sub1_1)) {
				return false;
			}
			this.aClass42_1.method912();
		}
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!qk;)V")
	public void method8917(@OriginalArg(1) Interface22 arg0) {
		if (this.anInt10589 < 0 || this.anInterface22Array3[this.anInt10589] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface22Array3[this.anInt10589--] = null;
		arg0.method4088();
		if (this.anInt10589 >= 0) {
			this.anInterface22_2 = this.anInterface22Array3[this.anInt10589];
			this.anInterface22_2.method4087();
		} else {
			this.anInterface22_2 = null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(B)V")
	public void method8918() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt10621, this.anInt10607, this.anInt10613, this.anInt10614 };
	}

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "()Z")
	@Override
	public boolean method8840() {
		return this.aBoolean711 && (!this.method8784() || this.aBoolean699);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BFF)V")
	public void method8919(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat230 = arg1;
		this.aFloat227 = arg0;
		this.method8893();
	}

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt10593 + this.anInt10591 + this.anInt10592;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10628 == arg0 && this.anInt10604 == arg1) {
			return;
		}
		this.anInt10628 = arg0;
		this.anInt10604 = arg1;
		this.method8902();
		this.method8893();
		if (this.anInt10605 == 3) {
			this.method8892();
		} else if (this.anInt10605 == 2) {
			this.method8884();
			return;
		}
	}

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "(I)V")
	public void method8920() {
		if (this.anInt10594 == 16) {
			return;
		}
		this.method8911();
		this.method8863(true);
		this.method8858(true);
		this.method8864(true);
		this.method8876(1);
		this.anInt10594 = 16;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IFFFF)V")
	public void method8922(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static378.aFloatArray55[3] = arg3;
		Static378.aFloatArray55[1] = arg1;
		Static378.aFloatArray55[0] = arg0;
		Static378.aFloatArray55[2] = arg2;
		OpenGL.glTexEnvfv(8960, 8705, Static378.aFloatArray55, 0);
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(IIII)V")
	public void method8923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "()Lclient!ql;")
	@Override
	public Class154 method8838() {
		return new Class154_Sub3();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static172.method3152(arg1, arg0, this, arg3, arg2);
	}

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg1;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_2;
		this.method8904();
		this.method8925(local6.aClass3_Sub2_Sub1_2);
		this.method8876(1);
		this.method8880(8448, 7681);
		this.method8889(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat73 / (float) local9.anInt4469;
		@Pc(46) float local46 = local9.aFloat74 / (float) local9.anInt4472;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt10622 - arg2) * local39, local46 * (float) (this.anInt10599 - arg3));
		OpenGL.glVertex2i(this.anInt10622, this.anInt10599);
		OpenGL.glTexCoord2f((float) (this.anInt10622 - arg2) * local39, (float) (this.anInt10600 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10622, this.anInt10600);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt10608 - arg2), local46 * (float) (this.anInt10600 - arg3));
		OpenGL.glVertex2i(this.anInt10608, this.anInt10600);
		OpenGL.glTexCoord2f((float) (this.anInt10608 - arg2) * local39, (float) (this.anInt10599 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt10608, this.anInt10599);
		OpenGL.glEnd();
		this.method8889(5890, 0, 768);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8769(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas13) {
			local5 = this.aLong274;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas12 == arg0) {
			this.method8878();
		}
	}

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method8905();
		this.method8876(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!wh", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt10422 < arg2) {
			arg2 = this.anInt10422;
		}
		if (arg3 > this.anInt10436) {
			arg3 = this.anInt10436;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt10608 = arg2;
		this.anInt10600 = arg3;
		this.anInt10622 = arg0;
		this.anInt10599 = arg1;
		OpenGL.glEnable(3089);
		this.method8866();
		this.method8890();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!me;I)V")
	public void method8925(@OriginalArg(0) Class3 arg0) {
		@Pc(17) Class3 local17 = this.aClass3Array1[this.anInt10603];
		if (local17 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local17.anInt6738);
			} else {
				if (local17 == null) {
					OpenGL.glEnable(arg0.anInt6738);
				} else if (arg0.anInt6738 != local17.anInt6738) {
					OpenGL.glDisable(local17.anInt6738);
					OpenGL.glEnable(arg0.anInt6738);
				}
				OpenGL.glBindTexture(arg0.anInt6738, arg0.method5780());
			}
			this.aClass3Array1[this.anInt10603] = arg0;
		}
		this.anInt10594 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method8818(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class6_Sub48 local19;
		while (!this.aClass8_69.method151()) {
			local19 = (Class6_Sub48) this.aClass8_69.method152();
			Static76.anIntArray111[local7++] = (int) local19.aLong278;
			this.anInt10593 -= local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static76.anIntArray111, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static76.anIntArray111, 0);
			local7 = 0;
		}
		while (!this.aClass8_70.method151()) {
			local19 = (Class6_Sub48) this.aClass8_70.method152();
			Static76.anIntArray111[local7++] = (int) local19.aLong278;
			this.anInt10591 -= local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static76.anIntArray111, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static76.anIntArray111, 0);
			local7 = 0;
		}
		while (!this.aClass8_71.method151()) {
			local19 = (Class6_Sub48) this.aClass8_71.method152();
			Static76.anIntArray111[local7++] = local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static76.anIntArray111, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static76.anIntArray111, 0);
			local7 = 0;
		}
		while (!this.aClass8_72.method151()) {
			local19 = (Class6_Sub48) this.aClass8_72.method152();
			Static76.anIntArray111[local7++] = (int) local19.aLong278;
			this.anInt10592 -= local19.anInt9611;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static76.anIntArray111, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static76.anIntArray111, 0);
		}
		while (!this.aClass8_68.method151()) {
			local19 = (Class6_Sub48) this.aClass8_68.method152();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9611);
		}
		@Pc(216) Class6 local216;
		while (!this.aClass8_73.method151()) {
			local216 = this.aClass8_73.method152();
			OpenGL.glDeleteProgramARB((int) local216.aLong278);
		}
		while (!this.aClass8_74.method151()) {
			local216 = this.aClass8_74.method152();
			OpenGL.glDeleteObjectARB(local216.aLong278);
		}
		while (!this.aClass8_68.method151()) {
			local19 = (Class6_Sub48) this.aClass8_68.method152();
			OpenGL.glDeleteLists((int) local19.aLong278, local19.anInt9611);
		}
		this.aClass42_1.method915();
		if (this.E() > 100663296 && this.aLong275 + 60000L < Static32.method595()) {
			System.gc();
			this.aLong275 = Static32.method595();
		}
		this.anInt10585 = local11;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!om;Lclient!om;FLclient!om;)Lclient!om;")
	@Override
	public Class57 method8827(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class57 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean701 && this.aBoolean698) {
			@Pc(15) Class57_Sub1_Sub2 local15 = null;
			@Pc(18) Class57_Sub1 local18 = (Class57_Sub1) arg0;
			@Pc(21) Class57_Sub1 local21 = (Class57_Sub1) arg1;
			@Pc(25) Class3_Sub4 local25 = local18.method1534();
			@Pc(29) Class3_Sub4 local29 = local21.method1534();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt6748 < local25.anInt6748 ? local25.anInt6748 : local29.anInt6748;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class57_Sub1_Sub2) {
					@Pc(56) Class57_Sub1_Sub2 local56 = (Class57_Sub1_Sub2) arg3;
					if (local44 == local56.method1541()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class57_Sub1_Sub2(this, local44);
				}
				if (local15.method1537(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg3 == arg1) {
			return;
		}
		this.method8905();
		this.method8876(1);
		@Pc(34) float local34 = (float) -arg0 + (float) arg2;
		@Pc(41) float local41 = (float) -arg1 + (float) arg3;
		@Pc(54) float local54 = (float) (1.0D / Math.sqrt((double) (local34 * local34 + local41 * local41)));
		@Pc(58) float local58 = local34 * local54;
		@Pc(62) float local62 = local41 * local54;
		@Pc(68) int local68 = arg7 % (arg5 + arg6);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(88) float local88 = local58 * (float) arg5;
		@Pc(93) float local93 = (float) arg5 * local62;
		@Pc(95) float local95 = 0.0F;
		@Pc(97) float local97 = 0.0F;
		@Pc(99) float local99 = local88;
		@Pc(101) float local101 = local93;
		if (arg5 >= local68) {
			local99 = local58 * (float) (arg5 - local68);
			local101 = (float) (arg5 - local68) * local62;
		} else {
			local95 = local58 * (float) (arg5 + arg6 - local68);
			local97 = (float) (arg6 + arg5 - local68) * local62;
		}
		@Pc(153) float local153 = (float) arg0 + local95 + 0.35F;
		@Pc(160) float local160 = (float) arg1 + local97 + 0.35F;
		@Pc(165) float local165 = local58 * (float) arg6;
		@Pc(170) float local170 = local62 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if ((float) arg2 + 0.35F < local153) {
					break;
				}
				if ((float) arg2 < local99 + local153) {
					local99 = (float) arg2 - local153;
				}
			} else {
				if (local153 < (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 > local153 + local99) {
					local99 = (float) arg2 - local153;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local160) {
					break;
				}
				if (local160 + local101 < (float) arg3) {
					local101 = (float) arg3 - local160;
				}
			} else {
				if (local160 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local160 + local101) {
					local101 = (float) arg3 - local160;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local153, local160);
			OpenGL.glVertex2f(local153 + local99, local101 + local160);
			OpenGL.glEnd();
			local160 += local170 + local101;
			local153 += local165 + local99;
			local101 = local93;
			local99 = local88;
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(ZI)V")
	public void method8926(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean717) {
			this.aBoolean717 = arg0;
			this.method8932();
			this.anInt10594 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII)V")
	public void method8927(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method8869(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "()V")
	@Override
	public void method8852() {
		this.aClass135_1.method3660();
	}

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "(II)I")
	public int method8928(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "(B)V")
	private void method8929() {
		if (this.aBoolean716 && this.anInt10597 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V")
	@Override
	public void method8813(@OriginalArg(0) int arg0) {
		this.method8931();
	}

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "()V")
	@Override
	public void method8806() {
		if (!this.aBoolean702 || this.anInt10422 <= 0 || this.anInt10436 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt10622;
		@Pc(22) int local22 = this.anInt10608;
		@Pc(25) int local25 = this.anInt10599;
		@Pc(28) int local28 = this.anInt10600;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method8907();
		this.method8863(false);
		this.method8926(false);
		this.method8858(false);
		this.method8864(false);
		this.method8925((Class3) null);
		this.method8895(-2);
		this.method8903(1);
		this.method8876(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt10422, this.anInt10436, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt10630;
		this.anInt10630 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!wh", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt10622 = 0;
		this.anInt10599 = 0;
		this.anInt10608 = this.anInt10422;
		this.anInt10600 = this.anInt10436;
		OpenGL.glDisable(3089);
		this.method8866();
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)V")
	public void method8930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10617 = arg0;
		this.anInt10625 = arg1;
		this.method8900();
		this.method8890();
	}

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "()Z")
	@Override
	public boolean method8848() {
		return true;
	}

	@OriginalMember(owner = "client!wh", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt10604;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(IIIIII)Lclient!om;")
	@Override
	public Class57 method8829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean701 ? new Class57_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!wh", name = "C", descriptor = "(I)V")
	private void method8931() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "(I)V")
	private void method8932() {
		if (this.aBoolean717 && !this.aBoolean712) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(III)V")
	public synchronized void method8934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub48 local8 = new Class6_Sub48(arg1);
		local8.aLong278 = (long) arg0;
		this.aClass8_69.method157(local8);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(Lclient!qk;I)V")
	public void method8935(@OriginalArg(0) Interface22 arg0) {
		if (this.aBoolean720) {
			this.method8879(arg0);
			this.method8906(arg0);
		} else if (this.anInt10588 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt10588 >= 0) {
				this.anInterface22Array1[this.anInt10588].method4085();
			}
			this.anInterface22_2 = this.anInterface22_1 = this.anInterface22Array1[++this.anInt10588] = arg0;
			this.anInterface22_2.method4089();
		}
	}

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt10599;
		arg0[3] = this.anInt10600;
		arg0[0] = this.anInt10622;
		arg0[2] = this.anInt10608;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
	@Override
	public void method8775(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ou;I)V")
	public void method8936(@OriginalArg(0) Class154_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6578(), 0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass135_1.method3654(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
	@Override
	public void method8776() {
		if (this.aClass6_Sub25_Sub1_1 != null && this.aClass6_Sub25_Sub1_1.method3997()) {
			this.aClass135_1.method3657(this.aClass6_Sub25_Sub1_1);
			this.aClass42_1.method912();
		}
	}

	@OriginalMember(owner = "client!wh", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt10587 = 0;
		while (arg0 > 1) {
			this.anInt10587++;
			arg0 >>= 0x1;
		}
		this.anInt10586 = 0x1 << this.anInt10587;
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(Z)V")
	private void method8937() {
		OpenGL.glDepthMask(this.aBoolean694 && this.aBoolean703);
	}

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "(II)I")
	public int method8938(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!bi;Lclient!dk;)Lclient!pk;")
	@Override
	public Interface20 method8839(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Interface5 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt10600) {
			this.anInt10600 = arg3;
		}
		if (arg2 < this.anInt10608) {
			this.anInt10608 = arg2;
		}
		if (this.anInt10599 < arg1) {
			this.anInt10599 = arg1;
		}
		if (arg0 > this.anInt10622) {
			this.anInt10622 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method8866();
		this.method8890();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIF)Lclient!raa;")
	@Override
	public Class6_Sub1 method8786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class6_Sub1_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "(I)I")
	private int method8939() {
		this.aString117 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString118 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString117.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString117.indexOf("brian paul") != -1 || this.aString117.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static513.method7614(local45.replace('.', ' '), ' ');
		if (local53.length >= 2) {
			try {
				@Pc(63) int local63 = Static355.method5682(local53[0]);
				@Pc(69) int local69 = Static355.method5682(local53[1]);
				this.anInt10624 = local69 + local63 * 10;
			} catch (@Pc(78) NumberFormatException local78) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt10624 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(127) int[] local127 = new int[1];
		OpenGL.glGetIntegerv(34018, local127, 0);
		this.anInt10610 = local127[0];
		OpenGL.glGetIntegerv(34929, local127, 0);
		this.anInt10598 = local127[0];
		OpenGL.glGetIntegerv(34930, local127, 0);
		this.anInt10623 = local127[0];
		if (this.anInt10610 < 2 || this.anInt10598 < 2 || this.anInt10623 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean700 = Stream.b();
		this.aBoolean715 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean724 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean711 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean719 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean706 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean714 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean722 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean710 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean701 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean723 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean709 = false;
		this.aBoolean698 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean720 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean707 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean699 = this.aBoolean720 & this.aBoolean707;
		this.aBoolean721 = Class138.aString50.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static378.aFloatArray55, 0);
		this.aFloat220 = Static378.aFloatArray55[0];
		this.aFloat211 = Static378.aFloatArray55[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "(I)V")
	private void method8940() {
		Static378.aFloatArray55[1] = this.aFloat219 * this.aFloat222;
		Static378.aFloatArray55[3] = 1.0F;
		Static378.aFloatArray55[0] = this.aFloat219 * this.aFloat221;
		Static378.aFloatArray55[2] = this.aFloat219 * this.aFloat217;
		OpenGL.glLightModelfv(2899, Static378.aFloatArray55, 0);
	}

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "(B)V")
	private void method8941() {
		if (this.anInt10605 != 2) {
			this.anInt10605 = 2;
			this.method8884();
			this.method8859();
			this.anInt10594 &= 0xFFFFFFF8;
		}
	}
}
