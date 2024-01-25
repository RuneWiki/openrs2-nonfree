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

@OriginalClass("client!gi")
public final class Class42_Sub3 extends Class42 {

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
	private int anInt3491;

	@OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
	public int anInt3515;

	@OriginalMember(owner = "client!gi", name = "Fd", descriptor = "I")
	private int anInt3643;

	@OriginalMember(owner = "client!gi", name = "de", descriptor = "I")
	public int anInt3666;

	@OriginalMember(owner = "client!gi", name = "ve", descriptor = "I")
	public int anInt3674;

	@OriginalMember(owner = "client!gi", name = "we", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!gi", name = "ye", descriptor = "Lclient!ct;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "client!gi", name = "Ae", descriptor = "Lclient!ct;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!gi", name = "Ge", descriptor = "I")
	private int anInt3678;

	@OriginalMember(owner = "client!gi", name = "Ie", descriptor = "I")
	public int anInt3679;

	@OriginalMember(owner = "client!gi", name = "Je", descriptor = "I")
	public int anInt3680;

	@OriginalMember(owner = "client!gi", name = "Qe", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_1;

	@OriginalMember(owner = "client!gi", name = "Re", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!gi", name = "Ue", descriptor = "I")
	private int anInt3682;

	@OriginalMember(owner = "client!gi", name = "Ve", descriptor = "I")
	public int anInt3683;

	@OriginalMember(owner = "client!gi", name = "Xe", descriptor = "Z")
	private boolean aBoolean283;

	@OriginalMember(owner = "client!gi", name = "Ye", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_2;

	@OriginalMember(owner = "client!gi", name = "af", descriptor = "Z")
	public boolean aBoolean284;

	@OriginalMember(owner = "client!gi", name = "cf", descriptor = "F")
	private float aFloat84;

	@OriginalMember(owner = "client!gi", name = "ff", descriptor = "I")
	private int anInt3687;

	@OriginalMember(owner = "client!gi", name = "gf", descriptor = "Z")
	private boolean aBoolean285;

	@OriginalMember(owner = "client!gi", name = "hf", descriptor = "I")
	private int anInt3688;

	@OriginalMember(owner = "client!gi", name = "jf", descriptor = "Lclient!es;")
	private Class79_Sub2_Sub1 aClass79_Sub2_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "kf", descriptor = "Z")
	private boolean aBoolean286;

	@OriginalMember(owner = "client!gi", name = "nf", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!gi", name = "rf", descriptor = "Z")
	public boolean aBoolean288;

	@OriginalMember(owner = "client!gi", name = "uf", descriptor = "Lclient!dd;")
	public Class65 aClass65_1;

	@OriginalMember(owner = "client!gi", name = "wf", descriptor = "Z")
	public boolean aBoolean292;

	@OriginalMember(owner = "client!gi", name = "yf", descriptor = "I")
	public int anInt3693;

	@OriginalMember(owner = "client!gi", name = "Af", descriptor = "I")
	public int anInt3695;

	@OriginalMember(owner = "client!gi", name = "Bf", descriptor = "Z")
	private boolean aBoolean293;

	@OriginalMember(owner = "client!gi", name = "Df", descriptor = "I")
	private int anInt3696;

	@OriginalMember(owner = "client!gi", name = "Ef", descriptor = "Z")
	public boolean aBoolean294;

	@OriginalMember(owner = "client!gi", name = "Ff", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_3;

	@OriginalMember(owner = "client!gi", name = "Gf", descriptor = "F")
	public float aFloat87;

	@OriginalMember(owner = "client!gi", name = "Hf", descriptor = "Z")
	private boolean aBoolean295;

	@OriginalMember(owner = "client!gi", name = "If", descriptor = "Lclient!ah;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!gi", name = "Kf", descriptor = "F")
	public float aFloat89;

	@OriginalMember(owner = "client!gi", name = "Mf", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!gi", name = "Of", descriptor = "I")
	private int anInt3697;

	@OriginalMember(owner = "client!gi", name = "Pf", descriptor = "I")
	private int anInt3698;

	@OriginalMember(owner = "client!gi", name = "Sf", descriptor = "Lclient!qd;")
	private Interface14 anInterface14_2;

	@OriginalMember(owner = "client!gi", name = "Uf", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!gi", name = "Wf", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!gi", name = "Xf", descriptor = "F")
	public float aFloat94;

	@OriginalMember(owner = "client!gi", name = "Zf", descriptor = "I")
	private int anInt3702;

	@OriginalMember(owner = "client!gi", name = "dg", descriptor = "Z")
	public boolean aBoolean299;

	@OriginalMember(owner = "client!gi", name = "fg", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_4;

	@OriginalMember(owner = "client!gi", name = "gg", descriptor = "F")
	private float aFloat96;

	@OriginalMember(owner = "client!gi", name = "hg", descriptor = "Z")
	private boolean aBoolean300;

	@OriginalMember(owner = "client!gi", name = "ig", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_5;

	@OriginalMember(owner = "client!gi", name = "jg", descriptor = "Lclient!gw;")
	private Class124_Sub1 aClass124_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "kg", descriptor = "I")
	private int anInt3705;

	@OriginalMember(owner = "client!gi", name = "mg", descriptor = "Lclient!ob;")
	public Class79_Sub2 aClass79_Sub2_2;

	@OriginalMember(owner = "client!gi", name = "ng", descriptor = "Z")
	public boolean aBoolean302;

	@OriginalMember(owner = "client!gi", name = "og", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_6;

	@OriginalMember(owner = "client!gi", name = "rg", descriptor = "Z")
	public boolean aBoolean304;

	@OriginalMember(owner = "client!gi", name = "sg", descriptor = "I")
	private int anInt3707;

	@OriginalMember(owner = "client!gi", name = "ug", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_7;

	@OriginalMember(owner = "client!gi", name = "vg", descriptor = "F")
	private float aFloat97;

	@OriginalMember(owner = "client!gi", name = "Bg", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_8;

	@OriginalMember(owner = "client!gi", name = "Dg", descriptor = "Z")
	private boolean aBoolean306;

	@OriginalMember(owner = "client!gi", name = "Eg", descriptor = "Lclient!en;")
	public Class91_Sub1 aClass91_Sub1_3;

	@OriginalMember(owner = "client!gi", name = "Fg", descriptor = "I")
	public int anInt3709;

	@OriginalMember(owner = "client!gi", name = "Gg", descriptor = "I")
	private int anInt3710;

	@OriginalMember(owner = "client!gi", name = "Ig", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_9;

	@OriginalMember(owner = "client!gi", name = "Kg", descriptor = "Lclient!qd;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!gi", name = "Lg", descriptor = "Lclient!en;")
	public Class91_Sub1 aClass91_Sub1_4;

	@OriginalMember(owner = "client!gi", name = "Mg", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!gi", name = "Pg", descriptor = "Z")
	public boolean aBoolean307;

	@OriginalMember(owner = "client!gi", name = "Qg", descriptor = "F")
	public float aFloat102;

	@OriginalMember(owner = "client!gi", name = "Sg", descriptor = "Z")
	private boolean aBoolean308;

	@OriginalMember(owner = "client!gi", name = "Vg", descriptor = "Lclient!ww;")
	public Class26_Sub3 aClass26_Sub3_10;

	@OriginalMember(owner = "client!gi", name = "Wg", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!gi", name = "Xg", descriptor = "I")
	private int anInt3714;

	@OriginalMember(owner = "client!gi", name = "Zg", descriptor = "Ljava/lang/String;")
	private String aString32;

	@OriginalMember(owner = "client!gi", name = "bh", descriptor = "[Lclient!mw;")
	private Class79[] aClass79Array1;

	@OriginalMember(owner = "client!gi", name = "ch", descriptor = "Lclient!dd;")
	public Class65 aClass65_2;

	@OriginalMember(owner = "client!gi", name = "fh", descriptor = "Lclient!aea;")
	public Class9 aClass9_4;

	@OriginalMember(owner = "client!gi", name = "gh", descriptor = "F")
	public float aFloat105;

	@OriginalMember(owner = "client!gi", name = "hh", descriptor = "I")
	private int anInt3717;

	@OriginalMember(owner = "client!gi", name = "mh", descriptor = "I")
	private int anInt3718;

	@OriginalMember(owner = "client!gi", name = "yc", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!gi", name = "je", descriptor = "I")
	public int anInt3668 = 128;

	@OriginalMember(owner = "client!gi", name = "ge", descriptor = "Lclient!lc;")
	private final Class183 aClass183_1 = new Class183();

	@OriginalMember(owner = "client!gi", name = "pe", descriptor = "Lclient!en;")
	private final Class91_Sub1 aClass91_Sub1_1 = new Class91_Sub1();

	@OriginalMember(owner = "client!gi", name = "qe", descriptor = "Lclient!en;")
	public final Class91_Sub1 aClass91_Sub1_2 = new Class91_Sub1();

	@OriginalMember(owner = "client!gi", name = "te", descriptor = "I")
	public int anInt3673 = 8;

	@OriginalMember(owner = "client!gi", name = "re", descriptor = "I")
	public int anInt3672 = 3;

	@OriginalMember(owner = "client!gi", name = "ue", descriptor = "Z")
	private boolean aBoolean280 = false;

	@OriginalMember(owner = "client!gi", name = "xe", descriptor = "Lclient!dm;")
	private final Class73 aClass73_23 = new Class73();

	@OriginalMember(owner = "client!gi", name = "Be", descriptor = "[Lclient!ct;")
	private final Interface4[] anInterface4Array1 = new Interface4[4];

	@OriginalMember(owner = "client!gi", name = "Ee", descriptor = "[Lclient!ct;")
	private final Interface4[] anInterface4Array3 = new Interface4[4];

	@OriginalMember(owner = "client!gi", name = "ze", descriptor = "I")
	private int anInt3675 = -1;

	@OriginalMember(owner = "client!gi", name = "Fe", descriptor = "I")
	private int anInt3677 = -1;

	@OriginalMember(owner = "client!gi", name = "Ce", descriptor = "I")
	private int anInt3676 = -1;

	@OriginalMember(owner = "client!gi", name = "De", descriptor = "[Lclient!ct;")
	private final Interface4[] anInterface4Array2 = new Interface4[4];

	@OriginalMember(owner = "client!gi", name = "He", descriptor = "Lclient!dm;")
	private final Class73 aClass73_24;

	@OriginalMember(owner = "client!gi", name = "Ke", descriptor = "Lclient!dm;")
	private final Class73 aClass73_25;

	@OriginalMember(owner = "client!gi", name = "Le", descriptor = "Lclient!dm;")
	private final Class73 aClass73_26;

	@OriginalMember(owner = "client!gi", name = "Me", descriptor = "Lclient!dm;")
	private final Class73 aClass73_27;

	@OriginalMember(owner = "client!gi", name = "Ne", descriptor = "Lclient!dm;")
	private final Class73 aClass73_28;

	@OriginalMember(owner = "client!gi", name = "Oe", descriptor = "Lclient!dm;")
	private final Class73 aClass73_29;

	@OriginalMember(owner = "client!gi", name = "Pe", descriptor = "Lclient!dm;")
	private final Class73 aClass73_30;

	@OriginalMember(owner = "client!gi", name = "bf", descriptor = "I")
	private int bf;

	@OriginalMember(owner = "client!gi", name = "xf", descriptor = "I")
	public int anInt3692;

	@OriginalMember(owner = "client!gi", name = "Ze", descriptor = "I")
	public int anInt3684;

	@OriginalMember(owner = "client!gi", name = "of", descriptor = "I")
	private int anInt3691;

	@OriginalMember(owner = "client!gi", name = "sf", descriptor = "Z")
	private boolean aBoolean289;

	@OriginalMember(owner = "client!gi", name = "Jf", descriptor = "F")
	public float aFloat88;

	@OriginalMember(owner = "client!gi", name = "Se", descriptor = "F")
	private float aFloat83;

	@OriginalMember(owner = "client!gi", name = "Yf", descriptor = "F")
	private float aFloat95;

	@OriginalMember(owner = "client!gi", name = "ef", descriptor = "I")
	private int anInt3686;

	@OriginalMember(owner = "client!gi", name = "Cf", descriptor = "[Lclient!rh;")
	private final Class12_Sub7[] aClass12_Sub7Array3;

	@OriginalMember(owner = "client!gi", name = "Qf", descriptor = "F")
	public float aFloat93;

	@OriginalMember(owner = "client!gi", name = "lf", descriptor = "I")
	public int anInt3689;

	@OriginalMember(owner = "client!gi", name = "cg", descriptor = "I")
	public int anInt3704;

	@OriginalMember(owner = "client!gi", name = "pg", descriptor = "I")
	public int anInt3706;

	@OriginalMember(owner = "client!gi", name = "df", descriptor = "I")
	private int anInt3685;

	@OriginalMember(owner = "client!gi", name = "tg", descriptor = "I")
	private int anInt3708;

	@OriginalMember(owner = "client!gi", name = "pf", descriptor = "F")
	public float aFloat86;

	@OriginalMember(owner = "client!gi", name = "Rf", descriptor = "I")
	private int anInt3699;

	@OriginalMember(owner = "client!gi", name = "zf", descriptor = "I")
	private int anInt3694;

	@OriginalMember(owner = "client!gi", name = "yg", descriptor = "F")
	public float aFloat98;

	@OriginalMember(owner = "client!gi", name = "Nf", descriptor = "F")
	private float aFloat92;

	@OriginalMember(owner = "client!gi", name = "Lf", descriptor = "F")
	private float aFloat90;

	@OriginalMember(owner = "client!gi", name = "Ag", descriptor = "F")
	public float aFloat100;

	@OriginalMember(owner = "client!gi", name = "Tf", descriptor = "I")
	private int anInt3700;

	@OriginalMember(owner = "client!gi", name = "xg", descriptor = "[F")
	private final float[] aFloatArray30;

	@OriginalMember(owner = "client!gi", name = "Cg", descriptor = "[F")
	private final float[] aFloatArray31;

	@OriginalMember(owner = "client!gi", name = "Rg", descriptor = "F")
	private float aFloat103;

	@OriginalMember(owner = "client!gi", name = "Te", descriptor = "I")
	public int anInt3681;

	@OriginalMember(owner = "client!gi", name = "zg", descriptor = "F")
	public float aFloat99;

	@OriginalMember(owner = "client!gi", name = "ag", descriptor = "I")
	private int anInt3703;

	@OriginalMember(owner = "client!gi", name = "mf", descriptor = "I")
	private int anInt3690;

	@OriginalMember(owner = "client!gi", name = "Og", descriptor = "F")
	public float aFloat101;

	@OriginalMember(owner = "client!gi", name = "Hg", descriptor = "I")
	public int anInt3711;

	@OriginalMember(owner = "client!gi", name = "Yg", descriptor = "I")
	public int anInt3715;

	@OriginalMember(owner = "client!gi", name = "Jg", descriptor = "[F")
	private final float[] aFloatArray32;

	@OriginalMember(owner = "client!gi", name = "Ng", descriptor = "I")
	public int anInt3712;

	@OriginalMember(owner = "client!gi", name = "Tg", descriptor = "[F")
	public final float[] aFloatArray33;

	@OriginalMember(owner = "client!gi", name = "eh", descriptor = "F")
	public float aFloat104;

	@OriginalMember(owner = "client!gi", name = "Ug", descriptor = "I")
	public int anInt3713;

	@OriginalMember(owner = "client!gi", name = "dh", descriptor = "[F")
	private final float[] aFloatArray34;

	@OriginalMember(owner = "client!gi", name = "ah", descriptor = "I")
	public int anInt3716;

	@OriginalMember(owner = "client!gi", name = "eg", descriptor = "Lclient!mh;")
	public Class12_Sub8_Sub1 aClass12_Sub8_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "jh", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!gi", name = "ih", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!gi", name = "kh", descriptor = "[B")
	public final byte[] aByteArray42;

	@OriginalMember(owner = "client!gi", name = "lh", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!gi", name = "Id", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas8;

	@OriginalMember(owner = "client!gi", name = "fc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!gi", name = "ne", descriptor = "I")
	public final int anInt3671;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL1;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "J")
	private final long aLong98;

	@OriginalMember(owner = "client!gi", name = "jc", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!gi", name = "Vf", descriptor = "I")
	public final int anInt3701;

	@OriginalMember(owner = "client!gi", name = "bg", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!gi", name = "We", descriptor = "Z")
	public boolean aBoolean282;

	@OriginalMember(owner = "client!gi", name = "lg", descriptor = "Z")
	private boolean aBoolean301;

	@OriginalMember(owner = "client!gi", name = "vf", descriptor = "Z")
	public boolean aBoolean291;

	@OriginalMember(owner = "client!gi", name = "qf", descriptor = "Z")
	public boolean aBoolean287;

	@OriginalMember(owner = "client!gi", name = "qg", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!gi", name = "wg", descriptor = "Z")
	public boolean aBoolean305;

	@OriginalMember(owner = "client!gi", name = "tf", descriptor = "Z")
	private final boolean aBoolean290;

	@OriginalMember(owner = "client!gi", name = "ie", descriptor = "Lclient!me;")
	private final Class200 aClass200_1;

	@OriginalMember(owner = "client!gi", name = "se", descriptor = "Lclient!pba;")
	public final Class237 aClass237_1;

	@OriginalMember(owner = "client!gi", name = "le", descriptor = "Lclient!cf;")
	private final Class52 aClass52_1;

	@OriginalMember(owner = "client!gi", name = "he", descriptor = "Lclient!uaa;")
	private Class12_Sub43_Sub1 aClass12_Sub43_Sub1_1;

	@OriginalMember(owner = "client!gi", name = "oe", descriptor = "Lclient!os;")
	private final Class233 aClass233_1;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;I)V")
	public Class42_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class280();
		new Class68(16);
		this.aClass73_24 = new Class73();
		this.aClass73_25 = new Class73();
		this.aClass73_26 = new Class73();
		this.aClass73_27 = new Class73();
		this.aClass73_28 = new Class73();
		this.aClass73_29 = new Class73();
		this.aClass73_30 = new Class73();
		this.bf = 0;
		this.anInt3692 = -1;
		this.anInt3684 = 0;
		this.anInt3691 = 0;
		this.aBoolean289 = true;
		this.aFloat88 = -1.0F;
		this.aFloat83 = 1.0F;
		this.aFloat95 = 0.0F;
		this.anInt3686 = 8448;
		this.aClass12_Sub7Array3 = new Class12_Sub7[Static53.anInt1400];
		this.aFloat93 = 1.0F;
		this.anInt3689 = 512;
		this.anInt3704 = -1;
		this.anInt3706 = 0;
		this.anInt3685 = 0;
		this.anInt3708 = 0;
		this.aFloat86 = 3584.0F;
		this.anInt3699 = 0;
		this.anInt3694 = 8448;
		this.aFloat98 = 3584.0F;
		this.aFloat92 = 1.0F;
		this.aFloat90 = -1.0F;
		this.aFloat100 = -1.0F;
		this.anInt3700 = -1;
		this.aFloatArray30 = new float[4];
		this.aFloatArray31 = new float[4];
		this.aFloat103 = -1.0F;
		this.anInt3681 = 0;
		this.aFloat99 = 1.0F;
		this.anInt3703 = 0;
		this.anInt3690 = -1;
		this.aFloat101 = 3000.0F;
		this.anInt3711 = 0;
		this.anInt3715 = 50;
		this.aFloatArray32 = new float[16];
		this.anInt3712 = 3584;
		this.aFloatArray33 = new float[4];
		this.aFloat104 = 1.0F;
		this.anInt3713 = 512;
		this.aFloatArray34 = new float[4];
		this.anInt3716 = -1;
		this.aClass12_Sub8_Sub1_1 = new Class12_Sub8_Sub1(8192);
		this.anIntArray295 = new int[1];
		this.anIntArray294 = new int[1];
		this.aByteArray42 = new byte[16384];
		this.anIntArray296 = new int[1];
		this.aCanvas7 = this.aCanvas8 = arg0;
		this.anInt3671 = arg2;
		if (!Static222.method4058("jaclib")) {
			throw new RuntimeException("");
		} else if (Static222.method4058("jaggl")) {
			try {
				this.anOpenGL1 = new OpenGL();
				this.aLong99 = this.aLong98 = this.anOpenGL1.init(arg0, 8, 8, 8, 24, 0, this.anInt3671);
				if (this.aLong98 == 0L) {
					throw new RuntimeException("");
				}
				this.method3231();
				@Pc(318) int local318 = this.method3232();
				if (local318 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3701 = this.aBoolean292 ? 33639 : 5121;
				@Pc(345) int local345;
				if (this.aString32.indexOf("radeon") != -1) {
					local345 = 0;
					@Pc(347) boolean local347 = false;
					@Pc(349) boolean local349 = false;
					@Pc(358) String[] local358 = Static434.method6610(this.aString32.replace('/', ' '), ' ');
					for (@Pc(360) int local360 = 0; local360 < local358.length; local360++) {
						@Pc(366) String local366 = local358[local360];
						try {
							if (local366.length() > 0) {
								if (local366.charAt(0) == 'x' && local366.length() >= 3 && Static261.method4417(local366.substring(1, 3))) {
									local366 = local366.substring(1);
									local349 = true;
								}
								if (local366.equals("hd")) {
									local347 = true;
								} else {
									if (local366.startsWith("hd")) {
										local347 = true;
										local366 = local366.substring(2);
									}
									if (local366.length() >= 4 && Static261.method4417(local366.substring(0, 4))) {
										local345 = Static467.method7015(local366.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(436) Exception local436) {
						}
					}
					if (!local347 || local345 < 4000) {
						this.aBoolean298 = false;
					}
					if (!local349 && !local347) {
						if (local345 >= 7000 && local345 <= 9250) {
							this.aBoolean282 = false;
						}
						if (local345 >= 7000 && local345 <= 7999) {
							this.aBoolean301 = false;
						}
					}
					this.aBoolean291 &= this.anOpenGL1.a("GL_ARB_half_float_pixel");
					this.aBoolean287 = true;
					this.aBoolean303 = this.aBoolean301;
				}
				if (this.aString31.indexOf("intel") != -1) {
					this.aBoolean305 = false;
				}
				this.aBoolean290 = !this.aString31.equals("s3 graphics");
				if (this.aBoolean301) {
					try {
						@Pc(522) int[] local522 = new int[1];
						OpenGL.glGenBuffersARB(1, local522, 0);
					} catch (@Pc(528) Throwable local528) {
						throw new RuntimeException("");
					}
				}
				Static292.method4744(true, false);
				this.aBoolean280 = true;
				this.aClass200_1 = new Class200(this, super.anInterface11_11);
				this.method3260();
				this.aClass237_1 = new Class237(this);
				this.aClass52_1 = new Class52(this);
				if (this.aClass52_1.method1448()) {
					this.aClass12_Sub43_Sub1_1 = new Class12_Sub43_Sub1(this);
					if (!this.aClass12_Sub43_Sub1_1.method7237()) {
						this.aClass12_Sub43_Sub1_1.method7226();
						this.aClass12_Sub43_Sub1_1 = null;
					}
				}
				this.aClass233_1 = new Class233(this);
				this.method3233();
				this.method3220();
				OpenGL.glClear(16640);
				local345 = 0;
				while (true) {
					try {
						this.anOpenGL1.swapBuffers();
						break;
					} catch (@Pc(607) Exception local607) {
						if (local345++ > 5) {
							throw new RuntimeException("");
						}
						Static17.method388(100L);
					}
				}
				OpenGL.glClear(16384);
			} catch (@Pc(627) Throwable local627) {
				local627.printStackTrace();
				this.method5800();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public Class12_Sub36 method5859(@OriginalArg(0) int arg0) {
		@Pc(8) Class12_Sub36_Sub2 local8 = new Class12_Sub36_Sub2(arg0);
		this.aClass73_23.method2012(local8);
		return local8;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBI)V")
	public void method3189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.bf = arg0;
		this.anInt3691 = arg1;
		this.method3240();
		this.method3207();
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V")
	public void method3190() {
		if (this.anInt3702 == 8) {
			return;
		}
		this.method3198();
		this.method3263(true);
		this.method3236(true);
		this.method3192(true);
		this.method3209(1);
		this.anInt3702 = 8;
	}

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "(IIIII)V")
	@Override
	protected void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt3699 || arg0 - arg2 > this.anInt3703 || this.anInt3685 > arg1 + arg2 || arg1 - arg2 > this.anInt3708) {
			return;
		}
		this.method3214();
		this.method3209(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(76) float local76 = (float) arg0 + 0.35F;
		@Pc(81) float local81 = (float) arg1 + 0.35F;
		@Pc(85) int local85 = arg2 << 1;
		if ((float) local85 < this.aFloat90) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local76 + 1.0F, local81 + 1.0F);
			OpenGL.glVertex2f(local76 + 1.0F, local81 - 1.0F);
			OpenGL.glVertex2f(local76 - 1.0F, local81 - 1.0F);
			OpenGL.glVertex2f(local76 - 1.0F, local81 + 1.0F);
			OpenGL.glEnd();
		} else if (this.aFloat103 >= (float) local85) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local85);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local76, local81);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local76, local81);
			@Pc(154) int local154 = 262144 / (arg2 * 6);
			if (local154 <= 64) {
				local154 = 64;
			} else if (local154 > 512) {
				local154 = 512;
			}
			local154 = Static472.method7121(local154);
			OpenGL.glVertex2f((float) arg2 + local76, local81);
			for (@Pc(183) int local183 = 16384 - local154; local183 > 0; local183 -= local154) {
				OpenGL.glVertex2f(Class37.aFloatArray5[local183] * (float) arg2 + local76, local81 + (float) arg2 * Class37.aFloatArray4[local183]);
			}
			OpenGL.glVertex2f((float) arg2 + local76, local81);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)I")
	@Override
	public int method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZB)V")
	public void method3191(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean308) {
			this.aBoolean308 = arg0;
			this.method3230();
			this.anInt3702 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!r;Lclient!hp;Lclient!m;Lclient!kn;I)V")
	@Override
	public void method5864(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4 arg3) {
		arg0.method8003(arg2, arg3, 0);
		this.method5856(arg1);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5835(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method5821();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)V")
	public void method3192(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean293 != arg0) {
			this.aBoolean293 = arg0;
			this.method3251();
			this.anInt3702 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "()Lclient!m;")
	@Override
	public Class91 method5829() {
		return new Class91_Sub1();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I[Lclient!rh;)V")
	@Override
	public void method5824(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub7[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			this.aClass12_Sub7Array3[local3] = arg1[local3];
		}
		this.anInt3696 = arg0;
		if (this.anInt3705 != 1) {
			this.method3242();
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(B)V")
	private void method3193() {
		if (this.aFloat87 == 0.0F) {
			this.aFloatArray32[10] = this.aFloat84;
			this.aFloatArray32[14] = this.aFloat97;
		} else {
			@Pc(45) float local45 = this.aFloat101 / (this.aFloat101 + this.aFloat87);
			@Pc(49) float local49 = local45 * local45;
			@Pc(66) float local66 = (1.0F - local45) * -this.aFloat97 * (1.0F - local45) / this.aFloat87;
			this.aFloatArray32[10] = this.aFloat84 + local66;
			this.aFloatArray32[14] = this.aFloat97 * local49;
		}
		this.aFloat86 = (float) this.anInt3712 - this.aFloat87;
		this.aFloat98 = (this.aFloatArray32[14] - (float) this.anInt3712) / this.aFloatArray32[10];
	}

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "(IIII)V")
	@Override
	public void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3690 = arg1;
		this.aBoolean294 = true;
		this.anInt3709 = arg0;
		this.anInt3692 = arg2;
		this.anInt3684 = arg3;
		this.aClass233_1.method5630(false, 0, 3, 0, false);
		this.aClass233_1.aClass112_Sub6_1.method6049();
		this.method3222();
		this.method3258();
	}

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "(I)V")
	private void method3194() {
		if (this.aBoolean285) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean285 = false;
		}
	}

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "(I)V")
	public void method3195() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "()Z")
	@Override
	public boolean method5849() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "()V")
	@Override
	public void method5816() {
		if (!this.aBoolean290 || this.anInt3666 <= 0 || this.anInt3515 <= 0) {
			return;
		}
		@Pc(22) int local22 = this.anInt3699;
		@Pc(25) int local25 = this.anInt3703;
		@Pc(28) int local28 = this.anInt3685;
		@Pc(31) int local31 = this.anInt3708;
		this.n();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method3238();
		this.method3263(false);
		this.method3191(false);
		this.method3236(false);
		this.method3192(false);
		this.method3219(null);
		this.method3269(-2);
		this.method3257(1);
		this.method3209(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3666, this.anInt3515, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.N(local22, local28, local25, local31);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	@Override
	public Class215 method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class215_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public void method5855(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub1_4 = (Class91_Sub1) arg0;
		this.aClass91_Sub1_3.method2464(this.aClass91_Sub1_4);
		if (this.anInt3705 != 1) {
			this.method3234();
		}
	}

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "(I)V")
	@Override
	public void L(@OriginalArg(0) int arg0) {
		this.anInt3672 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt3672++;
		}
		this.anInt3673 = 0x1 << this.anInt3672;
	}

	@OriginalMember(owner = "client!gi", name = "ba", descriptor = "()I")
	@Override
	public int ba() {
		@Pc(6) int local6 = this.anInt3717;
		this.anInt3717 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IBI)V")
	public synchronized void method3196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class12_Sub18 local14 = new Class12_Sub18(arg1);
		local14.aLong248 = arg0;
		this.aClass73_26.method2012(local14);
	}

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "()V")
	@Override
	public void method5845() {
		this.aClass52_1.method1447();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
	public synchronized void method3197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class12_Sub18 local8 = new Class12_Sub18(arg1);
		local8.aLong248 = arg0;
		this.aClass73_28.method2012(local8);
	}

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "(I)V")
	private void method3198() {
		if (this.anInt3705 != 2) {
			this.anInt3705 = 2;
			this.method3237();
			this.method3234();
			this.anInt3702 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "()Z")
	@Override
	public boolean method5819() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIZ)V")
	public void method3199(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		this.method3239(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!gi", name = "la", descriptor = "(FF)V")
	@Override
	public void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		if (arg0 == this.aFloat101 && arg1 == this.aFloat87) {
			return;
		}
		this.aFloat87 = arg1;
		this.aFloat101 = arg0;
		this.method3193();
		if (this.anInt3705 == 3) {
			this.method3248();
			return;
		}
		if (this.anInt3705 != 2) {
			return;
		}
		this.method3237();
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIII)V")
	public void method3201(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg0 + 34184, arg1);
		OpenGL.glTexEnvi(8960, arg0 + 34200, 770);
	}

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt3679 + this.anInt3680 + this.anInt3678;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
	private void method3202() {
		Static444.aFloatArray68[2] = this.aFloat93 * this.aFloat100;
		Static444.aFloatArray68[0] = this.aFloat99 * this.aFloat100;
		Static444.aFloatArray68[3] = 1.0F;
		Static444.aFloatArray68[1] = this.aFloat104 * this.aFloat100;
		OpenGL.glLightfv(16384, 4609, Static444.aFloatArray68, 0);
		Static444.aFloatArray68[0] = -this.aFloat88 * this.aFloat99;
		Static444.aFloatArray68[1] = this.aFloat104 * -this.aFloat88;
		Static444.aFloatArray68[2] = -this.aFloat88 * this.aFloat93;
		Static444.aFloatArray68[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static444.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "([I)V")
	@Override
	public void d(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt3685;
		arg0[3] = this.anInt3708;
		arg0[0] = this.anInt3699;
		arg0[2] = this.anInt3703;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "()V")
	@Override
	protected void method5800() {
		for (@Pc(10) Class12 local10 = this.aClass73_23.method2005(); local10 != null; local10 = this.aClass73_23.method2009()) {
			((Class12_Sub36_Sub2) local10).method7158();
		}
		if (this.aClass52_1 != null) {
			this.aClass52_1.method1456();
		}
		if (this.anOpenGL1 != null) {
			this.method3215();
			@Pc(40) Enumeration local40 = this.aHashtable7.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable7.get(local46);
				this.anOpenGL1.releaseSurface(local46, local52);
			}
			this.anOpenGL1.release();
			this.anOpenGL1 = null;
		}
		if (this.aBoolean280) {
			Static29.method558(true, false);
			this.aBoolean280 = false;
		}
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(IIII)V")
	public void method3203(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "(I)V")
	private void method3204() {
		if (this.anInt3705 != 3) {
			this.anInt3705 = 3;
			this.method3248();
			this.method3234();
			this.anInt3702 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method5814(@OriginalArg(0) Class12_Sub36 arg0) {
		this.aNativeHeap3 = ((Class12_Sub36_Sub2) arg0).aNativeHeap6;
		if (this.anInterface14_2 != null) {
			return;
		}
		@Pc(16) Class12_Sub8_Sub1 local16 = new Class12_Sub8_Sub1(80);
		if (this.aBoolean292) {
			local16.method4923(-1.0F);
			local16.method4923(-1.0F);
			local16.method4923(0.0F);
			local16.method4923(0.0F);
			local16.method4923(1.0F);
			local16.method4923(1.0F);
			local16.method4923(-1.0F);
			local16.method4923(0.0F);
			local16.method4923(1.0F);
			local16.method4923(1.0F);
			local16.method4923(1.0F);
			local16.method4923(1.0F);
			local16.method4923(0.0F);
			local16.method4923(1.0F);
			local16.method4923(0.0F);
			local16.method4923(-1.0F);
			local16.method4923(1.0F);
			local16.method4923(0.0F);
			local16.method4923(0.0F);
			local16.method4923(0.0F);
		} else {
			local16.method4924(-1.0F);
			local16.method4924(-1.0F);
			local16.method4924(0.0F);
			local16.method4924(0.0F);
			local16.method4924(1.0F);
			local16.method4924(1.0F);
			local16.method4924(-1.0F);
			local16.method4924(0.0F);
			local16.method4924(1.0F);
			local16.method4924(1.0F);
			local16.method4924(1.0F);
			local16.method4924(1.0F);
			local16.method4924(0.0F);
			local16.method4924(1.0F);
			local16.method4924(0.0F);
			local16.method4924(-1.0F);
			local16.method4924(1.0F);
			local16.method4924(0.0F);
			local16.method4924(0.0F);
			local16.method4924(0.0F);
		}
		this.anInterface14_2 = this.method3261(20, false, local16.anInt6217, local16.aByteArray82);
		this.aClass65_1 = new Class65(this.anInterface14_2, 5126, 3, 0);
		this.aClass65_2 = new Class65(this.anInterface14_2, 5126, 2, 12);
		this.aClass183_1.method4571(this);
	}

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "()Z")
	@Override
	public boolean method5830() {
		return this.aClass12_Sub43_Sub1_1 != null && (this.anInt3671 <= 1 || this.aBoolean306);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!bt;Z)Lclient!ha;")
	@Override
	public Class84 method5839(@OriginalArg(0) Class40 arg0) {
		@Pc(12) int[] local12 = new int[arg0.anInt895 * arg0.anInt894];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray22 == null) {
			for (local21 = 0; local21 < arg0.anInt894; local21++) {
				for (local25 = 0; local25 < arg0.anInt895; local25++) {
					@Pc(38) int local38 = arg0.anIntArray124[arg0.aByteArray21[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt894; local21++) {
				for (local25 = 0; local25 < arg0.anInt895; local25++) {
					local12[local16++] = arg0.anIntArray124[arg0.aByteArray21[local14] & 0xFF] | arg0.aByteArray22[local14] << 24;
					local14++;
				}
			}
		}
		@Pc(127) Class84 local127 = this.method5862(local12, arg0.anInt895, arg0.anInt895, arg0.anInt894);
		local127.KA(arg0.anInt897, arg0.anInt896, arg0.anInt899, arg0.anInt898);
		return local127;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	@Override
	public void method5797(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "(III)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt3716 && this.anInt3704 == arg1 && this.anInt3711 == arg2) {
			return;
		}
		this.anInt3704 = arg1;
		this.anInt3716 = arg0;
		this.anInt3711 = arg2;
		if (this.aBoolean294) {
			return;
		}
		this.method3222();
		this.method3258();
	}

	@OriginalMember(owner = "client!gi", name = "ta", descriptor = "(II)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3715 == arg0 && arg1 == this.anInt3712) {
			return;
		}
		this.anInt3715 = arg0;
		this.anInt3712 = arg1;
		this.method3218();
		this.method3222();
		if (this.anInt3705 == 3) {
			this.method3248();
		} else if (this.anInt3705 == 2) {
			this.method3237();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public Class84 method5817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class84_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(II)I")
	public int method3205(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method3214();
		this.method3209(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(23) float local23 = (float) -arg1 + (float) arg3;
		@Pc(36) float local36 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local23 * local23)));
		@Pc(40) float local40 = local23 * local36;
		@Pc(44) float local44 = local16 * local36;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local44 + 0.35F, (float) arg3 + local40 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(IIIII)V")
	@Override
	public void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3214();
		this.method3209(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15, local35 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V")
	@Override
	public synchronized void method5861(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class12_Sub18 local19;
		while (!this.aClass73_25.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_25.method2008();
			Static518.anIntArray680[local7++] = (int) local19.aLong248;
			this.anInt3679 -= local19.anInt3978;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static518.anIntArray680, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static518.anIntArray680, 0);
			local7 = 0;
		}
		while (!this.aClass73_26.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_26.method2008();
			Static518.anIntArray680[local7++] = (int) local19.aLong248;
			this.anInt3680 -= local19.anInt3978;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static518.anIntArray680, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static518.anIntArray680, 0);
			local7 = 0;
		}
		while (!this.aClass73_27.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_27.method2008();
			Static518.anIntArray680[local7++] = local19.anInt3978;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static518.anIntArray680, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static518.anIntArray680, 0);
			local7 = 0;
		}
		while (!this.aClass73_28.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_28.method2008();
			Static518.anIntArray680[local7++] = (int) local19.aLong248;
			this.anInt3678 -= local19.anInt3978;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static518.anIntArray680, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static518.anIntArray680, 0);
		}
		while (!this.aClass73_24.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_24.method2008();
			OpenGL.glDeleteLists((int) local19.aLong248, local19.anInt3978);
		}
		@Pc(215) Class12 local215;
		while (!this.aClass73_29.method2015()) {
			local215 = this.aClass73_29.method2008();
			OpenGL.glDeleteProgramARB((int) local215.aLong248);
		}
		while (!this.aClass73_30.method2015()) {
			local215 = this.aClass73_30.method2008();
			OpenGL.glDeleteObjectARB(local215.aLong248);
		}
		while (!this.aClass73_24.method2015()) {
			local19 = (Class12_Sub18) this.aClass73_24.method2008();
			OpenGL.glDeleteLists((int) local19.aLong248, local19.anInt3978);
		}
		this.aClass200_1.method4836();
		if (this.U() > 100663296 && Static76.method1679() > this.aLong100 + 60000L) {
			System.gc();
			this.aLong100 = Static76.method1679();
		}
		this.anInt3674 = local11;
	}

	@OriginalMember(owner = "client!gi", name = "ra", descriptor = "()F")
	@Override
	public float ra() {
		return this.aFloat87;
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "()Z")
	@Override
	public boolean method5813() {
		return this.aClass233_1.method5629();
	}

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "(IIII)[I")
	@Override
	public int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3515 - local12 - arg1, arg2, 1, 32993, this.anInt3701, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "(I)V")
	private void method3207() {
		if (this.anInt3699 <= this.anInt3703 && this.anInt3685 <= this.anInt3708) {
			OpenGL.glScissor(this.anInt3699 + this.bf, -this.anInt3708 + this.anInt3691 + this.anInt3515, this.anInt3703 - this.anInt3699, -this.anInt3685 + this.anInt3708);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([Lclient!r;Lclient!hp;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5809(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4[] arg3, @OriginalArg(4) int arg4) {
		this.method5860(arg0, arg2, arg3, arg4);
		this.method5856(arg1);
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
	public void method3208() {
		if (this.anInt3702 == 16) {
			return;
		}
		this.method3204();
		this.method3263(true);
		this.method3236(true);
		this.method3192(true);
		this.method3209(1);
		this.anInt3702 = 16;
	}

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "()Z")
	@Override
	public boolean method5842() {
		if (this.aClass12_Sub43_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass12_Sub43_Sub1_1.method7225()) {
			if (!this.aClass52_1.method1450(this.aClass12_Sub43_Sub1_1)) {
				return false;
			}
			this.aClass200_1.method4834();
		}
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IB)V")
	public void method3209(@OriginalArg(0) int arg0) {
		if (arg0 == this.anInt3707) {
			return;
		}
		@Pc(16) boolean local16;
		@Pc(12) byte local12;
		if (arg0 == 1) {
			local12 = 1;
			local16 = true;
		} else if (arg0 == 2) {
			local12 = 2;
			local16 = false;
		} else if (arg0 == 128) {
			local12 = 3;
			local16 = true;
		} else {
			local16 = false;
			local12 = 0;
		}
		if (!this.aBoolean296) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean296 = true;
		}
		if (local16 != this.aBoolean295) {
			if (local16) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean295 = local16;
		}
		if (this.anInt3682 != local12) {
			if (local12 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local12 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local12 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt3682 = local12;
		}
		this.anInt3707 = arg0;
		this.anInt3702 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "()Z")
	@Override
	public boolean method5836() {
		return this.aClass12_Sub43_Sub1_1 != null && this.aClass12_Sub43_Sub1_1.method7225();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ah;I)V")
	public void method3210(@OriginalArg(0) Interface2 arg0) {
		if (arg0 != this.anInterface2_1) {
			if (this.aBoolean301) {
				OpenGL.glBindBufferARB(34963, arg0.method7244());
			}
			this.anInterface2_1 = arg0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5844() {
		this.method3214();
		this.method3209(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "()Z")
	@Override
	public boolean method5867() {
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!ct;)V")
	public void method3211(@OriginalArg(1) Interface4 arg0) {
		if (this.aBoolean284) {
			this.method3216(arg0);
			this.method3243(arg0);
		} else if (this.anInt3677 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt3677 >= 0) {
				this.anInterface4Array2[this.anInt3677].method269();
			}
			this.anInterface4_2 = this.anInterface4_1 = this.anInterface4Array2[++this.anInt3677] = arg0;
			this.anInterface4_2.method268();
		}
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(II)V")
	public synchronized void method3212(@OriginalArg(1) int arg0) {
		@Pc(7) Class12 local7 = new Class12();
		local7.aLong248 = arg0;
		this.aClass73_29.method2012(local7);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!pu;[Lclient!bt;Z)Lclient!ra;")
	@Override
	public Class80 method5850(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class40[] arg1) {
		return new Class80_Sub5(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZFFF)V")
	private void method3213(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean285) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg1, arg2, arg0);
		OpenGL.glMatrixMode(5888);
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "(I)V")
	private void method3214() {
		if (this.anInt3702 == 1) {
			return;
		}
		this.method3262();
		this.method3263(false);
		this.method3191(false);
		this.method3236(false);
		this.method3192(false);
		this.method3219(null);
		this.method3269(-2);
		this.method3257(1);
		this.anInt3702 = 1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public Class84 method5862(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class84_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!gi", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		@Pc(6) int local6 = this.anInt3718;
		this.anInt3718 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(B)V")
	private void method3215() {
		this.anOpenGL1.b();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)Lclient!sv;")
	@Override
	public Class124 method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean299 ? new Class124_Sub1_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "()V")
	@Override
	public void method5841() {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ct;I)V")
	public void method3216(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt3675 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3675 >= 0) {
			this.anInterface4Array3[this.anInt3675].method271();
		}
		this.anInterface4_2 = this.anInterface4Array3[++this.anInt3675] = arg0;
		this.anInterface4_2.method272();
	}

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "(I)V")
	private void method3217() {
		Static444.aFloatArray68[0] = this.aFloat85 * this.aFloat99;
		Static444.aFloatArray68[2] = this.aFloat85 * this.aFloat93;
		Static444.aFloatArray68[1] = this.aFloat104 * this.aFloat85;
		Static444.aFloatArray68[3] = 1.0F;
		OpenGL.glLightModelfv(2899, Static444.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5803(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static530.aFloat194 = arg2;
		Static109.aFloat58 = arg1;
		Static45.aFloat9 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "(I)V")
	private void method3218() {
		@Pc(12) float[] local12 = this.aFloatArray32;
		@Pc(24) float local24 = (float) (this.anInt3715 * -this.anInt3706) / (float) this.anInt3689;
		@Pc(39) float local39 = (float) (this.anInt3715 * (this.anInt3666 - this.anInt3706)) / (float) this.anInt3689;
		@Pc(50) float local50 = (float) (this.anInt3715 * this.anInt3681) / (float) this.anInt3713;
		@Pc(65) float local65 = (float) (this.anInt3715 * (this.anInt3681 - this.anInt3515)) / (float) this.anInt3713;
		if (local39 == local24 || local65 == local50) {
			local12[2] = 0.0F;
			local12[11] = 0.0F;
			local12[0] = 1.0F;
			local12[8] = 0.0F;
			local12[14] = 0.0F;
			local12[12] = 0.0F;
			local12[9] = 0.0F;
			local12[4] = 0.0F;
			local12[15] = 1.0F;
			local12[13] = 0.0F;
			local12[10] = 1.0F;
			local12[1] = 0.0F;
			local12[6] = 0.0F;
			local12[7] = 0.0F;
			local12[5] = 1.0F;
			local12[3] = 0.0F;
		} else {
			@Pc(79) float local79 = (float) this.anInt3715 * 2.0F;
			local12[1] = 0.0F;
			local12[4] = 0.0F;
			local12[7] = 0.0F;
			local12[12] = 0.0F;
			local12[2] = 0.0F;
			local12[6] = 0.0F;
			local12[3] = 0.0F;
			local12[14] = this.aFloat97 = -((float) this.anInt3712 * local79) / (float) (this.anInt3712 - this.anInt3715);
			local12[10] = this.aFloat84 = (float) -(this.anInt3715 + this.anInt3712) / (float) (this.anInt3712 - this.anInt3715);
			local12[8] = (local39 + local24) / (local39 - local24);
			local12[0] = local79 / (local39 - local24);
			local12[13] = 0.0F;
			local12[11] = -1.0F;
			local12[9] = (local50 + local65) / (-local65 + local50);
			local12[5] = local79 / (local50 - local65);
			local12[15] = 0.0F;
		}
		this.method3193();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!mw;)V")
	public void method3219(@OriginalArg(1) Class79 arg0) {
		@Pc(18) Class79 local18 = this.aClass79Array1[this.anInt3714];
		if (local18 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local18.anInt6293);
			} else {
				if (local18 == null) {
					OpenGL.glEnable(arg0.anInt6293);
				} else if (local18.anInt6293 != arg0.anInt6293) {
					OpenGL.glDisable(local18.anInt6293);
					OpenGL.glEnable(arg0.anInt6293);
				}
				OpenGL.glBindTexture(arg0.anInt6293, arg0.method5273());
			}
			this.aClass79Array1[this.anInt3714] = arg0;
		}
		this.anInt3702 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt3699 = 0;
		this.anInt3708 = this.anInt3515;
		this.anInt3703 = this.anInt3666;
		this.anInt3685 = 0;
		OpenGL.glDisable(3089);
		this.method3266();
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(B)V")
	private void method3220() {
		if (this.aCanvas7 == null) {
			this.anInt3643 = this.anInt3491 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas7.getSize();
			this.anInt3643 = local18.width;
			this.anInt3491 = local18.height;
		}
		if (this.anInterface4_1 == null) {
			this.anInt3515 = this.anInt3491;
			this.anInt3666 = this.anInt3643;
			this.method3240();
		}
		this.method3238();
		this.n();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFBF)V")
	public void method3221(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static444.aFloatArray68[1] = arg0;
		Static444.aFloatArray68[3] = arg2;
		Static444.aFloatArray68[2] = arg3;
		Static444.aFloatArray68[0] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static444.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5789(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas8 == arg0) {
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
			@Pc(53) long local53 = this.anOpenGL1.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable7.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "()Z")
	@Override
	public boolean method5818() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(41) float local41;
		@Pc(53) float local53;
		if (this.aClass79_Sub2_Sub1_1 == null || arg2 > this.aClass79_Sub2_Sub1_1.anInt2816 || arg3 > this.aClass79_Sub2_Sub1_1.anInt2812) {
			this.aClass79_Sub2_Sub1_1 = Static95.method2003(arg6, this, arg2, arg3);
			this.aClass79_Sub2_Sub1_1.method2529(false, false);
			local53 = this.aClass79_Sub2_Sub1_1.aFloat73;
			local41 = this.aClass79_Sub2_Sub1_1.aFloat74;
		} else {
			this.aClass79_Sub2_Sub1_1.method2528(arg2, 6406, false, arg6, arg3);
			local41 = (float) arg3 * this.aClass79_Sub2_Sub1_1.aFloat74 / (float) this.aClass79_Sub2_Sub1_1.anInt2812;
			local53 = (float) arg2 * this.aClass79_Sub2_Sub1_1.aFloat73 / (float) this.aClass79_Sub2_Sub1_1.anInt2816;
		}
		this.method3247();
		this.method3219(this.aClass79_Sub2_Sub1_1);
		this.method3209(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method3223(arg5);
		this.method3250(34165, 34165);
		this.method3268(0, 768, 34166);
		this.method3268(2, 770, 5890);
		this.method3201(0, 34166);
		this.method3201(2, 5890);
		@Pc(143) float local143 = (float) arg0;
		@Pc(146) float local146 = (float) arg1;
		@Pc(151) float local151 = (float) arg2 + local143;
		OpenGL.glBegin(7);
		@Pc(158) float local158 = (float) arg3 + local146;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local143, local146);
		OpenGL.glTexCoord2f(0.0F, local53);
		OpenGL.glVertex2f(local143, local158);
		OpenGL.glTexCoord2f(local41, local53);
		OpenGL.glVertex2f(local151, local158);
		OpenGL.glTexCoord2f(local41, 0.0F);
		OpenGL.glVertex2f(local151, local146);
		OpenGL.glEnd();
		this.method3268(0, 768, 5890);
		this.method3268(2, 770, 34166);
		this.method3201(0, 5890);
		this.method3201(2, 34166);
	}

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "()Lclient!la;")
	@Override
	public Class179 method5828() {
		@Pc(7) int local7 = -1;
		if (this.aString31.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString31.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString31.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class179(local7, "OpenGL", this.anInt3688, this.aString32, 0L);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5791(@OriginalArg(0) Canvas arg0) {
		if (arg0 == this.aCanvas8) {
			throw new RuntimeException();
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable7.get(arg0);
			this.anOpenGL1.releaseSurface(arg0, local22);
			this.aHashtable7.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!gi", name = "P", descriptor = "()F")
	@Override
	public float P() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "(B)V")
	private void method3222() {
		@Pc(23) int local23;
		if (this.aBoolean294) {
			OpenGL.glFogf(2915, 0.0F);
			OpenGL.glFogf(2916, 1.0F);
			local23 = this.anInt3690;
		} else {
			this.aFloat96 = (float) (this.anInt3712 - this.anInt3711) - this.aFloat95;
			this.aFloat94 = this.aFloat96 - (float) this.anInt3704 * this.aFloat83;
			if ((float) this.anInt3715 > this.aFloat94) {
				this.aFloat94 = this.anInt3715;
			}
			OpenGL.glFogf(2915, this.aFloat94);
			OpenGL.glFogf(2916, this.aFloat96);
			local23 = this.anInt3716;
		}
		Static444.aFloatArray68[0] = (float) (local23 & 0xFF0000) / 1.671168E7F;
		Static444.aFloatArray68[2] = (float) (local23 & 0xFF) / 255.0F;
		Static444.aFloatArray68[1] = (float) (local23 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static444.aFloatArray68, 0);
		if (this.aBoolean294) {
			this.aClass233_1.aClass112_Sub6_1.method6048();
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(II)V")
	public void method3223(@OriginalArg(0) int arg0) {
		Static444.aFloatArray68[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static444.aFloatArray68[3] = (float) (arg0 >>> 24) / 255.0F;
		Static444.aFloatArray68[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static444.aFloatArray68[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static444.aFloatArray68, 0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)V")
	public synchronized void method3224(@OriginalArg(1) long arg0) {
		@Pc(13) Class12 local13 = new Class12();
		local13.aLong248 = arg0;
		this.aClass73_30.method2012(local13);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BII)V")
	public synchronized void method3225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class12_Sub18 local8 = new Class12_Sub18(arg1);
		local8.aLong248 = arg0;
		this.aClass73_25.method2012(local8);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FI)V")
	public void method3226(@OriginalArg(0) float arg0) {
		if (this.aFloat92 != arg0) {
			this.aFloat92 = arg0;
			if (this.anInt3705 == 3) {
				this.method3248();
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ah;IIII)V")
	public void method3227(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7 = arg0.method7245();
		@Pc(14) int local14 = arg2 * this.method3205(local7);
		this.method3210(arg0);
		OpenGL.glDrawElements(4, arg1, local7, (long) local14 + arg0.method7246());
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt3700 != arg0;
		if (local15 || arg1 != this.aFloat100 || arg2 != this.aFloat88) {
			this.anInt3700 = arg0;
			this.aFloat100 = arg1;
			this.aFloat88 = arg2;
			if (local15) {
				this.aFloat99 = (float) (this.anInt3700 & 0xFF0000) / 1.671168E7F;
				this.aFloat104 = (float) (this.anInt3700 & 0xFF00) / 65280.0F;
				this.aFloat93 = (float) (this.anInt3700 & 0xFF) / 255.0F;
				this.method3217();
			}
			this.method3202();
		}
		if (arg3 == this.aFloatArray34[0] && arg4 == this.aFloatArray34[1] && arg5 == this.aFloatArray34[2]) {
			return;
		}
		this.aFloatArray34[0] = arg3;
		this.aFloatArray34[2] = arg5;
		this.aFloatArray34[1] = arg4;
		this.aFloatArray30[1] = -arg4;
		this.aFloatArray30[2] = -arg5;
		this.aFloatArray30[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg4 * arg4 + arg3 * arg3)));
		this.aFloatArray33[2] = arg5 * local142;
		this.aFloatArray33[0] = local142 * arg3;
		this.aFloatArray33[1] = local142 * arg4;
		this.aFloatArray31[1] = -this.aFloatArray33[1];
		this.aFloatArray31[2] = -this.aFloatArray33[2];
		this.aFloatArray31[0] = -this.aFloatArray33[0];
		this.method3235();
		this.anInt3683 = (int) (arg5 * 256.0F / arg4);
		this.anInt3693 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	@Override
	public void method5804(@OriginalArg(0) int arg0) {
		this.method3231();
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "(II)I")
	public int method3228(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "()Z")
	@Override
	public boolean method5833() {
		return this.aBoolean286 && (!this.method5836() || this.aBoolean306);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!sv;Lclient!sv;FLclient!sv;)Lclient!sv;")
	@Override
	public Class124 method5805(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class124 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean299 && this.aBoolean305) {
			@Pc(15) Class124_Sub1_Sub1 local15 = null;
			@Pc(18) Class124_Sub1 local18 = (Class124_Sub1) arg0;
			@Pc(21) Class124_Sub1 local21 = (Class124_Sub1) arg1;
			@Pc(25) Class79_Sub4 local25 = local18.method6602();
			@Pc(29) Class79_Sub4 local29 = local21.method6602();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local29.anInt6309 >= local25.anInt6309 ? local29.anInt6309 : local25.anInt6309;
				if (arg3 != arg0 && arg3 != arg1 && arg3 instanceof Class124_Sub1_Sub1) {
					@Pc(60) Class124_Sub1_Sub1 local60 = (Class124_Sub1_Sub1) arg3;
					if (local60.method6495() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class124_Sub1_Sub1(this, local48);
				}
				if (local15.method6497(local29, arg2, local25)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "(I)V")
	private void method3230() {
		if (this.aBoolean308 && !this.aBoolean300) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "()V")
	@Override
	public void method5794() {
		if (this.aClass12_Sub43_Sub1_1 != null && this.aClass12_Sub43_Sub1_1.method7225()) {
			this.aClass52_1.method1454(this.aClass12_Sub43_Sub1_1);
			this.aClass200_1.method4834();
		}
	}

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "(I)V")
	private void method3231() {
		@Pc(18) int local18 = 0;
		while (!this.anOpenGL1.a()) {
			if (local18++ > 5) {
				throw new RuntimeException("");
			}
			Static17.method388(1000L);
		}
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(Z)I")
	private int method3232() {
		this.aString31 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString32 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString31.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString31.indexOf("brian paul") != -1 || this.aString31.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(44) String local44 = OpenGL.glGetString(7938);
		@Pc(52) String[] local52 = Static434.method6610(local44.replace('.', ' '), ' ');
		if (local52.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(68) int local68 = Static467.method7015(local52[0]);
				@Pc(74) int local74 = Static467.method7015(local52[1]);
				this.anInt3688 = local74 + local68 * 10;
			} catch (@Pc(83) NumberFormatException local83) {
				local10 |= 0x4;
			}
		}
		if (this.anInt3688 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL1.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL1.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(117) int[] local117 = new int[1];
		OpenGL.glGetIntegerv(34018, local117, 0);
		this.anInt3695 = local117[0];
		OpenGL.glGetIntegerv(34929, local117, 0);
		this.anInt3698 = local117[0];
		OpenGL.glGetIntegerv(34930, local117, 0);
		this.anInt3710 = local117[0];
		if (this.anInt3695 < 2 || this.anInt3698 < 2 || this.anInt3710 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean292 = Stream.c();
		this.anOpenGL1.arePbuffersAvailable();
		this.aBoolean301 = this.anOpenGL1.a("GL_ARB_vertex_buffer_object");
		this.aBoolean286 = this.anOpenGL1.a("GL_ARB_multisample");
		this.aBoolean304 = this.anOpenGL1.a("GL_ARB_vertex_program");
		this.anOpenGL1.a("GL_ARB_fragment_program");
		this.aBoolean297 = this.anOpenGL1.a("GL_ARB_vertex_shader");
		this.aBoolean302 = this.anOpenGL1.a("GL_ARB_fragment_shader");
		this.aBoolean282 = this.anOpenGL1.a("GL_EXT_texture3D");
		this.aBoolean291 = this.anOpenGL1.a("GL_ARB_texture_rectangle");
		this.aBoolean299 = this.anOpenGL1.a("GL_ARB_texture_cube_map");
		this.aBoolean298 = this.anOpenGL1.a("GL_ARB_texture_float");
		this.aBoolean288 = false;
		this.aBoolean305 = this.anOpenGL1.a("GL_EXT_framebuffer_object");
		this.aBoolean284 = this.anOpenGL1.a("GL_EXT_framebuffer_blit");
		this.aBoolean307 = this.anOpenGL1.a("GL_EXT_framebuffer_multisample");
		this.aBoolean306 = this.aBoolean307 & this.aBoolean284;
		OpenGL.glGetFloatv(2834, Static444.aFloatArray68, 0);
		this.aFloat90 = Static444.aFloatArray68[0];
		this.aFloat103 = Static444.aFloatArray68[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "(I)V")
	private void method3233() {
		this.method3269(-2);
		for (@Pc(14) int local14 = this.anInt3695 - 1; local14 >= 0; local14--) {
			this.method3259(local14);
			this.method3219(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method3250(8448, 8448);
		this.method3268(2, 770, 34168);
		this.method3194();
		this.anInt3707 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3682 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean295 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean296 = true;
		this.method3263(true);
		this.method3191(true);
		this.method3236(true);
		this.method3192(true);
		this.method3238();
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
		@Pc(132) float[] local132 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(134) int local134 = 0; local134 < 8; local134++) {
			@Pc(140) int local140 = local134 + 16384;
			OpenGL.glLightfv(local140, 4608, local132, 0);
			OpenGL.glLightf(local140, 4615, 0.0F);
			OpenGL.glLightf(local140, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3700 = this.anInt3716 = -1;
		this.n();
	}

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "(I)V")
	private void method3234() {
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMultMatrixf(this.aClass91_Sub1_4.method2465(), 0);
		if (this.aBoolean294) {
			this.aClass233_1.aClass112_Sub6_1.method6049();
		}
		this.method3235();
		this.method3242();
	}

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "()V")
	@Override
	public void method5810() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "()Z")
	@Override
	public boolean method5843() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "(B)V")
	public void method3235() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray33, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray31, 0);
	}

	@OriginalMember(owner = "client!gi", name = "UA", descriptor = "(IIIII)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method3214();
		this.method3209(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(35) float local35 = (float) arg1 + 0.35F;
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local35);
		OpenGL.glVertex2f(local15 + (float) arg2, local35);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass52_1.method1449(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZZ)V")
	public void method3236(@OriginalArg(1) boolean arg0) {
		if (arg0 == this.aBoolean281) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean281 = arg0;
		this.anInt3702 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "(B)V")
	private void method3237() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray32, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "(IIII)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > this.anInt3699) {
			this.anInt3699 = arg0;
		}
		if (this.anInt3703 > arg2) {
			this.anInt3703 = arg2;
		}
		if (arg3 < this.anInt3708) {
			this.anInt3708 = arg3;
		}
		if (arg1 > this.anInt3685) {
			this.anInt3685 = arg1;
		}
		OpenGL.glEnable(3089);
		this.method3266();
		this.method3207();
	}

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "(I)V")
	public void method3238() {
		if (this.anInt3705 != 0) {
			this.anInt3702 &= 0xFFFFFFE0;
			this.anInt3705 = 0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIZB)V")
	public void method3239(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 != this.anInt3687) {
			if (arg1 < 0) {
				this.method3194();
				this.method3219(null);
				this.method3257(0);
				if (!this.aBoolean294) {
					this.aClass233_1.method5630(arg2, 0, 0, 0, arg0);
				}
			} else {
				@Pc(20) Class79_Sub2 local20 = this.aClass200_1.method4838(arg1);
				@Pc(26) Class278 local26 = super.anInterface11_11.method6215(arg1);
				if (local26.aByte82 == 0 && local26.aByte88 == 0) {
					this.method3194();
				} else {
					@Pc(47) int local47 = local26.aBoolean567 ? 64 : 128;
					@Pc(51) int local51 = local47 * 50;
					this.method3213(0.0F, (float) (local26.aByte82 * (this.anInt3674 % local51)) / (float) local51, (float) (this.anInt3674 % local51 * local26.aByte88) / (float) local51);
				}
				if (this.aBoolean294) {
					this.method3219(local20);
					this.method3257(local26.anInt8273);
				} else {
					this.aClass233_1.method5630(arg2, local26.anInt8271, local26.aByte87, local26.aByte83, arg0);
					if (!this.aClass233_1.method5628(local20, local26.anInt8273)) {
						this.method3219(local20);
						this.method3257(local26.anInt8273);
					}
				}
			}
			this.anInt3687 = arg1;
		}
		this.anInt3702 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public Class145 method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static81.method1824(arg2, arg3, arg1, this, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "(IIII)V")
	@Override
	public void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3666 < arg2) {
			arg2 = this.anInt3666;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt3515 < arg3) {
			arg3 = this.anInt3515;
		}
		this.anInt3699 = arg0;
		this.anInt3708 = arg3;
		this.anInt3685 = arg1;
		this.anInt3703 = arg2;
		OpenGL.glEnable(3089);
		this.method3266();
		this.method3207();
	}

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "(B)V")
	private void method3240() {
		OpenGL.glViewport(this.bf, this.anInt3691, this.anInt3666, this.anInt3515);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!dd;Lclient!dd;Lclient!dd;ILclient!dd;)V")
	public void method3241(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(4) Class65 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method3267(arg2.anInterface14_1);
			OpenGL.glVertexPointer(arg2.aByte36, arg2.aShort39, this.anInterface14_3.method6391(), this.anInterface14_3.method6392() + (long) arg2.aByte35);
			OpenGL.glEnableClientState(32884);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method3267(arg1.anInterface14_1);
			OpenGL.glNormalPointer(arg1.aShort39, this.anInterface14_3.method6391(), this.anInterface14_3.method6392() + (long) arg1.aByte35);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method3267(arg0.anInterface14_1);
			OpenGL.glColorPointer(arg0.aByte36, arg0.aShort39, this.anInterface14_3.method6391(), this.anInterface14_3.method6392() + (long) arg0.aByte35);
			OpenGL.glEnableClientState(32886);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method3267(arg3.anInterface14_1);
			OpenGL.glTexCoordPointer(arg3.aByte36, arg3.aShort39, this.anInterface14_3.method6391(), this.anInterface14_3.method6392() + (long) arg3.aByte35);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass91_Sub1_4.aFloat68 + this.aClass91_Sub1_4.aFloat70 * (float) arg0 + (float) arg1 * this.aClass91_Sub1_4.aFloat71 + (float) arg2 * this.aClass91_Sub1_4.aFloat67;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = this.aClass91_Sub1_4.aFloat71 * (float) arg4 + (float) arg3 * this.aClass91_Sub1_4.aFloat70 + this.aClass91_Sub1_4.aFloat67 * (float) arg5 + this.aClass91_Sub1_4.aFloat68;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if (local28 < (float) this.anInt3715 && local59 < (float) this.anInt3715 || !(!((float) this.anInt3712 < local28) || !((float) this.anInt3712 < local59))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((float) this.anInt3689 * (this.aClass91_Sub1_4.aFloat61 + (float) arg2 * this.aClass91_Sub1_4.aFloat72 + (float) arg1 * this.aClass91_Sub1_4.aFloat65 + this.aClass91_Sub1_4.aFloat64 * (float) arg0) / local28);
		@Pc(155) int local155 = (int) ((this.aClass91_Sub1_4.aFloat61 + (float) arg5 * this.aClass91_Sub1_4.aFloat72 + (float) arg4 * this.aClass91_Sub1_4.aFloat65 + this.aClass91_Sub1_4.aFloat64 * (float) arg3) * (float) this.anInt3689 / local59);
		if ((float) local123 < this.aFloat89 && this.aFloat89 > (float) local155 || (float) local123 > this.aFloat102 && (float) local155 > this.aFloat102) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((this.aClass91_Sub1_4.aFloat69 + this.aClass91_Sub1_4.aFloat66 * (float) arg0 + this.aClass91_Sub1_4.aFloat62 * (float) arg1 + this.aClass91_Sub1_4.aFloat63 * (float) arg2) * (float) this.anInt3713 / local28);
			@Pc(245) int local245 = (int) ((this.aClass91_Sub1_4.aFloat69 + (float) arg4 * this.aClass91_Sub1_4.aFloat62 + (float) arg3 * this.aClass91_Sub1_4.aFloat66 + this.aClass91_Sub1_4.aFloat63 * (float) arg5) * (float) this.anInt3713 / local59);
			return (!(this.aFloat91 > (float) local213) || !((float) local245 < this.aFloat91)) && (!(this.aFloat105 < (float) local213) || !(this.aFloat105 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!gi", name = "CA", descriptor = "()I")
	@Override
	public int CA() {
		return this.anInt3712;
	}

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "(B)V")
	private void method3242() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3696; local7++) {
			@Pc(14) Class12_Sub7 local14 = this.aClass12_Sub7Array3[local7];
			Static274.aFloatArray41[0] = local14.method5124();
			@Pc(25) int local25 = local7 + 16386;
			Static274.aFloatArray41[1] = local14.method5120();
			Static274.aFloatArray41[2] = local14.method5117();
			Static274.aFloatArray41[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static274.aFloatArray41, 0);
			@Pc(52) int local52 = local14.method5118();
			@Pc(58) float local58 = local14.method5125() / 255.0F;
			Static274.aFloatArray41[2] = (float) (local52 & 0xFF) * local58;
			Static274.aFloatArray41[1] = local58 * (float) (local52 >> 8 & 0xFF);
			Static274.aFloatArray41[0] = (float) (local52 >> 16 & 0xFF) * local58;
			OpenGL.glLightfv(local25, 4609, Static274.aFloatArray41, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method5123() * local14.method5123()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt3697) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt3697 = this.anInt3696;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(ILclient!ct;)V")
	public void method3243(@OriginalArg(1) Interface4 arg0) {
		if (this.anInt3676 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3676 >= 0) {
			this.anInterface4Array1[this.anInt3676].method273();
		}
		this.anInterface4_1 = this.anInterface4Array1[++this.anInt3676] = arg0;
		this.anInterface4_1.method270();
	}

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class145_Sub2 local6 = (Class145_Sub2) arg1;
		@Pc(9) Class79_Sub2_Sub1 local9 = local6.aClass79_Sub2_Sub1_4;
		this.method3247();
		this.method3219(local6.aClass79_Sub2_Sub1_4);
		this.method3209(1);
		this.method3250(7681, 8448);
		this.method3268(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat73 / (float) local9.anInt2822;
		@Pc(46) float local46 = local9.aFloat74 / (float) local9.anInt2824;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt3699 - arg2) * local39, local46 * (float) (this.anInt3685 - arg3));
		OpenGL.glVertex2i(this.anInt3699, this.anInt3685);
		OpenGL.glTexCoord2f((float) (this.anInt3699 - arg2) * local39, (float) (this.anInt3708 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3699, this.anInt3708);
		OpenGL.glTexCoord2f((float) (this.anInt3703 - arg2) * local39, (float) (this.anInt3708 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3703, this.anInt3708);
		OpenGL.glTexCoord2f((float) (this.anInt3703 - arg2) * local39, (float) (this.anInt3685 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3703, this.anInt3685);
		OpenGL.glEnd();
		this.method3268(0, 768, 5890);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method5851(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "()Z")
	@Override
	public boolean method5848() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZIILclient!jaclib/memory/Buffer;)Lclient!qd;")
	public Interface14 method3244(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Buffer arg2) {
		return (Interface14) (this.aBoolean301 ? new Class108_Sub1(this, arg0, arg2, arg1, false) : new Class168_Sub1(this, arg0, arg2));
	}

	@OriginalMember(owner = "client!gi", name = "xa", descriptor = "()V")
	@Override
	public void xa() {
		this.aBoolean294 = false;
		this.aClass233_1.method5630(false, 0, 0, 0, false);
		this.method3222();
		this.method3258();
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "(B)V")
	public void method3245() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!en;I)V")
	public void method3246(@OriginalArg(0) Class91_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method2465(), 0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!r;")
	@Override
	public Class26 method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class26_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
	@Override
	public void method5806(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gi", name = "Z", descriptor = "(I)V")
	@Override
	public void Z(@OriginalArg(0) int arg0) {
		this.method3209(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "(I)V")
	public void method3247() {
		if (this.anInt3702 == 2) {
			return;
		}
		this.method3262();
		this.method3263(false);
		this.method3191(false);
		this.method3236(false);
		this.method3192(false);
		this.method3269(-2);
		this.anInt3702 = 2;
	}

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "()V")
	@Override
	public void method5821() throws Exception_Sub1 {
		try {
			this.anOpenGL1.swapBuffers();
		} catch (@Pc(8) Exception local8) {
		}
	}

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "(B)V")
	private void method3248() {
		@Pc(15) float local15 = (float) -this.anInt3706 * this.aFloat92 / (float) this.anInt3689;
		@Pc(33) float local33 = (float) -this.anInt3681 * this.aFloat92 / (float) this.anInt3713;
		@Pc(48) float local48 = this.aFloat92 * (float) (this.anInt3666 - this.anInt3706) / (float) this.anInt3689;
		@Pc(62) float local62 = this.aFloat92 * (float) (this.anInt3515 - this.anInt3681) / (float) this.anInt3713;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local15 != local48 && local62 != local33) {
			OpenGL.glOrtho((double) local15, (double) local48, (double) -local62, (double) -local33, (double) ((float) this.anInt3715 - this.aFloat87), (double) ((float) this.anInt3712 - this.aFloat87));
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class145_Sub2 local6 = (Class145_Sub2) arg5;
		@Pc(9) Class79_Sub2_Sub1 local9 = local6.aClass79_Sub2_Sub1_4;
		this.method3247();
		this.method3219(local6.aClass79_Sub2_Sub1_4);
		this.method3209(1);
		this.method3250(7681, 8448);
		this.method3268(0, 768, 34167);
		@Pc(39) float local39 = local9.aFloat73 / (float) local9.anInt2822;
		@Pc(46) float local46 = local9.aFloat74 / (float) local9.anInt2824;
		@Pc(52) float local52 = (float) arg2 - (float) arg0;
		@Pc(58) float local58 = (float) arg3 - (float) arg1;
		@Pc(71) float local71 = (float) (1.0D / Math.sqrt((double) (local58 * local58 + local52 * local52)));
		@Pc(75) float local75 = local52 * local71;
		@Pc(79) float local79 = local58 * local71;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f((float) (arg0 - arg6) * local39, local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f(local75 + (float) arg2 + 0.35F, local79 + (float) arg3 + 0.35F);
		OpenGL.glEnd();
		this.method3268(0, 768, 5890);
	}

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "()Z")
	@Override
	public boolean method5823() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ct;B)V")
	public void method3249(@OriginalArg(0) Interface4 arg0) {
		if (this.anInt3676 < 0 || arg0 != this.anInterface4Array1[this.anInt3676]) {
			throw new RuntimeException();
		}
		this.anInterface4Array1[this.anInt3676--] = null;
		arg0.method273();
		if (this.anInt3676 >= 0) {
			this.anInterface4_1 = this.anInterface4Array1[this.anInt3676];
			this.anInterface4_1.method270();
		} else {
			this.anInterface4_1 = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = local8 + (float) arg2 - 1.0F;
		this.method3214();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method3209(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean286) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean286) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "()Lclient!m;")
	@Override
	public Class91 method5847() {
		return this.aClass91_Sub1_1;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZII)V")
	public void method3250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3714 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			OpenGL.glTexEnvi(8960, 34162, arg1);
			return;
		}
		@Pc(15) boolean local15 = false;
		if (this.anInt3686 != arg0) {
			OpenGL.glTexEnvi(8960, 34161, arg0);
			local15 = true;
			this.anInt3686 = arg0;
		}
		if (arg1 != this.anInt3694) {
			OpenGL.glTexEnvi(8960, 34162, arg1);
			this.anInt3694 = arg1;
			local15 = true;
		}
		if (local15) {
			this.anInt3702 &= 0xFFFFFFE2;
			return;
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(Z)V")
	private void method3251() {
		OpenGL.glDepthMask(this.aBoolean293 && this.aBoolean289);
	}

	@OriginalMember(owner = "client!gi", name = "IA", descriptor = "(III[I)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass91_Sub1_4.aFloat68 + (float) arg2 * this.aClass91_Sub1_4.aFloat67 + (float) arg1 * this.aClass91_Sub1_4.aFloat71 + this.aClass91_Sub1_4.aFloat70 * (float) arg0;
		if ((float) this.anInt3715 > local28 || local28 > (float) this.anInt3712) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt3689 * (this.aClass91_Sub1_4.aFloat72 * (float) arg2 + this.aClass91_Sub1_4.aFloat65 * (float) arg1 + (float) arg0 * this.aClass91_Sub1_4.aFloat64 + this.aClass91_Sub1_4.aFloat61) / local28);
		@Pc(117) int local117 = (int) (((float) arg2 * this.aClass91_Sub1_4.aFloat63 + (float) arg0 * this.aClass91_Sub1_4.aFloat66 + this.aClass91_Sub1_4.aFloat62 * (float) arg1 + this.aClass91_Sub1_4.aFloat69) * (float) this.anInt3713 / local28);
		if (this.aFloat89 <= (float) local85 && (float) local85 <= this.aFloat102 && (float) local117 >= this.aFloat91 && this.aFloat105 >= (float) local117) {
			arg3[1] = (int) ((float) local117 - this.aFloat91);
			arg3[2] = (int) local28;
			arg3[0] = (int) ((float) local85 - this.aFloat89);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5846(@OriginalArg(0) Canvas arg0) {
		this.aLong99 = 0L;
		this.aCanvas7 = null;
		if (arg0 == null || this.aCanvas8 == arg0) {
			this.aLong99 = this.aLong98;
			this.aCanvas7 = this.aCanvas8;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable7.get(arg0);
			this.aLong99 = local26;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong99 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.setSurface(this.aLong99);
		this.method3220();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIF)Lclient!rh;")
	@Override
	public Class12_Sub7 method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class12_Sub7_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZ[BI)Lclient!ah;")
	public Interface2 method3252(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		return (Interface2) (this.aBoolean301 && (!arg1 || this.aBoolean303) ? new Class108_Sub2(this, 5123, arg2, arg0, arg1) : new Class168_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!en;)V")
	public void method3253(@OriginalArg(1) Class91_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method2465(), 0);
	}

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "(B)V")
	public void method3254() {
		if (this.anInt3702 == 4) {
			return;
		}
		this.method3262();
		this.method3263(false);
		this.method3191(false);
		this.method3236(false);
		this.method3192(false);
		this.method3269(-2);
		this.method3209(1);
		this.anInt3702 = 4;
	}

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "(II)I")
	public int method3255(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!gi", name = "JA", descriptor = "(IIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean294) {
			throw new RuntimeException("");
		}
		this.anInt3709 = arg0;
		this.anInt3690 = arg1;
		this.anInt3684 = arg3;
		this.anInt3692 = arg2;
		this.aClass233_1.aClass112_Sub6_1.method6049();
		this.method3222();
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5799(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas8 == arg0) {
			local5 = this.aLong98;
		} else if (this.aHashtable7.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable7.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL1.surfaceResized(local5);
		if (arg0 == this.aCanvas7) {
			this.method3220();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!hp;)V")
	@Override
	public void method5856(@OriginalArg(0) Class136 arg0) {
		this.aClass183_1.method4572(arg0, this);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Lclient!ct;I)V")
	public void method3256(@OriginalArg(0) Interface4 arg0) {
		if (this.aBoolean284) {
			this.method3271(arg0);
			this.method3249(arg0);
		} else if (this.anInt3677 >= 0 && this.anInterface4Array2[this.anInt3677] == arg0) {
			this.anInterface4Array2[this.anInt3677--] = null;
			arg0.method269();
			if (this.anInt3677 >= 0) {
				this.anInterface4_2 = this.anInterface4_1 = this.anInterface4Array2[this.anInt3677];
				this.anInterface4_2.method268();
			} else {
				this.anInterface4_2 = this.anInterface4_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
	public void method3257(@OriginalArg(1) int arg0) {
		if (arg0 == 1) {
			this.method3250(7681, 7681);
		} else if (arg0 == 0) {
			this.method3250(8448, 8448);
		} else if (arg0 == 2) {
			this.method3250(34165, 7681);
		} else if (arg0 == 3) {
			this.method3250(260, 8448);
			return;
		} else if (arg0 == 4) {
			this.method3250(34023, 34023);
			return;
		}
	}

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "(B)V")
	private void method3258() {
		if (this.aBoolean283 && this.aBoolean294 | this.anInt3704 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "()Z")
	@Override
	public boolean method5808() {
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "()Z")
	@Override
	public boolean method5853() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "()I")
	@Override
	public int method5825() {
		return 4;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V")
	@Override
	public void method5815(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3668 = arg0;
		this.aClass200_1.method4834();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
	@Override
	public void method5822(@OriginalArg(0) boolean arg0) {
		this.aBoolean289 = arg0;
		this.method3251();
	}

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "(II)V")
	public void method3259(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt3714) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3714 = arg0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "(B)V")
	private void method3260() {
		this.aClass91_Sub1_4 = new Class91_Sub1();
		this.aClass91_Sub1_3 = new Class91_Sub1();
		this.aClass79Array1 = new Class79[this.anInt3695];
		this.aClass79_Sub2_2 = new Class79_Sub2(this, 3553, 6408, 1, 1);
		new Class79_Sub2(this, 3553, 6408, 1, 1);
		new Class79_Sub2(this, 3553, 6408, 1, 1);
		this.aClass26_Sub3_3 = new Class26_Sub3(this);
		this.aClass26_Sub3_8 = new Class26_Sub3(this);
		this.aClass26_Sub3_5 = new Class26_Sub3(this);
		this.aClass26_Sub3_7 = new Class26_Sub3(this);
		this.aClass26_Sub3_10 = new Class26_Sub3(this);
		this.aClass26_Sub3_2 = new Class26_Sub3(this);
		this.aClass26_Sub3_1 = new Class26_Sub3(this);
		this.aClass26_Sub3_9 = new Class26_Sub3(this);
		this.aClass26_Sub3_6 = new Class26_Sub3(this);
		this.aClass26_Sub3_4 = new Class26_Sub3(this);
		if (this.aBoolean305) {
			this.aClass9_4 = new Class9(this);
			new Class9(this);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZI[B)Lclient!qd;")
	public Interface14 method3261(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface14) (this.aBoolean301 && (!arg1 || this.aBoolean303) ? new Class108_Sub1(this, arg0, arg3, arg2, arg1) : new Class168_Sub1(this, arg0, arg3, arg2));
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "()V")
	@Override
	public void method5792() {
		this.method3192(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "(I)V")
	private void method3262() {
		if (this.anInt3705 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3666 > 0 && this.anInt3515 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3666, (double) this.anInt3515, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3702 &= 0xFFFFFFE7;
		this.anInt3705 = 1;
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		@Pc(23) float local23 = local13 + (float) arg3;
		this.method3214();
		this.method3209(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean286) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local23);
		OpenGL.glVertex2f(local18, local23);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean286) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V")
	@Override
	public void method5837(@OriginalArg(0) int arg0) {
		this.method3215();
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(ZZ)V")
	public void method3263(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean283 != arg0) {
			this.aBoolean283 = arg0;
			this.method3258();
			this.anInt3702 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!sv;)V")
	@Override
	public void method5801(@OriginalArg(0) Class124 arg0) {
		this.aClass124_Sub1_1 = (Class124_Sub1) arg0;
	}

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "(F)V")
	@Override
	public void M(@OriginalArg(0) float arg0) {
		if (this.aFloat85 != arg0) {
			this.aFloat85 = arg0;
			this.method3217();
		}
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)V")
	@Override
	public void method5863(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "(II)V")
	public synchronized void method3264(@OriginalArg(1) int arg0) {
		@Pc(15) Class12_Sub18 local15 = new Class12_Sub18(arg0);
		this.aClass73_27.method2012(local15);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FIF)V")
	public void method3265(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat95 = arg1;
		this.aFloat83 = arg0;
		if (!this.aBoolean294) {
			this.method3222();
		}
	}

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "(B)V")
	private void method3266() {
		this.aFloat105 = this.anInt3708 - this.anInt3681;
		this.aFloat91 = this.anInt3685 - this.anInt3681;
		this.aFloat102 = this.anInt3703 - this.anInt3706;
		this.aFloat89 = this.anInt3699 - this.anInt3706;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt3715;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!qd;)V")
	public void method3267(@OriginalArg(1) Interface14 arg0) {
		if (arg0 != this.anInterface14_3) {
			if (this.aBoolean301) {
				OpenGL.glBindBufferARB(34962, arg0.method6393());
			}
			this.anInterface14_3 = arg0;
		}
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(IIII)V")
	public void method3268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glTexEnvi(8960, arg0 + 34176, arg2);
		OpenGL.glTexEnvi(8960, arg0 + 34192, arg1);
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(IB)V")
	public void method3269(@OriginalArg(0) int arg0) {
		this.method3199(arg0, true);
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(II)I")
	@Override
	public int method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg1 & arg0;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "()Z")
	@Override
	public boolean method5798() {
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3689 = arg2;
		this.anInt3681 = arg1;
		this.anInt3706 = arg0;
		this.anInt3713 = arg3;
		this.method3218();
		this.method3266();
		if (this.anInt3705 == 3) {
			this.method3248();
		} else if (this.anInt3705 == 2) {
			this.method3237();
			return;
		}
	}

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "(I)Lclient!nm;")
	public Class79_Sub4 method3270() {
		return this.aClass124_Sub1_1 == null ? null : this.aClass124_Sub1_1.method6602();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!kn;I)V")
	@Override
	public void method5860(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class7_Sub4[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			if (arg0[local3] != null) {
				arg0[local3].method8003(arg1, arg2 == null ? null : arg2[local3], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!ct;)V")
	public void method3271(@OriginalArg(1) Interface4 arg0) {
		if (this.anInt3675 < 0 || this.anInterface4Array3[this.anInt3675] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface4Array3[this.anInt3675--] = null;
		arg0.method271();
		if (this.anInt3675 >= 0) {
			this.anInterface4_2 = this.anInterface4Array3[this.anInt3675];
			this.anInterface4_2.method272();
		} else {
			this.anInterface4_2 = null;
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(ZZ)V")
	public void method3272(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean300 != arg0) {
			this.aBoolean300 = arg0;
			this.method3230();
		}
	}
}
