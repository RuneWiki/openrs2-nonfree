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

@OriginalClass("client!us")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!us", name = "tc", descriptor = "I")
	private int anInt8641;

	@OriginalMember(owner = "client!us", name = "Tc", descriptor = "I")
	public int anInt8666;

	@OriginalMember(owner = "client!us", name = "Cd", descriptor = "I")
	private int anInt8700;

	@OriginalMember(owner = "client!us", name = "ye", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!us", name = "ze", descriptor = "I")
	public int anInt8735;

	@OriginalMember(owner = "client!us", name = "Ae", descriptor = "Lclient!paa;")
	private Interface19 anInterface19_1;

	@OriginalMember(owner = "client!us", name = "Ee", descriptor = "Lclient!oh;")
	private Class46_Sub3 aClass46_Sub3_1;

	@OriginalMember(owner = "client!us", name = "Fe", descriptor = "Lclient!paa;")
	private Interface19 anInterface19_2;

	@OriginalMember(owner = "client!us", name = "Ke", descriptor = "Lclient!rq;")
	private Class293 aClass293_6;

	@OriginalMember(owner = "client!us", name = "Me", descriptor = "I")
	public int anInt8739;

	@OriginalMember(owner = "client!us", name = "Oe", descriptor = "I")
	private int anInt8740;

	@OriginalMember(owner = "client!us", name = "Pe", descriptor = "I")
	private int anInt8741;

	@OriginalMember(owner = "client!us", name = "Qe", descriptor = "I")
	public int anInt8742;

	@OriginalMember(owner = "client!us", name = "Xe", descriptor = "Z")
	private boolean aBoolean663;

	@OriginalMember(owner = "client!us", name = "Ye", descriptor = "Z")
	private boolean aBoolean664;

	@OriginalMember(owner = "client!us", name = "Ze", descriptor = "J")
	private long aLong248;

	@OriginalMember(owner = "client!us", name = "af", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!us", name = "bf", descriptor = "Z")
	private boolean bf;

	@OriginalMember(owner = "client!us", name = "df", descriptor = "I")
	private int anInt8743;

	@OriginalMember(owner = "client!us", name = "ef", descriptor = "I")
	private int anInt8744;

	@OriginalMember(owner = "client!us", name = "ff", descriptor = "I")
	private int anInt8745;

	@OriginalMember(owner = "client!us", name = "jf", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!us", name = "lf", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!us", name = "mf", descriptor = "Lclient!rca;")
	public Class280 aClass280_15;

	@OriginalMember(owner = "client!us", name = "of", descriptor = "Lclient!db;")
	public Class34_Sub2 aClass34_Sub2_5;

	@OriginalMember(owner = "client!us", name = "qf", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!us", name = "tf", descriptor = "Z")
	private boolean aBoolean668;

	@OriginalMember(owner = "client!us", name = "vf", descriptor = "I")
	private int anInt8748;

	@OriginalMember(owner = "client!us", name = "wf", descriptor = "Z")
	public boolean aBoolean670;

	@OriginalMember(owner = "client!us", name = "xf", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_2;

	@OriginalMember(owner = "client!us", name = "yf", descriptor = "F")
	private float aFloat201;

	@OriginalMember(owner = "client!us", name = "Af", descriptor = "Z")
	public boolean aBoolean671;

	@OriginalMember(owner = "client!us", name = "Cf", descriptor = "Z")
	private boolean aBoolean672;

	@OriginalMember(owner = "client!us", name = "Df", descriptor = "Z")
	private boolean aBoolean673;

	@OriginalMember(owner = "client!us", name = "Gf", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!us", name = "Hf", descriptor = "Z")
	private boolean aBoolean674;

	@OriginalMember(owner = "client!us", name = "Mf", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_3;

	@OriginalMember(owner = "client!us", name = "Nf", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_4;

	@OriginalMember(owner = "client!us", name = "Of", descriptor = "Lclient!cv;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!us", name = "Pf", descriptor = "Z")
	private boolean aBoolean677;

	@OriginalMember(owner = "client!us", name = "Qf", descriptor = "Z")
	public boolean aBoolean678;

	@OriginalMember(owner = "client!us", name = "Rf", descriptor = "Ljava/lang/String;")
	private String aString117;

	@OriginalMember(owner = "client!us", name = "Tf", descriptor = "Lclient!rca;")
	public Class280 aClass280_16;

	@OriginalMember(owner = "client!us", name = "Wf", descriptor = "Z")
	public boolean aBoolean680;

	@OriginalMember(owner = "client!us", name = "ag", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_5;

	@OriginalMember(owner = "client!us", name = "cg", descriptor = "Z")
	private boolean aBoolean681;

	@OriginalMember(owner = "client!us", name = "dg", descriptor = "F")
	public float aFloat208;

	@OriginalMember(owner = "client!us", name = "fg", descriptor = "I")
	public int anInt8755;

	@OriginalMember(owner = "client!us", name = "jg", descriptor = "F")
	public float aFloat211;

	@OriginalMember(owner = "client!us", name = "kg", descriptor = "I")
	public int anInt8757;

	@OriginalMember(owner = "client!us", name = "ng", descriptor = "F")
	public float aFloat212;

	@OriginalMember(owner = "client!us", name = "og", descriptor = "Lclient!el;")
	private Interface7 anInterface7_6;

	@OriginalMember(owner = "client!us", name = "ug", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_6;

	@OriginalMember(owner = "client!us", name = "vg", descriptor = "F")
	private float aFloat215;

	@OriginalMember(owner = "client!us", name = "wg", descriptor = "Lclient!dea;")
	private Class34_Sub2_Sub1 aClass34_Sub2_Sub1_4;

	@OriginalMember(owner = "client!us", name = "yg", descriptor = "Ljava/lang/String;")
	private String aString118;

	@OriginalMember(owner = "client!us", name = "zg", descriptor = "I")
	private int anInt8762;

	@OriginalMember(owner = "client!us", name = "Dg", descriptor = "I")
	private int anInt8764;

	@OriginalMember(owner = "client!us", name = "Eg", descriptor = "I")
	private int anInt8765;

	@OriginalMember(owner = "client!us", name = "Jg", descriptor = "F")
	private float aFloat218;

	@OriginalMember(owner = "client!us", name = "Lg", descriptor = "I")
	public int anInt8771;

	@OriginalMember(owner = "client!us", name = "Mg", descriptor = "Lclient!gq;")
	private Class55_Sub2 aClass55_Sub2_1;

	@OriginalMember(owner = "client!us", name = "Pg", descriptor = "I")
	public int anInt8772;

	@OriginalMember(owner = "client!us", name = "Qg", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_7;

	@OriginalMember(owner = "client!us", name = "Rg", descriptor = "Z")
	private boolean aBoolean684;

	@OriginalMember(owner = "client!us", name = "Sg", descriptor = "Z")
	public boolean aBoolean685;

	@OriginalMember(owner = "client!us", name = "Vg", descriptor = "Lclient!rq;")
	public Class293 aClass293_7;

	@OriginalMember(owner = "client!us", name = "Wg", descriptor = "I")
	private int anInt8774;

	@OriginalMember(owner = "client!us", name = "ch", descriptor = "Lclient!el;")
	private Interface7 anInterface7_7;

	@OriginalMember(owner = "client!us", name = "dh", descriptor = "I")
	private int anInt8776;

	@OriginalMember(owner = "client!us", name = "eh", descriptor = "Z")
	public boolean aBoolean688;

	@OriginalMember(owner = "client!us", name = "fh", descriptor = "Z")
	public boolean aBoolean689;

	@OriginalMember(owner = "client!us", name = "gh", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_8;

	@OriginalMember(owner = "client!us", name = "hh", descriptor = "[Lclient!um;")
	private Class34[] aClass34Array1;

	@OriginalMember(owner = "client!us", name = "ih", descriptor = "I")
	private int anInt8777;

	@OriginalMember(owner = "client!us", name = "jh", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_9;

	@OriginalMember(owner = "client!us", name = "kh", descriptor = "Z")
	public boolean aBoolean690;

	@OriginalMember(owner = "client!us", name = "lh", descriptor = "Lclient!mb;")
	public Class57_Sub2 aClass57_Sub2_10;

	@OriginalMember(owner = "client!us", name = "nh", descriptor = "Z")
	public boolean aBoolean691;

	@OriginalMember(owner = "client!us", name = "oh", descriptor = "I")
	private int anInt8779;

	@OriginalMember(owner = "client!us", name = "qh", descriptor = "I")
	private int anInt8780;

	@OriginalMember(owner = "client!us", name = "sh", descriptor = "I")
	private int anInt8781;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!us", name = "ie", descriptor = "I")
	public int anInt8728 = 128;

	@OriginalMember(owner = "client!us", name = "je", descriptor = "Lclient!lv;")
	private final Class207 aClass207_1 = new Class207();

	@OriginalMember(owner = "client!us", name = "pe", descriptor = "Lclient!td;")
	private final Class109_Sub2 aClass109_Sub2_1 = new Class109_Sub2();

	@OriginalMember(owner = "client!us", name = "se", descriptor = "Lclient!td;")
	public final Class109_Sub2 aClass109_Sub2_2 = new Class109_Sub2();

	@OriginalMember(owner = "client!us", name = "ue", descriptor = "Z")
	private boolean aBoolean662 = false;

	@OriginalMember(owner = "client!us", name = "ve", descriptor = "I")
	public int anInt8733 = 8;

	@OriginalMember(owner = "client!us", name = "we", descriptor = "I")
	public int anInt8734 = 3;

	@OriginalMember(owner = "client!us", name = "te", descriptor = "Lclient!hga;")
	private final Class130 aClass130_55 = new Class130();

	@OriginalMember(owner = "client!us", name = "Be", descriptor = "[Lclient!paa;")
	private final Interface19[] anInterface19Array1 = new Interface19[4];

	@OriginalMember(owner = "client!us", name = "Ge", descriptor = "[Lclient!paa;")
	private final Interface19[] anInterface19Array2 = new Interface19[4];

	@OriginalMember(owner = "client!us", name = "He", descriptor = "I")
	private int anInt8737 = -1;

	@OriginalMember(owner = "client!us", name = "Je", descriptor = "[Lclient!paa;")
	private final Interface19[] anInterface19Array3 = new Interface19[4];

	@OriginalMember(owner = "client!us", name = "De", descriptor = "I")
	private int anInt8736 = -1;

	@OriginalMember(owner = "client!us", name = "Ie", descriptor = "I")
	private int anInt8738 = -1;

	@OriginalMember(owner = "client!us", name = "Ce", descriptor = "Lclient!cba;")
	private final Class38 aClass38_11 = new Class38();

	@OriginalMember(owner = "client!us", name = "Le", descriptor = "Lclient!sl;")
	private final Class310 aClass310_38 = new Class310(16);

	@OriginalMember(owner = "client!us", name = "Ne", descriptor = "Lclient!hga;")
	private final Class130 aClass130_56 = new Class130();

	@OriginalMember(owner = "client!us", name = "Re", descriptor = "Lclient!hga;")
	private final Class130 aClass130_57 = new Class130();

	@OriginalMember(owner = "client!us", name = "Se", descriptor = "Lclient!hga;")
	private final Class130 aClass130_58 = new Class130();

	@OriginalMember(owner = "client!us", name = "Te", descriptor = "Lclient!hga;")
	private final Class130 aClass130_59 = new Class130();

	@OriginalMember(owner = "client!us", name = "Ue", descriptor = "Lclient!hga;")
	private final Class130 aClass130_60 = new Class130();

	@OriginalMember(owner = "client!us", name = "Ve", descriptor = "Lclient!hga;")
	private final Class130 aClass130_61 = new Class130();

	@OriginalMember(owner = "client!us", name = "We", descriptor = "Lclient!hga;")
	private final Class130 aClass130_62 = new Class130();

	@OriginalMember(owner = "client!us", name = "cf", descriptor = "Lclient!td;")
	public final Class109_Sub2 aClass109_Sub2_3 = new Class109_Sub2();

	@OriginalMember(owner = "client!us", name = "gf", descriptor = "Lclient!td;")
	public final Class109_Sub2 aClass109_Sub2_4 = new Class109_Sub2();

	@OriginalMember(owner = "client!us", name = "hf", descriptor = "Lclient!td;")
	public final Class109_Sub2 aClass109_Sub2_5 = new Class109_Sub2();

	@OriginalMember(owner = "client!us", name = "Kf", descriptor = "Z")
	private boolean aBoolean675 = true;

	@OriginalMember(owner = "client!us", name = "Ef", descriptor = "F")
	private float aFloat202 = 0.0F;

	@OriginalMember(owner = "client!us", name = "Ff", descriptor = "F")
	public float aFloat203 = 3584.0F;

	@OriginalMember(owner = "client!us", name = "zf", descriptor = "I")
	public int anInt8749 = 0;

	@OriginalMember(owner = "client!us", name = "Yf", descriptor = "I")
	public int anInt8753 = 0;

	@OriginalMember(owner = "client!us", name = "pf", descriptor = "I")
	public int anInt8747 = -1;

	@OriginalMember(owner = "client!us", name = "gg", descriptor = "[F")
	private final float[] aFloatArray65 = new float[4];

	@OriginalMember(owner = "client!us", name = "rg", descriptor = "I")
	public int anInt8760 = 512;

	@OriginalMember(owner = "client!us", name = "rf", descriptor = "[F")
	private final float[] aFloatArray63 = new float[4];

	@OriginalMember(owner = "client!us", name = "Bf", descriptor = "[F")
	public final float[] aFloatArray64 = new float[4];

	@OriginalMember(owner = "client!us", name = "mg", descriptor = "Z")
	private boolean aBoolean682 = false;

	@OriginalMember(owner = "client!us", name = "bg", descriptor = "I")
	private int anInt8754 = -1;

	@OriginalMember(owner = "client!us", name = "Gg", descriptor = "I")
	public int anInt8767 = 0;

	@OriginalMember(owner = "client!us", name = "eg", descriptor = "F")
	private float aFloat209 = -1.0F;

	@OriginalMember(owner = "client!us", name = "Sf", descriptor = "I")
	public int anInt8751 = -1;

	@OriginalMember(owner = "client!us", name = "tg", descriptor = "F")
	private float aFloat214 = 1.0F;

	@OriginalMember(owner = "client!us", name = "Xf", descriptor = "F")
	public float aFloat206 = 1.0F;

	@OriginalMember(owner = "client!us", name = "Fg", descriptor = "I")
	public int anInt8766 = -1;

	@OriginalMember(owner = "client!us", name = "qg", descriptor = "I")
	private int anInt8759 = 0;

	@OriginalMember(owner = "client!us", name = "ig", descriptor = "I")
	private int anInt8756 = 0;

	@OriginalMember(owner = "client!us", name = "Zf", descriptor = "F")
	private float aFloat207 = 1.0F;

	@OriginalMember(owner = "client!us", name = "Ag", descriptor = "F")
	public float aFloat216 = 1.0F;

	@OriginalMember(owner = "client!us", name = "Cg", descriptor = "F")
	public float aFloat217 = 1.0F;

	@OriginalMember(owner = "client!us", name = "Vf", descriptor = "I")
	public int anInt8752 = 0;

	@OriginalMember(owner = "client!us", name = "Zg", descriptor = "[F")
	private final float[] aFloatArray67 = new float[4];

	@OriginalMember(owner = "client!us", name = "Tg", descriptor = "F")
	public float aFloat219 = -1.0F;

	@OriginalMember(owner = "client!us", name = "nf", descriptor = "I")
	public int anInt8746 = -1;

	@OriginalMember(owner = "client!us", name = "Ig", descriptor = "I")
	public int anInt8769 = 512;

	@OriginalMember(owner = "client!us", name = "xg", descriptor = "I")
	private int anInt8761 = 0;

	@OriginalMember(owner = "client!us", name = "Ug", descriptor = "I")
	private int anInt8773 = 8448;

	@OriginalMember(owner = "client!us", name = "Hg", descriptor = "I")
	private int anInt8768 = 0;

	@OriginalMember(owner = "client!us", name = "hg", descriptor = "F")
	public float aFloat210 = -1.0F;

	@OriginalMember(owner = "client!us", name = "Kg", descriptor = "I")
	private int anInt8770 = 0;

	@OriginalMember(owner = "client!us", name = "lg", descriptor = "I")
	public int anInt8758 = 50;

	@OriginalMember(owner = "client!us", name = "If", descriptor = "F")
	public float aFloat205 = 3584.0F;

	@OriginalMember(owner = "client!us", name = "Jf", descriptor = "I")
	private int anInt8750 = 8448;

	@OriginalMember(owner = "client!us", name = "pg", descriptor = "F")
	private float aFloat213 = -1.0F;

	@OriginalMember(owner = "client!us", name = "mh", descriptor = "I")
	private int anInt8778 = 0;

	@OriginalMember(owner = "client!us", name = "Yg", descriptor = "[F")
	private final float[] aFloatArray66 = new float[16];

	@OriginalMember(owner = "client!us", name = "bh", descriptor = "I")
	private int anInt8775 = 3584;

	@OriginalMember(owner = "client!us", name = "sg", descriptor = "[Lclient!ff;")
	private final Class3_Sub22[] aClass3_Sub22Array6 = new Class3_Sub22[Static552.anInt8883];

	@OriginalMember(owner = "client!us", name = "Og", descriptor = "Lclient!gt;")
	public Class3_Sub11_Sub2 aClass3_Sub11_Sub2_3 = new Class3_Sub11_Sub2(8192);

	@OriginalMember(owner = "client!us", name = "rh", descriptor = "[I")
	public int[] anIntArray642 = new int[1];

	@OriginalMember(owner = "client!us", name = "th", descriptor = "[I")
	public int[] anIntArray643 = new int[1];

	@OriginalMember(owner = "client!us", name = "ph", descriptor = "[B")
	public final byte[] aByteArray100 = new byte[16384];

	@OriginalMember(owner = "client!us", name = "uh", descriptor = "[I")
	public int[] anIntArray644 = new int[1];

	@OriginalMember(owner = "client!us", name = "ge", descriptor = "I")
	public final int anInt8727;

	@OriginalMember(owner = "client!us", name = "pd", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas13;

	@OriginalMember(owner = "client!us", name = "cc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!us", name = "Ld", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!us", name = "V", descriptor = "J")
	private final long aLong246;

	@OriginalMember(owner = "client!us", name = "Jc", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "client!us", name = "Bg", descriptor = "I")
	public final int anInt8763;

	@OriginalMember(owner = "client!us", name = "ah", descriptor = "Z")
	public boolean aBoolean687;

	@OriginalMember(owner = "client!us", name = "uf", descriptor = "Z")
	private boolean aBoolean669;

	@OriginalMember(owner = "client!us", name = "Uf", descriptor = "Z")
	public boolean aBoolean679;

	@OriginalMember(owner = "client!us", name = "sf", descriptor = "Z")
	public boolean aBoolean667;

	@OriginalMember(owner = "client!us", name = "kf", descriptor = "Z")
	private boolean aBoolean666;

	@OriginalMember(owner = "client!us", name = "Xg", descriptor = "Z")
	public boolean aBoolean686;

	@OriginalMember(owner = "client!us", name = "Lf", descriptor = "Z")
	public boolean aBoolean676;

	@OriginalMember(owner = "client!us", name = "Ng", descriptor = "Z")
	private final boolean aBoolean683;

	@OriginalMember(owner = "client!us", name = "he", descriptor = "Lclient!aca;")
	private final Class4 aClass4_1;

	@OriginalMember(owner = "client!us", name = "xe", descriptor = "Lclient!wu;")
	public final Class367 aClass367_1;

	@OriginalMember(owner = "client!us", name = "me", descriptor = "Lclient!ce;")
	private final Class41 aClass41_1;

	@OriginalMember(owner = "client!us", name = "ne", descriptor = "Lclient!ou;")
	private Class3_Sub18_Sub1 aClass3_Sub18_Sub1_1;

	@OriginalMember(owner = "client!us", name = "oe", descriptor = "Lclient!mw;")
	private final Class220 aClass220_1;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class43_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt8727 = arg2;
		this.aCanvas12 = this.aCanvas13 = arg0;
		if (!Static557.method7419("jaclib")) {
			throw new RuntimeException("");
		} else if (Static557.method7419("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong247 = this.aLong246 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8727);
				if (this.aLong246 == 0L) {
					throw new RuntimeException("");
				}
				this.method7273();
				@Pc(341) int local341 = this.method7275();
				if (local341 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8763 = this.aBoolean671 ? 33639 : 5121;
				if (this.aString117.indexOf("radeon") != -1) {
					@Pc(364) int local364 = 0;
					@Pc(366) boolean local366 = false;
					@Pc(368) boolean local368 = false;
					@Pc(377) String[] local377 = Static583.method7710(' ', this.aString117.replace('/', ' '));
					for (@Pc(379) int local379 = 0; local379 < local377.length; local379++) {
						@Pc(385) String local385 = local377[local379];
						try {
							if (local385.length() > 0) {
								if (local385.charAt(0) == 'x' && local385.length() >= 3 && Static463.method6417(local385.substring(1, 3))) {
									local368 = true;
									local385 = local385.substring(1);
								}
								if (local385.equals("hd")) {
									local366 = true;
								} else {
									if (local385.startsWith("hd")) {
										local385 = local385.substring(2);
										local366 = true;
									}
									if (local385.length() >= 4 && Static463.method6417(local385.substring(0, 4))) {
										local364 = Static118.method2472(local385.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(450) Exception local450) {
						}
					}
					if (!local368 && !local366) {
						if (local364 >= 7000 && local364 <= 9250) {
							this.aBoolean687 = false;
						}
						if (local364 >= 7000 && local364 <= 7999) {
							this.aBoolean669 = false;
						}
					}
					if (!local366 || local364 < 4000) {
						this.aBoolean679 = false;
					}
					this.aBoolean667 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean666 = this.aBoolean669;
					this.aBoolean686 = true;
				}
				if (this.aString118.indexOf("intel") != -1) {
					this.aBoolean676 = false;
				}
				this.aBoolean683 = !this.aString118.equals("s3 graphics");
				if (this.aBoolean669) {
					try {
						@Pc(537) int[] local537 = new int[1];
						OpenGL.glGenBuffersARB(1, local537, 0);
					} catch (@Pc(543) Throwable local543) {
						throw new RuntimeException("");
					}
				}
				Static497.method6706(false, true);
				this.aBoolean662 = true;
				this.aClass4_1 = new Class4(this, super.anInterface8_12);
				this.method7246();
				this.aClass367_1 = new Class367(this);
				this.aClass41_1 = new Class41(this);
				if (this.aClass41_1.method1147()) {
					this.aClass3_Sub18_Sub1_1 = new Class3_Sub18_Sub1(this);
					if (!this.aClass3_Sub18_Sub1_1.method5747()) {
						this.aClass3_Sub18_Sub1_1.method5743();
						this.aClass3_Sub18_Sub1_1 = null;
					}
				}
				this.aClass220_1 = new Class220(this);
				this.method7296();
				this.method7279();
				this.method7177();
			} catch (@Pc(617) Throwable local617) {
				local617.printStackTrace();
				this.method7165();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!paa;)V")
	public void method7218(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt8736 < 0 || arg0 != this.anInterface19Array2[this.anInt8736]) {
			throw new RuntimeException();
		}
		this.anInterface19Array2[this.anInt8736--] = null;
		arg0.method6407();
		if (this.anInt8736 >= 0) {
			this.anInterface19_1 = this.anInterface19Array2[this.anInt8736];
			this.anInterface19_1.method6409();
		} else {
			this.anInterface19_1 = null;
		}
	}

	@OriginalMember(owner = "client!us", name = "i", descriptor = "()V")
	@Override
	public void method7154() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(I)V")
	public void method7219() {
		if (this.anInt8744 == 16) {
			return;
		}
		this.method7252();
		this.method7248(true);
		this.method7245(true);
		this.method7239(true);
		this.method7222(1);
		this.anInt8744 = 16;
	}

	@OriginalMember(owner = "client!us", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = (float) arg3 + local13;
		this.method7236();
		this.method7222(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean677) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean677) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!um;)V")
	public void method7220(@OriginalArg(1) Class34 arg0) {
		@Pc(11) Class34 local11 = this.aClass34Array1[this.anInt8774];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt5770);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt5770);
				} else if (local11.anInt5770 != arg0.anInt5770) {
					OpenGL.glDisable(local11.anInt5770);
					OpenGL.glEnable(arg0.anInt5770);
				}
				OpenGL.glBindTexture(arg0.anInt5770, arg0.method4972());
			}
			this.aClass34Array1[this.anInt8774] = arg0;
		}
		this.anInt8744 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZIIZ)V")
	public void method7221(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		if (this.anInt8777 != arg1 || this.aBoolean682 != this.aBoolean688) {
			@Pc(26) Class34_Sub2 local26 = null;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39 = this.aBoolean688 ? 3 : 0;
			if (arg1 < 0) {
				this.method7244();
			} else {
				local26 = this.aClass4_1.method104(arg1);
				@Pc(53) Class224 local53 = super.anInterface8_12.method6560(arg1);
				if (local53.aByte75 == 0 && local53.aByte70 == 0) {
					this.method7244();
				} else {
					@Pc(74) int local74 = local53.aBoolean490 ? 64 : 128;
					@Pc(78) int local78 = local74 * 50;
					this.method7289((float) (this.anInt8735 % local78 * local53.aByte70) / (float) local78, 0.0F, (float) (local53.aByte75 * (this.anInt8735 % local78)) / (float) local78);
				}
				if (!this.aBoolean688) {
					local39 = local53.aByte69;
					local32 = local53.anInt6091;
					local30 = local53.aByte74;
				}
				local28 = local53.anInt6094;
			}
			this.aClass220_1.method5187(local30, local32, arg0, arg2, local39);
			if (!this.aClass220_1.method5186(local28, local26)) {
				this.method7220(local26);
				this.method7281(local28);
			}
			this.aBoolean682 = this.aBoolean688;
			this.anInt8777 = arg1;
		}
		this.anInt8744 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IB)V")
	public void method7222(@OriginalArg(0) int arg0) {
		if (this.anInt8745 == arg0) {
			return;
		}
		@Pc(34) boolean local34;
		@Pc(36) byte local36;
		if (arg0 == 1) {
			local36 = 1;
			local34 = true;
		} else if (arg0 == 2) {
			local34 = false;
			local36 = 2;
		} else if (arg0 == 128) {
			local34 = true;
			local36 = 3;
		} else {
			local36 = 0;
			local34 = false;
		}
		if (!this.aBoolean665) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean665 = true;
		}
		if (this.aBoolean663 != local34) {
			if (local34) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean663 = local34;
		}
		if (local36 != this.anInt8743) {
			if (local36 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local36 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local36 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8743 = local36;
		}
		this.anInt8745 = arg0;
		this.anInt8744 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V")
	public void method7223() {
		if (this.anInt8744 == 8) {
			return;
		}
		this.method7267();
		this.method7248(true);
		this.method7245(true);
		this.method7239(true);
		this.method7222(1);
		this.anInt8744 = 8;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!cv;IIBI)V")
	public void method7224(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method6872();
		@Pc(20) int local20 = arg1 * this.method7255(local7);
		this.method7250(arg0);
		OpenGL.glDrawElements(4, arg2, local7, arg0.method6871() + (long) local20);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IIII)V")
	public void method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!us", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8758 && this.anInt8775 == arg1) {
			return;
		}
		this.anInt8775 = arg1;
		this.anInt8758 = arg0;
		this.method7260();
		this.method7249();
		if (this.anInt8776 == 3) {
			this.method7229();
		} else if (this.anInt8776 == 2) {
			this.method7299();
		}
	}

	@OriginalMember(owner = "client!us", name = "q", descriptor = "()Z")
	@Override
	public boolean method7172() {
		return this.aBoolean677 && (!this.method7216() || this.aBoolean673);
	}

	@OriginalMember(owner = "client!us", name = "j", descriptor = "(I)V")
	private void method7226() {
		if (this.aBoolean681 && !this.aBoolean674) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IB)V")
	public synchronized void method7227(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		this.aClass130_59.method3548(local8);
	}

	@OriginalMember(owner = "client!us", name = "k", descriptor = "(I)V")
	public void method7228() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray64, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray65, 0);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
	private void method7229() {
		@Pc(19) float local19 = (float) -this.anInt8753 * this.aFloat214 / (float) this.anInt8760;
		@Pc(31) float local31 = (float) -this.anInt8752 * this.aFloat214 / (float) this.anInt8769;
		@Pc(46) float local46 = this.aFloat214 * (float) (this.anInt8666 - this.anInt8753) / (float) this.anInt8760;
		@Pc(61) float local61 = (float) (this.anInt8564 - this.anInt8752) * this.aFloat214 / (float) this.anInt8769;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local46 != local19 && local61 != local31) {
			OpenGL.glOrtho((double) local19, (double) local46, (double) -local61, (double) -local31, (double) this.anInt8758, (double) this.anInt8775);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!us", name = "o", descriptor = "()Z")
	@Override
	public boolean method7166() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "l", descriptor = "(I)V")
	private void method7230() {
		Static268.aFloatArray37[0] = this.aFloat208 * this.aFloat217;
		Static268.aFloatArray37[1] = this.aFloat208 * this.aFloat216;
		Static268.aFloatArray37[3] = 1.0F;
		Static268.aFloatArray37[2] = this.aFloat206 * this.aFloat208;
		OpenGL.glLightModelfv(2899, Static268.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!us", name = "u", descriptor = "()Lclient!mp;")
	@Override
	public Class216 method7186() {
		@Pc(7) int local7 = -1;
		if (this.aString118.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString118.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString118.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class216(local7, "OpenGL", this.anInt8765, this.aString117, 0L);
	}

	@OriginalMember(owner = "client!us", name = "m", descriptor = "(I)V")
	public void method7231() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)V")
	public void method7232(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method7221(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V")
	public void method7233(@OriginalArg(0) int arg0) {
		Static268.aFloatArray37[3] = (float) (arg0 >>> 24) / 255.0F;
		Static268.aFloatArray37[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static268.aFloatArray37[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static268.aFloatArray37[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static268.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7183(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas13 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class146_Sub3 local6 = (Class146_Sub3) arg5;
		@Pc(9) Class34_Sub2_Sub1 local9 = local6.aClass34_Sub2_Sub1_5;
		this.method7283();
		this.method7220(local6.aClass34_Sub2_Sub1_5);
		this.method7222(1);
		this.method7287(8448, 7681);
		this.method7225(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat36 / (float) local9.anInt2193;
		@Pc(46) float local46 = local9.aFloat35 / (float) local9.anInt2189;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local59 * local59 + local52 * local52)));
		@Pc(76) float local76 = local52 * local72;
		@Pc(80) float local80 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f(local76 + (float) arg2 + 0.35F, (float) arg3 + local80 + 0.35F);
		OpenGL.glEnd();
		this.method7225(0, 768, 5890);
	}

	@OriginalMember(owner = "client!us", name = "A", descriptor = "()Z")
	@Override
	public boolean method7211() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(III)V")
	public synchronized void method7234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub4 local13 = new Class3_Sub4(arg1);
		local13.aLong273 = arg0;
		this.aClass130_58.method3548(local13);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static532.aFloat184 = arg2;
		Static260.aFloat107 = arg0;
		Static360.aFloat129 = arg1;
	}

	@OriginalMember(owner = "client!us", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7239(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7207(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method7197();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!td;)V")
	public void method7235(@OriginalArg(1) Class109_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6777(), 0);
	}

	@OriginalMember(owner = "client!us", name = "C", descriptor = "()Z")
	@Override
	public boolean method7217() {
		return this.aClass220_1.method5188();
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub16 method7193(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub16_Sub1 local8 = new Class3_Sub16_Sub1(arg0);
		this.aClass130_55.method3548(local8);
		return local8;
	}

	@OriginalMember(owner = "client!us", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass109_Sub2_3.aFloat165 + this.aClass109_Sub2_3.aFloat164 * (float) arg2 + (float) arg0 * this.aClass109_Sub2_3.aFloat166 + (float) arg1 * this.aClass109_Sub2_3.aFloat168;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass109_Sub2_3.aFloat165 + (float) arg3 * this.aClass109_Sub2_3.aFloat166 + this.aClass109_Sub2_3.aFloat168 * (float) arg4 + this.aClass109_Sub2_3.aFloat164 * (float) arg5;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt8758 > local28 && (float) this.anInt8758 > local59 || !(!((float) this.anInt8775 < local28) || !(local59 > (float) this.anInt8775))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt8760 * (this.aClass109_Sub2_3.aFloat170 + (float) arg2 * this.aClass109_Sub2_3.aFloat171 + this.aClass109_Sub2_3.aFloat173 * (float) arg1 + this.aClass109_Sub2_3.aFloat172 * (float) arg0) / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt8760 * (this.aClass109_Sub2_3.aFloat170 + (float) arg5 * this.aClass109_Sub2_3.aFloat171 + (float) arg3 * this.aClass109_Sub2_3.aFloat172 + (float) arg4 * this.aClass109_Sub2_3.aFloat173) / local59);
		if (this.aFloat199 > (float) local123 && this.aFloat199 > (float) local155 || (float) local123 > this.aFloat212 && this.aFloat212 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) (((float) arg2 * this.aClass109_Sub2_3.aFloat169 + (float) arg0 * this.aClass109_Sub2_3.aFloat175 + this.aClass109_Sub2_3.aFloat167 * (float) arg1 + this.aClass109_Sub2_3.aFloat174) * (float) this.anInt8769 / local28);
			@Pc(245) int local245 = (int) ((float) this.anInt8769 * (this.aClass109_Sub2_3.aFloat174 + this.aClass109_Sub2_3.aFloat169 * (float) arg5 + this.aClass109_Sub2_3.aFloat175 * (float) arg3 + (float) arg4 * this.aClass109_Sub2_3.aFloat167) / local59);
			return (!((float) local213 < this.aFloat200) || !(this.aFloat200 > (float) local245)) && (!((float) local213 > this.aFloat204) || !(this.aFloat204 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(II)I")
	@Override
	public int method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)I")
	@Override
	public int method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(B)V")
	private void method7236() {
		if (this.anInt8744 == 1) {
			return;
		}
		this.method7297();
		this.method7248(false);
		this.method7298(false);
		this.method7245(false);
		this.method7239(false);
		this.method7220(null);
		this.method7294(-2);
		this.method7281(1);
		this.anInt8744 = 1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!nda;IIII)Lclient!da;")
	@Override
	public Class57 method7178(@OriginalArg(0) Class226 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IJ)V")
	public synchronized void method7237(@OriginalArg(1) long arg0) {
		@Pc(13) Class3 local13 = new Class3();
		local13.aLong273 = arg0;
		this.aClass130_62.method3548(local13);
	}

	@OriginalMember(owner = "client!us", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean688) {
			throw new RuntimeException("");
		}
		this.anInt8751 = arg2;
		this.anInt8747 = arg1;
		this.anInt8749 = arg3;
		this.anInt8755 = arg0;
		if (this.aBoolean682) {
			this.aClass220_1.aClass60_Sub4_1.method5321();
			this.aClass220_1.aClass60_Sub4_1.method5319();
		}
	}

	@OriginalMember(owner = "client!us", name = "n", descriptor = "()V")
	@Override
	protected void method7165() {
		for (@Pc(6) Class3 local6 = this.aClass130_55.method3543(); local6 != null; local6 = this.aClass130_55.method3551()) {
			((Class3_Sub16_Sub1) local6).method4727();
		}
		if (this.aClass41_1 != null) {
			this.aClass41_1.method1140();
		}
		if (this.anOpenGL2 != null) {
			this.method7280();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean662) {
			Static216.method3777(true, false);
			this.aBoolean662 = false;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7236();
		this.method7222(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local22 * local22)));
			local22 *= local47;
			local16 *= local47;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, local22 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!us", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method7222(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!el;I)V")
	public void method7238(@OriginalArg(0) Interface7 arg0) {
		if (this.anInterface7_7 != arg0) {
			if (this.aBoolean669) {
				OpenGL.glBindBufferARB(34962, arg0.method6581());
			}
			this.anInterface7_7 = arg0;
		}
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7209(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas13 == arg0) {
			local5 = this.aLong246;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas12) {
			this.method7279();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)V")
	public void method7239(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.bf) {
			this.bf = arg0;
			this.method7301();
			this.anInt8744 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7199(@OriginalArg(0) Canvas arg0) {
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

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZB)V")
	public void method7240(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean674) {
			this.aBoolean674 = arg0;
			this.method7226();
		}
	}

	@OriginalMember(owner = "client!us", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt8734 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8734++;
		}
		this.anInt8733 = 0x1 << this.anInt8734;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([BIIZI)Lclient!el;")
	public Interface7 method7241(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		return (Interface7) (this.aBoolean669 && (!arg3 || this.aBoolean666) ? new Class202_Sub1(this, arg1, arg0, arg2, arg3) : new Class28_Sub2(this, arg1, arg0, arg2));
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt8564 - arg1 - local12, arg2, 1, 32993, this.anInt8763, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(ILclient!td;)V")
	public void method7242(@OriginalArg(1) Class109_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6777(), 0);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7142() {
		return this.aClass109_Sub2_1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class46 method7198(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class46_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(B)V")
	private void method7243() {
		if (this.aBoolean668 && this.anInt8746 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!us", name = "n", descriptor = "(I)V")
	private void method7244() {
		if (this.aBoolean684) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean684 = false;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IZ)V")
	public void method7245(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean664) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean664 = arg0;
		this.anInt8744 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!us", name = "o", descriptor = "(I)V")
	private void method7246() {
		this.aClass34Array1 = new Class34[this.anInt8757];
		this.aClass34_Sub2_5 = new Class34_Sub2(this, 3553, 6408, 1, 1);
		new Class34_Sub2(this, 3553, 6408, 1, 1);
		new Class34_Sub2(this, 3553, 6408, 1, 1);
		this.aClass57_Sub2_4 = new Class57_Sub2(this);
		this.aClass57_Sub2_2 = new Class57_Sub2(this);
		this.aClass57_Sub2_7 = new Class57_Sub2(this);
		this.aClass57_Sub2_9 = new Class57_Sub2(this);
		this.aClass57_Sub2_1 = new Class57_Sub2(this);
		this.aClass57_Sub2_8 = new Class57_Sub2(this);
		this.aClass57_Sub2_5 = new Class57_Sub2(this);
		this.aClass57_Sub2_6 = new Class57_Sub2(this);
		this.aClass57_Sub2_3 = new Class57_Sub2(this);
		this.aClass57_Sub2_10 = new Class57_Sub2(this);
		if (this.aBoolean676) {
			this.aClass293_7 = new Class293(this);
			new Class293(this);
		}
	}

	@OriginalMember(owner = "client!us", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean688 = false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!paa;B)V")
	public void method7247(@OriginalArg(0) Interface19 arg0) {
		if (this.aBoolean678) {
			this.method7292(arg0);
			this.method7290(arg0);
		} else if (this.anInt8738 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8738 >= 0) {
				this.anInterface19Array3[this.anInt8738].method6405();
			}
			this.anInterface19_1 = this.anInterface19_2 = this.anInterface19Array3[++this.anInt8738] = arg0;
			this.anInterface19_1.method6410();
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(ZI)V")
	public void method7248(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean668) {
			this.aBoolean668 = arg0;
			this.method7243();
			this.anInt8744 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!us", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8752 = arg1;
		this.anInt8760 = arg2;
		this.anInt8769 = arg3;
		this.anInt8753 = arg0;
		this.method7260();
		this.method7271();
		if (this.anInt8776 == 3) {
			this.method7229();
		} else if (this.anInt8776 == 2) {
			this.method7299();
		}
	}

	@OriginalMember(owner = "client!us", name = "x", descriptor = "()V")
	@Override
	public void method7197() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(I)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0) {
		this.method7280();
	}

	@OriginalMember(owner = "client!us", name = "p", descriptor = "(I)V")
	private void method7249() {
		this.aFloat218 = (float) (this.anInt8775 - this.anInt8767) - this.aFloat202;
		this.aFloat211 = this.aFloat218 - (float) this.anInt8746 * this.aFloat207;
		if ((float) this.anInt8758 > this.aFloat211) {
			this.aFloat211 = this.anInt8758;
		}
		OpenGL.glFogf(2915, this.aFloat211);
		OpenGL.glFogf(2916, this.aFloat218);
		Static268.aFloatArray37[2] = (float) (this.anInt8766 & 0xFF) / 255.0F;
		Static268.aFloatArray37[1] = (float) (this.anInt8766 & 0xFF00) / 65280.0F;
		Static268.aFloatArray37[0] = (float) (this.anInt8766 & 0xFF0000) / 1.671168E7F;
		OpenGL.glFogfv(2918, Static268.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!us", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt8758;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!cv;Z)V")
	public void method7250(@OriginalArg(0) Interface5 arg0) {
		if (arg0 != this.anInterface5_4) {
			if (this.aBoolean669) {
				OpenGL.glBindBufferARB(34963, arg0.method6873());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(III)V")
	public synchronized void method7251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg1);
		local8.aLong273 = arg0;
		this.aClass130_57.method3548(local8);
	}

	@OriginalMember(owner = "client!us", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7236();
		this.method7222(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!us", name = "q", descriptor = "(I)V")
	private void method7252() {
		if (this.anInt8776 != 3) {
			this.anInt8776 = 3;
			this.method7229();
			this.method7259();
			this.anInt8744 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!fi;I)V")
	@Override
	public void method7176(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1) {
		this.aClass207_1.method4862(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!us", name = "w", descriptor = "()Z")
	@Override
	public boolean method7192() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I[Lclient!ff;)V")
	@Override
	public void method7149(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass3_Sub22Array6[local3] = arg1[local3];
		}
		this.anInt8779 = arg0;
		if (this.anInt8776 != 1) {
			this.method7257();
		}
	}

	@OriginalMember(owner = "client!us", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(45) float local45;
		if (this.aClass34_Sub2_Sub1_4 == null || this.aClass34_Sub2_Sub1_4.anInt2179 < arg2 || this.aClass34_Sub2_Sub1_4.anInt2188 < arg3) {
			this.aClass34_Sub2_Sub1_4 = Static57.method1110(arg2, arg3, this, arg6);
			this.aClass34_Sub2_Sub1_4.method1964(false, false);
			local41 = this.aClass34_Sub2_Sub1_4.aFloat35;
			local45 = this.aClass34_Sub2_Sub1_4.aFloat36;
		} else {
			this.aClass34_Sub2_Sub1_4.method1963(6406, arg3, arg2, false, arg6);
			local41 = this.aClass34_Sub2_Sub1_4.aFloat35 * (float) arg3 / (float) this.aClass34_Sub2_Sub1_4.anInt2188;
			local45 = this.aClass34_Sub2_Sub1_4.aFloat36 * (float) arg2 / (float) this.aClass34_Sub2_Sub1_4.anInt2179;
		}
		this.method7283();
		this.method7220(this.aClass34_Sub2_Sub1_4);
		this.method7222(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method7233(arg5);
		this.method7287(34165, 34165);
		this.method7225(0, 768, 34166);
		this.method7225(2, 770, 5890);
		this.method7282(34166, 0);
		this.method7282(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = (float) arg2 + local147;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = (float) arg3 + local150;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local41, local45);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method7225(0, 768, 5890);
		this.method7225(2, 770, 34166);
		this.method7282(5890, 0);
		this.method7282(34166, 2);
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(IZ)I")
	public int method7255(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IF)V")
	public void method7256(@OriginalArg(1) float arg0) {
		if (arg0 == this.aFloat214) {
			return;
		}
		this.aFloat214 = arg0;
		if (this.anInt8776 == 3) {
			this.method7229();
			return;
		}
	}

	@OriginalMember(owner = "client!us", name = "r", descriptor = "(I)V")
	private void method7257() {
		@Pc(11) int local11;
		for (local11 = 0; local11 < this.anInt8779; local11++) {
			@Pc(18) Class3_Sub22 local18 = this.aClass3_Sub22Array6[local11];
			Static291.aFloatArray40[0] = local18.method6731();
			@Pc(29) int local29 = local11 + 16386;
			Static291.aFloatArray40[1] = local18.method6728();
			Static291.aFloatArray40[2] = local18.method6725();
			Static291.aFloatArray40[3] = 1.0F;
			OpenGL.glLightfv(local29, 4611, Static291.aFloatArray40, 0);
			@Pc(56) int local56 = local18.method6724();
			@Pc(62) float local62 = local18.method6732() / 255.0F;
			Static291.aFloatArray40[0] = local62 * (float) (local56 >> 16 & 0xFF);
			Static291.aFloatArray40[2] = (float) (local56 & 0xFF) * local62;
			Static291.aFloatArray40[1] = local62 * (float) (local56 >> 8 & 0xFF);
			OpenGL.glLightfv(local29, 4609, Static291.aFloatArray40, 0);
			OpenGL.glLightf(local29, 4617, 1.0F / (float) (local18.method6729() * local18.method6729()));
			OpenGL.glEnable(local29);
		}
		while (this.anInt8762 > local11) {
			OpenGL.glDisable(local11 + 16386);
			local11++;
		}
		this.anInt8762 = this.anInt8779;
	}

	@OriginalMember(owner = "client!us", name = "s", descriptor = "(I)V")
	private void method7258() {
		if (this.anInt8770 >= this.anInt8778 && this.anInt8768 <= this.anInt8756) {
			OpenGL.glScissor(this.anInt8778 + this.anInt8759, this.anInt8761 + this.anInt8564 - this.anInt8756, this.anInt8770 - this.anInt8778, -this.anInt8768 + this.anInt8756);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!us", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean675 = arg0;
		this.method7301();
	}

	@OriginalMember(owner = "client!us", name = "t", descriptor = "(I)V")
	private void method7259() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass109_Sub2_4.method6777(), 0);
		if (this.aBoolean682) {
			this.aClass220_1.aClass60_Sub4_1.method5321();
		}
		this.method7228();
		this.method7257();
	}

	@OriginalMember(owner = "client!us", name = "u", descriptor = "(I)V")
	private void method7260() {
		@Pc(6) float[] local6 = this.aFloatArray66;
		@Pc(18) float local18 = (float) (this.anInt8758 * -this.anInt8753) / (float) this.anInt8760;
		@Pc(32) float local32 = (float) (this.anInt8758 * (this.anInt8666 - this.anInt8753)) / (float) this.anInt8760;
		@Pc(43) float local43 = (float) (this.anInt8758 * this.anInt8752) / (float) this.anInt8769;
		@Pc(58) float local58 = (float) ((this.anInt8752 - this.anInt8564) * this.anInt8758) / (float) this.anInt8769;
		if (local18 == local32 || local43 == local58) {
			local6[14] = 0.0F;
			local6[8] = 0.0F;
			local6[6] = 0.0F;
			local6[9] = 0.0F;
			local6[5] = 1.0F;
			local6[2] = 0.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[1] = 0.0F;
			local6[10] = 1.0F;
			local6[3] = 0.0F;
			local6[0] = 1.0F;
			local6[4] = 0.0F;
			local6[15] = 1.0F;
			local6[13] = 0.0F;
		} else {
			@Pc(72) float local72 = (float) this.anInt8758 * 2.0F;
			local6[0] = local72 / (local32 - local18);
			local6[11] = -1.0F;
			local6[4] = 0.0F;
			local6[12] = 0.0F;
			local6[15] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = local72 / (local43 - local58);
			local6[3] = 0.0F;
			local6[14] = this.aFloat215 = -((float) this.anInt8775 * local72) / (float) (this.anInt8775 - this.anInt8758);
			local6[8] = (local18 + local32) / (local32 - local18);
			local6[2] = 0.0F;
			local6[9] = (local43 + local58) / (local43 - local58);
			local6[1] = 0.0F;
			local6[10] = this.aFloat201 = (float) -(this.anInt8775 + this.anInt8758) / (float) (this.anInt8775 - this.anInt8758);
			local6[7] = 0.0F;
			local6[6] = 0.0F;
		}
		this.method7272();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7201(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aNativeHeap5 = ((Class3_Sub16_Sub1) arg0).aNativeHeap4;
		if (this.anInterface7_6 != null) {
			return;
		}
		@Pc(16) Class3_Sub11_Sub2 local16 = new Class3_Sub11_Sub2(80);
		if (this.aBoolean671) {
			local16.method3142(-1.0F);
			local16.method3142(-1.0F);
			local16.method3142(0.0F);
			local16.method3142(0.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(-1.0F);
			local16.method3142(0.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(1.0F);
			local16.method3142(0.0F);
			local16.method3142(1.0F);
			local16.method3142(0.0F);
			local16.method3142(-1.0F);
			local16.method3142(1.0F);
			local16.method3142(0.0F);
			local16.method3142(0.0F);
			local16.method3142(0.0F);
		} else {
			local16.method3143(-1.0F);
			local16.method3143(-1.0F);
			local16.method3143(0.0F);
			local16.method3143(0.0F);
			local16.method3143(1.0F);
			local16.method3143(1.0F);
			local16.method3143(-1.0F);
			local16.method3143(0.0F);
			local16.method3143(1.0F);
			local16.method3143(1.0F);
			local16.method3143(1.0F);
			local16.method3143(1.0F);
			local16.method3143(0.0F);
			local16.method3143(1.0F);
			local16.method3143(0.0F);
			local16.method3143(-1.0F);
			local16.method3143(1.0F);
			local16.method3143(0.0F);
			local16.method3143(0.0F);
			local16.method3143(0.0F);
		}
		this.anInterface7_6 = this.method7241(local16.aByteArray36, 20, local16.anInt3520, false);
		this.aClass280_16 = new Class280(this.anInterface7_6, 5126, 3, 0);
		this.aClass280_15 = new Class280(this.anInterface7_6, 5126, 2, 12);
		this.aClass207_1.method4858(this);
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt8778 > arg2 + arg0 || arg0 - arg2 > this.anInt8770 || arg2 + arg1 < this.anInt8768 || arg1 - arg2 > this.anInt8756) {
			return;
		}
		this.method7236();
		this.method7222(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(76) float local76 = (float) arg0 + 0.35F;
		@Pc(81) float local81 = (float) arg1 + 0.35F;
		@Pc(85) int local85 = arg2 << 1;
		if (this.aFloat209 > (float) local85) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local76 + 1.0F, local81 + 1.0F);
			OpenGL.glVertex2f(local76 + 1.0F, local81 - 1.0F);
			OpenGL.glVertex2f(local76 - 1.0F, -1.0F + local81);
			OpenGL.glVertex2f(local76 - 1.0F, local81 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local85 <= this.aFloat213) {
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
			local140 = Static247.method4032(local140);
			OpenGL.glVertex2f(local76 + (float) arg2, local81);
			for (@Pc(168) int local168 = 16384 - local140; local168 > 0; local168 -= local140) {
				OpenGL.glVertex2f(local76 + (float) arg2 * Class3_Sub3_Sub2_Sub2.aFloatArray50[local168], Class3_Sub3_Sub2_Sub2.aFloatArray51[local168] * (float) arg2 + local81);
			}
			OpenGL.glVertex2f(local76 + (float) arg2, local81);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!us", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt8775;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(Z)Lclient!mda;")
	public Class34_Sub4 method7261() {
		return this.aClass55_Sub2_1 == null ? null : this.aClass55_Sub2_1.method6930();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7194() {
		this.method7236();
		this.method7222(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!js;Lclient!js;FLclient!js;)Lclient!js;")
	@Override
	public Class55 method7167(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class55 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean685 && this.aBoolean676) {
			@Pc(15) Class55_Sub2_Sub1 local15 = null;
			@Pc(18) Class55_Sub2 local18 = (Class55_Sub2) arg0;
			@Pc(21) Class55_Sub2 local21 = (Class55_Sub2) arg1;
			@Pc(25) Class34_Sub4 local25 = local18.method6930();
			@Pc(29) Class34_Sub4 local29 = local21.method6930();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt5777 >= local25.anInt5777 ? local29.anInt5777 : local25.anInt5777;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class55_Sub2_Sub1) {
					@Pc(56) Class55_Sub2_Sub1 local56 = (Class55_Sub2_Sub1) arg3;
					if (local44 == local56.method2511()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class55_Sub2_Sub1(this, local44);
				}
				if (local15.method2506(arg2, local25, local29)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(B)V")
	private void method7262() {
		OpenGL.glViewport(this.anInt8759, this.anInt8761, this.anInt8666, this.anInt8564);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IBII)V")
	public void method7263(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7137(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!us", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass109_Sub2_3.aFloat165 + this.aClass109_Sub2_3.aFloat168 * (float) arg1 + (float) arg0 * this.aClass109_Sub2_3.aFloat166 + (float) arg2 * this.aClass109_Sub2_3.aFloat164;
		if (local28 < (float) this.anInt8758 || (float) this.anInt8775 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt8760 * (this.aClass109_Sub2_3.aFloat170 + this.aClass109_Sub2_3.aFloat171 * (float) arg2 + (float) arg1 * this.aClass109_Sub2_3.aFloat173 + this.aClass109_Sub2_3.aFloat172 * (float) arg0) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt8769 * (this.aClass109_Sub2_3.aFloat174 + (float) arg2 * this.aClass109_Sub2_3.aFloat169 + this.aClass109_Sub2_3.aFloat175 * (float) arg0 + this.aClass109_Sub2_3.aFloat167 * (float) arg1) / local28);
		if (this.aFloat199 <= (float) local85 && (float) local85 <= this.aFloat212 && (float) local117 >= this.aFloat200 && (float) local117 <= this.aFloat204) {
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat200);
			arg3[0] = (int) ((float) local85 - this.aFloat199);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!us", name = "p", descriptor = "()V")
	@Override
	public void method7171() {
		this.aClass41_1.method1142();
	}

	@OriginalMember(owner = "client!us", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = arg0 != this.anInt8754;
		if (local15 || this.aFloat210 != arg1 || this.aFloat219 != arg2) {
			this.aFloat219 = arg2;
			this.aFloat210 = arg1;
			this.anInt8754 = arg0;
			if (local15) {
				this.aFloat206 = (float) (this.anInt8754 & 0xFF) / 255.0F;
				this.aFloat216 = (float) (this.anInt8754 & 0xFF00) / 65280.0F;
				this.aFloat217 = (float) (this.anInt8754 & 0xFF0000) / 1.671168E7F;
				this.method7230();
			}
			this.method7269();
		}
		if (this.aFloatArray67[0] == arg3 && arg4 == this.aFloatArray67[1] && this.aFloatArray67[2] == arg5) {
			return;
		}
		this.aFloatArray67[2] = arg5;
		this.aFloatArray67[1] = arg4;
		this.aFloatArray67[0] = arg3;
		this.aFloatArray63[0] = -arg3;
		this.aFloatArray63[1] = -arg4;
		this.aFloatArray63[2] = -arg5;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray64[1] = local142 * arg4;
		this.aFloatArray64[0] = local142 * arg3;
		this.aFloatArray64[2] = arg5 * local142;
		this.aFloatArray65[2] = -this.aFloatArray64[2];
		this.aFloatArray65[1] = -this.aFloatArray64[1];
		this.aFloatArray65[0] = -this.aFloatArray64[0];
		this.method7228();
		this.anInt8772 = (int) (arg3 * 256.0F / arg4);
		this.anInt8771 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(IIIIII)Lclient!js;")
	@Override
	public Class55 method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean685 ? new Class55_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(IB)V")
	public synchronized void method7264(@OriginalArg(0) int arg0) {
		@Pc(16) Class3 local16 = new Class3();
		local16.aLong273 = arg0;
		this.aClass130_61.method3548(local16);
	}

	@OriginalMember(owner = "client!us", name = "l", descriptor = "()Z")
	@Override
	public boolean method7161() {
		return false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(FBF)V")
	public void method7266(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat202 = arg1;
		this.aFloat207 = arg0;
		this.method7249();
	}

	@OriginalMember(owner = "client!us", name = "v", descriptor = "(I)V")
	private void method7267() {
		if (this.anInt8776 != 2) {
			this.anInt8776 = 2;
			this.method7299();
			this.method7259();
			this.anInt8744 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!us", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt8781;
		this.anInt8781 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!us", name = "y", descriptor = "()V")
	@Override
	public void method7202() {
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(B)V")
	private void method7269() {
		Static268.aFloatArray37[1] = this.aFloat210 * this.aFloat216;
		Static268.aFloatArray37[3] = 1.0F;
		Static268.aFloatArray37[0] = this.aFloat217 * this.aFloat210;
		Static268.aFloatArray37[2] = this.aFloat206 * this.aFloat210;
		OpenGL.glLightfv(16384, 4609, Static268.aFloatArray37, 0);
		Static268.aFloatArray37[3] = 1.0F;
		Static268.aFloatArray37[0] = -this.aFloat219 * this.aFloat217;
		Static268.aFloatArray37[2] = this.aFloat206 * -this.aFloat219;
		Static268.aFloatArray37[1] = -this.aFloat219 * this.aFloat216;
		OpenGL.glLightfv(16385, 4609, Static268.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!us", name = "s", descriptor = "()V")
	@Override
	public void method7177() {
		if (!this.aBoolean683 || this.anInt8666 <= 0 || this.anInt8564 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt8778;
		@Pc(19) int local19 = this.anInt8770;
		@Pc(22) int local22 = this.anInt8768;
		@Pc(25) int local25 = this.anInt8756;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7278();
		this.method7248(false);
		this.method7298(false);
		this.method7245(false);
		this.method7239(false);
		this.method7220(null);
		this.method7294(-2);
		this.method7281(1);
		this.method7222(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8666, this.anInt8564, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!us", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt8770 = this.anInt8666;
		this.anInt8768 = 0;
		this.anInt8756 = this.anInt8564;
		this.anInt8778 = 0;
		OpenGL.glDisable(3089);
		this.method7271();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method7236();
		@Pc(30) float local30 = local13 + (float) arg3 - 1.0F;
		this.method7222(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean677) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean677) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!us", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt8753, this.anInt8752, this.anInt8760, this.anInt8769 };
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(IZ)I")
	public int method7270(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!us", name = "g", descriptor = "()V")
	@Override
	public void method7152() {
		if (this.aBoolean676) {
			if (this.anInterface19_2 != this.aClass293_6) {
				throw new RuntimeException();
			}
			this.aClass293_6.method6411(0);
			this.aClass293_6.method6411(8);
			this.method7286(this.aClass293_6);
		} else if (this.aBoolean672) {
			this.aClass46_Sub3_1.da(0, 0, this.anInt8666, this.anInt8564, 0, 0);
			this.anOpenGL2.setSurface(this.aLong247);
		} else {
			throw new RuntimeException("");
		}
		this.anInt8666 = this.anInt8641;
		this.aClass46_Sub3_1 = null;
		this.anInt8564 = this.anInt8700;
		this.method7278();
		this.method7262();
		this.JA();
	}

	@OriginalMember(owner = "client!us", name = "w", descriptor = "(I)V")
	private void method7271() {
		this.aFloat204 = this.anInt8756 - this.anInt8752;
		this.aFloat212 = this.anInt8770 - this.anInt8753;
		this.aFloat199 = this.anInt8778 - this.anInt8753;
		this.aFloat200 = this.anInt8768 - this.anInt8752;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class139 method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class139_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "()Z")
	@Override
	public boolean method7150() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(B)V")
	private void method7272() {
		this.aFloatArray66[14] = this.aFloat215;
		this.aFloatArray66[10] = this.aFloat201;
		this.aFloat203 = this.anInt8775;
		this.aFloat205 = ((float) -this.anInt8775 + this.aFloatArray66[14]) / this.aFloatArray66[10];
	}

	@OriginalMember(owner = "client!us", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt8780;
		this.anInt8780 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(B)V")
	private void method7273() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.a()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static374.method5521(1000L);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BII)V")
	public synchronized void method7274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub4 local14 = new Class3_Sub4(arg0);
		local14.aLong273 = arg1;
		this.aClass130_60.method3548(local14);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "([I)V")
	@Override
	public void method7158(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt8564;
		arg0[0] = this.anInt8666;
	}

	@OriginalMember(owner = "client!us", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class146_Sub3 local6 = (Class146_Sub3) arg1;
		@Pc(9) Class34_Sub2_Sub1 local9 = local6.aClass34_Sub2_Sub1_5;
		this.method7283();
		this.method7220(local6.aClass34_Sub2_Sub1_5);
		this.method7222(1);
		this.method7287(8448, 7681);
		this.method7225(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat36 / (float) local9.anInt2193;
		@Pc(46) float local46 = local9.aFloat35 / (float) local9.anInt2189;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt8778 - arg2) * local39, local46 * (float) (this.anInt8768 - arg3));
		OpenGL.glVertex2i(this.anInt8778, this.anInt8768);
		OpenGL.glTexCoord2f((float) (this.anInt8778 - arg2) * local39, local46 * (float) (this.anInt8756 - arg3));
		OpenGL.glVertex2i(this.anInt8778, this.anInt8756);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8770 - arg2), local46 * (float) (this.anInt8756 - arg3));
		OpenGL.glVertex2i(this.anInt8770, this.anInt8756);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8770 - arg2), (float) (this.anInt8768 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8770, this.anInt8768);
		OpenGL.glEnd();
		this.method7225(0, 768, 5890);
	}

	@OriginalMember(owner = "client!us", name = "x", descriptor = "(I)I")
	private int method7275() {
		this.aString118 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString117 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString118.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString118.indexOf("brian paul") != -1 || this.aString118.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(54) String local54 = OpenGL.glGetString(7938);
		@Pc(62) String[] local62 = Static583.method7710(' ', local54.replace('.', ' '));
		if (local62.length >= 2) {
			try {
				@Pc(74) int local74 = Static118.method2472(local62[0]);
				@Pc(80) int local80 = Static118.method2472(local62[1]);
				this.anInt8765 = local74 * 10 + local80;
			} catch (@Pc(89) NumberFormatException local89) {
				local10 |= 0x4;
			}
		} else {
			local10 |= 0x4;
		}
		if (this.anInt8765 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(128) int[] local128 = new int[1];
		OpenGL.glGetIntegerv(34018, local128, 0);
		this.anInt8757 = local128[0];
		OpenGL.glGetIntegerv(34929, local128, 0);
		this.anInt8764 = local128[0];
		OpenGL.glGetIntegerv(34930, local128, 0);
		this.anInt8748 = local128[0];
		if (this.anInt8757 < 2 || this.anInt8764 < 2 || this.anInt8748 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean671 = Stream.c();
		this.aBoolean672 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean669 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean677 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean670 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean690 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean691 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean687 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean667 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean685 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean679 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean689 = false;
		this.aBoolean676 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean678 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean680 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean673 = this.aBoolean680 & this.aBoolean678;
		OpenGL.glGetFloatv(2834, Static268.aFloatArray37, 0);
		this.aFloat209 = Static268.aFloatArray37[0];
		this.aFloat213 = Static268.aFloatArray37[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method7215(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class3_Sub4 local19;
		while (!this.aClass130_57.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_57.method3545();
			Static589.anIntArray696[local11++] = (int) local19.aLong273;
			this.anInt8742 -= local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static589.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static589.anIntArray696, 0);
			local11 = 0;
		}
		while (!this.aClass130_58.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_58.method3545();
			Static589.anIntArray696[local11++] = (int) local19.aLong273;
			this.anInt8739 -= local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static589.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static589.anIntArray696, 0);
			local11 = 0;
		}
		while (!this.aClass130_59.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_59.method3545();
			Static589.anIntArray696[local11++] = local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static589.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static589.anIntArray696, 0);
			local11 = 0;
		}
		while (!this.aClass130_60.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_60.method3545();
			Static589.anIntArray696[local11++] = (int) local19.aLong273;
			this.anInt8741 -= local19.anInt109;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static589.anIntArray696, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static589.anIntArray696, 0);
		}
		while (!this.aClass130_56.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_56.method3545();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt109);
		}
		@Pc(217) Class3 local217;
		while (!this.aClass130_61.method3542()) {
			local217 = this.aClass130_61.method3545();
			OpenGL.glDeleteProgramARB((int) local217.aLong273);
		}
		while (!this.aClass130_62.method3542()) {
			local217 = this.aClass130_62.method3545();
			OpenGL.glDeleteObjectARB(local217.aLong273);
		}
		while (!this.aClass130_56.method3542()) {
			local19 = (Class3_Sub4) this.aClass130_56.method3545();
			OpenGL.glDeleteLists((int) local19.aLong273, local19.anInt109);
		}
		this.aClass4_1.method102();
		if (this.b() > 100663296 && Static587.method7753() > this.aLong248 + 60000L) {
			System.gc();
			this.aLong248 = Static587.method7753();
		}
		this.anInt8735 = local9;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!fi;)V")
	@Override
	public void method7189(@OriginalArg(0) Class96 arg0) {
		this.aClass207_1.method4862(this, arg0, -1);
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(ZI)I")
	public int method7276(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(II)V")
	public void method7277(@OriginalArg(0) int arg0) {
		if (this.anInt8774 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8774 = arg0;
		}
	}

	@OriginalMember(owner = "client!us", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7236();
		this.method7222(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f((float) arg2 + local15, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!us", name = "h", descriptor = "()Z")
	@Override
	public boolean method7153() {
		return false;
	}

	@OriginalMember(owner = "client!us", name = "i", descriptor = "(B)V")
	public void method7278() {
		if (this.anInt8776 != 0) {
			this.anInt8776 = 0;
			this.anInt8744 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(Z)V")
	private void method7279() {
		if (this.aCanvas12 == null) {
			this.anInt8641 = this.anInt8700 = 0;
		} else {
			@Pc(14) Dimension local14 = this.aCanvas12.getSize();
			this.anInt8641 = local14.width;
			this.anInt8700 = local14.height;
		}
		if (this.anInterface19_2 == null) {
			this.anInt8564 = this.anInt8700;
			this.anInt8666 = this.anInt8641;
			this.method7262();
		}
		this.method7278();
		this.JA();
	}

	@OriginalMember(owner = "client!us", name = "y", descriptor = "(I)V")
	private void method7280() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!us", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt8768;
		arg0[0] = this.anInt8778;
		arg0[3] = this.anInt8756;
		arg0[2] = this.anInt8770;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7190(@OriginalArg(0) Class46 arg0) {
		this.aClass46_Sub3_1 = (Class46_Sub3) arg0;
		@Pc(81) Class3_Sub3 local81;
		if (this.aBoolean676) {
			if (this.aClass293_6 == null) {
				this.aClass293_6 = new Class293(this);
			}
			if (this.aClass293_6 == this.anInterface19_2) {
				throw new RuntimeException();
			}
			this.method7247(this.aClass293_6);
			@Pc(53) Class3_Sub3_Sub12 local53 = (Class3_Sub3_Sub12) this.aClass310_38.method6601((long) (this.aClass46_Sub3_1.E() << 16 | this.aClass46_Sub3_1.u()));
			if (local53 == null) {
				local53 = new Class3_Sub3_Sub12(this, 6402, this.aClass46_Sub3_1.E(), this.aClass46_Sub3_1.u());
				@Pc(86) Class3_Sub3_Sub12 local86;
				for (this.anInt8740 += local53.anInt4184; this.anInt8740 > 2097152; this.anInt8740 -= local86.anInt4184) {
					local81 = this.aClass38_11.method1074();
					if (local81 == null) {
						break;
					}
					local86 = (Class3_Sub3_Sub12) local81;
					local86.method7720();
					local86.method7812();
					local86.method3697();
				}
				this.aClass310_38.method6603(local53, (long) (this.aClass46_Sub3_1.E() << 16 | this.aClass46_Sub3_1.u()));
			}
			this.aClass38_11.method1068(local53);
			this.aClass293_6.method6426(8, local53);
			this.aClass293_6.method6421(this.aClass46_Sub3_1.aClass34_Sub2_Sub1_2, 0);
		} else if (this.aBoolean672) {
			@Pc(169) Class3_Sub3_Sub13 local169 = (Class3_Sub3_Sub13) this.aClass310_38.method6601((long) (this.aClass46_Sub3_1.E() << 16 | this.aClass46_Sub3_1.u()));
			if (local169 == null) {
				local169 = new Class3_Sub3_Sub13(this, this.aClass46_Sub3_1.E(), this.aClass46_Sub3_1.u());
				@Pc(203) Class3_Sub3_Sub13 local203;
				for (this.anInt8740 += local169.anInt4445 * 4; this.anInt8740 > 2097152; this.anInt8740 -= local203.anInt4445) {
					local81 = this.aClass38_11.method1074();
					if (local81 == null) {
						break;
					}
					local203 = (Class3_Sub3_Sub13) local81;
					local203.method7720();
					local203.method7812();
					this.anOpenGL2.releasePbuffer(local203.method3941());
				}
				this.aClass310_38.method6603(local169, (long) (this.aClass46_Sub3_1.E() << 16 | this.aClass46_Sub3_1.u()));
			}
			this.aClass38_11.method1068(local169);
			this.anOpenGL2.setPbuffer(local169.method3941());
		} else {
			throw new RuntimeException("");
		}
		this.anInt8666 = arg0.E();
		this.anInt8564 = arg0.u();
		this.method7278();
		this.method7262();
		this.JA();
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(IB)V")
	public void method7281(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7287(7681, 7681);
		} else if (arg0 == 0) {
			this.method7287(8448, 8448);
		} else if (arg0 == 2) {
			this.method7287(7681, 34165);
		} else if (arg0 == 3) {
			this.method7287(8448, 260);
		} else if (arg0 == 4) {
			this.method7287(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	@Override
	public void method7141(@OriginalArg(0) int arg0) {
		this.method7273();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BIII)V")
	public void method7282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!us", name = "j", descriptor = "(B)V")
	public void method7283() {
		if (this.anInt8744 == 2) {
			return;
		}
		this.method7297();
		this.method7248(false);
		this.method7298(false);
		this.method7245(false);
		this.method7239(false);
		this.method7294(-2);
		this.anInt8744 = 2;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(FFIFF)V")
	public void method7284(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static268.aFloatArray37[1] = arg2;
		Static268.aFloatArray37[0] = arg0;
		Static268.aFloatArray37[3] = arg1;
		Static268.aFloatArray37[2] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static268.aFloatArray37, 0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZII)V")
	public void method7285(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8761 = arg0;
		this.anInt8759 = arg1;
		this.method7262();
		this.method7258();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIF)Lclient!ff;")
	@Override
	public Class3_Sub22 method7164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub22_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass41_1.method1145(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!paa;)V")
	public void method7286(@OriginalArg(1) Interface19 arg0) {
		if (this.aBoolean678) {
			this.method7218(arg0);
			this.method7293(arg0);
		} else if (this.anInt8738 >= 0 && arg0 == this.anInterface19Array3[this.anInt8738]) {
			this.anInterface19Array3[this.anInt8738--] = null;
			arg0.method6405();
			if (this.anInt8738 < 0) {
				this.anInterface19_1 = this.anInterface19_2 = null;
			} else {
				this.anInterface19_1 = this.anInterface19_2 = this.anInterface19Array3[this.anInt8738];
				this.anInterface19_1.method6410();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!us", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8666 < arg2) {
			arg2 = this.anInt8666;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg3 > this.anInt8564) {
			arg3 = this.anInt8564;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		this.anInt8778 = arg0;
		this.anInt8768 = arg1;
		this.anInt8756 = arg3;
		this.anInt8770 = arg2;
		OpenGL.glEnable(3089);
		this.method7271();
		this.method7258();
	}

	@OriginalMember(owner = "client!us", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (this.aFloat208 != arg0) {
			this.aFloat208 = arg0;
			this.method7230();
		}
	}

	@OriginalMember(owner = "client!us", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8756 > arg3) {
			this.anInt8756 = arg3;
		}
		if (this.anInt8778 < arg0) {
			this.anInt8778 = arg0;
		}
		if (arg1 > this.anInt8768) {
			this.anInt8768 = arg1;
		}
		if (this.anInt8770 > arg2) {
			this.anInt8770 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method7271();
		this.method7258();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7187(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub2_3.M(arg0);
		this.aClass109_Sub2_4.M(this.aClass109_Sub2_3);
		this.aClass109_Sub2_4.method6771();
		this.aClass109_Sub2_5.method6769(this.aClass109_Sub2_4);
		if (this.anInt8776 != 1) {
			this.method7259();
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
	@Override
	public void method7157(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!us", name = "r", descriptor = "()Z")
	@Override
	public boolean method7173() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IIB)V")
	public void method7287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8774 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(14) boolean local14 = false;
		if (arg1 != this.anInt8773) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local14 = true;
			this.anInt8773 = arg1;
		}
		if (this.anInt8750 != arg0) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local14 = true;
			this.anInt8750 = arg0;
		}
		if (local14) {
			this.anInt8744 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt8742 + this.anInt8739 + this.anInt8741;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI[BII)Lclient!cv;")
	public Interface5 method7288(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2) {
		return (Interface5) (this.aBoolean669 && (!arg0 || this.aBoolean666) ? new Class202_Sub2(this, 5123, arg1, arg2, arg0) : new Class28_Sub1(this, 5123, arg1, arg2));
	}

	@OriginalMember(owner = "client!us", name = "j", descriptor = "()I")
	@Override
	public int method7159() {
		return 4;
	}

	@OriginalMember(owner = "client!us", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8766 && this.anInt8746 == arg1 && arg2 == this.anInt8767) {
			return;
		}
		this.anInt8767 = arg2;
		this.anInt8766 = arg0;
		this.anInt8746 = arg1;
		this.method7249();
		this.method7243();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(FFFI)V")
	private void method7289(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean684) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!paa;Z)V")
	public void method7290(@OriginalArg(0) Interface19 arg0) {
		if (this.anInt8737 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8737 >= 0) {
			this.anInterface19Array1[this.anInt8737].method6406();
		}
		this.anInterface19_2 = this.anInterface19Array1[++this.anInt8737] = arg0;
		this.anInterface19_2.method6408();
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(ILclient!paa;)V")
	public void method7292(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt8736 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8736 >= 0) {
			this.anInterface19Array2[this.anInt8736].method6407();
		}
		this.anInterface19_1 = this.anInterface19Array2[++this.anInt8736] = arg0;
		this.anInterface19_1.method6409();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(ILclient!paa;)V")
	public void method7293(@OriginalArg(1) Interface19 arg0) {
		if (this.anInt8737 < 0 || this.anInterface19Array1[this.anInt8737] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface19Array1[this.anInt8737--] = null;
		arg0.method6406();
		if (this.anInt8737 >= 0) {
			this.anInterface19_2 = this.anInterface19Array1[this.anInt8737];
			this.anInterface19_2.method6408();
		} else {
			this.anInterface19_2 = null;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class146 method7168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static437.method6177(this, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "()Z")
	@Override
	public boolean method7147() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!daa;[Lclient!vw;Z)Lclient!la;")
	@Override
	public Class117 method7139(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class355[] arg1) {
		return new Class117_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(II)V")
	public void method7294(@OriginalArg(1) int arg0) {
		this.method7232(true, arg0);
	}

	@OriginalMember(owner = "client!us", name = "B", descriptor = "()Z")
	@Override
	public boolean method7216() {
		return this.aClass3_Sub18_Sub1_1 != null && this.aClass3_Sub18_Sub1_1.method5737();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V")
	@Override
	public void method7195(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(Z)V")
	public void method7295() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!js;)V")
	@Override
	public void method7148(@OriginalArg(0) Class55 arg0) {
		this.aClass55_Sub2_1 = (Class55_Sub2) arg0;
	}

	@OriginalMember(owner = "client!us", name = "A", descriptor = "(I)V")
	private void method7296() {
		this.method7294(-2);
		for (@Pc(14) int local14 = this.anInt8757 - 1; local14 >= 0; local14--) {
			this.method7277(local14);
			this.method7220(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7287(8448, 8448);
		this.method7225(2, 770, 34168);
		this.method7244();
		this.anInt8745 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8743 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean663 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean665 = true;
		this.method7248(true);
		this.method7298(true);
		this.method7245(true);
		this.method7239(true);
		this.method7278();
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
		@Pc(128) float[] local128 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(130) int local130 = 0; local130 < 8; local130++) {
			@Pc(136) int local136 = local130 + 16384;
			OpenGL.glLightfv(local136, 4608, local128, 0);
			OpenGL.glLightf(local136, 4615, 0.0F);
			OpenGL.glLightf(local136, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8754 = this.anInt8766 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!us", name = "B", descriptor = "(I)V")
	private void method7297() {
		if (this.anInt8776 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8666 > 0 && this.anInt8564 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8666, (double) this.anInt8564, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8776 = 1;
		this.anInt8744 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!us", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7160() {
		return new Class109_Sub2();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7140() {
		return this.aClass109_Sub2_3;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!vw;Z)Lclient!f;")
	@Override
	public Class46 method7205(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt9162 * arg0.anInt9165];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray105 == null) {
			for (local21 = 0; local21 < arg0.anInt9162; local21++) {
				for (local25 = 0; local25 < arg0.anInt9165; local25++) {
					@Pc(38) int local38 = arg0.anIntArray677[arg0.aByteArray104[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt9162; local21++) {
				for (local25 = 0; local25 < arg0.anInt9165; local25++) {
					local12[local16++] = arg0.anIntArray677[arg0.aByteArray104[local14] & 0xFF] | arg0.aByteArray105[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(126) Class46 local126 = this.method7198(local12, arg0.anInt9165, arg0.anInt9165, arg0.anInt9162);
		local126.Q(arg0.anInt9161, arg0.anInt9163, arg0.anInt9164, arg0.anInt9166);
		return local126;
	}

	@OriginalMember(owner = "client!us", name = "m", descriptor = "()Z")
	@Override
	public boolean method7162() {
		return true;
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(ZI)V")
	public void method7298(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean681 != arg0) {
			this.aBoolean681 = arg0;
			this.method7226();
			this.anInt8744 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "()Z")
	@Override
	public boolean method7146() {
		return this.aClass3_Sub18_Sub1_1 != null && (this.anInt8727 <= 1 || this.aBoolean673);
	}

	@OriginalMember(owner = "client!us", name = "z", descriptor = "()V")
	@Override
	public void method7204() {
		if (this.aClass3_Sub18_Sub1_1 != null && this.aClass3_Sub18_Sub1_1.method5737()) {
			this.aClass41_1.method1144(this.aClass3_Sub18_Sub1_1);
			this.aClass4_1.method103();
		}
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(Z)V")
	private void method7299() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray66, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!us", name = "C", descriptor = "(I)V")
	public void method7300() {
		if (this.anInt8744 == 4) {
			return;
		}
		this.method7297();
		this.method7248(false);
		this.method7298(false);
		this.method7245(false);
		this.method7239(false);
		this.method7294(-2);
		this.method7222(1);
		this.anInt8744 = 4;
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
	@Override
	public void method7191(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8728 = arg0;
		this.aClass4_1.method103();
	}

	@OriginalMember(owner = "client!us", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass109_Sub2_3.aFloat164 * (float) arg2 + this.aClass109_Sub2_3.aFloat166 * (float) arg0 + (float) arg1 * this.aClass109_Sub2_3.aFloat168 + this.aClass109_Sub2_3.aFloat165;
		if (local28 < (float) this.anInt8758 || local28 > (float) this.anInt8775) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt8760 * ((float) arg0 * this.aClass109_Sub2_3.aFloat172 + this.aClass109_Sub2_3.aFloat173 * (float) arg1 + (float) arg2 * this.aClass109_Sub2_3.aFloat171 + this.aClass109_Sub2_3.aFloat170) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt8769 * (this.aClass109_Sub2_3.aFloat174 + (float) arg2 * this.aClass109_Sub2_3.aFloat169 + (float) arg0 * this.aClass109_Sub2_3.aFloat175 + this.aClass109_Sub2_3.aFloat167 * (float) arg1) / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat199);
		arg3[1] = (int) ((float) local117 - this.aFloat200);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!us", name = "D", descriptor = "(I)V")
	private void method7301() {
		OpenGL.glDepthMask(this.bf && this.aBoolean675);
	}

	@OriginalMember(owner = "client!us", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8749 = arg3;
		this.anInt8755 = arg0;
		this.aBoolean688 = true;
		this.anInt8751 = arg2;
		this.anInt8747 = arg1;
	}

	@OriginalMember(owner = "client!us", name = "t", descriptor = "()Z")
	@Override
	public boolean method7180() {
		if (this.aClass3_Sub18_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub18_Sub1_1.method5737()) {
			if (!this.aClass41_1.method1146(this.aClass3_Sub18_Sub1_1)) {
				return false;
			}
			this.aClass4_1.method103();
		}
		return true;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class46 method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class46_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILclient!jaclib/memory/Buffer;ZB)Lclient!el;")
	public Interface7 method7302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		return (Interface7) (this.aBoolean669 ? new Class202_Sub1(this, arg1, arg2, arg0, false) : new Class28_Sub2(this, arg1, arg2));
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!rca;Lclient!rca;Lclient!rca;Lclient!rca;B)V")
	public void method7303(@OriginalArg(0) Class280 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) Class280 arg3) {
		if (arg1 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method7238(arg1.anInterface7_5);
			OpenGL.glVertexPointer(arg1.aByte101, arg1.aShort102, this.anInterface7_7.method6583(), this.anInterface7_7.method6580() + (long) arg1.aByte102);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method7238(arg3.anInterface7_5);
			OpenGL.glNormalPointer(arg3.aShort102, this.anInterface7_7.method6583(), this.anInterface7_7.method6580() + (long) arg3.aByte102);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method7238(arg2.anInterface7_5);
			OpenGL.glColorPointer(arg2.aByte101, arg2.aShort102, this.anInterface7_7.method6583(), this.anInterface7_7.method6580() + (long) arg2.aByte102);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method7238(arg0.anInterface7_5);
			OpenGL.glTexCoordPointer(arg0.aByte101, arg0.aShort102, this.anInterface7_7.method6583(), this.anInterface7_7.method6580() + (long) arg0.aByte102);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7163(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.aLong247 = 0L;
		if (arg0 == null || this.aCanvas13 == arg0) {
			this.aLong247 = this.aLong246;
			this.aCanvas12 = this.aCanvas13;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable7.get(arg0);
			this.aLong247 = local36;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong247 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong247);
		this.method7279();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class46 method7143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class46_Sub3(this, arg0, arg1, true);
	}
}
