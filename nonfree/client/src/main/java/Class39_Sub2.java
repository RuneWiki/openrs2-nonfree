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

@OriginalClass("client!kd")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!kd", name = "kc", descriptor = "I")
	private int anInt3681;

	@OriginalMember(owner = "client!kd", name = "mc", descriptor = "I")
	private int anInt3683;

	@OriginalMember(owner = "client!kd", name = "Ed", descriptor = "I")
	public int anInt3750;

	@OriginalMember(owner = "client!kd", name = "Zd", descriptor = "I")
	public int anInt3771;

	@OriginalMember(owner = "client!kd", name = "me", descriptor = "I")
	public int anInt3776;

	@OriginalMember(owner = "client!kd", name = "oe", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!kd", name = "ue", descriptor = "Lclient!sf;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!kd", name = "xe", descriptor = "Lclient!sf;")
	private Interface10 anInterface10_2;

	@OriginalMember(owner = "client!kd", name = "Ae", descriptor = "I")
	public int anInt3781;

	@OriginalMember(owner = "client!kd", name = "Be", descriptor = "I")
	public int anInt3782;

	@OriginalMember(owner = "client!kd", name = "Ce", descriptor = "I")
	private int anInt3783;

	@OriginalMember(owner = "client!kd", name = "Je", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_1;

	@OriginalMember(owner = "client!kd", name = "Le", descriptor = "F")
	public float aFloat35;

	@OriginalMember(owner = "client!kd", name = "Me", descriptor = "Z")
	private boolean aBoolean230;

	@OriginalMember(owner = "client!kd", name = "Ne", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_2;

	@OriginalMember(owner = "client!kd", name = "Pe", descriptor = "F")
	public float aFloat36;

	@OriginalMember(owner = "client!kd", name = "Qe", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!kd", name = "Te", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!kd", name = "Ue", descriptor = "Lclient!qg;")
	public Class33_Sub2 aClass33_Sub2_3;

	@OriginalMember(owner = "client!kd", name = "We", descriptor = "Lclient!qg;")
	public Class33_Sub2 aClass33_Sub2_4;

	@OriginalMember(owner = "client!kd", name = "Xe", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_3;

	@OriginalMember(owner = "client!kd", name = "Ze", descriptor = "I")
	private int anInt3786;

	@OriginalMember(owner = "client!kd", name = "af", descriptor = "I")
	private int anInt3787;

	@OriginalMember(owner = "client!kd", name = "bf", descriptor = "Lclient!fo;")
	public Class3_Sub2 bf;

	@OriginalMember(owner = "client!kd", name = "cf", descriptor = "Z")
	public boolean aBoolean233;

	@OriginalMember(owner = "client!kd", name = "ef", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_4;

	@OriginalMember(owner = "client!kd", name = "ff", descriptor = "I")
	private int anInt3788;

	@OriginalMember(owner = "client!kd", name = "hf", descriptor = "Z")
	public boolean aBoolean235;

	@OriginalMember(owner = "client!kd", name = "jf", descriptor = "Z")
	public boolean aBoolean236;

	@OriginalMember(owner = "client!kd", name = "kf", descriptor = "I")
	private int anInt3790;

	@OriginalMember(owner = "client!kd", name = "lf", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!kd", name = "nf", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_5;

	@OriginalMember(owner = "client!kd", name = "qf", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_6;

	@OriginalMember(owner = "client!kd", name = "rf", descriptor = "Lclient!gi;")
	public Class89 aClass89_1;

	@OriginalMember(owner = "client!kd", name = "zf", descriptor = "Z")
	private boolean aBoolean239;

	@OriginalMember(owner = "client!kd", name = "Af", descriptor = "Z")
	public boolean aBoolean240;

	@OriginalMember(owner = "client!kd", name = "Ef", descriptor = "Z")
	private boolean aBoolean242;

	@OriginalMember(owner = "client!kd", name = "Ff", descriptor = "I")
	public int anInt3799;

	@OriginalMember(owner = "client!kd", name = "Gf", descriptor = "I")
	public int anInt3800;

	@OriginalMember(owner = "client!kd", name = "If", descriptor = "Lclient!oi;")
	private Class3_Sub2_Sub1 aClass3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!kd", name = "Kf", descriptor = "F")
	private float aFloat41;

	@OriginalMember(owner = "client!kd", name = "Lf", descriptor = "I")
	private int anInt3802;

	@OriginalMember(owner = "client!kd", name = "Mf", descriptor = "F")
	private float aFloat42;

	@OriginalMember(owner = "client!kd", name = "Nf", descriptor = "F")
	public float aFloat43;

	@OriginalMember(owner = "client!kd", name = "Of", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!kd", name = "Qf", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!kd", name = "Sf", descriptor = "Lclient!tv;")
	public Class238 aClass238_3;

	@OriginalMember(owner = "client!kd", name = "Uf", descriptor = "Lclient!gi;")
	public Class89 aClass89_2;

	@OriginalMember(owner = "client!kd", name = "Vf", descriptor = "F")
	public float aFloat44;

	@OriginalMember(owner = "client!kd", name = "Xf", descriptor = "I")
	private int anInt3805;

	@OriginalMember(owner = "client!kd", name = "Zf", descriptor = "Lclient!pl;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!kd", name = "ag", descriptor = "Z")
	private boolean aBoolean246;

	@OriginalMember(owner = "client!kd", name = "bg", descriptor = "Z")
	public boolean aBoolean247;

	@OriginalMember(owner = "client!kd", name = "fg", descriptor = "I")
	public int anInt3808;

	@OriginalMember(owner = "client!kd", name = "hg", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_7;

	@OriginalMember(owner = "client!kd", name = "ig", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!kd", name = "ng", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_8;

	@OriginalMember(owner = "client!kd", name = "og", descriptor = "Lclient!wu;")
	private Interface12 anInterface12_2;

	@OriginalMember(owner = "client!kd", name = "pg", descriptor = "Z")
	public boolean aBoolean249;

	@OriginalMember(owner = "client!kd", name = "qg", descriptor = "F")
	public float aFloat49;

	@OriginalMember(owner = "client!kd", name = "rg", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_9;

	@OriginalMember(owner = "client!kd", name = "tg", descriptor = "Lclient!lu;")
	public Class105_Sub2 aClass105_Sub2_10;

	@OriginalMember(owner = "client!kd", name = "wg", descriptor = "F")
	public float aFloat51;

	@OriginalMember(owner = "client!kd", name = "xg", descriptor = "Z")
	public boolean aBoolean250;

	@OriginalMember(owner = "client!kd", name = "yg", descriptor = "J")
	private long aLong118;

	@OriginalMember(owner = "client!kd", name = "zg", descriptor = "[Lclient!av;")
	private Class3[] aClass3Array1;

	@OriginalMember(owner = "client!kd", name = "Ag", descriptor = "I")
	private int anInt3813;

	@OriginalMember(owner = "client!kd", name = "Fg", descriptor = "Z")
	private boolean aBoolean252;

	@OriginalMember(owner = "client!kd", name = "Hg", descriptor = "I")
	private int anInt3814;

	@OriginalMember(owner = "client!kd", name = "Jg", descriptor = "F")
	private float aFloat53;

	@OriginalMember(owner = "client!kd", name = "Kg", descriptor = "I")
	private int anInt3815;

	@OriginalMember(owner = "client!kd", name = "Mg", descriptor = "Lclient!f;")
	private Class16_Sub1 aClass16_Sub1_1;

	@OriginalMember(owner = "client!kd", name = "Pg", descriptor = "I")
	private int anInt3818;

	@OriginalMember(owner = "client!kd", name = "Qg", descriptor = "Z")
	private boolean aBoolean254;

	@OriginalMember(owner = "client!kd", name = "Rg", descriptor = "I")
	public int anInt3819;

	@OriginalMember(owner = "client!kd", name = "Sg", descriptor = "Ljava/lang/String;")
	private String aString28;

	@OriginalMember(owner = "client!kd", name = "Tg", descriptor = "I")
	private int anInt3820;

	@OriginalMember(owner = "client!kd", name = "Ug", descriptor = "F")
	public float aFloat55;

	@OriginalMember(owner = "client!kd", name = "Wg", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!kd", name = "Xg", descriptor = "Lclient!wu;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!kd", name = "bh", descriptor = "I")
	private int anInt3821;

	@OriginalMember(owner = "client!kd", name = "dh", descriptor = "I")
	private int anInt3822;

	@OriginalMember(owner = "client!kd", name = "Dc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable1 = new Hashtable();

	@OriginalMember(owner = "client!kd", name = "be", descriptor = "I")
	public int anInt3773 = 128;

	@OriginalMember(owner = "client!kd", name = "he", descriptor = "Lclient!vq;")
	private final Class260 aClass260_1 = new Class260();

	@OriginalMember(owner = "client!kd", name = "ie", descriptor = "Lclient!qg;")
	private final Class33_Sub2 aClass33_Sub2_1 = new Class33_Sub2();

	@OriginalMember(owner = "client!kd", name = "je", descriptor = "Lclient!qg;")
	public final Class33_Sub2 aClass33_Sub2_2 = new Class33_Sub2();

	@OriginalMember(owner = "client!kd", name = "pe", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!kd", name = "ne", descriptor = "I")
	public int anInt3777 = 3;

	@OriginalMember(owner = "client!kd", name = "ke", descriptor = "I")
	public int anInt3775 = 8;

	@OriginalMember(owner = "client!kd", name = "qe", descriptor = "Lclient!oe;")
	private final Class181 aClass181_31 = new Class181();

	@OriginalMember(owner = "client!kd", name = "re", descriptor = "[Lclient!sf;")
	private final Interface10[] anInterface10Array1 = new Interface10[4];

	@OriginalMember(owner = "client!kd", name = "se", descriptor = "[Lclient!sf;")
	private final Interface10[] anInterface10Array2 = new Interface10[4];

	@OriginalMember(owner = "client!kd", name = "we", descriptor = "I")
	private int anInt3779 = -1;

	@OriginalMember(owner = "client!kd", name = "te", descriptor = "I")
	private int anInt3778 = -1;

	@OriginalMember(owner = "client!kd", name = "ye", descriptor = "I")
	private int anInt3780 = -1;

	@OriginalMember(owner = "client!kd", name = "ve", descriptor = "[Lclient!sf;")
	private final Interface10[] anInterface10Array3 = new Interface10[4];

	@OriginalMember(owner = "client!kd", name = "ze", descriptor = "Lclient!oe;")
	private final Class181 aClass181_32;

	@OriginalMember(owner = "client!kd", name = "De", descriptor = "Lclient!oe;")
	private final Class181 aClass181_33;

	@OriginalMember(owner = "client!kd", name = "Ee", descriptor = "Lclient!oe;")
	private final Class181 aClass181_34;

	@OriginalMember(owner = "client!kd", name = "Fe", descriptor = "Lclient!oe;")
	private final Class181 aClass181_35;

	@OriginalMember(owner = "client!kd", name = "Ge", descriptor = "Lclient!oe;")
	private final Class181 aClass181_36;

	@OriginalMember(owner = "client!kd", name = "He", descriptor = "Lclient!oe;")
	private final Class181 aClass181_37;

	@OriginalMember(owner = "client!kd", name = "Ie", descriptor = "Lclient!oe;")
	private final Class181 aClass181_38;

	@OriginalMember(owner = "client!kd", name = "Re", descriptor = "I")
	public int anInt3784;

	@OriginalMember(owner = "client!kd", name = "Ve", descriptor = "F")
	public float aFloat37;

	@OriginalMember(owner = "client!kd", name = "gf", descriptor = "I")
	public int anInt3789;

	@OriginalMember(owner = "client!kd", name = "pf", descriptor = "I")
	private int anInt3793;

	@OriginalMember(owner = "client!kd", name = "Yf", descriptor = "I")
	public int anInt3806;

	@OriginalMember(owner = "client!kd", name = "Se", descriptor = "I")
	public int anInt3785;

	@OriginalMember(owner = "client!kd", name = "sf", descriptor = "[F")
	private final float[] aFloatArray8;

	@OriginalMember(owner = "client!kd", name = "of", descriptor = "I")
	private int anInt3792;

	@OriginalMember(owner = "client!kd", name = "yf", descriptor = "F")
	public float aFloat40;

	@OriginalMember(owner = "client!kd", name = "Hf", descriptor = "I")
	public int anInt3801;

	@OriginalMember(owner = "client!kd", name = "wf", descriptor = "F")
	public float aFloat39;

	@OriginalMember(owner = "client!kd", name = "eg", descriptor = "I")
	private int anInt3807;

	@OriginalMember(owner = "client!kd", name = "Pf", descriptor = "I")
	private int anInt3803;

	@OriginalMember(owner = "client!kd", name = "uf", descriptor = "I")
	public int anInt3795;

	@OriginalMember(owner = "client!kd", name = "Df", descriptor = "I")
	public int anInt3798;

	@OriginalMember(owner = "client!kd", name = "Ye", descriptor = "F")
	public float aFloat38;

	@OriginalMember(owner = "client!kd", name = "dg", descriptor = "F")
	public float aFloat46;

	@OriginalMember(owner = "client!kd", name = "Rf", descriptor = "I")
	public int anInt3804;

	@OriginalMember(owner = "client!kd", name = "gg", descriptor = "F")
	private float aFloat47;

	@OriginalMember(owner = "client!kd", name = "kg", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!kd", name = "tf", descriptor = "I")
	private int anInt3794;

	@OriginalMember(owner = "client!kd", name = "vg", descriptor = "I")
	private int anInt3812;

	@OriginalMember(owner = "client!kd", name = "sg", descriptor = "F")
	public float aFloat50;

	@OriginalMember(owner = "client!kd", name = "jg", descriptor = "I")
	private int anInt3809;

	@OriginalMember(owner = "client!kd", name = "xf", descriptor = "I")
	public int anInt3796;

	@OriginalMember(owner = "client!kd", name = "Gg", descriptor = "F")
	private float aFloat52;

	@OriginalMember(owner = "client!kd", name = "Jf", descriptor = "[F")
	private final float[] aFloatArray9;

	@OriginalMember(owner = "client!kd", name = "Eg", descriptor = "[F")
	private final float[] aFloatArray12;

	@OriginalMember(owner = "client!kd", name = "cg", descriptor = "F")
	private float aFloat45;

	@OriginalMember(owner = "client!kd", name = "Dg", descriptor = "[F")
	public final float[] aFloatArray11;

	@OriginalMember(owner = "client!kd", name = "Ng", descriptor = "I")
	private int anInt3816;

	@OriginalMember(owner = "client!kd", name = "Lg", descriptor = "F")
	public float aFloat54;

	@OriginalMember(owner = "client!kd", name = "Cg", descriptor = "[Lclient!qp;")
	private final Class1_Sub31[] aClass1_Sub31Array2;

	@OriginalMember(owner = "client!kd", name = "Tf", descriptor = "[F")
	private final float[] aFloatArray10;

	@OriginalMember(owner = "client!kd", name = "mg", descriptor = "F")
	public float aFloat48;

	@OriginalMember(owner = "client!kd", name = "Og", descriptor = "I")
	private int anInt3817;

	@OriginalMember(owner = "client!kd", name = "lg", descriptor = "I")
	private int anInt3810;

	@OriginalMember(owner = "client!kd", name = "Cf", descriptor = "I")
	public int anInt3797;

	@OriginalMember(owner = "client!kd", name = "ug", descriptor = "I")
	public int anInt3811;

	@OriginalMember(owner = "client!kd", name = "Oe", descriptor = "Lclient!uc;")
	public Class1_Sub5_Sub2 aClass1_Sub5_Sub2_1;

	@OriginalMember(owner = "client!kd", name = "Yg", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!kd", name = "Zg", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!kd", name = "ch", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!kd", name = "ah", descriptor = "[B")
	public final byte[] aByteArray60;

	@OriginalMember(owner = "client!kd", name = "Bd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas6;

	@OriginalMember(owner = "client!kd", name = "Ad", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!kd", name = "ce", descriptor = "I")
	public final int anInt3774;

	@OriginalMember(owner = "client!kd", name = "ub", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "J")
	private final long aLong116;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!kd", name = "mf", descriptor = "I")
	public final int anInt3791;

	@OriginalMember(owner = "client!kd", name = "Ig", descriptor = "Z")
	public boolean aBoolean253;

	@OriginalMember(owner = "client!kd", name = "df", descriptor = "Z")
	private boolean aBoolean234;

	@OriginalMember(owner = "client!kd", name = "Vg", descriptor = "Z")
	public boolean aBoolean255;

	@OriginalMember(owner = "client!kd", name = "Ke", descriptor = "Z")
	public boolean aBoolean229;

	@OriginalMember(owner = "client!kd", name = "vf", descriptor = "Z")
	private boolean aBoolean238;

	@OriginalMember(owner = "client!kd", name = "Wf", descriptor = "Z")
	public boolean aBoolean245;

	@OriginalMember(owner = "client!kd", name = "Bg", descriptor = "Z")
	public boolean aBoolean251;

	@OriginalMember(owner = "client!kd", name = "Bf", descriptor = "Z")
	private final boolean aBoolean241;

	@OriginalMember(owner = "client!kd", name = "ge", descriptor = "Lclient!ml;")
	public final Class160 aClass160_1;

	@OriginalMember(owner = "client!kd", name = "le", descriptor = "Lclient!le;")
	public final Class147 aClass147_1;

	@OriginalMember(owner = "client!kd", name = "fe", descriptor = "Lclient!un;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!kd", name = "ee", descriptor = "Lclient!bm;")
	private Class1_Sub9_Sub1 aClass1_Sub9_Sub1_1;

	@OriginalMember(owner = "client!kd", name = "de", descriptor = "Lclient!vc;")
	private final Class257 aClass257_1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;ILclient!od;)V")
	public Class39_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class180 arg4) {
		super(arg0, arg2);
		new Class227();
		new Class96(16);
		this.aClass181_32 = new Class181();
		this.aClass181_33 = new Class181();
		this.aClass181_34 = new Class181();
		this.aClass181_35 = new Class181();
		this.aClass181_36 = new Class181();
		this.aClass181_37 = new Class181();
		this.aClass181_38 = new Class181();
		this.anInt3784 = 0;
		this.aFloat37 = -1.0F;
		this.anInt3789 = -1;
		this.anInt3793 = 0;
		this.anInt3806 = 0;
		this.anInt3785 = -1;
		this.aFloatArray8 = new float[4];
		this.anInt3792 = 8448;
		this.aFloat40 = 3584.0F;
		this.anInt3801 = 512;
		this.aFloat39 = 3000.0F;
		this.anInt3807 = 8448;
		this.anInt3803 = -1;
		this.anInt3795 = 50;
		this.anInt3798 = 0;
		this.aFloat38 = 3584.0F;
		this.aFloat46 = -1.0F;
		this.anInt3804 = 512;
		this.aFloat47 = 1.0F;
		this.aBoolean248 = true;
		this.anInt3794 = 0;
		this.anInt3812 = -1;
		this.aFloat50 = 1.0F;
		this.anInt3809 = 0;
		this.anInt3796 = 0;
		this.aFloat52 = 1.0F;
		this.aFloatArray9 = new float[4];
		this.aFloatArray12 = new float[4];
		this.aFloat45 = 0.0F;
		this.aFloatArray11 = new float[4];
		this.anInt3816 = 0;
		this.aFloat54 = 1.0F;
		this.aClass1_Sub31Array2 = new Class1_Sub31[Static437.anInt3907];
		this.aFloatArray10 = new float[16];
		this.aFloat48 = 1.0F;
		this.anInt3817 = 0;
		this.anInt3810 = 0;
		this.anInt3797 = -1;
		this.anInt3811 = 3584;
		this.aClass1_Sub5_Sub2_1 = new Class1_Sub5_Sub2(8192);
		this.anIntArray313 = new int[1];
		this.anIntArray314 = new int[1];
		this.anIntArray315 = new int[1];
		this.aByteArray60 = new byte[16384];
		this.aCanvas5 = this.aCanvas6 = arg1;
		this.anInt3774 = arg3;
		try {
			if (Static245.aBoolean306 == null || !Static245.aBoolean306) {
				if (arg4 == null) {
					System.loadLibrary("jawt");
					System.loadLibrary("jaggl");
					Static245.aBoolean306 = Boolean.TRUE;
				} else {
					@Pc(273) String local273 = System.getProperty("os.name").toLowerCase();
					if (!local273.startsWith("mac")) {
						System.loadLibrary("jawt");
					}
					if (local273.startsWith("linux") || local273.startsWith("sunos")) {
						System.load(arg4.method4085("libjaggl.so").toString());
					} else if (local273.startsWith("mac")) {
						System.load(arg4.method4085("libjaggl.jnilib").toString());
					} else if (local273.startsWith("win")) {
						System.load(arg4.method4085("jaggl.dll").toString());
					} else {
						throw new RuntimeException("");
					}
					Static245.aBoolean306 = Boolean.TRUE;
				}
			}
			if (Static245.aBoolean306 == null || !Static245.aBoolean306) {
				throw new RuntimeException("");
			}
			this.anOpenGL1 = new OpenGL();
			this.aLong115 = this.aLong116 = this.anOpenGL1.init(arg1, 8, 8, 8, 24, 0, this.anInt3774);
			if (this.aLong116 == 0L) {
				throw new RuntimeException("");
			}
			this.method3165();
			@Pc(370) int local370 = this.method3173();
			if (local370 != 0) {
				throw new RuntimeException("");
			}
			this.anInt3791 = this.aBoolean250 ? 33639 : 5121;
			@Pc(397) int local397;
			if (this.aString27.indexOf("radeon") != -1) {
				local397 = 0;
				@Pc(399) boolean local399 = false;
				@Pc(401) boolean local401 = false;
				@Pc(410) String[] local410 = Static402.method5419(' ', this.aString27.replace('/', ' '));
				for (@Pc(412) int local412 = 0; local412 < local410.length; local412++) {
					@Pc(417) String local417 = local410[local412];
					try {
						if (local417.length() > 0) {
							if (local417.charAt(0) == 'x' && local417.length() >= 3 && Static119.method749(local417.substring(1, 3))) {
								local401 = true;
								local417 = local417.substring(1);
							}
							if (local417.equals("hd")) {
								local399 = true;
							} else {
								if (local417.startsWith("hd")) {
									local417 = local417.substring(2);
									local399 = true;
								}
								if (local417.length() >= 4 && Static119.method749(local417.substring(0, 4))) {
									local397 = Static313.method4460(local417.substring(0, 4));
									break;
								}
							}
						}
					} catch (@Pc(483) Exception local483) {
					}
				}
				if (!local401 && !local399) {
					if (local397 >= 7000 && local397 <= 9250) {
						this.aBoolean253 = false;
					}
					if (local397 >= 7000 && local397 <= 7999) {
						this.aBoolean234 = false;
					}
				}
				if (!local399 || local397 < 4000) {
					this.aBoolean255 = false;
				}
				this.aBoolean229 &= this.anOpenGL1.isExtensionAvailable("GL_ARB_half_float_pixel");
				this.aBoolean238 = this.aBoolean234;
				this.aBoolean245 = true;
			}
			if (this.aString28.indexOf("intel") != -1) {
				this.aBoolean251 = false;
			}
			this.aBoolean241 = !this.aString28.equals("s3 graphics");
			if (this.aBoolean234) {
				try {
					@Pc(567) int[] local567 = new int[1];
					OpenGL.glGenBuffersARB(1, local567, 0);
				} catch (@Pc(573) Throwable local573) {
					throw new RuntimeException("");
				}
			}
			Static214.method4408(false, true);
			this.aBoolean228 = true;
			this.aClass160_1 = new Class160(this, super.anInterface4_12);
			this.method3193();
			this.aClass147_1 = new Class147(this);
			this.aClass248_1 = new Class248(this);
			if (this.aClass248_1.method5512()) {
				this.aClass1_Sub9_Sub1_1 = new Class1_Sub9_Sub1(this);
				if (!this.aClass1_Sub9_Sub1_1.method653()) {
					this.aClass1_Sub9_Sub1_1.method647();
					this.aClass1_Sub9_Sub1_1 = null;
				}
			}
			this.aClass257_1 = new Class257(this);
			this.method3163();
			this.method3200();
			OpenGL.glClear(16640);
			local397 = 0;
			while (true) {
				try {
					this.anOpenGL1.swapBuffers();
					break;
				} catch (@Pc(652) Exception local652) {
					if (local397++ > 5) {
						throw new RuntimeException("");
					}
					Static224.method3441(100L);
				}
			}
			OpenGL.glClear(16384);
		} catch (@Pc(669) Throwable local669) {
			local669.printStackTrace();
			this.method4553();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(6) int local6 = this.anInt3821;
		this.anInt3821 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kd", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class133_Sub2 local6 = (Class133_Sub2) arg1;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_3;
		this.method3228();
		this.method3203(local6.aClass3_Sub2_Sub1_3);
		this.method3205(1);
		this.method3156(8448, 7681);
		this.method3180(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat73 / (float) local9.anInt5014;
		@Pc(46) float local46 = local9.aFloat72 / (float) local9.anInt5012;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt3809 - arg2) * local39, (float) (this.anInt3810 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3809, this.anInt3810);
		OpenGL.glTexCoord2f((float) (this.anInt3809 - arg2) * local39, (float) (this.anInt3794 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3809, this.anInt3794);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3793 - arg2), local46 * (float) (this.anInt3794 - arg3));
		OpenGL.glVertex2i(this.anInt3793, this.anInt3794);
		OpenGL.glTexCoord2f((float) (this.anInt3793 - arg2) * local39, local46 * (float) (this.anInt3810 - arg3));
		OpenGL.glVertex2i(this.anInt3793, this.anInt3810);
		OpenGL.glEnd();
		this.method3180(768, 0, 5890);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(Z)V")
	private void method3155() {
		this.anOpenGL1.detach();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIF)Lclient!qp;")
	@Override
	public Class1_Sub31 method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub31_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "()Z")
	@Override
	public boolean method4551() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public void method3156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3815 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(14) boolean local14 = false;
		if (this.anInt3792 != arg1) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt3792 = arg1;
			local14 = true;
		}
		if (arg0 != this.anInt3807) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local14 = true;
			this.anInt3807 = arg0;
		}
		if (local14) {
			this.anInt3790 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.aBoolean240 = false;
		this.aClass257_1.method5616(false, false, 0);
		this.method3237();
		this.method3231();
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
	private void method3157() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray10, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)V")
	private void method3158() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass33_Sub2_4.method4621(), 0);
		if (this.aBoolean240) {
			this.aClass257_1.aClass17_Sub9_1.method5680();
		}
		this.method3219();
		this.method3215();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FB)V")
	public void method3159(@OriginalArg(0) float arg0) {
		if (arg0 == this.aFloat47) {
			return;
		}
		this.aFloat47 = arg0;
		if (this.anInt3802 == 3) {
			this.method3207();
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!pl;)V")
	public void method3160(@OriginalArg(1) Interface9 arg0) {
		if (arg0 != this.anInterface9_2) {
			if (this.aBoolean234) {
				OpenGL.glBindBufferARB(34963, arg0.method4693());
			}
			this.anInterface9_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)V")
	private void method3161() {
		@Pc(6) float[] local6 = this.aFloatArray10;
		@Pc(18) float local18 = (float) (-this.anInt3798 * this.anInt3795) / (float) this.anInt3804;
		@Pc(33) float local33 = (float) ((this.anInt3771 - this.anInt3798) * this.anInt3795) / (float) this.anInt3804;
		@Pc(48) float local48 = (float) (this.anInt3795 * this.anInt3796) / (float) this.anInt3801;
		@Pc(63) float local63 = (float) ((this.anInt3796 - this.anInt3750) * this.anInt3795) / (float) this.anInt3801;
		if (local18 == local33 || local48 == local63) {
			local6[11] = 0.0F;
			local6[0] = 1.0F;
			local6[6] = 0.0F;
			local6[9] = 0.0F;
			local6[1] = 0.0F;
			local6[12] = 0.0F;
			local6[10] = 1.0F;
			local6[3] = 0.0F;
			local6[7] = 0.0F;
			local6[2] = 0.0F;
			local6[8] = 0.0F;
			local6[14] = 0.0F;
			local6[5] = 1.0F;
			local6[15] = 1.0F;
			local6[4] = 0.0F;
			local6[13] = 0.0F;
		} else {
			@Pc(143) float local143 = (float) this.anInt3795 * 2.0F;
			local6[14] = this.aFloat41 = -((float) this.anInt3811 * local143) / (float) (this.anInt3811 - this.anInt3795);
			local6[5] = local143 / (local48 - local63);
			local6[6] = 0.0F;
			local6[12] = 0.0F;
			local6[3] = 0.0F;
			local6[7] = 0.0F;
			local6[13] = 0.0F;
			local6[8] = (local33 + local18) / (-local18 + local33);
			local6[0] = local143 / (local33 - local18);
			local6[9] = (local48 + local63) / (local48 - local63);
			local6[15] = 0.0F;
			local6[4] = 0.0F;
			local6[10] = this.aFloat53 = (float) -(this.anInt3795 + this.anInt3811) / (float) (this.anInt3811 - this.anInt3795);
			local6[1] = 0.0F;
			local6[2] = 0.0F;
			local6[11] = -1.0F;
		}
		this.method3214();
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "()Z")
	@Override
	public boolean method4515() {
		return this.aBoolean232 && (!this.method4547() || this.aBoolean252);
	}

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat39;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	@Override
	public void method4543(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3204();
		this.method3205(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZ)V")
	public void method3162(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method3156(7681, 7681);
		} else if (arg0 == 0) {
			this.method3156(8448, 8448);
		} else if (arg0 == 2) {
			this.method3156(7681, 34165);
		} else if (arg0 == 3) {
			this.method3156(8448, 260);
		} else if (arg0 == 4) {
			this.method3156(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	private void method3163() {
		this.method3218(-2);
		for (@Pc(12) int local12 = this.anInt3799 - 1; local12 >= 0; local12--) {
			this.method3221(local12);
			this.method3203(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3156(8448, 8448);
		this.method3180(770, 2, 34168);
		this.method3192();
		this.anInt3814 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3787 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean231 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean242 = true;
		this.method3217(true);
		this.method3186(true);
		this.method3213(true);
		this.method3208(true);
		this.method3201();
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
		@Pc(128) float[] local128 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(130) int local130 = 0; local130 < 8; local130++) {
			@Pc(135) int local135 = local130 + 16384;
			OpenGL.glLightfv(local135, 4608, local128, 0);
			OpenGL.glLightf(local135, 4615, 0.0F);
			OpenGL.glLightf(local135, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3803 = this.anInt3789 = -1;
		this.e();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	@Override
	public void method4510(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lclient!t;Lclient!kp;Lclient!c;[Lclient!ju;I)V")
	@Override
	public void method4502(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5[] arg3, @OriginalArg(4) int arg4) {
		this.method4497(arg0, arg2, arg3, arg4);
		this.method4566(arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class133 method4536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static364.method4978(arg1, arg3, arg0, this, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[Lclient!qp;)V")
	@Override
	public void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub31[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub31Array2[local7] = arg1[local7];
		}
		this.anInt3786 = arg0;
		if (this.anInt3802 != 1) {
			this.method3215();
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
	public synchronized void method3164(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub43 local8 = new Class1_Sub43(arg0);
		this.aClass181_35.method4102(local8);
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "()Z")
	@Override
	public boolean method4525() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt3803;
		if (local15 || this.aFloat46 != arg1 || arg2 != this.aFloat37) {
			this.aFloat37 = arg2;
			this.aFloat46 = arg1;
			this.anInt3803 = arg0;
			if (local15) {
				this.aFloat54 = (float) (this.anInt3803 & 0xFF) / 255.0F;
				this.aFloat48 = (float) (this.anInt3803 & 0xFF0000) / 1.671168E7F;
				this.aFloat50 = (float) (this.anInt3803 & 0xFF00) / 65280.0F;
				this.method3188();
			}
			this.method3170();
		}
		if (this.aFloatArray8[0] == arg3 && arg4 == this.aFloatArray8[1] && this.aFloatArray8[2] == arg5) {
			return;
		}
		this.aFloatArray8[2] = arg5;
		this.aFloatArray8[1] = arg4;
		this.aFloatArray8[0] = arg3;
		this.aFloatArray9[2] = -arg5;
		this.aFloatArray9[1] = -arg4;
		this.aFloatArray9[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray11[0] = local142 * arg3;
		this.aFloatArray11[1] = arg4 * local142;
		this.aFloatArray11[2] = arg5 * local142;
		this.aFloatArray12[0] = -this.aFloatArray11[0];
		this.aFloatArray12[1] = -this.aFloatArray11[1];
		this.aFloatArray12[2] = -this.aFloatArray11[2];
		this.method3219();
		this.anInt3819 = (int) (arg3 * 256.0F / arg4);
		this.anInt3808 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!kd", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt3811;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub41 method4544(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub41_Sub1 local8 = new Class1_Sub41_Sub1(arg0);
		this.aClass181_31.method4102(local8);
		return local8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!pc;Lclient!pc;FLclient!pc;)Lclient!pc;")
	@Override
	public Class16 method4545(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class16 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean233 && this.aBoolean251) {
			@Pc(15) Class16_Sub1_Sub2 local15 = null;
			@Pc(18) Class16_Sub1 local18 = (Class16_Sub1) arg0;
			@Pc(21) Class16_Sub1 local21 = (Class16_Sub1) arg1;
			@Pc(25) Class3_Sub3 local25 = local18.method5750();
			@Pc(29) Class3_Sub3 local29 = local21.method5750();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt2610 <= local29.anInt2610 ? local29.anInt2610 : local25.anInt2610;
				if (arg3 != arg0 && arg1 != arg3 && arg3 instanceof Class16_Sub1_Sub2) {
					@Pc(60) Class16_Sub1_Sub2 local60 = (Class16_Sub1_Sub2) arg3;
					if (local48 == local60.method5755()) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class16_Sub1_Sub2(this, local48);
				}
				if (local15.method5751(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(I)V")
	private void method3165() {
		@Pc(9) int local9 = 0;
		while (!this.anOpenGL1.attach()) {
			if (local9++ > 5) {
				throw new RuntimeException("");
			}
			Static224.method3441(1000L);
		}
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "()Z")
	@Override
	public boolean method4550() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!qg;Z)V")
	public void method3166(@OriginalArg(0) Class33_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method4621(), 0);
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "()Z")
	@Override
	public boolean method4552() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!kp;)V")
	@Override
	public void method4566(@OriginalArg(0) Class140 arg0) {
		this.aClass260_1.method5758(this, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean240) {
			throw new RuntimeException("");
		}
		this.anInt3812 = arg1;
		this.anInt3806 = arg3;
		this.anInt3785 = arg2;
		this.anInt3800 = arg0;
		this.aClass257_1.aClass17_Sub9_1.method5680();
		this.method3237();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V")
	public void method3167(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(I)V")
	private void method3168() {
		if (this.anInt3793 >= this.anInt3809 && this.anInt3794 >= this.anInt3810) {
			OpenGL.glScissor(this.anInt3817 + this.anInt3809, -this.anInt3794 + this.anInt3816 - -this.anInt3750, this.anInt3793 - this.anInt3809, -this.anInt3810 + this.anInt3794);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method3204();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method3205(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean232) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean232) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3750 - arg1 - local12, arg2, 1, 32993, this.anInt3791, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "()Z")
	@Override
	public boolean method4559() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()Z")
	@Override
	public boolean method4505() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt3794 = this.anInt3750;
		this.anInt3809 = 0;
		this.anInt3810 = 0;
		this.anInt3793 = this.anInt3771;
		OpenGL.glDisable(3089);
		this.method3224();
	}

	@OriginalMember(owner = "client!kd", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(6) int local6 = this.anInt3822;
		this.anInt3822 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass248_1.method5519(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3795 && this.anInt3811 == arg1) {
			return;
		}
		this.anInt3795 = arg0;
		this.anInt3811 = arg1;
		this.method3161();
		this.method3237();
		if (this.anInt3802 == 3) {
			this.method3207();
		} else if (this.anInt3802 == 2) {
			this.method3157();
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!wu;)V")
	public void method3169(@OriginalArg(1) Interface12 arg0) {
		if (this.anInterface12_3 != arg0) {
			if (this.aBoolean234) {
				OpenGL.glBindBufferARB(34962, arg0.method5067());
			}
			this.anInterface12_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	@Override
	public void method4511(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3773 = arg0;
		this.aClass160_1.method3741();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class149 method4561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class149_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	@Override
	public void method4531(@OriginalArg(0) int arg0) {
		this.method3165();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
	private void method3170() {
		Static161.aFloatArray7[0] = this.aFloat48 * this.aFloat46;
		Static161.aFloatArray7[1] = this.aFloat46 * this.aFloat50;
		Static161.aFloatArray7[2] = this.aFloat54 * this.aFloat46;
		Static161.aFloatArray7[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static161.aFloatArray7, 0);
		Static161.aFloatArray7[0] = this.aFloat48 * -this.aFloat37;
		Static161.aFloatArray7[1] = -this.aFloat37 * this.aFloat50;
		Static161.aFloatArray7[2] = this.aFloat54 * -this.aFloat37;
		Static161.aFloatArray7[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static161.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIZ)V")
	public void method3171(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 != this.anInt3788) {
			if (arg0 < 0) {
				this.method3192();
				this.method3203(null);
				this.method3162(0);
				if (!this.aBoolean240) {
					this.aClass257_1.method5616(arg2, arg1, 0);
				}
			} else {
				@Pc(46) Class3_Sub2 local46 = this.aClass160_1.method3742(arg0);
				@Pc(52) Class183 local52 = super.anInterface4_12.method2450(arg0);
				if (local52.aByte78 == 0 && local52.aByte81 == 0) {
					this.method3192();
				} else {
					@Pc(68) int local68 = local52.aBoolean331 ? 64 : 128;
					@Pc(72) int local72 = local68 * 50;
					this.method3189((float) (local52.aByte78 * (this.anInt3776 % local72)) / (float) local72, (float) (local52.aByte81 * (this.anInt3776 % local72)) / (float) local72, 0.0F);
				}
				if (this.aBoolean240) {
					this.aClass257_1.method5616(arg2, arg1, 3);
					this.method3203(local46);
					this.method3162(local52.anInt4981);
				} else {
					this.aClass257_1.method5616(arg2, arg1, local52.aByte76);
					this.aClass257_1.method5618(local52.anInt4980, local52.aByte75);
					if (!this.aClass257_1.method5614(local46, local52.anInt4981)) {
						this.method3203(local46);
						this.method3162(local52.anInt4981);
					}
				}
			}
			this.anInt3788 = arg0;
		}
		this.anInt3790 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "()V")
	@Override
	public void method4524() {
		this.method3208(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FFFBF)V")
	public void method3172(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static161.aFloatArray7[2] = arg3;
		Static161.aFloatArray7[3] = arg1;
		Static161.aFloatArray7[1] = arg2;
		Static161.aFloatArray7[0] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static161.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	@Override
	public void method4493(@OriginalArg(0) int arg0) {
		this.method3155();
	}

	@OriginalMember(owner = "client!kd", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return this.anInt3783 + this.anInt3781 + this.anInt3782;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4506() {
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "()V")
	@Override
	public void method4548() {
		this.aClass248_1.method5516();
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(I)I")
	private int method3173() {
		this.aString28 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString27 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString28.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString28.indexOf("brian paul") != -1 || this.aString28.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static402.method5419(' ', local44.replace('.', ' '));
		if (local52.length >= 2) {
			try {
				@Pc(62) int local62 = Static313.method4460(local52[0]);
				@Pc(68) int local68 = Static313.method4460(local52[1]);
				this.anInt3813 = local68 + local62 * 10;
			} catch (@Pc(77) NumberFormatException local77) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt3813 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(117) int[] local117 = new int[1];
		OpenGL.glGetIntegerv(34018, local117, 0);
		this.anInt3799 = local117[0];
		OpenGL.glGetIntegerv(34929, local117, 0);
		this.anInt3805 = local117[0];
		OpenGL.glGetIntegerv(34930, local117, 0);
		this.anInt3820 = local117[0];
		if (this.anInt3799 < 2 || this.anInt3805 < 2 || this.anInt3820 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean250 = NativeStream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean234 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		this.aBoolean232 = this.anOpenGL1.isExtensionAvailable("GL_ARB_multisample");
		this.aBoolean235 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_program");
		this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_program");
		this.aBoolean247 = this.anOpenGL1.isExtensionAvailable("GL_ARB_vertex_shader");
		this.aBoolean256 = this.anOpenGL1.isExtensionAvailable("GL_ARB_fragment_shader");
		this.aBoolean253 = this.anOpenGL1.isExtensionAvailable("GL_EXT_texture3D");
		this.aBoolean229 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_rectangle");
		this.aBoolean233 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_cube_map");
		this.aBoolean255 = this.anOpenGL1.isExtensionAvailable("GL_ARB_texture_float");
		this.aBoolean237 = false;
		this.aBoolean251 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_object");
		this.aBoolean249 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_blit");
		this.aBoolean236 = this.anOpenGL1.isExtensionAvailable("GL_EXT_framebuffer_multisample");
		this.aBoolean252 = this.aBoolean249 & this.aBoolean236;
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "()Z")
	@Override
	public boolean method4537() {
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public synchronized void method3174(@OriginalArg(0) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong222 = arg0;
		this.aClass181_37.method4102(local7);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4496(@OriginalArg(0) Canvas arg0) {
		this.aCanvas5 = null;
		this.aLong115 = 0L;
		if (arg0 == null || arg0 == this.aCanvas6) {
			this.aCanvas5 = this.aCanvas6;
			this.aLong115 = this.aLong116;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(35) Long local35 = (Long) this.aHashtable1.get(arg0);
			this.aLong115 = local35;
			this.aCanvas5 = arg0;
		}
		if (this.aCanvas5 == null || this.aLong115 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong115);
		this.method3200();
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(I)Lclient!gl;")
	public Class3_Sub3 method3175() {
		return this.aClass16_Sub1_1 == null ? null : this.aClass16_Sub1_1.method5750();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4503(@OriginalArg(0) Class1_Sub41 arg0) {
		this.aNativeHeap1 = ((Class1_Sub41_Sub1) arg0).aNativeHeap2;
		if (this.anInterface12_2 != null) {
			return;
		}
		@Pc(16) Class1_Sub5_Sub2 local16 = new Class1_Sub5_Sub2(80);
		if (this.aBoolean250) {
			local16.method5422(-1.0F);
			local16.method5422(-1.0F);
			local16.method5422(0.0F);
			local16.method5422(0.0F);
			local16.method5422(1.0F);
			local16.method5422(1.0F);
			local16.method5422(-1.0F);
			local16.method5422(0.0F);
			local16.method5422(1.0F);
			local16.method5422(1.0F);
			local16.method5422(1.0F);
			local16.method5422(1.0F);
			local16.method5422(0.0F);
			local16.method5422(1.0F);
			local16.method5422(0.0F);
			local16.method5422(-1.0F);
			local16.method5422(1.0F);
			local16.method5422(0.0F);
			local16.method5422(0.0F);
			local16.method5422(0.0F);
		} else {
			local16.method5420(-1.0F);
			local16.method5420(-1.0F);
			local16.method5420(0.0F);
			local16.method5420(0.0F);
			local16.method5420(1.0F);
			local16.method5420(1.0F);
			local16.method5420(-1.0F);
			local16.method5420(0.0F);
			local16.method5420(1.0F);
			local16.method5420(1.0F);
			local16.method5420(1.0F);
			local16.method5420(1.0F);
			local16.method5420(0.0F);
			local16.method5420(1.0F);
			local16.method5420(0.0F);
			local16.method5420(-1.0F);
			local16.method5420(1.0F);
			local16.method5420(0.0F);
			local16.method5420(0.0F);
			local16.method5420(0.0F);
		}
		this.anInterface12_2 = this.method3234(20, false, local16.aByteArray89, local16.anInt6475);
		this.aClass89_1 = new Class89(this.anInterface12_2, 5126, 3, 0);
		this.aClass89_2 = new Class89(this.anInterface12_2, 5126, 2, 12);
		this.aClass260_1.method5763(this);
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "()Z")
	@Override
	public boolean method4547() {
		return this.aClass1_Sub9_Sub1_1 != null && this.aClass1_Sub9_Sub1_1.method649();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
	public synchronized void method3176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub43 local8 = new Class1_Sub43(arg1);
		local8.aLong222 = arg0;
		this.aClass181_36.method4102(local8);
	}

	@OriginalMember(owner = "client!kd", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = (float) arg0 * this.aClass33_Sub2_4.aFloat84 + this.aClass33_Sub2_4.aFloat83 * (float) arg1 + this.aClass33_Sub2_4.aFloat77 * (float) arg2 + this.aClass33_Sub2_4.aFloat86;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass33_Sub2_4.aFloat86 + this.aClass33_Sub2_4.aFloat83 * (float) arg4 + (float) arg3 * this.aClass33_Sub2_4.aFloat84 + (float) arg5 * this.aClass33_Sub2_4.aFloat77;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt3795 && local59 < (float) this.anInt3795 || !(!((float) this.anInt3811 < local28) || !((float) this.anInt3811 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass33_Sub2_4.aFloat79 + this.aClass33_Sub2_4.aFloat78 * (float) arg2 + (float) arg0 * this.aClass33_Sub2_4.aFloat81 + (float) arg1 * this.aClass33_Sub2_4.aFloat82) * (float) this.anInt3804 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt3804 * ((float) arg4 * this.aClass33_Sub2_4.aFloat82 + (float) arg3 * this.aClass33_Sub2_4.aFloat81 + this.aClass33_Sub2_4.aFloat78 * (float) arg5 + this.aClass33_Sub2_4.aFloat79) / local59);
		if ((float) local123 < this.aFloat36 && (float) local155 < this.aFloat36 || (float) local123 > this.aFloat43 && (float) local155 > this.aFloat43) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt3801 * (this.aClass33_Sub2_4.aFloat88 * (float) arg2 + (float) arg1 * this.aClass33_Sub2_4.aFloat87 + (float) arg0 * this.aClass33_Sub2_4.aFloat80 + this.aClass33_Sub2_4.aFloat85) / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt3801 * ((float) arg5 * this.aClass33_Sub2_4.aFloat88 + this.aClass33_Sub2_4.aFloat87 * (float) arg4 + this.aClass33_Sub2_4.aFloat80 * (float) arg3 + this.aClass33_Sub2_4.aFloat85) / local59);
			return (!((float) local213 < this.aFloat44) || !((float) local245 < this.aFloat44)) && (!((float) local213 > this.aFloat35) || !((float) local245 > this.aFloat35));
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!sf;I)V")
	public void method3178(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt3780 < 0 || arg0 != this.anInterface10Array1[this.anInt3780]) {
			throw new RuntimeException();
		}
		this.anInterface10Array1[this.anInt3780--] = null;
		arg0.method5310();
		if (this.anInt3780 < 0) {
			this.anInterface10_1 = null;
		} else {
			this.anInterface10_1 = this.anInterface10Array1[this.anInt3780];
			this.anInterface10_1.method5311();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIIIII)Lclient!pc;")
	@Override
	public Class16 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean233 ? new Class16_Sub1_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "(I)V")
	private void method3179() {
		OpenGL.glDepthMask(this.aBoolean244 && this.aBoolean248);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IIII)V")
	public void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg1 + 34192, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4516() {
		return this.aClass33_Sub2_1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!gi;Lclient!gi;BLclient!gi;Lclient!gi;)V")
	public void method3181(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) Class89 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3169(arg2.anInterface12_1);
			OpenGL.glVertexPointer(arg2.aByte55, arg2.aShort47, this.anInterface12_3.method5065(), this.anInterface12_3.method5066() + (long) arg2.aByte54);
			OpenGL.glEnableClientState(32884);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3169(arg0.anInterface12_1);
			OpenGL.glNormalPointer(arg0.aShort47, this.anInterface12_3.method5065(), this.anInterface12_3.method5066() + (long) arg0.aByte54);
			OpenGL.glEnableClientState(32885);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3169(arg3.anInterface12_1);
			OpenGL.glColorPointer(arg3.aByte55, arg3.aShort47, this.anInterface12_3.method5065(), this.anInterface12_3.method5066() + (long) arg3.aByte54);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3169(arg1.anInterface12_1);
			OpenGL.glTexCoordPointer(arg1.aByte55, arg1.aShort47, this.anInterface12_3.method5065(), this.anInterface12_3.method5066() + (long) arg1.aByte54);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "()Z")
	@Override
	public boolean method4557() {
		return this.aClass1_Sub9_Sub1_1 != null && (this.anInt3774 <= 1 || this.aBoolean252);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
	public void method3182() {
		if (this.anInt3790 == 16) {
			return;
		}
		this.method3209();
		this.method3217(true);
		this.method3213(true);
		this.method3208(true);
		this.method3205(1);
		this.method3162(0);
		this.anInt3790 = 16;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4519(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas6) {
			throw new RuntimeException();
		} else if (!this.aHashtable1.containsKey(arg0)) {
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
			this.aHashtable1.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!sf;B)V")
	public void method3183(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt3779 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3779 >= 0) {
			this.anInterface10Array2[this.anInt3779].method5307();
		}
		this.anInterface10_2 = this.anInterface10Array2[++this.anInt3779] = arg0;
		this.anInterface10_2.method5312();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4514(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas6 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable1.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!pl;IIII)V")
	public void method3184(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0.method4694();
		@Pc(20) int local20 = arg2 * this.method3225(local7);
		this.method3160(arg0);
		OpenGL.glDrawElements(4, arg1, local7, (long) local20 + arg0.method4691());
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class143 method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class143_Sub2(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "(I)V")
	public void method3185() {
		if (this.anInt3790 == 8) {
			return;
		}
		this.method3199();
		this.method3217(true);
		this.method3213(true);
		this.method3208(true);
		this.method3205(1);
		this.method3162(0);
		this.anInt3790 = 8;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public void method3186(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean243) {
			this.aBoolean243 = arg0;
			this.method3223();
			this.anInt3790 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.method3205(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLclient!qg;)V")
	public void method3187(@OriginalArg(1) Class33_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method4621(), 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	@Override
	public void method4504(@OriginalArg(0) boolean arg0) {
		this.aBoolean248 = arg0;
		this.method3179();
	}

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass33_Sub2_4.aFloat86 + this.aClass33_Sub2_4.aFloat83 * (float) arg1 + this.aClass33_Sub2_4.aFloat84 * (float) arg0 + (float) arg2 * this.aClass33_Sub2_4.aFloat77;
		if ((float) this.anInt3795 > local28 || (float) this.anInt3811 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt3804 * ((float) arg2 * this.aClass33_Sub2_4.aFloat78 + this.aClass33_Sub2_4.aFloat81 * (float) arg0 + this.aClass33_Sub2_4.aFloat82 * (float) arg1 + this.aClass33_Sub2_4.aFloat79) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt3801 * (this.aClass33_Sub2_4.aFloat85 + (float) arg1 * this.aClass33_Sub2_4.aFloat87 + (float) arg0 * this.aClass33_Sub2_4.aFloat80 + (float) arg2 * this.aClass33_Sub2_4.aFloat88) / local28);
		if ((float) local85 >= this.aFloat36 && this.aFloat43 >= (float) local85 && this.aFloat44 <= (float) local117 && (float) local117 <= this.aFloat35) {
			arg3[0] = (int) ((float) local85 - this.aFloat36);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat44);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
	private void method3188() {
		Static161.aFloatArray7[3] = 1.0F;
		Static161.aFloatArray7[0] = this.aFloat49 * this.aFloat48;
		Static161.aFloatArray7[1] = this.aFloat50 * this.aFloat49;
		Static161.aFloatArray7[2] = this.aFloat49 * this.aFloat54;
		OpenGL.glLightModelfv(2899, Static161.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FBFF)V")
	private void method3189(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean239) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean239 = true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(JI)V")
	public synchronized void method3190(@OriginalArg(0) long arg0) {
		@Pc(13) Class1 local13 = new Class1();
		local13.aLong222 = arg0;
		this.aClass181_38.method4102(local13);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class143 method4554(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class143_Sub2(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3806 = arg3;
		this.aBoolean240 = true;
		this.anInt3785 = arg2;
		this.anInt3800 = arg0;
		this.anInt3812 = arg1;
		this.aClass257_1.method5616(false, false, 3);
		this.aClass257_1.aClass17_Sub9_1.method5680();
		this.method3237();
		this.method3231();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)I")
	public int method3191(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!kd", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt3793;
		arg0[0] = this.anInt3809;
		arg0[1] = this.anInt3810;
		arg0[3] = this.anInt3794;
	}

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "(I)V")
	private void method3192() {
		if (this.aBoolean239) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean239 = false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)V")
	private void method3193() {
		this.aClass33_Sub2_4 = new Class33_Sub2();
		this.aClass33_Sub2_3 = new Class33_Sub2();
		this.aClass3Array1 = new Class3[this.anInt3799];
		this.bf = new Class3_Sub2(this, 3553, 6408, 1, 1);
		new Class3_Sub2(this, 3553, 6408, 1, 1);
		new Class3_Sub2(this, 3553, 6408, 1, 1);
		this.aClass105_Sub2_9 = new Class105_Sub2(this);
		this.aClass105_Sub2_3 = new Class105_Sub2(this);
		this.aClass105_Sub2_4 = new Class105_Sub2(this);
		this.aClass105_Sub2_1 = new Class105_Sub2(this);
		this.aClass105_Sub2_8 = new Class105_Sub2(this);
		this.aClass105_Sub2_2 = new Class105_Sub2(this);
		this.aClass105_Sub2_10 = new Class105_Sub2(this);
		this.aClass105_Sub2_7 = new Class105_Sub2(this);
		this.aClass105_Sub2_5 = new Class105_Sub2(this);
		this.aClass105_Sub2_6 = new Class105_Sub2(this);
		if (this.aBoolean251) {
			this.aClass238_3 = new Class238(this);
			new Class238(this);
		}
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "()V")
	@Override
	public void method4533() {
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(III)V")
	public synchronized void method3194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub43 local14 = new Class1_Sub43(arg0);
		local14.aLong222 = arg1;
		this.aClass181_33.method4102(local14);
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "()Z")
	@Override
	public boolean method4538() {
		if (this.aClass1_Sub9_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub9_Sub1_1.method649()) {
			if (!this.aClass248_1.method5511(this.aClass1_Sub9_Sub1_1)) {
				return false;
			}
			this.aClass160_1.method3741();
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(III)V")
	public void method3195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3816 = arg0;
		this.anInt3817 = arg1;
		this.method3212();
		this.method3168();
	}

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "(I)V")
	public void method3196() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!kd", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat55;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4498(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas6) {
			local5 = this.aLong116;
		} else if (this.aHashtable1.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable1.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (this.aCanvas5 == arg0) {
			this.method3200();
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "()V")
	@Override
	public void method4517() {
		if (this.aClass1_Sub9_Sub1_1 != null && this.aClass1_Sub9_Sub1_1.method649()) {
			this.aClass248_1.method5518(this.aClass1_Sub9_Sub1_1);
			this.aClass160_1.method3741();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!sf;Z)V")
	public void method3197(@OriginalArg(0) Interface10 arg0) {
		if (this.aBoolean249) {
			this.method3232(arg0);
			this.method3178(arg0);
		} else if (this.anInt3778 >= 0 && arg0 == this.anInterface10Array3[this.anInt3778]) {
			this.anInterface10Array3[this.anInt3778--] = null;
			arg0.method5308();
			if (this.anInt3778 >= 0) {
				this.anInterface10_2 = this.anInterface10_1 = this.anInterface10Array3[this.anInt3778];
				this.anInterface10_2.method5309();
			} else {
				this.anInterface10_2 = this.anInterface10_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(Z)V")
	@Override
	public void method4539(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kd", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass3_Sub2_Sub1_2 == null || arg2 > this.aClass3_Sub2_Sub1_2.anInt5003 || arg3 > this.aClass3_Sub2_Sub1_2.anInt5007) {
			this.aClass3_Sub2_Sub1_2 = Static64.method1316(arg2, arg3, this, arg6);
			this.aClass3_Sub2_Sub1_2.method4163(false, false);
			local57 = this.aClass3_Sub2_Sub1_2.aFloat73;
			local45 = this.aClass3_Sub2_Sub1_2.aFloat72;
		} else {
			this.aClass3_Sub2_Sub1_2.method4158(arg6, false, arg2, 6406, arg3);
			local45 = this.aClass3_Sub2_Sub1_2.aFloat72 * (float) arg3 / (float) this.aClass3_Sub2_Sub1_2.anInt5007;
			local57 = (float) arg2 * this.aClass3_Sub2_Sub1_2.aFloat73 / (float) this.aClass3_Sub2_Sub1_2.anInt5003;
		}
		this.method3228();
		this.method3203(this.aClass3_Sub2_Sub1_2);
		this.method3205(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3206(arg5);
		this.method3156(34165, 34165);
		this.method3180(768, 0, 34166);
		this.method3180(770, 2, 5890);
		this.method3210(34166, 0);
		this.method3210(5890, 2);
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
		this.method3180(768, 0, 5890);
		this.method3180(770, 2, 34166);
		this.method3210(5890, 0);
		this.method3210(34166, 2);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!sf;)V")
	public void method3198(@OriginalArg(1) Interface10 arg0) {
		if (this.aBoolean249) {
			this.method3183(arg0);
			this.method3229(arg0);
		} else if (this.anInt3778 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt3778 >= 0) {
				this.anInterface10Array3[this.anInt3778].method5308();
			}
			this.anInterface10_2 = this.anInterface10_1 = this.anInterface10Array3[++this.anInt3778] = arg0;
			this.anInterface10_2.method5309();
		}
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)V")
	private void method3199() {
		if (this.anInt3802 != 2) {
			this.anInt3802 = 2;
			this.method3157();
			this.method3158();
			this.anInt3790 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kd", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3789 == arg0 && this.anInt3797 == arg1 && arg2 == this.anInt3784) {
			return;
		}
		this.anInt3784 = arg2;
		this.anInt3789 = arg0;
		this.anInt3797 = arg1;
		if (this.aBoolean240) {
			return;
		}
		this.method3237();
		this.method3231();
	}

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "(I)V")
	private void method3200() {
		if (this.aCanvas5 == null) {
			this.anInt3681 = this.anInt3683 = 0;
		} else {
			@Pc(16) Dimension local16 = this.aCanvas5.getSize();
			this.anInt3681 = local16.width;
			this.anInt3683 = local16.height;
		}
		if (this.anInterface10_1 == null) {
			this.anInt3750 = this.anInt3683;
			this.anInt3771 = this.anInt3681;
			this.method3212();
		}
		this.method3201();
		this.e();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!pc;)V")
	@Override
	public void method4567(@OriginalArg(0) Class16 arg0) {
		this.aClass16_Sub1_1 = (Class16_Sub1) arg0;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4521(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub43 local19;
		while (!this.aClass181_33.method4113()) {
			local19 = (Class1_Sub43) this.aClass181_33.method4109();
			Static95.anIntArray164[local11++] = (int) local19.aLong222;
			this.anInt3781 -= local19.anInt6933;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static95.anIntArray164, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static95.anIntArray164, 0);
			local11 = 0;
		}
		while (!this.aClass181_34.method4113()) {
			local19 = (Class1_Sub43) this.aClass181_34.method4109();
			Static95.anIntArray164[local11++] = (int) local19.aLong222;
			this.anInt3782 -= local19.anInt6933;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static95.anIntArray164, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static95.anIntArray164, 0);
			local11 = 0;
		}
		while (!this.aClass181_35.method4113()) {
			local19 = (Class1_Sub43) this.aClass181_35.method4109();
			Static95.anIntArray164[local11++] = local19.anInt6933;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static95.anIntArray164, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static95.anIntArray164, 0);
			local11 = 0;
		}
		while (!this.aClass181_36.method4113()) {
			local19 = (Class1_Sub43) this.aClass181_36.method4109();
			Static95.anIntArray164[local11++] = (int) local19.aLong222;
			this.anInt3783 -= local19.anInt6933;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static95.anIntArray164, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static95.anIntArray164, 0);
		}
		while (!this.aClass181_32.method4113()) {
			local19 = (Class1_Sub43) this.aClass181_32.method4109();
			OpenGL.glDeleteLists((int) local19.aLong222, local19.anInt6933);
		}
		@Pc(221) Class1 local221;
		while (!this.aClass181_37.method4113()) {
			local221 = this.aClass181_37.method4109();
			OpenGL.glDeleteProgramARB((int) local221.aLong222);
		}
		while (!this.aClass181_38.method4113()) {
			local221 = this.aClass181_38.method4109();
			OpenGL.glDeleteObjectARB(local221.aLong222);
		}
		while (!this.aClass181_32.method4113()) {
			local19 = (Class1_Sub43) this.aClass181_32.method4109();
			OpenGL.glDeleteLists((int) local19.aLong222, local19.anInt6933);
		}
		this.aClass160_1.method3745();
		if (this.IA() > 100663296 && this.aLong118 + 60000L < Static279.method4058()) {
			System.gc();
			this.aLong118 = Static279.method4058();
		}
		this.anInt3776 = local9;
	}

	@OriginalMember(owner = "client!kd", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		this.anInt3777 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt3777++;
		}
		this.anInt3775 = 0x1 << this.anInt3777;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4512() {
		return new Class33_Sub2();
	}

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "(I)V")
	public void method3201() {
		if (this.anInt3802 != 0) {
			this.anInt3802 = 0;
			this.anInt3790 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V")
	private void method3202() {
		if (this.anInt3802 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3771 > 0 && this.anInt3750 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3771, (double) this.anInt3750, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3802 = 1;
		this.anInt3790 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "()V")
	@Override
	public void method4558() {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!av;)V")
	public void method3203(@OriginalArg(1) Class3 arg0) {
		@Pc(13) Class3 local13 = this.aClass3Array1[this.anInt3815];
		if (arg0 != local13) {
			if (arg0 == null) {
				OpenGL.glDisable(local13.anInt4987);
			} else {
				if (local13 == null) {
					OpenGL.glEnable(arg0.anInt4987);
				} else if (arg0.anInt4987 != local13.anInt4987) {
					OpenGL.glDisable(local13.anInt4987);
					OpenGL.glEnable(arg0.anInt4987);
				}
				OpenGL.glBindTexture(arg0.anInt4987, arg0.method4150());
			}
			this.aClass3Array1[this.anInt3815] = arg0;
		}
		this.anInt3790 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(B)V")
	private void method3204() {
		if (this.anInt3790 == 1) {
			return;
		}
		this.method3202();
		this.method3217(false);
		this.method3186(false);
		this.method3213(false);
		this.method3208(false);
		this.method3203(null);
		this.method3218(-2);
		this.method3162(1);
		this.anInt3790 = 1;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IZ)V")
	public void method3205(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt3814) {
			return;
		}
		@Pc(22) boolean local22;
		@Pc(18) byte local18;
		if (arg0 == 1) {
			local18 = 1;
			local22 = true;
		} else if (arg0 == 2) {
			local18 = 2;
			local22 = false;
		} else if (arg0 == 128) {
			local18 = 3;
			local22 = true;
		} else {
			local22 = false;
			local18 = 0;
		}
		if (!this.aBoolean242) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean242 = true;
		}
		if (this.aBoolean231 != local22) {
			if (local22) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean231 = local22;
		}
		if (local18 != this.anInt3787) {
			if (local18 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local18 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local18 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt3787 = local18;
		}
		this.anInt3814 = arg0;
		this.anInt3790 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "()V")
	@Override
	protected void method4553() {
		for (@Pc(4) Class1 local4 = this.aClass181_31.method4112(); local4 != null; local4 = this.aClass181_31.method4104()) {
			((Class1_Sub41_Sub1) local4).method5941();
		}
		if (this.aClass248_1 != null) {
			this.aClass248_1.method5513();
		}
		if (this.anOpenGL1 != null) {
			this.method3155();
			@Pc(37) Enumeration local37 = this.aHashtable1.keys();
			while (local37.hasMoreElements()) {
				@Pc(42) Canvas local42 = (Canvas) local37.nextElement();
				@Pc(48) Long local48 = (Long) this.aHashtable1.get(local42);
				this.anOpenGL1.releaseSurface(local42, local48);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean228) {
			Static236.method3583(true, false);
			this.aBoolean228 = false;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IZ)V")
	public void method3206(@OriginalArg(0) int arg0) {
		Static161.aFloatArray7[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static161.aFloatArray7[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static161.aFloatArray7[3] = (float) (arg0 >>> 24) / 255.0F;
		Static161.aFloatArray7[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static161.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "()Z")
	@Override
	public boolean method4556() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)I")
	@Override
	public int method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3801 = arg3;
		this.anInt3796 = arg1;
		this.anInt3804 = arg2;
		this.anInt3798 = arg0;
		this.method3161();
		this.method3224();
		if (this.anInt3802 == 3) {
			this.method3207();
		} else if (this.anInt3802 == 2) {
			this.method3157();
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "(I)V")
	private void method3207() {
		@Pc(15) float local15 = (float) -this.anInt3798 * this.aFloat47 / (float) this.anInt3804;
		@Pc(27) float local27 = this.aFloat47 * (float) -this.anInt3796 / (float) this.anInt3801;
		@Pc(42) float local42 = this.aFloat47 * (float) (this.anInt3771 - this.anInt3798) / (float) this.anInt3804;
		@Pc(57) float local57 = this.aFloat47 * (float) (this.anInt3750 - this.anInt3796) / (float) this.anInt3801;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local42 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) ((float) this.anInt3795 - this.aFloat55), (double) ((float) this.anInt3811 - this.aFloat55));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat49) {
			this.aFloat49 = arg0;
			this.method3188();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V")
	public void method3208(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean244 != arg0) {
			this.aBoolean244 = arg0;
			this.method3179();
			this.anInt3790 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method3204();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method3205(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean232) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean232) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(B)V")
	private void method3209() {
		if (this.anInt3802 != 3) {
			this.anInt3802 = 3;
			this.method3207();
			this.method3158();
			this.anInt3790 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIB)V")
	public void method3210(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!kd", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3810 < arg1) {
			this.anInt3810 = arg1;
		}
		if (arg0 > this.anInt3809) {
			this.anInt3809 = arg0;
		}
		if (arg3 < this.anInt3794) {
			this.anInt3794 = arg3;
		}
		if (arg2 < this.anInt3793) {
			this.anInt3793 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method3224();
		this.method3168();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FBF)V")
	public void method3211(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat52 = arg1;
		this.aFloat45 = arg0;
		if (!this.aBoolean240) {
			this.method3237();
		}
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(B)V")
	private void method3212() {
		OpenGL.glViewport(this.anInt3817, this.anInt3816, this.anInt3771, this.anInt3750);
	}

	@OriginalMember(owner = "client!kd", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class33 arg0) {
		this.aClass33_Sub2_4 = (Class33_Sub2) arg0;
		this.aClass33_Sub2_3.method4622(this.aClass33_Sub2_4);
		if (this.anInt3802 != 1) {
			this.method3158();
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3204();
		this.method3205(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4492(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		this.method4558();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V")
	public void method3213(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean230 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean230 = arg0;
		this.anInt3790 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)I")
	@Override
	public int method4528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "(I)V")
	private void method3214() {
		if (this.aFloat55 == 0.0F) {
			this.aFloatArray10[14] = this.aFloat41;
			this.aFloatArray10[10] = this.aFloat53;
		} else {
			@Pc(13) float local13 = this.aFloat39 / (this.aFloat39 + this.aFloat55);
			@Pc(17) float local17 = local13 * local13;
			@Pc(34) float local34 = (1.0F - local13) * -this.aFloat41 * (1.0F - local13) / this.aFloat55;
			this.aFloatArray10[14] = this.aFloat41 * local17;
			this.aFloatArray10[10] = local34 + this.aFloat53;
		}
		this.aFloat40 = ((float) -this.anInt3811 + this.aFloatArray10[14]) / this.aFloatArray10[10];
		this.aFloat38 = (float) this.anInt3811 - this.aFloat55;
	}

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "(B)V")
	private void method3215() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3786; local7++) {
			@Pc(14) Class1_Sub31 local14 = this.aClass1_Sub31Array2[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static458.aFloatArray33[0] = local14.method5906();
			Static458.aFloatArray33[1] = local14.method5902();
			Static458.aFloatArray33[2] = local14.method5904();
			Static458.aFloatArray33[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static458.aFloatArray33, 0);
			@Pc(52) int local52 = local14.method5907();
			@Pc(58) float local58 = local14.method5905() / 255.0F;
			Static458.aFloatArray33[0] = local58 * (float) (local52 >> 16 & 0xFF);
			Static458.aFloatArray33[1] = (float) (local52 >> 8 & 0xFF) * local58;
			Static458.aFloatArray33[2] = (float) (local52 & 0xFF) * local58;
			OpenGL.glLightfv(local18, 4609, Static458.aFloatArray33, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method5910() * local14.method5910()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt3818) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt3818 = this.anInt3786;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZBILclient!jaggl/memory/NativeBuffer;I)Lclient!wu;")
	public Interface12 method3216(@OriginalArg(2) int arg0, @OriginalArg(3) NativeBuffer arg1, @OriginalArg(4) int arg2) {
		return (Interface12) (this.aBoolean234 ? new Class199_Sub2(this, arg0, arg1, arg2, false) : new Class76_Sub2(this, arg0, arg1));
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(ZI)V")
	public void method3217(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean254 != arg0) {
			this.aBoolean254 = arg0;
			this.method3231();
			this.anInt3790 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "()V")
	@Override
	public void method4565() {
		if (!this.aBoolean241 || this.anInt3771 <= 0 || this.anInt3750 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt3809;
		@Pc(22) int local22 = this.anInt3793;
		@Pc(25) int local25 = this.anInt3810;
		@Pc(28) int local28 = this.anInt3794;
		this.e();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3201();
		this.method3217(false);
		this.method3186(false);
		this.method3213(false);
		this.method3208(false);
		this.method3203(null);
		this.method3218(-2);
		this.method3162(1);
		this.method3205(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3771, this.anInt3750, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.OA(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)V")
	public void method3218(@OriginalArg(1) int arg0) {
		this.method3233(true, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "(I)V")
	public void method3219() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray11, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray12, 0);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(ZI)I")
	public int method3220(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4546(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static269.aFloat67 = arg2;
		Static206.aFloat58 = arg1;
		Static171.aFloat33 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method4555(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!di;Z)Lclient!l;")
	@Override
	public Class143 method4549(@OriginalArg(0) Class51 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt1635 * arg0.anInt1638];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray41 == null) {
			for (local21 = 0; local21 < arg0.anInt1638; local21++) {
				for (local25 = 0; local25 < arg0.anInt1635; local25++) {
					@Pc(38) int local38 = arg0.anIntArray123[arg0.aByteArray42[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt1638; local21++) {
				for (local25 = 0; local25 < arg0.anInt1635; local25++) {
					local12[local16++] = arg0.anIntArray123[arg0.aByteArray42[local14] & 0xFF] | arg0.aByteArray41[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(115) Class143 local115 = this.method4554(local12, arg0.anInt1635, arg0.anInt1635, arg0.anInt1638);
		local115.MA(arg0.anInt1636, arg0.anInt1639, arg0.anInt1637, arg0.anInt1640);
		return local115;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!lm;[Lclient!di;Z)Lclient!la;")
	@Override
	public Class71 method4564(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class51[] arg1) {
		return new Class71_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(IB)V")
	public void method3221(@OriginalArg(0) int arg0) {
		if (arg0 != this.anInt3815) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3815 = arg0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBI)V")
	public synchronized void method3222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub43 local14 = new Class1_Sub43(arg1);
		local14.aLong222 = arg0;
		this.aClass181_34.method4102(local14);
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "(B)V")
	private void method3223() {
		if (this.aBoolean243 && !this.aBoolean246) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "(I)V")
	private void method3224() {
		this.aFloat43 = this.anInt3793 - this.anInt3798;
		this.aFloat44 = this.anInt3810 - this.anInt3796;
		this.aFloat36 = this.anInt3809 - this.anInt3798;
		this.aFloat35 = this.anInt3794 - this.anInt3796;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "()I")
	@Override
	public int method4520() {
		return 4;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(IB)I")
	public int method3225(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!kd", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3204();
		this.method3205(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "(B)V")
	public void method3226() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(IZ)V")
	public void method3227(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean246 != arg0) {
			this.aBoolean246 = arg0;
			this.method3223();
		}
	}

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "(I)V")
	public void method3228() {
		if (this.anInt3790 == 2) {
			return;
		}
		this.method3202();
		this.method3217(false);
		this.method3186(false);
		this.method3213(false);
		this.method3208(false);
		this.method3218(-2);
		this.anInt3790 = 2;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILclient!sf;)V")
	public void method3229(@OriginalArg(1) Interface10 arg0) {
		if (this.anInt3780 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3780 >= 0) {
			this.anInterface10Array1[this.anInt3780].method5310();
		}
		this.anInterface10_1 = this.anInterface10Array1[++this.anInt3780] = arg0;
		this.anInterface10_1.method5311();
	}

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "()Z")
	@Override
	public boolean method4568() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat39 && arg1 == this.aFloat55) {
			return;
		}
		this.aFloat39 = arg0;
		this.aFloat55 = arg1;
		this.method3214();
		if (this.anInt3802 == 3) {
			this.method3207();
			return;
		}
		if (this.anInt3802 != 2) {
			return;
		}
		this.method3157();
	}

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "(I)V")
	private void method3231() {
		if (this.aBoolean254 && this.anInt3797 >= 0 | this.aBoolean240) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!tp;IIII)Lclient!t;")
	@Override
	public Class105 method4540(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class105_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		throw new IllegalStateException("Circle fill is not supported by the gl toolkit");
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!sf;I)V")
	public void method3232(@OriginalArg(0) Interface10 arg0) {
		if (this.anInt3779 < 0 || arg0 != this.anInterface10Array2[this.anInt3779]) {
			throw new RuntimeException();
		}
		this.anInterface10Array2[this.anInt3779--] = null;
		arg0.method5307();
		if (this.anInt3779 < 0) {
			this.anInterface10_2 = null;
		} else {
			this.anInterface10_2 = this.anInterface10Array2[this.anInt3779];
			this.anInterface10_2.method5312();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!t;Lclient!kp;Lclient!c;Lclient!ju;I)V")
	@Override
	public void method4526(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5 arg3) {
		arg0.method3534(arg2, arg3, 0);
		this.method4566(arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI)V")
	public void method3233(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method3171(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!kd", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt3750) {
			arg3 = this.anInt3750;
		}
		if (arg2 > this.anInt3771) {
			arg2 = this.anInt3771;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt3810 = arg1;
		this.anInt3794 = arg3;
		this.anInt3793 = arg2;
		this.anInt3809 = arg0;
		OpenGL.glEnable(3089);
		this.method3224();
		this.method3168();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZI[BI)Lclient!wu;")
	public Interface12 method3234(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface12) (this.aBoolean234 && (!arg1 || this.aBoolean238) ? new Class199_Sub2(this, arg0, arg2, arg3, arg1) : new Class76_Sub2(this, arg0, arg2, arg3));
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt3795;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[BZIZ)Lclient!pl;")
	public Interface9 method3235(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		return (Interface9) (this.aBoolean234 && (!arg1 || this.aBoolean238) ? new Class199_Sub1(this, 5123, arg0, arg2, arg1) : new Class76_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "(B)V")
	public void method3236() {
		if (this.anInt3790 == 4) {
			return;
		}
		this.method3202();
		this.method3217(false);
		this.method3186(false);
		this.method3213(false);
		this.method3208(false);
		this.method3218(-2);
		this.method3205(1);
		this.method3162(0);
		this.anInt3790 = 4;
	}

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "()Z")
	@Override
	public boolean method4535() {
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class133_Sub2 local6 = (Class133_Sub2) arg5;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_3;
		this.method3228();
		this.method3203(local6.aClass3_Sub2_Sub1_3);
		this.method3205(1);
		this.method3156(8448, 7681);
		this.method3180(768, 0, 34167);
		@Pc(39) float local39 = local9.aFloat73 / (float) local9.anInt5014;
		@Pc(46) float local46 = local9.aFloat72 / (float) local9.anInt5012;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, (float) (arg1 - arg7) * local46);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + 0.35F, (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method3180(768, 0, 5890);
	}

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "(I)V")
	private void method3237() {
		@Pc(57) int local57;
		if (this.aBoolean240) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local57 = this.anInt3812;
		} else {
			this.aFloat42 = (float) (this.anInt3811 - this.anInt3784) - this.aFloat45;
			this.aFloat51 = this.aFloat42 - (float) this.anInt3797 * this.aFloat52;
			if (this.aFloat51 < (float) this.anInt3795) {
				this.aFloat51 = this.anInt3795;
			}
			OpenGL.glFogf(2915, this.aFloat51);
			OpenGL.glFogf(2916, this.aFloat42);
			local57 = this.anInt3789;
		}
		Static161.aFloatArray7[0] = (float) (local57 & 0xFF0000) / 1.671168E7F;
		Static161.aFloatArray7[2] = (float) (local57 & 0xFF) / 255.0F;
		Static161.aFloatArray7[1] = (float) (local57 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static161.aFloatArray7, 0);
		if (this.aBoolean240) {
			this.aClass257_1.aClass17_Sub9_1.method5676();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ju;I)V")
	@Override
	public void method4497(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class4_Sub5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method3534(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "p", descriptor = "()Z")
	@Override
	public boolean method4542() {
		return this.aClass257_1.method5617();
	}
}
