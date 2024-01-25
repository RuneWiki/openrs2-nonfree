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

@OriginalClass("client!er")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!er", name = "y", descriptor = "I")
	private int anInt2950;

	@OriginalMember(owner = "client!er", name = "Kc", descriptor = "I")
	public int anInt3063;

	@OriginalMember(owner = "client!er", name = "Uc", descriptor = "I")
	private int anInt3073;

	@OriginalMember(owner = "client!er", name = "pd", descriptor = "I")
	public int anInt3093;

	@OriginalMember(owner = "client!er", name = "pe", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!er", name = "ue", descriptor = "I")
	public int anInt3134;

	@OriginalMember(owner = "client!er", name = "xe", descriptor = "Lclient!nb;")
	private Class219 aClass219_1;

	@OriginalMember(owner = "client!er", name = "ze", descriptor = "Lclient!sk;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!er", name = "Ce", descriptor = "Lclient!sk;")
	private Interface20 anInterface20_2;

	@OriginalMember(owner = "client!er", name = "Ee", descriptor = "Lclient!wfa;")
	private Class73_Sub3 aClass73_Sub3_1;

	@OriginalMember(owner = "client!er", name = "He", descriptor = "I")
	private int anInt3138;

	@OriginalMember(owner = "client!er", name = "Je", descriptor = "I")
	public int anInt3139;

	@OriginalMember(owner = "client!er", name = "Ke", descriptor = "I")
	public int anInt3140;

	@OriginalMember(owner = "client!er", name = "Le", descriptor = "I")
	private int anInt3141;

	@OriginalMember(owner = "client!er", name = "Se", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "client!er", name = "Ue", descriptor = "Z")
	private boolean aBoolean201;

	@OriginalMember(owner = "client!er", name = "Ve", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!er", name = "We", descriptor = "I")
	private int anInt3142;

	@OriginalMember(owner = "client!er", name = "Xe", descriptor = "Z")
	private boolean aBoolean202;

	@OriginalMember(owner = "client!er", name = "Ye", descriptor = "Z")
	private boolean aBoolean203;

	@OriginalMember(owner = "client!er", name = "Ze", descriptor = "I")
	private int anInt3143;

	@OriginalMember(owner = "client!er", name = "af", descriptor = "I")
	private int anInt3144;

	@OriginalMember(owner = "client!er", name = "hf", descriptor = "I")
	public int anInt3146;

	@OriginalMember(owner = "client!er", name = "jf", descriptor = "Lclient!cu;")
	private Class47_Sub2 aClass47_Sub2_1;

	@OriginalMember(owner = "client!er", name = "kf", descriptor = "Z")
	public boolean aBoolean205;

	@OriginalMember(owner = "client!er", name = "mf", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_1;

	@OriginalMember(owner = "client!er", name = "nf", descriptor = "I")
	private int anInt3147;

	@OriginalMember(owner = "client!er", name = "of", descriptor = "F")
	private float aFloat78;

	@OriginalMember(owner = "client!er", name = "pf", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!er", name = "sf", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_2;

	@OriginalMember(owner = "client!er", name = "tf", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_3;

	@OriginalMember(owner = "client!er", name = "vf", descriptor = "I")
	public int anInt3148;

	@OriginalMember(owner = "client!er", name = "wf", descriptor = "I")
	private int anInt3149;

	@OriginalMember(owner = "client!er", name = "zf", descriptor = "I")
	private int anInt3151;

	@OriginalMember(owner = "client!er", name = "Af", descriptor = "Lclient!nb;")
	public Class219 aClass219_2;

	@OriginalMember(owner = "client!er", name = "Ef", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_4;

	@OriginalMember(owner = "client!er", name = "Ff", descriptor = "I")
	public int anInt3154;

	@OriginalMember(owner = "client!er", name = "Gf", descriptor = "Lclient!wh;")
	public Class50_Sub1 aClass50_Sub1_2;

	@OriginalMember(owner = "client!er", name = "If", descriptor = "I")
	public int anInt3155;

	@OriginalMember(owner = "client!er", name = "Kf", descriptor = "Lclient!mk;")
	public Class208 aClass208_8;

	@OriginalMember(owner = "client!er", name = "Lf", descriptor = "Z")
	public boolean aBoolean212;

	@OriginalMember(owner = "client!er", name = "Nf", descriptor = "F")
	public float aFloat81;

	@OriginalMember(owner = "client!er", name = "Rf", descriptor = "Z")
	public boolean aBoolean213;

	@OriginalMember(owner = "client!er", name = "Sf", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_5;

	@OriginalMember(owner = "client!er", name = "Tf", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!er", name = "Uf", descriptor = "Z")
	private boolean aBoolean215;

	@OriginalMember(owner = "client!er", name = "Wf", descriptor = "Ljava/lang/String;")
	private String aString69;

	@OriginalMember(owner = "client!er", name = "Xf", descriptor = "Z")
	public boolean aBoolean216;

	@OriginalMember(owner = "client!er", name = "Zf", descriptor = "I")
	private int anInt3159;

	@OriginalMember(owner = "client!er", name = "ag", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!er", name = "bg", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_6;

	@OriginalMember(owner = "client!er", name = "cg", descriptor = "F")
	public float aFloat84;

	@OriginalMember(owner = "client!er", name = "eg", descriptor = "Z")
	private boolean aBoolean217;

	@OriginalMember(owner = "client!er", name = "gg", descriptor = "F")
	public float aFloat85;

	@OriginalMember(owner = "client!er", name = "hg", descriptor = "I")
	private int anInt3161;

	@OriginalMember(owner = "client!er", name = "ig", descriptor = "Lclient!vd;")
	private Interface22 anInterface22_3;

	@OriginalMember(owner = "client!er", name = "og", descriptor = "I")
	private int anInt3164;

	@OriginalMember(owner = "client!er", name = "vg", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_7;

	@OriginalMember(owner = "client!er", name = "wg", descriptor = "Lclient!lga;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!er", name = "yg", descriptor = "Z")
	private boolean aBoolean220;

	@OriginalMember(owner = "client!er", name = "zg", descriptor = "Z")
	public boolean aBoolean221;

	@OriginalMember(owner = "client!er", name = "Ag", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!er", name = "Bg", descriptor = "Z")
	public boolean aBoolean223;

	@OriginalMember(owner = "client!er", name = "Gg", descriptor = "[Lclient!ep;")
	private Class50[] aClass50Array1;

	@OriginalMember(owner = "client!er", name = "Hg", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_8;

	@OriginalMember(owner = "client!er", name = "Ig", descriptor = "Lclient!mk;")
	public Class208 aClass208_9;

	@OriginalMember(owner = "client!er", name = "Jg", descriptor = "F")
	public float aFloat91;

	@OriginalMember(owner = "client!er", name = "Kg", descriptor = "Z")
	private boolean aBoolean224;

	@OriginalMember(owner = "client!er", name = "Mg", descriptor = "F")
	public float aFloat92;

	@OriginalMember(owner = "client!er", name = "Ng", descriptor = "Lclient!cea;")
	private Class50_Sub1_Sub1 aClass50_Sub1_Sub1_2;

	@OriginalMember(owner = "client!er", name = "Pg", descriptor = "Z")
	public boolean aBoolean225;

	@OriginalMember(owner = "client!er", name = "Rg", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_9;

	@OriginalMember(owner = "client!er", name = "Sg", descriptor = "I")
	private int anInt3173;

	@OriginalMember(owner = "client!er", name = "Tg", descriptor = "Lclient!d;")
	public Class52_Sub2 aClass52_Sub2_10;

	@OriginalMember(owner = "client!er", name = "Ug", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!er", name = "Vg", descriptor = "F")
	private float aFloat93;

	@OriginalMember(owner = "client!er", name = "Xg", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!er", name = "ah", descriptor = "Lclient!vd;")
	private Interface22 anInterface22_4;

	@OriginalMember(owner = "client!er", name = "eh", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!er", name = "fh", descriptor = "F")
	private float aFloat94;

	@OriginalMember(owner = "client!er", name = "gh", descriptor = "F")
	public float aFloat95;

	@OriginalMember(owner = "client!er", name = "kh", descriptor = "I")
	private int anInt3179;

	@OriginalMember(owner = "client!er", name = "ph", descriptor = "I")
	private int anInt3180;

	@OriginalMember(owner = "client!er", name = "ce", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!er", name = "je", descriptor = "I")
	public int anInt3130 = 128;

	@OriginalMember(owner = "client!er", name = "ie", descriptor = "Lclient!ag;")
	private final Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!er", name = "me", descriptor = "Lclient!bt;")
	private final Class42_Sub1 aClass42_Sub1_1 = new Class42_Sub1();

	@OriginalMember(owner = "client!er", name = "ne", descriptor = "Lclient!bt;")
	public final Class42_Sub1 aClass42_Sub1_2 = new Class42_Sub1();

	@OriginalMember(owner = "client!er", name = "oe", descriptor = "I")
	public int anInt3132 = 8;

	@OriginalMember(owner = "client!er", name = "se", descriptor = "I")
	public int anInt3133 = 3;

	@OriginalMember(owner = "client!er", name = "qe", descriptor = "Z")
	private boolean aBoolean199 = false;

	@OriginalMember(owner = "client!er", name = "re", descriptor = "Lclient!or;")
	private final Class244 aClass244_26 = new Class244();

	@OriginalMember(owner = "client!er", name = "we", descriptor = "[Lclient!sk;")
	private final Interface20[] anInterface20Array1 = new Interface20[4];

	@OriginalMember(owner = "client!er", name = "Ae", descriptor = "I")
	private int anInt3137 = -1;

	@OriginalMember(owner = "client!er", name = "ye", descriptor = "I")
	private int anInt3136 = -1;

	@OriginalMember(owner = "client!er", name = "ve", descriptor = "I")
	private int anInt3135 = -1;

	@OriginalMember(owner = "client!er", name = "De", descriptor = "[Lclient!sk;")
	private final Interface20[] anInterface20Array3 = new Interface20[4];

	@OriginalMember(owner = "client!er", name = "Be", descriptor = "[Lclient!sk;")
	private final Interface20[] anInterface20Array2 = new Interface20[4];

	@OriginalMember(owner = "client!er", name = "Fe", descriptor = "Lclient!ce;")
	private final Class49 aClass49_2 = new Class49();

	@OriginalMember(owner = "client!er", name = "Ge", descriptor = "Lclient!sba;")
	private final Class297 aClass297_10 = new Class297(16);

	@OriginalMember(owner = "client!er", name = "Ie", descriptor = "Lclient!or;")
	private final Class244 aClass244_27 = new Class244();

	@OriginalMember(owner = "client!er", name = "Me", descriptor = "Lclient!or;")
	private final Class244 aClass244_28 = new Class244();

	@OriginalMember(owner = "client!er", name = "Ne", descriptor = "Lclient!or;")
	private final Class244 aClass244_29 = new Class244();

	@OriginalMember(owner = "client!er", name = "Oe", descriptor = "Lclient!or;")
	private final Class244 aClass244_30 = new Class244();

	@OriginalMember(owner = "client!er", name = "Pe", descriptor = "Lclient!or;")
	private final Class244 aClass244_31 = new Class244();

	@OriginalMember(owner = "client!er", name = "Qe", descriptor = "Lclient!or;")
	private final Class244 aClass244_32 = new Class244();

	@OriginalMember(owner = "client!er", name = "Re", descriptor = "Lclient!or;")
	private final Class244 aClass244_33 = new Class244();

	@OriginalMember(owner = "client!er", name = "Te", descriptor = "Lclient!bt;")
	public final Class42_Sub1 aClass42_Sub1_3 = new Class42_Sub1();

	@OriginalMember(owner = "client!er", name = "bf", descriptor = "Lclient!bt;")
	public final Class42_Sub1 bf = new Class42_Sub1();

	@OriginalMember(owner = "client!er", name = "cf", descriptor = "Lclient!bt;")
	public final Class42_Sub1 aClass42_Sub1_4 = new Class42_Sub1();

	@OriginalMember(owner = "client!er", name = "yf", descriptor = "I")
	private int anInt3150 = -1;

	@OriginalMember(owner = "client!er", name = "ff", descriptor = "[F")
	private final float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!er", name = "Of", descriptor = "I")
	private int anInt3156 = 0;

	@OriginalMember(owner = "client!er", name = "lf", descriptor = "F")
	private float aFloat77 = 1.0F;

	@OriginalMember(owner = "client!er", name = "kg", descriptor = "I")
	public int anInt3163 = 0;

	@OriginalMember(owner = "client!er", name = "Pf", descriptor = "F")
	private float aFloat82 = -1.0F;

	@OriginalMember(owner = "client!er", name = "uf", descriptor = "[F")
	public final float[] aFloatArray29 = new float[4];

	@OriginalMember(owner = "client!er", name = "Mf", descriptor = "F")
	public float aFloat80 = 3584.0F;

	@OriginalMember(owner = "client!er", name = "sg", descriptor = "I")
	public int anInt3166 = -1;

	@OriginalMember(owner = "client!er", name = "ng", descriptor = "F")
	private float aFloat87 = 1.0F;

	@OriginalMember(owner = "client!er", name = "Df", descriptor = "I")
	private int anInt3153 = 0;

	@OriginalMember(owner = "client!er", name = "df", descriptor = "F")
	public float aFloat76 = 1.0F;

	@OriginalMember(owner = "client!er", name = "mg", descriptor = "F")
	public float aFloat86 = 1.0F;

	@OriginalMember(owner = "client!er", name = "tg", descriptor = "I")
	private int anInt3167 = 8448;

	@OriginalMember(owner = "client!er", name = "qg", descriptor = "I")
	private int anInt3165 = 0;

	@OriginalMember(owner = "client!er", name = "Jf", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!er", name = "Qf", descriptor = "F")
	private float aFloat83 = -1.0F;

	@OriginalMember(owner = "client!er", name = "gf", descriptor = "I")
	public int anInt3145 = 512;

	@OriginalMember(owner = "client!er", name = "Vf", descriptor = "I")
	public int anInt3157 = 512;

	@OriginalMember(owner = "client!er", name = "Fg", descriptor = "F")
	public float aFloat90 = -1.0F;

	@OriginalMember(owner = "client!er", name = "xf", descriptor = "F")
	private float aFloat79 = 0.0F;

	@OriginalMember(owner = "client!er", name = "dg", descriptor = "I")
	public int anInt3160 = 0;

	@OriginalMember(owner = "client!er", name = "jg", descriptor = "I")
	public int anInt3162 = -1;

	@OriginalMember(owner = "client!er", name = "Og", descriptor = "I")
	public int anInt3172 = 50;

	@OriginalMember(owner = "client!er", name = "Dg", descriptor = "F")
	public float aFloat89 = 3584.0F;

	@OriginalMember(owner = "client!er", name = "Eg", descriptor = "I")
	private int anInt3170 = 8448;

	@OriginalMember(owner = "client!er", name = "Yf", descriptor = "I")
	public int anInt3158 = -1;

	@OriginalMember(owner = "client!er", name = "fg", descriptor = "[Lclient!cp;")
	private final Class3_Sub9[] aClass3_Sub9Array3 = new Class3_Sub9[Static8.anInt54];

	@OriginalMember(owner = "client!er", name = "Wg", descriptor = "Z")
	private boolean aBoolean226 = true;

	@OriginalMember(owner = "client!er", name = "Zg", descriptor = "I")
	public int anInt3175 = -1;

	@OriginalMember(owner = "client!er", name = "ug", descriptor = "I")
	public int anInt3168 = 0;

	@OriginalMember(owner = "client!er", name = "Qg", descriptor = "[F")
	private final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!er", name = "ch", descriptor = "I")
	private int anInt3177 = 0;

	@OriginalMember(owner = "client!er", name = "Cg", descriptor = "F")
	public float aFloat88 = 1.0F;

	@OriginalMember(owner = "client!er", name = "rg", descriptor = "[F")
	private final float[] aFloatArray30 = new float[4];

	@OriginalMember(owner = "client!er", name = "Lg", descriptor = "I")
	public int anInt3171 = 0;

	@OriginalMember(owner = "client!er", name = "bh", descriptor = "I")
	private int anInt3176 = 0;

	@OriginalMember(owner = "client!er", name = "xg", descriptor = "I")
	private int anInt3169 = 3584;

	@OriginalMember(owner = "client!er", name = "ih", descriptor = "F")
	public float aFloat96 = -1.0F;

	@OriginalMember(owner = "client!er", name = "jh", descriptor = "I")
	private int anInt3178 = 0;

	@OriginalMember(owner = "client!er", name = "Yg", descriptor = "[F")
	private final float[] aFloatArray32 = new float[4];

	@OriginalMember(owner = "client!er", name = "dh", descriptor = "Lclient!tba;")
	public Class3_Sub26_Sub2 aClass3_Sub26_Sub2_2 = new Class3_Sub26_Sub2(8192);

	@OriginalMember(owner = "client!er", name = "lh", descriptor = "[B")
	public final byte[] aByteArray71 = new byte[16384];

	@OriginalMember(owner = "client!er", name = "nh", descriptor = "[I")
	public int[] anIntArray108 = new int[1];

	@OriginalMember(owner = "client!er", name = "oh", descriptor = "[I")
	public int[] anIntArray109 = new int[1];

	@OriginalMember(owner = "client!er", name = "mh", descriptor = "[I")
	public int[] anIntArray107 = new int[1];

	@OriginalMember(owner = "client!er", name = "ge", descriptor = "I")
	public final int anInt3129;

	@OriginalMember(owner = "client!er", name = "Id", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas8;

	@OriginalMember(owner = "client!er", name = "ld", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!er", name = "Bd", descriptor = "Lclient!jaggl/OpenGL;")
	public OpenGL anOpenGL2;

	@OriginalMember(owner = "client!er", name = "jb", descriptor = "J")
	private final long aLong61;

	@OriginalMember(owner = "client!er", name = "Qd", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!er", name = "Bf", descriptor = "I")
	public final int anInt3152;

	@OriginalMember(owner = "client!er", name = "Cf", descriptor = "Z")
	public boolean aBoolean209;

	@OriginalMember(owner = "client!er", name = "lg", descriptor = "Z")
	public boolean aBoolean218;

	@OriginalMember(owner = "client!er", name = "rf", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!er", name = "pg", descriptor = "Z")
	public boolean aBoolean219;

	@OriginalMember(owner = "client!er", name = "Hf", descriptor = "Z")
	public boolean aBoolean210;

	@OriginalMember(owner = "client!er", name = "ef", descriptor = "Z")
	private boolean aBoolean204;

	@OriginalMember(owner = "client!er", name = "hh", descriptor = "Z")
	public boolean aBoolean229;

	@OriginalMember(owner = "client!er", name = "qf", descriptor = "Z")
	private final boolean aBoolean207;

	@OriginalMember(owner = "client!er", name = "ee", descriptor = "Lclient!le;")
	private final Class184 aClass184_1;

	@OriginalMember(owner = "client!er", name = "te", descriptor = "Lclient!ou;")
	public final Class247 aClass247_1;

	@OriginalMember(owner = "client!er", name = "ke", descriptor = "Lclient!gw;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!er", name = "he", descriptor = "Lclient!ru;")
	private Class3_Sub23_Sub1 aClass3_Sub23_Sub1_1;

	@OriginalMember(owner = "client!er", name = "fe", descriptor = "Lclient!wda;")
	private final Class355 aClass355_1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;I)V")
	public Class31_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		this.anInt3129 = arg2;
		this.aCanvas7 = this.aCanvas8 = arg0;
		if (!Static298.method4529("jaclib")) {
			throw new RuntimeException("");
		} else if (Static298.method4529("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong62 = this.aLong61 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt3129);
				if (this.aLong61 == 0L) {
					throw new RuntimeException("");
				}
				this.method2567();
				@Pc(341) int local341 = this.method2553();
				if (local341 != 0) {
					throw new RuntimeException("");
				}
				this.anInt3152 = this.aBoolean216 ? 33639 : 5121;
				if (this.aString69.indexOf("radeon") != -1) {
					@Pc(367) int local367 = 0;
					@Pc(369) boolean local369 = false;
					@Pc(371) boolean local371 = false;
					@Pc(380) String[] local380 = Static317.method4706(' ', this.aString69.replace('/', ' '));
					for (@Pc(382) int local382 = 0; local382 < local380.length; local382++) {
						@Pc(388) String local388 = local380[local382];
						try {
							if (local388.length() > 0) {
								if (local388.charAt(0) == 'x' && local388.length() >= 3 && Static517.method6956(local388.substring(1, 3))) {
									local388 = local388.substring(1);
									local371 = true;
								}
								if (local388.equals("hd")) {
									local369 = true;
								} else {
									if (local388.startsWith("hd")) {
										local388 = local388.substring(2);
										local369 = true;
									}
									if (local388.length() >= 4 && Static517.method6956(local388.substring(0, 4))) {
										local367 = Static406.method5727(local388.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(451) Exception local451) {
						}
					}
					if (!local369 || local367 < 4000) {
						this.aBoolean209 = false;
					}
					if (!local371 && !local369) {
						if (local367 >= 7000 && local367 <= 9250) {
							this.aBoolean218 = false;
						}
						if (local367 >= 7000 && local367 <= 7999) {
							this.aBoolean208 = false;
						}
					}
					this.aBoolean219 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean210 = true;
					this.aBoolean204 = this.aBoolean208;
				}
				if (this.aString70.indexOf("intel") != -1) {
					this.aBoolean229 = false;
				}
				this.aBoolean207 = !this.aString70.equals("s3 graphics");
				if (this.aBoolean208) {
					try {
						@Pc(539) int[] local539 = new int[1];
						OpenGL.glGenBuffersARB(1, local539, 0);
					} catch (@Pc(545) Throwable local545) {
						throw new RuntimeException("");
					}
				}
				Static410.method5761(true, false);
				this.aBoolean199 = true;
				this.aClass184_1 = new Class184(this, super.anInterface4_14);
				this.method2539();
				this.aClass247_1 = new Class247(this);
				this.aClass120_1 = new Class120(this);
				if (this.aClass120_1.method3253()) {
					this.aClass3_Sub23_Sub1_1 = new Class3_Sub23_Sub1(this);
					if (!this.aClass3_Sub23_Sub1_1.method6447()) {
						this.aClass3_Sub23_Sub1_1.method6441();
						this.aClass3_Sub23_Sub1_1 = null;
					}
				}
				this.aClass355_1 = new Class355(this);
				this.method2564();
				this.method2510();
				this.method8030();
			} catch (@Pc(619) Throwable local619) {
				local619.printStackTrace();
				this.method8079();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(II)V")
	public void method2495(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method2536(7681, 7681);
		} else if (arg0 == 0) {
			this.method2536(8448, 8448);
		} else if (arg0 == 2) {
			this.method2536(7681, 34165);
		} else if (arg0 == 3) {
			this.method2536(8448, 260);
		} else if (arg0 == 4) {
			this.method2536(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V")
	@Override
	public void method8045(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class53 method8058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static336.method4908(arg0, this, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!er", name = "m", descriptor = "()Lclient!fe;")
	@Override
	public Class102 method8041() {
		@Pc(7) int local7 = -1;
		if (this.aString70.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString70.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString70.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class102(local7, "OpenGL", this.anInt3173, this.aString69, 0L);
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "()Lclient!q;")
	@Override
	public Class42 method8031() {
		return new Class42_Sub1();
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(II)I")
	public int method2496(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!er", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt3160, this.anInt3163, this.anInt3145, this.anInt3157 };
	}

	@OriginalMember(owner = "client!er", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt3165;
		arg0[2] = this.anInt3153;
		arg0[0] = this.anInt3176;
		arg0[1] = this.anInt3177;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ufa;[Lclient!wt;Z)Lclient!la;")
	@Override
	public Class63 method8027(@OriginalArg(0) Class328 arg0, @OriginalArg(1) Class365[] arg1) {
		return new Class63_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!er", name = "i", descriptor = "(I)V")
	private void method2497() {
		this.aFloat78 = (float) (this.anInt3169 - this.anInt3168) - this.aFloat79;
		this.aFloat84 = this.aFloat78 - this.aFloat87 * (float) this.anInt3162;
		if (this.aFloat84 < (float) this.anInt3172) {
			this.aFloat84 = this.anInt3172;
		}
		OpenGL.glFogf(2915, this.aFloat84);
		OpenGL.glFogf(2916, this.aFloat78);
		Static417.aFloatArray54[2] = (float) (this.anInt3158 & 0xFF) / 255.0F;
		Static417.aFloatArray54[0] = (float) (this.anInt3158 & 0xFF0000) / 1.671168E7F;
		Static417.aFloatArray54[1] = (float) (this.anInt3158 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static417.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)I")
	@Override
	public int method8050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 ^ arg0 & arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIILclient!lga;)V")
	public void method2498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Interface11 arg2) {
		@Pc(11) int local11 = arg2.method5870();
		@Pc(18) int local18 = arg1 * this.method2496(local11);
		this.method2521(arg2);
		OpenGL.glDrawElements(4, arg0, local11, (long) local18 + arg2.method5867());
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(IIII)V")
	public void method2499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!er", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt3172;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IF)V")
	public void method2500(@OriginalArg(1) float arg0) {
		if (this.aFloat77 == arg0) {
			return;
		}
		this.aFloat77 = arg0;
		if (this.anInt3159 == 3) {
			this.method2543();
			return;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(Z)V")
	public void method2501() {
		if (this.anInt3142 == 2) {
			return;
		}
		this.method2544();
		this.method2561(false);
		this.method2545(false);
		this.method2548(false);
		this.method2556(false);
		this.method2566(-2);
		this.anInt3142 = 2;
	}

	@OriginalMember(owner = "client!er", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method2556(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BII)V")
	public synchronized void method2502(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class3_Sub2 local14 = new Class3_Sub2(arg1);
		local14.aLong262 = arg0;
		this.aClass244_28.method5570(local14);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLclient!sk;)V")
	public void method2503(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt3136 < 0 || this.anInterface20Array1[this.anInt3136] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface20Array1[this.anInt3136--] = null;
		arg0.method5036();
		if (this.anInt3136 >= 0) {
			this.anInterface20_1 = this.anInterface20Array1[this.anInt3136];
			this.anInterface20_1.method5035();
		} else {
			this.anInterface20_1 = null;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I[Lclient!cp;)V")
	@Override
	public void method8038(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass3_Sub9Array3[local7] = arg1[local7];
		}
		this.anInt3161 = arg0;
		if (this.anInt3159 != 1) {
			this.method2550();
		}
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(II)I")
	public int method2504(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method2505(@OriginalArg(0) Class42_Sub1 arg0) {
		OpenGL.glLoadMatrixf(arg0.method1230(), 0);
	}

	@OriginalMember(owner = "client!er", name = "s", descriptor = "()V")
	@Override
	public void method8067() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!dd;Lclient!dd;FLclient!dd;)Lclient!dd;")
	@Override
	public Class47 method8093(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class47 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean205 && this.aBoolean229) {
			@Pc(15) Class47_Sub2_Sub1 local15 = null;
			@Pc(18) Class47_Sub2 local18 = (Class47_Sub2) arg0;
			@Pc(21) Class47_Sub2 local21 = (Class47_Sub2) arg1;
			@Pc(25) Class50_Sub4 local25 = local18.method3299();
			@Pc(29) Class50_Sub4 local29 = local21.method3299();
			if (local25 != null && local29 != null) {
				@Pc(48) int local48 = local25.anInt7847 <= local29.anInt7847 ? local29.anInt7847 : local25.anInt7847;
				if (arg0 != arg3 && arg3 != arg1 && arg3 instanceof Class47_Sub2_Sub1) {
					@Pc(60) Class47_Sub2_Sub1 local60 = (Class47_Sub2_Sub1) arg3;
					if (local60.method2386() == local48) {
						local15 = local60;
					}
				}
				if (local15 == null) {
					local15 = new Class47_Sub2_Sub1(this, local48);
				}
				if (local15.method2387(local29, local25, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!sk;I)V")
	public void method2507(@OriginalArg(0) Interface20 arg0) {
		if (this.aBoolean213) {
			this.method2503(arg0);
			this.method2558(arg0);
		} else if (this.anInt3135 >= 0 && this.anInterface20Array3[this.anInt3135] == arg0) {
			this.anInterface20Array3[this.anInt3135--] = null;
			arg0.method5034();
			if (this.anInt3135 < 0) {
				this.anInterface20_1 = this.anInterface20_2 = null;
			} else {
				this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array3[this.anInt3135];
				this.anInterface20_1.method5038();
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(BII)V")
	public synchronized void method2508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg1);
		local8.aLong262 = arg0;
		this.aClass244_31.method5570(local8);
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	@Override
	public void method8048(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt3130 = arg0;
		this.aClass184_1.method4596();
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(IIIIII)Lclient!dd;")
	@Override
	public Class47 method8083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean205 ? new Class47_Sub2_Sub2(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!er", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > this.anInt3093) {
			arg2 = this.anInt3093;
		}
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt3063 < arg3) {
			arg3 = this.anInt3063;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		this.anInt3153 = arg2;
		this.anInt3177 = arg1;
		this.anInt3165 = arg3;
		this.anInt3176 = arg0;
		OpenGL.glEnable(3089);
		this.method2569();
		this.method2576();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	public void method2509() {
		if (this.anInt3142 == 4) {
			return;
		}
		this.method2544();
		this.method2561(false);
		this.method2545(false);
		this.method2548(false);
		this.method2556(false);
		this.method2566(-2);
		this.method2568(1);
		this.anInt3142 = 4;
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "(I)V")
	private void method2510() {
		if (this.aCanvas7 == null) {
			this.anInt3073 = this.anInt2950 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas7.getSize();
			this.anInt3073 = local18.width;
			this.anInt2950 = local18.height;
		}
		if (this.anInterface20_2 == null) {
			this.anInt3093 = this.anInt3073;
			this.anInt3063 = this.anInt2950;
			this.method2570();
		}
		this.method2547();
		this.JA();
	}

	@OriginalMember(owner = "client!er", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3165 > arg3) {
			this.anInt3165 = arg3;
		}
		if (this.anInt3153 > arg2) {
			this.anInt3153 = arg2;
		}
		if (this.anInt3177 < arg1) {
			this.anInt3177 = arg1;
		}
		if (this.anInt3176 < arg0) {
			this.anInt3176 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method2569();
		this.method2576();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!dd;)V")
	@Override
	public void method8068(@OriginalArg(0) Class47 arg0) {
		this.aClass47_Sub2_1 = (Class47_Sub2) arg0;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(Z)V")
	private void method2511() {
		@Pc(6) float[] local6 = this.aFloatArray31;
		@Pc(18) float local18 = (float) (-this.anInt3160 * this.anInt3172) / (float) this.anInt3145;
		@Pc(32) float local32 = (float) (this.anInt3172 * (this.anInt3093 - this.anInt3160)) / (float) this.anInt3145;
		@Pc(43) float local43 = (float) (this.anInt3172 * this.anInt3163) / (float) this.anInt3157;
		@Pc(58) float local58 = (float) ((this.anInt3163 - this.anInt3063) * this.anInt3172) / (float) this.anInt3157;
		if (local18 == local32 || local43 == local58) {
			local6[8] = 0.0F;
			local6[1] = 0.0F;
			local6[3] = 0.0F;
			local6[10] = 1.0F;
			local6[15] = 1.0F;
			local6[11] = 0.0F;
			local6[12] = 0.0F;
			local6[7] = 0.0F;
			local6[5] = 1.0F;
			local6[2] = 0.0F;
			local6[0] = 1.0F;
			local6[4] = 0.0F;
			local6[6] = 0.0F;
			local6[13] = 0.0F;
			local6[9] = 0.0F;
			local6[14] = 0.0F;
		} else {
			@Pc(78) float local78 = (float) this.anInt3172 * 2.0F;
			local6[15] = 0.0F;
			local6[1] = 0.0F;
			local6[2] = 0.0F;
			local6[0] = local78 / (local32 - local18);
			local6[3] = 0.0F;
			local6[12] = 0.0F;
			local6[6] = 0.0F;
			local6[5] = local78 / (local43 - local58);
			local6[9] = (local43 + local58) / (-local58 + local43);
			local6[11] = -1.0F;
			local6[8] = (local32 + local18) / (local32 - local18);
			local6[13] = 0.0F;
			local6[7] = 0.0F;
			local6[4] = 0.0F;
			local6[10] = this.aFloat93 = (float) -(this.anInt3169 + this.anInt3172) / (float) (this.anInt3169 - this.anInt3172);
			local6[14] = this.aFloat94 = -(local78 * (float) this.anInt3169) / (float) (this.anInt3169 - this.anInt3172);
		}
		this.method2532();
	}

	@OriginalMember(owner = "client!er", name = "k", descriptor = "(I)V")
	private void method2512() {
		if (this.aBoolean220 && this.anInt3162 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!er", name = "n", descriptor = "()Z")
	@Override
	public boolean method8047() {
		return this.aClass3_Sub23_Sub1_1 != null && (this.anInt3129 <= 1 || this.aBoolean222);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)V")
	public void method2513(@OriginalArg(1) int arg0) {
		if (this.anInt3174 != arg0) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt3174 = arg0;
		}
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "()V")
	@Override
	public void method8030() {
		if (!this.aBoolean207 || this.anInt3093 <= 0 || this.anInt3063 <= 0) {
			return;
		}
		@Pc(19) int local19 = this.anInt3176;
		@Pc(22) int local22 = this.anInt3153;
		@Pc(25) int local25 = this.anInt3177;
		@Pc(28) int local28 = this.anInt3165;
		this.JA();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method2547();
		this.method2561(false);
		this.method2545(false);
		this.method2548(false);
		this.method2556(false);
		this.method2535(null);
		this.method2566(-2);
		this.method2495(1);
		this.method2568(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt3093, this.anInt3063, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.da(local19, local25, local22, local28);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZI)V")
	public void method2514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3156 = arg0;
		this.anInt3178 = arg1;
		this.method2570();
		this.method2576();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8024(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class3_Sub2 local19;
		while (!this.aClass244_28.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_28.method5578();
			Static508.anIntArray521[local7++] = (int) local19.aLong262;
			this.anInt3139 -= local19.anInt39;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static508.anIntArray521, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static508.anIntArray521, 0);
			local7 = 0;
		}
		while (!this.aClass244_29.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_29.method5578();
			Static508.anIntArray521[local7++] = (int) local19.aLong262;
			this.anInt3140 -= local19.anInt39;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static508.anIntArray521, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static508.anIntArray521, 0);
			local7 = 0;
		}
		while (!this.aClass244_30.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_30.method5578();
			Static508.anIntArray521[local7++] = local19.anInt39;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static508.anIntArray521, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static508.anIntArray521, 0);
			local7 = 0;
		}
		while (!this.aClass244_31.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_31.method5578();
			Static508.anIntArray521[local7++] = (int) local19.aLong262;
			this.anInt3138 -= local19.anInt39;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static508.anIntArray521, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static508.anIntArray521, 0);
		}
		while (!this.aClass244_27.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_27.method5578();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt39);
		}
		@Pc(219) Class3 local219;
		while (!this.aClass244_32.method5571()) {
			local219 = this.aClass244_32.method5578();
			OpenGL.glDeleteProgramARB((int) local219.aLong262);
		}
		while (!this.aClass244_33.method5571()) {
			local219 = this.aClass244_33.method5578();
			OpenGL.glDeleteObjectARB(local219.aLong262);
		}
		while (!this.aClass244_27.method5571()) {
			local19 = (Class3_Sub2) this.aClass244_27.method5578();
			OpenGL.glDeleteLists((int) local19.aLong262, local19.anInt39);
		}
		this.aClass184_1.method4594();
		if (this.b() > 100663296 && Static96.method2000() > this.aLong63 + 60000L) {
			System.gc();
			this.aLong63 = Static96.method2000();
		}
		this.anInt3134 = local11;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class73 method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class73_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!er", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3158 == arg0 && arg1 == this.anInt3162 && arg2 == this.anInt3168) {
			return;
		}
		this.anInt3158 = arg0;
		this.anInt3162 = arg1;
		this.anInt3168 = arg2;
		this.method2497();
		this.method2512();
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "(I)V")
	private void method2516() {
		this.anOpenGL2.b();
	}

	@OriginalMember(owner = "client!er", name = "m", descriptor = "(I)V")
	private void method2517() {
		if (this.anInt3159 != 2) {
			this.anInt3159 = 2;
			this.method2573();
			this.method2525();
			this.anInt3142 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIF)Lclient!cp;")
	@Override
	public Class3_Sub9 method8078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class3_Sub9_Sub1(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V")
	public void method2519() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FFFB)V")
	private void method2520(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean215) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg0, arg1, arg2);
		OpenGL.glMatrixMode(5888);
		this.aBoolean215 = true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!lga;I)V")
	public void method2521(@OriginalArg(0) Interface11 arg0) {
		if (this.anInterface11_2 != arg0) {
			if (this.aBoolean208) {
				OpenGL.glBindBufferARB(34963, arg0.method5868());
			}
			this.anInterface11_2 = arg0;
		}
	}

	@OriginalMember(owner = "client!er", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		this.aBoolean226 = arg0;
		this.method2526();
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
	public void method2522() {
		if (this.anInt3142 == 8) {
			return;
		}
		this.method2517();
		this.method2561(true);
		this.method2548(true);
		this.method2556(true);
		this.method2568(1);
		this.anInt3142 = 8;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8076(@OriginalArg(0) Canvas arg0) {
		this.aLong62 = 0L;
		this.aCanvas7 = null;
		if (arg0 == null || this.aCanvas8 == arg0) {
			this.aLong62 = this.aLong61;
			this.aCanvas7 = this.aCanvas8;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(36) Long local36 = (Long) this.aHashtable4.get(arg0);
			this.aLong62 = local36;
			this.aCanvas7 = arg0;
		}
		if (this.aCanvas7 == null || this.aLong62 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong62);
		this.method2510();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method8059(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Z)V")
	@Override
	public void method8061(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!er", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt3172 && arg1 == this.anInt3169) {
			return;
		}
		this.anInt3169 = arg1;
		this.anInt3172 = arg0;
		this.method2511();
		this.method2497();
		if (this.anInt3159 == 3) {
			this.method2543();
		} else if (this.anInt3159 == 2) {
			this.method2573();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIB)V")
	public void method2523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg1);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FFFIF)V")
	public void method2524(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static417.aFloatArray54[3] = arg1;
		Static417.aFloatArray54[2] = arg3;
		Static417.aFloatArray54[1] = arg2;
		Static417.aFloatArray54[0] = arg0;
		OpenGL.glTexEnvfv(8960, 8705, Static417.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!er", name = "o", descriptor = "(I)V")
	private void method2525() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.bf.method1230(), 0);
		if (this.aBoolean211) {
			this.aClass355_1.aClass15_Sub2_1.method162();
		}
		this.method2574();
		this.method2550();
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (this.anInt3176 > arg0 + arg2 || arg0 - arg2 > this.anInt3153 || arg1 + arg2 < this.anInt3177 || this.anInt3165 < arg1 - arg2) {
			return;
		}
		this.method2551();
		this.method2568(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(69) float local69 = (float) arg0 + 0.35F;
		@Pc(74) float local74 = (float) arg1 + 0.35F;
		@Pc(78) int local78 = arg2 << 1;
		if ((float) local78 < this.aFloat83) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local69 + 1.0F, local74 + 1.0F);
			OpenGL.glVertex2f(local69 + 1.0F, -1.0F + local74);
			OpenGL.glVertex2f(local69 - 1.0F, local74 - 1.0F);
			OpenGL.glVertex2f(local69 - 1.0F, local74 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local78 <= this.aFloat82) {
			OpenGL.glEnable(2832);
			OpenGL.glPointSize((float) local78);
			OpenGL.glBegin(0);
			OpenGL.glVertex2f(local69, local74);
			OpenGL.glEnd();
			OpenGL.glDisable(2832);
		} else {
			OpenGL.glBegin(6);
			OpenGL.glVertex2f(local69, local74);
			@Pc(147) int local147 = 262144 / (arg2 * 6);
			if (local147 <= 64) {
				local147 = 64;
			} else if (local147 > 512) {
				local147 = 512;
			}
			local147 = Static49.method1209(local147);
			OpenGL.glVertex2f(local69 + (float) arg2, local74);
			for (@Pc(173) int local173 = 16384 - local147; local173 > 0; local173 -= local147) {
				OpenGL.glVertex2f(local69 + (float) arg2 * Class8.aFloatArray2[local173], (float) arg2 * Class8.aFloatArray1[local173] + local74);
			}
			OpenGL.glVertex2f((float) arg2 + local69, local74);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "()I")
	@Override
	public int method8026() {
		return 4;
	}

	@OriginalMember(owner = "client!er", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class42 method8075() {
		return this.aClass42_Sub1_3;
	}

	@OriginalMember(owner = "client!er", name = "p", descriptor = "(I)V")
	private void method2526() {
		OpenGL.glDepthMask(this.aBoolean203 && this.aBoolean226);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FIF)V")
	public void method2527(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1) {
		this.aFloat79 = arg1;
		this.aFloat87 = arg0;
		this.method2497();
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "()Z")
	@Override
	public boolean method8074() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		if (arg0 != this.aFloat92) {
			this.aFloat92 = arg0;
			this.method2554();
		}
	}

	@OriginalMember(owner = "client!er", name = "k", descriptor = "()Z")
	@Override
	public boolean method8037() {
		return false;
	}

	@OriginalMember(owner = "client!er", name = "i", descriptor = "()V")
	@Override
	public void method8032() {
	}

	@OriginalMember(owner = "client!er", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt3169;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
	public synchronized void method2528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub2 local16 = new Class3_Sub2(arg0);
		local16.aLong262 = arg1;
		this.aClass244_29.method5570(local16);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(IIII)V")
	public void method2529(@OriginalArg(1) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "()Z")
	@Override
	public boolean method8018() {
		return false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!tt;)V")
	@Override
	public void method8090(@OriginalArg(0) Class323 arg0) {
		this.aClass12_1.method117(arg0, this, -1);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub8 method8036(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub8_Sub1 local8 = new Class3_Sub8_Sub1(arg0);
		this.aClass244_26.method5570(local8);
		return local8;
	}

	@OriginalMember(owner = "client!er", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.anInt3133 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt3133++;
		}
		this.anInt3132 = 0x1 << this.anInt3133;
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(I)V")
	@Override
	public void method8055(@OriginalArg(0) int arg0) {
		this.method2567();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZIB)V")
	public void method2530(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.method2540(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(B)V")
	public void method2531() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class73 method8033(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class73_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(Z)V")
	private void method2532() {
		this.aFloatArray31[10] = this.aFloat93;
		this.aFloatArray31[14] = this.aFloat94;
		this.aFloat80 = this.anInt3169;
		this.aFloat89 = ((float) -this.anInt3169 + this.aFloatArray31[14]) / this.aFloatArray31[10];
	}

	@OriginalMember(owner = "client!er", name = "q", descriptor = "()Z")
	@Override
	public boolean method8063() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!sk;)V")
	public void method2533(@OriginalArg(1) Interface20 arg0) {
		if (this.anInt3136 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3136 >= 0) {
			this.anInterface20Array1[this.anInt3136].method5036();
		}
		this.anInterface20_1 = this.anInterface20Array1[++this.anInt3136] = arg0;
		this.anInterface20_1.method5035();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method8081() {
		this.method2551();
		this.method2568(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 5 + 0.35F, (float) 10 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 75 + 0.35F, (float) 50 + 0.35F);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex2f((float) 15 + 0.35F, (float) 90 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method8064(@OriginalArg(0) Class3_Sub8 arg0) {
		this.aNativeHeap4 = ((Class3_Sub8_Sub1) arg0).aNativeHeap3;
		if (this.anInterface22_3 != null) {
			return;
		}
		@Pc(16) Class3_Sub26_Sub2 local16 = new Class3_Sub26_Sub2(80);
		if (this.aBoolean216) {
			local16.method6837(-1.0F);
			local16.method6837(-1.0F);
			local16.method6837(0.0F);
			local16.method6837(0.0F);
			local16.method6837(1.0F);
			local16.method6837(1.0F);
			local16.method6837(-1.0F);
			local16.method6837(0.0F);
			local16.method6837(1.0F);
			local16.method6837(1.0F);
			local16.method6837(1.0F);
			local16.method6837(1.0F);
			local16.method6837(0.0F);
			local16.method6837(1.0F);
			local16.method6837(0.0F);
			local16.method6837(-1.0F);
			local16.method6837(1.0F);
			local16.method6837(0.0F);
			local16.method6837(0.0F);
			local16.method6837(0.0F);
		} else {
			local16.method6839(-1.0F);
			local16.method6839(-1.0F);
			local16.method6839(0.0F);
			local16.method6839(0.0F);
			local16.method6839(1.0F);
			local16.method6839(1.0F);
			local16.method6839(-1.0F);
			local16.method6839(0.0F);
			local16.method6839(1.0F);
			local16.method6839(1.0F);
			local16.method6839(1.0F);
			local16.method6839(1.0F);
			local16.method6839(0.0F);
			local16.method6839(1.0F);
			local16.method6839(0.0F);
			local16.method6839(-1.0F);
			local16.method6839(1.0F);
			local16.method6839(0.0F);
			local16.method6839(0.0F);
			local16.method6839(0.0F);
		}
		this.anInterface22_3 = this.method2577(20, false, local16.anInt8703, local16.aByteArray213);
		this.aClass208_8 = new Class208(this.anInterface22_3, 5126, 3, 0);
		this.aClass208_9 = new Class208(this.anInterface22_3, 5126, 2, 12);
		this.aClass12_1.method110(this);
	}

	@OriginalMember(owner = "client!er", name = "q", descriptor = "(I)V")
	public void method2534() {
		if (this.anInt3142 == 16) {
			return;
		}
		this.method2557();
		this.method2561(true);
		this.method2548(true);
		this.method2556(true);
		this.method2568(1);
		this.anInt3142 = 16;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLclient!ep;)V")
	public void method2535(@OriginalArg(1) Class50 arg0) {
		@Pc(15) Class50 local15 = this.aClass50Array1[this.anInt3174];
		if (arg0 != local15) {
			if (arg0 == null) {
				OpenGL.glDisable(local15.anInt7830);
			} else {
				if (local15 == null) {
					OpenGL.glEnable(arg0.anInt7830);
				} else if (arg0.anInt7830 != local15.anInt7830) {
					OpenGL.glDisable(local15.anInt7830);
					OpenGL.glEnable(arg0.anInt7830);
				}
				OpenGL.glBindTexture(arg0.anInt7830, arg0.method6160());
			}
			this.aClass50Array1[this.anInt3174] = arg0;
		}
		this.anInt3142 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!er", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(6) int local6 = this.anInt3179;
		this.anInt3179 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(III)V")
	public void method2536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3174 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg1 != this.anInt3170) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			local17 = true;
			this.anInt3170 = arg1;
		}
		if (arg0 != this.anInt3167) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local17 = true;
			this.anInt3167 = arg0;
		}
		if (local17) {
			this.anInt3142 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method8059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2551();
		this.method2568(arg5);
		@Pc(17) float local17 = (float) -arg0 + (float) arg2;
		@Pc(24) float local24 = (float) -arg1 + (float) arg3;
		if (local17 == 0.0F && local24 == 0.0F) {
			local17 = 1.0F;
		} else {
			@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local24 * local24 + local17 * local17)));
			local17 *= local49;
			local24 *= local49;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f(local17 + (float) arg2 + 0.35F, local24 + 0.35F + (float) arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!er", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt3176 = 0;
		this.anInt3165 = this.anInt3063;
		this.anInt3153 = this.anInt3093;
		this.anInt3177 = 0;
		OpenGL.glDisable(3089);
		this.method2569();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!mk;Lclient!mk;BLclient!mk;Lclient!mk;)V")
	public void method2537(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(3) Class208 arg2, @OriginalArg(4) Class208 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method2538(arg2.anInterface22_5);
			OpenGL.glVertexPointer(arg2.aByte71, arg2.aShort77, this.anInterface22_4.method4047(), this.anInterface22_4.method4049() + (long) arg2.aByte72);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method2538(arg3.anInterface22_5);
			OpenGL.glNormalPointer(arg3.aShort77, this.anInterface22_4.method4047(), this.anInterface22_4.method4049() + (long) arg3.aByte72);
			OpenGL.glEnableClientState(32885);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method2538(arg1.anInterface22_5);
			OpenGL.glColorPointer(arg1.aByte71, arg1.aShort77, this.anInterface22_4.method4047(), this.anInterface22_4.method4049() + (long) arg1.aByte72);
			OpenGL.glEnableClientState(32886);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method2538(arg0.anInterface22_5);
			OpenGL.glTexCoordPointer(arg0.aByte71, arg0.aShort77, this.anInterface22_4.method4047(), this.anInterface22_4.method4049() + (long) arg0.aByte72);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!vd;)V")
	public void method2538(@OriginalArg(1) Interface22 arg0) {
		if (this.anInterface22_4 != arg0) {
			if (this.aBoolean208) {
				OpenGL.glBindBufferARB(34962, arg0.method4048());
			}
			this.anInterface22_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!er", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg2 * this.aClass42_Sub1_3.aFloat51 + (float) arg1 * this.aClass42_Sub1_3.aFloat44 + (float) arg0 * this.aClass42_Sub1_3.aFloat45 + this.aClass42_Sub1_3.aFloat46;
		if ((float) this.anInt3172 > local28 || local28 > (float) this.anInt3169) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass42_Sub1_3.aFloat52 + this.aClass42_Sub1_3.aFloat47 * (float) arg0 + this.aClass42_Sub1_3.aFloat49 * (float) arg1 + (float) arg2 * this.aClass42_Sub1_3.aFloat55) * (float) this.anInt3145 / local28);
		arg3[0] = (int) ((float) local85 - this.aFloat81);
		@Pc(127) int local127 = (int) ((float) this.anInt3157 * (this.aClass42_Sub1_3.aFloat50 + (float) arg1 * this.aClass42_Sub1_3.aFloat48 + this.aClass42_Sub1_3.aFloat53 * (float) arg0 + (float) arg2 * this.aClass42_Sub1_3.aFloat54) / local28);
		arg3[1] = (int) ((float) local127 - this.aFloat95);
		arg3[2] = (int) local28;
	}

	@OriginalMember(owner = "client!er", name = "L", descriptor = "()V")
	@Override
	public void L() {
		this.aBoolean223 = false;
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(B)V")
	private void method2539() {
		this.aClass50Array1 = new Class50[this.anInt3146];
		this.aClass50_Sub1_2 = new Class50_Sub1(this, 3553, 6408, 1, 1);
		new Class50_Sub1(this, 3553, 6408, 1, 1);
		new Class50_Sub1(this, 3553, 6408, 1, 1);
		this.aClass52_Sub2_8 = new Class52_Sub2(this);
		this.aClass52_Sub2_6 = new Class52_Sub2(this);
		this.aClass52_Sub2_2 = new Class52_Sub2(this);
		this.aClass52_Sub2_3 = new Class52_Sub2(this);
		this.aClass52_Sub2_4 = new Class52_Sub2(this);
		this.aClass52_Sub2_10 = new Class52_Sub2(this);
		this.aClass52_Sub2_7 = new Class52_Sub2(this);
		this.aClass52_Sub2_1 = new Class52_Sub2(this);
		this.aClass52_Sub2_9 = new Class52_Sub2(this);
		this.aClass52_Sub2_5 = new Class52_Sub2(this);
		if (this.aBoolean229) {
			this.aClass219_2 = new Class219(this);
			new Class219(this);
		}
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.anInt3139 + this.anInt3140 + this.anInt3138;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
	@Override
	public void method8043(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZIZ)V")
	public void method2540(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (arg1 != this.anInt3149 || this.aBoolean211 != this.aBoolean223) {
			@Pc(20) Class50_Sub1 local20 = null;
			@Pc(22) int local22 = 0;
			@Pc(24) byte local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(33) int local33 = this.aBoolean223 ? 3 : 0;
			if (arg1 < 0) {
				this.method2546();
			} else {
				local20 = this.aClass184_1.method4598(arg1);
				@Pc(57) Class172 local57 = super.anInterface4_14.method7229(arg1);
				if (local57.aByte57 == 0 && local57.aByte56 == 0) {
					this.method2546();
				} else {
					@Pc(80) int local80 = local57.aBoolean358 ? 64 : 128;
					@Pc(84) int local84 = local80 * 50;
					this.method2520((float) (this.anInt3134 % local84 * local57.aByte57) / (float) local84, (float) (local57.aByte56 * (this.anInt3134 % local84)) / (float) local84, 0.0F);
				}
				if (!this.aBoolean223) {
					local26 = local57.anInt5204;
					local33 = local57.aByte62;
					local24 = local57.aByte60;
				}
				local22 = local57.anInt5206;
			}
			this.aClass355_1.method7904(local24, local26, arg2, arg0, local33);
			if (!this.aClass355_1.method7909(local22, local20)) {
				this.method2535(local20);
				this.method2495(local22);
			}
			this.aBoolean211 = this.aBoolean223;
			this.anInt3149 = arg1;
		}
		this.anInt3142 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method8071(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		this.method8082();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Lclient!bt;B)V")
	public void method2541(@OriginalArg(0) Class42_Sub1 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method1230(), 0);
	}

	@OriginalMember(owner = "client!er", name = "y", descriptor = "()V")
	@Override
	public void method8082() throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!er", name = "x", descriptor = "()V")
	@Override
	protected void method8079() {
		for (@Pc(10) Class3 local10 = this.aClass244_26.method5572(); local10 != null; local10 = this.aClass244_26.method5576()) {
			((Class3_Sub8_Sub1) local10).method1745();
		}
		if (this.aClass120_1 != null) {
			this.aClass120_1.method3250();
		}
		if (this.anOpenGL2 != null) {
			this.method2516();
			@Pc(40) Enumeration local40 = this.aHashtable4.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable4.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean199) {
			Static114.method2275(true, false);
			this.aBoolean199 = false;
		}
	}

	@OriginalMember(owner = "client!er", name = "r", descriptor = "(I)V")
	private void method2543() {
		@Pc(15) float local15 = (float) -this.anInt3160 * this.aFloat77 / (float) this.anInt3145;
		@Pc(35) float local35 = this.aFloat77 * (float) -this.anInt3163 / (float) this.anInt3157;
		@Pc(50) float local50 = (float) (this.anInt3093 - this.anInt3160) * this.aFloat77 / (float) this.anInt3145;
		@Pc(65) float local65 = this.aFloat77 * (float) (this.anInt3063 - this.anInt3163) / (float) this.anInt3157;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local50 != local15 && local35 != local65) {
			OpenGL.glOrtho((double) local15, (double) local50, (double) -local65, (double) -local35, (double) this.anInt3172, (double) this.anInt3169);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(Z)V")
	private void method2544() {
		if (this.anInt3159 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt3093 > 0 && this.anInt3063 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt3093, (double) this.anInt3063, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt3159 = 1;
		this.anInt3142 &= 0xFFFFFFE7;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ZI)V")
	public void method2545(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean227 != arg0) {
			this.aBoolean227 = arg0;
			this.method2580();
			this.anInt3142 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!er", name = "s", descriptor = "(I)V")
	private void method2546() {
		if (this.aBoolean215) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean215 = false;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8060(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas8 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable4.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable4.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!er", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3171 = arg3;
		this.anInt3155 = arg0;
		this.anInt3166 = arg1;
		this.anInt3175 = arg2;
		this.aBoolean223 = true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class127 method8077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class127_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!er", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(11) boolean local11 = arg0 != this.anInt3150;
		if (local11 || this.aFloat90 != arg1 || arg2 != this.aFloat96) {
			this.aFloat96 = arg2;
			this.aFloat90 = arg1;
			this.anInt3150 = arg0;
			if (local11) {
				this.aFloat86 = (float) (this.anInt3150 & 0xFF0000) / 1.671168E7F;
				this.aFloat76 = (float) (this.anInt3150 & 0xFF00) / 65280.0F;
				this.aFloat88 = (float) (this.anInt3150 & 0xFF) / 255.0F;
				this.method2554();
			}
			this.method2579();
		}
		if (arg3 == this.aFloatArray32[0] && this.aFloatArray32[1] == arg4 && arg5 == this.aFloatArray32[2]) {
			return;
		}
		this.aFloatArray32[0] = arg3;
		this.aFloatArray32[1] = arg4;
		this.aFloatArray32[2] = arg5;
		this.aFloatArray30[1] = -arg4;
		this.aFloatArray30[2] = -arg5;
		this.aFloatArray30[0] = -arg3;
		@Pc(138) float local138 = (float) (1.0D / Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
		this.aFloatArray29[2] = arg5 * local138;
		this.aFloatArray29[1] = arg4 * local138;
		this.aFloatArray29[0] = arg3 * local138;
		this.aFloatArray28[2] = -this.aFloatArray29[2];
		this.aFloatArray28[1] = -this.aFloatArray29[1];
		this.aFloatArray28[0] = -this.aFloatArray29[0];
		this.method2574();
		this.anInt3154 = (int) (arg5 * 256.0F / arg4);
		this.anInt3148 = (int) (arg3 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(B)V")
	public void method2547() {
		if (this.anInt3159 != 0) {
			this.anInt3159 = 0;
			this.anInt3142 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(ZI)V")
	public void method2548(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean201 == arg0) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.aBoolean201 = arg0;
		this.anInt3142 &= 0xFFFFFFE0;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8049(@OriginalArg(0) Canvas arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || this.aCanvas8 == arg0) {
			local5 = this.aLong61;
		} else if (this.aHashtable4.containsKey(arg0)) {
			@Pc(27) Long local27 = (Long) this.aHashtable4.get(arg0);
			local5 = local27;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (arg0 == this.aCanvas7) {
			this.method2510();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!uo;IIII)Lclient!da;")
	@Override
	public Class52 method8046(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class52_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class73 method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class73_Sub3(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!er", name = "t", descriptor = "()Z")
	@Override
	public boolean method8069() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8019(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas8 == arg0) {
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
			@Pc(53) long local53 = this.anOpenGL2.prepareSurface(arg0);
			if (local53 == -1L) {
				throw new RuntimeException();
			}
			this.aHashtable4.put(arg0, Long.valueOf(local53));
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BZ)V")
	public void method2549(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean228) {
			this.aBoolean228 = arg0;
			this.method2580();
		}
	}

	@OriginalMember(owner = "client!er", name = "t", descriptor = "(I)V")
	private void method2550() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt3161; local7++) {
			@Pc(14) Class3_Sub9 local14 = this.aClass3_Sub9Array3[local7];
			@Pc(18) int local18 = local7 + 16386;
			Static242.aFloatArray42[0] = local14.method5997();
			Static242.aFloatArray42[1] = local14.method5990();
			Static242.aFloatArray42[2] = local14.method5999();
			Static242.aFloatArray42[3] = 1.0F;
			OpenGL.glLightfv(local18, 4611, Static242.aFloatArray42, 0);
			@Pc(52) int local52 = local14.method5994();
			@Pc(58) float local58 = local14.method5996() / 255.0F;
			Static242.aFloatArray42[1] = (float) (local52 >> 8 & 0xFF) * local58;
			Static242.aFloatArray42[0] = local58 * (float) (local52 >> 16 & 0xFF);
			Static242.aFloatArray42[2] = (float) (local52 & 0xFF) * local58;
			OpenGL.glLightfv(local18, 4609, Static242.aFloatArray42, 0);
			OpenGL.glLightf(local18, 4617, 1.0F / (float) (local14.method6000() * local14.method6000()));
			OpenGL.glEnable(local18);
		}
		while (local7 < this.anInt3147) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt3147 = this.anInt3161;
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "()V")
	@Override
	public void method8034() {
		if (this.aClass3_Sub23_Sub1_1 != null && this.aClass3_Sub23_Sub1_1.method6439()) {
			this.aClass120_1.method3257(this.aClass3_Sub23_Sub1_1);
			this.aClass184_1.method4596();
		}
	}

	@OriginalMember(owner = "client!er", name = "u", descriptor = "(I)V")
	private void method2551() {
		if (this.anInt3142 == 1) {
			return;
		}
		this.method2544();
		this.method2561(false);
		this.method2545(false);
		this.method2548(false);
		this.method2556(false);
		this.method2535(null);
		this.method2566(-2);
		this.method2495(1);
		this.anInt3142 = 1;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(ZI)V")
	public synchronized void method2552(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(arg0);
		this.aClass244_30.method5570(local8);
	}

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(Z)I")
	private int method2553() {
		this.aString70 = OpenGL.glGetString(7936).toLowerCase();
		@Pc(10) int local10 = 0;
		this.aString69 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString70.indexOf("microsoft") != -1) {
			local10 = 1;
		}
		if (this.aString70.indexOf("brian paul") != -1 || this.aString70.indexOf("mesa") != -1) {
			local10 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static317.method4706(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local10 |= 0x4;
		} else {
			try {
				@Pc(71) int local71 = Static406.method5727(local53[0]);
				@Pc(77) int local77 = Static406.method5727(local53[1]);
				this.anInt3173 = local77 + local71 * 10;
			} catch (@Pc(86) NumberFormatException local86) {
				local10 |= 0x4;
			}
		}
		if (this.anInt3173 < 12) {
			local10 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local10 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local10 |= 0x20;
		}
		@Pc(122) int[] local122 = new int[1];
		OpenGL.glGetIntegerv(34018, local122, 0);
		this.anInt3146 = local122[0];
		OpenGL.glGetIntegerv(34929, local122, 0);
		this.anInt3164 = local122[0];
		OpenGL.glGetIntegerv(34930, local122, 0);
		this.anInt3151 = local122[0];
		if (this.anInt3146 < 2 || this.anInt3164 < 2 || this.anInt3151 < 2) {
			local10 |= 0x10;
		}
		this.aBoolean216 = Stream.a();
		this.aBoolean224 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean208 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean217 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean225 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean212 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean221 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean218 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean219 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean205 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean209 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean206 = false;
		this.aBoolean229 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean213 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean214 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean222 = this.aBoolean213 & this.aBoolean214;
		OpenGL.glGetFloatv(2834, Static417.aFloatArray54, 0);
		this.aFloat83 = Static417.aFloatArray54[0];
		this.aFloat82 = Static417.aFloatArray54[1];
		return local10 == 0 ? 0 : local10;
	}

	@OriginalMember(owner = "client!er", name = "A", descriptor = "()V")
	@Override
	public void method8087() {
		if (this.aBoolean229) {
			if (this.aClass219_1 != this.anInterface20_2) {
				throw new RuntimeException();
			}
			this.aClass219_1.method5042(0);
			this.aClass219_1.method5042(8);
			this.method2507(this.aClass219_1);
		} else if (this.aBoolean224) {
			this.aClass73_Sub3_1.da(0, 0, this.anInt3093, this.anInt3063, 0, 0);
			this.anOpenGL2.setSurface(this.aLong62);
		} else {
			throw new RuntimeException("");
		}
		this.anInt3093 = this.anInt3073;
		this.aClass73_Sub3_1 = null;
		this.anInt3063 = this.anInt2950;
		this.method2547();
		this.method2570();
		this.JA();
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "()Z")
	@Override
	public boolean method8028() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method8044(@OriginalArg(0) Class73 arg0) {
		this.aClass73_Sub3_1 = (Class73_Sub3) arg0;
		@Pc(60) Class3_Sub7 local60;
		if (this.aBoolean229) {
			if (this.aClass219_1 == null) {
				this.aClass219_1 = new Class219(this);
			}
			if (this.anInterface20_2 == this.aClass219_1) {
				throw new RuntimeException();
			}
			this.method2560(this.aClass219_1);
			@Pc(166) Class3_Sub7_Sub14 local166 = (Class3_Sub7_Sub14) this.aClass297_10.method6531((long) (this.aClass73_Sub3_1.E() << 16 | this.aClass73_Sub3_1.u()));
			if (local166 == null) {
				local166 = new Class3_Sub7_Sub14(this, 6402, this.aClass73_Sub3_1.E(), this.aClass73_Sub3_1.u());
				@Pc(201) Class3_Sub7_Sub14 local201;
				for (this.anInt3141 += local166.anInt5569; this.anInt3141 > 2097152; this.anInt3141 -= local201.anInt5569) {
					local60 = this.aClass49_2.method1446();
					if (local60 == null) {
						break;
					}
					local201 = (Class3_Sub7_Sub14) local60;
					local201.method8136();
					local201.method8128();
					local201.method4528();
				}
				this.aClass297_10.method6537((long) (this.aClass73_Sub3_1.E() << 16 | this.aClass73_Sub3_1.u()), local166);
			}
			this.aClass49_2.method1453(local166);
			this.aClass219_1.method5041(8, local166);
			this.aClass219_1.method5044(0, this.aClass73_Sub3_1.aClass50_Sub1_Sub1_4);
		} else if (this.aBoolean224) {
			@Pc(31) Class3_Sub7_Sub11 local31 = (Class3_Sub7_Sub11) this.aClass297_10.method6531((long) (this.aClass73_Sub3_1.E() << 16 | this.aClass73_Sub3_1.u()));
			if (local31 == null) {
				local31 = new Class3_Sub7_Sub11(this, this.aClass73_Sub3_1.E(), this.aClass73_Sub3_1.u());
				@Pc(67) Class3_Sub7_Sub11 local67;
				for (this.anInt3141 += local31.anInt5227 * 4; this.anInt3141 > 2097152; this.anInt3141 -= local67.anInt5227) {
					local60 = this.aClass49_2.method1446();
					if (local60 == null) {
						break;
					}
					local67 = (Class3_Sub7_Sub11) local60;
					local67.method8136();
					local67.method8128();
					this.anOpenGL2.releasePbuffer(local67.method4182());
				}
				this.aClass297_10.method6537((long) (this.aClass73_Sub3_1.E() << 16 | this.aClass73_Sub3_1.u()), local31);
			}
			this.aClass49_2.method1453(local31);
			this.anOpenGL2.setPbuffer(local31.method4182());
		} else {
			throw new RuntimeException("");
		}
		this.anInt3093 = arg0.E();
		this.anInt3063 = arg0.u();
		this.method2547();
		this.method2570();
		this.JA();
	}

	@OriginalMember(owner = "client!er", name = "v", descriptor = "(I)V")
	private void method2554() {
		Static417.aFloatArray54[3] = 1.0F;
		Static417.aFloatArray54[0] = this.aFloat86 * this.aFloat92;
		Static417.aFloatArray54[2] = this.aFloat92 * this.aFloat88;
		Static417.aFloatArray54[1] = this.aFloat76 * this.aFloat92;
		OpenGL.glLightModelfv(2899, Static417.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!er", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(6) int local6 = this.anInt3180;
		this.anInt3180 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!er", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(28) float local28 = this.aClass42_Sub1_3.aFloat46 + (float) arg0 * this.aClass42_Sub1_3.aFloat45 + (float) arg1 * this.aClass42_Sub1_3.aFloat44 + this.aClass42_Sub1_3.aFloat51 * (float) arg2;
		if (local28 < 1.0F) {
			local28 = 1.0F;
		}
		@Pc(59) float local59 = (float) arg5 * this.aClass42_Sub1_3.aFloat51 + (float) arg4 * this.aClass42_Sub1_3.aFloat44 + this.aClass42_Sub1_3.aFloat45 * (float) arg3 + this.aClass42_Sub1_3.aFloat46;
		if (local59 < 1.0F) {
			local59 = 1.0F;
		}
		if ((float) this.anInt3172 > local28 && local59 < (float) this.anInt3172 || !(!((float) this.anInt3169 < local28) || !(local59 > (float) this.anInt3169))) {
			return false;
		}
		@Pc(123) int local123 = (int) ((this.aClass42_Sub1_3.aFloat52 + this.aClass42_Sub1_3.aFloat49 * (float) arg1 + this.aClass42_Sub1_3.aFloat47 * (float) arg0 + this.aClass42_Sub1_3.aFloat55 * (float) arg2) * (float) this.anInt3145 / local28);
		@Pc(155) int local155 = (int) ((float) this.anInt3145 * (this.aClass42_Sub1_3.aFloat52 + (float) arg5 * this.aClass42_Sub1_3.aFloat55 + (float) arg3 * this.aClass42_Sub1_3.aFloat47 + this.aClass42_Sub1_3.aFloat49 * (float) arg4) / local59);
		if ((float) local123 < this.aFloat81 && (float) local155 < this.aFloat81 || this.aFloat91 < (float) local123 && this.aFloat91 < (float) local155) {
			return false;
		} else {
			@Pc(213) int local213 = (int) ((float) this.anInt3157 * (this.aClass42_Sub1_3.aFloat50 + this.aClass42_Sub1_3.aFloat54 * (float) arg2 + (float) arg1 * this.aClass42_Sub1_3.aFloat48 + this.aClass42_Sub1_3.aFloat53 * (float) arg0) / local28);
			@Pc(245) int local245 = (int) ((this.aClass42_Sub1_3.aFloat54 * (float) arg5 + (float) arg4 * this.aClass42_Sub1_3.aFloat48 + this.aClass42_Sub1_3.aFloat53 * (float) arg3 + this.aClass42_Sub1_3.aFloat50) * (float) this.anInt3157 / local59);
			return (!((float) local213 < this.aFloat95) || !(this.aFloat95 > (float) local245)) && (!((float) local213 > this.aFloat85) || !(this.aFloat85 < (float) local245));
		}
	}

	@OriginalMember(owner = "client!er", name = "B", descriptor = "()Z")
	@Override
	public boolean method8089() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "z", descriptor = "()Z")
	@Override
	public boolean method8085() {
		return this.aClass3_Sub23_Sub1_1 != null && this.aClass3_Sub23_Sub1_1.method6439();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!sk;B)V")
	public void method2555(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt3137 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt3137 >= 0) {
			this.anInterface20Array2[this.anInt3137].method5039();
		}
		this.anInterface20_2 = this.anInterface20Array2[++this.anInt3137] = arg0;
		this.anInterface20_2.method5037();
	}

	@OriginalMember(owner = "client!er", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method2551();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method2568(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean217) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean217) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!er", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(57) float local57;
		@Pc(45) float local45;
		if (this.aClass50_Sub1_Sub1_2 == null || arg2 > this.aClass50_Sub1_Sub1_2.anInt1664 || arg3 > this.aClass50_Sub1_Sub1_2.anInt1665) {
			this.aClass50_Sub1_Sub1_2 = Static392.method5564(arg2, arg6, arg3, this);
			this.aClass50_Sub1_Sub1_2.method1507(false, false);
			local57 = this.aClass50_Sub1_Sub1_2.aFloat58;
			local45 = this.aClass50_Sub1_Sub1_2.aFloat57;
		} else {
			this.aClass50_Sub1_Sub1_2.method1504(arg3, false, arg2, 6406, arg6);
			local45 = (float) arg2 * this.aClass50_Sub1_Sub1_2.aFloat57 / (float) this.aClass50_Sub1_Sub1_2.anInt1664;
			local57 = this.aClass50_Sub1_Sub1_2.aFloat58 * (float) arg3 / (float) this.aClass50_Sub1_Sub1_2.anInt1665;
		}
		this.method2501();
		this.method2535(this.aClass50_Sub1_Sub1_2);
		this.method2568(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method2572(arg5);
		this.method2536(34165, 34165);
		this.method2523(768, 34166, 0);
		this.method2523(770, 5890, 2);
		this.method2499(34166, 0);
		this.method2499(5890, 2);
		@Pc(147) float local147 = (float) arg0;
		@Pc(150) float local150 = (float) arg1;
		@Pc(155) float local155 = local147 + (float) arg2;
		OpenGL.glBegin(7);
		@Pc(162) float local162 = local150 + (float) arg3;
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(local147, local150);
		OpenGL.glTexCoord2f(0.0F, local45);
		OpenGL.glVertex2f(local147, local162);
		OpenGL.glTexCoord2f(local57, local45);
		OpenGL.glVertex2f(local155, local162);
		OpenGL.glTexCoord2f(local57, 0.0F);
		OpenGL.glVertex2f(local155, local150);
		OpenGL.glEnd();
		this.method2523(768, 5890, 0);
		this.method2523(770, 34166, 2);
		this.method2499(5890, 0);
		this.method2499(34166, 2);
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(ZI)V")
	public void method2556(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean203) {
			this.aBoolean203 = arg0;
			this.method2526();
			this.anInt3142 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!er", name = "w", descriptor = "(I)V")
	private void method2557() {
		if (this.anInt3159 != 3) {
			this.anInt3159 = 3;
			this.method2543();
			this.method2525();
			this.anInt3142 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!er", name = "C", descriptor = "()Z")
	@Override
	public boolean method8095() {
		return this.aClass355_1.method7910();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(Lclient!sk;I)V")
	public void method2558(@OriginalArg(0) Interface20 arg0) {
		if (this.anInt3137 < 0 || this.anInterface20Array2[this.anInt3137] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface20Array2[this.anInt3137--] = null;
		arg0.method5039();
		if (this.anInt3137 >= 0) {
			this.anInterface20_2 = this.anInterface20Array2[this.anInt3137];
			this.anInterface20_2.method5037();
		} else {
			this.anInterface20_2 = null;
		}
	}

	@OriginalMember(owner = "client!er", name = "x", descriptor = "(I)Lclient!qn;")
	public Class50_Sub4 method2559() {
		return this.aClass47_Sub2_1 == null ? null : this.aClass47_Sub2_1.method3299();
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg2 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt3063 - local12 - arg1, arg2, 1, 32993, this.anInt3152, local10, arg2 * local12);
		}
		return local10;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ZLclient!sk;)V")
	public void method2560(@OriginalArg(1) Interface20 arg0) {
		if (this.aBoolean213) {
			this.method2533(arg0);
			this.method2555(arg0);
		} else if (this.anInt3135 < 3) {
			if (this.anInt3135 >= 0) {
				this.anInterface20Array3[this.anInt3135].method5034();
			}
			this.anInterface20_1 = this.anInterface20_2 = this.anInterface20Array3[++this.anInt3135] = arg0;
			this.anInterface20_1.method5038();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "()Z")
	@Override
	public boolean method8022() {
		if (this.aClass3_Sub23_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass3_Sub23_Sub1_1.method6439()) {
			if (!this.aClass120_1.method3252(this.aClass3_Sub23_Sub1_1)) {
				return false;
			}
			this.aClass184_1.method4596();
		}
		return true;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(BZ)V")
	public void method2561(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean220 != arg0) {
			this.aBoolean220 = arg0;
			this.method2512();
			this.anInt3142 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!er", name = "o", descriptor = "()Lclient!q;")
	@Override
	public Class42 method8052() {
		return this.aClass42_Sub1_1;
	}

	@OriginalMember(owner = "client!er", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2551();
		this.method2568(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, local20 + (float) arg2);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!er", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.method2568(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
	@Override
	public int method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!er", name = "r", descriptor = "()Z")
	@Override
	public boolean method8066() {
		return this.aBoolean217 && (!this.method8085() || this.aBoolean222);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IJ)V")
	public synchronized void method2562(@OriginalArg(1) long arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong262 = arg0;
		this.aClass244_33.method5570(local11);
	}

	@OriginalMember(owner = "client!er", name = "i", descriptor = "(B)V")
	private void method2564() {
		this.method2566(-2);
		for (@Pc(20) int local20 = this.anInt3146 - 1; local20 >= 0; local20--) {
			this.method2513(local20);
			this.method2535(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method2536(8448, 8448);
		this.method2523(770, 34168, 2);
		this.method2546();
		this.anInt3143 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt3144 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBoolean202 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean200 = true;
		this.method2561(true);
		this.method2545(true);
		this.method2548(true);
		this.method2556(true);
		this.method2547();
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
			@Pc(138) int local138 = local131 + 16384;
			OpenGL.glLightfv(local138, 4608, local129, 0);
			OpenGL.glLightf(local138, 4615, 0.0F);
			OpenGL.glLightf(local138, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt3150 = this.anInt3158 = -1;
		this.JA();
	}

	@OriginalMember(owner = "client!er", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass42_Sub1_3.aFloat46 + (float) arg1 * this.aClass42_Sub1_3.aFloat44 + (float) arg0 * this.aClass42_Sub1_3.aFloat45 + (float) arg2 * this.aClass42_Sub1_3.aFloat51;
		if ((float) this.anInt3172 > local28 || (float) this.anInt3169 < local28) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((float) this.anInt3145 * (this.aClass42_Sub1_3.aFloat52 + (float) arg1 * this.aClass42_Sub1_3.aFloat49 + this.aClass42_Sub1_3.aFloat47 * (float) arg0 + (float) arg2 * this.aClass42_Sub1_3.aFloat55) / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt3157 * ((float) arg0 * this.aClass42_Sub1_3.aFloat53 + this.aClass42_Sub1_3.aFloat48 * (float) arg1 + this.aClass42_Sub1_3.aFloat54 * (float) arg2 + this.aClass42_Sub1_3.aFloat50) / local28);
		if ((float) local85 >= this.aFloat81 && (float) local85 <= this.aFloat91 && (float) local117 >= this.aFloat95 && this.aFloat85 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat81);
			arg3[1] = (int) ((float) local117 - this.aFloat95);
			arg3[2] = (int) local28;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(II)I")
	public int method2565(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!er", name = "g", descriptor = "(II)V")
	public void method2566(@OriginalArg(1) int arg0) {
		this.method2530(true, arg0);
	}

	@OriginalMember(owner = "client!er", name = "y", descriptor = "(I)V")
	private void method2567() {
		@Pc(7) int local7 = 0;
		while (!this.anOpenGL2.a()) {
			if (local7++ > 5) {
				throw new RuntimeException("");
			}
			Static373.method5240(1000L);
		}
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)V")
	@Override
	public void method8051(@OriginalArg(0) int arg0) {
		this.method2516();
	}

	@OriginalMember(owner = "client!er", name = "h", descriptor = "(II)V")
	public void method2568(@OriginalArg(1) int arg0) {
		if (this.anInt3143 == arg0) {
			return;
		}
		@Pc(12) boolean local12;
		@Pc(16) byte local16;
		if (arg0 == 1) {
			local12 = true;
			local16 = 1;
		} else if (arg0 == 2) {
			local12 = false;
			local16 = 2;
		} else if (arg0 == 128) {
			local16 = 3;
			local12 = true;
		} else {
			local16 = 0;
			local12 = false;
		}
		if (!this.aBoolean200) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean200 = true;
		}
		if (local12 != this.aBoolean202) {
			if (local12) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean202 = local12;
		}
		if (this.anInt3144 != local16) {
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
			this.anInt3144 = local16;
		}
		this.anInt3142 &= 0xFFFFFFE3;
		this.anInt3143 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3163 = arg1;
		this.anInt3160 = arg0;
		this.anInt3157 = arg3;
		this.anInt3145 = arg2;
		this.method2511();
		this.method2569();
		if (this.anInt3159 == 3) {
			this.method2543();
		} else if (this.anInt3159 == 2) {
			this.method2573();
			return;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8025(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static400.aFloat155 = arg1;
		Static270.aFloat122 = arg2;
		Static76.aFloat119 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass120_1.method3254(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!er", name = "z", descriptor = "(I)V")
	private void method2569() {
		this.aFloat81 = this.anInt3176 - this.anInt3160;
		this.aFloat91 = this.anInt3153 - this.anInt3160;
		this.aFloat85 = this.anInt3165 - this.anInt3163;
		this.aFloat95 = this.anInt3177 - this.anInt3163;
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "()V")
	@Override
	public void method8023() {
		this.aClass120_1.method3249();
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "(B)V")
	private void method2570() {
		OpenGL.glViewport(this.anInt3178, this.anInt3156, this.anInt3093, this.anInt3063);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZIIZ[B)Lclient!lga;")
	public Interface11 method2571(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) byte[] arg2) {
		return (Interface11) (this.aBoolean208 && (!arg1 || this.aBoolean204) ? new Class26_Sub2(this, 5123, arg2, arg0, arg1) : new Class166_Sub2(this, 5123, arg2, arg0));
	}

	@OriginalMember(owner = "client!er", name = "i", descriptor = "(II)V")
	public void method2572(@OriginalArg(0) int arg0) {
		Static417.aFloatArray54[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static417.aFloatArray54[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		Static417.aFloatArray54[3] = (float) (arg0 >>> 24) / 255.0F;
		Static417.aFloatArray54[2] = (float) (arg0 & 0xFF) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static417.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!wt;Z)Lclient!f;")
	@Override
	public Class73 method8086(@OriginalArg(0) Class365 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt10320 * arg0.anInt10318];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray247 == null) {
			for (local21 = 0; local21 < arg0.anInt10320; local21++) {
				for (local25 = 0; local25 < arg0.anInt10318; local25++) {
					@Pc(38) int local38 = arg0.anIntArray601[arg0.aByteArray246[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt10320; local21++) {
				for (local25 = 0; local25 < arg0.anInt10318; local25++) {
					local12[local16++] = arg0.aByteArray247[local14] << 24 | arg0.anIntArray601[arg0.aByteArray246[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(115) Class73 local115 = this.method8033(local12, arg0.anInt10318, arg0.anInt10318, arg0.anInt10320);
		local115.Q(arg0.anInt10316, arg0.anInt10321, arg0.anInt10317, arg0.anInt10319);
		return local115;
	}

	@OriginalMember(owner = "client!er", name = "A", descriptor = "(I)V")
	private void method2573() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray31, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!er", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean223) {
			throw new RuntimeException("");
		}
		this.anInt3171 = arg3;
		this.anInt3175 = arg2;
		this.anInt3155 = arg0;
		this.anInt3166 = arg1;
		if (this.aBoolean211) {
			this.aClass355_1.aClass15_Sub2_1.method162();
			this.aClass355_1.aClass15_Sub2_1.method164();
		}
	}

	@OriginalMember(owner = "client!er", name = "B", descriptor = "(I)V")
	public void method2574() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray29, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray28, 0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method8056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class53 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class53_Sub2 local6 = (Class53_Sub2) arg5;
		@Pc(9) Class50_Sub1_Sub1 local9 = local6.aClass50_Sub1_Sub1_3;
		this.method2501();
		this.method2535(local6.aClass50_Sub1_Sub1_3);
		this.method2568(1);
		this.method2536(8448, 7681);
		this.method2523(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat57 / (float) local9.anInt1674;
		@Pc(46) float local46 = local9.aFloat58 / (float) local9.anInt1677;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(60) float local60 = (float) -arg1 + (float) arg3;
		@Pc(73) float local73 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local60 * local60)));
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(92) float local92 = local53 * local73;
		@Pc(96) float local96 = local60 * local73;
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f(local39 * (float) (arg2 - arg6), local46 * (float) (arg3 - arg7));
		OpenGL.glVertex2f((float) arg2 + local92 + 0.35F, (float) arg3 + local96 + 0.35F);
		OpenGL.glEnd();
		this.method2523(768, 5890, 0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!tt;I)V")
	@Override
	public void method8070(@OriginalArg(0) Class323 arg0, @OriginalArg(1) int arg1) {
		this.aClass12_1.method117(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "([I)V")
	@Override
	public void method8057(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt3063;
		arg0[0] = this.anInt3093;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IIIZ)Lclient!vd;")
	public Interface22 method2575(@OriginalArg(0) Buffer arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return (Interface22) (this.aBoolean208 ? new Class26_Sub1(this, arg1, arg0, arg2, false) : new Class166_Sub1(this, arg1, arg0));
	}

	@OriginalMember(owner = "client!er", name = "C", descriptor = "(I)V")
	private void method2576() {
		if (this.anInt3153 >= this.anInt3176 && this.anInt3177 <= this.anInt3165) {
			OpenGL.glScissor(this.anInt3178 + this.anInt3176, this.anInt3156 - -this.anInt3063 + -this.anInt3165, this.anInt3153 - this.anInt3176, this.anInt3165 - this.anInt3177);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZII[B)Lclient!vd;")
	public Interface22 method2577(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		return (Interface22) (this.aBoolean208 && (!arg1 || this.aBoolean204) ? new Class26_Sub1(this, arg0, arg3, arg2, arg1) : new Class166_Sub1(this, arg0, arg3, arg2));
	}

	@OriginalMember(owner = "client!er", name = "j", descriptor = "(II)V")
	public synchronized void method2578(@OriginalArg(1) int arg0) {
		@Pc(11) Class3 local11 = new Class3();
		local11.aLong262 = arg0;
		this.aClass244_32.method5570(local11);
	}

	@OriginalMember(owner = "client!er", name = "k", descriptor = "(B)V")
	private void method2579() {
		Static417.aFloatArray54[1] = this.aFloat90 * this.aFloat76;
		Static417.aFloatArray54[3] = 1.0F;
		Static417.aFloatArray54[2] = this.aFloat88 * this.aFloat90;
		Static417.aFloatArray54[0] = this.aFloat90 * this.aFloat86;
		OpenGL.glLightfv(16384, 4609, Static417.aFloatArray54, 0);
		Static417.aFloatArray54[2] = this.aFloat88 * -this.aFloat96;
		Static417.aFloatArray54[0] = this.aFloat86 * -this.aFloat96;
		Static417.aFloatArray54[1] = this.aFloat76 * -this.aFloat96;
		Static417.aFloatArray54[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, Static417.aFloatArray54, 0);
	}

	@OriginalMember(owner = "client!er", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class53_Sub2 local6 = (Class53_Sub2) arg1;
		@Pc(9) Class50_Sub1_Sub1 local9 = local6.aClass50_Sub1_Sub1_3;
		this.method2501();
		this.method2535(local6.aClass50_Sub1_Sub1_3);
		this.method2568(1);
		this.method2536(8448, 7681);
		this.method2523(768, 34167, 0);
		@Pc(39) float local39 = local9.aFloat57 / (float) local9.anInt1674;
		@Pc(46) float local46 = local9.aFloat58 / (float) local9.anInt1677;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3176 - arg2), (float) (this.anInt3177 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3176, this.anInt3177);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3176 - arg2), local46 * (float) (this.anInt3165 - arg3));
		OpenGL.glVertex2i(this.anInt3176, this.anInt3165);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt3153 - arg2), local46 * (float) (this.anInt3165 - arg3));
		OpenGL.glVertex2i(this.anInt3153, this.anInt3165);
		OpenGL.glTexCoord2f((float) (this.anInt3153 - arg2) * local39, (float) (this.anInt3177 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt3153, this.anInt3177);
		OpenGL.glEnd();
		this.method2523(768, 5890, 0);
	}

	@OriginalMember(owner = "client!er", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method2551();
		this.method2568(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method8062(@OriginalArg(0) Class42 arg0) {
		this.aClass42_Sub1_3.M(arg0);
		this.bf.M(this.aClass42_Sub1_3);
		this.bf.method1233();
		this.aClass42_Sub1_4.method1228(this.bf);
		if (this.anInt3159 != 1) {
			this.method2525();
		}
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "(B)V")
	private void method2580() {
		if (this.aBoolean227 && !this.aBoolean228) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!er", name = "l", descriptor = "()Z")
	@Override
	public boolean method8040() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "p", descriptor = "()Z")
	@Override
	public boolean method8054() {
		return true;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method2551();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method2568(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean217) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean217) {
			OpenGL.glEnable(32925);
		}
	}
}
