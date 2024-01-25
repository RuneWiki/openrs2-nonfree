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

@OriginalClass("client!ug")
public final class Class135_Sub2 extends Class135 {

	@OriginalMember(owner = "client!ug", name = "wb", descriptor = "I")
	public int anInt6646;

	@OriginalMember(owner = "client!ug", name = "Hb", descriptor = "I")
	public int anInt6656;

	@OriginalMember(owner = "client!ug", name = "Bc", descriptor = "I")
	private int anInt6701;

	@OriginalMember(owner = "client!ug", name = "Vd", descriptor = "I")
	private int anInt6768;

	@OriginalMember(owner = "client!ug", name = "ne", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ug", name = "re", descriptor = "I")
	public int anInt6779;

	@OriginalMember(owner = "client!ug", name = "xe", descriptor = "Lclient!fc;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ug", name = "Ae", descriptor = "Lclient!fc;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ug", name = "Be", descriptor = "I")
	public int anInt6784;

	@OriginalMember(owner = "client!ug", name = "De", descriptor = "I")
	private int anInt6785;

	@OriginalMember(owner = "client!ug", name = "Ee", descriptor = "I")
	public int anInt6786;

	@OriginalMember(owner = "client!ug", name = "Le", descriptor = "I")
	private int anInt6787;

	@OriginalMember(owner = "client!ug", name = "Me", descriptor = "Lclient!ns;")
	public Class183 aClass183_6;

	@OriginalMember(owner = "client!ug", name = "Pe", descriptor = "Z")
	private boolean aBoolean457;

	@OriginalMember(owner = "client!ug", name = "Se", descriptor = "Ljava/lang/String;")
	private String aString68;

	@OriginalMember(owner = "client!ug", name = "Te", descriptor = "Z")
	public boolean aBoolean459;

	@OriginalMember(owner = "client!ug", name = "We", descriptor = "I")
	private int anInt6790;

	@OriginalMember(owner = "client!ug", name = "Xe", descriptor = "I")
	public int anInt6791;

	@OriginalMember(owner = "client!ug", name = "Ze", descriptor = "F")
	public float aFloat78;

	@OriginalMember(owner = "client!ug", name = "cf", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_1;

	@OriginalMember(owner = "client!ug", name = "df", descriptor = "Lclient!og;")
	public Class190 aClass190_10;

	@OriginalMember(owner = "client!ug", name = "ff", descriptor = "Z")
	public boolean aBoolean462;

	@OriginalMember(owner = "client!ug", name = "gf", descriptor = "F")
	public float aFloat79;

	@OriginalMember(owner = "client!ug", name = "hf", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_2;

	@OriginalMember(owner = "client!ug", name = "jf", descriptor = "F")
	private float aFloat80;

	@OriginalMember(owner = "client!ug", name = "kf", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_3;

	@OriginalMember(owner = "client!ug", name = "mf", descriptor = "I")
	private int anInt6794;

	@OriginalMember(owner = "client!ug", name = "nf", descriptor = "Z")
	private boolean aBoolean463;

	@OriginalMember(owner = "client!ug", name = "of", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_4;

	@OriginalMember(owner = "client!ug", name = "pf", descriptor = "[Lclient!sq;")
	private Class65[] aClass65Array1;

	@OriginalMember(owner = "client!ug", name = "qf", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!ug", name = "rf", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!ug", name = "sf", descriptor = "Lclient!lc;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!ug", name = "tf", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_5;

	@OriginalMember(owner = "client!ug", name = "yf", descriptor = "I")
	private int anInt6797;

	@OriginalMember(owner = "client!ug", name = "zf", descriptor = "I")
	private int anInt6798;

	@OriginalMember(owner = "client!ug", name = "Af", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_6;

	@OriginalMember(owner = "client!ug", name = "Cf", descriptor = "Z")
	public boolean aBoolean465;

	@OriginalMember(owner = "client!ug", name = "Ef", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!ug", name = "Ff", descriptor = "Lclient!it;")
	private Interface7 anInterface7_5;

	@OriginalMember(owner = "client!ug", name = "Gf", descriptor = "Z")
	public boolean aBoolean467;

	@OriginalMember(owner = "client!ug", name = "Jf", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!ug", name = "Kf", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!ug", name = "Lf", descriptor = "F")
	private float aFloat86;

	@OriginalMember(owner = "client!ug", name = "Mf", descriptor = "I")
	public int anInt6801;

	@OriginalMember(owner = "client!ug", name = "Pf", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_7;

	@OriginalMember(owner = "client!ug", name = "Qf", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!ug", name = "Xf", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!ug", name = "ag", descriptor = "Lclient!km;")
	public Class35_Sub2 aClass35_Sub2_3;

	@OriginalMember(owner = "client!ug", name = "bg", descriptor = "Z")
	private boolean aBoolean472;

	@OriginalMember(owner = "client!ug", name = "cg", descriptor = "Z")
	public boolean aBoolean473;

	@OriginalMember(owner = "client!ug", name = "dg", descriptor = "Lclient!og;")
	public Class190 aClass190_11;

	@OriginalMember(owner = "client!ug", name = "eg", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!ug", name = "fg", descriptor = "I")
	private int anInt6808;

	@OriginalMember(owner = "client!ug", name = "hg", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_8;

	@OriginalMember(owner = "client!ug", name = "jg", descriptor = "Lclient!lc;")
	private Interface9 anInterface9_6;

	@OriginalMember(owner = "client!ug", name = "kg", descriptor = "I")
	public int anInt6809;

	@OriginalMember(owner = "client!ug", name = "pg", descriptor = "F")
	public float aFloat90;

	@OriginalMember(owner = "client!ug", name = "rg", descriptor = "Lclient!km;")
	public Class35_Sub2 aClass35_Sub2_4;

	@OriginalMember(owner = "client!ug", name = "sg", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!ug", name = "tg", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!ug", name = "vg", descriptor = "I")
	private int anInt6812;

	@OriginalMember(owner = "client!ug", name = "wg", descriptor = "Lclient!ml;")
	public Class65_Sub2 aClass65_Sub2_5;

	@OriginalMember(owner = "client!ug", name = "Ag", descriptor = "Lclient!nq;")
	private Class65_Sub2_Sub1 aClass65_Sub2_Sub1_5;

	@OriginalMember(owner = "client!ug", name = "Bg", descriptor = "Z")
	public boolean aBoolean477;

	@OriginalMember(owner = "client!ug", name = "Cg", descriptor = "I")
	public int anInt6815;

	@OriginalMember(owner = "client!ug", name = "Dg", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_9;

	@OriginalMember(owner = "client!ug", name = "Gg", descriptor = "I")
	private int anInt6818;

	@OriginalMember(owner = "client!ug", name = "Hg", descriptor = "Z")
	public boolean aBoolean478;

	@OriginalMember(owner = "client!ug", name = "Kg", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!ug", name = "Mg", descriptor = "I")
	private int anInt6820;

	@OriginalMember(owner = "client!ug", name = "Ng", descriptor = "Lclient!hq;")
	public Class116_Sub1 aClass116_Sub1_10;

	@OriginalMember(owner = "client!ug", name = "Og", descriptor = "I")
	private int anInt6821;

	@OriginalMember(owner = "client!ug", name = "Rg", descriptor = "I")
	private int anInt6822;

	@OriginalMember(owner = "client!ug", name = "Sg", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!ug", name = "Tg", descriptor = "Z")
	private boolean aBoolean482;

	@OriginalMember(owner = "client!ug", name = "Wg", descriptor = "J")
	private long aLong204;

	@OriginalMember(owner = "client!ug", name = "Xg", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!ug", name = "Yg", descriptor = "Lclient!ea;")
	private Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!ug", name = "Zg", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!ug", name = "dh", descriptor = "I")
	private int anInt6823;

	@OriginalMember(owner = "client!ug", name = "fh", descriptor = "I")
	private int anInt6824;

	@OriginalMember(owner = "client!ug", name = "Ed", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!ug", name = "je", descriptor = "I")
	public int anInt6777 = 128;

	@OriginalMember(owner = "client!ug", name = "de", descriptor = "Lclient!mi;")
	private final Class171 aClass171_1 = new Class171();

	@OriginalMember(owner = "client!ug", name = "ke", descriptor = "Lclient!km;")
	private final Class35_Sub2 aClass35_Sub2_1 = new Class35_Sub2();

	@OriginalMember(owner = "client!ug", name = "le", descriptor = "Lclient!km;")
	public final Class35_Sub2 aClass35_Sub2_2 = new Class35_Sub2();

	@OriginalMember(owner = "client!ug", name = "me", descriptor = "I")
	public int anInt6778 = 8;

	@OriginalMember(owner = "client!ug", name = "oe", descriptor = "Z")
	private boolean aBoolean456 = false;

	@OriginalMember(owner = "client!ug", name = "se", descriptor = "I")
	public int anInt6780 = 3;

	@OriginalMember(owner = "client!ug", name = "qe", descriptor = "Lclient!ub;")
	private final Class244 aClass244_39 = new Class244();

	@OriginalMember(owner = "client!ug", name = "ve", descriptor = "I")
	private int anInt6782 = -1;

	@OriginalMember(owner = "client!ug", name = "we", descriptor = "[Lclient!fc;")
	private final Interface3[] anInterface3Array2 = new Interface3[4];

	@OriginalMember(owner = "client!ug", name = "ue", descriptor = "[Lclient!fc;")
	private final Interface3[] anInterface3Array1 = new Interface3[4];

	@OriginalMember(owner = "client!ug", name = "ze", descriptor = "[Lclient!fc;")
	private final Interface3[] anInterface3Array3 = new Interface3[4];

	@OriginalMember(owner = "client!ug", name = "ye", descriptor = "I")
	private int anInt6783 = -1;

	@OriginalMember(owner = "client!ug", name = "te", descriptor = "I")
	private int anInt6781 = -1;

	@OriginalMember(owner = "client!ug", name = "Ce", descriptor = "Lclient!ub;")
	private final Class244 aClass244_40;

	@OriginalMember(owner = "client!ug", name = "Fe", descriptor = "Lclient!ub;")
	private final Class244 aClass244_41;

	@OriginalMember(owner = "client!ug", name = "Ge", descriptor = "Lclient!ub;")
	private final Class244 aClass244_42;

	@OriginalMember(owner = "client!ug", name = "He", descriptor = "Lclient!ub;")
	private final Class244 aClass244_43;

	@OriginalMember(owner = "client!ug", name = "Ie", descriptor = "Lclient!ub;")
	private final Class244 aClass244_44;

	@OriginalMember(owner = "client!ug", name = "Je", descriptor = "Lclient!ub;")
	private final Class244 aClass244_45;

	@OriginalMember(owner = "client!ug", name = "Ke", descriptor = "Lclient!ub;")
	private final Class244 aClass244_46;

	@OriginalMember(owner = "client!ug", name = "Qe", descriptor = "I")
	public int anInt6789;

	@OriginalMember(owner = "client!ug", name = "af", descriptor = "I")
	private int anInt6792;

	@OriginalMember(owner = "client!ug", name = "uf", descriptor = "I")
	public int anInt6795;

	@OriginalMember(owner = "client!ug", name = "bf", descriptor = "I")
	public int bf;

	@OriginalMember(owner = "client!ug", name = "Ne", descriptor = "F")
	public float aFloat77;

	@OriginalMember(owner = "client!ug", name = "Ve", descriptor = "[F")
	private final float[] aFloatArray27;

	@OriginalMember(owner = "client!ug", name = "If", descriptor = "F")
	private float aFloat84;

	@OriginalMember(owner = "client!ug", name = "wf", descriptor = "I")
	public int anInt6796;

	@OriginalMember(owner = "client!ug", name = "Bf", descriptor = "I")
	public int anInt6799;

	@OriginalMember(owner = "client!ug", name = "Vf", descriptor = "I")
	public int anInt6805;

	@OriginalMember(owner = "client!ug", name = "Yf", descriptor = "I")
	private int anInt6806;

	@OriginalMember(owner = "client!ug", name = "Hf", descriptor = "F")
	public float aFloat83;

	@OriginalMember(owner = "client!ug", name = "Zf", descriptor = "I")
	public int anInt6807;

	@OriginalMember(owner = "client!ug", name = "Nf", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!ug", name = "qg", descriptor = "I")
	public int anInt6811;

	@OriginalMember(owner = "client!ug", name = "Sf", descriptor = "I")
	private int anInt6803;

	@OriginalMember(owner = "client!ug", name = "lg", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!ug", name = "Of", descriptor = "I")
	private int anInt6802;

	@OriginalMember(owner = "client!ug", name = "Rf", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!ug", name = "Fg", descriptor = "I")
	public int anInt6817;

	@OriginalMember(owner = "client!ug", name = "xf", descriptor = "F")
	public float aFloat82;

	@OriginalMember(owner = "client!ug", name = "Ig", descriptor = "I")
	private int anInt6819;

	@OriginalMember(owner = "client!ug", name = "Eg", descriptor = "I")
	private int anInt6816;

	@OriginalMember(owner = "client!ug", name = "Oe", descriptor = "I")
	private int anInt6788;

	@OriginalMember(owner = "client!ug", name = "og", descriptor = "[Lclient!ku;")
	private final Class4_Sub7[] aClass4_Sub7Array3;

	@OriginalMember(owner = "client!ug", name = "ig", descriptor = "[F")
	private final float[] aFloatArray30;

	@OriginalMember(owner = "client!ug", name = "Uf", descriptor = "I")
	private int anInt6804;

	@OriginalMember(owner = "client!ug", name = "zg", descriptor = "I")
	private int anInt6814;

	@OriginalMember(owner = "client!ug", name = "Pg", descriptor = "F")
	private float aFloat95;

	@OriginalMember(owner = "client!ug", name = "yg", descriptor = "I")
	public int anInt6813;

	@OriginalMember(owner = "client!ug", name = "Qg", descriptor = "[F")
	private final float[] aFloatArray31;

	@OriginalMember(owner = "client!ug", name = "ug", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!ug", name = "vf", descriptor = "[F")
	private final float[] aFloatArray28;

	@OriginalMember(owner = "client!ug", name = "gg", descriptor = "[F")
	public final float[] aFloatArray29;

	@OriginalMember(owner = "client!ug", name = "Ug", descriptor = "F")
	private float aFloat96;

	@OriginalMember(owner = "client!ug", name = "lf", descriptor = "I")
	private int anInt6793;

	@OriginalMember(owner = "client!ug", name = "Lg", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!ug", name = "mg", descriptor = "I")
	public int anInt6810;

	@OriginalMember(owner = "client!ug", name = "Vg", descriptor = "F")
	public float aFloat97;

	@OriginalMember(owner = "client!ug", name = "Ye", descriptor = "Lclient!dd;")
	public Class4_Sub9_Sub1 aClass4_Sub9_Sub1_3;

	@OriginalMember(owner = "client!ug", name = "ch", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!ug", name = "ah", descriptor = "[I")
	public int[] anIntArray518;

	@OriginalMember(owner = "client!ug", name = "eh", descriptor = "[B")
	public final byte[] aByteArray84;

	@OriginalMember(owner = "client!ug", name = "bh", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!ug", name = "xb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas7;

	@OriginalMember(owner = "client!ug", name = "N", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas6;

	@OriginalMember(owner = "client!ug", name = "ce", descriptor = "I")
	public final int anInt6773;

	@OriginalMember(owner = "client!ug", name = "bd", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!ug", name = "Pc", descriptor = "J")
	private final long aLong203;

	@OriginalMember(owner = "client!ug", name = "jb", descriptor = "J")
	private long aLong202;

	@OriginalMember(owner = "client!ug", name = "Df", descriptor = "I")
	public final int anInt6800;

	@OriginalMember(owner = "client!ug", name = "ef", descriptor = "Z")
	private boolean aBoolean461;

	@OriginalMember(owner = "client!ug", name = "Wf", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!ug", name = "Ue", descriptor = "Z")
	public boolean aBoolean460;

	@OriginalMember(owner = "client!ug", name = "Jg", descriptor = "Z")
	public boolean aBoolean479;

	@OriginalMember(owner = "client!ug", name = "Tf", descriptor = "Z")
	private boolean aBoolean469;

	@OriginalMember(owner = "client!ug", name = "ng", descriptor = "Z")
	public boolean aBoolean475;

	@OriginalMember(owner = "client!ug", name = "Re", descriptor = "Z")
	public boolean aBoolean458;

	@OriginalMember(owner = "client!ug", name = "xg", descriptor = "Z")
	private final boolean aBoolean476;

	@OriginalMember(owner = "client!ug", name = "Xd", descriptor = "Lclient!wj;")
	public final Class265 aClass265_1;

	@OriginalMember(owner = "client!ug", name = "pe", descriptor = "Lclient!hj;")
	public final Class113 aClass113_1;

	@OriginalMember(owner = "client!ug", name = "be", descriptor = "Lclient!th;")
	private final Class237 aClass237_1;

	@OriginalMember(owner = "client!ug", name = "ge", descriptor = "Lclient!tq;")
	private Class4_Sub40_Sub1 aClass4_Sub40_Sub1_1;

	@OriginalMember(owner = "client!ug", name = "ie", descriptor = "Lclient!rm;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;ILclient!pc;)V")
	public Class135_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class196 arg4) {
		super(arg0, arg2);
		new Class239();
		new Class67(16);
		this.aClass244_40 = new Class244();
		this.aClass244_41 = new Class244();
		this.aClass244_42 = new Class244();
		this.aClass244_43 = new Class244();
		this.aClass244_44 = new Class244();
		this.aClass244_45 = new Class244();
		this.aClass244_46 = new Class244();
		this.anInt6789 = 3584;
		this.anInt6792 = 0;
		this.anInt6795 = 512;
		this.bf = 0;
		this.aFloat77 = 3584.0F;
		this.aFloatArray27 = new float[4];
		this.aFloat84 = 0.0F;
		this.anInt6796 = 50;
		this.anInt6799 = -1;
		this.anInt6805 = 0;
		this.anInt6806 = -1;
		this.aFloat83 = 1.0F;
		this.anInt6807 = -1;
		this.aBoolean468 = true;
		this.anInt6811 = 512;
		this.anInt6803 = 0;
		this.aFloat89 = 3584.0F;
		this.anInt6802 = 0;
		this.aFloat88 = 3000.0F;
		this.anInt6817 = 0;
		this.aFloat82 = -1.0F;
		this.anInt6819 = 8448;
		this.anInt6816 = -1;
		this.anInt6788 = 0;
		this.aClass4_Sub7Array3 = new Class4_Sub7[Static6.anInt99];
		this.aFloatArray30 = new float[4];
		this.anInt6804 = 0;
		this.anInt6814 = 0;
		this.aFloat95 = 1.0F;
		this.anInt6813 = 0;
		this.aFloatArray31 = new float[16];
		this.aFloat93 = 1.0F;
		this.aFloatArray28 = new float[4];
		this.aFloatArray29 = new float[4];
		this.aFloat96 = 1.0F;
		this.anInt6793 = 8448;
		this.aFloat94 = 1.0F;
		this.anInt6810 = -1;
		this.aFloat97 = -1.0F;
		this.aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(8192);
		this.anIntArray520 = new int[1];
		this.anIntArray518 = new int[1];
		this.aByteArray84 = new byte[16384];
		this.anIntArray519 = new int[1];
		this.aCanvas6 = this.aCanvas7 = arg1;
		this.anInt6773 = arg3;
		try {
			if (Static123.aBoolean150 == null || !Static123.aBoolean150) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static123.aBoolean150 = Boolean.TRUE;
				} else {
					@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
					if (!local276.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local276.startsWith("linux") || local276.startsWith("sunos")) {
						System.load(arg4.method3906("libjaggl.so").toString());
					} else if (local276.startsWith("mac")) {
						System.load(arg4.method3906("libjaggl.jnilib").toString());
					} else if (local276.startsWith("win")) {
						System.load(arg4.method3906("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static123.aBoolean150 = Boolean.TRUE;
				}
			}
			if (Static123.aBoolean150 == null || !Static123.aBoolean150) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong202 = this.aLong203 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt6773);
			if (this.aLong203 == 0L) {
				throw new RuntimeException("");
			}
			this.method5420();
			@Pc(379) int local379 = this.method5481();
			if (local379 != 0) {
				throw new RuntimeException("");
			}
			this.anInt6800 = this.aBoolean474 ? 33639 : 5121;
			@Pc(406) int local406;
			if (this.aString68.indexOf("radeon") != -1) {
				local406 = 0;
				@Pc(408) boolean local408 = false;
				@Pc(410) boolean local410 = false;
				@Pc(419) String[] local419 = Static15.method181(this.aString68.replace('/', ' '), ' ');
				for (@Pc(421) int local421 = 0; local421 < local419.length; local421++) {
					@Pc(427) String local427 = local419[local421];
					try {
						if (local427.length() > 0) {
							if (local427.charAt(0) == 'x' && local427.length() >= 3 && Static269.method3566(local427.substring(1, 3))) {
								local427 = local427.substring(1);
								local410 = true;
							}
							if (local427.equals("hd")) {
								local408 = true;
							} else {
								if (local427.startsWith("hd")) {
									local427 = local427.substring(2);
									local408 = true;
								}
								if (local427.length() >= 4 && Static269.method3566(local427.substring(0, 4))) {
									local406 = Static113.method1676(local427.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(492) Exception local492) {
					}
				}
				if (!local410 && !local408) {
					if (local406 >= 7000 && local406 <= 7999) {
						this.aBoolean461 = false;
					}
					if (local406 >= 7000 && local406 <= 9250) {
						this.aBoolean470 = false;
					}
				}
				if (!local408 || local406 < 4000) {
					this.aBoolean460 = false;
				}
				this.aBoolean479 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean469 = this.aBoolean461;
				this.aBoolean475 = true;
			}
			if (this.aString69.indexOf("intel") != -1) {
				this.aBoolean458 = false;
			}
			this.aBoolean476 = !this.aString69.equals("s3 graphics");
			if (this.aBoolean461) {
				try {
					@Pc(577) int[] local577 = new int[1];
					OpenGL.glGenBuffersARB(1, local577, 0);
				} catch (@Pc(583) Throwable local583) {
					throw new RuntimeException("");
				}
			}
			Static155.method2193(false, true);
			this.aBoolean456 = true;
			this.aClass265_1 = new Class265(this, super.anInterface5_7);
			this.method5455();
			this.aClass113_1 = new Class113(this);
			this.aClass237_1 = new Class237(this);
			if (this.aClass237_1.method5087()) {
				this.aClass4_Sub40_Sub1_1 = new Class4_Sub40_Sub1(this);
				if (!this.aClass4_Sub40_Sub1_1.method5199()) {
					this.aClass4_Sub40_Sub1_1.method5187();
					this.aClass4_Sub40_Sub1_1 = null;
				}
			}
			this.aClass222_1 = new Class222(this);
			this.method5476();
			this.method5466();
			OpenGL.glClear(16640);
			local406 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(662) Exception local662) {
					if (local406++ > 5) {
						throw new RuntimeException("");
					}
					Static435.method5777(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(682) Throwable local682) {
			local682.printStackTrace();
			this.method5357();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!li;[Lclient!qv;Z)Lclient!la;")
	@Override
	public Class123 method5352(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class216[] arg1) {
		return new Class123_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZBII[B)Lclient!lc;")
	public Interface9 method5405(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface9) (this.aBoolean461 && (!arg0 || this.aBoolean469) ? new Class98_Sub2(this, arg2, arg3, arg1, arg0) : new Class62_Sub1(this, arg2, arg3, arg1));
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5334(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
			throw new RuntimeException();
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable2.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(Z)V")
	private void method5406() {
		OpenGL.glViewport(this.anInt6792, this.anInt6803, this.anInt6656, this.anInt6646);
	}

	@OriginalMember(owner = "client!ug", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass35_Sub2_4.aFloat35 + (float) arg0 * this.aClass35_Sub2_4.aFloat41 + (float) arg1 * this.aClass35_Sub2_4.aFloat39 + (float) arg2 * this.aClass35_Sub2_4.aFloat33;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass35_Sub2_4.aFloat39 * (float) arg4 + (float) arg3 * this.aClass35_Sub2_4.aFloat41 + this.aClass35_Sub2_4.aFloat33 * (float) arg5 + this.aClass35_Sub2_4.aFloat35;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt6796 > local28 && (float) this.anInt6796 > local59 || !(!((float) this.anInt6789 < local28) || !((float) this.anInt6789 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass35_Sub2_4.aFloat38 + this.aClass35_Sub2_4.aFloat32 * (float) arg2 + this.aClass35_Sub2_4.aFloat37 * (float) arg1 + (float) arg0 * this.aClass35_Sub2_4.aFloat42) * (float) this.anInt6811 / local28);
		@Pc(155) int local155 = (int) ((this.aClass35_Sub2_4.aFloat32 * (float) arg5 + this.aClass35_Sub2_4.aFloat42 * (float) arg3 + this.aClass35_Sub2_4.aFloat37 * (float) arg4 + this.aClass35_Sub2_4.aFloat38) * (float) this.anInt6811 / local59);
		if ((float) local123 < this.aFloat81 && this.aFloat81 > (float) local155 || (float) local123 > this.aFloat90 && (float) local155 > this.aFloat90) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass35_Sub2_4.aFloat43 + (float) arg0 * this.aClass35_Sub2_4.aFloat40 + this.aClass35_Sub2_4.aFloat34 * (float) arg1 + (float) arg2 * this.aClass35_Sub2_4.aFloat36) * (float) this.anInt6795 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt6795 * (this.aClass35_Sub2_4.aFloat43 + this.aClass35_Sub2_4.aFloat36 * (float) arg5 + (float) arg4 * this.aClass35_Sub2_4.aFloat34 + this.aClass35_Sub2_4.aFloat40 * (float) arg3) / local59);
			return (!(this.aFloat91 > (float) local213) || !((float) local245 < this.aFloat91)) && (!((float) local213 > this.aFloat78) || !(this.aFloat78 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
	public void method5407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6794 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (arg0 != this.anInt6819) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt6819 = arg0;
			local21 = true;
		}
		if (arg1 != this.anInt6793) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local21 = true;
			this.anInt6793 = arg1;
		}
		if (local21) {
			this.anInt6812 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([Lclient!t;Lclient!fm;Lclient!c;[Lclient!vs;I)V")
	@Override
	public void method5358(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class20_Sub8[] arg3, @OriginalArg(4) int arg4) {
		this.method5372(arg0, arg2, arg3, arg4);
		this.method5384(arg1);
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
	public void method5408() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "()V")
	@Override
	protected void method5357() {
		for (@Pc(10) Class4 local10 = this.aClass244_39.method5263(); local10 != null; local10 = this.aClass244_39.method5271()) {
			((Class4_Sub39_Sub1) local10).method4986();
		}
		if (this.aClass237_1 != null) {
			this.aClass237_1.method5095();
		}
		if (this.anOpenGL1 != null) {
			this.method5442();
			@Pc(40) Enumeration local40 = this.aHashtable2.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable2.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean456) {
			Static246.method3241(false, true);
			this.aBoolean456 = false;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(FFFBF)V")
	public void method5409(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static12.aFloatArray1[0] = arg0;
		Static12.aFloatArray1[3] = arg2;
		Static12.aFloatArray1[2] = arg3;
		Static12.aFloatArray1[1] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static12.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!ug", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat88;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)V")
	@Override
	public void method5380(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt6816;
		if (local11 || arg1 != this.aFloat97 || this.aFloat82 != arg2) {
			this.anInt6816 = arg0;
			this.aFloat97 = arg1;
			this.aFloat82 = arg2;
			if (local11) {
				this.aFloat93 = (float) (this.anInt6816 & 0xFF0000) / 1.671168E7F;
				this.aFloat83 = (float) (this.anInt6816 & 0xFF00) / 65280.0F;
				this.aFloat94 = (float) (this.anInt6816 & 0xFF) / 255.0F;
				this.method5448();
			}
			this.method5428();
		}
		if (arg3 == this.aFloatArray28[0] && this.aFloatArray28[1] == arg4 && arg5 == this.aFloatArray28[2]) {
			return;
		}
		this.aFloatArray28[2] = arg5;
		this.aFloatArray28[1] = arg4;
		this.aFloatArray28[0] = arg3;
		this.aFloatArray27[1] = -arg4;
		this.aFloatArray27[2] = -arg5;
		this.aFloatArray27[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray29[1] = local138 * arg4;
		this.aFloatArray29[2] = local138 * arg5;
		this.aFloatArray29[0] = local138 * arg3;
		this.aFloatArray30[0] = -this.aFloatArray29[0];
		this.aFloatArray30[1] = -this.aFloatArray29[1];
		this.aFloatArray30[2] = -this.aFloatArray29[2];
		this.method5437();
		this.anInt6809 = (int) (arg3 * 256.0F / arg4);
		this.anInt6791 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6805 = arg1;
		this.anInt6811 = arg2;
		this.anInt6795 = arg3;
		this.bf = arg0;
		this.method5429();
		this.method5413();
		if (this.anInt6808 == 3) {
			this.method5453();
		} else if (this.anInt6808 == 2) {
			this.method5463();
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(Z)V")
	private void method5410() {
		if (this.anInt6808 != 2) {
			this.anInt6808 = 2;
			this.method5463();
			this.method5416();
			this.anInt6812 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!it;Z)V")
	public void method5411(@OriginalArg(0) Interface7 arg0) {
		if (arg0 != this.anInterface7_5) {
			if (this.aBoolean461) {
				OpenGL.glBindBufferARB(34963, arg0.method3828());
			}
			this.anInterface7_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)V")
	private void method5412() {
		if (this.aBoolean464 && this.aBoolean462 | this.anInt6807 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(I)V")
	private void method5413() {
		this.aFloat90 = this.anInt6788 - this.bf;
		this.aFloat81 = this.anInt6814 - this.bf;
		this.aFloat91 = this.anInt6802 - this.anInt6805;
		this.aFloat78 = this.anInt6804 - this.anInt6805;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)V")
	public void method5414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6803 = arg1;
		this.anInt6792 = arg0;
		this.method5406();
		this.method5445();
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(I)V")
	private void method5415() {
		if (this.aFloat85 == 0.0F) {
			this.aFloatArray31[14] = this.aFloat87;
			this.aFloatArray31[10] = this.aFloat86;
		} else {
			@Pc(17) float local17 = this.aFloat88 / (this.aFloat85 + this.aFloat88);
			@Pc(21) float local21 = local17 * local17;
			@Pc(37) float local37 = -this.aFloat87 * (1.0F - local17) * (1.0F - local17) / this.aFloat85;
			this.aFloatArray31[10] = local37 + this.aFloat86;
			this.aFloatArray31[14] = local21 * this.aFloat87;
		}
		this.aFloat77 = (float) this.anInt6789 - this.aFloat85;
		this.aFloat89 = (this.aFloatArray31[14] - (float) this.anInt6789) / this.aFloatArray31[10];
	}

	@OriginalMember(owner = "client!ug", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg0 * this.aClass35_Sub2_4.aFloat41 + this.aClass35_Sub2_4.aFloat39 * (float) arg1 + this.aClass35_Sub2_4.aFloat33 * (float) arg2 + this.aClass35_Sub2_4.aFloat35;
		if ((float) this.anInt6796 > local28 || (float) this.anInt6789 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt6811 * (this.aClass35_Sub2_4.aFloat38 + (float) arg0 * this.aClass35_Sub2_4.aFloat42 + (float) arg1 * this.aClass35_Sub2_4.aFloat37 + this.aClass35_Sub2_4.aFloat32 * (float) arg2) / local28);
		@Pc(117) int local117 = (int) (((float) arg0 * this.aClass35_Sub2_4.aFloat40 + this.aClass35_Sub2_4.aFloat34 * (float) arg1 + (float) arg2 * this.aClass35_Sub2_4.aFloat36 + this.aClass35_Sub2_4.aFloat43) * (float) this.anInt6795 / local28);
		if ((float) local85 >= this.aFloat81 && (float) local85 <= this.aFloat90 && (float) local117 >= this.aFloat91 && (float) local117 <= this.aFloat78) {
			arg3[1] = (int) ((float) local117 - this.aFloat91);
			arg3[0] = (int) ((float) local85 - this.aFloat81);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "()Z")
	@Override
	public boolean method5393() {
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(I)V")
	private void method5416() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass35_Sub2_4.method2905(), 0);
		if (this.aBoolean462) {
			this.aClass222_1.aClass10_Sub5_1.method3688();
		}
		this.method5437();
		this.method5471();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5328(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZ)V")
	public void method5417(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean466) {
			this.aBoolean466 = arg0;
			this.method5450();
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "()Z")
	@Override
	public boolean method5337() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt6796;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5329(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas7) {
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

	@OriginalMember(owner = "client!ug", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat85;
	}

	@OriginalMember(owner = "client!ug", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt6796 && this.anInt6789 == arg1) {
			return;
		}
		this.anInt6796 = arg0;
		this.anInt6789 = arg1;
		this.method5429();
		this.method5462();
		if (this.anInt6808 == 3) {
			this.method5453();
		} else if (this.anInt6808 == 2) {
			this.method5463();
		}
	}

	@OriginalMember(owner = "client!ug", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt6789;
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "()V")
	@Override
	public void method5353() {
		if (this.aClass4_Sub40_Sub1_1 != null && this.aClass4_Sub40_Sub1_1.method5197()) {
			this.aClass237_1.method5090(this.aClass4_Sub40_Sub1_1);
			this.aClass265_1.method5927();
		}
	}

	@OriginalMember(owner = "client!ug", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		this.anInt6780 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt6780++;
		}
		this.anInt6778 = 0x1 << this.anInt6780;
	}

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "()Lclient!c;")
	@Override
	public Class35 method5398() {
		return this.aClass35_Sub2_1;
	}

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "()V")
	@Override
	public void method5395() {
		this.method5473(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "()Z")
	@Override
	public boolean method5397() {
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!fc;)V")
	public void method5419(@OriginalArg(1) Interface3 arg0) {
		if (this.aBoolean465) {
			this.method5434(arg0);
			this.method5475(arg0);
		} else if (this.anInt6782 >= 0 && this.anInterface3Array1[this.anInt6782] == arg0) {
			this.anInterface3Array1[this.anInt6782--] = null;
			arg0.method3604();
			if (this.anInt6782 < 0) {
				this.anInterface3_2 = this.anInterface3_1 = null;
			} else {
				this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array1[this.anInt6782];
				this.anInterface3_2.method3599();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(Z)V")
	private void method5420() {
		@Pc(11) int local11 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local11++ > 5) {
				throw new RuntimeException("");
			}
			Static435.method5777(1000L);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!vs;I)V")
	@Override
	public void method5372(@OriginalArg(0) Class116[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class20_Sub8[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method3117(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "()Z")
	@Override
	public boolean method5350() {
		return this.aClass222_1.method4611();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!t;Lclient!fm;Lclient!c;Lclient!vs;I)V")
	@Override
	public void method5396(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class20_Sub8 arg3) {
		arg0.method3117(arg2, arg3, 0);
		this.method5384(arg1);
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)Lclient!nn;")
	public Class65_Sub3 method5421() {
		return this.aClass3_Sub1_1 == null ? null : this.aClass3_Sub1_1.method4133();
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)V")
	public synchronized void method5422(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub24 local14 = new Class4_Sub24(arg1);
		local14.aLong227 = arg0;
		this.aClass244_41.method5273(local14);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI[BI)Lclient!it;")
	public Interface7 method5423(@OriginalArg(1) boolean arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2) {
		return (Interface7) (this.aBoolean461 && (!arg0 || this.aBoolean469) ? new Class98_Sub1(this, 5123, arg1, arg2, arg0) : new Class62_Sub2(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!fc;I)V")
	public void method5424(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt6783 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6783 >= 0) {
			this.anInterface3Array2[this.anInt6783].method3600();
		}
		this.anInterface3_2 = this.anInterface3Array2[++this.anInt6783] = arg0;
		this.anInterface3_2.method3602();
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIII)V")
	public void method5425(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class95 method5351(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class95_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
	public void method5426(@OriginalArg(1) int arg0) {
		if (arg0 == this.anInt6820) {
			return;
		}
		@Pc(17) boolean local17;
		@Pc(15) byte local15;
		if (arg0 == 1) {
			local15 = 1;
			local17 = true;
		} else if (arg0 == 2) {
			local15 = 2;
			local17 = false;
		} else if (arg0 == 128) {
			local17 = true;
			local15 = 3;
		} else {
			local17 = false;
			local15 = 0;
		}
		if (!this.aBoolean472) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean472 = true;
		}
		if (this.aBoolean483 != local17) {
			if (local17) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean483 = local17;
		}
		if (local15 != this.anInt6818) {
			if (local15 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local15 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local15 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt6818 = local15;
		}
		this.anInt6820 = arg0;
		this.anInt6812 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ug", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class71_Sub1 local6 = (Class71_Sub1) arg1;
		@Pc(9) Class65_Sub2_Sub1 local9 = local6.aClass65_Sub2_Sub1_1;
		this.method5454();
		this.method5458(local6.aClass65_Sub2_Sub1_1);
		this.method5426(1);
		this.method5407(7681, 8448);
		this.method5474(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat49 / (float) local9.anInt4507;
		@Pc(46) float local46 = local9.aFloat50 / (float) local9.anInt4511;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6814 - arg2), (float) (this.anInt6802 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6814, this.anInt6802);
		OpenGL.glTexCoord2f((float) (this.anInt6814 - arg2) * local39, (float) (this.anInt6804 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6814, this.anInt6804);
		OpenGL.glTexCoord2f((float) (this.anInt6788 - arg2) * local39, local46 * (float) (this.anInt6804 - arg3));
		OpenGL.glVertex2i(this.anInt6788, this.anInt6804);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt6788 - arg2), (float) (this.anInt6802 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6788, this.anInt6802);
		OpenGL.glEnd();
		this.method5474(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BFFF)V")
	private void method5427(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean481) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean481 = true;
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(I)V")
	private void method5428() {
		Static12.aFloatArray1[0] = this.aFloat97 * this.aFloat93;
		Static12.aFloatArray1[2] = this.aFloat97 * this.aFloat94;
		Static12.aFloatArray1[3] = 1.0F;
		Static12.aFloatArray1[1] = this.aFloat97 * this.aFloat83;
		OpenGL.glLightfv(16384, 4609, Static12.aFloatArray1, 0);
		Static12.aFloatArray1[3] = 1.0F;
		Static12.aFloatArray1[1] = this.aFloat83 * -this.aFloat82;
		Static12.aFloatArray1[0] = this.aFloat93 * -this.aFloat82;
		Static12.aFloatArray1[2] = -this.aFloat82 * this.aFloat94;
		OpenGL.glLightfv(16385, 4609, Static12.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(Z)V")
	private void method5429() {
		@Pc(6) float[] local6 = this.aFloatArray31;
		@Pc(18) float local18 = (float) (-this.bf * this.anInt6796) / (float) this.anInt6811;
		@Pc(32) float local32 = (float) ((this.anInt6656 - this.bf) * this.anInt6796) / (float) this.anInt6811;
		@Pc(43) float local43 = (float) (this.anInt6796 * this.anInt6805) / (float) this.anInt6795;
		@Pc(58) float local58 = (float) ((this.anInt6805 - this.anInt6646) * this.anInt6796) / (float) this.anInt6795;
		if (local18 == local32 || local58 == local43) {
			local6[11] = 0.0F;
			local6[14] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = 1.0F;
			local6[10] = 1.0F;
			local6[2] = 0.0F;
			local6[7] = 0.0F;
			local6[0] = 1.0F;
			local6[12] = 0.0F;
			local6[15] = 1.0F;
			local6[8] = 0.0F;
			local6[6] = 0.0F;
			local6[4] = 0.0F;
			local6[9] = 0.0F;
			local6[3] = 0.0F;
			local6[1] = 0.0F;
		} else {
			@Pc(138) float local138 = (float) this.anInt6796 * 2.0F;
			local6[10] = this.aFloat86 = (float) -(this.anInt6789 + this.anInt6796) / (float) (this.anInt6789 - this.anInt6796);
			local6[7] = 0.0F;
			local6[8] = (local18 + local32) / (-local18 + local32);
			local6[11] = -1.0F;
			local6[9] = (local58 + local43) / (-local58 + local43);
			local6[6] = 0.0F;
			local6[1] = 0.0F;
			local6[15] = 0.0F;
			local6[0] = local138 / (local32 - local18);
			local6[13] = 0.0F;
			local6[4] = 0.0F;
			local6[5] = local138 / (local43 - local58);
			local6[14] = this.aFloat87 = -((float) this.anInt6789 * local138) / (float) (this.anInt6789 - this.anInt6796);
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[2] = 0.0F;
		}
		this.method5415();
	}

	@OriginalMember(owner = "client!ug", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt6785 + this.anInt6786 + this.anInt6784;
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(B)V")
	private void method5430() {
		if (this.anInt6808 != 3) {
			this.anInt6808 = 3;
			this.method5453();
			this.method5416();
			this.anInt6812 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.aBoolean462 = false;
		this.aClass222_1.method4613(false, 0, false);
		this.method5462();
		this.method5412();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!og;Lclient!og;Lclient!og;ZLclient!og;)V")
	public void method5431(@OriginalArg(0) Class190 arg0, @OriginalArg(1) Class190 arg1, @OriginalArg(2) Class190 arg2, @OriginalArg(4) Class190 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5484(arg1.anInterface9_3);
			OpenGL.glVertexPointer(arg1.aByte77, arg1.aShort69, this.anInterface9_5.method2934(), this.anInterface9_5.method2935() + (long) arg1.aByte76);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5484(arg3.anInterface9_3);
			OpenGL.glNormalPointer(arg3.aShort69, this.anInterface9_5.method2934(), this.anInterface9_5.method2935() + (long) arg3.aByte76);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5484(arg2.anInterface9_3);
			OpenGL.glColorPointer(arg2.aByte77, arg2.aShort69, this.anInterface9_5.method2934(), this.anInterface9_5.method2935() + (long) arg2.aByte76);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5484(arg0.anInterface9_3);
			OpenGL.glTexCoordPointer(arg0.aByte77, arg0.aShort69, this.anInterface9_5.method2934(), this.anInterface9_5.method2935() + (long) arg0.aByte76);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(B)V")
	private void method5432() {
		OpenGL.glDepthMask(this.aBoolean463 && this.aBoolean468);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class41 method5378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class41_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)I")
	public int method5433(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5377(@OriginalArg(0) Canvas arg0) {
		this.aCanvas6 = null;
		this.aLong202 = 0L;
		if (arg0 == null || this.aCanvas7 == arg0) {
			this.aCanvas6 = this.aCanvas7;
			this.aLong202 = this.aLong203;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable2.get(arg0);
			this.aLong202 = local26;
			this.aCanvas6 = arg0;
		}
		if (this.aCanvas6 == null || this.aLong202 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong202);
		this.method5466();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!kc;Lclient!kc;FLclient!kc;)Lclient!kc;")
	@Override
	public Class3 method5331(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class3 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean478 && this.aBoolean458) {
			@Pc(15) Class3_Sub1_Sub2 local15 = null;
			@Pc(18) Class3_Sub1 local18 = (Class3_Sub1) arg0;
			@Pc(21) Class3_Sub1 local21 = (Class3_Sub1) arg1;
			@Pc(25) Class65_Sub3 local25 = local18.method4133();
			@Pc(29) Class65_Sub3 local29 = local21.method4133();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt4432 > local29.anInt4432 ? local25.anInt4432 : local29.anInt4432;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class3_Sub1_Sub2) {
					@Pc(56) Class3_Sub1_Sub2 local56 = (Class3_Sub1_Sub2) arg3;
					if (local56.method4140() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class3_Sub1_Sub2(this, local44);
				}
				if (local15.method4136(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(ILclient!fc;)V")
	public void method5434(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt6783 < 0 || arg0 != this.anInterface3Array2[this.anInt6783]) {
			throw new RuntimeException();
		}
		this.anInterface3Array2[this.anInt6783--] = null;
		arg0.method3600();
		if (this.anInt6783 >= 0) {
			this.anInterface3_2 = this.anInterface3Array2[this.anInt6783];
			this.anInterface3_2.method3602();
		} else {
			this.anInterface3_2 = null;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(BI)V")
	public void method5435(@OriginalArg(1) int arg0) {
		Static12.aFloatArray1[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static12.aFloatArray1[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static12.aFloatArray1[3] = (float) (arg0 >>> 24) / 255.0F;
		Static12.aFloatArray1[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static12.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)V")
	public synchronized void method5436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub24 local8 = new Class4_Sub24(arg0);
		local8.aLong227 = arg1;
		this.aClass244_42.method5273(local8);
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "(I)V")
	public void method5437() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray29, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray30, 0);
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(B)V")
	private void method5438() {
		if (this.aBoolean481) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean481 = false;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Lclient!fc;I)V")
	public void method5439(@OriginalArg(0) Interface3 arg0) {
		if (this.aBoolean465) {
			this.method5424(arg0);
			this.method5460(arg0);
		} else if (this.anInt6782 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt6782 >= 0) {
				this.anInterface3Array1[this.anInt6782].method3604();
			}
			this.anInterface3_2 = this.anInterface3_1 = this.anInterface3Array1[++this.anInt6782] = arg0;
			this.anInterface3_2.method3599();
		}
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(B)V")
	public void method5440() {
		if (this.anInt6812 == 16) {
			return;
		}
		this.method5430();
		this.method5480(true);
		this.method5447(true);
		this.method5473(true);
		this.method5426(1);
		this.method5441(0);
		this.anInt6812 = 16;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)V")
	public void method5441(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method5407(7681, 7681);
		} else if (arg0 == 0) {
			this.method5407(8448, 8448);
		} else if (arg0 == 2) {
			this.method5407(34165, 7681);
		} else if (arg0 == 3) {
			this.method5407(260, 8448);
		} else if (arg0 == 4) {
			this.method5407(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5446();
		this.method5426(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ug", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean462) {
			throw new RuntimeException("");
		}
		this.anInt6815 = arg0;
		this.anInt6817 = arg3;
		this.anInt6806 = arg1;
		this.anInt6810 = arg2;
		this.aClass222_1.aClass10_Sub5_1.method3688();
		this.method5462();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass237_1.method5093(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(B)V")
	private void method5442() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class71 method5343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static64.method924(arg0, arg3, arg1, this, arg2);
	}

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "()Lclient!c;")
	@Override
	public Class35 method5400() {
		return new Class35_Sub2();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)V")
	public void method5443(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method5472(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
	@Override
	public void method5339(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)V")
	public synchronized void method5444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class4_Sub24 local14 = new Class4_Sub24(arg0);
		local14.aLong227 = arg1;
		this.aClass244_44.method5273(local14);
	}

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "()Z")
	@Override
	public boolean method5367() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "(B)V")
	private void method5445() {
		if (this.anInt6788 >= this.anInt6814 && this.anInt6804 >= this.anInt6802) {
			OpenGL.glScissor(this.anInt6792 + this.anInt6814, this.anInt6646 + this.anInt6803 - this.anInt6804, this.anInt6788 - this.anInt6814, -this.anInt6802 + this.anInt6804);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(I)V")
	private void method5446() {
		if (this.anInt6812 == 1) {
			return;
		}
		this.method5467();
		this.method5480(false);
		this.method5461(false);
		this.method5447(false);
		this.method5473(false);
		this.method5458(null);
		this.method5485(-2);
		this.method5441(1);
		this.anInt6812 = 1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V")
	public void method5447(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean484 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt6812 &= 0xFFFFFFE0;
		this.aBoolean484 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6656 < arg2) {
			arg2 = this.anInt6656;
		}
		if (arg3 > this.anInt6646) {
			arg3 = this.anInt6646;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt6804 = arg3;
		this.anInt6802 = arg1;
		this.anInt6814 = arg0;
		this.anInt6788 = arg2;
		OpenGL.glEnable(3089);
		this.method5413();
		this.method5445();
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "()Z")
	@Override
	public boolean method5342() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "(I)V")
	private void method5448() {
		Static12.aFloatArray1[2] = this.aFloat92 * this.aFloat94;
		Static12.aFloatArray1[1] = this.aFloat92 * this.aFloat83;
		Static12.aFloatArray1[3] = 1.0F;
		Static12.aFloatArray1[0] = this.aFloat92 * this.aFloat93;
		OpenGL.glLightModelfv(2899, Static12.aFloatArray1, 0);
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "()I")
	@Override
	public int method5362() {
		return 4;
	}

	@OriginalMember(owner = "client!ug", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = (float) arg2 + local8;
		this.method5446();
		@Pc(26) float local26 = local13 + (float) arg3;
		this.method5426(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean471) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean471) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5363(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas7 == arg0) {
			local5 = this.aLong203;
		} else if (this.aHashtable2.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable2.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas6 == arg0) {
			this.method5466();
		}
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(II)V")
	public synchronized void method5449(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub24 local8 = new Class4_Sub24(arg0);
		this.aClass244_43.method5273(local8);
	}

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "(I)V")
	private void method5450() {
		if (this.aBoolean457 && !this.aBoolean466) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "(I)V")
	public void method5451() {
		if (this.anInt6812 == 4) {
			return;
		}
		this.method5467();
		this.method5480(false);
		this.method5461(false);
		this.method5447(false);
		this.method5473(false);
		this.method5485(-2);
		this.method5426(1);
		this.method5441(0);
		this.anInt6812 = 4;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[Lclient!ku;)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass4_Sub7Array3[local7] = arg1[local7];
		}
		this.anInt6798 = arg0;
		if (this.anInt6808 != 1) {
			this.method5471();
		}
	}

	@OriginalMember(owner = "client!ug", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BIII)V")
	public void method5452(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(B)V")
	private void method5453() {
		@Pc(15) float local15 = this.aFloat95 * (float) -this.bf / (float) this.anInt6811;
		@Pc(27) float local27 = this.aFloat95 * (float) -this.anInt6805 / (float) this.anInt6795;
		@Pc(42) float local42 = (float) (this.anInt6656 - this.bf) * this.aFloat95 / (float) this.anInt6811;
		@Pc(63) float local63 = (float) (this.anInt6646 - this.anInt6805) * this.aFloat95 / (float) this.anInt6795;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local63) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local63, (double) -local27, (double) ((float) this.anInt6796 - this.aFloat85), (double) ((float) this.anInt6789 - this.aFloat85));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ug", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean462 = true;
		this.anInt6806 = arg1;
		this.anInt6817 = arg3;
		this.anInt6810 = arg2;
		this.anInt6815 = arg0;
		this.aClass222_1.method4613(false, 3, false);
		this.aClass222_1.aClass10_Sub5_1.method3688();
		this.method5462();
		this.method5412();
	}

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "(I)V")
	public void method5454() {
		if (this.anInt6812 == 2) {
			return;
		}
		this.method5467();
		this.method5480(false);
		this.method5461(false);
		this.method5447(false);
		this.method5473(false);
		this.method5485(-2);
		this.anInt6812 = 2;
	}

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "(I)V")
	private void method5455() {
		this.aClass35_Sub2_4 = new Class35_Sub2();
		this.aClass35_Sub2_3 = new Class35_Sub2();
		this.aClass65Array1 = new Class65[this.anInt6801];
		this.aClass65_Sub2_5 = new Class65_Sub2(this, 3553, 6408, 1, 1);
		new Class65_Sub2(this, 3553, 6408, 1, 1);
		new Class65_Sub2(this, 3553, 6408, 1, 1);
		this.aClass116_Sub1_9 = new Class116_Sub1(this);
		this.aClass116_Sub1_7 = new Class116_Sub1(this);
		this.aClass116_Sub1_2 = new Class116_Sub1(this);
		this.aClass116_Sub1_1 = new Class116_Sub1(this);
		this.aClass116_Sub1_10 = new Class116_Sub1(this);
		this.aClass116_Sub1_5 = new Class116_Sub1(this);
		this.aClass116_Sub1_8 = new Class116_Sub1(this);
		this.aClass116_Sub1_3 = new Class116_Sub1(this);
		this.aClass116_Sub1_4 = new Class116_Sub1(this);
		this.aClass116_Sub1_6 = new Class116_Sub1(this);
		if (this.aBoolean458) {
			this.aClass183_6 = new Class183(this);
			new Class183(this);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5360() {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(JB)V")
	public synchronized void method5456(@OriginalArg(0) long arg0) {
		@Pc(14) Class4 local14 = new Class4();
		local14.aLong227 = arg0;
		this.aClass244_46.method5273(local14);
	}

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "()Z")
	@Override
	public boolean method5387() {
		return this.aBoolean471 && (!this.method5355() || this.aBoolean482);
	}

	@OriginalMember(owner = "client!ug", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class35 arg0) {
		this.aClass35_Sub2_4 = (Class35_Sub2) arg0;
		this.aClass35_Sub2_3.method2907(this.aClass35_Sub2_4);
		if (this.anInt6808 != 1) {
			this.method5416();
		}
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(II)V")
	public void method5457(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt6794) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6794 = arg0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public Class4_Sub39 method5381(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub39_Sub1 local8 = new Class4_Sub39_Sub1(arg0);
		this.aClass244_39.method5273(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(6) int local6 = this.anInt6823;
		this.anInt6823 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!sq;I)V")
	public void method5458(@OriginalArg(0) Class65 arg0) {
		@Pc(11) Class65 local11 = this.aClass65Array1[this.anInt6794];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5976);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5976);
				} else if (local11.anInt5976 != arg0.anInt5976) {
					OpenGL.glDisable(local11.anInt5976);
					OpenGL.glEnable(arg0.anInt5976);
				}
				OpenGL.glBindTexture(arg0.anInt5976, arg0.method4768());
			}
			this.aClass65Array1[this.anInt6794] = arg0;
		}
		this.anInt6812 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
	@Override
	public int method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(II)V")
	public synchronized void method5459(@OriginalArg(0) int arg0) {
		@Pc(15) Class4 local15 = new Class4();
		local15.aLong227 = arg0;
		this.aClass244_45.method5273(local15);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!fc;)V")
	public void method5460(@OriginalArg(1) Interface3 arg0) {
		if (this.anInt6781 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6781 >= 0) {
			this.anInterface3Array3[this.anInt6781].method3601();
		}
		this.anInterface3_1 = this.anInterface3Array3[++this.anInt6781] = arg0;
		this.anInterface3_1.method3603();
	}

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		if (this.aFloat92 != arg0) {
			this.aFloat92 = arg0;
			this.method5448();
		}
	}

	@OriginalMember(owner = "client!ug", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(6) int local6 = this.anInt6824;
		this.anInt6824 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ)V")
	public void method5461(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean457) {
			this.aBoolean457 = arg0;
			this.method5450();
			this.anInt6812 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(Z)V")
	private void method5462() {
		@Pc(22) int local22;
		if (this.aBoolean462) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local22 = this.anInt6806;
		} else {
			this.aFloat80 = (float) (this.anInt6789 - this.anInt6813) - this.aFloat84;
			this.aFloat79 = this.aFloat80 - (float) this.anInt6807 * this.aFloat96;
			if (this.aFloat79 < (float) this.anInt6796) {
				this.aFloat79 = this.anInt6796;
			}
			OpenGL.glFogf(2915, this.aFloat79);
			OpenGL.glFogf(2916, this.aFloat80);
			local22 = this.anInt6799;
		}
		Static12.aFloatArray1[2] = (float) (local22 & 0xFF) / 255.0F;
		Static12.aFloatArray1[1] = (float) (local22 & 0xFF00) / 65280.0F;
		Static12.aFloatArray1[0] = (float) (local22 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static12.aFloatArray1, 0);
		if (this.aBoolean462) {
			this.aClass222_1.aClass10_Sub5_1.method3687();
		}
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "(B)V")
	private void method5463() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray31, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!km;)V")
	public void method5464(@OriginalArg(1) Class35_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2905(), 0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!mb;IIII)Lclient!t;")
	@Override
	public Class116 method5391(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class116_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "()Z")
	@Override
	public boolean method5375() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "(I)V")
	public void method5465() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	@Override
	public void method5336(@OriginalArg(0) boolean arg0) {
		this.aBoolean468 = arg0;
		this.method5432();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!fm;)V")
	@Override
	public void method5384(@OriginalArg(0) Class83 arg0) {
		this.aClass171_1.method3237(this, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "()Z")
	@Override
	public boolean method5392() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method5389(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class4_Sub24 local19;
		while (!this.aClass244_41.method5272()) {
			local19 = (Class4_Sub24) this.aClass244_41.method5268();
			Static407.anIntArray522[local11++] = (int) local19.aLong227;
			this.anInt6784 -= local19.anInt4057;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static407.anIntArray522, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static407.anIntArray522, 0);
			local11 = 0;
		}
		while (!this.aClass244_42.method5272()) {
			local19 = (Class4_Sub24) this.aClass244_42.method5268();
			Static407.anIntArray522[local11++] = (int) local19.aLong227;
			this.anInt6786 -= local19.anInt4057;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static407.anIntArray522, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static407.anIntArray522, 0);
			local11 = 0;
		}
		while (!this.aClass244_43.method5272()) {
			local19 = (Class4_Sub24) this.aClass244_43.method5268();
			Static407.anIntArray522[local11++] = local19.anInt4057;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static407.anIntArray522, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static407.anIntArray522, 0);
			local11 = 0;
		}
		while (!this.aClass244_44.method5272()) {
			local19 = (Class4_Sub24) this.aClass244_44.method5268();
			Static407.anIntArray522[local11++] = (int) local19.aLong227;
			this.anInt6785 -= local19.anInt4057;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static407.anIntArray522, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static407.anIntArray522, 0);
		}
		while (!this.aClass244_40.method5272()) {
			local19 = (Class4_Sub24) this.aClass244_40.method5268();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt4057);
		}
		@Pc(214) Class4 local214;
		while (!this.aClass244_45.method5272()) {
			local214 = this.aClass244_45.method5268();
			OpenGL.glDeleteProgramARB((int) local214.aLong227);
		}
		while (!this.aClass244_46.method5272()) {
			local214 = this.aClass244_46.method5268();
			OpenGL.glDeleteObjectARB(local214.aLong227);
		}
		while (!this.aClass244_40.method5272()) {
			local19 = (Class4_Sub24) this.aClass244_40.method5268();
			OpenGL.glDeleteLists((int) local19.aLong227, local19.anInt4057);
		}
		this.aClass265_1.method5926();
		if (this.IA() > 100663296 && Static266.method3498() > this.aLong204 + 60000L) {
			System.gc();
			this.aLong204 = Static266.method3498();
		}
		this.anInt6779 = local9;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5382(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static112.aFloat24 = arg0;
		Static198.aFloat58 = arg1;
		Static296.aFloat56 = arg2;
	}

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "(Z)V")
	private void method5466() {
		if (this.aCanvas6 == null) {
			this.anInt6768 = this.anInt6701 = 0;
		} else {
			@Pc(17) Dimension local17 = this.aCanvas6.getSize();
			this.anInt6768 = local17.width;
			this.anInt6701 = local17.height;
		}
		if (this.anInterface3_1 == null) {
			this.anInt6656 = this.anInt6768;
			this.anInt6646 = this.anInt6701;
			this.method5406();
		}
		this.method5469();
		this.e();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5365(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method5341();
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "()V")
	@Override
	public void method5341() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5446();
		this.method5426(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "()Z")
	@Override
	public boolean method5386() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "(I)V")
	private void method5467() {
		if (this.anInt6808 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6656 > 0 && this.anInt6646 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6656, (double) this.anInt6646, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6812 &= 0xFFFFFFE7;
		this.anInt6808 = 1;
	}

	@OriginalMember(owner = "client!ug", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6646 - local12 - arg1, arg2, 1, 32993, this.anInt6800, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0) {
		this.method5420();
	}

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "()Z")
	@Override
	public boolean method5390() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class95 method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class95_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IFF)V")
	public void method5468(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat96 = arg0;
		this.aFloat84 = arg1;
		if (!this.aBoolean462) {
			this.method5462();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIF)Lclient!ku;")
	@Override
	public Class4_Sub7 method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class4_Sub7_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "(B)V")
	public void method5469() {
		if (this.anInt6808 != 0) {
			this.anInt6808 = 0;
			this.anInt6812 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "(I)V")
	public void method5470() {
		if (this.anInt6812 == 8) {
			return;
		}
		this.method5410();
		this.method5480(true);
		this.method5447(true);
		this.method5473(true);
		this.method5426(1);
		this.method5441(0);
		this.anInt6812 = 8;
	}

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "(I)V")
	private void method5471() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6798; local7++) {
			@Pc(14) Class4_Sub7 local14 = this.aClass4_Sub7Array3[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static277.aFloatArray14[0] = local14.method4451();
			Static277.aFloatArray14[1] = local14.method4448();
			Static277.aFloatArray14[2] = local14.method4449();
			Static277.aFloatArray14[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static277.aFloatArray14, 0);
			@Pc(52) int local52 = local14.method4445();
			@Pc(58) float local58 = local14.method4454() / 255.0F;
			Static277.aFloatArray14[1] = (float) (local52 >> 8 & 0xFF) * local58;
			Static277.aFloatArray14[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static277.aFloatArray14[2] = (float) (local52 & 0xFF) * local58;
			OpenGL.glLightfv(local18, 4609, Static277.aFloatArray14, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method4446() * local14.method4446()));
			OpenGL.glEnable(local18);
		}
		while (this.anInt6787 > local7) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6787 = this.anInt6798;
	}

	@OriginalMember(owner = "client!ug", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5446();
		this.method5426(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "()V")
	@Override
	public void method5385() {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZBI)V")
	public void method5472(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt6822) {
			if (arg2 < 0) {
				this.method5438();
				this.method5458(null);
				this.method5441(0);
				if (!this.aBoolean462) {
					this.aClass222_1.method4613(arg0, 0, arg1);
				}
			} else {
				@Pc(21) Class65_Sub2 local21 = this.aClass265_1.method5928(arg2);
				@Pc(27) Class112 local27 = super.anInterface5_7.method4079(arg2);
				if (local27.aByte56 == 0 && local27.aByte54 == 0) {
					this.method5438();
				} else {
					@Pc(40) int local40 = local27.aBoolean188 ? 64 : 128;
					@Pc(44) int local44 = local40 * 50;
					this.method5427((float) (this.anInt6779 % local44 * local27.aByte56) / (float) local44, 0.0F, (float) (local27.aByte54 * (this.anInt6779 % local44)) / (float) local44);
				}
				if (this.aBoolean462) {
					this.aClass222_1.method4613(arg0, 3, arg1);
					this.method5458(local21);
					this.method5441(local27.anInt2731);
				} else {
					this.aClass222_1.method4613(arg0, local27.aByte57, arg1);
					this.aClass222_1.method4612(local27.aByte55, local27.anInt2729);
					if (!this.aClass222_1.method4610(local27.anInt2731, local21)) {
						this.method5458(local21);
						this.method5441(local27.anInt2731);
					}
				}
			}
			this.anInt6822 = arg2;
		}
		this.anInt6812 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(ZI)V")
	public void method5473(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean463 != arg0) {
			this.aBoolean463 = arg0;
			this.method5432();
			this.anInt6812 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZI)V")
	public void method5474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(Lclient!fc;I)V")
	public void method5475(@OriginalArg(0) Interface3 arg0) {
		if (this.anInt6781 < 0 || this.anInterface3Array3[this.anInt6781] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface3Array3[this.anInt6781--] = null;
		arg0.method3601();
		if (this.anInt6781 < 0) {
			this.anInterface3_1 = null;
		} else {
			this.anInterface3_1 = this.anInterface3Array3[this.anInt6781];
			this.anInterface3_1.method3603();
		}
	}

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "(B)V")
	private void method5476() {
		this.method5485(-2);
		for (@Pc(14) int local14 = this.anInt6801 - 1; local14 >= 0; local14--) {
			this.method5457(local14);
			this.method5458(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5407(8448, 8448);
		this.method5474(34168, 2, 770);
		this.method5438();
		this.anInt6820 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6818 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean483 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean472 = true;
		this.method5480(true);
		this.method5461(true);
		this.method5447(true);
		this.method5473(true);
		this.method5469();
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
		@Pc(127) float[] local127 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(129) int local129 = 0; local129 < 8; local129++) {
			@Pc(138) int local138 = local129 + 16384;
			OpenGL.glLightfv(local138, 4608, local127, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6816 = this.anInt6799 = -1;
		this.e();
	}

	@OriginalMember(owner = "client!ug", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6802;
		arg0[3] = this.anInt6804;
		arg0[0] = this.anInt6814;
		arg0[2] = this.anInt6788;
	}

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "()Z")
	@Override
	public boolean method5403() {
		if (this.aClass4_Sub40_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass4_Sub40_Sub1_1.method5197()) {
			if (!this.aClass237_1.method5088(this.aClass4_Sub40_Sub1_1)) {
				return false;
			}
			this.aClass265_1.method5927();
		}
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
	@Override
	public void method5371(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6777 = arg0;
		this.aClass265_1.method5927();
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "()Z")
	@Override
	public boolean method5355() {
		return this.aClass4_Sub40_Sub1_1 != null && this.aClass4_Sub40_Sub1_1.method5197();
	}

	@OriginalMember(owner = "client!ug", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6799 && this.anInt6807 == arg1 && arg2 == this.anInt6813) {
			return;
		}
		this.anInt6807 = arg1;
		this.anInt6813 = arg2;
		this.anInt6799 = arg0;
		if (!this.aBoolean462) {
			this.method5462();
			this.method5412();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IF)V")
	public void method5478(@OriginalArg(1) float arg0) {
		if (this.aFloat95 == arg0) {
			return;
		}
		this.aFloat95 = arg0;
		if (this.anInt6808 == 3) {
			this.method5453();
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (this.aFloat88 == arg0 && arg1 == this.aFloat85) {
			return;
		}
		this.aFloat85 = arg1;
		this.aFloat88 = arg0;
		this.method5415();
		if (this.anInt6808 == 3) {
			this.method5453();
			return;
		}
		if (this.anInt6808 != 2) {
			return;
		}
		this.method5463();
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "()Z")
	@Override
	public boolean method5346() {
		return this.aClass4_Sub40_Sub1_1 != null && (this.anInt6773 <= 1 || this.aBoolean482);
	}

	@OriginalMember(owner = "client!ug", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(49) float local49;
		@Pc(61) float local61;
		if (this.aClass65_Sub2_Sub1_5 == null || arg2 > this.aClass65_Sub2_Sub1_5.anInt4497 || this.aClass65_Sub2_Sub1_5.anInt4496 < arg3) {
			this.aClass65_Sub2_Sub1_5 = Static375.method4925(arg2, arg6, arg3, this);
			this.aClass65_Sub2_Sub1_5.method3589(false, false);
			local61 = this.aClass65_Sub2_Sub1_5.aFloat49;
			local49 = this.aClass65_Sub2_Sub1_5.aFloat50;
		} else {
			this.aClass65_Sub2_Sub1_5.method3586(arg3, arg6, arg2, 6406, false);
			local49 = (float) arg3 * this.aClass65_Sub2_Sub1_5.aFloat50 / (float) this.aClass65_Sub2_Sub1_5.anInt4496;
			local61 = this.aClass65_Sub2_Sub1_5.aFloat49 * (float) arg2 / (float) this.aClass65_Sub2_Sub1_5.anInt4497;
		}
		this.method5454();
		this.method5458(this.aClass65_Sub2_Sub1_5);
		this.method5426(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5435(arg5);
		this.method5407(34165, 34165);
		this.method5474(34166, 0, 768);
		this.method5474(5890, 2, 770);
		this.method5425(0, 34166);
		this.method5425(2, 5890);
		@Pc(151) float local151 = (float) arg0;
		@Pc(154) float local154 = (float) arg1;
		@Pc(159) float local159 = local151 + (float) arg2;
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
		this.method5474(5890, 0, 768);
		this.method5474(34166, 2, 770);
		this.method5425(0, 5890);
		this.method5425(2, 34166);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!it;III)V")
	public void method5479(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0.method3827();
		@Pc(19) int local19 = arg1 * this.method5482(local12);
		this.method5411(arg0);
		OpenGL.glDrawElements(4, arg2, local12, arg0.method3826() + (long) local19);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IZ)V")
	public void method5480(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean464) {
			this.aBoolean464 = arg0;
			this.method5412();
			this.anInt6812 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "(Z)I")
	private int method5481() {
		this.aString69 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString68 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString69.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString69.indexOf("brian paul") != -1 || this.aString69.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(47) String local47 = OpenGL.glGetString(7938);
		@Pc(55) String[] local55 = Static15.method181(local47.replace('.', ' '), ' ');
		if (local55.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(73) int local73 = Static113.method1676(local55[0]);
				@Pc(79) int local79 = Static113.method1676(local55[1]);
				this.anInt6821 = local73 * 10 + local79;
			} catch (@Pc(88) NumberFormatException local88) {
				local10 |= 0x4;
			}
		}
		if (this.anInt6821 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(124) int[] local124 = new int[1];
		OpenGL.glGetIntegerv(34018, local124, 0);
		this.anInt6801 = local124[0];
		OpenGL.glGetIntegerv(34929, local124, 0);
		this.anInt6790 = local124[0];
		OpenGL.glGetIntegerv(34930, local124, 0);
		this.anInt6797 = local124[0];
		if (this.anInt6801 < 2 || this.anInt6790 < 2 || this.anInt6797 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean474 = NativeStream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean461 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean471 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean477 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean480 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean459 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean470 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean479 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean478 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean460 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean473 = false;
		this.aBoolean458 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean465 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean467 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean482 = this.aBoolean465 & this.aBoolean467;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method5333(@OriginalArg(0) Class4_Sub39 arg0) {
		this.aNativeHeap2 = ((Class4_Sub39_Sub1) arg0).aNativeHeap1;
		if (this.anInterface9_6 != null) {
			return;
		}
		@Pc(16) Class4_Sub9_Sub1 local16 = new Class4_Sub9_Sub1(80);
		if (this.aBoolean474) {
			local16.method1085(-1.0F);
			local16.method1085(-1.0F);
			local16.method1085(0.0F);
			local16.method1085(0.0F);
			local16.method1085(1.0F);
			local16.method1085(1.0F);
			local16.method1085(-1.0F);
			local16.method1085(0.0F);
			local16.method1085(1.0F);
			local16.method1085(1.0F);
			local16.method1085(1.0F);
			local16.method1085(1.0F);
			local16.method1085(0.0F);
			local16.method1085(1.0F);
			local16.method1085(0.0F);
			local16.method1085(-1.0F);
			local16.method1085(1.0F);
			local16.method1085(0.0F);
			local16.method1085(0.0F);
			local16.method1085(0.0F);
		} else {
			local16.method1084(-1.0F);
			local16.method1084(-1.0F);
			local16.method1084(0.0F);
			local16.method1084(0.0F);
			local16.method1084(1.0F);
			local16.method1084(1.0F);
			local16.method1084(-1.0F);
			local16.method1084(0.0F);
			local16.method1084(1.0F);
			local16.method1084(1.0F);
			local16.method1084(1.0F);
			local16.method1084(1.0F);
			local16.method1084(0.0F);
			local16.method1084(1.0F);
			local16.method1084(0.0F);
			local16.method1084(-1.0F);
			local16.method1084(1.0F);
			local16.method1084(0.0F);
			local16.method1084(0.0F);
			local16.method1084(0.0F);
		}
		this.anInterface9_6 = this.method5405(false, local16.anInt6207, 20, local16.aByteArray81);
		this.aClass190_10 = new Class190(this.anInterface9_6, 5126, 3, 0);
		this.aClass190_11 = new Class190(this.anInterface9_6, 5126, 2, 12);
		this.aClass171_1.method3233(this);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		this.method5442();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!qv;Z)Lclient!l;")
	@Override
	public Class95 method5379(@OriginalArg(0) Class216 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt5508 * arg0.anInt5512];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray69 == null) {
			for (local21 = 0; local21 < arg0.anInt5512; local21++) {
				for (local25 = 0; local25 < arg0.anInt5508; local25++) {
					@Pc(38) int local38 = arg0.anIntArray441[arg0.aByteArray70[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt5512; local21++) {
				for (local25 = 0; local25 < arg0.anInt5508; local25++) {
					local12[local16++] = arg0.anIntArray441[arg0.aByteArray70[local14] & 0xFF] | arg0.aByteArray69[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(122) Class95 local122 = this.method5351(local12, arg0.anInt5508, arg0.anInt5508, arg0.anInt5512);
		local122.MA(arg0.anInt5510, arg0.anInt5511, arg0.anInt5507, arg0.anInt5509);
		return local122;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(IIIIII)Lclient!kc;")
	@Override
	public Class3 method5345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean478 ? new Class3_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "()V")
	@Override
	public void method5330() {
		this.aClass237_1.method5086();
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt6804 = this.anInt6646;
		this.anInt6802 = 0;
		this.anInt6788 = this.anInt6656;
		this.anInt6814 = 0;
		OpenGL.glDisable(3089);
		this.method5413();
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(BI)I")
	public int method5482(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(IZ)I")
	public int method5483(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	@Override
	public void method5373(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!lc;I)V")
	public void method5484(@OriginalArg(0) Interface9 arg0) {
		if (arg0 != this.anInterface9_5) {
			if (this.aBoolean461) {
				OpenGL.glBindBufferARB(34962, arg0.method2933());
			}
			this.anInterface9_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.method5426(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "()Z")
	@Override
	public boolean method5364() {
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!kc;)V")
	@Override
	public void method5347(@OriginalArg(0) Class3 arg0) {
		this.aClass3_Sub1_1 = (Class3_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ug", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6804 > arg3) {
			this.anInt6804 = arg3;
		}
		if (this.anInt6788 > arg2) {
			this.anInt6788 = arg2;
		}
		if (arg1 > this.anInt6802) {
			this.anInt6802 = arg1;
		}
		if (this.anInt6814 < arg0) {
			this.anInt6814 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method5413();
		this.method5445();
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "()V")
	@Override
	public void method5361() {
		if (!this.aBoolean476 || this.anInt6656 <= 0 || this.anInt6646 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt6814;
		@Pc(22) int local22 = this.anInt6788;
		@Pc(25) int local25 = this.anInt6802;
		@Pc(28) int local28 = this.anInt6804;
		this.e();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5469();
		this.method5480(false);
		this.method5461(false);
		this.method5447(false);
		this.method5473(false);
		this.method5458(null);
		this.method5485(-2);
		this.method5441(1);
		this.method5426(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6656, this.anInt6646, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.OA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(BI)V")
	public void method5485(@OriginalArg(1) int arg0) {
		this.method5443(true, arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZLclient!jaggl/memory/NativeBuffer;III)Lclient!lc;")
	public Interface9 method5486(@OriginalArg(1) NativeBuffer arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		return (Interface9) (this.aBoolean461 ? new Class98_Sub2(this, arg1, arg0, arg2, false) : new Class62_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		@Pc(27) float local27 = (float) arg3 + local13 - 1.0F;
		this.method5446();
		this.method5426(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean471) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean471) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
	@Override
	public int method5356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method5370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class71 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class71_Sub1 local6 = (Class71_Sub1) arg5;
		@Pc(9) Class65_Sub2_Sub1 local9 = local6.aClass65_Sub2_Sub1_1;
		this.method5454();
		this.method5458(local6.aClass65_Sub2_Sub1_1);
		this.method5426(1);
		this.method5407(7681, 8448);
		this.method5474(34167, 0, 768);
		@Pc(39) float local39 = local9.aFloat49 / (float) local9.anInt4507;
		@Pc(46) float local46 = local9.aFloat50 / (float) local9.anInt4511;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method5474(5890, 0, 768);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!km;B)V")
	public void method5487(@OriginalArg(0) Class35_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2905(), 0);
	}
}
