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

@OriginalClass("client!ok")
public final class Class134_Sub2 extends Class134 {

	@OriginalMember(owner = "client!ok", name = "lb", descriptor = "[I")
	public static int[] lb;

	@OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
	public int anInt6392;

	@OriginalMember(owner = "client!ok", name = "vb", descriptor = "I")
	private int anInt6412;

	@OriginalMember(owner = "client!ok", name = "Wc", descriptor = "I")
	public int anInt6489;

	@OriginalMember(owner = "client!ok", name = "Fd", descriptor = "I")
	private int anInt6523;

	@OriginalMember(owner = "client!ok", name = "re", descriptor = "I")
	public int anInt6551;

	@OriginalMember(owner = "client!ok", name = "se", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!ok", name = "ye", descriptor = "Lclient!faa;")
	private Class98 aClass98_6;

	@OriginalMember(owner = "client!ok", name = "ze", descriptor = "Lclient!fn;")
	private Class22_Sub3 aClass22_Sub3_1;

	@OriginalMember(owner = "client!ok", name = "Be", descriptor = "Lclient!dba;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ok", name = "De", descriptor = "Lclient!dba;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!ok", name = "Ge", descriptor = "I")
	public int anInt6555;

	@OriginalMember(owner = "client!ok", name = "He", descriptor = "I")
	private int anInt6556;

	@OriginalMember(owner = "client!ok", name = "Je", descriptor = "I")
	public int anInt6557;

	@OriginalMember(owner = "client!ok", name = "Ke", descriptor = "I")
	private int anInt6558;

	@OriginalMember(owner = "client!ok", name = "Re", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!ok", name = "Se", descriptor = "I")
	private int anInt6559;

	@OriginalMember(owner = "client!ok", name = "Te", descriptor = "Z")
	private boolean aBoolean498;

	@OriginalMember(owner = "client!ok", name = "Ve", descriptor = "J")
	private long aLong208;

	@OriginalMember(owner = "client!ok", name = "We", descriptor = "I")
	private int anInt6560;

	@OriginalMember(owner = "client!ok", name = "Xe", descriptor = "Z")
	private boolean aBoolean499;

	@OriginalMember(owner = "client!ok", name = "Ye", descriptor = "I")
	private int anInt6561;

	@OriginalMember(owner = "client!ok", name = "Ze", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!ok", name = "df", descriptor = "I")
	private int anInt6563;

	@OriginalMember(owner = "client!ok", name = "ef", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_1;

	@OriginalMember(owner = "client!ok", name = "hf", descriptor = "I")
	private int anInt6565;

	@OriginalMember(owner = "client!ok", name = "lf", descriptor = "Lclient!ot;")
	private Class40_Sub3_Sub1 aClass40_Sub3_Sub1_5;

	@OriginalMember(owner = "client!ok", name = "pf", descriptor = "F")
	public float aFloat140;

	@OriginalMember(owner = "client!ok", name = "sf", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_2;

	@OriginalMember(owner = "client!ok", name = "uf", descriptor = "I")
	public int anInt6570;

	@OriginalMember(owner = "client!ok", name = "vf", descriptor = "I")
	public int anInt6571;

	@OriginalMember(owner = "client!ok", name = "xf", descriptor = "F")
	private float aFloat142;

	@OriginalMember(owner = "client!ok", name = "yf", descriptor = "Z")
	private boolean aBoolean503;

	@OriginalMember(owner = "client!ok", name = "zf", descriptor = "Z")
	public boolean aBoolean504;

	@OriginalMember(owner = "client!ok", name = "Af", descriptor = "F")
	private float aFloat143;

	@OriginalMember(owner = "client!ok", name = "Cf", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!ok", name = "Ef", descriptor = "Lclient!lq;")
	public Class213 aClass213_5;

	@OriginalMember(owner = "client!ok", name = "Ff", descriptor = "I")
	private int anInt6574;

	@OriginalMember(owner = "client!ok", name = "Hf", descriptor = "Z")
	private boolean aBoolean506;

	@OriginalMember(owner = "client!ok", name = "If", descriptor = "Lclient!lq;")
	public Class213 aClass213_6;

	@OriginalMember(owner = "client!ok", name = "Jf", descriptor = "Z")
	private boolean aBoolean507;

	@OriginalMember(owner = "client!ok", name = "Lf", descriptor = "I")
	private int anInt6575;

	@OriginalMember(owner = "client!ok", name = "Nf", descriptor = "Z")
	private boolean aBoolean508;

	@OriginalMember(owner = "client!ok", name = "Of", descriptor = "Z")
	public boolean aBoolean509;

	@OriginalMember(owner = "client!ok", name = "Pf", descriptor = "F")
	public float aFloat146;

	@OriginalMember(owner = "client!ok", name = "Qf", descriptor = "Z")
	public boolean aBoolean510;

	@OriginalMember(owner = "client!ok", name = "Vf", descriptor = "Lclient!faa;")
	public Class98 aClass98_7;

	@OriginalMember(owner = "client!ok", name = "Yf", descriptor = "Z")
	public boolean aBoolean511;

	@OriginalMember(owner = "client!ok", name = "Zf", descriptor = "F")
	public float aFloat148;

	@OriginalMember(owner = "client!ok", name = "ag", descriptor = "[Lclient!ip;")
	private Class40[] aClass40Array1;

	@OriginalMember(owner = "client!ok", name = "bg", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_3;

	@OriginalMember(owner = "client!ok", name = "cg", descriptor = "Z")
	public boolean aBoolean512;

	@OriginalMember(owner = "client!ok", name = "eg", descriptor = "Z")
	private boolean aBoolean514;

	@OriginalMember(owner = "client!ok", name = "ig", descriptor = "F")
	private float aFloat150;

	@OriginalMember(owner = "client!ok", name = "jg", descriptor = "I")
	private int anInt6581;

	@OriginalMember(owner = "client!ok", name = "kg", descriptor = "F")
	public float aFloat151;

	@OriginalMember(owner = "client!ok", name = "lg", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_4;

	@OriginalMember(owner = "client!ok", name = "xg", descriptor = "Z")
	public boolean aBoolean517;

	@OriginalMember(owner = "client!ok", name = "zg", descriptor = "I")
	public int anInt6587;

	@OriginalMember(owner = "client!ok", name = "Bg", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!ok", name = "Cg", descriptor = "F")
	public float aFloat155;

	@OriginalMember(owner = "client!ok", name = "Dg", descriptor = "I")
	private int anInt6589;

	@OriginalMember(owner = "client!ok", name = "Eg", descriptor = "Z")
	public boolean aBoolean519;

	@OriginalMember(owner = "client!ok", name = "Gg", descriptor = "Lclient!cd;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!ok", name = "Ig", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_5;

	@OriginalMember(owner = "client!ok", name = "Jg", descriptor = "Lclient!vu;")
	private Interface23 anInterface23_2;

	@OriginalMember(owner = "client!ok", name = "Kg", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_6;

	@OriginalMember(owner = "client!ok", name = "Lg", descriptor = "I")
	private int anInt6590;

	@OriginalMember(owner = "client!ok", name = "Ng", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_7;

	@OriginalMember(owner = "client!ok", name = "Og", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!ok", name = "Qg", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_8;

	@OriginalMember(owner = "client!ok", name = "Sg", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_9;

	@OriginalMember(owner = "client!ok", name = "Ug", descriptor = "Z")
	private boolean aBoolean522;

	@OriginalMember(owner = "client!ok", name = "Vg", descriptor = "F")
	public float aFloat157;

	@OriginalMember(owner = "client!ok", name = "Xg", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!ok", name = "Yg", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!ok", name = "ah", descriptor = "I")
	private int anInt6593;

	@OriginalMember(owner = "client!ok", name = "bh", descriptor = "Lclient!wn;")
	public Class40_Sub3 aClass40_Sub3_4;

	@OriginalMember(owner = "client!ok", name = "dh", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!ok", name = "fh", descriptor = "Lclient!qf;")
	public Class63_Sub3 aClass63_Sub3_10;

	@OriginalMember(owner = "client!ok", name = "gh", descriptor = "Lclient!cd;")
	private Interface5 anInterface5_4;

	@OriginalMember(owner = "client!ok", name = "ih", descriptor = "Lclient!mv;")
	private Class83_Sub2 aClass83_Sub2_1;

	@OriginalMember(owner = "client!ok", name = "jh", descriptor = "I")
	private int anInt6596;

	@OriginalMember(owner = "client!ok", name = "lh", descriptor = "I")
	private int anInt6597;

	@OriginalMember(owner = "client!ok", name = "Ib", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!ok", name = "de", descriptor = "I")
	public int anInt6546 = 128;

	@OriginalMember(owner = "client!ok", name = "je", descriptor = "Lclient!mi;")
	private final Class225 aClass225_1 = new Class225();

	@OriginalMember(owner = "client!ok", name = "le", descriptor = "Lclient!hda;")
	private final Class113_Sub2 aClass113_Sub2_1 = new Class113_Sub2();

	@OriginalMember(owner = "client!ok", name = "me", descriptor = "Lclient!hda;")
	public final Class113_Sub2 aClass113_Sub2_2 = new Class113_Sub2();

	@OriginalMember(owner = "client!ok", name = "oe", descriptor = "I")
	public int anInt6549 = 8;

	@OriginalMember(owner = "client!ok", name = "qe", descriptor = "I")
	public int anInt6550 = 3;

	@OriginalMember(owner = "client!ok", name = "te", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "client!ok", name = "ne", descriptor = "Lclient!wba;")
	private final Class353 aClass353_47 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Ae", descriptor = "I")
	private int anInt6554 = -1;

	@OriginalMember(owner = "client!ok", name = "Ce", descriptor = "[Lclient!dba;")
	private final Interface6[] anInterface6Array2 = new Interface6[4];

	@OriginalMember(owner = "client!ok", name = "xe", descriptor = "I")
	private int anInt6553 = -1;

	@OriginalMember(owner = "client!ok", name = "ue", descriptor = "I")
	private int anInt6552 = -1;

	@OriginalMember(owner = "client!ok", name = "we", descriptor = "[Lclient!dba;")
	private final Interface6[] anInterface6Array1 = new Interface6[4];

	@OriginalMember(owner = "client!ok", name = "Ee", descriptor = "[Lclient!dba;")
	private final Interface6[] anInterface6Array3 = new Interface6[4];

	@OriginalMember(owner = "client!ok", name = "ve", descriptor = "Lclient!gm;")
	private final Class125 aClass125_10 = new Class125();

	@OriginalMember(owner = "client!ok", name = "Fe", descriptor = "Lclient!kea;")
	private final Class187 aClass187_29 = new Class187(16);

	@OriginalMember(owner = "client!ok", name = "Ie", descriptor = "Lclient!wba;")
	private final Class353 aClass353_48 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Le", descriptor = "Lclient!wba;")
	private final Class353 aClass353_49 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Me", descriptor = "Lclient!wba;")
	private final Class353 aClass353_50 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Ne", descriptor = "Lclient!wba;")
	private final Class353 aClass353_51 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Oe", descriptor = "Lclient!wba;")
	private final Class353 aClass353_52 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Pe", descriptor = "Lclient!wba;")
	private final Class353 aClass353_53 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Qe", descriptor = "Lclient!wba;")
	private final Class353 aClass353_54 = new Class353();

	@OriginalMember(owner = "client!ok", name = "Ue", descriptor = "Lclient!hda;")
	public final Class113_Sub2 aClass113_Sub2_3 = new Class113_Sub2();

	@OriginalMember(owner = "client!ok", name = "af", descriptor = "Lclient!hda;")
	public final Class113_Sub2 aClass113_Sub2_4 = new Class113_Sub2();

	@OriginalMember(owner = "client!ok", name = "bf", descriptor = "Lclient!hda;")
	public final Class113_Sub2 bf = new Class113_Sub2();

	@OriginalMember(owner = "client!ok", name = "qf", descriptor = "F")
	public float aFloat141 = -1.0F;

	@OriginalMember(owner = "client!ok", name = "cf", descriptor = "I")
	public int anInt6562 = -1;

	@OriginalMember(owner = "client!ok", name = "of", descriptor = "F")
	private float aFloat139 = -1.0F;

	@OriginalMember(owner = "client!ok", name = "Mf", descriptor = "F")
	public float aFloat145 = 3584.0F;

	@OriginalMember(owner = "client!ok", name = "fg", descriptor = "I")
	private int anInt6580 = 0;

	@OriginalMember(owner = "client!ok", name = "gg", descriptor = "F")
	public float aFloat149 = 1.0F;

	@OriginalMember(owner = "client!ok", name = "nf", descriptor = "I")
	public int anInt6567 = 512;

	@OriginalMember(owner = "client!ok", name = "Sf", descriptor = "I")
	public int anInt6576 = 0;

	@OriginalMember(owner = "client!ok", name = "Rf", descriptor = "F")
	private float aFloat147 = 1.0F;

	@OriginalMember(owner = "client!ok", name = "pg", descriptor = "I")
	public int anInt6582 = -1;

	@OriginalMember(owner = "client!ok", name = "qg", descriptor = "I")
	public int anInt6583 = 512;

	@OriginalMember(owner = "client!ok", name = "Xf", descriptor = "I")
	private int anInt6579 = 0;

	@OriginalMember(owner = "client!ok", name = "tf", descriptor = "I")
	private int anInt6569 = 8448;

	@OriginalMember(owner = "client!ok", name = "vg", descriptor = "I")
	public int anInt6585 = 0;

	@OriginalMember(owner = "client!ok", name = "og", descriptor = "F")
	private float aFloat153 = 0.0F;

	@OriginalMember(owner = "client!ok", name = "mg", descriptor = "F")
	public float aFloat152 = 1.0F;

	@OriginalMember(owner = "client!ok", name = "hg", descriptor = "Z")
	private boolean aBoolean515 = true;

	@OriginalMember(owner = "client!ok", name = "Hg", descriptor = "[F")
	private final float[] aFloatArray41 = new float[16];

	@OriginalMember(owner = "client!ok", name = "mf", descriptor = "F")
	public float aFloat138 = 1.0F;

	@OriginalMember(owner = "client!ok", name = "sg", descriptor = "I")
	public int anInt6584 = 0;

	@OriginalMember(owner = "client!ok", name = "Ag", descriptor = "[F")
	public final float[] aFloatArray40 = new float[4];

	@OriginalMember(owner = "client!ok", name = "wg", descriptor = "I")
	private int anInt6586 = 3584;

	@OriginalMember(owner = "client!ok", name = "Mg", descriptor = "F")
	private float aFloat156 = 1.0F;

	@OriginalMember(owner = "client!ok", name = "Df", descriptor = "I")
	private int anInt6573 = 0;

	@OriginalMember(owner = "client!ok", name = "rf", descriptor = "I")
	public int anInt6568 = 0;

	@OriginalMember(owner = "client!ok", name = "ug", descriptor = "[F")
	private final float[] aFloatArray39 = new float[4];

	@OriginalMember(owner = "client!ok", name = "wf", descriptor = "I")
	private int anInt6572 = -1;

	@OriginalMember(owner = "client!ok", name = "rg", descriptor = "F")
	private float aFloat154 = -1.0F;

	@OriginalMember(owner = "client!ok", name = "Uf", descriptor = "I")
	private int anInt6577 = 8448;

	@OriginalMember(owner = "client!ok", name = "Zg", descriptor = "I")
	private int anInt6592 = 0;

	@OriginalMember(owner = "client!ok", name = "Bf", descriptor = "F")
	public float aFloat144 = -1.0F;

	@OriginalMember(owner = "client!ok", name = "kf", descriptor = "I")
	private int anInt6566 = 0;

	@OriginalMember(owner = "client!ok", name = "gf", descriptor = "I")
	private int anInt6564 = 0;

	@OriginalMember(owner = "client!ok", name = "Kf", descriptor = "[F")
	private final float[] aFloatArray38 = new float[4];

	@OriginalMember(owner = "client!ok", name = "Tf", descriptor = "[Lclient!rc;")
	private final Class1_Sub18[] aClass1_Sub18Array5 = new Class1_Sub18[Static239.anInt4444];

	@OriginalMember(owner = "client!ok", name = "hh", descriptor = "F")
	public float aFloat158 = 3584.0F;

	@OriginalMember(owner = "client!ok", name = "Wf", descriptor = "I")
	public int anInt6578 = -1;

	@OriginalMember(owner = "client!ok", name = "Rg", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "client!ok", name = "Tg", descriptor = "I")
	public int anInt6591 = 50;

	@OriginalMember(owner = "client!ok", name = "Pg", descriptor = "[F")
	private final float[] aFloatArray42 = new float[4];

	@OriginalMember(owner = "client!ok", name = "ch", descriptor = "I")
	public int anInt6594 = -1;

	@OriginalMember(owner = "client!ok", name = "tg", descriptor = "Lclient!pd;")
	public Class1_Sub35_Sub1 aClass1_Sub35_Sub1_2 = new Class1_Sub35_Sub1(8192);

	@OriginalMember(owner = "client!ok", name = "kh", descriptor = "[B")
	public final byte[] aByteArray78 = new byte[16384];

	@OriginalMember(owner = "client!ok", name = "oh", descriptor = "[I")
	public int[] anIntArray513 = new int[1];

	@OriginalMember(owner = "client!ok", name = "mh", descriptor = "[I")
	public int[] anIntArray511 = new int[1];

	@OriginalMember(owner = "client!ok", name = "nh", descriptor = "[I")
	public int[] anIntArray512 = new int[1];

	@OriginalMember(owner = "client!ok", name = "ge", descriptor = "I")
	public final int anInt6548;

	@OriginalMember(owner = "client!ok", name = "R", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas11;

	@OriginalMember(owner = "client!ok", name = "Y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas12;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!ok", name = "ad", descriptor = "J")
	private final long aLong206;

	@OriginalMember(owner = "client!ok", name = "Hd", descriptor = "J")
	private long aLong207;

	@OriginalMember(owner = "client!ok", name = "eh", descriptor = "I")
	public final int anInt6595;

	@OriginalMember(owner = "client!ok", name = "Wg", descriptor = "Z")
	private boolean aBoolean523;

	@OriginalMember(owner = "client!ok", name = "dg", descriptor = "Z")
	public boolean aBoolean513;

	@OriginalMember(owner = "client!ok", name = "Fg", descriptor = "Z")
	public boolean aBoolean520;

	@OriginalMember(owner = "client!ok", name = "Gf", descriptor = "Z")
	public boolean aBoolean505;

	@OriginalMember(owner = "client!ok", name = "jf", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!ok", name = "ng", descriptor = "Z")
	public boolean aBoolean516;

	@OriginalMember(owner = "client!ok", name = "yg", descriptor = "Z")
	public boolean aBoolean518;

	@OriginalMember(owner = "client!ok", name = "ff", descriptor = "Z")
	private final boolean aBoolean501;

	@OriginalMember(owner = "client!ok", name = "ke", descriptor = "Lclient!nj;")
	private final Class237 aClass237_1;

	@OriginalMember(owner = "client!ok", name = "pe", descriptor = "Lclient!br;")
	public final Class37 aClass37_1;

	@OriginalMember(owner = "client!ok", name = "he", descriptor = "Lclient!nk;")
	private final Class238 aClass238_1;

	@OriginalMember(owner = "client!ok", name = "ie", descriptor = "Lclient!bl;")
	private Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!ok", name = "ee", descriptor = "Lclient!jg;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class134_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt6548 = arg2;
		this.aCanvas12 = this.aCanvas11 = arg0;
		if (!Static342.method4694("jaclib")) {
			throw new RuntimeException("");
		} else if (Static342.method4694("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong207 = this.aLong206 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt6548);
				if (this.aLong206 == 0L) {
					throw new RuntimeException("");
				}
				this.method5264();
				@Pc(341) int local341 = this.method5256();
				if (local341 != 0) {
					throw new RuntimeException("");
				}
				this.anInt6595 = this.aBoolean517 ? 33639 : 5121;
				if (this.aString64.indexOf("radeon") != -1) {
					@Pc(364) int local364 = 0;
					@Pc(366) boolean local366 = false;
					@Pc(368) boolean local368 = false;
					@Pc(377) String[] local377 = Static500.method7455(' ', this.aString64.replace('/', ' '));
					for (@Pc(379) int local379 = 0; local379 < local377.length; local379++) {
						@Pc(385) String local385 = local377[local379];
						try {
							if (local385.length() > 0) {
								if (local385.charAt(0) == 'x' && local385.length() >= 3 && Static368.method4957(local385.substring(1, 3))) {
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
									if (local385.length() >= 4 && Static368.method4957(local385.substring(0, 4))) {
										local364 = Static21.method7701(local385.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(450) Exception local450) {
						}
					}
					if (!local368 && !local366) {
						if (local364 >= 7000 && local364 <= 7999) {
							this.aBoolean523 = false;
						}
						if (local364 >= 7000 && local364 <= 9250) {
							this.aBoolean513 = false;
						}
					}
					if (!local366 || local364 < 4000) {
						this.aBoolean520 = false;
					}
					this.aBoolean505 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean502 = this.aBoolean523;
					this.aBoolean516 = true;
				}
				if (this.aString65.indexOf("intel") != -1) {
					this.aBoolean518 = false;
				}
				this.aBoolean501 = !this.aString65.equals("s3 graphics");
				if (this.aBoolean523) {
					try {
						@Pc(534) int[] local534 = new int[1];
						OpenGL.glGenBuffersARB(1, local534, 0);
					} catch (@Pc(540) Throwable local540) {
						throw new RuntimeException("");
					}
				}
				Static209.method3312(false, true);
				this.aBoolean496 = true;
				this.aClass237_1 = new Class237(this, super.anInterface7_10);
				this.method5252();
				this.aClass37_1 = new Class37(this);
				this.aClass238_1 = new Class238(this);
				if (this.aClass238_1.method4838()) {
					this.aClass1_Sub8_Sub1_1 = new Class1_Sub8_Sub1(this);
					if (!this.aClass1_Sub8_Sub1_1.method598()) {
						this.aClass1_Sub8_Sub1_1.method588();
						this.aClass1_Sub8_Sub1_1 = null;
					}
				}
				this.aClass171_1 = new Class171(this);
				this.method5266();
				this.method5210();
				this.method6969();
			} catch (@Pc(614) Throwable local614) {
				local614.printStackTrace();
				this.method6923();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V")
	public void method5190(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean514) {
			this.aBoolean514 = arg0;
			this.method5204();
			this.anInt6561 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ok", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat157) {
			this.aFloat157 = arg0;
			this.method5261();
		}
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(I)V")
	public void method5191() {
		if (this.anInt6561 == 2) {
			return;
		}
		this.method5209();
		this.method5236(false);
		this.method5190(false);
		this.method5268(false);
		this.method5231(false);
		this.method5207(-2);
		this.anInt6561 = 2;
	}

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "()Z")
	@Override
	public boolean method6956() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6916(@OriginalArg(0) Class1_Sub5 arg0) {
		this.aNativeHeap5 = ((Class1_Sub5_Sub2) arg0).aNativeHeap4;
		if (this.anInterface5_3 != null) {
			return;
		}
		@Pc(16) Class1_Sub35_Sub1 local16 = new Class1_Sub35_Sub1(80);
		if (this.aBoolean517) {
			local16.method5571(-1.0F);
			local16.method5571(-1.0F);
			local16.method5571(0.0F);
			local16.method5571(0.0F);
			local16.method5571(1.0F);
			local16.method5571(1.0F);
			local16.method5571(-1.0F);
			local16.method5571(0.0F);
			local16.method5571(1.0F);
			local16.method5571(1.0F);
			local16.method5571(1.0F);
			local16.method5571(1.0F);
			local16.method5571(0.0F);
			local16.method5571(1.0F);
			local16.method5571(0.0F);
			local16.method5571(-1.0F);
			local16.method5571(1.0F);
			local16.method5571(0.0F);
			local16.method5571(0.0F);
			local16.method5571(0.0F);
		} else {
			local16.method5572(-1.0F);
			local16.method5572(-1.0F);
			local16.method5572(0.0F);
			local16.method5572(0.0F);
			local16.method5572(1.0F);
			local16.method5572(1.0F);
			local16.method5572(-1.0F);
			local16.method5572(0.0F);
			local16.method5572(1.0F);
			local16.method5572(1.0F);
			local16.method5572(1.0F);
			local16.method5572(1.0F);
			local16.method5572(0.0F);
			local16.method5572(1.0F);
			local16.method5572(0.0F);
			local16.method5572(-1.0F);
			local16.method5572(1.0F);
			local16.method5572(0.0F);
			local16.method5572(0.0F);
			local16.method5572(0.0F);
		}
		this.anInterface5_3 = this.method5270(false, local16.anInt7214, 20, local16.aByteArray85);
		this.aClass213_6 = new Class213(this.anInterface5_3, 5126, 3, 0);
		this.aClass213_5 = new Class213(this.anInterface5_3, 5126, 2, 12);
		this.aClass225_1.method4488(this);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	private void method5192() {
		if (this.anInt6593 != 2) {
			this.anInt6593 = 2;
			this.method5265();
			this.method5213();
			this.anInt6561 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BZI)V")
	public void method5193(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		this.method5267(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6564;
		arg0[3] = this.anInt6566;
		arg0[0] = this.anInt6573;
		arg0[2] = this.anInt6579;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V")
	public void method5194(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method5224(7681, 7681);
		} else if (arg0 == 0) {
			this.method5224(8448, 8448);
		} else if (arg0 == 2) {
			this.method5224(34165, 7681);
		} else if (arg0 == 3) {
			this.method5224(260, 8448);
		} else if (arg0 == 4) {
			this.method5224(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!jba;Lclient!jba;FLclient!jba;)Lclient!jba;")
	@Override
	public Class83 method6895(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class83 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean512 && this.aBoolean518) {
			@Pc(15) Class83_Sub2_Sub2 local15 = null;
			@Pc(18) Class83_Sub2 local18 = (Class83_Sub2) arg0;
			@Pc(21) Class83_Sub2 local21 = (Class83_Sub2) arg1;
			@Pc(25) Class40_Sub4 local25 = local18.method6437();
			@Pc(29) Class40_Sub4 local29 = local21.method6437();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local25.anInt7369 > local29.anInt7369 ? local25.anInt7369 : local29.anInt7369;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class83_Sub2_Sub2) {
					@Pc(56) Class83_Sub2_Sub2 local56 = (Class83_Sub2_Sub2) arg3;
					if (local44 == local56.method6440()) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class83_Sub2_Sub2(this, local44);
				}
				if (local15.method6438(arg2, local29, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "()Z")
	@Override
	public boolean method6897() {
		return this.aBoolean524 && (!this.method6917() || this.aBoolean522);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!dba;I)V")
	public void method5195(@OriginalArg(0) Interface6 arg0) {
		if (this.anInt6552 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6552 >= 0) {
			this.anInterface6Array1[this.anInt6552].method1969();
		}
		this.anInterface6_1 = this.anInterface6Array1[++this.anInt6552] = arg0;
		this.anInterface6_1.method1971();
	}

	@OriginalMember(owner = "client!ok", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class204_Sub1 local6 = (Class204_Sub1) arg1;
		@Pc(9) Class40_Sub3_Sub1 local9 = local6.aClass40_Sub3_Sub1_4;
		this.method5191();
		this.method5202(local6.aClass40_Sub3_Sub1_4);
		this.method5233(1);
		this.method5224(7681, 8448);
		this.method5200(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat161 / (float) local9.anInt6751;
		@Pc(46) float local46 = local9.aFloat162 / (float) local9.anInt6748;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt6573 - arg2) * local39, (float) (this.anInt6564 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt6573, this.anInt6564);
		OpenGL.glTexCoord2f((float) (this.anInt6573 - arg2) * local39, local46 * (float) (this.anInt6566 - arg3));
		OpenGL.glVertex2i(this.anInt6573, this.anInt6566);
		OpenGL.glTexCoord2f((float) (this.anInt6579 - arg2) * local39, local46 * (float) (this.anInt6566 - arg3));
		OpenGL.glVertex2i(this.anInt6579, this.anInt6566);
		OpenGL.glTexCoord2f((float) (this.anInt6579 - arg2) * local39, local46 * (float) (this.anInt6564 - arg3));
		OpenGL.glVertex2i(this.anInt6579, this.anInt6564);
		OpenGL.glEnd();
		this.method5200(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "(I)V")
	public void method5196() {
		if (this.anInt6561 == 16) {
			return;
		}
		this.method5234();
		this.method5236(true);
		this.method5268(true);
		this.method5231(true);
		this.method5233(1);
		this.anInt6561 = 16;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method6944();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V")
	public void method5197(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt6565) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt6565 = arg0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(FFFI)V")
	private void method5198(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean503) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg2, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean503 = true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!dba;)V")
	public void method5199(@OriginalArg(1) Interface6 arg0) {
		if (this.anInt6554 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt6554 >= 0) {
			this.anInterface6Array3[this.anInt6554].method1972();
		}
		this.anInterface6_2 = this.anInterface6Array3[++this.anInt6554] = arg0;
		this.anInterface6_2.method1967();
	}

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6920() {
		return this.aClass113_Sub2_3;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class22 method6970(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class22_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "()V")
	@Override
	public void method6898() {
		this.aClass238_1.method4840();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIBI)V")
	public void method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg2);
	}

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "(I)V")
	public void method5201() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!ip;)V")
	public void method5202(@OriginalArg(1) Class40 arg0) {
		@Pc(11) Class40 local11 = this.aClass40Array1[this.anInt6565];
		if (arg0 != local11) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt7362);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt7362);
				} else if (arg0.anInt7362 != local11.anInt7362) {
					OpenGL.glDisable(local11.anInt7362);
					OpenGL.glEnable(arg0.anInt7362);
				}
				OpenGL.glBindTexture(arg0.anInt7362, arg0.method5872());
			}
			this.aClass40Array1[this.anInt6565] = arg0;
		}
		this.anInt6561 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([I)V")
	@Override
	public void method6922(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6489;
		arg0[0] = this.anInt6392;
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "()Z")
	@Override
	public boolean method6906() {
		if (this.aClass1_Sub8_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass1_Sub8_Sub1_1.method595()) {
			if (!this.aClass238_1.method4844(this.aClass1_Sub8_Sub1_1)) {
				return false;
			}
			this.aClass237_1.method4833();
		}
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "()V")
	@Override
	public void method6934() {
		if (this.aClass1_Sub8_Sub1_1 != null && this.aClass1_Sub8_Sub1_1.method595()) {
			this.aClass238_1.method4845(this.aClass1_Sub8_Sub1_1);
			this.aClass237_1.method4833();
		}
	}

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "()Z")
	@Override
	public boolean method6952() {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method5233(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	public synchronized void method5203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg0);
		local8.aLong301 = arg1;
		this.aClass353_50.method7679(local8);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		@Pc(27) float local27 = local13 + (float) arg3 - 1.0F;
		this.method5243();
		this.method5233(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean524) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local27);
		OpenGL.glVertex2f(local20, local27);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean524) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	private void method5204() {
		if (this.aBoolean514 && !this.aBoolean507) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(II)I")
	public int method5205(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6937(@OriginalArg(0) Canvas arg0) {
		this.aCanvas12 = null;
		this.aLong207 = 0L;
		if (arg0 == null || this.aCanvas11 == arg0) {
			this.aLong207 = this.aLong206;
			this.aCanvas12 = this.aCanvas11;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable5.get(arg0);
			this.aLong207 = local36;
			this.aCanvas12 = arg0;
		}
		if (this.aCanvas12 == null || this.aLong207 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong207);
		this.method5210();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!hda;I)V")
	public void method5206(@OriginalArg(0) Class113_Sub2 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2598(), 0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
	public void method5207(@OriginalArg(1) int arg0) {
		this.method5193(true, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "()V")
	@Override
	protected void method6923() {
		for (@Pc(10) Class1 local10 = this.aClass353_47.method7677(); local10 != null; local10 = this.aClass353_47.method7687()) {
			((Class1_Sub5_Sub2) local10).method4656();
		}
		if (this.aClass238_1 != null) {
			this.aClass238_1.method4842();
		}
		if (this.anOpenGL2 != null) {
			this.method5260();
			@Pc(40) Enumeration local40 = this.aHashtable5.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable5.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean496) {
			Static13.method128(false, true);
			this.aBoolean496 = false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt6489 - local12 - arg1, arg2, 1, 32993, this.anInt6595, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IF)V")
	public void method5208(@OriginalArg(1) float arg0) {
		if (arg0 != this.aFloat156) {
			this.aFloat156 = arg0;
			if (this.anInt6593 == 3) {
				this.method5227();
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V")
	private void method5209() {
		if (this.anInt6593 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt6392 > 0 && this.anInt6489 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt6392, (double) this.anInt6489, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt6593 = 1;
		this.anInt6561 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(I)V")
	@Override
	public void method6966(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "()Z")
	@Override
	public boolean method6912() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "(I)V")
	private void method5210() {
		if (this.aCanvas12 == null) {
			this.anInt6412 = this.anInt6523 = 0;
		} else {
			@Pc(17) Dimension local17 = this.aCanvas12.getSize();
			this.anInt6412 = local17.width;
			this.anInt6523 = local17.height;
		}
		if (this.anInterface6_1 == null) {
			this.anInt6489 = this.anInt6523;
			this.anInt6392 = this.anInt6412;
			this.method5240();
		}
		this.method5225();
		this.JA();
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(II)I")
	public int method5211(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I")
	@Override
	public int method6915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!ok", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt6591;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6941(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static442.aFloat179 = arg0;
		Static588.aFloat211 = arg2;
		Static349.aFloat131 = arg1;
	}

	@OriginalMember(owner = "client!ok", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method5231(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!ok", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6566 > arg3) {
			this.anInt6566 = arg3;
		}
		if (arg0 > this.anInt6573) {
			this.anInt6573 = arg0;
		}
		if (this.anInt6564 < arg1) {
			this.anInt6564 = arg1;
		}
		if (this.anInt6579 > arg2) {
			this.anInt6579 = arg2;
		}
		OpenGL.glEnable(3089);
		this.method5241();
		this.method5216();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class22 method6950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class22_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!fg;Z)Lclient!f;")
	@Override
	public Class22 method6896(@OriginalArg(0) Class102 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt2624 * arg0.anInt2626];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray31 == null) {
			for (local21 = 0; local21 < arg0.anInt2626; local21++) {
				for (local25 = 0; local25 < arg0.anInt2624; local25++) {
					@Pc(38) int local38 = arg0.anIntArray224[arg0.aByteArray32[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt2626; local21++) {
				for (local25 = 0; local25 < arg0.anInt2624; local25++) {
					local12[local16++] = arg0.aByteArray31[local14] << 24 | arg0.anIntArray224[arg0.aByteArray32[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(126) Class22 local126 = this.method6970(local12, arg0.anInt2624, arg0.anInt2624, arg0.anInt2626);
		local126.Q(arg0.anInt2622, arg0.anInt2625, arg0.anInt2623, arg0.anInt2621);
		return local126;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass238_1.method4839(arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!vi;I)V")
	@Override
	public void method6947(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1) {
		this.aClass225_1.method4483(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(II)V")
	public synchronized void method5212(@OriginalArg(0) int arg0) {
		@Pc(7) Class1 local7 = new Class1();
		local7.aLong301 = arg0;
		this.aClass353_53.method7679(local7);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)V")
	private void method5213() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass113_Sub2_4.method2598(), 0);
		if (this.aBoolean521) {
			this.aClass171_1.aClass76_Sub6_1.method7065();
		}
		this.method5214();
		this.method5263();
	}

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "(I)V")
	public void method5214() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray40, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray39, 0);
	}

	@OriginalMember(owner = "client!ok", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt6582 && this.anInt6562 == arg1 && this.anInt6576 == arg2) {
			return;
		}
		this.anInt6582 = arg0;
		this.anInt6562 = arg1;
		this.anInt6576 = arg2;
		this.method5253();
		this.method5249();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)V")
	public void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6580 = arg0;
		this.anInt6592 = arg1;
		this.method5240();
		this.method5216();
	}

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "(I)V")
	private void method5216() {
		if (this.anInt6573 <= this.anInt6579 && this.anInt6564 <= this.anInt6566) {
			OpenGL.glScissor(this.anInt6573 + this.anInt6592, this.anInt6489 + this.anInt6580 + -this.anInt6566, this.anInt6579 - this.anInt6573, this.anInt6566 + -this.anInt6564);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(BI)V")
	public void method5217(@OriginalArg(1) int arg0) {
		Static159.aFloatArray7[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static159.aFloatArray7[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static159.aFloatArray7[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static159.aFloatArray7[3] = (float) (arg0 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static159.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)V")
	public void method5218(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean507) {
			this.aBoolean507 = arg0;
			this.method5204();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class204 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class204_Sub1 local6 = (Class204_Sub1) arg5;
		@Pc(9) Class40_Sub3_Sub1 local9 = local6.aClass40_Sub3_Sub1_4;
		this.method5191();
		this.method5202(local6.aClass40_Sub3_Sub1_4);
		this.method5233(1);
		this.method5224(7681, 8448);
		this.method5200(0, 34167, 768);
		@Pc(39) float local39 = local9.aFloat161 / (float) local9.anInt6751;
		@Pc(46) float local46 = local9.aFloat162 / (float) local9.anInt6748;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(59) float local59 = (float) -arg1 + (float) arg3;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local52 * local52 + local59 * local59)));
		@Pc(76) float local76 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(95) float local95 = local52 * local72;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local95 + 0.35F, (float) arg3 + local76 + 0.35F);
		OpenGL.glEnd();
		this.method5200(0, 5890, 768);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I")
	@Override
	public int method6967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 | arg0;
	}

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "()Lclient!is;")
	@Override
	public Class162 method6962() {
		@Pc(7) int local7 = -1;
		if (this.aString65.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString65.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString65.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class162(local7, "OpenGL", this.anInt6589, this.aString64, 0L);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIILclient!vu;I)V")
	public void method5219(@OriginalArg(1) int arg0, @OriginalArg(3) Interface23 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg1.method5063();
		@Pc(14) int local14 = arg0 * this.method5250(local7);
		this.method5235(arg1);
		OpenGL.glDrawElements(4, arg2, local7, (long) local14 + arg1.method5064());
	}

	@OriginalMember(owner = "client!ok", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt6585, this.anInt6568, this.anInt6567, this.anInt6583 };
	}

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "()V")
	@Override
	public void method6969() {
		if (!this.aBoolean501 || this.anInt6392 <= 0 || this.anInt6489 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt6573;
		@Pc(25) int local25 = this.anInt6579;
		@Pc(28) int local28 = this.anInt6564;
		@Pc(31) int local31 = this.anInt6566;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method5225();
		this.method5236(false);
		this.method5190(false);
		this.method5268(false);
		this.method5231(false);
		this.method5202(null);
		this.method5207(-2);
		this.method5194(1);
		this.method5233(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt6392, this.anInt6489, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lclient!hda;I)V")
	public void method5220(@OriginalArg(0) Class113_Sub2 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2598(), 0);
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "()Z")
	@Override
	public boolean method6905() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean515 = arg0;
		this.method5228();
	}

	@OriginalMember(owner = "client!ok", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean509) {
			throw new RuntimeException("");
		}
		this.anInt6578 = arg1;
		this.anInt6594 = arg2;
		this.anInt6570 = arg0;
		this.anInt6584 = arg3;
		if (this.aBoolean521) {
			this.aClass171_1.aClass76_Sub6_1.method7065();
			this.aClass171_1.aClass76_Sub6_1.method7061();
		}
	}

	@OriginalMember(owner = "client!ok", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt6392) {
			arg2 = this.anInt6392;
		}
		if (arg3 > this.anInt6489) {
			arg3 = this.anInt6489;
		}
		this.anInt6566 = arg3;
		this.anInt6564 = arg1;
		this.anInt6573 = arg0;
		this.anInt6579 = arg2;
		OpenGL.glEnable(3089);
		this.method5241();
		this.method5216();
	}

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "()Z")
	@Override
	public boolean method6917() {
		return this.aClass1_Sub8_Sub1_1 != null && this.aClass1_Sub8_Sub1_1.method595();
	}

	@OriginalMember(owner = "client!ok", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt6597;
		this.anInt6597 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)V")
	public synchronized void method5222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg1);
		local8.aLong301 = arg0;
		this.aClass353_52.method7679(local8);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	@Override
	public void method6961(@OriginalArg(0) int arg0) {
		this.method5260();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z[BIZI)Lclient!vu;")
	public Interface23 method5223(@OriginalArg(1) byte[] arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2) {
		return (Interface23) (this.aBoolean523 && (!arg1 || this.aBoolean502) ? new Class130_Sub1(this, 5123, arg0, arg2, arg1) : new Class167_Sub1(this, 5123, arg0, arg2));
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)V")
	public void method5224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6565 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(21) boolean local21 = false;
		if (arg0 != this.anInt6569) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			this.anInt6569 = arg0;
			local21 = true;
		}
		if (this.anInt6577 != arg1) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			local21 = true;
			this.anInt6577 = arg1;
		}
		if (local21) {
			this.anInt6561 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "(I)V")
	public void method5225() {
		if (this.anInt6593 != 0) {
			this.anInt6561 &= 0xFFFFFFE0;
			this.anInt6593 = 0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V")
	public void method5226() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6963() {
		return this.aClass113_Sub2_1;
	}

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method5243();
		this.method5233(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean524) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean524) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "(I)V")
	private void method5227() {
		@Pc(15) float local15 = (float) -this.anInt6585 * this.aFloat156 / (float) this.anInt6567;
		@Pc(27) float local27 = (float) -this.anInt6568 * this.aFloat156 / (float) this.anInt6583;
		@Pc(42) float local42 = (float) (this.anInt6392 - this.anInt6585) * this.aFloat156 / (float) this.anInt6567;
		@Pc(57) float local57 = this.aFloat156 * (float) (this.anInt6489 - this.anInt6568) / (float) this.anInt6583;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt6591, (double) this.anInt6586);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ok", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg0 * this.aClass113_Sub2_3.aFloat63 + (float) arg1 * this.aClass113_Sub2_3.aFloat71 + this.aClass113_Sub2_3.aFloat64 * (float) arg2 + this.aClass113_Sub2_3.aFloat69;
		if (local28 < (float) this.anInt6591 || (float) this.anInt6586 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass113_Sub2_3.aFloat68 + (float) arg2 * this.aClass113_Sub2_3.aFloat72 + this.aClass113_Sub2_3.aFloat67 * (float) arg0 + (float) arg1 * this.aClass113_Sub2_3.aFloat70) * (float) this.anInt6567 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt6583 * (this.aClass113_Sub2_3.aFloat62 + (float) arg1 * this.aClass113_Sub2_3.aFloat66 + (float) arg0 * this.aClass113_Sub2_3.aFloat65 + (float) arg2 * this.aClass113_Sub2_3.aFloat73) / local28);
		if ((float) local85 >= this.aFloat151 && this.aFloat146 >= (float) local85 && this.aFloat155 <= (float) local117 && this.aFloat140 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat151);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat155);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "()Lclient!q;")
	@Override
	public Class113 method6924() {
		return new Class113_Sub2();
	}

	@OriginalMember(owner = "client!ok", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt6572;
		if (local11 || this.aFloat141 != arg1 || arg2 != this.aFloat144) {
			this.aFloat144 = arg2;
			this.anInt6572 = arg0;
			this.aFloat141 = arg1;
			if (local11) {
				this.aFloat152 = (float) (this.anInt6572 & 0xFF) / 255.0F;
				this.aFloat149 = (float) (this.anInt6572 & 0xFF00) / 65280.0F;
				this.aFloat138 = (float) (this.anInt6572 & 0xFF0000) / 1.671168E7F;
				this.method5261();
			}
			this.method5274();
		}
		if (arg3 == this.aFloatArray38[0] && this.aFloatArray38[1] == arg4 && arg5 == this.aFloatArray38[2]) {
			return;
		}
		this.aFloatArray38[2] = arg5;
		this.aFloatArray38[0] = arg3;
		this.aFloatArray38[1] = arg4;
		this.aFloatArray42[0] = -arg3;
		this.aFloatArray42[2] = -arg5;
		this.aFloatArray42[1] = -arg4;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray40[0] = arg3 * local138;
		this.aFloatArray40[2] = local138 * arg5;
		this.aFloatArray40[1] = local138 * arg4;
		this.aFloatArray39[0] = -this.aFloatArray40[0];
		this.aFloatArray39[1] = -this.aFloatArray40[1];
		this.aFloatArray39[2] = -this.aFloatArray40[2];
		this.method5214();
		this.anInt6587 = (int) (arg3 * 256.0F / arg4);
		this.anInt6588 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "(I)V")
	private void method5228() {
		OpenGL.glDepthMask(this.aBoolean497 && this.aBoolean515);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(IIII)V")
	public void method5229(@OriginalArg(2) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IIBZ)Lclient!cd;")
	public Interface5 method5230(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (Interface5) (this.aBoolean523 ? new Class130_Sub2(this, arg2, arg0, arg1, false) : new Class167_Sub2(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass113_Sub2_3.aFloat71 * (float) arg1 + this.aClass113_Sub2_3.aFloat63 * (float) arg0 + (float) arg2 * this.aClass113_Sub2_3.aFloat64 + this.aClass113_Sub2_3.aFloat69;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass113_Sub2_3.aFloat63 * (float) arg3 + (float) arg4 * this.aClass113_Sub2_3.aFloat71 + (float) arg5 * this.aClass113_Sub2_3.aFloat64 + this.aClass113_Sub2_3.aFloat69;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt6591 && local59 < (float) this.anInt6591 || !(!(local28 > (float) this.anInt6586) || !(local59 > (float) this.anInt6586))) {
			return false;
		}
		@Pc(123) int local123 = (int) (((float) arg2 * this.aClass113_Sub2_3.aFloat72 + this.aClass113_Sub2_3.aFloat70 * (float) arg1 + (float) arg0 * this.aClass113_Sub2_3.aFloat67 + this.aClass113_Sub2_3.aFloat68) * (float) this.anInt6567 / local28);
		@Pc(155) int local155 = (int) ((this.aClass113_Sub2_3.aFloat67 * (float) arg3 + (float) arg4 * this.aClass113_Sub2_3.aFloat70 + (float) arg5 * this.aClass113_Sub2_3.aFloat72 + this.aClass113_Sub2_3.aFloat68) * (float) this.anInt6567 / local59);
		if (this.aFloat151 > (float) local123 && (float) local155 < this.aFloat151 || (float) local123 > this.aFloat146 && (float) local155 > this.aFloat146) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass113_Sub2_3.aFloat73 * (float) arg2 + this.aClass113_Sub2_3.aFloat66 * (float) arg1 + this.aClass113_Sub2_3.aFloat65 * (float) arg0 + this.aClass113_Sub2_3.aFloat62) * (float) this.anInt6583 / local28);
			@Pc(245) int local245 = (int) ((this.aClass113_Sub2_3.aFloat62 + (float) arg5 * this.aClass113_Sub2_3.aFloat73 + this.aClass113_Sub2_3.aFloat66 * (float) arg4 + this.aClass113_Sub2_3.aFloat65 * (float) arg3) * (float) this.anInt6583 / local59);
			return (!(this.aFloat155 > (float) local213) || !((float) local245 < this.aFloat155)) && (!((float) local213 > this.aFloat140) || !(this.aFloat140 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!ok", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt6550 = 0;
		while (arg0 > 1) {
			this.anInt6550++;
			arg0 >>= 0x1;
		}
		this.anInt6549 = 0x1 << this.anInt6550;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!vi;)V")
	@Override
	public void method6940(@OriginalArg(0) Class343 arg0) {
		this.aClass225_1.method4483(arg0, this, -1);
	}

	@OriginalMember(owner = "client!ok", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6591 == arg0 && this.anInt6586 == arg1) {
			return;
		}
		this.anInt6586 = arg1;
		this.anInt6591 = arg0;
		this.method5254();
		this.method5253();
		if (this.anInt6593 == 3) {
			this.method5227();
			return;
		}
		if (this.anInt6593 != 2) {
			return;
		}
		this.method5265();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(IZ)V")
	public void method5231(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean497) {
			this.aBoolean497 = arg0;
			this.method5228();
			this.anInt6561 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub5 method6964(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub2 local8 = new Class1_Sub5_Sub2(arg0);
		this.aClass353_47.method7679(local8);
		return local8;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6930(@OriginalArg(0) Class22 arg0) {
		this.aClass22_Sub3_1 = (Class22_Sub3) arg0;
		@Pc(81) Class1_Sub6 local81;
		if (this.aBoolean518) {
			if (this.aClass98_6 == null) {
				this.aClass98_6 = new Class98(this);
			}
			if (this.aClass98_6 == this.anInterface6_1) {
				throw new RuntimeException();
			}
			this.method5275(this.aClass98_6);
			@Pc(53) Class1_Sub6_Sub3 local53 = (Class1_Sub6_Sub3) this.aClass187_29.method3797((long) (this.aClass22_Sub3_1.E() << 16 | this.aClass22_Sub3_1.u()));
			if (local53 == null) {
				local53 = new Class1_Sub6_Sub3(this, 6402, this.aClass22_Sub3_1.E(), this.aClass22_Sub3_1.u());
				@Pc(86) Class1_Sub6_Sub3 local86;
				for (this.anInt6556 += local53.anInt2057; this.anInt6556 > 2097152; this.anInt6556 -= local86.anInt2057) {
					local81 = this.aClass125_10.method2422();
					if (local81 == null) {
						break;
					}
					local86 = (Class1_Sub6_Sub3) local81;
					local86.method7811();
					local86.method7859();
					local86.method1682();
				}
				this.aClass187_29.method3795(local53, (long) (this.aClass22_Sub3_1.E() << 16 | this.aClass22_Sub3_1.u()));
			}
			this.aClass125_10.method2424(local53);
			this.aClass98_6.method1984(8, local53);
			this.aClass98_6.method1981(this.aClass22_Sub3_1.aClass40_Sub3_Sub1_1, 0);
		} else if (this.aBoolean506) {
			@Pc(169) Class1_Sub6_Sub19 local169 = (Class1_Sub6_Sub19) this.aClass187_29.method3797((long) (this.aClass22_Sub3_1.E() << 16 | this.aClass22_Sub3_1.u()));
			if (local169 == null) {
				local169 = new Class1_Sub6_Sub19(this, this.aClass22_Sub3_1.E(), this.aClass22_Sub3_1.u());
				@Pc(203) Class1_Sub6_Sub19 local203;
				for (this.anInt6556 += local169.anInt9579 * 4; this.anInt6556 > 2097152; this.anInt6556 -= local203.anInt9579) {
					local81 = this.aClass125_10.method2422();
					if (local81 == null) {
						break;
					}
					local203 = (Class1_Sub6_Sub19) local81;
					local203.method7811();
					local203.method7859();
					this.anOpenGL2.releasePbuffer(local203.method7818());
				}
				this.aClass187_29.method3795(local169, (long) (this.aClass22_Sub3_1.E() << 16 | this.aClass22_Sub3_1.u()));
			}
			this.aClass125_10.method2424(local169);
			this.anOpenGL2.setPbuffer(local169.method7818());
		} else {
			throw new RuntimeException("");
		}
		this.anInt6392 = arg0.E();
		this.anInt6489 = arg0.u();
		this.method5225();
		this.method5240();
		this.JA();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!jba;)V")
	@Override
	public void method6913(@OriginalArg(0) Class83 arg0) {
		this.aClass83_Sub2_1 = (Class83_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6946(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas11 == arg0) {
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
			@Pc(53) long local53 = this.anOpenGL2.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable5.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(II)V")
	public void method5233(@OriginalArg(1) int arg0) {
		if (this.anInt6560 == arg0) {
			return;
		}
		@Pc(27) boolean local27;
		@Pc(29) byte local29;
		if (arg0 == 1) {
			local29 = 1;
			local27 = true;
		} else if (arg0 == 2) {
			local27 = false;
			local29 = 2;
		} else if (arg0 == 128) {
			local27 = true;
			local29 = 3;
		} else {
			local29 = 0;
			local27 = false;
		}
		if (!this.aBoolean500) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean500 = true;
		}
		if (this.aBoolean498 != local27) {
			if (local27) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean498 = local27;
		}
		if (this.anInt6559 != local29) {
			if (local29 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local29 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local29 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt6559 = local29;
		}
		this.anInt6560 = arg0;
		this.anInt6561 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "(I)V")
	private void method5234() {
		if (this.anInt6593 != 3) {
			this.anInt6593 = 3;
			this.method5227();
			this.method5213();
			this.anInt6561 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!ok", name = "q", descriptor = "()Z")
	@Override
	public boolean method6936() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!vu;I)V")
	public void method5235(@OriginalArg(0) Interface23 arg0) {
		if (this.anInterface23_2 != arg0) {
			if (this.aBoolean523) {
				OpenGL.glBindBufferARB(34963, arg0.method5062());
			}
			this.anInterface23_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZZ)V")
	public void method5236(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean508) {
			this.aBoolean508 = arg0;
			this.method5249();
			this.anInt6561 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6568 = arg1;
		this.anInt6585 = arg0;
		this.anInt6583 = arg3;
		this.anInt6567 = arg2;
		this.method5254();
		this.method5241();
		if (this.anInt6593 == 3) {
			this.method5227();
		} else if (this.anInt6593 == 2) {
			this.method5265();
		}
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(B)V")
	public void method5237() {
		if (this.anInt6561 == 4) {
			return;
		}
		this.method5209();
		this.method5236(false);
		this.method5190(false);
		this.method5268(false);
		this.method5231(false);
		this.method5207(-2);
		this.method5233(1);
		this.anInt6561 = 4;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class47 method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class47_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!ok", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5243();
		this.method5233(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6909(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas11) {
			local5 = this.aLong206;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable5.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas12) {
			this.method5210();
		}
	}

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "(I)V")
	private void method5239() {
		if (this.aBoolean503) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean503 = false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "(I)V")
	private void method5240() {
		OpenGL.glViewport(this.anInt6592, this.anInt6580, this.anInt6392, this.anInt6489);
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(B)V")
	private void method5241() {
		this.aFloat151 = this.anInt6573 - this.anInt6585;
		this.aFloat146 = this.anInt6579 - this.anInt6585;
		this.aFloat155 = this.anInt6564 - this.anInt6568;
		this.aFloat140 = this.anInt6566 - this.anInt6568;
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(B)V")
	private void method5243() {
		if (this.anInt6561 == 1) {
			return;
		}
		this.method5209();
		this.method5236(false);
		this.method5190(false);
		this.method5268(false);
		this.method5231(false);
		this.method5202(null);
		this.method5207(-2);
		this.method5194(1);
		this.anInt6561 = 1;
	}

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "()Z")
	@Override
	public boolean method6951() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class22 method6918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class22_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class204 method6945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static517.method7879(arg2, arg1, arg3, this, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "()Z")
	@Override
	public boolean method6968() {
		return this.aClass171_1.method3628();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!dba;Z)V")
	public void method5244(@OriginalArg(0) Interface6 arg0) {
		if (this.anInt6554 < 0 || this.anInterface6Array3[this.anInt6554] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface6Array3[this.anInt6554--] = null;
		arg0.method1972();
		if (this.anInt6554 >= 0) {
			this.anInterface6_2 = this.anInterface6Array3[this.anInt6554];
			this.anInterface6_2.method1967();
		} else {
			this.anInterface6_2 = null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!cd;)V")
	public void method5245(@OriginalArg(1) Interface5 arg0) {
		if (this.anInterface5_4 != arg0) {
			if (this.aBoolean523) {
				OpenGL.glBindBufferARB(34962, arg0.method7485());
			}
			this.anInterface5_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(IIB)V")
	public synchronized void method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub13 local14 = new Class1_Sub13(arg0);
		local14.aLong301 = arg1;
		this.aClass353_49.method7679(local14);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(FZFFF)V")
	public void method5247(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		Static159.aFloatArray7[0] = arg1;
		Static159.aFloatArray7[1] = arg0;
		Static159.aFloatArray7[3] = arg2;
		Static159.aFloatArray7[2] = arg3;
		OpenGL.glTexEnvfv(8960, 8705, Static159.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "()Z")
	@Override
	public boolean method6900() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6901(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas11) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable5.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZJ)V")
	public synchronized void method5248(@OriginalArg(1) long arg0) {
		@Pc(14) Class1 local14 = new Class1();
		local14.aLong301 = arg0;
		this.aClass353_54.method7679(local14);
	}

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "(I)V")
	private void method5249() {
		if (this.aBoolean508 && this.anInt6562 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt6558 + this.anInt6555 + this.anInt6557;
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(II)I")
	public int method5250(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "(II)V")
	public synchronized void method5251(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub13 local8 = new Class1_Sub13(arg0);
		this.aClass353_51.method7679(local8);
	}

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "(I)V")
	private void method5252() {
		this.aClass40Array1 = new Class40[this.anInt6571];
		this.aClass40_Sub3_4 = new Class40_Sub3(this, 3553, 6408, 1, 1);
		new Class40_Sub3(this, 3553, 6408, 1, 1);
		new Class40_Sub3(this, 3553, 6408, 1, 1);
		this.aClass63_Sub3_4 = new Class63_Sub3(this);
		this.aClass63_Sub3_8 = new Class63_Sub3(this);
		this.aClass63_Sub3_3 = new Class63_Sub3(this);
		this.aClass63_Sub3_6 = new Class63_Sub3(this);
		this.aClass63_Sub3_1 = new Class63_Sub3(this);
		this.aClass63_Sub3_7 = new Class63_Sub3(this);
		this.aClass63_Sub3_10 = new Class63_Sub3(this);
		this.aClass63_Sub3_2 = new Class63_Sub3(this);
		this.aClass63_Sub3_9 = new Class63_Sub3(this);
		this.aClass63_Sub3_5 = new Class63_Sub3(this);
		if (this.aBoolean518) {
			this.aClass98_7 = new Class98(this);
			new Class98(this);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII)Lclient!jba;")
	@Override
	public Class83 method6911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean512 ? new Class83_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "()V")
	@Override
	public void method6904() {
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(Z)V")
	private void method5253() {
		this.aFloat142 = (float) (this.anInt6586 - this.anInt6576) - this.aFloat153;
		this.aFloat148 = this.aFloat142 - this.aFloat147 * (float) this.anInt6562;
		if ((float) this.anInt6591 > this.aFloat148) {
			this.aFloat148 = this.anInt6591;
		}
		OpenGL.glFogf(2915, this.aFloat148);
		OpenGL.glFogf(2916, this.aFloat142);
		Static159.aFloatArray7[0] = (float) (this.anInt6582 & 0xFF0000) / 1.671168E7F;
		Static159.aFloatArray7[1] = (float) (this.anInt6582 & 0xFF00) / 65280.0F;
		Static159.aFloatArray7[2] = (float) (this.anInt6582 & 0xFF) / 255.0F;
		OpenGL.glFogfv(2918, Static159.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "(B)V")
	private void method5254() {
		@Pc(6) float[] local6 = this.aFloatArray41;
		@Pc(26) float local26 = (float) (this.anInt6591 * -this.anInt6585) / (float) this.anInt6567;
		@Pc(41) float local41 = (float) ((this.anInt6392 - this.anInt6585) * this.anInt6591) / (float) this.anInt6567;
		@Pc(52) float local52 = (float) (this.anInt6591 * this.anInt6568) / (float) this.anInt6583;
		@Pc(67) float local67 = (float) ((this.anInt6568 - this.anInt6489) * this.anInt6591) / (float) this.anInt6583;
		if (local26 == local41 || local67 == local52) {
			local6[12] = 0.0F;
			local6[5] = 1.0F;
			local6[2] = 0.0F;
			local6[15] = 1.0F;
			local6[7] = 0.0F;
			local6[6] = 0.0F;
			local6[14] = 0.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[0] = 1.0F;
			local6[10] = 1.0F;
			local6[9] = 0.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[8] = 0.0F;
		} else {
			@Pc(81) float local81 = (float) this.anInt6591 * 2.0F;
			local6[3] = 0.0F;
			local6[15] = 0.0F;
			local6[2] = 0.0F;
			local6[4] = 0.0F;
			local6[1] = 0.0F;
			local6[13] = 0.0F;
			local6[6] = 0.0F;
			local6[11] = -1.0F;
			local6[0] = local81 / (local41 - local26);
			local6[8] = (local26 + local41) / (local41 - local26);
			local6[5] = local81 / (local52 - local67);
			local6[9] = (local67 + local52) / (local52 - local67);
			local6[10] = this.aFloat143 = (float) -(this.anInt6586 + this.anInt6591) / (float) (this.anInt6586 - this.anInt6591);
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[14] = this.aFloat150 = -((float) this.anInt6586 * local81) / (float) (this.anInt6586 - this.anInt6591);
		}
		this.method5273();
	}

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "(I)I")
	private int method5256() {
		this.aString65 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString64 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString65.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString65.indexOf("brian paul") != -1 || this.aString65.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static500.method7455(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(69) int local69 = Static21.method7701(local53[0]);
				@Pc(77) int local77 = Static21.method7701(local53[1]);
				this.anInt6589 = local69 * 10 + local77;
			} catch (@Pc(86) NumberFormatException local86) {
				local10 |= 0x4;
			}
		}
		if (this.anInt6589 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(120) int[] local120 = new int[1];
		OpenGL.glGetIntegerv(34018, local120, 0);
		this.anInt6571 = local120[0];
		OpenGL.glGetIntegerv(34929, local120, 0);
		this.anInt6581 = local120[0];
		OpenGL.glGetIntegerv(34930, local120, 0);
		this.anInt6590 = local120[0];
		if (this.anInt6571 < 2 || this.anInt6581 < 2 || this.anInt6590 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean517 = Stream.c();
		this.aBoolean506 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean523 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean524 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean511 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean510 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean504 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean513 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean505 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean512 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean520 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean519 = false;
		this.aBoolean518 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean525 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean526 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean522 = this.aBoolean526 & this.aBoolean525;
		OpenGL.glGetFloatv(2834, Static159.aFloatArray7, 0);
		this.aFloat139 = Static159.aFloatArray7[1];
		this.aFloat154 = Static159.aFloatArray7[0];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(FBF)V")
	public void method5257(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat153 = arg1;
		this.aFloat147 = arg0;
		this.method5253();
	}

	@OriginalMember(owner = "client!ok", name = "x", descriptor = "(I)V")
	public void method5258() {
		if (this.anInt6561 == 8) {
			return;
		}
		this.method5192();
		this.method5236(true);
		this.method5268(true);
		this.method5231(true);
		this.method5233(1);
		this.anInt6561 = 8;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLclient!lq;Lclient!lq;Lclient!lq;Lclient!lq;)V")
	public void method5259(@OriginalArg(1) Class213 arg0, @OriginalArg(2) Class213 arg1, @OriginalArg(3) Class213 arg2, @OriginalArg(4) Class213 arg3) {
		if (arg3 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method5245(arg3.anInterface5_1);
			OpenGL.glVertexPointer(arg3.aByte83, arg3.aShort70, this.anInterface5_4.method7486(), this.anInterface5_4.method7487() + (long) arg3.aByte82);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method5245(arg1.anInterface5_1);
			OpenGL.glNormalPointer(arg1.aShort70, this.anInterface5_4.method7486(), this.anInterface5_4.method7487() + (long) arg1.aByte82);
			OpenGL.glEnableClientState(32885);
		}
		if (arg2 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method5245(arg2.anInterface5_1);
			OpenGL.glColorPointer(arg2.aByte83, arg2.aShort70, this.anInterface5_4.method7486(), this.anInterface5_4.method7487() + (long) arg2.aByte82);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method5245(arg0.anInterface5_1);
			OpenGL.glTexCoordPointer(arg0.aByte83, arg0.aShort70, this.anInterface5_4.method7486(), this.anInterface5_4.method7487() + (long) arg0.aByte82);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "(B)V")
	private void method5260() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "(B)V")
	private void method5261() {
		Static159.aFloatArray7[2] = this.aFloat157 * this.aFloat152;
		Static159.aFloatArray7[1] = this.aFloat157 * this.aFloat149;
		Static159.aFloatArray7[3] = 1.0F;
		Static159.aFloatArray7[0] = this.aFloat138 * this.aFloat157;
		OpenGL.glLightModelfv(2899, Static159.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILclient!dba;)V")
	public void method5262(@OriginalArg(1) Interface6 arg0) {
		if (this.aBoolean525) {
			this.method5244(arg0);
			this.method5269(arg0);
		} else if (this.anInt6553 >= 0 && this.anInterface6Array2[this.anInt6553] == arg0) {
			this.anInterface6Array2[this.anInt6553--] = null;
			arg0.method1968();
			if (this.anInt6553 >= 0) {
				this.anInterface6_2 = this.anInterface6_1 = this.anInterface6Array2[this.anInt6553];
				this.anInterface6_2.method1970();
			} else {
				this.anInterface6_2 = this.anInterface6_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6925(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & Integer.MAX_VALUE;
		@Pc(11) int local11 = 0;
		@Pc(19) Class1_Sub13 local19;
		while (!this.aClass353_49.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_49.method7688();
			Static579.anIntArray684[local11++] = (int) local19.aLong301;
			this.anInt6557 -= local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteBuffersARB(local11, Static579.anIntArray684, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteBuffersARB(local11, Static579.anIntArray684, 0);
			local11 = 0;
		}
		while (!this.aClass353_50.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_50.method7688();
			Static579.anIntArray684[local11++] = (int) local19.aLong301;
			this.anInt6555 -= local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteTextures(local11, Static579.anIntArray684, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteTextures(local11, Static579.anIntArray684, 0);
			local11 = 0;
		}
		while (!this.aClass353_51.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_51.method7688();
			Static579.anIntArray684[local11++] = local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local11, Static579.anIntArray684, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local11, Static579.anIntArray684, 0);
			local11 = 0;
		}
		while (!this.aClass353_52.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_52.method7688();
			Static579.anIntArray684[local11++] = (int) local19.aLong301;
			this.anInt6558 -= local19.anInt1812;
			if (local11 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local11, Static579.anIntArray684, 0);
				local11 = 0;
			}
		}
		if (local11 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local11, Static579.anIntArray684, 0);
		}
		while (!this.aClass353_48.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_48.method7688();
			OpenGL.glDeleteLists((int) local19.aLong301, local19.anInt1812);
		}
		@Pc(216) Class1 local216;
		while (!this.aClass353_53.method7686()) {
			local216 = this.aClass353_53.method7688();
			OpenGL.glDeleteProgramARB((int) local216.aLong301);
		}
		while (!this.aClass353_54.method7686()) {
			local216 = this.aClass353_54.method7688();
			OpenGL.glDeleteObjectARB(local216.aLong301);
		}
		while (!this.aClass353_48.method7686()) {
			local19 = (Class1_Sub13) this.aClass353_48.method7688();
			OpenGL.glDeleteLists((int) local19.aLong301, local19.anInt1812);
		}
		this.aClass237_1.method4836();
		if (this.b() > 100663296 && Static413.method5668() > this.aLong208 + 60000L) {
			System.gc();
			this.aLong208 = Static413.method5668();
		}
		this.anInt6551 = local9;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!uq;[Lclient!fg;Z)Lclient!la;")
	@Override
	public Class64 method6899(@OriginalArg(0) Class334 arg0, @OriginalArg(1) Class102[] arg1) {
		return new Class64_Sub2(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "()V")
	@Override
	public void method6944() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "(I)V")
	private void method5263() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt6575; local7++) {
			@Pc(14) Class1_Sub18 local14 = this.aClass1_Sub18Array5[local7];
			Static50.aFloatArray2[0] = local14.method4107();
			@Pc(25) int local25 = local7 + 16386;
			Static50.aFloatArray2[1] = local14.method4101();
			Static50.aFloatArray2[2] = local14.method4098();
			Static50.aFloatArray2[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static50.aFloatArray2, 0);
			@Pc(52) int local52 = local14.method4102();
			@Pc(60) float local60 = local14.method4099() / 255.0F;
			Static50.aFloatArray2[1] = (float) (local52 >> 8 & 0xFF) * local60;
			Static50.aFloatArray2[0] = local60 * (float) (local52 >> 16 & 0xFF);
			Static50.aFloatArray2[2] = (float) (local52 & 0xFF) * local60;
			OpenGL.glLightfv(local25, 4609, Static50.aFloatArray2, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method4104() * local14.method4104()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt6563) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt6563 = this.anInt6575;
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg0 + arg2 < this.anInt6573 || arg0 - arg2 > this.anInt6579 || this.anInt6564 > arg2 + arg1 || arg1 - arg2 > this.anInt6566) {
			return;
		}
		this.method5243();
		this.method5233(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(77) float local77 = (float) arg0 + 0.35F;
		@Pc(82) float local82 = (float) arg1 + 0.35F;
		@Pc(86) int local86 = arg2 << 1;
		if (this.aFloat154 > (float) local86) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local77 + 1.0F, local82 + 1.0F);
			OpenGL.glVertex2f(local77 + 1.0F, local82 - 1.0F);
			OpenGL.glVertex2f(local77 - 1.0F, -1.0F + local82);
			OpenGL.glVertex2f(local77 - 1.0F, local82 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat139 >= (float) local86) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local86);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local77, local82);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local77, local82);
			@Pc(155) int local155 = 262144 / (arg2 * 6);
			if (local155 <= 64) {
				local155 = 64;
			} else if (local155 > 512) {
				local155 = 512;
			}
			local155 = Static558.method7589(local155);
			OpenGL.glVertex2f(local77 + (float) arg2, local82);
			for (@Pc(184) int local184 = 16384 - local155; local184 > 0; local184 -= local155) {
				OpenGL.glVertex2f(local77 + Class243.aFloatArray34[local184] * (float) arg2, Class243.aFloatArray33[local184] * (float) arg2 + local82);
			}
			OpenGL.glVertex2f(local77 + (float) arg2, local82);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!lm;IIII)Lclient!da;")
	@Override
	public Class63 method6910(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class63_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "(I)V")
	private void method5264() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.b()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static391.method5400(1000L);
		}
	}

	@OriginalMember(owner = "client!ok", name = "A", descriptor = "(I)V")
	private void method5265() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray41, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ok", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6584 = arg3;
		this.anInt6578 = arg1;
		this.anInt6570 = arg0;
		this.aBoolean509 = true;
		this.anInt6594 = arg2;
	}

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "(B)V")
	private void method5266() {
		this.method5207(-2);
		for (@Pc(14) int local14 = this.anInt6571 - 1; local14 >= 0; local14--) {
			this.method5197(local14);
			this.method5202(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method5224(8448, 8448);
		this.method5200(2, 34168, 770);
		this.method5239();
		this.anInt6560 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt6559 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean498 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean500 = true;
		this.method5236(true);
		this.method5190(true);
		this.method5268(true);
		this.method5231(true);
		this.method5225();
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
		@Pc(127) float[] local127 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(129) int local129 = 0; local129 < 8; local129++) {
			@Pc(136) int local136 = local129 + 16384;
			OpenGL.glLightfv(local136, 4608, local127, 0);
			OpenGL.glLightf(local136, 4615, 0.0F);
			OpenGL.glLightf(local136, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt6572 = this.anInt6582 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIZ)V")
	public void method5267(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt6574 || this.aBoolean521 != this.aBoolean509) {
			@Pc(20) Class40_Sub3 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean509 ? 3 : 0;
			if (arg1 < 0) {
				this.method5239();
			} else {
				local20 = this.aClass237_1.method4834(arg1);
				@Pc(54) Class3 local54 = super.anInterface7_10.method3874(arg1);
				if (local54.aByte6 == 0 && local54.aByte3 == 0) {
					this.method5239();
				} else {
					@Pc(67) int local67 = local54.aBoolean13 ? 64 : 128;
					@Pc(71) int local71 = local67 * 50;
					this.method5198((float) (this.anInt6551 % local71 * local54.aByte6) / (float) local71, 0.0F, (float) (local54.aByte3 * (this.anInt6551 % local71)) / (float) local71);
				}
				if (!this.aBoolean509) {
					local26 = local54.anInt55;
					local33 = local54.aByte7;
					local24 = local54.aByte1;
				}
				local22 = local54.anInt54;
			}
			this.aClass171_1.method3630(arg2, arg0, local33, local26, local24);
			if (!this.aClass171_1.method3632(local20, local22)) {
				this.method5202(local20);
				this.method5194(local22);
			}
			this.anInt6574 = arg1;
			this.aBoolean521 = this.aBoolean509;
		}
		this.anInt6561 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIF)Lclient!rc;")
	@Override
	public Class1_Sub18 method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class1_Sub18_Sub2(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ok", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt6586;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(ZI)V")
	public void method5268(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean499) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean499 = arg0;
		this.anInt6561 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "()V")
	@Override
	public void method6971() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!ok", name = "u", descriptor = "()Z")
	@Override
	public boolean method6954() {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(Z)V")
	@Override
	public void method6942(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(ILclient!dba;)V")
	public void method5269(@OriginalArg(1) Interface6 arg0) {
		if (this.anInt6552 < 0 || arg0 != this.anInterface6Array1[this.anInt6552]) {
			throw new RuntimeException();
		}
		this.anInterface6Array1[this.anInt6552--] = null;
		arg0.method1969();
		if (this.anInt6552 < 0) {
			this.anInterface6_1 = null;
		} else {
			this.anInterface6_1 = this.anInterface6Array1[this.anInt6552];
			this.anInterface6_1.method1971();
		}
	}

	@OriginalMember(owner = "client!ok", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt6564 = 0;
		this.anInt6579 = this.anInt6392;
		this.anInt6573 = 0;
		this.anInt6566 = this.anInt6489;
		OpenGL.glDisable(3089);
		this.method5241();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[Lclient!rc;)V")
	@Override
	public void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass1_Sub18Array5[local7] = arg1[local7];
		}
		this.anInt6575 = arg0;
		if (this.anInt6593 != 1) {
			this.method5263();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIZ[B)Lclient!cd;")
	public Interface5 method5270(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface5) (this.aBoolean523 && (!arg0 || this.aBoolean502) ? new Class130_Sub2(this, arg2, arg3, arg1, arg0) : new Class167_Sub2(this, arg2, arg3, arg1));
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
	@Override
	public void method6903(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ok", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean509 = false;
	}

	@OriginalMember(owner = "client!ok", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt6596;
		this.anInt6596 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!ok", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass113_Sub2_3.aFloat71 + (float) arg0 * this.aClass113_Sub2_3.aFloat63 + this.aClass113_Sub2_3.aFloat64 * (float) arg2 + this.aClass113_Sub2_3.aFloat69;
		if ((float) this.anInt6591 > local28 || local28 > (float) this.anInt6586) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt6567 * (this.aClass113_Sub2_3.aFloat68 + this.aClass113_Sub2_3.aFloat72 * (float) arg2 + this.aClass113_Sub2_3.aFloat70 * (float) arg1 + (float) arg0 * this.aClass113_Sub2_3.aFloat67) / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat151);
		@Pc(126) int local126 = (int) ((this.aClass113_Sub2_3.aFloat73 * (float) arg2 + this.aClass113_Sub2_3.aFloat66 * (float) arg1 + this.aClass113_Sub2_3.aFloat65 * (float) arg0 + this.aClass113_Sub2_3.aFloat62) * (float) this.anInt6583 / local28);
		arg3[1] = (int) ((float) local126 - this.aFloat155);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBII)V")
	public void method5271(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "(I)V")
	private void method5273() {
		this.aFloatArray41[14] = this.aFloat150;
		this.aFloatArray41[10] = this.aFloat143;
		this.aFloat158 = this.anInt6586;
		this.aFloat145 = (this.aFloatArray41[14] - (float) this.anInt6586) / this.aFloatArray41[10];
	}

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "(I)V")
	private void method5274() {
		Static159.aFloatArray7[1] = this.aFloat149 * this.aFloat141;
		Static159.aFloatArray7[2] = this.aFloat152 * this.aFloat141;
		Static159.aFloatArray7[0] = this.aFloat141 * this.aFloat138;
		Static159.aFloatArray7[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, Static159.aFloatArray7, 0);
		Static159.aFloatArray7[3] = 1.0F;
		Static159.aFloatArray7[2] = this.aFloat152 * -this.aFloat144;
		Static159.aFloatArray7[0] = -this.aFloat144 * this.aFloat138;
		Static159.aFloatArray7[1] = -this.aFloat144 * this.aFloat149;
		OpenGL.glLightfv(16385, 4609, Static159.aFloatArray7, 0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6932() {
		this.method5243();
		this.method5233(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "()V")
	@Override
	public void method6907() {
		if (this.aBoolean518) {
			if (this.anInterface6_1 != this.aClass98_6) {
				throw new RuntimeException();
			}
			this.aClass98_6.method1973(0);
			this.aClass98_6.method1973(8);
			this.method5262(this.aClass98_6);
		} else if (this.aBoolean506) {
			this.aClass22_Sub3_1.da(0, 0, this.anInt6392, this.anInt6489, 0, 0);
			this.anOpenGL2.setSurface(this.aLong207);
		} else {
			throw new RuntimeException("");
		}
		this.aClass22_Sub3_1 = null;
		this.anInt6392 = this.anInt6412;
		this.anInt6489 = this.anInt6523;
		this.method5225();
		this.method5240();
		this.JA();
	}

	@OriginalMember(owner = "client!ok", name = "w", descriptor = "()I")
	@Override
	public int method6955() {
		return 4;
	}

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method5243();
		this.method5233(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, (float) arg2 + local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "()Z")
	@Override
	public boolean method6908() {
		return this.aClass1_Sub8_Sub1_1 != null && (this.anInt6548 <= 1 || this.aBoolean522);
	}

	@OriginalMember(owner = "client!ok", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass40_Sub3_Sub1_5 == null || this.aClass40_Sub3_Sub1_5.anInt6741 < arg2 || this.aClass40_Sub3_Sub1_5.anInt6745 < arg3) {
			this.aClass40_Sub3_Sub1_5 = Static295.method4129(arg3, arg2, arg6, this);
			this.aClass40_Sub3_Sub1_5.method5391(false, false);
			local57 = this.aClass40_Sub3_Sub1_5.aFloat161;
			local45 = this.aClass40_Sub3_Sub1_5.aFloat162;
		} else {
			this.aClass40_Sub3_Sub1_5.method5387(arg6, arg2, false, 6406, arg3);
			local45 = this.aClass40_Sub3_Sub1_5.aFloat162 * (float) arg3 / (float) this.aClass40_Sub3_Sub1_5.anInt6745;
			local57 = this.aClass40_Sub3_Sub1_5.aFloat161 * (float) arg2 / (float) this.aClass40_Sub3_Sub1_5.anInt6741;
		}
		this.method5191();
		this.method5202(this.aClass40_Sub3_Sub1_5);
		this.method5233(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method5217(arg5);
		this.method5224(34165, 34165);
		this.method5200(0, 34166, 768);
		this.method5200(2, 5890, 770);
		this.method5271(34166, 0);
		this.method5271(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		@Pc(160) float local160 = (float) arg3 + local150;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local57);
		OpenGL.glVertex2f(local147, local160);
		OpenGL.glTexCoord2f(local45, local57);
		OpenGL.glVertex2f(local155, local160);
		OpenGL.glTexCoord2f(local45, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method5200(0, 5890, 768);
		this.method5200(2, 34166, 770);
		this.method5271(5890, 0);
		this.method5271(34166, 2);
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5243();
		this.method5233(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local22 * local22 + local16 * local16)));
			local16 *= local47;
			local22 *= local47;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local16 + (float) arg2 + 0.35F, local22 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
	@Override
	public void method6943(@OriginalArg(0) int arg0) {
		this.method5264();
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method6959(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6919(@OriginalArg(0) Class113 arg0) {
		this.aClass113_Sub2_3.M(arg0);
		this.aClass113_Sub2_4.M(this.aClass113_Sub2_3);
		this.aClass113_Sub2_4.method2596();
		this.bf.method2600(this.aClass113_Sub2_4);
		if (this.anInt6593 != 1) {
			this.method5213();
		}
	}

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "()Z")
	@Override
	public boolean method6931() {
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V")
	@Override
	public void method6965(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt6546 = arg0;
		this.aClass237_1.method4833();
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(ILclient!dba;)V")
	public void method5275(@OriginalArg(1) Interface6 arg0) {
		if (this.aBoolean525) {
			this.method5199(arg0);
			this.method5195(arg0);
		} else if (this.anInt6553 < 3) {
			if (this.anInt6553 >= 0) {
				this.anInterface6Array2[this.anInt6553].method1968();
			}
			this.anInterface6_2 = this.anInterface6_1 = this.anInterface6Array2[++this.anInt6553] = arg0;
			this.anInterface6_2.method1970();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "(B)Lclient!qe;")
	public Class40_Sub4 method5276() {
		return this.aClass83_Sub2_1 == null ? null : this.aClass83_Sub2_1.method6437();
	}
}
