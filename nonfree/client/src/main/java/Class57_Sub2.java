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

@OriginalClass("client!ffa")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!ffa", name = "Cd", descriptor = "I")
	private int anInt2575;

	@OriginalMember(owner = "client!ffa", name = "bb", descriptor = "I")
	public int anInt2598;

	@OriginalMember(owner = "client!ffa", name = "vh", descriptor = "I")
	private int anInt2644;

	@OriginalMember(owner = "client!ffa", name = "vb", descriptor = "I")
	public int anInt2652;

	@OriginalMember(owner = "client!ffa", name = "jc", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ffa", name = "jg", descriptor = "I")
	public int anInt2750;

	@OriginalMember(owner = "client!ffa", name = "G", descriptor = "Lclient!qda;")
	private Class134_Sub2 aClass134_Sub2_1;

	@OriginalMember(owner = "client!ffa", name = "rd", descriptor = "Lclient!nk;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!ffa", name = "ce", descriptor = "Lclient!ct;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!ffa", name = "sf", descriptor = "Lclient!nk;")
	private Interface17 anInterface17_2;

	@OriginalMember(owner = "client!ffa", name = "Zf", descriptor = "I")
	private int anInt2754;

	@OriginalMember(owner = "client!ffa", name = "cb", descriptor = "I")
	public int anInt2755;

	@OriginalMember(owner = "client!ffa", name = "Tf", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!ffa", name = "ub", descriptor = "Z")
	private boolean aBoolean205;

	@OriginalMember(owner = "client!ffa", name = "mc", descriptor = "I")
	private int anInt2757;

	@OriginalMember(owner = "client!ffa", name = "vd", descriptor = "I")
	private int anInt2758;

	@OriginalMember(owner = "client!ffa", name = "tb", descriptor = "Z")
	private boolean aBoolean206;

	@OriginalMember(owner = "client!ffa", name = "ec", descriptor = "I")
	private int anInt2759;

	@OriginalMember(owner = "client!ffa", name = "kh", descriptor = "Z")
	private boolean aBoolean207;

	@OriginalMember(owner = "client!ffa", name = "Bg", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!ffa", name = "Yc", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!ffa", name = "rh", descriptor = "Lclient!uo;")
	public Class356 aClass356_5;

	@OriginalMember(owner = "client!ffa", name = "gf", descriptor = "Z")
	private boolean aBoolean209;

	@OriginalMember(owner = "client!ffa", name = "fc", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_1;

	@OriginalMember(owner = "client!ffa", name = "cf", descriptor = "Lclient!cm;")
	private Class29_Sub2 aClass29_Sub2_1;

	@OriginalMember(owner = "client!ffa", name = "wb", descriptor = "F")
	private float aFloat33;

	@OriginalMember(owner = "client!ffa", name = "he", descriptor = "Z")
	public boolean aBoolean210;

	@OriginalMember(owner = "client!ffa", name = "Cc", descriptor = "I")
	private int anInt2763;

	@OriginalMember(owner = "client!ffa", name = "Id", descriptor = "[Lclient!mw;")
	private Class32[] aClass32Array1;

	@OriginalMember(owner = "client!ffa", name = "Qd", descriptor = "Z")
	public boolean aBoolean211;

	@OriginalMember(owner = "client!ffa", name = "Ce", descriptor = "Lclient!ml;")
	private Interface15 anInterface15_2;

	@OriginalMember(owner = "client!ffa", name = "Jb", descriptor = "I")
	private int anInt2764;

	@OriginalMember(owner = "client!ffa", name = "xg", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_2;

	@OriginalMember(owner = "client!ffa", name = "sh", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_3;

	@OriginalMember(owner = "client!ffa", name = "Xe", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "client!ffa", name = "Ge", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!ffa", name = "Lc", descriptor = "I")
	private int anInt2768;

	@OriginalMember(owner = "client!ffa", name = "rf", descriptor = "I")
	public int anInt2769;

	@OriginalMember(owner = "client!ffa", name = "ze", descriptor = "F")
	public float aFloat34;

	@OriginalMember(owner = "client!ffa", name = "jb", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_4;

	@OriginalMember(owner = "client!ffa", name = "Je", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_5;

	@OriginalMember(owner = "client!ffa", name = "xb", descriptor = "I")
	private int anInt2771;

	@OriginalMember(owner = "client!ffa", name = "ue", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!ffa", name = "mb", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!ffa", name = "Mg", descriptor = "Lclient!uo;")
	public Class356 aClass356_6;

	@OriginalMember(owner = "client!ffa", name = "Wb", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_6;

	@OriginalMember(owner = "client!ffa", name = "oh", descriptor = "F")
	private float aFloat37;

	@OriginalMember(owner = "client!ffa", name = "ye", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!ffa", name = "Q", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!ffa", name = "hc", descriptor = "Lclient!ct;")
	public Class76 aClass76_2;

	@OriginalMember(owner = "client!ffa", name = "og", descriptor = "I")
	public int anInt2775;

	@OriginalMember(owner = "client!ffa", name = "vc", descriptor = "Z")
	public boolean aBoolean220;

	@OriginalMember(owner = "client!ffa", name = "Cb", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!ffa", name = "Nb", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_7;

	@OriginalMember(owner = "client!ffa", name = "Ye", descriptor = "Z")
	private boolean aBoolean223;

	@OriginalMember(owner = "client!ffa", name = "W", descriptor = "Z")
	public boolean aBoolean224;

	@OriginalMember(owner = "client!ffa", name = "Ec", descriptor = "Z")
	private boolean aBoolean225;

	@OriginalMember(owner = "client!ffa", name = "Db", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!ffa", name = "O", descriptor = "Lclient!bca;")
	public Class32_Sub1 aClass32_Sub1_2;

	@OriginalMember(owner = "client!ffa", name = "Zb", descriptor = "Z")
	public boolean aBoolean228;

	@OriginalMember(owner = "client!ffa", name = "Rg", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_8;

	@OriginalMember(owner = "client!ffa", name = "pc", descriptor = "Lclient!ml;")
	private Interface15 anInterface15_3;

	@OriginalMember(owner = "client!ffa", name = "ge", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_9;

	@OriginalMember(owner = "client!ffa", name = "Ug", descriptor = "I")
	private int anInt2781;

	@OriginalMember(owner = "client!ffa", name = "Sf", descriptor = "Z")
	public boolean aBoolean230;

	@OriginalMember(owner = "client!ffa", name = "gc", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!ffa", name = "Hg", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!ffa", name = "be", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!ffa", name = "ah", descriptor = "F")
	private float aFloat45;

	@OriginalMember(owner = "client!ffa", name = "ih", descriptor = "Lclient!raa;")
	private Interface21 anInterface21_3;

	@OriginalMember(owner = "client!ffa", name = "Xf", descriptor = "Lclient!gda;")
	private Class32_Sub1_Sub1 aClass32_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ffa", name = "dh", descriptor = "I")
	public int anInt2786;

	@OriginalMember(owner = "client!ffa", name = "db", descriptor = "Lclient!jb;")
	public Class164_Sub2 aClass164_Sub2_10;

	@OriginalMember(owner = "client!ffa", name = "wg", descriptor = "Ljava/lang/String;")
	private String aString42;

	@OriginalMember(owner = "client!ffa", name = "bg", descriptor = "I")
	private int anInt2790;

	@OriginalMember(owner = "client!ffa", name = "Qf", descriptor = "I")
	private int anInt2791;

	@OriginalMember(owner = "client!ffa", name = "Ze", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!ffa", name = "sd", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!ffa", name = "kg", descriptor = "I")
	public int anInt2793;

	@OriginalMember(owner = "client!ffa", name = "Vg", descriptor = "Ljava/lang/String;")
	private String aString43;

	@OriginalMember(owner = "client!ffa", name = "Ie", descriptor = "I")
	private int anInt2794;

	@OriginalMember(owner = "client!ffa", name = "Pf", descriptor = "I")
	private int anInt2795;

	@OriginalMember(owner = "client!ffa", name = "Gc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!ffa", name = "If", descriptor = "I")
	public int anInt2745 = 128;

	@OriginalMember(owner = "client!ffa", name = "E", descriptor = "Lclient!km;")
	private final Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!ffa", name = "qg", descriptor = "Lclient!ob;")
	private final Class203_Sub2 aClass203_Sub2_1 = new Class203_Sub2();

	@OriginalMember(owner = "client!ffa", name = "uh", descriptor = "Lclient!ob;")
	public final Class203_Sub2 aClass203_Sub2_2 = new Class203_Sub2();

	@OriginalMember(owner = "client!ffa", name = "ff", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ffa", name = "P", descriptor = "I")
	public int anInt2748 = 8;

	@OriginalMember(owner = "client!ffa", name = "Fb", descriptor = "I")
	public int anInt2749 = 3;

	@OriginalMember(owner = "client!ffa", name = "lg", descriptor = "Lclient!ef;")
	private final Class102 aClass102_17 = new Class102();

	@OriginalMember(owner = "client!ffa", name = "nf", descriptor = "[Lclient!nk;")
	private final Interface17[] anInterface17Array1 = new Interface17[4];

	@OriginalMember(owner = "client!ffa", name = "rg", descriptor = "I")
	private int anInt2751 = -1;

	@OriginalMember(owner = "client!ffa", name = "tc", descriptor = "I")
	private int anInt2752 = -1;

	@OriginalMember(owner = "client!ffa", name = "gd", descriptor = "[Lclient!nk;")
	private final Interface17[] anInterface17Array3 = new Interface17[4];

	@OriginalMember(owner = "client!ffa", name = "of", descriptor = "[Lclient!nk;")
	private final Interface17[] anInterface17Array2 = new Interface17[4];

	@OriginalMember(owner = "client!ffa", name = "id", descriptor = "I")
	private int anInt2753 = -1;

	@OriginalMember(owner = "client!ffa", name = "R", descriptor = "Lclient!ef;")
	private final Class102 aClass102_18;

	@OriginalMember(owner = "client!ffa", name = "De", descriptor = "Lclient!ef;")
	private final Class102 aClass102_19;

	@OriginalMember(owner = "client!ffa", name = "Mb", descriptor = "Lclient!ef;")
	private final Class102 aClass102_20;

	@OriginalMember(owner = "client!ffa", name = "Of", descriptor = "Lclient!ef;")
	private final Class102 aClass102_21;

	@OriginalMember(owner = "client!ffa", name = "Ob", descriptor = "Lclient!ef;")
	private final Class102 aClass102_22;

	@OriginalMember(owner = "client!ffa", name = "Kf", descriptor = "Lclient!ef;")
	private final Class102 aClass102_23;

	@OriginalMember(owner = "client!ffa", name = "rb", descriptor = "Lclient!ef;")
	private final Class102 aClass102_24;

	@OriginalMember(owner = "client!ffa", name = "kc", descriptor = "Lclient!ob;")
	public final Class203_Sub2 aClass203_Sub2_3;

	@OriginalMember(owner = "client!ffa", name = "Qe", descriptor = "Lclient!ob;")
	public final Class203_Sub2 aClass203_Sub2_4;

	@OriginalMember(owner = "client!ffa", name = "Kc", descriptor = "Lclient!ob;")
	public final Class203_Sub2 aClass203_Sub2_5;

	@OriginalMember(owner = "client!ffa", name = "lb", descriptor = "[F")
	public final float[] lb;

	@OriginalMember(owner = "client!ffa", name = "bf", descriptor = "F")
	private float bf;

	@OriginalMember(owner = "client!ffa", name = "Xb", descriptor = "I")
	private int anInt2762;

	@OriginalMember(owner = "client!ffa", name = "ab", descriptor = "I")
	public int anInt2766;

	@OriginalMember(owner = "client!ffa", name = "Rc", descriptor = "F")
	private float aFloat32;

	@OriginalMember(owner = "client!ffa", name = "Lg", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!ffa", name = "lf", descriptor = "I")
	private int anInt2772;

	@OriginalMember(owner = "client!ffa", name = "Gf", descriptor = "I")
	private int anInt2773;

	@OriginalMember(owner = "client!ffa", name = "yh", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!ffa", name = "Se", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!ffa", name = "Eg", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!ffa", name = "th", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!ffa", name = "Bb", descriptor = "I")
	public int anInt2765;

	@OriginalMember(owner = "client!ffa", name = "J", descriptor = "F")
	public float aFloat42;

	@OriginalMember(owner = "client!ffa", name = "xe", descriptor = "I")
	private int anInt2770;

	@OriginalMember(owner = "client!ffa", name = "Nf", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!ffa", name = "fd", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!ffa", name = "Wg", descriptor = "I")
	public int anInt2778;

	@OriginalMember(owner = "client!ffa", name = "oc", descriptor = "I")
	public int anInt2782;

	@OriginalMember(owner = "client!ffa", name = "Kg", descriptor = "I")
	public int anInt2779;

	@OriginalMember(owner = "client!ffa", name = "Jf", descriptor = "[F")
	private final float[] aFloatArray23;

	@OriginalMember(owner = "client!ffa", name = "Ng", descriptor = "[F")
	private final float[] aFloatArray24;

	@OriginalMember(owner = "client!ffa", name = "Z", descriptor = "F")
	private float aFloat47;

	@OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
	public int anInt2780;

	@OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
	public int anInt2785;

	@OriginalMember(owner = "client!ffa", name = "tf", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!ffa", name = "T", descriptor = "I")
	public int anInt2776;

	@OriginalMember(owner = "client!ffa", name = "Kb", descriptor = "I")
	private int anInt2789;

	@OriginalMember(owner = "client!ffa", name = "Xd", descriptor = "I")
	private int anInt2787;

	@OriginalMember(owner = "client!ffa", name = "Uf", descriptor = "I")
	private int anInt2774;

	@OriginalMember(owner = "client!ffa", name = "gh", descriptor = "I")
	public int anInt2788;

	@OriginalMember(owner = "client!ffa", name = "Cg", descriptor = "[Lclient!uf;")
	private final Class5_Sub43[] aClass5_Sub43Array1;

	@OriginalMember(owner = "client!ffa", name = "kf", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!ffa", name = "gb", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!ffa", name = "wd", descriptor = "I")
	private int anInt2784;

	@OriginalMember(owner = "client!ffa", name = "Ff", descriptor = "[F")
	private final float[] aFloatArray22;

	@OriginalMember(owner = "client!ffa", name = "df", descriptor = "I")
	public int anInt2777;

	@OriginalMember(owner = "client!ffa", name = "ne", descriptor = "[F")
	private final float[] aFloatArray25;

	@OriginalMember(owner = "client!ffa", name = "dd", descriptor = "I")
	public int anInt2792;

	@OriginalMember(owner = "client!ffa", name = "Ee", descriptor = "F")
	private float aFloat49;

	@OriginalMember(owner = "client!ffa", name = "md", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!ffa", name = "pb", descriptor = "Lclient!jo;")
	public Class5_Sub23_Sub1 aClass5_Sub23_Sub1_1;

	@OriginalMember(owner = "client!ffa", name = "eh", descriptor = "[I")
	public int[] anIntArray146;

	@OriginalMember(owner = "client!ffa", name = "nd", descriptor = "[I")
	public int[] anIntArray145;

	@OriginalMember(owner = "client!ffa", name = "bc", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!ffa", name = "ud", descriptor = "[B")
	public final byte[] aByteArray13;

	@OriginalMember(owner = "client!ffa", name = "uf", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas3;

	@OriginalMember(owner = "client!ffa", name = "Lb", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ffa", name = "Ne", descriptor = "I")
	public final int anInt2741;

	@OriginalMember(owner = "client!ffa", name = "cc", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ffa", name = "ie", descriptor = "J")
	private final long aLong78;

	@OriginalMember(owner = "client!ffa", name = "X", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!ffa", name = "Ud", descriptor = "I")
	public final int anInt2760;

	@OriginalMember(owner = "client!ffa", name = "Vd", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!ffa", name = "Yd", descriptor = "Z")
	private boolean aBoolean226;

	@OriginalMember(owner = "client!ffa", name = "gg", descriptor = "Z")
	public boolean aBoolean233;

	@OriginalMember(owner = "client!ffa", name = "Pe", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!ffa", name = "ng", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!ffa", name = "ed", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!ffa", name = "Gg", descriptor = "Z")
	public boolean aBoolean234;

	@OriginalMember(owner = "client!ffa", name = "sc", descriptor = "Z")
	private final boolean aBoolean229;

	@OriginalMember(owner = "client!ffa", name = "ld", descriptor = "Lclient!wv;")
	private final Class394 aClass394_1;

	@OriginalMember(owner = "client!ffa", name = "hh", descriptor = "Lclient!ug;")
	public final Class346 aClass346_1;

	@OriginalMember(owner = "client!ffa", name = "Mf", descriptor = "Lclient!ip;")
	private final Class177 aClass177_1;

	@OriginalMember(owner = "client!ffa", name = "hd", descriptor = "Lclient!lea;")
	private Class5_Sub34_Sub1 aClass5_Sub34_Sub1_1;

	@OriginalMember(owner = "client!ffa", name = "Df", descriptor = "Lclient!st;")
	private final Class327 aClass327_1;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class57_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface1 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class149();
		new Class291(16);
		this.aClass102_18 = new Class102();
		this.aClass102_19 = new Class102();
		this.aClass102_20 = new Class102();
		this.aClass102_21 = new Class102();
		this.aClass102_22 = new Class102();
		this.aClass102_23 = new Class102();
		this.aClass102_24 = new Class102();
		this.aClass203_Sub2_3 = new Class203_Sub2();
		this.aClass203_Sub2_4 = new Class203_Sub2();
		this.aClass203_Sub2_5 = new Class203_Sub2();
		this.lb = new float[4];
		this.bf = -1.0F;
		this.anInt2762 = 8448;
		this.anInt2766 = -1;
		this.aFloat32 = 0.0F;
		this.aFloat40 = 1.0F;
		this.anInt2772 = 3584;
		this.anInt2773 = 0;
		this.aBoolean221 = true;
		this.aFloat36 = -1.0F;
		this.anInt2761 = 0;
		this.aFloat39 = 3584.0F;
		this.anInt2765 = 0;
		this.aFloat42 = -1.0F;
		this.anInt2770 = 0;
		this.anInt2783 = 0;
		this.aFloat41 = -1.0F;
		this.anInt2778 = 512;
		this.anInt2782 = 50;
		this.anInt2779 = 0;
		this.aFloatArray23 = new float[4];
		this.aFloatArray24 = new float[4];
		this.aFloat47 = 1.0F;
		this.anInt2780 = 0;
		this.anInt2785 = -1;
		this.aFloat38 = 1.0F;
		this.anInt2776 = 512;
		this.anInt2789 = -1;
		this.anInt2787 = 0;
		this.anInt2774 = 8448;
		this.anInt2788 = -1;
		this.aClass5_Sub43Array1 = new Class5_Sub43[Static495.anInt8274];
		this.aFloat46 = 3584.0F;
		this.aFloat48 = 1.0F;
		this.anInt2784 = 0;
		this.aFloatArray22 = new float[4];
		this.anInt2777 = -1;
		this.aFloatArray25 = new float[16];
		this.anInt2792 = 0;
		this.aFloat49 = 1.0F;
		this.aBoolean235 = false;
		this.aClass5_Sub23_Sub1_1 = new Class5_Sub23_Sub1(8192);
		this.anIntArray146 = new int[1];
		this.anIntArray145 = new int[1];
		this.anIntArray147 = new int[1];
		this.aByteArray13 = new byte[16384];
		this.aCanvas4 = this.aCanvas3 = arg0;
		this.anInt2741 = arg2;
		if (!Static513.method7491("jaclib")) {
			throw new RuntimeException("");
		} else if (Static513.method7491("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong79 = this.aLong78 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt2741);
				if (this.aLong78 == 0L) {
					throw new RuntimeException("");
				}
				this.method2331();
				@Pc(341) int local341 = this.method2376();
				if (local341 != 0) {
					throw new RuntimeException("");
				}
				this.anInt2760 = this.aBoolean216 ? 33639 : 5121;
				if (this.aString42.indexOf("radeon") != -1) {
					@Pc(369) int local369 = 0;
					@Pc(371) boolean local371 = false;
					@Pc(373) boolean local373 = false;
					@Pc(382) String[] local382 = Static439.method6502(this.aString42.replace('/', ' '), ' ');
					for (@Pc(384) int local384 = 0; local384 < local382.length; local384++) {
						@Pc(390) String local390 = local382[local384];
						try {
							if (local390.length() > 0) {
								if (local390.charAt(0) == 'x' && local390.length() >= 3 && Static81.method1263(local390.substring(1, 3))) {
									local390 = local390.substring(1);
									local373 = true;
								}
								if (local390.equals("hd")) {
									local371 = true;
								} else {
									if (local390.startsWith("hd")) {
										local390 = local390.substring(2);
										local371 = true;
									}
									if (local390.length() >= 4 && Static81.method1263(local390.substring(0, 4))) {
										local369 = Static595.method8613(local390.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(470) Exception local470) {
						}
					}
					if (!local373 && !local371) {
						if (local369 >= 7000 && local369 <= 9250) {
							this.aBoolean213 = false;
						}
						if (local369 >= 7000 && local369 <= 7999) {
							this.aBoolean226 = false;
						}
					}
					if (!local371 || local369 < 4000) {
						this.aBoolean233 = false;
					}
					this.aBoolean231 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean218 = this.aBoolean226;
					this.aBoolean215 = true;
				}
				if (this.aString43.indexOf("intel") != -1) {
					this.aBoolean234 = false;
				}
				this.aBoolean229 = !this.aString43.equals("s3 graphics");
				if (this.aBoolean226) {
					try {
						@Pc(580) int[] local580 = new int[1];
						OpenGL.glGenBuffersARB(1, local580, 0);
					} catch (@Pc(586) Throwable local586) {
						throw new RuntimeException("");
					}
				}
				Static303.method4654(false, true);
				this.aBoolean204 = true;
				this.aClass394_1 = new Class394(this, super.anInterface1_11);
				this.method2305();
				this.aClass346_1 = new Class346(this);
				this.aClass177_1 = new Class177(this);
				if (this.aClass177_1.method3835()) {
					this.aClass5_Sub34_Sub1_1 = new Class5_Sub34_Sub1(this);
					if (!this.aClass5_Sub34_Sub1_1.method5109()) {
						this.aClass5_Sub34_Sub1_1.method5101();
						this.aClass5_Sub34_Sub1_1 = null;
					}
				}
				this.aClass327_1 = new Class327(this);
				this.method2334();
				this.method2319();
				this.method7718();
			} catch (@Pc(664) Throwable local664) {
				local664.printStackTrace();
				this.method7643();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FIF)V")
	public void method2304(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat47 = arg0;
		this.aFloat32 = arg1;
		this.method2336();
	}

	@OriginalMember(owner = "client!ffa", name = "y", descriptor = "(I)V")
	private void method2305() {
		this.aClass32Array1 = new Class32[this.anInt2775];
		this.aClass32_Sub1_2 = new Class32_Sub1(this, 3553, 6408, 1, 1);
		new Class32_Sub1(this, 3553, 6408, 1, 1);
		new Class32_Sub1(this, 3553, 6408, 1, 1);
		this.aClass164_Sub2_4 = new Class164_Sub2(this);
		this.aClass164_Sub2_6 = new Class164_Sub2(this);
		this.aClass164_Sub2_3 = new Class164_Sub2(this);
		this.aClass164_Sub2_9 = new Class164_Sub2(this);
		this.aClass164_Sub2_1 = new Class164_Sub2(this);
		this.aClass164_Sub2_10 = new Class164_Sub2(this);
		this.aClass164_Sub2_7 = new Class164_Sub2(this);
		this.aClass164_Sub2_8 = new Class164_Sub2(this);
		this.aClass164_Sub2_5 = new Class164_Sub2(this);
		this.aClass164_Sub2_2 = new Class164_Sub2(this);
		if (this.aBoolean234) {
			this.aClass76_2 = new Class76(this);
			new Class76(this);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt2598 - arg1 - local12, arg2, 1, 32993, this.anInt2760, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIBI)V")
	public void method2307(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "()Z")
	@Override
	public boolean method7664() {
		return this.aClass327_1.method8001();
	}

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "(II)I")
	public int method2308(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V")
	public void method2309(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean208 != arg0) {
			this.aBoolean208 = arg0;
			this.method2347();
			this.anInt2759 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[Lclient!uf;)V")
	@Override
	public void method7716(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub43[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass5_Sub43Array1[local7] = arg1[local7];
		}
		this.anInt2764 = arg0;
		if (this.anInt2771 != 1) {
			this.method2377();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "(I)V")
	@Override
	public void method7689(@OriginalArg(0) int arg0) {
		this.method2351();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7686(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!lq;[Lclient!iga;Z)Lclient!da;")
	@Override
	public Class80 method7708(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class173[] arg1) {
		return new Class80_Sub4(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7703(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(23) Long local23 = (Long) this.aHashtable4.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local23);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg0 * this.aClass203_Sub2_3.aFloat125 + this.aClass203_Sub2_3.aFloat130 * (float) arg1 + this.aClass203_Sub2_3.aFloat122 * (float) arg2 + this.aClass203_Sub2_3.aFloat131;
		@Pc(55) float local55 = this.aClass203_Sub2_3.aFloat122 * (float) arg5 + this.aClass203_Sub2_3.aFloat125 * (float) arg3 + (float) arg4 * this.aClass203_Sub2_3.aFloat130 + this.aClass203_Sub2_3.aFloat131;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt2782 > local30 && local55 < (float) this.anInt2782) {
			local57 |= 0x10;
		} else if ((float) this.anInt2772 < local30 && (float) this.anInt2772 < local55) {
			local57 |= 0x20;
		}
		@Pc(130) int local130 = (int) (((float) arg0 * this.aClass203_Sub2_3.aFloat120 + this.aClass203_Sub2_3.aFloat124 * (float) arg1 + (float) arg2 * this.aClass203_Sub2_3.aFloat128 + this.aClass203_Sub2_3.aFloat126) * (float) this.anInt2776 / (float) arg6);
		@Pc(163) int local163 = (int) ((float) this.anInt2776 * ((float) arg5 * this.aClass203_Sub2_3.aFloat128 + this.aClass203_Sub2_3.aFloat124 * (float) arg4 + this.aClass203_Sub2_3.aFloat120 * (float) arg3 + this.aClass203_Sub2_3.aFloat126) / (float) arg6);
		if (this.aFloat50 > (float) local130 && this.aFloat50 > (float) local163) {
			local57 |= 0x1;
		} else if ((float) local130 > this.aFloat34 && this.aFloat34 < (float) local163) {
			local57 |= 0x2;
		}
		@Pc(236) int local236 = (int) ((this.aClass203_Sub2_3.aFloat129 + this.aClass203_Sub2_3.aFloat123 * (float) arg0 + this.aClass203_Sub2_3.aFloat127 * (float) arg1 + (float) arg2 * this.aClass203_Sub2_3.aFloat121) * (float) this.anInt2778 / (float) arg6);
		@Pc(269) int local269 = (int) ((float) this.anInt2778 * (this.aClass203_Sub2_3.aFloat123 * (float) arg3 + this.aClass203_Sub2_3.aFloat127 * (float) arg4 + this.aClass203_Sub2_3.aFloat121 * (float) arg5 + this.aClass203_Sub2_3.aFloat129) / (float) arg6);
		if (this.aFloat35 > (float) local236 && (float) local269 < this.aFloat35) {
			local57 |= 0x4;
		} else if ((float) local236 > this.aFloat44 && (float) local269 > this.aFloat44) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2341();
		this.method2372(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(51) float local51 = (float) (1.0D / Math.sqrt((double) (local24 * local24 + local17 * local17)));
			local24 *= local51;
			local17 *= local51;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, local24 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZZ)V")
	public void method2310(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean205 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean205 = arg0;
		this.anInt2759 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "(I)Lclient!za;")
	@Override
	public Class5_Sub10 method7646(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub10_Sub2 local8 = new Class5_Sub10_Sub2(arg0);
		this.aClass102_17.method1921(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	@Override
	public void method7650(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt2745 = arg0;
		this.aClass394_1.method9306();
	}

	@OriginalMember(owner = "client!ffa", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2778 = arg3;
		this.anInt2779 = arg1;
		this.anInt2780 = arg0;
		this.anInt2776 = arg2;
		this.method2328();
		this.method2355();
		if (this.anInt2771 == 3) {
			this.method2316();
		} else if (this.anInt2771 == 2) {
			this.method2348();
			return;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean210 = false;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7666(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7673(arg2, arg3);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg5;
		@Pc(9) Class32_Sub1_Sub1 local9 = local6.aClass32_Sub1_Sub1_5;
		this.method2320();
		this.method2362(local6.aClass32_Sub1_Sub1_5);
		this.method2372(1);
		this.method2313(8448, 7681);
		this.method2368(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat53 / (float) local9.anInt3115;
		@Pc(46) float local46 = local9.aFloat52 / (float) local9.anInt3112;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(91) float local91 = local52 * local72;
		@Pc(95) float local95 = local59 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local91 + 0.35F, (float) arg3 + local95 + 0.35F);
		OpenGL.glEnd();
		this.method2368(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "()Z")
	@Override
	public boolean method7644() {
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIZI[B)Lclient!ml;")
	public Interface15 method2311(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface15) (this.aBoolean226 && (!arg1 || this.aBoolean218) ? new Class70_Sub1(this, arg2, arg3, arg0, arg1) : new Class38_Sub1(this, arg2, arg3, arg0));
	}

	@OriginalMember(owner = "client!ffa", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method2341();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method2372(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean212) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean212) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIII)V")
	public void method2312(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIZ)Lclient!fs;")
	@Override
	public Class134 method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class134_Sub2(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "([IIIIIZ)Lclient!fs;")
	@Override
	public Class134 method7705(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class134_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "()V")
	@Override
	public void method7645() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BII)V")
	public void method2313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2768 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (arg1 != this.anInt2762) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt2762 = arg1;
			local21 = true;
		}
		if (arg0 != this.anInt2774) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			this.anInt2774 = arg0;
			local21 = true;
		}
		if (local21) {
			this.anInt2759 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat43) {
			this.aFloat43 = arg0;
			this.method2346();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "(I)V")
	public void method2314() {
		if (this.anInt2771 != 0) {
			this.anInt2771 = 0;
			this.anInt2759 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7675(@OriginalArg(0) Class5_Sub10 arg0) {
		this.aNativeHeap2 = ((Class5_Sub10_Sub2) arg0).aNativeHeap3;
		if (this.anInterface15_2 != null) {
			return;
		}
		@Pc(16) Class5_Sub23_Sub1 local16 = new Class5_Sub23_Sub1(80);
		if (this.aBoolean216) {
			local16.method4302(-1.0F);
			local16.method4302(-1.0F);
			local16.method4302(0.0F);
			local16.method4302(0.0F);
			local16.method4302(1.0F);
			local16.method4302(1.0F);
			local16.method4302(-1.0F);
			local16.method4302(0.0F);
			local16.method4302(1.0F);
			local16.method4302(1.0F);
			local16.method4302(1.0F);
			local16.method4302(1.0F);
			local16.method4302(0.0F);
			local16.method4302(1.0F);
			local16.method4302(0.0F);
			local16.method4302(-1.0F);
			local16.method4302(1.0F);
			local16.method4302(0.0F);
			local16.method4302(0.0F);
			local16.method4302(0.0F);
		} else {
			local16.method4304(-1.0F);
			local16.method4304(-1.0F);
			local16.method4304(0.0F);
			local16.method4304(0.0F);
			local16.method4304(1.0F);
			local16.method4304(1.0F);
			local16.method4304(-1.0F);
			local16.method4304(0.0F);
			local16.method4304(1.0F);
			local16.method4304(1.0F);
			local16.method4304(1.0F);
			local16.method4304(1.0F);
			local16.method4304(0.0F);
			local16.method4304(1.0F);
			local16.method4304(0.0F);
			local16.method4304(-1.0F);
			local16.method4304(1.0F);
			local16.method4304(0.0F);
			local16.method4304(0.0F);
			local16.method4304(0.0F);
		}
		this.anInterface15_2 = this.method2311(local16.anInt9869, false, 20, local16.aByteArray102);
		this.aClass356_6 = new Class356(this.anInterface15_2, 5126, 3, 0);
		this.aClass356_5 = new Class356(this.anInterface15_2, 5126, 2, 12);
		this.aClass202_1.method4813(this);
	}

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "(B)V")
	private void method2315() {
		this.aFloatArray25[14] = this.aFloat45;
		this.aFloatArray25[10] = this.aFloat33;
		this.aFloat39 = (float) this.anInt2772;
		this.aFloat46 = ((float) -this.anInt2772 + this.aFloatArray25[14]) / this.aFloatArray25[10];
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7660(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class5_Sub29 local19;
		while (!this.aClass102_19.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_19.method1928();
			Static618.anIntArray563[local11++] = (int) local19.aLong314;
			this.anInt2756 -= local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static618.anIntArray563, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static618.anIntArray563, 0);
			local11 = 0;
		}
		while (!this.aClass102_20.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_20.method1928();
			Static618.anIntArray563[local11++] = (int) local19.aLong314;
			this.anInt2755 -= local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static618.anIntArray563, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static618.anIntArray563, 0);
			local11 = 0;
		}
		while (!this.aClass102_21.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_21.method1928();
			Static618.anIntArray563[local11++] = local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static618.anIntArray563, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static618.anIntArray563, 0);
			local11 = 0;
		}
		while (!this.aClass102_22.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_22.method1928();
			Static618.anIntArray563[local11++] = (int) local19.aLong314;
			this.anInt2754 -= local19.anInt5492;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static618.anIntArray563, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static618.anIntArray563, 0);
		}
		while (!this.aClass102_18.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_18.method1928();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5492);
		}
		@Pc(220) Class5 local220;
		while (!this.aClass102_23.method1926()) {
			local220 = this.aClass102_23.method1928();
			OpenGL.glDeleteProgramARB((int) local220.aLong314);
		}
		while (!this.aClass102_24.method1926()) {
			local220 = this.aClass102_24.method1928();
			OpenGL.glDeleteObjectARB(local220.aLong314);
		}
		while (!this.aClass102_18.method1926()) {
			local19 = (Class5_Sub29) this.aClass102_18.method1928();
			OpenGL.glDeleteLists((int) local19.aLong314, local19.anInt5492);
		}
		this.aClass394_1.method9307();
		if (this.E() > 100663296 && Static515.method7499(119) > this.aLong80 + 60000L) {
			System.gc();
			this.aLong80 = Static515.method7499(92);
		}
		this.anInt2750 = local9;
	}

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "(B)V")
	private void method2316() {
		@Pc(15) float local15 = (float) -this.anInt2780 * this.aFloat49 / (float) this.anInt2776;
		@Pc(27) float local27 = (float) -this.anInt2779 * this.aFloat49 / (float) this.anInt2778;
		@Pc(50) float local50 = (float) (this.anInt2652 - this.anInt2780) * this.aFloat49 / (float) this.anInt2776;
		@Pc(65) float local65 = this.aFloat49 * (float) (this.anInt2598 - this.anInt2779) / (float) this.anInt2778;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local50 && local65 != local27) {
			OpenGL.glOrtho((double) local15, (double) local50, (double) -local65, (double) -local27, (double) this.anInt2782, (double) this.anInt2772);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "(Z)V")
	private void method2317() {
		Static643.aFloatArray108[0] = this.aFloat38 * this.aFloat42;
		Static643.aFloatArray108[3] = 1.0F;
		Static643.aFloatArray108[2] = this.aFloat42 * this.aFloat48;
		Static643.aFloatArray108[1] = this.aFloat42 * this.aFloat40;
		OpenGL.glLightfv(16384, 4609, Static643.aFloatArray108, 0);
		Static643.aFloatArray108[2] = -this.aFloat36 * this.aFloat48;
		Static643.aFloatArray108[1] = -this.aFloat36 * this.aFloat40;
		Static643.aFloatArray108[3] = 1.0F;
		Static643.aFloatArray108[0] = this.aFloat38 * -this.aFloat36;
		OpenGL.glLightfv(16385, 4609, Static643.aFloatArray108, 0);
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt2782 == arg0 && this.anInt2772 == arg1) {
			return;
		}
		this.anInt2772 = arg1;
		this.anInt2782 = arg0;
		this.method2328();
		this.method2336();
		if (this.anInt2771 == 3) {
			this.method2316();
			return;
		}
		if (this.anInt2771 != 2) {
			return;
		}
		this.method2348();
	}

	@OriginalMember(owner = "client!ffa", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt2773 = this.anInt2652;
		this.anInt2761 = this.anInt2598;
		this.anInt2783 = 0;
		this.anInt2787 = 0;
		OpenGL.glDisable(3089);
		this.method2355();
	}

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "()Z")
	@Override
	public boolean method7642() {
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(II)Lclient!nq;")
	@Override
	public Interface18 method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(ILclient!ob;)V")
	public void method2318(@OriginalArg(1) Class203_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6190(), 0);
	}

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "(B)V")
	private void method2319() {
		if (this.aCanvas4 == null) {
			this.anInt2575 = this.anInt2644 = 0;
		} else {
			@Pc(16) Dimension local16 = this.aCanvas4.getSize();
			this.anInt2575 = local16.width;
			this.anInt2644 = local16.height;
		}
		if (this.anInterface17_2 == null) {
			this.anInt2652 = this.anInt2575;
			this.anInt2598 = this.anInt2644;
			this.method2350();
		}
		this.method2314();
		this.la();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!jw;)V")
	@Override
	public void method7728(@OriginalArg(0) Class193 arg0) {
		this.aClass202_1.method4806(this, -1, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "(B)V")
	public void method2320() {
		if (this.anInt2759 == 2) {
			return;
		}
		this.method2366();
		this.method2327(false);
		this.method2335(false);
		this.method2310(false);
		this.method2309(false);
		this.method2358(-2);
		this.anInt2759 = 2;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "([I)V")
	@Override
	public void method7692(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2652;
		arg0[1] = this.anInt2598;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(III)V")
	public synchronized void method2321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub29 local8 = new Class5_Sub29(arg0);
		local8.aLong314 = (long) arg1;
		this.aClass102_22.method1921(local8);
	}

	@OriginalMember(owner = "client!ffa", name = "A", descriptor = "()V")
	@Override
	public void method7663() {
		if (this.aBoolean234) {
			if (this.aClass76_1 != this.anInterface17_2) {
				throw new RuntimeException();
			}
			this.aClass76_1.method1338(0);
			this.aClass76_1.method1338(8);
			this.method2375(this.aClass76_1);
		} else if (this.aBoolean222) {
			this.aClass134_Sub2_1.method9225(0, 0, this.anInt2652, this.anInt2598, 0, 0);
			this.anOpenGL1.setSurface(this.aLong79);
		} else {
			throw new RuntimeException("");
		}
		this.anInt2652 = this.anInt2575;
		this.aClass134_Sub2_1 = null;
		this.anInt2598 = this.anInt2644;
		this.method2314();
		this.method2350();
		this.la();
	}

	@OriginalMember(owner = "client!ffa", name = "o", descriptor = "(II)V")
	public void method2322(@OriginalArg(0) int arg0) {
		Static643.aFloatArray108[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static643.aFloatArray108[3] = (float) (arg0 >>> 24) / 255.0F;
		Static643.aFloatArray108[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static643.aFloatArray108[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		OpenGL.glTexEnvfv(8960, 8705, Static643.aFloatArray108, 0);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!raa;IIII)V")
	public void method2323(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int local15 = arg0.method8201();
		@Pc(22) int local22 = arg2 * this.method2343(local15);
		this.method2381(arg0);
		OpenGL.glDrawElements(4, arg1, local15, (long) local22 + arg0.method8199());
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ol;)V")
	@Override
	public void method7702(@OriginalArg(0) Class29 arg0) {
		this.aClass29_Sub2_1 = (Class29_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(61) float local61;
		if (this.aClass32_Sub1_Sub1_1 == null || arg2 > this.aClass32_Sub1_Sub1_1.anInt3103 || arg3 > this.aClass32_Sub1_Sub1_1.anInt3107) {
			this.aClass32_Sub1_Sub1_1 = Static218.method3126(this, arg3, arg2, arg6);
			this.aClass32_Sub1_Sub1_1.method2721(false, false);
			local49 = this.aClass32_Sub1_Sub1_1.aFloat52;
			local61 = this.aClass32_Sub1_Sub1_1.aFloat53;
		} else {
			this.aClass32_Sub1_Sub1_1.method2724(arg6, 6406, false, arg3, arg2);
			local49 = this.aClass32_Sub1_Sub1_1.aFloat52 * (float) arg3 / (float) this.aClass32_Sub1_Sub1_1.anInt3107;
			local61 = this.aClass32_Sub1_Sub1_1.aFloat53 * (float) arg2 / (float) this.aClass32_Sub1_Sub1_1.anInt3103;
		}
		this.method2320();
		this.method2362(this.aClass32_Sub1_Sub1_1);
		this.method2372(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2322(arg5);
		this.method2313(34165, 34165);
		this.method2368(34166, 0, 768);
		this.method2368(5890, 2, 770);
		this.method2312(34166, 0);
		this.method2312(5890, 2);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = (float) arg2 + local151;
		@Pc(164) float local164 = local154 + (float) arg3;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local151, local154);
		OpenGL.glTexCoord2f(0.0F, local61);
		OpenGL.glVertex2f(local151, local164);
		OpenGL.glTexCoord2f(local49, local61);
		OpenGL.glVertex2f(local159, local164);
		OpenGL.glTexCoord2f(local49, 0.0F);
		OpenGL.glVertex2f(local159, local154);
		OpenGL.glEnd();
		this.method2368(5890, 0, 768);
		this.method2368(34166, 2, 770);
		this.method2312(5890, 0);
		this.method2312(34166, 2);
	}

	@OriginalMember(owner = "client!ffa", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(16) boolean local16 = this.anInt2789 != arg0;
		if (local16 || this.aFloat42 != arg1 || arg2 != this.aFloat36) {
			this.aFloat42 = arg1;
			this.aFloat36 = arg2;
			this.anInt2789 = arg0;
			if (local16) {
				this.aFloat38 = (float) (this.anInt2789 & 0xFF0000) / 1.671168E7F;
				this.aFloat40 = (float) (this.anInt2789 & 0xFF00) / 65280.0F;
				this.aFloat48 = (float) (this.anInt2789 & 0xFF) / 255.0F;
				this.method2346();
			}
			this.method2317();
		}
		if (arg3 == this.aFloatArray23[0] && this.aFloatArray23[1] == arg4 && this.aFloatArray23[2] == arg5) {
			return;
		}
		this.aFloatArray23[1] = arg4;
		this.aFloatArray23[0] = arg3;
		this.aFloatArray23[2] = arg5;
		this.aFloatArray22[2] = -arg5;
		this.aFloatArray22[0] = -arg3;
		this.aFloatArray22[1] = -arg4;
		@Pc(155) float local155 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.lb[2] = local155 * arg5;
		this.lb[0] = local155 * arg3;
		this.lb[1] = local155 * arg4;
		this.aFloatArray24[0] = -this.lb[0];
		this.aFloatArray24[2] = -this.lb[2];
		this.aFloatArray24[1] = -this.lb[1];
		this.method2367();
		this.anInt2793 = (int) (arg5 * 256.0F / arg4);
		this.anInt2769 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ffa", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean221 = arg0;
		this.method2347();
	}

	@OriginalMember(owner = "client!ffa", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass203_Sub2_3.aFloat131 + (float) arg2 * this.aClass203_Sub2_3.aFloat122 + this.aClass203_Sub2_3.aFloat130 * (float) arg1 + this.aClass203_Sub2_3.aFloat125 * (float) arg0;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(78) int local78 = (int) ((this.aClass203_Sub2_3.aFloat126 + this.aClass203_Sub2_3.aFloat128 * (float) arg2 + this.aClass203_Sub2_3.aFloat124 * (float) arg1 + (float) arg0 * this.aClass203_Sub2_3.aFloat120) * (float) this.anInt2776 / local28);
		arg3[0] = (int) ((float) local78 - this.aFloat50);
		@Pc(120) int local120 = (int) ((this.aClass203_Sub2_3.aFloat129 + this.aClass203_Sub2_3.aFloat121 * (float) arg2 + this.aClass203_Sub2_3.aFloat123 * (float) arg0 + (float) arg1 * this.aClass203_Sub2_3.aFloat127) * (float) this.anInt2778 / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local120 - this.aFloat35);
	}

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "(II)V")
	public synchronized void method2324(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub29 local8 = new Class5_Sub29(arg0);
		this.aClass102_21.method1921(local8);
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(IIIIII)Lclient!ol;")
	@Override
	public Class29 method7667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean230 ? new Class29_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(Z)V")
	public void method2326() {
		if (this.anInt2759 == 16) {
			return;
		}
		this.method2386();
		this.method2327(true);
		this.method2310(true);
		this.method2309(true);
		this.method2372(1);
		this.anInt2759 = 16;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
	public void method2327(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean232 != arg0) {
			this.aBoolean232 = arg0;
			this.method2379();
			this.anInt2759 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "(I)V")
	private void method2328() {
		@Pc(14) float[] local14 = this.aFloatArray25;
		@Pc(26) float local26 = (float) (this.anInt2782 * -this.anInt2780) / (float) this.anInt2776;
		@Pc(41) float local41 = (float) ((this.anInt2652 - this.anInt2780) * this.anInt2782) / (float) this.anInt2776;
		@Pc(52) float local52 = (float) (this.anInt2779 * this.anInt2782) / (float) this.anInt2778;
		@Pc(67) float local67 = (float) ((this.anInt2779 - this.anInt2598) * this.anInt2782) / (float) this.anInt2778;
		if (local41 == local26 || local67 == local52) {
			local14[4] = 0.0F;
			local14[10] = 1.0F;
			local14[1] = 0.0F;
			local14[8] = 0.0F;
			local14[11] = 0.0F;
			local14[13] = 0.0F;
			local14[3] = 0.0F;
			local14[15] = 1.0F;
			local14[7] = 0.0F;
			local14[0] = 1.0F;
			local14[2] = 0.0F;
			local14[5] = 1.0F;
			local14[9] = 0.0F;
			local14[12] = 0.0F;
			local14[6] = 0.0F;
			local14[14] = 0.0F;
		} else {
			@Pc(151) float local151 = (float) this.anInt2782 * 2.0F;
			local14[4] = 0.0F;
			local14[13] = 0.0F;
			local14[9] = (local52 + local67) / (-local67 + local52);
			local14[0] = local151 / (local41 - local26);
			local14[11] = -1.0F;
			local14[8] = (local26 + local41) / (local41 - local26);
			local14[1] = 0.0F;
			local14[10] = this.aFloat33 = (float) -(this.anInt2782 + this.anInt2772) / (float) (this.anInt2772 - this.anInt2782);
			local14[15] = 0.0F;
			local14[14] = this.aFloat45 = -((float) this.anInt2772 * local151) / (float) (this.anInt2772 - this.anInt2782);
			local14[5] = local151 / (local52 - local67);
			local14[6] = 0.0F;
			local14[3] = 0.0F;
			local14[12] = 0.0F;
			local14[2] = 0.0F;
			local14[7] = 0.0F;
		}
		this.method2315();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZIB)V")
	public void method2329(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method2330(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ffa", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg3 > this.anInt2598) {
			arg3 = this.anInt2598;
		}
		if (arg2 > this.anInt2652) {
			arg2 = this.anInt2652;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt2773 = arg2;
		this.anInt2787 = arg1;
		this.anInt2783 = arg0;
		this.anInt2761 = arg3;
		OpenGL.glEnable(3089);
		this.method2355();
		this.method2370();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZZI)V")
	public void method2330(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt2763 != arg2 || this.aBoolean210 != this.aBoolean235) {
			@Pc(32) Class32_Sub1 local32 = null;
			@Pc(34) int local34 = 0;
			@Pc(36) byte local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(46) int local46 = this.aBoolean210 ? 3 : 0;
			if (arg2 < 0) {
				this.method2369();
			} else {
				local32 = this.aClass394_1.method9308(arg2);
				@Pc(67) Class233 local67 = super.anInterface1_11.method2863(arg2);
				if (local67.aByte96 == 0 && local67.aByte93 == 0) {
					this.method2369();
				} else {
					@Pc(92) int local92 = local67.aBoolean485 ? 64 : 128;
					@Pc(96) int local96 = local92 * 50;
					this.method2340((float) (local67.aByte93 * (this.anInt2750 % local96)) / (float) local96, (float) (this.anInt2750 % local96 * local67.aByte96) / (float) local96, 0.0F);
				}
				local34 = local67.anInt6310;
				if (!this.aBoolean210) {
					local36 = local67.aByte92;
					local46 = local67.aByte94;
					local38 = local67.anInt6309;
				}
			}
			this.aClass327_1.method8003(arg0, local36, arg1, local46, local38);
			if (!this.aClass327_1.method7999(local32, local34)) {
				this.method2362(local32);
				this.method2382(local34);
			}
			this.anInt2763 = arg2;
			this.aBoolean235 = this.aBoolean210;
		}
		this.anInt2759 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "(B)V")
	private void method2331() {
		@Pc(18) int local18 = 0;
		while (!this.anOpenGL1.b()) {
			if (local18++ > 5) {
				throw new RuntimeException("");
			}
			Static351.method5279(1000L);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "(I)Lclient!od;")
	public Class32_Sub3 method2332() {
		return this.aClass29_Sub2_1 == null ? null : this.aClass29_Sub2_1.method9316();
	}

	@OriginalMember(owner = "client!ffa", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2785 == arg0 && this.anInt2766 == arg1 && this.anInt2765 == arg2) {
			return;
		}
		this.anInt2785 = arg0;
		this.anInt2765 = arg2;
		this.anInt2766 = arg1;
		this.method2336();
		this.method2379();
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(B)V")
	public void method2333() {
		if (this.anInt2759 == 8) {
			return;
		}
		this.method2359();
		this.method2327(true);
		this.method2310(true);
		this.method2309(true);
		this.method2372(1);
		this.anInt2759 = 8;
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(B)V")
	private void method2334() {
		this.method2358(-2);
		for (@Pc(14) int local14 = this.anInt2775 - 1; local14 >= 0; local14--) {
			this.method2345(local14);
			this.method2362((Class32) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2313(8448, 8448);
		this.method2368(34168, 2, 770);
		this.method2369();
		this.anInt2758 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt2757 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean206 = true;
		if (95 != 95) {
			this.anInt2644 = -77;
		}
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean207 = true;
		this.method2327(true);
		this.method2335(true);
		this.method2310(true);
		this.method2309(true);
		this.method2314();
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
		@Pc(139) float[] local139 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(141) int local141 = 0; local141 < 8; local141++) {
			@Pc(149) int local149 = local141 + 16384;
			OpenGL.glLightfv(local149, 4608, local139, 0);
			OpenGL.glLightf(local149, 4615, 0.0F);
			OpenGL.glLightf(local149, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt2789 = this.anInt2785 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IZ)V")
	public void method2335(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean223 != arg0) {
			this.aBoolean223 = arg0;
			this.method2357();
			this.anInt2759 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(22) Class1_Sub2 local22 = (Class1_Sub2) arg5;
		@Pc(25) Class32_Sub1_Sub1 local25 = local22.aClass32_Sub1_Sub1_5;
		this.method2320();
		this.method2362(local22.aClass32_Sub1_Sub1_5);
		this.method2372(1);
		this.method2313(8448, 7681);
		this.method2368(34167, 0, 768);
		@Pc(55) float local55 = local25.aFloat53 / (float) local25.anInt3115;
		@Pc(62) float local62 = local25.aFloat52 / (float) local25.anInt3112;
		@Pc(69) float local69 = (float) -arg0 + (float) arg2;
		@Pc(76) float local76 = (float) -arg1 + (float) arg3;
		@Pc(89) float local89 = (float) (1.0D / Math.sqrt((double) (local76 * local76 + local69 * local69)));
		@Pc(93) float local93 = local69 * local89;
		@Pc(99) int local99 = arg10 % (arg9 + arg8);
		@Pc(103) float local103 = local76 * local89;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(123) float local123 = local93 * (float) arg8;
		@Pc(128) float local128 = local103 * (float) arg8;
		@Pc(130) float local130 = 0.0F;
		@Pc(132) float local132 = 0.0F;
		@Pc(134) float local134 = local123;
		@Pc(136) float local136 = local128;
		if (arg8 < local99) {
			local132 = local103 * (float) (arg8 + arg9 - local99);
			local130 = local93 * (float) (arg9 + arg8 - local99);
		} else {
			local134 = local93 * (float) (arg8 - local99);
			local136 = (float) (arg8 - local99) * local103;
		}
		@Pc(188) float local188 = local130 + (float) arg0 + 0.35F;
		@Pc(195) float local195 = local132 + (float) arg1 + 0.35F;
		@Pc(200) float local200 = (float) arg9 * local93;
		@Pc(205) float local205 = (float) arg9 * local103;
		while (true) {
			if (arg2 <= arg0) {
				if (local188 < (float) arg2 + 0.35F) {
					break;
				}
				if (local188 + local134 < (float) arg2) {
					local134 = (float) arg2 - local188;
				}
			} else {
				if ((float) arg2 + 0.35F < local188) {
					break;
				}
				if ((float) arg2 < local188 + local134) {
					local134 = (float) arg2 - local188;
				}
			}
			if (arg1 >= arg3) {
				if ((float) arg3 + 0.35F > local195) {
					break;
				}
				if ((float) arg3 > local195 + local136) {
					local136 = (float) arg3 - local195;
				}
			} else {
				if ((float) arg3 + 0.35F < local195) {
					break;
				}
				if (local136 + local195 > (float) arg3) {
					local136 = (float) arg3 - local195;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f(local55 * (local188 - (float) arg6), local62 * (local195 - (float) arg7));
			OpenGL.glVertex2f(local188, local195);
			OpenGL.glTexCoord2f(((float) -arg6 + local134 + local188) * local55, local62 * (local136 + local195 - (float) arg7));
			OpenGL.glVertex2f(local134 + local188, local136 + local195);
			OpenGL.glEnd();
			local195 += local136 + local205;
			local188 += local200 + local134;
			local136 = local128;
			local134 = local123;
		}
		this.method2368(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ffa", name = "p", descriptor = "(I)V")
	private void method2336() {
		this.aFloat37 = (float) (this.anInt2772 - this.anInt2765) - this.aFloat32;
		this.aFloat51 = this.aFloat37 - (float) this.anInt2766 * this.aFloat47;
		if (this.aFloat51 < (float) this.anInt2782) {
			this.aFloat51 = (float) this.anInt2782;
		}
		OpenGL.glFogf(2915, this.aFloat51);
		OpenGL.glFogf(2916, this.aFloat37);
		Static643.aFloatArray108[2] = (float) (this.anInt2785 & 0xFF) / 255.0F;
		Static643.aFloatArray108[1] = (float) (this.anInt2785 & 0xFF00) / 65280.0F;
		Static643.aFloatArray108[0] = (float) (this.anInt2785 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static643.aFloatArray108, 0);
	}

	@OriginalMember(owner = "client!ffa", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean210) {
			throw new RuntimeException("");
		}
		this.anInt2788 = arg2;
		this.anInt2777 = arg1;
		this.anInt2792 = arg3;
		this.anInt2786 = arg0;
		if (this.aBoolean235) {
			this.aClass327_1.aClass99_Sub6_1.method6905();
			this.aClass327_1.aClass99_Sub6_1.method6904();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "(I)V")
	public void method2337() {
		if (this.anInt2759 == 4) {
			return;
		}
		this.method2366();
		this.method2327(false);
		this.method2335(false);
		this.method2310(false);
		this.method2309(false);
		this.method2358(-2);
		this.method2372(1);
		this.anInt2759 = 4;
	}

	@OriginalMember(owner = "client!ffa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt2794;
		this.anInt2794 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "(II)I")
	public int method2338(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!nk;I)V")
	public void method2339(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt2752 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2752 >= 0) {
			this.anInterface17Array2[this.anInt2752].method1334();
		}
		this.anInterface17_1 = this.anInterface17Array2[++this.anInt2752] = arg0;
		this.anInterface17_1.method1331();
	}

	@OriginalMember(owner = "client!ffa", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2783;
		arg0[2] = this.anInt2773;
		arg0[3] = this.anInt2761;
		arg0[1] = this.anInt2787;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FBFF)V")
	private void method2340(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean225) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg0, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean225 = true;
	}

	@OriginalMember(owner = "client!ffa", name = "D", descriptor = "(I)V")
	private void method2341() {
		if (this.anInt2759 == 1) {
			return;
		}
		this.method2366();
		this.method2327(false);
		this.method2335(false);
		this.method2310(false);
		this.method2309(false);
		this.method2362((Class32) null);
		this.method2358(-2);
		this.method2382(1);
		this.anInt2759 = 1;
	}

	@OriginalMember(owner = "client!ffa", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt2795;
		this.anInt2795 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ffa", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2341();
		this.method2372(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ol;Lclient!ol;FLclient!ol;)Lclient!ol;")
	@Override
	public Class29 method7652(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class29 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean230 && this.aBoolean234) {
			@Pc(21) Class29_Sub2_Sub1 local21 = null;
			@Pc(24) Class29_Sub2 local24 = (Class29_Sub2) arg0;
			@Pc(27) Class29_Sub2 local27 = (Class29_Sub2) arg1;
			@Pc(31) Class32_Sub3 local31 = local24.method9316();
			@Pc(35) Class32_Sub3 local35 = local27.method9316();
			if (local31 != null && local35 != null) {
				@Pc(59) int local59 = local35.anInt7191 < local31.anInt7191 ? local31.anInt7191 : local35.anInt7191;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class29_Sub2_Sub1) {
					@Pc(75) Class29_Sub2_Sub1 local75 = (Class29_Sub2_Sub1) arg3;
					if (local59 == local75.method7561()) {
						local21 = local75;
					}
				}
				if (local21 == null) {
					local21 = new Class29_Sub2_Sub1(this, local59);
				}
				if (local21.method7558(local31, arg2, local35)) {
					return local21;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ffa", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg1;
		@Pc(9) Class32_Sub1_Sub1 local9 = local6.aClass32_Sub1_Sub1_5;
		this.method2320();
		this.method2362(local6.aClass32_Sub1_Sub1_5);
		this.method2372(1);
		this.method2313(8448, 7681);
		this.method2368(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat53 / (float) local9.anInt3115;
		@Pc(46) float local46 = local9.aFloat52 / (float) local9.anInt3112;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt2783 - arg2) * local39, (float) (this.anInt2787 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2783, this.anInt2787);
		OpenGL.glTexCoord2f((float) (this.anInt2783 - arg2) * local39, local46 * (float) (this.anInt2761 - arg3));
		OpenGL.glVertex2i(this.anInt2783, this.anInt2761);
		OpenGL.glTexCoord2f((float) (this.anInt2773 - arg2) * local39, (float) (this.anInt2761 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt2773, this.anInt2761);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt2773 - arg2), local46 * (float) (this.anInt2787 - arg3));
		OpenGL.glVertex2i(this.anInt2773, this.anInt2787);
		OpenGL.glEnd();
		this.method2368(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ffa", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt2780, this.anInt2779, this.anInt2776, this.anInt2778 };
	}

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "(I)V")
	private void method2342() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass203_Sub2_4.method6190(), 0);
		if (this.aBoolean235) {
			this.aClass327_1.aClass99_Sub6_1.method6905();
		}
		this.method2367();
		this.method2377();
	}

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "(II)I")
	public int method2343(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IZII)Lclient!ml;")
	public Interface15 method2344(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		return (Interface15) (this.aBoolean226 && (this.aBoolean218 || true) ? new Class70_Sub1(this, arg2, arg0, arg1, false) : new Class38_Sub1(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "(II)V")
	public void method2345(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt2768) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt2768 = arg0;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt2782;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7696() {
		this.method2341();
		this.method2372(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ffa", name = "t", descriptor = "()Z")
	@Override
	public boolean method7706() {
		return this.aClass5_Sub34_Sub1_1 != null && (this.anInt2741 <= 1 || this.aBoolean209);
	}

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "(I)V")
	private void method2346() {
		Static643.aFloatArray108[0] = this.aFloat43 * this.aFloat38;
		Static643.aFloatArray108[2] = this.aFloat43 * this.aFloat48;
		Static643.aFloatArray108[3] = 1.0F;
		Static643.aFloatArray108[1] = this.aFloat43 * this.aFloat40;
		OpenGL.glLightModelfv(2899, Static643.aFloatArray108, 0);
	}

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "(B)V")
	private void method2347() {
		OpenGL.glDepthMask(this.aBoolean208 && this.aBoolean221);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method2341();
		this.method2372(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean212) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean212) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "(B)V")
	private void method2348() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray25, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!iga;Z)Lclient!fs;")
	@Override
	public Class134 method7654(@OriginalArg(0) Class173 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt4282 * arg0.anInt4287];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray27 == null) {
			for (local21 = 0; local21 < arg0.anInt4287; local21++) {
				for (local25 = 0; local25 < arg0.anInt4282; local25++) {
					@Pc(38) int local38 = arg0.anIntArray244[arg0.aByteArray28[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt4287; local21++) {
				for (local25 = 0; local25 < arg0.anInt4282; local25++) {
					local12[local16++] = arg0.anIntArray244[arg0.aByteArray28[local14] & 0xFF] | arg0.aByteArray27[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(135) Class134 local135 = this.method7679(arg0.anInt4282, local12, arg0.anInt4282, arg0.anInt4287);
		local135.method9229(arg0.anInt4283, arg0.anInt4286, arg0.anInt4285, arg0.anInt4284);
		return local135;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!nq;Lclient!rk;)Lclient!gea;")
	@Override
	public Interface6 method7668(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Interface23 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ffa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method2309(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(I)V")
	@Override
	public void method7690(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "()V")
	@Override
	public void method7651() {
		this.aClass177_1.method3841();
	}

	@OriginalMember(owner = "client!ffa", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2341();
		this.method2372(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(B)V")
	private void method2350() {
		OpenGL.glViewport(this.anInt2784, this.anInt2770, this.anInt2652, this.anInt2598);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7699(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas3) {
			local5 = this.aLong78;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(31) Long local31 = (Long) this.aHashtable4.get(arg0);
			local5 = local31;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas4) {
			this.method2319();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7672() {
		return this.aClass203_Sub2_1;
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(I)V")
	private void method2351() {
		this.anOpenGL1.a();
	}

	@OriginalMember(owner = "client!ffa", name = "p", descriptor = "()V")
	@Override
	public void method7718() {
		if (!this.aBoolean229 || this.anInt2652 <= 0 || this.anInt2598 <= 0) {
			return;
		}
		@Pc(27) int local27 = this.anInt2783;
		@Pc(30) int local30 = this.anInt2773;
		@Pc(33) int local33 = this.anInt2787;
		@Pc(36) int local36 = this.anInt2761;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2314();
		this.method2327(false);
		this.method2335(false);
		this.method2310(false);
		this.method2309(false);
		this.method2362((Class32) null);
		this.method2358(-2);
		this.method2382(1);
		this.method2372(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt2652, this.anInt2598, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local27, local33, local30, local36);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FFBFF)V")
	public void method2352(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static643.aFloatArray108[2] = arg0;
		Static643.aFloatArray108[0] = arg2;
		Static643.aFloatArray108[1] = arg3;
		Static643.aFloatArray108[3] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static643.aFloatArray108, 0);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!uo;Lclient!uo;ILclient!uo;Lclient!uo;)V")
	public void method2353(@OriginalArg(0) Class356 arg0, @OriginalArg(1) Class356 arg1, @OriginalArg(3) Class356 arg2, @OriginalArg(4) Class356 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2363(arg1.anInterface15_7);
			OpenGL.glVertexPointer(arg1.aByte144, arg1.aShort115, this.anInterface15_3.method3617(), this.anInterface15_3.method3619() + (long) arg1.aByte143);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2363(arg0.anInterface15_7);
			OpenGL.glNormalPointer(arg0.aShort115, this.anInterface15_3.method3617(), this.anInterface15_3.method3619() + (long) arg0.aByte143);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2363(arg2.anInterface15_7);
			OpenGL.glColorPointer(arg2.aByte144, arg2.aShort115, this.anInterface15_3.method3617(), this.anInterface15_3.method3619() + (long) arg2.aByte143);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2363(arg3.anInterface15_7);
			OpenGL.glTexCoordPointer(arg3.aByte144, arg3.aShort115, this.anInterface15_3.method3617(), this.anInterface15_3.method3619() + (long) arg3.aByte143);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "(II)V")
	public synchronized void method2354(@OriginalArg(1) int arg0) {
		@Pc(15) Class5 local15 = new Class5();
		local15.aLong314 = (long) arg0;
		this.aClass102_23.method1921(local15);
	}

	@OriginalMember(owner = "client!ffa", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt2783 > arg0 + arg2 || this.anInt2773 < arg0 - arg2 || this.anInt2787 > arg2 + arg1 || arg1 - arg2 > this.anInt2761) {
			return;
		}
		this.method2341();
		this.method2372(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(75) float local75 = (float) arg0 + 0.35F;
		@Pc(80) float local80 = (float) arg1 + 0.35F;
		@Pc(84) int local84 = arg2 << 1;
		if (this.bf > (float) local84) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local75 + 1.0F, local80 + 1.0F);
			OpenGL.glVertex2f(local75 + 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, local80 - 1.0F);
			OpenGL.glVertex2f(local75 - 1.0F, local80 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local84 <= this.aFloat41) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local84);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local75, local80);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local75, local80);
			@Pc(140) int local140 = 262144 / (arg2 * 6);
			if (local140 <= 64) {
				local140 = 64;
			} else if (local140 > 512) {
				local140 = 512;
			}
			local140 = Static228.method3242(local140);
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			for (@Pc(173) int local173 = 16384 - local140; local173 > 0; local173 -= local140) {
				OpenGL.glVertex2f(local75 + Class307.aFloatArray88[local173] * (float) arg2, local80 + Class307.aFloatArray89[local173] * (float) arg2);
			}
			OpenGL.glVertex2f((float) arg2 + local75, local80);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "A", descriptor = "(I)V")
	private void method2355() {
		this.aFloat34 = (float) (this.anInt2773 - this.anInt2780);
		this.aFloat35 = (float) (this.anInt2787 - this.anInt2779);
		this.aFloat50 = (float) (this.anInt2783 - this.anInt2780);
		this.aFloat44 = (float) (this.anInt2761 - this.anInt2779);
	}

	@OriginalMember(owner = "client!ffa", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt2755 + this.anInt2756 + this.anInt2754;
	}

	@OriginalMember(owner = "client!ffa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7726() {
		return false;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IB[BIZ)Lclient!raa;")
	public Interface21 method2356(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) boolean arg2) {
		return (Interface21) (this.aBoolean226 && (!arg2 || this.aBoolean218) ? new Class70_Sub2(this, 5123, arg1, arg0, arg2) : new Class38_Sub2(this, 5123, arg1, arg0));
	}

	@OriginalMember(owner = "client!ffa", name = "g", descriptor = "(I)V")
	@Override
	public void method7724() {
	}

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "(I)V")
	private void method2357() {
		if (this.aBoolean223 && !this.aBoolean227) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BI)V")
	public void method2358(@OriginalArg(1) int arg0) {
		this.method2329(true, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2786 = arg0;
		this.anInt2777 = arg1;
		this.aBoolean210 = true;
		this.anInt2788 = arg2;
		this.anInt2792 = arg3;
	}

	@OriginalMember(owner = "client!ffa", name = "C", descriptor = "(I)V")
	private void method2359() {
		if (this.anInt2771 != 2) {
			this.anInt2771 = 2;
			this.method2348();
			this.method2342();
			this.anInt2759 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method2372(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ffa", name = "s", descriptor = "(I)V")
	public void method2360() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IBI)V")
	public void method2361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2784 = arg1;
		this.anInt2770 = arg0;
		this.method2350();
		this.method2370();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!mw;I)V")
	public void method2362(@OriginalArg(0) Class32 arg0) {
		@Pc(16) Class32 local16 = this.aClass32Array1[this.anInt2768];
		if (local16 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local16.anInt9813);
			} else {
				if (local16 == null) {
					OpenGL.glEnable(arg0.anInt9813);
				} else if (arg0.anInt9813 != local16.anInt9813) {
					OpenGL.glDisable(local16.anInt9813);
					OpenGL.glEnable(arg0.anInt9813);
				}
				OpenGL.glBindTexture(arg0.anInt9813, arg0.method8428());
			}
			this.aClass32Array1[this.anInt2768] = arg0;
		}
		this.anInt2759 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass177_1.method3833(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!ml;)V")
	public void method2363(@OriginalArg(1) Interface15 arg0) {
		if (this.anInterface15_3 != arg0) {
			if (this.aBoolean226) {
				OpenGL.glBindBufferARB(34962, arg0.method3616());
			}
			this.anInterface15_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass203_Sub2_3.aFloat122 * (float) arg2 + this.aClass203_Sub2_3.aFloat130 * (float) arg1 + this.aClass203_Sub2_3.aFloat125 * (float) arg0 + this.aClass203_Sub2_3.aFloat131;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = (float) arg5 * this.aClass203_Sub2_3.aFloat122 + (float) arg3 * this.aClass203_Sub2_3.aFloat125 + this.aClass203_Sub2_3.aFloat130 * (float) arg4 + this.aClass203_Sub2_3.aFloat131;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt2782 > local32 && (float) this.anInt2782 > local63) {
			local7 |= 0x10;
		} else if ((float) this.anInt2772 < local32 && local63 > (float) this.anInt2772) {
			local7 |= 0x20;
		}
		@Pc(141) int local141 = (int) (((float) arg2 * this.aClass203_Sub2_3.aFloat128 + this.aClass203_Sub2_3.aFloat120 * (float) arg0 + this.aClass203_Sub2_3.aFloat124 * (float) arg1 + this.aClass203_Sub2_3.aFloat126) * (float) this.anInt2776 / local32);
		@Pc(173) int local173 = (int) ((float) this.anInt2776 * ((float) arg4 * this.aClass203_Sub2_3.aFloat124 + this.aClass203_Sub2_3.aFloat120 * (float) arg3 + (float) arg5 * this.aClass203_Sub2_3.aFloat128 + this.aClass203_Sub2_3.aFloat126) / local63);
		if (this.aFloat50 > (float) local141 && this.aFloat50 > (float) local173) {
			local7 |= 0x1;
		} else if ((float) local141 > this.aFloat34 && this.aFloat34 < (float) local173) {
			local7 |= 0x2;
		}
		@Pc(245) int local245 = (int) ((float) this.anInt2778 * ((float) arg0 * this.aClass203_Sub2_3.aFloat123 + (float) arg1 * this.aClass203_Sub2_3.aFloat127 + this.aClass203_Sub2_3.aFloat121 * (float) arg2 + this.aClass203_Sub2_3.aFloat129) / local32);
		@Pc(277) int local277 = (int) ((this.aClass203_Sub2_3.aFloat129 + (float) arg5 * this.aClass203_Sub2_3.aFloat121 + (float) arg3 * this.aClass203_Sub2_3.aFloat123 + this.aClass203_Sub2_3.aFloat127 * (float) arg4) * (float) this.anInt2778 / local63);
		if ((float) local245 < this.aFloat35 && this.aFloat35 > (float) local277) {
			local7 |= 0x4;
		} else if (this.aFloat44 < (float) local245 && (float) local277 > this.aFloat44) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7678(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ffa", name = "z", descriptor = "()I")
	@Override
	public int method7721() {
		return 4;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!jw;I)V")
	@Override
	public void method7662(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1) {
		this.aClass202_1.method4806(this, arg1, arg0);
	}

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7720() {
		return this.aClass203_Sub2_3;
	}

	@OriginalMember(owner = "client!ffa", name = "u", descriptor = "()Z")
	@Override
	public boolean method7707() {
		return false;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!ju;IIII)Lclient!ka;")
	@Override
	public Class164 method7700(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class164_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!qq;)V")
	@Override
	public void method7657(@OriginalArg(0) Class203 arg0) {
		this.aClass203_Sub2_3.method8336(arg0);
		this.aClass203_Sub2_4.method8336(this.aClass203_Sub2_3);
		this.aClass203_Sub2_4.method6186();
		this.aClass203_Sub2_5.method6184(this.aClass203_Sub2_4);
		if (this.anInt2771 != 1) {
			this.method2342();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt2772;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7727(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aCanvas3 == arg0) {
			throw new RuntimeException();
		} else if (!this.aHashtable4.containsKey(arg0)) {
			if (!arg0.isShowing()) {
				throw new RuntimeException();
			}
			try {
				@Pc(32) Class local32 = Class.forName("java.awt.Canvas");
				@Pc(44) Method local44 = local32.getMethod("setIgnoreRepaint", Boolean.TYPE);
				local44.invoke(arg0, Boolean.TRUE);
			} catch (@Pc(56) Exception local56) {
			}
			@Pc(61) long local61 = this.anOpenGL1.prepareSurface(arg0);
			if (local61 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, Long.valueOf(local61));
		}
	}

	@OriginalMember(owner = "client!ffa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(BLclient!nk;)V")
	public void method2365(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt2752 < 0 || this.anInterface17Array2[this.anInt2752] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface17Array2[this.anInt2752--] = null;
		arg0.method1334();
		if (this.anInt2752 >= 0) {
			this.anInterface17_1 = this.anInterface17Array2[this.anInt2752];
			this.anInterface17_1.method1331();
		} else {
			this.anInterface17_1 = null;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7669(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = null;
		this.aLong79 = 0L;
		if (arg0 == null || arg0 == this.aCanvas3) {
			this.aLong79 = this.aLong78;
			this.aCanvas4 = this.aCanvas3;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(42) Long local42 = (Long) this.aHashtable4.get(arg0);
			this.aLong79 = local42;
			this.aCanvas4 = arg0;
		}
		if (this.aCanvas4 == null || this.aLong79 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong79);
		this.method2319();
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(II)V")
	@Override
	public void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ffa", name = "k", descriptor = "()Z")
	@Override
	public boolean method7719() {
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)V")
	@Override
	public void method7671(@OriginalArg(0) int arg0) {
		this.method2331();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7659(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static376.aFloat117 = arg1;
		Static452.aFloat134 = arg2;
		Static250.aFloat59 = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		this.method2341();
		this.method2372(1);
		@Pc(32) float local32 = (float) arg2 - (float) arg0;
		@Pc(38) float local38 = (float) arg3 - (float) arg1;
		@Pc(51) float local51 = (float) (1.0D / Math.sqrt((double) (local32 * local32 + local38 * local38)));
		@Pc(55) float local55 = local32 * local51;
		@Pc(61) int local61 = arg7 % (arg5 + arg6);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(80) float local80 = local38 * local51;
		@Pc(85) float local85 = local55 * (float) arg5;
		@Pc(90) float local90 = local80 * (float) arg5;
		@Pc(92) float local92 = 0.0F;
		@Pc(94) float local94 = 0.0F;
		@Pc(96) float local96 = local85;
		@Pc(98) float local98 = local90;
		if (local61 <= arg5) {
			local98 = local80 * (float) (arg5 - local61);
			local96 = (float) (arg5 - local61) * local55;
		} else {
			local94 = (float) (arg6 + arg5 - local61) * local80;
			local92 = local55 * (float) (arg5 + arg6 - local61);
		}
		@Pc(146) float local146 = local92 + (float) arg0 + 0.35F;
		@Pc(153) float local153 = (float) arg1 + local94 + 0.35F;
		@Pc(158) float local158 = local55 * (float) arg6;
		@Pc(163) float local163 = local80 * (float) arg6;
		while (true) {
			if (arg2 > arg0) {
				if (local146 > (float) arg2 + 0.35F) {
					break;
				}
				if ((float) arg2 < local146 + local96) {
					local96 = (float) arg2 - local146;
				}
			} else {
				if ((float) arg2 + 0.35F > local146) {
					break;
				}
				if ((float) arg2 > local96 + local146) {
					local96 = (float) arg2 - local146;
				}
			}
			if (arg1 < arg3) {
				if (local153 > (float) arg3 + 0.35F) {
					break;
				}
				if (local153 + local98 > (float) arg3) {
					local98 = (float) arg3 - local153;
				}
			} else {
				if ((float) arg3 + 0.35F > local153) {
					break;
				}
				if ((float) arg3 > local153 + local98) {
					local98 = (float) arg3 - local153;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local146, local153);
			OpenGL.glVertex2f(local96 + local146, local98 + local153);
			local153 += local163 + local98;
			OpenGL.glEnd();
			local146 += local158 + local96;
			local96 = local85;
			local98 = local90;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "(I)V")
	private void method2366() {
		if (this.anInt2771 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt2652 > 0 && this.anInt2598 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt2652, (double) this.anInt2598, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt2771 = 1;
		this.anInt2759 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!gea;)V")
	@Override
	public void method7730(@OriginalArg(0) Interface6 arg0) {
	}

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(Z)V")
	public void method2367() {
		OpenGL.glLightfv(16384, 4611, this.lb, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray24, 0);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIBI)V")
	public void method2368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ffa", name = "u", descriptor = "(I)V")
	private void method2369() {
		if (this.aBoolean225) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean225 = false;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "(B)V")
	private void method2370() {
		if (this.anInt2783 <= this.anInt2773 && this.anInt2761 >= this.anInt2787) {
			OpenGL.glScissor(this.anInt2784 + this.anInt2783, -this.anInt2761 + this.anInt2598 + this.anInt2770, this.anInt2773 - this.anInt2783, -this.anInt2787 + this.anInt2761);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "q", descriptor = "()V")
	@Override
	public void method7729() {
		if (this.aClass5_Sub34_Sub1_1 != null && this.aClass5_Sub34_Sub1_1.method5102()) {
			this.aClass177_1.method3837(this.aClass5_Sub34_Sub1_1);
			this.aClass394_1.method9306();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(JB)V")
	public synchronized void method2371(@OriginalArg(0) long arg0) {
		@Pc(15) Class5 local15 = new Class5();
		local15.aLong314 = arg0;
		this.aClass102_24.method1921(local15);
	}

	@OriginalMember(owner = "client!ffa", name = "o", descriptor = "()Z")
	@Override
	public boolean method7665() {
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "()Lclient!qq;")
	@Override
	public Class203 method7676() {
		return new Class203_Sub2();
	}

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "()Lclient!mi;")
	@Override
	public Class236 method7656() {
		@Pc(7) int local7 = -1;
		if (this.aString43.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString43.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString43.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class236(local7, "OpenGL", this.anInt2790, this.aString42, 0L);
	}

	@OriginalMember(owner = "client!ffa", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass203_Sub2_3.aFloat131 + (float) arg0 * this.aClass203_Sub2_3.aFloat125 + (float) arg1 * this.aClass203_Sub2_3.aFloat130 + (float) arg2 * this.aClass203_Sub2_3.aFloat122;
		if (local28 < (float) this.anInt2782 || local28 > (float) this.anInt2772) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(88) int local88 = (int) ((float) this.anInt2776 * ((float) arg2 * this.aClass203_Sub2_3.aFloat128 + (float) arg1 * this.aClass203_Sub2_3.aFloat124 + this.aClass203_Sub2_3.aFloat120 * (float) arg0 + this.aClass203_Sub2_3.aFloat126) / local28);
		@Pc(120) int local120 = (int) ((this.aClass203_Sub2_3.aFloat129 + (float) arg2 * this.aClass203_Sub2_3.aFloat121 + (float) arg0 * this.aClass203_Sub2_3.aFloat123 + (float) arg1 * this.aClass203_Sub2_3.aFloat127) * (float) this.anInt2778 / local28);
		if ((float) local88 >= this.aFloat50 && this.aFloat34 >= (float) local88 && (float) local120 >= this.aFloat35 && (float) local120 <= this.aFloat44) {
			arg3[0] = (int) ((float) local88 - this.aFloat50);
			arg3[1] = (int) ((float) local120 - this.aFloat35);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "(II)V")
	public void method2372(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt2758) {
			return;
		}
		@Pc(39) boolean local39;
		@Pc(37) byte local37;
		if (arg0 == 1) {
			local37 = 1;
			local39 = true;
		} else if (arg0 == 2) {
			local39 = false;
			local37 = 2;
		} else if (arg0 == 128) {
			local37 = 3;
			local39 = true;
		} else {
			local37 = 0;
			local39 = false;
		}
		if (!this.aBoolean207) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean207 = true;
		}
		if (this.aBoolean206 != local39) {
			if (local39) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean206 = local39;
		}
		if (this.anInt2757 != local37) {
			if (local37 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local37 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local37 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt2757 = local37;
		}
		this.anInt2759 &= 0xFFFFFFE3;
		this.anInt2758 = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt2749 = 0;
		while (arg0 > 1) {
			this.anInt2749++;
			arg0 >>= 0x1;
		}
		this.anInt2748 = 0x1 << this.anInt2749;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Lclient!nk;I)V")
	public void method2373(@OriginalArg(0) Interface17 arg0) {
		if (this.anInt2753 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt2753 >= 0) {
			this.anInterface17Array1[this.anInt2753].method1333();
		}
		this.anInterface17_2 = this.anInterface17Array1[++this.anInt2753] = arg0;
		this.anInterface17_2.method1335();
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ILclient!ob;)V")
	public void method2374(@OriginalArg(1) Class203_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6190(), 0);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!nk;B)V")
	public void method2375(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean214) {
			this.method2365(arg0);
			this.method2387(arg0);
		} else if (this.anInt2751 >= 0 && arg0 == this.anInterface17Array3[this.anInt2751]) {
			this.anInterface17Array3[this.anInt2751--] = null;
			arg0.method1332();
			if (this.anInt2751 >= 0) {
				this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array3[this.anInt2751];
				this.anInterface17_1.method1330();
			} else {
				this.anInterface17_1 = this.anInterface17_2 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "()Z")
	@Override
	public boolean method7704() {
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "()Z")
	@Override
	public boolean method7697() {
		if (this.aClass5_Sub34_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass5_Sub34_Sub1_1.method5102()) {
			if (!this.aClass177_1.method3832(this.aClass5_Sub34_Sub1_1)) {
				return false;
			}
			this.aClass394_1.method9306();
		}
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = (float) arg2 * this.aClass203_Sub2_3.aFloat122 + this.aClass203_Sub2_3.aFloat130 * (float) arg1 + this.aClass203_Sub2_3.aFloat125 * (float) arg0 + this.aClass203_Sub2_3.aFloat131;
		if (local28 < (float) this.anInt2782 || (float) this.anInt2772 < local28) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(89) int local89 = (int) (((float) arg2 * this.aClass203_Sub2_3.aFloat128 + this.aClass203_Sub2_3.aFloat120 * (float) arg0 + this.aClass203_Sub2_3.aFloat124 * (float) arg1 + this.aClass203_Sub2_3.aFloat126) * (float) this.anInt2776 / (float) arg3);
		@Pc(122) int local122 = (int) ((float) this.anInt2778 * (this.aClass203_Sub2_3.aFloat129 + (float) arg2 * this.aClass203_Sub2_3.aFloat121 + (float) arg0 * this.aClass203_Sub2_3.aFloat123 + (float) arg1 * this.aClass203_Sub2_3.aFloat127) / (float) arg3);
		if (this.aFloat50 <= (float) local89 && this.aFloat34 >= (float) local89 && this.aFloat35 <= (float) local122 && (float) local122 <= this.aFloat44) {
			arg4[2] = (int) local28;
			arg4[1] = (int) ((float) local122 - this.aFloat35);
			arg4[0] = (int) ((float) local89 - this.aFloat50);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "z", descriptor = "(I)I")
	private int method2376() {
		@Pc(5) int local5 = 0;
		this.aString43 = OpenGL.glGetString(7936).toLowerCase();
		this.aString42 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString43.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString43.indexOf("brian paul") != -1 || this.aString43.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(53) String local53 = OpenGL.glGetString(7938);
		@Pc(61) String[] local61 = Static439.method6502(local53.replace('.', ' '), ' ');
		if (local61.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(79) int local79 = Static595.method8613(local61[0]);
				@Pc(85) int local85 = Static595.method8613(local61[1]);
				this.anInt2790 = local85 + local79 * 10;
			} catch (@Pc(94) NumberFormatException local94) {
				local5 |= 0x4;
			}
		}
		if (this.anInt2790 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(134) int[] local134 = new int[1];
		OpenGL.glGetIntegerv(34018, local134, 0);
		this.anInt2775 = local134[0];
		OpenGL.glGetIntegerv(34929, local134, 0);
		this.anInt2767 = local134[0];
		OpenGL.glGetIntegerv(34930, local134, 0);
		this.anInt2791 = local134[0];
		if (this.anInt2775 < 2 || this.anInt2767 < 2 || this.anInt2791 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean216 = Stream.b();
		this.aBoolean222 = this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean226 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean212 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean224 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean217 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean220 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean213 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean231 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean230 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean233 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean228 = false;
		this.aBoolean234 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean214 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean219 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean209 = this.aBoolean219 & this.aBoolean214;
		this.aBoolean211 = Class99_Sub7.aString107.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static643.aFloatArray108, 0);
		this.bf = Static643.aFloatArray108[0];
		this.aFloat41 = Static643.aFloatArray108[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "()V")
	@Override
	public void method7717() {
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(B)V")
	private void method2377() {
		@Pc(15) int local15;
		for (local15 = 0; local15 < this.anInt2764; local15++) {
			@Pc(22) Class5_Sub43 local22 = this.aClass5_Sub43Array1[local15];
			@Pc(26) int local26 = local15 + 16386;
			Static565.aFloatArray107[0] = (float) local22.method8251();
			Static565.aFloatArray107[1] = (float) local22.method8257();
			Static565.aFloatArray107[2] = (float) local22.method8255();
			Static565.aFloatArray107[3] = 1.0F;
			OpenGL.glLightfv(local26, 4611, Static565.aFloatArray107, 0);
			@Pc(60) int local60 = local22.method8253();
			@Pc(66) float local66 = local22.method8250() / 255.0F;
			Static565.aFloatArray107[1] = (float) (local60 >> 8 & 0xFF) * local66;
			Static565.aFloatArray107[2] = local66 * (float) (local60 & 0xFF);
			Static565.aFloatArray107[0] = local66 * (float) (local60 >> 16 & 0xFF);
			OpenGL.glLightfv(local26, 4609, Static565.aFloatArray107, 0);
			OpenGL.glLightf(local26, 4617, 1.0F / (float) (local22.method8254() * local22.method8254()));
			OpenGL.glEnable(local26);
		}
		while (this.anInt2781 > local15) {
			OpenGL.glDisable(local15 + 16386);
			local15++;
		}
		this.anInt2781 = this.anInt2764;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BZ)V")
	public void method2378(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean227) {
			this.aBoolean227 = arg0;
			this.method2357();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIZ)Lclient!fs;")
	@Override
	public Class134 method7712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class134_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ffa", name = "o", descriptor = "(I)V")
	private void method2379() {
		if (this.aBoolean232 && this.anInt2766 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(III)V")
	public synchronized void method2380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class5_Sub29 local21 = new Class5_Sub29(arg0);
		local21.aLong314 = (long) arg1;
		this.aClass102_20.method1921(local21);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lclient!raa;I)V")
	public void method2381(@OriginalArg(0) Interface21 arg0) {
		if (arg0 != this.anInterface21_3) {
			if (this.aBoolean226) {
				OpenGL.glBindBufferARB(34963, arg0.method8200());
			}
			this.anInterface21_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(II)I")
	@Override
	public int method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIF)Lclient!uf;")
	@Override
	public Class5_Sub43 method7680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class5_Sub43_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ffa", name = "h", descriptor = "(II)V")
	public void method2382(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method2313(7681, 7681);
		} else if (arg0 == 0) {
			this.method2313(8448, 8448);
		} else if (arg0 == 2) {
			this.method2313(7681, 34165);
		} else if (arg0 == 3) {
			this.method2313(8448, 260);
		} else if (arg0 == 4) {
			this.method2313(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BF)V")
	public void method2383(@OriginalArg(1) float arg0) {
		if (this.aFloat49 == arg0) {
			return;
		}
		this.aFloat49 = arg0;
		if (this.anInt2771 == 3) {
			this.method2316();
			return;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(Lclient!nk;I)V")
	public void method2384(@OriginalArg(0) Interface17 arg0) {
		if (this.aBoolean214) {
			this.method2339(arg0);
			this.method2373(arg0);
		} else if (this.anInt2751 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt2751 >= 0) {
				this.anInterface17Array3[this.anInt2751].method1332();
			}
			this.anInterface17_1 = this.anInterface17_2 = this.anInterface17Array3[++this.anInt2751] = arg0;
			this.anInterface17_1.method1330();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "B", descriptor = "(I)V")
	public void method2385() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ffa", name = "y", descriptor = "()Z")
	@Override
	public boolean method7711() {
		return this.aClass5_Sub34_Sub1_1 != null && this.aClass5_Sub34_Sub1_1.method5102();
	}

	@OriginalMember(owner = "client!ffa", name = "s", descriptor = "()Z")
	@Override
	public boolean method7674() {
		return this.aBoolean212 && (!this.method7711() || this.aBoolean209);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)Lclient!rk;")
	@Override
	public Interface23 method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "()V")
	@Override
	protected void method7643() {
		for (@Pc(6) Class5 local6 = this.aClass102_17.method1916(); local6 != null; local6 = this.aClass102_17.method1915()) {
			((Class5_Sub10_Sub2) local6).method4128();
		}
		if (this.aClass177_1 != null) {
			this.aClass177_1.method3834();
		}
		if (this.anOpenGL1 != null) {
			this.method2351();
			@Pc(48) Enumeration local48 = this.aHashtable4.keys();
			while (local48.hasMoreElements()) {
				@Pc(56) Canvas local56 = (Canvas) local48.nextElement();
				@Pc(62) Long local62 = (Long) this.aHashtable4.get(local56);
				this.anOpenGL1.releaseSurface(local56, local62);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean204) {
			Static147.method2073(true, false);
			this.aBoolean204 = false;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class22 method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class22_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ffa", name = "w", descriptor = "(I)V")
	private void method2386() {
		if (this.anInt2771 != 3) {
			this.anInt2771 = 3;
			this.method2316();
			this.method2342();
			this.anInt2759 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static116.method2923(arg1, arg2, arg0, this, arg3);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BLclient!nk;)V")
	public void method2387(@OriginalArg(1) Interface17 arg0) {
		if (this.anInt2753 < 0 || this.anInterface17Array1[this.anInt2753] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface17Array1[this.anInt2753--] = null;
		arg0.method1333();
		if (this.anInt2753 >= 0) {
			this.anInterface17_2 = this.anInterface17Array1[this.anInt2753];
			this.anInterface17_2.method1335();
		} else {
			this.anInterface17_2 = null;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "(II)I")
	@Override
	public int method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "(III)V")
	public synchronized void method2388(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub29 local13 = new Class5_Sub29(arg1);
		local13.aLong314 = (long) arg0;
		this.aClass102_19.method1921(local13);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!ffa", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt2761) {
			this.anInt2761 = arg3;
		}
		if (arg2 < this.anInt2773) {
			this.anInt2773 = arg2;
		}
		if (arg1 > this.anInt2787) {
			this.anInt2787 = arg1;
		}
		if (arg0 > this.anInt2783) {
			this.anInt2783 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method2355();
		this.method2370();
	}

	@OriginalMember(owner = "client!ffa", name = "l", descriptor = "()Z")
	@Override
	public boolean method7694() {
		return true;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7701(@OriginalArg(0) boolean arg0) {
	}
}
