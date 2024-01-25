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

@OriginalClass("client!qfa")
public final class Class137_Sub3 extends Class137 {

	@OriginalMember(owner = "client!qfa", name = "x", descriptor = "I")
	public int anInt8349;

	@OriginalMember(owner = "client!qfa", name = "Eb", descriptor = "I")
	public int anInt8404;

	@OriginalMember(owner = "client!qfa", name = "Vd", descriptor = "I")
	private int anInt8519;

	@OriginalMember(owner = "client!qfa", name = "de", descriptor = "I")
	private int anInt8527;

	@OriginalMember(owner = "client!qfa", name = "Be", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!qfa", name = "De", descriptor = "I")
	public int anInt8544;

	@OriginalMember(owner = "client!qfa", name = "Ie", descriptor = "Lclient!rea;")
	private Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!qfa", name = "Le", descriptor = "Lclient!gja;")
	private Class125 aClass125_6;

	@OriginalMember(owner = "client!qfa", name = "Me", descriptor = "Lclient!iha;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!qfa", name = "Pe", descriptor = "Lclient!iha;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!qfa", name = "Se", descriptor = "I")
	public int anInt8550;

	@OriginalMember(owner = "client!qfa", name = "Ue", descriptor = "I")
	private int anInt8551;

	@OriginalMember(owner = "client!qfa", name = "Ve", descriptor = "I")
	public int anInt8552;

	@OriginalMember(owner = "client!qfa", name = "cf", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!qfa", name = "df", descriptor = "Z")
	private boolean aBoolean582;

	@OriginalMember(owner = "client!qfa", name = "ef", descriptor = "Z")
	private boolean aBoolean583;

	@OriginalMember(owner = "client!qfa", name = "ff", descriptor = "Z")
	private boolean aBoolean584;

	@OriginalMember(owner = "client!qfa", name = "gf", descriptor = "I")
	private int anInt8553;

	@OriginalMember(owner = "client!qfa", name = "hf", descriptor = "I")
	private int anInt8554;

	@OriginalMember(owner = "client!qfa", name = "kf", descriptor = "I")
	private int anInt8555;

	@OriginalMember(owner = "client!qfa", name = "lf", descriptor = "J")
	private long aLong230;

	@OriginalMember(owner = "client!qfa", name = "of", descriptor = "Z")
	private boolean aBoolean585;

	@OriginalMember(owner = "client!qfa", name = "rf", descriptor = "Z")
	public boolean aBoolean586;

	@OriginalMember(owner = "client!qfa", name = "tf", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_1;

	@OriginalMember(owner = "client!qfa", name = "uf", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_2;

	@OriginalMember(owner = "client!qfa", name = "wf", descriptor = "Z")
	private boolean aBoolean587;

	@OriginalMember(owner = "client!qfa", name = "yf", descriptor = "Z")
	private boolean aBoolean588;

	@OriginalMember(owner = "client!qfa", name = "zf", descriptor = "F")
	public float aFloat192;

	@OriginalMember(owner = "client!qfa", name = "Cf", descriptor = "F")
	public float aFloat193;

	@OriginalMember(owner = "client!qfa", name = "Ef", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_3;

	@OriginalMember(owner = "client!qfa", name = "Mf", descriptor = "I")
	private int anInt8563;

	@OriginalMember(owner = "client!qfa", name = "Nf", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!qfa", name = "Pf", descriptor = "Z")
	private boolean aBoolean591;

	@OriginalMember(owner = "client!qfa", name = "Qf", descriptor = "Lclient!gja;")
	public Class125 aClass125_7;

	@OriginalMember(owner = "client!qfa", name = "Uf", descriptor = "I")
	public int anInt8567;

	@OriginalMember(owner = "client!qfa", name = "Vf", descriptor = "Lclient!gda;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!qfa", name = "Wf", descriptor = "F")
	private float aFloat198;

	@OriginalMember(owner = "client!qfa", name = "Xf", descriptor = "I")
	private int anInt8568;

	@OriginalMember(owner = "client!qfa", name = "Yf", descriptor = "F")
	public float aFloat199;

	@OriginalMember(owner = "client!qfa", name = "Zf", descriptor = "Lclient!km;")
	public Class66_Sub1 aClass66_Sub1_6;

	@OriginalMember(owner = "client!qfa", name = "ag", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_4;

	@OriginalMember(owner = "client!qfa", name = "bg", descriptor = "Z")
	public boolean aBoolean593;

	@OriginalMember(owner = "client!qfa", name = "dg", descriptor = "Z")
	public boolean aBoolean594;

	@OriginalMember(owner = "client!qfa", name = "eg", descriptor = "Z")
	public boolean aBoolean595;

	@OriginalMember(owner = "client!qfa", name = "hg", descriptor = "Z")
	public boolean aBoolean597;

	@OriginalMember(owner = "client!qfa", name = "ig", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_5;

	@OriginalMember(owner = "client!qfa", name = "kg", descriptor = "Z")
	public boolean aBoolean598;

	@OriginalMember(owner = "client!qfa", name = "mg", descriptor = "Z")
	public boolean aBoolean599;

	@OriginalMember(owner = "client!qfa", name = "ng", descriptor = "Ljava/lang/String;")
	private String aString82;

	@OriginalMember(owner = "client!qfa", name = "qg", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!qfa", name = "rg", descriptor = "F")
	public float aFloat203;

	@OriginalMember(owner = "client!qfa", name = "ug", descriptor = "[Lclient!dca;")
	private Class66[] aClass66Array1;

	@OriginalMember(owner = "client!qfa", name = "wg", descriptor = "I")
	private int anInt8572;

	@OriginalMember(owner = "client!qfa", name = "xg", descriptor = "I")
	private int anInt8573;

	@OriginalMember(owner = "client!qfa", name = "Ag", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_6;

	@OriginalMember(owner = "client!qfa", name = "Bg", descriptor = "Lclient!cw;")
	private Class66_Sub1_Sub1 aClass66_Sub1_Sub1_2;

	@OriginalMember(owner = "client!qfa", name = "Dg", descriptor = "Z")
	public boolean aBoolean602;

	@OriginalMember(owner = "client!qfa", name = "Eg", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_7;

	@OriginalMember(owner = "client!qfa", name = "Gg", descriptor = "F")
	public float aFloat206;

	@OriginalMember(owner = "client!qfa", name = "Hg", descriptor = "I")
	public int anInt8575;

	@OriginalMember(owner = "client!qfa", name = "Jg", descriptor = "Lclient!hq;")
	private Class144_Sub2 aClass144_Sub2_1;

	@OriginalMember(owner = "client!qfa", name = "Kg", descriptor = "I")
	private int anInt8577;

	@OriginalMember(owner = "client!qfa", name = "Mg", descriptor = "Lclient!kda;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!qfa", name = "Og", descriptor = "Z")
	private boolean aBoolean604;

	@OriginalMember(owner = "client!qfa", name = "Rg", descriptor = "Lclient!ei;")
	public Class91 aClass91_8;

	@OriginalMember(owner = "client!qfa", name = "Sg", descriptor = "Lclient!ei;")
	public Class91 aClass91_9;

	@OriginalMember(owner = "client!qfa", name = "Ug", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_8;

	@OriginalMember(owner = "client!qfa", name = "Wg", descriptor = "Z")
	public boolean aBoolean605;

	@OriginalMember(owner = "client!qfa", name = "Xg", descriptor = "Lclient!gda;")
	private Interface8 anInterface8_5;

	@OriginalMember(owner = "client!qfa", name = "Yg", descriptor = "I")
	private int anInt8581;

	@OriginalMember(owner = "client!qfa", name = "ah", descriptor = "I")
	private int anInt8583;

	@OriginalMember(owner = "client!qfa", name = "ch", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!qfa", name = "dh", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_9;

	@OriginalMember(owner = "client!qfa", name = "eh", descriptor = "F")
	private float aFloat209;

	@OriginalMember(owner = "client!qfa", name = "gh", descriptor = "I")
	public int anInt8585;

	@OriginalMember(owner = "client!qfa", name = "ih", descriptor = "Lclient!hba;")
	public Class80_Sub2 aClass80_Sub2_10;

	@OriginalMember(owner = "client!qfa", name = "jh", descriptor = "Ljava/lang/String;")
	private String aString83;

	@OriginalMember(owner = "client!qfa", name = "mh", descriptor = "F")
	private float aFloat211;

	@OriginalMember(owner = "client!qfa", name = "ph", descriptor = "Z")
	private boolean aBoolean609;

	@OriginalMember(owner = "client!qfa", name = "qh", descriptor = "Z")
	private boolean aBoolean610;

	@OriginalMember(owner = "client!qfa", name = "uh", descriptor = "I")
	private int anInt8589;

	@OriginalMember(owner = "client!qfa", name = "vh", descriptor = "I")
	private int anInt8590;

	@OriginalMember(owner = "client!qfa", name = "wh", descriptor = "I")
	private int anInt8591;

	@OriginalMember(owner = "client!qfa", name = "Y", descriptor = "Ljava/util/Hashtable;")
	private final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!qfa", name = "he", descriptor = "I")
	public int anInt8531 = 128;

	@OriginalMember(owner = "client!qfa", name = "xe", descriptor = "Lclient!vf;")
	private final Class364 aClass364_1 = new Class364();

	@OriginalMember(owner = "client!qfa", name = "ze", descriptor = "Lclient!ou;")
	private final Class26_Sub3 aClass26_Sub3_1 = new Class26_Sub3();

	@OriginalMember(owner = "client!qfa", name = "Ae", descriptor = "Lclient!ou;")
	public final Class26_Sub3 aClass26_Sub3_2 = new Class26_Sub3();

	@OriginalMember(owner = "client!qfa", name = "Fe", descriptor = "I")
	public int anInt8545 = 3;

	@OriginalMember(owner = "client!qfa", name = "Ge", descriptor = "Z")
	private boolean aBoolean580 = false;

	@OriginalMember(owner = "client!qfa", name = "He", descriptor = "I")
	public int anInt8546 = 8;

	@OriginalMember(owner = "client!qfa", name = "Ce", descriptor = "Lclient!ok;")
	private final Class262 aClass262_50 = new Class262();

	@OriginalMember(owner = "client!qfa", name = "Je", descriptor = "I")
	private int anInt8547 = -1;

	@OriginalMember(owner = "client!qfa", name = "Ke", descriptor = "I")
	private int anInt8548 = -1;

	@OriginalMember(owner = "client!qfa", name = "Oe", descriptor = "I")
	private int anInt8549 = -1;

	@OriginalMember(owner = "client!qfa", name = "Qe", descriptor = "[Lclient!iha;")
	private final Interface11[] anInterface11Array2 = new Interface11[4];

	@OriginalMember(owner = "client!qfa", name = "Ne", descriptor = "[Lclient!iha;")
	private final Interface11[] anInterface11Array1 = new Interface11[4];

	@OriginalMember(owner = "client!qfa", name = "Re", descriptor = "[Lclient!iha;")
	private final Interface11[] anInterface11Array3 = new Interface11[4];

	@OriginalMember(owner = "client!qfa", name = "Te", descriptor = "Lclient!ok;")
	private final Class262 aClass262_51;

	@OriginalMember(owner = "client!qfa", name = "We", descriptor = "Lclient!ok;")
	private final Class262 aClass262_52;

	@OriginalMember(owner = "client!qfa", name = "Xe", descriptor = "Lclient!ok;")
	private final Class262 aClass262_53;

	@OriginalMember(owner = "client!qfa", name = "Ye", descriptor = "Lclient!ok;")
	private final Class262 aClass262_54;

	@OriginalMember(owner = "client!qfa", name = "Ze", descriptor = "Lclient!ok;")
	private final Class262 aClass262_55;

	@OriginalMember(owner = "client!qfa", name = "af", descriptor = "Lclient!ok;")
	private final Class262 aClass262_56;

	@OriginalMember(owner = "client!qfa", name = "bf", descriptor = "Lclient!ok;")
	private final Class262 bf;

	@OriginalMember(owner = "client!qfa", name = "jf", descriptor = "Lclient!ou;")
	public final Class26_Sub3 aClass26_Sub3_3;

	@OriginalMember(owner = "client!qfa", name = "mf", descriptor = "Lclient!ou;")
	public final Class26_Sub3 aClass26_Sub3_4;

	@OriginalMember(owner = "client!qfa", name = "nf", descriptor = "Lclient!ou;")
	public final Class26_Sub3 aClass26_Sub3_5;

	@OriginalMember(owner = "client!qfa", name = "Df", descriptor = "[F")
	private final float[] aFloatArray63;

	@OriginalMember(owner = "client!qfa", name = "Sf", descriptor = "F")
	private float aFloat197;

	@OriginalMember(owner = "client!qfa", name = "Tf", descriptor = "I")
	public int anInt8566;

	@OriginalMember(owner = "client!qfa", name = "Gf", descriptor = "I")
	public int anInt8561;

	@OriginalMember(owner = "client!qfa", name = "If", descriptor = "F")
	public float aFloat196;

	@OriginalMember(owner = "client!qfa", name = "jg", descriptor = "F")
	private float aFloat201;

	@OriginalMember(owner = "client!qfa", name = "Kf", descriptor = "I")
	public int anInt8562;

	@OriginalMember(owner = "client!qfa", name = "Ff", descriptor = "F")
	private float aFloat194;

	@OriginalMember(owner = "client!qfa", name = "vf", descriptor = "I")
	public int anInt8559;

	@OriginalMember(owner = "client!qfa", name = "sf", descriptor = "I")
	private int anInt8558;

	@OriginalMember(owner = "client!qfa", name = "lg", descriptor = "I")
	public int anInt8570;

	@OriginalMember(owner = "client!qfa", name = "fg", descriptor = "F")
	public float aFloat200;

	@OriginalMember(owner = "client!qfa", name = "Cg", descriptor = "I")
	private int anInt8574;

	@OriginalMember(owner = "client!qfa", name = "Of", descriptor = "I")
	private int anInt8565;

	@OriginalMember(owner = "client!qfa", name = "zg", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!qfa", name = "Hf", descriptor = "F")
	private float aFloat195;

	@OriginalMember(owner = "client!qfa", name = "Fg", descriptor = "[F")
	public final float[] aFloatArray65;

	@OriginalMember(owner = "client!qfa", name = "sg", descriptor = "[F")
	private final float[] aFloatArray64;

	@OriginalMember(owner = "client!qfa", name = "cg", descriptor = "I")
	public int anInt8569;

	@OriginalMember(owner = "client!qfa", name = "xf", descriptor = "F")
	public float aFloat191;

	@OriginalMember(owner = "client!qfa", name = "qf", descriptor = "I")
	private int anInt8557;

	@OriginalMember(owner = "client!qfa", name = "Qg", descriptor = "I")
	private int anInt8580;

	@OriginalMember(owner = "client!qfa", name = "tg", descriptor = "[Lclient!qm;")
	private final Class14_Sub37[] aClass14_Sub37Array5;

	@OriginalMember(owner = "client!qfa", name = "yg", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!qfa", name = "vg", descriptor = "I")
	public int anInt8571;

	@OriginalMember(owner = "client!qfa", name = "Lg", descriptor = "I")
	public int anInt8578;

	@OriginalMember(owner = "client!qfa", name = "Ig", descriptor = "I")
	private int anInt8576;

	@OriginalMember(owner = "client!qfa", name = "bh", descriptor = "F")
	private float aFloat208;

	@OriginalMember(owner = "client!qfa", name = "fh", descriptor = "I")
	public int anInt8584;

	@OriginalMember(owner = "client!qfa", name = "Tg", descriptor = "[F")
	private final float[] aFloatArray66;

	@OriginalMember(owner = "client!qfa", name = "Vg", descriptor = "F")
	public float aFloat207;

	@OriginalMember(owner = "client!qfa", name = "kh", descriptor = "F")
	public float aFloat210;

	@OriginalMember(owner = "client!qfa", name = "Pg", descriptor = "I")
	public int anInt8579;

	@OriginalMember(owner = "client!qfa", name = "nh", descriptor = "[F")
	private final float[] aFloatArray67;

	@OriginalMember(owner = "client!qfa", name = "rh", descriptor = "I")
	public int anInt8587;

	@OriginalMember(owner = "client!qfa", name = "Zg", descriptor = "I")
	private int anInt8582;

	@OriginalMember(owner = "client!qfa", name = "Ng", descriptor = "Z")
	private boolean aBoolean603;

	@OriginalMember(owner = "client!qfa", name = "hh", descriptor = "I")
	private int anInt8586;

	@OriginalMember(owner = "client!qfa", name = "Bf", descriptor = "I")
	private int anInt8560;

	@OriginalMember(owner = "client!qfa", name = "sh", descriptor = "I")
	private int anInt8588;

	@OriginalMember(owner = "client!qfa", name = "th", descriptor = "Z")
	private boolean aBoolean611;

	@OriginalMember(owner = "client!qfa", name = "Af", descriptor = "Lclient!nga;")
	public Class14_Sub29_Sub2 aClass14_Sub29_Sub2_2;

	@OriginalMember(owner = "client!qfa", name = "xh", descriptor = "[I")
	public int[] anIntArray632;

	@OriginalMember(owner = "client!qfa", name = "yh", descriptor = "[B")
	public final byte[] aByteArray98;

	@OriginalMember(owner = "client!qfa", name = "zh", descriptor = "[I")
	public int[] anIntArray633;

	@OriginalMember(owner = "client!qfa", name = "Ah", descriptor = "[I")
	public int[] anIntArray634;

	@OriginalMember(owner = "client!qfa", name = "Yb", descriptor = "Ljava/awt/Canvas;")
	private final Canvas aCanvas10;

	@OriginalMember(owner = "client!qfa", name = "Uc", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas11;

	@OriginalMember(owner = "client!qfa", name = "ye", descriptor = "I")
	public final int anInt8543;

	@OriginalMember(owner = "client!qfa", name = "od", descriptor = "Lclient!jaggl/OpenGL;")
	private OpenGL anOpenGL2;

	@OriginalMember(owner = "client!qfa", name = "md", descriptor = "J")
	private final long aLong229;

	@OriginalMember(owner = "client!qfa", name = "Sc", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!qfa", name = "pf", descriptor = "I")
	public final int anInt8556;

	@OriginalMember(owner = "client!qfa", name = "pg", descriptor = "Z")
	private boolean aBoolean601;

	@OriginalMember(owner = "client!qfa", name = "Jf", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!qfa", name = "lh", descriptor = "Z")
	public boolean aBoolean607;

	@OriginalMember(owner = "client!qfa", name = "gg", descriptor = "Z")
	public boolean aBoolean596;

	@OriginalMember(owner = "client!qfa", name = "Lf", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!qfa", name = "og", descriptor = "Z")
	public boolean aBoolean600;

	@OriginalMember(owner = "client!qfa", name = "oh", descriptor = "Z")
	public boolean aBoolean608;

	@OriginalMember(owner = "client!qfa", name = "Rf", descriptor = "Z")
	private final boolean aBoolean592;

	@OriginalMember(owner = "client!qfa", name = "me", descriptor = "Lclient!wca;")
	private final Class379 aClass379_1;

	@OriginalMember(owner = "client!qfa", name = "Ee", descriptor = "Lclient!ov;")
	public final Class268 aClass268_1;

	@OriginalMember(owner = "client!qfa", name = "re", descriptor = "Lclient!mja;")
	private final Class234 aClass234_1;

	@OriginalMember(owner = "client!qfa", name = "ve", descriptor = "Lclient!dka;")
	private Class14_Sub16_Sub1 aClass14_Sub16_Sub1_1;

	@OriginalMember(owner = "client!qfa", name = "ue", descriptor = "Lclient!hf;")
	private final Class140 aClass140_1;

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;I)V")
	public Class137_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg1);
		new Class73();
		new Class187(16);
		this.aClass262_51 = new Class262();
		this.aClass262_52 = new Class262();
		this.aClass262_53 = new Class262();
		this.aClass262_54 = new Class262();
		this.aClass262_55 = new Class262();
		this.aClass262_56 = new Class262();
		this.bf = new Class262();
		this.aClass26_Sub3_3 = new Class26_Sub3();
		this.aClass26_Sub3_4 = new Class26_Sub3();
		this.aClass26_Sub3_5 = new Class26_Sub3();
		this.aFloatArray63 = new float[4];
		this.aFloat197 = -1.0F;
		this.anInt8566 = 512;
		this.anInt8561 = 50;
		this.aFloat196 = 3584.0F;
		this.aFloat201 = 0.0F;
		this.anInt8562 = 0;
		this.aFloat194 = -1.0F;
		this.anInt8559 = 0;
		this.anInt8558 = 0;
		this.anInt8570 = -1;
		this.aFloat200 = 3584.0F;
		this.anInt8574 = 0;
		this.anInt8565 = 8448;
		this.aFloat205 = 1.0F;
		this.aFloat195 = 1.0F;
		this.aFloatArray65 = new float[4];
		this.aFloatArray64 = new float[4];
		this.anInt8569 = -1;
		this.aFloat191 = 1.0F;
		this.anInt8557 = 0;
		this.anInt8580 = 0;
		this.aClass14_Sub37Array5 = new Class14_Sub37[Static235.anInt4297];
		this.aFloat204 = -1.0F;
		this.anInt8571 = -1;
		this.anInt8578 = 512;
		this.anInt8576 = -1;
		this.aFloat208 = 1.0F;
		this.anInt8584 = 0;
		this.aFloatArray66 = new float[4];
		this.aFloat207 = -1.0F;
		this.aFloat210 = 1.0F;
		this.anInt8579 = 0;
		this.aFloatArray67 = new float[16];
		this.anInt8587 = -1;
		this.anInt8582 = 0;
		this.aBoolean603 = true;
		this.anInt8586 = 0;
		this.anInt8560 = 8448;
		this.anInt8588 = 3584;
		this.aBoolean611 = false;
		this.aClass14_Sub29_Sub2_2 = new Class14_Sub29_Sub2(8192);
		this.anIntArray632 = new int[1];
		this.aByteArray98 = new byte[16384];
		this.anIntArray633 = new int[1];
		this.anIntArray634 = new int[1];
		this.aCanvas11 = this.aCanvas10 = arg0;
		this.anInt8543 = arg2;
		if (!Static160.method2605("jaclib")) {
			throw new RuntimeException("");
		} else if (Static160.method2605("jaggl")) {
			try {
				this.anOpenGL2 = new OpenGL();
				this.aLong228 = this.aLong229 = this.anOpenGL2.init(arg0, 8, 8, 8, 24, 0, this.anInt8543);
				if (this.aLong229 == 0L) {
					throw new RuntimeException("");
				}
				this.method7086();
				@Pc(333) int local333 = this.method7048();
				if (local333 != 0) {
					throw new RuntimeException("");
				}
				this.anInt8556 = this.aBoolean594 ? 33639 : 5121;
				if (this.aString83.indexOf("radeon") != -1) {
					@Pc(356) int local356 = 0;
					@Pc(358) boolean local358 = false;
					@Pc(360) boolean local360 = false;
					@Pc(369) String[] local369 = Static111.method1920(' ', this.aString83.replace('/', ' '));
					for (@Pc(371) int local371 = 0; local371 < local369.length; local371++) {
						@Pc(377) String local377 = local369[local371];
						try {
							if (local377.length() > 0) {
								if (local377.charAt(0) == 'x' && local377.length() >= 3 && Static324.method5106(local377.substring(1, 3))) {
									local360 = true;
									local377 = local377.substring(1);
								}
								if (local377.equals("hd")) {
									local358 = true;
								} else {
									if (local377.startsWith("hd")) {
										local358 = true;
										local377 = local377.substring(2);
									}
									if (local377.length() >= 4 && Static324.method5106(local377.substring(0, 4))) {
										local356 = Static235.method3555(local377.substring(0, 4));
										break;
									}
								}
							}
						} catch (@Pc(447) Exception local447) {
						}
					}
					if (!local360 && !local358) {
						if (local356 >= 7000 && local356 <= 7999) {
							this.aBoolean601 = false;
						}
						if (local356 >= 7000 && local356 <= 9250) {
							this.aBoolean589 = false;
						}
					}
					if (!local358 || local356 < 4000) {
						this.aBoolean607 = false;
					}
					this.aBoolean596 &= this.anOpenGL2.a("GL_ARB_half_float_pixel");
					this.aBoolean590 = this.aBoolean601;
					this.aBoolean600 = true;
				}
				if (this.aString82.indexOf("intel") != -1) {
					this.aBoolean608 = false;
				}
				this.aBoolean592 = !this.aString82.equals("s3 graphics");
				if (this.aBoolean601) {
					try {
						@Pc(537) int[] local537 = new int[1];
						OpenGL.glGenBuffersARB(1, local537, 0);
					} catch (@Pc(543) Throwable local543) {
						throw new RuntimeException("");
					}
				}
				Static479.method7114(true, false);
				this.aBoolean580 = true;
				this.aClass379_1 = new Class379(this, super.anInterface3_11);
				this.method7080();
				this.aClass268_1 = new Class268(this);
				this.aClass234_1 = new Class234(this);
				if (this.aClass234_1.method5540()) {
					this.aClass14_Sub16_Sub1_1 = new Class14_Sub16_Sub1(this);
					if (!this.aClass14_Sub16_Sub1_1.method1895()) {
						this.aClass14_Sub16_Sub1_1.method1887();
						this.aClass14_Sub16_Sub1_1 = null;
					}
				}
				this.aClass140_1 = new Class140(this);
				this.method7078();
				this.method7088();
				this.method7948();
			} catch (@Pc(617) Throwable local617) {
				local617.printStackTrace();
				this.method7905();
				throw new RuntimeException("");
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "()Z")
	@Override
	public boolean method7868() {
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!pt;)V")
	@Override
	public void method7933(@OriginalArg(0) Interface23 arg0) {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIF)Lclient!qm;")
	@Override
	public Class14_Sub37 method7871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Class14_Sub37_Sub3(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ie;[Lclient!us;Z)Lclient!da;")
	@Override
	public Class38 method7870(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class356[] arg1) {
		return new Class38_Sub1(this, arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qfa", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.anInt8569 && this.anInt8587 == arg1 && this.anInt8562 == arg2) {
			return;
		}
		this.anInt8587 = arg1;
		this.anInt8562 = arg2;
		this.anInt8569 = arg0;
		this.method7083();
		this.method7034();
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(II)Lclient!ts;")
	@Override
	public Interface26 method7934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(III)V")
	public synchronized void method7024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class14_Sub18 local8 = new Class14_Sub18(arg1);
		local8.aLong305 = (long) arg0;
		this.aClass262_52.method6314(local8);
	}

	@OriginalMember(owner = "client!qfa", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(18) float local18 = local8 + (float) arg2;
		this.method7028();
		@Pc(26) float local26 = (float) arg3 + local13;
		this.method7082(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean585) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local26);
		OpenGL.glVertex2f(local18, local26);
		OpenGL.glVertex2f(local18, local13);
		OpenGL.glEnd();
		if (this.aBoolean585) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(I)V")
	private void method7025() {
		if (this.anInt8573 != 2) {
			this.anInt8573 = 2;
			this.method7074();
			this.method7102();
			this.anInt8554 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method7950(@OriginalArg(0) Class26 arg0) {
		this.aClass26_Sub3_3.method6447(arg0);
		this.aClass26_Sub3_4.method6447(this.aClass26_Sub3_3);
		this.aClass26_Sub3_4.method6468();
		this.aClass26_Sub3_5.method6469(this.aClass26_Sub3_4);
		if (this.anInt8573 != 1) {
			this.method7102();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "(I)V")
	@Override
	public void method7926(@OriginalArg(0) int arg0) {
		this.method7086();
	}

	@OriginalMember(owner = "client!qfa", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (this.anInt8404 < arg2) {
			arg2 = this.anInt8404;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (this.anInt8349 < arg3) {
			arg3 = this.anInt8349;
		}
		this.anInt8558 = arg1;
		this.anInt8557 = arg2;
		this.anInt8574 = arg3;
		this.anInt8580 = arg0;
		OpenGL.glEnable(3089);
		this.method7044();
		this.method7061();
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(I)V")
	@Override
	public void method7913(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "()V")
	@Override
	public void method7946() {
		OpenGL.glFinish();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return Static535.method7640(arg3, this, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(30) float local30 = (float) arg2 * this.aClass26_Sub3_3.aFloat179 + (float) arg0 * this.aClass26_Sub3_3.aFloat181 + (float) arg1 * this.aClass26_Sub3_3.aFloat175 + this.aClass26_Sub3_3.aFloat171;
		@Pc(55) float local55 = (float) arg4 * this.aClass26_Sub3_3.aFloat175 + (float) arg3 * this.aClass26_Sub3_3.aFloat181 + (float) arg5 * this.aClass26_Sub3_3.aFloat179 + this.aClass26_Sub3_3.aFloat171;
		@Pc(57) int local57 = 0;
		if ((float) this.anInt8561 > local30 && (float) this.anInt8561 > local55) {
			local57 |= 0x10;
		} else if ((float) this.anInt8588 < local30 && (float) this.anInt8588 < local55) {
			local57 |= 0x20;
		}
		@Pc(124) int local124 = (int) ((this.aClass26_Sub3_3.aFloat176 + (float) arg0 * this.aClass26_Sub3_3.aFloat172 + this.aClass26_Sub3_3.aFloat177 * (float) arg1 + (float) arg2 * this.aClass26_Sub3_3.aFloat173) * (float) this.anInt8566 / (float) arg6);
		@Pc(157) int local157 = (int) (((float) arg3 * this.aClass26_Sub3_3.aFloat172 + (float) arg4 * this.aClass26_Sub3_3.aFloat177 + (float) arg5 * this.aClass26_Sub3_3.aFloat173 + this.aClass26_Sub3_3.aFloat176) * (float) this.anInt8566 / (float) arg6);
		if ((float) local124 < this.aFloat199 && (float) local157 < this.aFloat199) {
			local57 |= 0x1;
		} else if ((float) local124 > this.aFloat202 && (float) local157 > this.aFloat202) {
			local57 |= 0x2;
		}
		@Pc(224) int local224 = (int) ((this.aClass26_Sub3_3.aFloat178 + (float) arg2 * this.aClass26_Sub3_3.aFloat174 + this.aClass26_Sub3_3.aFloat182 * (float) arg0 + this.aClass26_Sub3_3.aFloat180 * (float) arg1) * (float) this.anInt8578 / (float) arg6);
		@Pc(257) int local257 = (int) ((float) this.anInt8578 * (this.aClass26_Sub3_3.aFloat174 * (float) arg5 + (float) arg3 * this.aClass26_Sub3_3.aFloat182 + this.aClass26_Sub3_3.aFloat180 * (float) arg4 + this.aClass26_Sub3_3.aFloat178) / (float) arg6);
		if ((float) local224 < this.aFloat192 && (float) local257 < this.aFloat192) {
			local57 |= 0x4;
		} else if ((float) local224 > this.aFloat193 && this.aFloat193 < (float) local257) {
			local57 |= 0x8;
		}
		return local57;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method7882(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg0 & Integer.MAX_VALUE;
		@Pc(19) Class14_Sub18 local19;
		while (!this.aClass262_52.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_52.method6323();
			Static547.anIntArray682[local7++] = (int) local19.aLong305;
			this.anInt8552 -= local19.anInt2644;
			if (local7 == 1000) {
				OpenGL.glDeleteBuffersARB(local7, Static547.anIntArray682, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteBuffersARB(local7, Static547.anIntArray682, 0);
			local7 = 0;
		}
		while (!this.aClass262_53.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_53.method6323();
			Static547.anIntArray682[local7++] = (int) local19.aLong305;
			this.anInt8550 -= local19.anInt2644;
			if (local7 == 1000) {
				OpenGL.glDeleteTextures(local7, Static547.anIntArray682, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteTextures(local7, Static547.anIntArray682, 0);
			local7 = 0;
		}
		while (!this.aClass262_54.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_54.method6323();
			Static547.anIntArray682[local7++] = local19.anInt2644;
			if (local7 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(local7, Static547.anIntArray682, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteFramebuffersEXT(local7, Static547.anIntArray682, 0);
			local7 = 0;
		}
		while (!this.aClass262_55.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_55.method6323();
			Static547.anIntArray682[local7++] = (int) local19.aLong305;
			this.anInt8551 -= local19.anInt2644;
			if (local7 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(local7, Static547.anIntArray682, 0);
				local7 = 0;
			}
		}
		if (local7 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(local7, Static547.anIntArray682, 0);
		}
		while (!this.aClass262_51.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_51.method6323();
			OpenGL.glDeleteLists((int) local19.aLong305, local19.anInt2644);
		}
		@Pc(212) Class14 local212;
		while (!this.aClass262_56.method6324()) {
			local212 = this.aClass262_56.method6323();
			OpenGL.glDeleteProgramARB((int) local212.aLong305);
		}
		while (!this.bf.method6324()) {
			local212 = this.bf.method6323();
			OpenGL.glDeleteObjectARB(local212.aLong305);
		}
		while (!this.aClass262_51.method6324()) {
			local19 = (Class14_Sub18) this.aClass262_51.method6323();
			OpenGL.glDeleteLists((int) local19.aLong305, local19.anInt2644);
		}
		this.aClass379_1.method9074();
		if (this.E() > 100663296 && this.aLong230 + 60000L < Static521.method7499()) {
			System.gc();
			this.aLong230 = Static521.method7499();
		}
		this.anInt8544 = local11;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!kd;I)V")
	@Override
	public void method7942(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1) {
		this.aClass364_1.method8808(arg1, this, arg0);
	}

	@OriginalMember(owner = "client!qfa", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(15) boolean local15 = this.anInt8576 != arg0;
		if (local15 || arg1 != this.aFloat207 || arg2 != this.aFloat204) {
			this.anInt8576 = arg0;
			this.aFloat207 = arg1;
			this.aFloat204 = arg2;
			if (local15) {
				this.aFloat210 = (float) (this.anInt8576 & 0xFF00) / 65280.0F;
				this.aFloat205 = (float) (this.anInt8576 & 0xFF0000) / 1.671168E7F;
				this.aFloat191 = (float) (this.anInt8576 & 0xFF) / 255.0F;
				this.method7053();
			}
			this.method7097();
		}
		if (arg3 == this.aFloatArray63[0] && arg4 == this.aFloatArray63[1] && this.aFloatArray63[2] == arg5) {
			return;
		}
		this.aFloatArray63[1] = arg4;
		this.aFloatArray63[2] = arg5;
		this.aFloatArray63[0] = arg3;
		this.aFloatArray66[1] = -arg4;
		this.aFloatArray66[2] = -arg5;
		this.aFloatArray66[0] = -arg3;
		@Pc(142) float local142 = (float) (1.0D / Math.sqrt((double) (arg4 * arg4 + arg3 * arg3 + arg5 * arg5)));
		this.aFloatArray65[2] = local142 * arg5;
		this.aFloatArray65[0] = local142 * arg3;
		this.aFloatArray65[1] = arg4 * local142;
		this.aFloatArray64[1] = -this.aFloatArray65[1];
		this.aFloatArray64[0] = -this.aFloatArray65[0];
		this.aFloatArray64[2] = -this.aFloatArray65[2];
		this.method7035();
		this.anInt8585 = (int) (arg3 * 256.0F / arg4);
		this.anInt8564 = (int) (arg5 * 256.0F / arg4);
	}

	@OriginalMember(owner = "client!qfa", name = "m", descriptor = "()Z")
	@Override
	public boolean method7899() {
		return false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!ou;)V")
	public void method7026(@OriginalArg(1) Class26_Sub3 arg0) {
		OpenGL.glLoadMatrixf(arg0.method6462(), 0);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7897(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qfa", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		if (arg2 + arg0 < this.anInt8580 || arg0 - arg2 > this.anInt8557 || arg2 + arg1 < this.anInt8558 || arg1 - arg2 > this.anInt8574) {
			return;
		}
		this.method7028();
		this.method7082(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(72) float local72 = (float) arg0 + 0.35F;
		@Pc(77) float local77 = (float) arg1 + 0.35F;
		@Pc(81) int local81 = arg2 << 1;
		if (this.aFloat197 > (float) local81) {
			OpenGL.glBegin(7);
			OpenGL.glVertex2f(local72 + 1.0F, local77 + 1.0F);
			OpenGL.glVertex2f(local72 + 1.0F, -1.0F + local77);
			OpenGL.glVertex2f(local72 - 1.0F, local77 - 1.0F);
			OpenGL.glVertex2f(local72 - 1.0F, local77 + 1.0F);
			OpenGL.glEnd();
		} else if ((float) local81 <= this.aFloat194) {
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
			local136 = Static133.method2141(local136);
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			for (@Pc(167) int local167 = 16384 - local136; local167 > 0; local167 -= local136) {
				OpenGL.glVertex2f((float) arg2 * Class21_Sub5.aFloatArray16[local167] + local72, Class21_Sub5.aFloatArray17[local167] * (float) arg2 + local77);
			}
			OpenGL.glVertex2f(local72 + (float) arg2, local77);
			OpenGL.glEnd();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IIII)V")
	public void method7027(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glTexEnvi(8960, arg1 + 34184, arg0);
		OpenGL.glTexEnvi(8960, arg1 + 34200, 770);
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Z)V")
	private void method7028() {
		if (this.anInt8554 == 1) {
			return;
		}
		this.method7062();
		this.method7079(false);
		this.method7038(false);
		this.method7067(false);
		this.method7073(false);
		this.method7090((Class66) null);
		this.method7029(-2);
		this.method7077(1);
		this.anInt8554 = 1;
	}

	@OriginalMember(owner = "client!qfa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int[] local10 = new int[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			OpenGL.glReadPixelsi(arg0, this.anInt8349 - arg1 - local12, arg2, 1, 32993, this.anInt8556, local10, local12 * arg2);
		}
		return local10;
	}

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "(II)V")
	public void method7029(@OriginalArg(0) int arg0) {
		this.method7032(true, arg0);
	}

	@OriginalMember(owner = "client!qfa", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = 0;
		@Pc(32) float local32 = this.aClass26_Sub3_3.aFloat171 + this.aClass26_Sub3_3.aFloat179 * (float) arg2 + (float) arg1 * this.aClass26_Sub3_3.aFloat175 + (float) arg0 * this.aClass26_Sub3_3.aFloat181;
		if (local32 < 1.0F) {
			local32 = 1.0F;
		}
		@Pc(63) float local63 = this.aClass26_Sub3_3.aFloat179 * (float) arg5 + (float) arg4 * this.aClass26_Sub3_3.aFloat175 + (float) arg3 * this.aClass26_Sub3_3.aFloat181 + this.aClass26_Sub3_3.aFloat171;
		if (local63 < 1.0F) {
			local63 = 1.0F;
		}
		if ((float) this.anInt8561 > local32 && (float) this.anInt8561 > local63) {
			local7 |= 0x10;
		} else if (local32 > (float) this.anInt8588 && local63 > (float) this.anInt8588) {
			local7 |= 0x20;
		}
		@Pc(135) int local135 = (int) ((this.aClass26_Sub3_3.aFloat176 + (float) arg1 * this.aClass26_Sub3_3.aFloat177 + (float) arg0 * this.aClass26_Sub3_3.aFloat172 + this.aClass26_Sub3_3.aFloat173 * (float) arg2) * (float) this.anInt8566 / local32);
		@Pc(167) int local167 = (int) ((this.aClass26_Sub3_3.aFloat176 + (float) arg4 * this.aClass26_Sub3_3.aFloat177 + this.aClass26_Sub3_3.aFloat172 * (float) arg3 + (float) arg5 * this.aClass26_Sub3_3.aFloat173) * (float) this.anInt8566 / local63);
		if (this.aFloat199 > (float) local135 && (float) local167 < this.aFloat199) {
			local7 |= 0x1;
		} else if ((float) local135 > this.aFloat202 && this.aFloat202 < (float) local167) {
			local7 |= 0x2;
		}
		@Pc(233) int local233 = (int) ((this.aClass26_Sub3_3.aFloat178 + (float) arg2 * this.aClass26_Sub3_3.aFloat174 + (float) arg0 * this.aClass26_Sub3_3.aFloat182 + this.aClass26_Sub3_3.aFloat180 * (float) arg1) * (float) this.anInt8578 / local32);
		@Pc(265) int local265 = (int) ((float) this.anInt8578 * (this.aClass26_Sub3_3.aFloat174 * (float) arg5 + this.aClass26_Sub3_3.aFloat180 * (float) arg4 + this.aClass26_Sub3_3.aFloat182 * (float) arg3 + this.aClass26_Sub3_3.aFloat178) / local63);
		if ((float) local233 < this.aFloat192 && this.aFloat192 > (float) local265) {
			local7 |= 0x4;
		} else if (this.aFloat193 < (float) local233 && (float) local265 > this.aFloat193) {
			local7 |= 0x8;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!iha;Z)V")
	public void method7030(@OriginalArg(0) Interface11 arg0) {
		if (this.anInt8548 < 0 || arg0 != this.anInterface11Array3[this.anInt8548]) {
			throw new RuntimeException();
		}
		this.anInterface11Array3[this.anInt8548--] = null;
		arg0.method2962();
		if (this.anInt8548 < 0) {
			this.anInterface11_1 = null;
		} else {
			this.anInterface11_1 = this.anInterface11Array3[this.anInt8548];
			this.anInterface11_1.method2961();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Class14_Sub7 method7875(@OriginalArg(0) int arg0) {
		@Pc(8) Class14_Sub7_Sub1 local8 = new Class14_Sub7_Sub1(arg0);
		this.aClass262_50.method6314(local8);
		return local8;
	}

	@OriginalMember(owner = "client!qfa", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean593 = true;
		this.anInt8567 = arg0;
		this.anInt8579 = arg3;
		this.anInt8571 = arg1;
		this.anInt8570 = arg2;
	}

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "(II)V")
	public synchronized void method7031(@OriginalArg(0) int arg0) {
		@Pc(14) Class14_Sub18 local14 = new Class14_Sub18(arg0);
		this.aClass262_54.method6314(local14);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZII)V")
	public void method7032(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		this.method7092(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)V")
	public synchronized void method7033(@OriginalArg(0) int arg0) {
		@Pc(13) Class14 local13 = new Class14();
		local13.aLong305 = (long) arg0;
		this.aClass262_56.method6314(local13);
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(B)V")
	private void method7034() {
		if (this.aBoolean610 && this.anInt8587 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 < this.anInt8574) {
			this.anInt8574 = arg3;
		}
		if (this.anInt8558 < arg1) {
			this.anInt8558 = arg1;
		}
		if (arg2 < this.anInt8557) {
			this.anInt8557 = arg2;
		}
		if (this.anInt8580 < arg0) {
			this.anInt8580 = arg0;
		}
		OpenGL.glEnable(3089);
		this.method7044();
		this.method7061();
	}

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "(I)V")
	public void method7035() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray65, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray64, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I[Lclient!qm;)V")
	@Override
	public void method7887(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub37[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			this.aClass14_Sub37Array5[local7] = arg1[local7];
		}
		this.anInt8568 = arg0;
		if (this.anInt8573 != 1) {
			this.method7040();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = (float) arg1 * this.aClass26_Sub3_3.aFloat175 + this.aClass26_Sub3_3.aFloat181 * (float) arg0 + (float) arg2 * this.aClass26_Sub3_3.aFloat179 + this.aClass26_Sub3_3.aFloat171;
		if (local28 < (float) this.anInt8561 || local28 > (float) this.anInt8588) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(85) int local85 = (int) ((this.aClass26_Sub3_3.aFloat176 + (float) arg1 * this.aClass26_Sub3_3.aFloat177 + this.aClass26_Sub3_3.aFloat172 * (float) arg0 + (float) arg2 * this.aClass26_Sub3_3.aFloat173) * (float) this.anInt8566 / local28);
		@Pc(117) int local117 = (int) ((float) this.anInt8578 * (this.aClass26_Sub3_3.aFloat178 + (float) arg0 * this.aClass26_Sub3_3.aFloat182 + (float) arg1 * this.aClass26_Sub3_3.aFloat180 + (float) arg2 * this.aClass26_Sub3_3.aFloat174) / local28);
		if (this.aFloat199 <= (float) local85 && this.aFloat202 >= (float) local85 && this.aFloat192 <= (float) local117 && this.aFloat193 >= (float) local117) {
			arg3[0] = (int) ((float) local85 - this.aFloat199);
			arg3[2] = (int) local28;
			arg3[1] = (int) ((float) local117 - this.aFloat192);
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(II)I")
	@Override
	public int method7943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!ei;Lclient!ei;ILclient!ei;Lclient!ei;)V")
	public void method7036(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(3) Class91 arg2, @OriginalArg(4) Class91 arg3) {
		if (arg2 == null) {
			OpenGL.glDisableClientState(32884);
		} else {
			this.method7089(arg2.anInterface8_1);
			OpenGL.glVertexPointer(arg2.aByte47, arg2.aShort28, this.anInterface8_5.method5114(), this.anInterface8_5.method5115() + (long) arg2.aByte48);
			OpenGL.glEnableClientState(32884);
		}
		if (arg3 == null) {
			OpenGL.glDisableClientState(32885);
		} else {
			this.method7089(arg3.anInterface8_1);
			OpenGL.glNormalPointer(arg3.aShort28, this.anInterface8_5.method5114(), this.anInterface8_5.method5115() + (long) arg3.aByte48);
			OpenGL.glEnableClientState(32885);
		}
		if (arg0 == null) {
			OpenGL.glDisableClientState(32886);
		} else {
			this.method7089(arg0.anInterface8_1);
			OpenGL.glColorPointer(arg0.aByte47, arg0.aShort28, this.anInterface8_5.method5114(), this.anInterface8_5.method5115() + (long) arg0.aByte48);
			OpenGL.glEnableClientState(32886);
		}
		if (arg1 == null) {
			OpenGL.glDisableClientState(32888);
		} else {
			this.method7089(arg1.anInterface8_1);
			OpenGL.glTexCoordPointer(arg1.aByte47, arg1.aShort28, this.anInterface8_5.method5114(), this.anInterface8_5.method5115() + (long) arg1.aByte48);
			OpenGL.glEnableClientState(32888);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!iha;I)V")
	public void method7037(@OriginalArg(0) Interface11 arg0) {
		if (this.aBoolean586) {
			this.method7100(arg0);
			this.method7030(arg0);
		} else if (this.anInt8547 >= 0 && this.anInterface11Array2[this.anInt8547] == arg0) {
			this.anInterface11Array2[this.anInt8547--] = null;
			arg0.method2959();
			if (this.anInt8547 >= 0) {
				this.anInterface11_2 = this.anInterface11_1 = this.anInterface11Array2[this.anInt8547];
				this.anInterface11_2.method2958();
			} else {
				this.anInterface11_2 = this.anInterface11_1 = null;
			}
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZI)V")
	public void method7038(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean587 != arg0) {
			this.aBoolean587 = arg0;
			this.method7104();
			this.anInt8554 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "(I)V")
	private void method7039() {
		@Pc(15) float local15 = (float) -this.anInt8584 * this.aFloat195 / (float) this.anInt8566;
		@Pc(27) float local27 = (float) -this.anInt8559 * this.aFloat195 / (float) this.anInt8578;
		@Pc(42) float local42 = (float) (this.anInt8404 - this.anInt8584) * this.aFloat195 / (float) this.anInt8566;
		@Pc(57) float local57 = this.aFloat195 * (float) (this.anInt8349 - this.anInt8559) / (float) this.anInt8578;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (local42 != local15 && local27 != local57) {
			OpenGL.glOrtho((double) local15, (double) local42, (double) -local57, (double) -local27, (double) this.anInt8561, (double) this.anInt8588);
		}
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(Z)V")
	private void method7040() {
		@Pc(7) int local7;
		for (local7 = 0; local7 < this.anInt8568; local7++) {
			@Pc(14) Class14_Sub37 local14 = this.aClass14_Sub37Array5[local7];
			Static131.aFloatArray58[0] = (float) local14.method7827();
			@Pc(25) int local25 = local7 + 16386;
			Static131.aFloatArray58[1] = (float) local14.method7823();
			Static131.aFloatArray58[2] = (float) local14.method7826();
			Static131.aFloatArray58[3] = 1.0F;
			OpenGL.glLightfv(local25, 4611, Static131.aFloatArray58, 0);
			@Pc(52) int local52 = local14.method7820();
			@Pc(58) float local58 = local14.method7825() / 255.0F;
			Static131.aFloatArray58[0] = (float) (local52 >> 16 & 0xFF) * local58;
			Static131.aFloatArray58[1] = (float) (local52 >> 8 & 0xFF) * local58;
			Static131.aFloatArray58[2] = (float) (local52 & 0xFF) * local58;
			OpenGL.glLightfv(local25, 4609, Static131.aFloatArray58, 0);
			OpenGL.glLightf(local25, 4617, 1.0F / (float) (local14.method7819() * local14.method7819()));
			OpenGL.glEnable(local25);
		}
		while (local7 < this.anInt8581) {
			OpenGL.glDisable(local7 + 16386);
			local7++;
		}
		this.anInt8581 = this.anInt8568;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7916(@OriginalArg(0) Class14_Sub7 arg0) {
		this.aNativeHeap5 = ((Class14_Sub7_Sub1) arg0).aNativeHeap1;
		if (this.anInterface8_4 != null) {
			return;
		}
		@Pc(16) Class14_Sub29_Sub2 local16 = new Class14_Sub29_Sub2(80);
		if (this.aBoolean594) {
			local16.method5908(-1.0F);
			local16.method5908(-1.0F);
			local16.method5908(0.0F);
			local16.method5908(0.0F);
			local16.method5908(1.0F);
			local16.method5908(1.0F);
			local16.method5908(-1.0F);
			local16.method5908(0.0F);
			local16.method5908(1.0F);
			local16.method5908(1.0F);
			local16.method5908(1.0F);
			local16.method5908(1.0F);
			local16.method5908(0.0F);
			local16.method5908(1.0F);
			local16.method5908(0.0F);
			local16.method5908(-1.0F);
			local16.method5908(1.0F);
			local16.method5908(0.0F);
			local16.method5908(0.0F);
			local16.method5908(0.0F);
		} else {
			local16.method5911(-1.0F);
			local16.method5911(-1.0F);
			local16.method5911(0.0F);
			local16.method5911(0.0F);
			local16.method5911(1.0F);
			local16.method5911(1.0F);
			local16.method5911(-1.0F);
			local16.method5911(0.0F);
			local16.method5911(1.0F);
			local16.method5911(1.0F);
			local16.method5911(1.0F);
			local16.method5911(1.0F);
			local16.method5911(0.0F);
			local16.method5911(1.0F);
			local16.method5911(0.0F);
			local16.method5911(-1.0F);
			local16.method5911(1.0F);
			local16.method5911(0.0F);
			local16.method5911(0.0F);
			local16.method5911(0.0F);
		}
		this.anInterface8_4 = this.method7076(20, false, local16.aByteArray84, local16.anInt7264);
		this.aClass91_8 = new Class91(this.anInterface8_4, 5126, 3, 0);
		this.aClass91_9 = new Class91(this.anInterface8_4, 5126, 2, 12);
		this.aClass364_1.method8811(this);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		this.method7028();
		this.method7082(1);
		@Pc(29) float local29 = (float) arg2 - (float) arg0;
		@Pc(36) float local36 = (float) -arg1 + (float) arg3;
		@Pc(49) float local49 = (float) (1.0D / Math.sqrt((double) (local36 * local36 + local29 * local29)));
		@Pc(55) int local55 = arg7 % (arg6 + arg5);
		@Pc(59) float local59 = local29 * local49;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(78) float local78 = local36 * local49;
		@Pc(83) float local83 = (float) arg5 * local59;
		@Pc(88) float local88 = local78 * (float) arg5;
		@Pc(90) float local90 = 0.0F;
		@Pc(92) float local92 = 0.0F;
		@Pc(94) float local94 = local83;
		@Pc(96) float local96 = local88;
		if (local55 > arg5) {
			local92 = (float) (arg5 + arg6 - local55) * local78;
			local90 = local59 * (float) (arg5 + arg6 - local55);
		} else {
			local94 = local59 * (float) (arg5 - local55);
			local96 = (float) (arg5 - local55) * local78;
		}
		@Pc(148) float local148 = local90 + (float) arg0 + 0.35F;
		@Pc(155) float local155 = local92 + (float) arg1 + 0.35F;
		@Pc(160) float local160 = local59 * (float) arg6;
		@Pc(165) float local165 = local78 * (float) arg6;
		while (true) {
			if (arg2 <= arg0) {
				if (local148 < (float) arg2 + 0.35F) {
					break;
				}
				if (local148 + local94 < (float) arg2) {
					local94 = (float) arg2 - local148;
				}
			} else {
				if ((float) arg2 + 0.35F < local148) {
					break;
				}
				if ((float) arg2 < local148 + local94) {
					local94 = (float) arg2 - local148;
				}
			}
			if (arg1 >= arg3) {
				if (local155 < (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 > local155 + local96) {
					local96 = (float) arg3 - local155;
				}
			} else {
				if (local155 > (float) arg3 + 0.35F) {
					break;
				}
				if ((float) arg3 < local96 + local155) {
					local96 = (float) arg3 - local155;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glVertex2f(local148, local155);
			OpenGL.glVertex2f(local94 + local148, local96 + local155);
			local148 += local160 + local94;
			local155 += local165 + local96;
			OpenGL.glEnd();
			local96 = local88;
			local94 = local83;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
		this.anInt8545 = 0;
		while (arg0 > 1) {
			arg0 >>= 0x1;
			this.anInt8545++;
		}
		this.anInt8546 = 0x1 << this.anInt8545;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(ILclient!ou;)V")
	public void method7041(@OriginalArg(1) Class26_Sub3 arg0) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(arg0.method6462(), 0);
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(B)V")
	private void method7042() {
		OpenGL.glDepthMask(this.aBoolean584 && this.aBoolean603);
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7920(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == this.aCanvas10) {
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

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "(I)V")
	private void method7044() {
		this.aFloat192 = (float) (this.anInt8558 - this.anInt8559);
		this.aFloat199 = (float) (this.anInt8580 - this.anInt8584);
		this.aFloat193 = (float) (this.anInt8574 - this.anInt8559);
		this.aFloat202 = (float) (this.anInt8557 - this.anInt8584);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!iha;B)V")
	public void method7045(@OriginalArg(0) Interface11 arg0) {
		if (this.anInt8548 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8548 >= 0) {
			this.anInterface11Array3[this.anInt8548].method2962();
		}
		this.anInterface11_1 = this.anInterface11Array3[++this.anInt8548] = arg0;
		this.anInterface11_1.method2961();
	}

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "(I)V")
	private void method7046() {
		@Pc(6) float[] local6 = this.aFloatArray67;
		@Pc(18) float local18 = (float) (this.anInt8561 * -this.anInt8584) / (float) this.anInt8566;
		@Pc(33) float local33 = (float) ((this.anInt8404 - this.anInt8584) * this.anInt8561) / (float) this.anInt8566;
		@Pc(44) float local44 = (float) (this.anInt8561 * this.anInt8559) / (float) this.anInt8578;
		@Pc(59) float local59 = (float) (this.anInt8561 * (this.anInt8559 - this.anInt8349)) / (float) this.anInt8578;
		if (local18 == local33 || local59 == local44) {
			local6[10] = 1.0F;
			local6[8] = 0.0F;
			local6[7] = 0.0F;
			local6[9] = 0.0F;
			local6[6] = 0.0F;
			local6[1] = 0.0F;
			local6[4] = 0.0F;
			local6[11] = 0.0F;
			local6[13] = 0.0F;
			local6[3] = 0.0F;
			local6[5] = 1.0F;
			local6[12] = 0.0F;
			local6[15] = 1.0F;
			local6[2] = 0.0F;
			local6[14] = 0.0F;
			local6[0] = 1.0F;
		} else {
			@Pc(144) float local144 = (float) this.anInt8561 * 2.0F;
			local6[14] = this.aFloat198 = -((float) this.anInt8588 * local144) / (float) (this.anInt8588 - this.anInt8561);
			local6[1] = 0.0F;
			local6[7] = 0.0F;
			local6[12] = 0.0F;
			local6[13] = 0.0F;
			local6[5] = local144 / (local44 - local59);
			local6[8] = (local18 + local33) / (local33 - local18);
			local6[4] = 0.0F;
			local6[11] = -1.0F;
			local6[0] = local144 / (local33 - local18);
			local6[2] = 0.0F;
			local6[6] = 0.0F;
			local6[15] = 0.0F;
			local6[9] = (local59 + local44) / (local44 - local59);
			local6[10] = this.aFloat211 = (float) -(this.anInt8588 + this.anInt8561) / (float) (this.anInt8588 - this.anInt8561);
			local6[3] = 0.0F;
		}
		this.method7098();
	}

	@OriginalMember(owner = "client!qfa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		this.method7073(true);
		OpenGL.glClear(256);
	}

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "(I)V")
	public void method7047() {
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "(I)I")
	private int method7048() {
		@Pc(5) int local5 = 0;
		this.aString82 = OpenGL.glGetString(7936).toLowerCase();
		this.aString83 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString82.indexOf("microsoft") != -1) {
			local5 = 1;
		}
		if (this.aString82.indexOf("brian paul") != -1 || this.aString82.indexOf("mesa") != -1) {
			local5 |= 0x1;
		}
		@Pc(45) String local45 = OpenGL.glGetString(7938);
		@Pc(53) String[] local53 = Static111.method1920(' ', local45.replace('.', ' '));
		if (local53.length < 2) {
			local5 |= 0x4;
		} else {
			try {
				@Pc(71) int local71 = Static235.method3555(local53[0]);
				@Pc(77) int local77 = Static235.method3555(local53[1]);
				this.anInt8577 = local71 * 10 + local77;
			} catch (@Pc(87) NumberFormatException local87) {
				local5 |= 0x4;
			}
		}
		if (this.anInt8577 < 12) {
			local5 |= 0x2;
		}
		if (!this.anOpenGL2.a("GL_ARB_multitexture")) {
			local5 |= 0x8;
		}
		if (!this.anOpenGL2.a("GL_ARB_texture_env_combine")) {
			local5 |= 0x20;
		}
		@Pc(121) int[] local121 = new int[1];
		OpenGL.glGetIntegerv(34018, local121, 0);
		this.anInt8575 = local121[0];
		OpenGL.glGetIntegerv(34929, local121, 0);
		this.anInt8583 = local121[0];
		OpenGL.glGetIntegerv(34930, local121, 0);
		this.anInt8563 = local121[0];
		if (this.anInt8575 < 2 || this.anInt8583 < 2 || this.anInt8563 < 2) {
			local5 |= 0x10;
		}
		this.aBoolean594 = Stream.c();
		this.aBoolean609 = this.anOpenGL2.arePbuffersAvailable();
		this.aBoolean601 = this.anOpenGL2.a("GL_ARB_vertex_buffer_object");
		this.aBoolean585 = this.anOpenGL2.a("GL_ARB_multisample");
		this.aBoolean606 = this.anOpenGL2.a("GL_ARB_vertex_program");
		this.anOpenGL2.a("GL_ARB_fragment_program");
		this.aBoolean598 = this.anOpenGL2.a("GL_ARB_vertex_shader");
		this.aBoolean599 = this.anOpenGL2.a("GL_ARB_fragment_shader");
		this.aBoolean589 = this.anOpenGL2.a("GL_EXT_texture3D");
		this.aBoolean596 = this.anOpenGL2.a("GL_ARB_texture_rectangle");
		this.aBoolean605 = this.anOpenGL2.a("GL_ARB_texture_cube_map");
		this.aBoolean607 = this.anOpenGL2.a("GL_ARB_texture_float");
		this.aBoolean595 = false;
		this.aBoolean608 = this.anOpenGL2.a("GL_EXT_framebuffer_object");
		this.aBoolean586 = this.anOpenGL2.a("GL_EXT_framebuffer_blit");
		this.aBoolean602 = this.anOpenGL2.a("GL_EXT_framebuffer_multisample");
		this.aBoolean588 = this.aBoolean586 & this.aBoolean602;
		this.aBoolean597 = Class17_Sub1_Sub1.aString105.startsWith("mac");
		OpenGL.glGetFloatv(2834, Static116.aFloatArray18, 0);
		this.aFloat197 = Static116.aFloatArray18[0];
		this.aFloat194 = Static116.aFloatArray18[1];
		return local5 == 0 ? 0 : local5;
	}

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "(I)V")
	public void method7049() {
		if (this.anInt8554 == 8) {
			return;
		}
		this.method7025();
		this.method7079(true);
		this.method7067(true);
		this.method7073(true);
		this.method7082(1);
		this.anInt8554 = 8;
	}

	@OriginalMember(owner = "client!qfa", name = "x", descriptor = "()I")
	@Override
	public int method7937() {
		return 4;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "()Z")
	@Override
	public boolean method7867() {
		if (this.aClass14_Sub16_Sub1_1 == null) {
			return false;
		}
		if (!this.aClass14_Sub16_Sub1_1.method1888()) {
			if (!this.aClass234_1.method5535(this.aClass14_Sub16_Sub1_1)) {
				return false;
			}
			this.aClass379_1.method9076();
		}
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "()Z")
	@Override
	public boolean method7888() {
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(B)V")
	public void method7050() {
		if (this.anInt8554 == 4) {
			return;
		}
		this.method7062();
		this.method7079(false);
		this.method7038(false);
		this.method7067(false);
		this.method7073(false);
		this.method7029(-2);
		this.method7082(1);
		this.anInt8554 = 4;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method7028();
		this.method7082(arg5);
		@Pc(16) float local16 = (float) arg2 - (float) arg0;
		@Pc(22) float local22 = (float) arg3 - (float) arg1;
		if (local16 == 0.0F && local22 == 0.0F) {
			local16 = 1.0F;
		} else {
			@Pc(47) float local47 = (float) (1.0D / Math.sqrt((double) (local16 * local16 + local22 * local22)));
			local16 *= local47;
			local22 *= local47;
		}
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glVertex2f((float) arg2 + local16 + 0.35F, (float) arg3 + local22 + 0.35F);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qfa", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt8588;
	}

	@OriginalMember(owner = "client!qfa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(6) int local6 = this.anInt8590;
		this.anInt8590 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFFZF)V")
	public void method7051(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3) {
		Static116.aFloatArray18[2] = arg3;
		Static116.aFloatArray18[1] = arg2;
		Static116.aFloatArray18[3] = arg0;
		Static116.aFloatArray18[0] = arg1;
		OpenGL.glTexEnvfv(8960, 8705, Static116.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IB)I")
	public int method7052(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "()Z")
	@Override
	public boolean method7883() {
		return this.aClass140_1.method3372();
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(B)V")
	private void method7053() {
		Static116.aFloatArray18[0] = this.aFloat206 * this.aFloat205;
		Static116.aFloatArray18[3] = 1.0F;
		Static116.aFloatArray18[2] = this.aFloat206 * this.aFloat191;
		Static116.aFloatArray18[1] = this.aFloat206 * this.aFloat210;
		OpenGL.glLightModelfv(2899, Static116.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "(B)V")
	private void method7054() {
		if (this.anInt8573 != 3) {
			this.anInt8573 = 3;
			this.method7039();
			this.method7102();
			this.anInt8554 &= 0xFFFFFFF8;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IJ)V")
	public synchronized void method7055(@OriginalArg(1) long arg0) {
		@Pc(7) Class14 local7 = new Class14();
		local7.aLong305 = arg0;
		this.bf.method6314(local7);
	}

	@OriginalMember(owner = "client!qfa", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8584, this.anInt8559, this.anInt8566, this.anInt8578 };
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "()V")
	@Override
	public void method7878() {
		if (this.aClass14_Sub16_Sub1_1 != null && this.aClass14_Sub16_Sub1_1.method1888()) {
			this.aClass234_1.method5532(this.aClass14_Sub16_Sub1_1);
			this.aClass379_1.method9076();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(III)V")
	public void method7056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8586 = arg1;
		this.anInt8582 = arg0;
		this.method7069();
		this.method7061();
	}

	@OriginalMember(owner = "client!qfa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.method7082(0);
		OpenGL.glClearColor((float) (arg0 & 0xFF0000) / 1.671168E7F, (float) (arg0 & 0xFF00) / 65280.0F, (float) (arg0 & 0xFF) / 255.0F, (float) (arg0 >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BIII)V")
	public void method7057(@OriginalArg(3) int arg0) {
		OpenGL.glDrawArrays(7, 0, arg0);
	}

	@OriginalMember(owner = "client!qfa", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(6) int local6 = this.anInt8591;
		this.anInt8591 = 0;
		return local6;
	}

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "(I)V")
	@Override
	public void method7930() {
	}

	@OriginalMember(owner = "client!qfa", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		if (this.aFloat206 != arg0) {
			this.aFloat206 = arg0;
			this.method7053();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Lclient!iha;I)V")
	public void method7058(@OriginalArg(0) Interface11 arg0) {
		if (this.aBoolean586) {
			this.method7081(arg0);
			this.method7045(arg0);
		} else if (this.anInt8547 >= 3) {
			throw new RuntimeException();
		} else {
			if (this.anInt8547 >= 0) {
				this.anInterface11Array2[this.anInt8547].method2959();
			}
			this.anInterface11_2 = this.anInterface11_1 = this.anInterface11Array2[++this.anInt8547] = arg0;
			this.anInterface11_2.method2958();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7028();
		this.method7082(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15, (float) arg2 + local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qfa", name = "s", descriptor = "(I)V")
	public void method7059() {
		if (this.anInt8554 == 16) {
			return;
		}
		this.method7054();
		this.method7079(true);
		this.method7067(true);
		this.method7073(true);
		this.method7082(1);
		this.anInt8554 = 16;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!jaclib/memory/Buffer;IIIZ)Lclient!gda;")
	public Interface8 method7060(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (Interface8) (this.aBoolean601 ? new Class202_Sub2(this, arg2, arg0, arg1, false) : new Class40_Sub1(this, arg2, arg0));
	}

	@OriginalMember(owner = "client!qfa", name = "s", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method7918() {
		return new Class26_Sub3();
	}

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "(B)V")
	private void method7061() {
		if (this.anInt8557 >= this.anInt8580 && this.anInt8558 <= this.anInt8574) {
			OpenGL.glScissor(this.anInt8586 + this.anInt8580, this.anInt8582 + this.anInt8349 + -this.anInt8574, this.anInt8557 - this.anInt8580, this.anInt8574 - this.anInt8558);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) float local8 = (float) arg0 + 0.35F;
		@Pc(13) float local13 = (float) arg1 + 0.35F;
		@Pc(20) float local20 = (float) arg2 + local8 - 1.0F;
		this.method7028();
		@Pc(30) float local30 = (float) arg3 + local13 - 1.0F;
		this.method7082(arg5);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		if (this.aBoolean585) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(local8, local13);
		OpenGL.glVertex2f(local8, local30);
		OpenGL.glVertex2f(local20, local30);
		OpenGL.glVertex2f(local20, local13);
		OpenGL.glEnd();
		if (this.aBoolean585) {
			OpenGL.glEnable(32925);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7915(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		Static462.aFloat187 = arg1;
		Static592.aFloat50 = arg0;
		Static668.aFloat270 = arg2;
	}

	@OriginalMember(owner = "client!qfa", name = "t", descriptor = "(I)V")
	private void method7062() {
		if (this.anInt8573 == 1) {
			return;
		}
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		if (this.anInt8404 > 0 && this.anInt8349 > 0) {
			OpenGL.glOrtho(0.0D, (double) this.anInt8404, (double) this.anInt8349, 0.0D, -1.0D, 1.0D);
		}
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		this.anInt8554 &= 0xFFFFFFE7;
		this.anInt8573 = 1;
	}

	@OriginalMember(owner = "client!qfa", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean593) {
			throw new RuntimeException("");
		}
		this.anInt8567 = arg0;
		this.anInt8570 = arg2;
		this.anInt8571 = arg1;
		this.anInt8579 = arg3;
		if (this.aBoolean611) {
			this.aClass140_1.aClass33_Sub6_1.method6607();
			this.aClass140_1.aClass33_Sub6_1.method6608();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILclient!kda;II)V")
	public void method7063(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1, @OriginalArg(4) int arg2) {
		@Pc(14) int local14 = arg1.method5493();
		@Pc(21) int local21 = arg0 * this.method7052(local14);
		this.method7099(arg1);
		OpenGL.glDrawElements(4, arg2, local14, arg1.method5495() + (long) local21);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFI)V")
	public void method7064(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat201 = arg0;
		this.aFloat208 = arg1;
		this.method7083();
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qfa", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		this.aBoolean603 = arg0;
		this.method7042();
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(Z)V")
	private void method7065() {
		this.anOpenGL2.a();
	}

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "(II)I")
	public int method7066(@OriginalArg(1) int arg0) {
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

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZB)V")
	public void method7067(@OriginalArg(0) boolean arg0) {
		if (arg0 == this.aBoolean581) {
			return;
		}
		if (arg0) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		this.anInt8554 &= 0xFFFFFFE0;
		this.aBoolean581 = arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "(Z)V")
	private void method7068() {
		if (this.aBoolean604) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBoolean604 = false;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "u", descriptor = "(I)V")
	private void method7069() {
		OpenGL.glViewport(this.anInt8586, this.anInt8582, this.anInt8404, this.anInt8349);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg5;
		@Pc(9) Class66_Sub1_Sub1 local9 = local6.aClass66_Sub1_Sub1_5;
		this.method7091();
		this.method7090(local6.aClass66_Sub1_Sub1_5);
		this.method7082(1);
		this.method7084(8448, 7681);
		this.method7071(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat52 / (float) local9.anInt1954;
		@Pc(46) float local46 = local9.aFloat53 / (float) local9.anInt1950;
		@Pc(53) float local53 = (float) -arg0 + (float) arg2;
		@Pc(59) float local59 = (float) arg3 - (float) arg1;
		@Pc(72) float local72 = (float) (1.0D / Math.sqrt((double) (local53 * local53 + local59 * local59)));
		@Pc(76) float local76 = local53 * local72;
		@Pc(80) float local80 = local59 * local72;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(local39 * (float) (arg0 - arg6), local46 * (float) (arg1 - arg7));
		OpenGL.glVertex2f((float) arg0 + 0.35F, (float) arg1 + 0.35F);
		OpenGL.glTexCoord2f((float) (arg2 - arg6) * local39, (float) (arg3 - arg7) * local46);
		OpenGL.glVertex2f((float) arg2 + local76 + 0.35F, (float) arg3 + local80 + 0.35F);
		OpenGL.glEnd();
		this.method7071(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V")
	@Override
	public void method7895(@OriginalArg(0) int arg0) {
		this.method7065();
	}

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "()Z")
	@Override
	public boolean method7924() {
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "(II)V")
	public void method7070(@OriginalArg(1) int arg0) {
		Static116.aFloatArray18[0] = (float) (arg0 & 0xFF0000) / 1.671168E7F;
		Static116.aFloatArray18[3] = (float) (arg0 >>> 24) / 255.0F;
		Static116.aFloatArray18[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static116.aFloatArray18[1] = (float) (arg0 & 0xFF00) / 65280.0F;
		OpenGL.glTexEnvfv(8960, 8705, Static116.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		OpenGL.glLineWidth((float) arg5);
		this.method7907(arg0, arg1, arg2, arg3, arg4, 0);
		OpenGL.glLineWidth(1.0F);
	}

	@OriginalMember(owner = "client!qfa", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.anInt8552 + this.anInt8550 + this.anInt8551;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIB)V")
	public void method7071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glTexEnvi(8960, arg2 + 34176, arg0);
		OpenGL.glTexEnvi(8960, arg2 + 34192, arg1);
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(III)V")
	public synchronized void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class14_Sub18 local8 = new Class14_Sub18(arg0);
		local8.aLong305 = (long) arg1;
		this.aClass262_53.method6314(local8);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7917(@OriginalArg(0) Class196 arg0) {
		this.aClass364_1.method8808(-1, this, arg0);
	}

	@OriginalMember(owner = "client!qfa", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(45) float local45;
		@Pc(57) float local57;
		if (this.aClass66_Sub1_Sub1_2 == null || this.aClass66_Sub1_Sub1_2.anInt1939 < arg2 || this.aClass66_Sub1_Sub1_2.anInt1947 < arg3) {
			this.aClass66_Sub1_Sub1_2 = Static598.method8450(arg2, this, arg3, arg6);
			this.aClass66_Sub1_Sub1_2.method1669(false, false);
			local45 = this.aClass66_Sub1_Sub1_2.aFloat53;
			local57 = this.aClass66_Sub1_Sub1_2.aFloat52;
		} else {
			this.aClass66_Sub1_Sub1_2.method1668(arg6, arg2, false, arg3, 6406);
			local45 = this.aClass66_Sub1_Sub1_2.aFloat53 * (float) arg3 / (float) this.aClass66_Sub1_Sub1_2.anInt1947;
			local57 = (float) arg2 * this.aClass66_Sub1_Sub1_2.aFloat52 / (float) this.aClass66_Sub1_Sub1_2.anInt1939;
		}
		this.method7091();
		this.method7090(this.aClass66_Sub1_Sub1_2);
		this.method7082(arg8);
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		this.method7070(arg5);
		this.method7084(34165, 34165);
		this.method7071(34166, 768, 0);
		this.method7071(5890, 770, 2);
		this.method7027(34166, 0);
		this.method7027(5890, 2);
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
		this.method7071(5890, 768, 0);
		this.method7071(34166, 770, 2);
		this.method7027(5890, 0);
		this.method7027(34166, 2);
	}

	@OriginalMember(owner = "client!qfa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!kfa;Lclient!ts;)Lclient!pt;")
	@Override
	public Interface23 method7874(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface26 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7939(@OriginalArg(0) Canvas arg0) {
		this.aLong228 = 0L;
		this.aCanvas11 = null;
		if (arg0 == null || arg0 == this.aCanvas10) {
			this.aCanvas11 = this.aCanvas10;
			this.aLong228 = this.aLong229;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(26) Long local26 = (Long) this.aHashtable5.get(arg0);
			this.aLong228 = local26;
			this.aCanvas11 = arg0;
		}
		if (this.aCanvas11 == null || this.aLong228 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.setSurface(this.aLong228);
		this.method7088();
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "()Z")
	@Override
	public boolean method7873() {
		return false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZZ)V")
	public void method7073(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean584) {
			this.aBoolean584 = arg0;
			this.method7042();
			this.anInt8554 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "v", descriptor = "(I)V")
	private void method7074() {
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(this.aFloatArray67, 0);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!qaa;Lclient!qaa;FLclient!qaa;)Lclient!qaa;")
	@Override
	public Class144 method7894(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class144 arg3) {
		if (arg0 != null && arg1 != null && this.aBoolean605 && this.aBoolean608) {
			@Pc(15) Class144_Sub2_Sub2 local15 = null;
			@Pc(18) Class144_Sub2 local18 = (Class144_Sub2) arg0;
			@Pc(21) Class144_Sub2 local21 = (Class144_Sub2) arg1;
			@Pc(25) Class66_Sub4 local25 = local18.method8465();
			@Pc(29) Class66_Sub4 local29 = local21.method8465();
			if (local25 != null && local29 != null) {
				@Pc(44) int local44 = local29.anInt8233 >= local25.anInt8233 ? local29.anInt8233 : local25.anInt8233;
				if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof Class144_Sub2_Sub2) {
					@Pc(56) Class144_Sub2_Sub2 local56 = (Class144_Sub2_Sub2) arg3;
					if (local56.method8467() == local44) {
						local15 = local56;
					}
				}
				if (local15 == null) {
					local15 = new Class144_Sub2_Sub2(this, local44);
				}
				if (local15.method8468(local25, local29, arg2)) {
					return local15;
				}
			}
		}
		return arg2 < 0.5F ? arg0 : arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "([BIIIZ)Lclient!kda;")
	public Interface12 method7075(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		return (Interface12) (this.aBoolean601 && (!arg2 || this.aBoolean590) ? new Class202_Sub1(this, 5123, arg0, arg1, arg2) : new Class40_Sub2(this, 5123, arg0, arg1));
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIZ)Lclient!jd;")
	@Override
	public Class20 method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return new Class20_Sub3(this, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "([IIIIIZ)Lclient!jd;")
	@Override
	public Class20 method7938(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return new Class20_Sub3(this, arg2, arg3, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZI[BI)Lclient!gda;")
	public Interface8 method7076(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		return (Interface8) (this.aBoolean601 && (!arg1 || this.aBoolean590) ? new Class202_Sub2(this, arg0, arg2, arg3, arg1) : new Class40_Sub1(this, arg0, arg2, arg3));
	}

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "(II)V")
	public void method7077(@OriginalArg(0) int arg0) {
		if (arg0 == 1) {
			this.method7084(7681, 7681);
		} else if (arg0 == 0) {
			this.method7084(8448, 8448);
		} else if (arg0 == 2) {
			this.method7084(7681, 34165);
		} else if (arg0 == 3) {
			this.method7084(8448, 260);
		} else if (arg0 == 4) {
			this.method7084(34023, 34023);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "(I)V")
	private void method7078() {
		this.method7029(-2);
		for (@Pc(14) int local14 = this.anInt8575 - 1; local14 >= 0; local14--) {
			this.method7095(local14);
			this.method7090((Class66) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		this.method7084(8448, 8448);
		this.method7071(34168, 770, 2);
		this.method7068();
		this.anInt8553 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8555 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) 0);
		this.aBoolean582 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBoolean583 = true;
		this.method7079(true);
		this.method7038(true);
		this.method7067(true);
		this.method7073(true);
		this.method7087();
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
		@Pc(126) float[] local126 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
		for (@Pc(128) int local128 = 0; local128 < 8; local128++) {
			@Pc(134) int local134 = local128 + 16384;
			OpenGL.glLightfv(local134, 4608, local126, 0);
			OpenGL.glLightf(local134, 4615, 0.0F);
			OpenGL.glLightf(local134, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8576 = this.anInt8569 = -1;
		this.la();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BZ)V")
	public void method7079(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean610 != arg0) {
			this.aBoolean610 = arg0;
			this.method7034();
			this.anInt8554 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "x", descriptor = "(I)V")
	private void method7080() {
		this.aClass66Array1 = new Class66[this.anInt8575];
		this.aClass66_Sub1_6 = new Class66_Sub1(this, 3553, 6408, 1, 1);
		new Class66_Sub1(this, 3553, 6408, 1, 1);
		new Class66_Sub1(this, 3553, 6408, 1, 1);
		this.aClass80_Sub2_10 = new Class80_Sub2(this);
		this.aClass80_Sub2_1 = new Class80_Sub2(this);
		this.aClass80_Sub2_3 = new Class80_Sub2(this);
		this.aClass80_Sub2_2 = new Class80_Sub2(this);
		this.aClass80_Sub2_9 = new Class80_Sub2(this);
		this.aClass80_Sub2_8 = new Class80_Sub2(this);
		this.aClass80_Sub2_4 = new Class80_Sub2(this);
		this.aClass80_Sub2_5 = new Class80_Sub2(this);
		this.aClass80_Sub2_6 = new Class80_Sub2(this);
		this.aClass80_Sub2_7 = new Class80_Sub2(this);
		if (this.aBoolean608) {
			this.aClass125_7 = new Class125(this);
			new Class125(this);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!qaa;)V")
	@Override
	public void method7890(@OriginalArg(0) Class144 arg0) {
		this.aClass144_Sub2_1 = (Class144_Sub2) arg0;
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(Lclient!iha;I)V")
	public void method7081(@OriginalArg(0) Interface11 arg0) {
		if (this.anInt8549 >= 3) {
			throw new RuntimeException();
		}
		if (this.anInt8549 >= 0) {
			this.anInterface11Array1[this.anInt8549].method2960();
		}
		this.anInterface11_2 = this.anInterface11Array1[++this.anInt8549] = arg0;
		this.anInterface11_2.method2963();
	}

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "(II)V")
	public void method7082(@OriginalArg(0) int arg0) {
		if (this.anInt8553 == arg0) {
			return;
		}
		@Pc(19) boolean local19;
		@Pc(17) byte local17;
		if (arg0 == 1) {
			local17 = 1;
			local19 = true;
		} else if (arg0 == 2) {
			local17 = 2;
			local19 = false;
		} else if (arg0 == 128) {
			local17 = 3;
			local19 = true;
		} else {
			local17 = 0;
			local19 = false;
		}
		if (!this.aBoolean583) {
			OpenGL.glColorMask(true, true, true, true);
			this.aBoolean583 = true;
		}
		if (local19 != this.aBoolean582) {
			if (local19) {
				OpenGL.glEnable(3008);
			} else {
				OpenGL.glDisable(3008);
			}
			this.aBoolean582 = local19;
		}
		if (local17 != this.anInt8555) {
			if (local17 == 1) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(770, 771);
			} else if (local17 == 2) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(1, 1);
			} else if (local17 == 3) {
				OpenGL.glEnable(3042);
				OpenGL.glBlendFunc(774, 1);
			} else {
				OpenGL.glDisable(3042);
			}
			this.anInt8555 = local17;
		}
		this.anInt8553 = arg0;
		this.anInt8554 &= 0xFFFFFFE3;
	}

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "(B)V")
	private void method7083() {
		this.aFloat209 = (float) (this.anInt8588 - this.anInt8562) - this.aFloat201;
		this.aFloat203 = this.aFloat209 - this.aFloat208 * (float) this.anInt8587;
		if (this.aFloat203 < (float) this.anInt8561) {
			this.aFloat203 = (float) this.anInt8561;
		}
		OpenGL.glFogf(2915, this.aFloat203);
		OpenGL.glFogf(2916, this.aFloat209);
		Static116.aFloatArray18[0] = (float) (this.anInt8569 & 0xFF0000) / 1.671168E7F;
		Static116.aFloatArray18[2] = (float) (this.anInt8569 & 0xFF) / 255.0F;
		Static116.aFloatArray18[1] = (float) (this.anInt8569 & 0xFF00) / 65280.0F;
		OpenGL.glFogfv(2918, Static116.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIZ)Lclient!jd;")
	@Override
	public Class20 method7900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		return new Class20_Sub3(this, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qfa", name = "z", descriptor = "()V")
	@Override
	public void method7948() {
		if (!this.aBoolean592 || this.anInt8404 <= 0 || this.anInt8349 <= 0) {
			return;
		}
		@Pc(16) int local16 = this.anInt8580;
		@Pc(19) int local19 = this.anInt8557;
		@Pc(22) int local22 = this.anInt8558;
		@Pc(25) int local25 = this.anInt8574;
		this.la();
		OpenGL.glReadBuffer(1028);
		OpenGL.glDrawBuffer(1029);
		this.method7087();
		this.method7079(false);
		this.method7038(false);
		this.method7067(false);
		this.method7073(false);
		this.method7090((Class66) null);
		this.method7029(-2);
		this.method7077(1);
		this.method7082(0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glRasterPos2i(0, 0);
		OpenGL.glCopyPixels(0, 0, this.anInt8404, this.anInt8349, 6144);
		OpenGL.glFlush();
		OpenGL.glReadBuffer(1029);
		OpenGL.glDrawBuffer(1029);
		this.KA(local16, local22, local19, local25);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 == arg0 && arg1 == arg3) {
			return;
		}
		@Pc(23) Class1_Sub3 local23 = (Class1_Sub3) arg5;
		@Pc(26) Class66_Sub1_Sub1 local26 = local23.aClass66_Sub1_Sub1_5;
		this.method7091();
		this.method7090(local23.aClass66_Sub1_Sub1_5);
		this.method7082(1);
		this.method7084(8448, 7681);
		this.method7071(34167, 768, 0);
		@Pc(56) float local56 = local26.aFloat52 / (float) local26.anInt1954;
		@Pc(63) float local63 = local26.aFloat53 / (float) local26.anInt1950;
		@Pc(70) float local70 = (float) -arg0 + (float) arg2;
		@Pc(77) float local77 = (float) -arg1 + (float) arg3;
		@Pc(90) float local90 = (float) (1.0D / Math.sqrt((double) (local77 * local77 + local70 * local70)));
		@Pc(96) int local96 = arg10 % (arg9 + arg8);
		@Pc(100) float local100 = local70 * local90;
		OpenGL.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4, (byte) (arg4 >> 24));
		@Pc(119) float local119 = local77 * local90;
		@Pc(124) float local124 = local100 * (float) arg8;
		@Pc(129) float local129 = local119 * (float) arg8;
		@Pc(131) float local131 = 0.0F;
		@Pc(133) float local133 = 0.0F;
		@Pc(135) float local135 = local124;
		@Pc(137) float local137 = local129;
		if (arg8 >= local96) {
			local135 = (float) (arg8 - local96) * local100;
			local137 = (float) (arg8 - local96) * local119;
		} else {
			local133 = local119 * (float) (arg8 + arg9 - local96);
			local131 = (float) (arg8 + arg9 - local96) * local100;
		}
		@Pc(188) float local188 = (float) arg0 + local131 + 0.35F;
		@Pc(195) float local195 = (float) arg1 + local133 + 0.35F;
		@Pc(200) float local200 = (float) arg9 * local100;
		@Pc(205) float local205 = (float) arg9 * local119;
		while (true) {
			if (arg0 < arg2) {
				if (local188 > (float) arg2 + 0.35F) {
					break;
				}
				if (local188 + local135 > (float) arg2) {
					local135 = (float) arg2 - local188;
				}
			} else {
				if ((float) arg2 + 0.35F > local188) {
					break;
				}
				if (local135 + local188 < (float) arg2) {
					local135 = (float) arg2 - local188;
				}
			}
			if (arg3 <= arg1) {
				if ((float) arg3 + 0.35F > local195) {
					break;
				}
				if ((float) arg3 > local137 + local195) {
					local137 = (float) arg3 - local195;
				}
			} else {
				if (local195 > (float) arg3 + 0.35F) {
					break;
				}
				if (local195 + local137 > (float) arg3) {
					local137 = (float) arg3 - local195;
				}
			}
			OpenGL.glBegin(1);
			OpenGL.glTexCoord2f((local188 - (float) arg6) * local56, local63 * ((float) -arg7 + local195));
			OpenGL.glVertex2f(local188, local195);
			OpenGL.glTexCoord2f((local135 + local188 - (float) arg6) * local56, local63 * ((float) -arg7 + local137 + local195));
			OpenGL.glVertex2f(local135 + local188, local195 + local137);
			OpenGL.glEnd();
			local188 += local135 + local200;
			local195 += local137 + local205;
			local137 = local129;
			local135 = local124;
		}
		this.method7071(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "([I)V")
	@Override
	public void method7949(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt8349;
		arg0[0] = this.anInt8404;
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(III)V")
	public void method7084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8589 != 0) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			OpenGL.glTexEnvi(8960, 34162, arg0);
			return;
		}
		@Pc(7) boolean local7 = false;
		if (arg1 != this.anInt8560) {
			OpenGL.glTexEnvi(8960, 34161, arg1);
			this.anInt8560 = arg1;
			local7 = true;
		}
		if (arg0 != this.anInt8565) {
			OpenGL.glTexEnvi(8960, 34162, arg0);
			local7 = true;
			this.anInt8565 = arg0;
		}
		if (local7) {
			this.anInt8554 &= 0xFFFFFFE2;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8561;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7910(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			throw new RuntimeException();
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable5.get(arg0);
			this.anOpenGL2.releaseSurface(arg0, local22);
			this.aHashtable5.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!us;Z)Lclient!jd;")
	@Override
	public Class20 method7951(@OriginalArg(0) Class356 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int[] local12 = new int[arg0.anInt10343 * arg0.anInt10341];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (arg0.aByteArray126 == null) {
			for (local21 = 0; local21 < arg0.anInt10343; local21++) {
				for (local25 = 0; local25 < arg0.anInt10341; local25++) {
					@Pc(38) int local38 = arg0.anIntArray755[arg0.aByteArray127[local14++] & 0xFF];
					local12[local16++] = local38 == 0 ? 0 : local38 | 0xFF000000;
				}
			}
		} else {
			for (local21 = 0; local21 < arg0.anInt10343; local21++) {
				for (local25 = 0; local25 < arg0.anInt10341; local25++) {
					local12[local16++] = arg0.aByteArray126[local14] << 24 | arg0.anIntArray755[arg0.aByteArray127[local14] & 0xFF];
					local14++;
				}
			}
		}
		@Pc(120) Class20 local120 = this.method7885(arg0.anInt10343, arg0.anInt10341, local12, arg0.anInt10341);
		local120.method7409(arg0.anInt10340, arg0.anInt10342, arg0.anInt10344, arg0.anInt10345);
		return local120;
	}

	@OriginalMember(owner = "client!qfa", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.method7028();
		this.method7082(arg4);
		@Pc(15) float local15 = (float) arg0 + 0.35F;
		@Pc(20) float local20 = (float) arg1 + 0.35F;
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(local15, local20);
		OpenGL.glVertex2f(local15 + (float) arg2, local20);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "(Z)Lclient!qba;")
	public Class66_Sub4 method7085() {
		return this.aClass144_Sub2_1 == null ? null : this.aClass144_Sub2_1.method8465();
	}

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "(I)V")
	private void method7086() {
		@Pc(5) int local5 = 0;
		while (!this.anOpenGL2.b()) {
			if (local5++ > 5) {
				throw new RuntimeException("");
			}
			Static20.method9254(1000L);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "()Z")
	@Override
	public boolean method7911() {
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "z", descriptor = "(I)V")
	public void method7087() {
		if (this.anInt8573 != 0) {
			this.anInt8573 = 0;
			this.anInt8554 &= 0xFFFFFFE0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "q", descriptor = "()Z")
	@Override
	public boolean method7909() {
		return this.aBoolean585 && (!this.method7880() || this.aBoolean588);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7898(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 0L;
		if (arg0 == null || arg0 == this.aCanvas10) {
			local5 = this.aLong229;
		} else if (this.aHashtable5.containsKey(arg0)) {
			@Pc(22) Long local22 = (Long) this.aHashtable5.get(arg0);
			local5 = local22;
		}
		if (local5 == 0L) {
			throw new RuntimeException();
		}
		this.anOpenGL2.surfaceResized(local5);
		if (this.aCanvas11 == arg0) {
			this.method7088();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		try {
			this.anOpenGL2.swapBuffers();
		} catch (@Pc(4) Exception local4) {
		}
	}

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "(I)V")
	private void method7088() {
		if (this.aCanvas11 == null) {
			this.anInt8519 = this.anInt8527 = 0;
		} else {
			@Pc(18) Dimension local18 = this.aCanvas11.getSize();
			this.anInt8527 = local18.height;
			this.anInt8519 = local18.width;
		}
		if (this.anInterface11_1 == null) {
			this.anInt8349 = this.anInt8527;
			this.anInt8404 = this.anInt8519;
			this.method7069();
		}
		this.method7087();
		this.la();
	}

	@OriginalMember(owner = "client!qfa", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(28) float local28 = this.aClass26_Sub3_3.aFloat171 + this.aClass26_Sub3_3.aFloat181 * (float) arg0 + (float) arg1 * this.aClass26_Sub3_3.aFloat175 + (float) arg2 * this.aClass26_Sub3_3.aFloat179;
		if (local28 < (float) this.anInt8561 || local28 > (float) this.anInt8588) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(86) int local86 = (int) ((float) this.anInt8566 * (this.aClass26_Sub3_3.aFloat176 + (float) arg1 * this.aClass26_Sub3_3.aFloat177 + (float) arg0 * this.aClass26_Sub3_3.aFloat172 + (float) arg2 * this.aClass26_Sub3_3.aFloat173) / (float) arg3);
		@Pc(119) int local119 = (int) ((this.aClass26_Sub3_3.aFloat178 + this.aClass26_Sub3_3.aFloat180 * (float) arg1 + (float) arg0 * this.aClass26_Sub3_3.aFloat182 + (float) arg2 * this.aClass26_Sub3_3.aFloat174) * (float) this.anInt8578 / (float) arg3);
		if (this.aFloat199 <= (float) local86 && this.aFloat202 >= (float) local86 && this.aFloat192 <= (float) local119 && this.aFloat193 >= (float) local119) {
			arg4[2] = (int) local28;
			arg4[0] = (int) ((float) local86 - this.aFloat199);
			arg4[1] = (int) ((float) local119 - this.aFloat192);
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg1;
		@Pc(9) Class66_Sub1_Sub1 local9 = local6.aClass66_Sub1_Sub1_5;
		this.method7091();
		this.method7090(local6.aClass66_Sub1_Sub1_5);
		this.method7082(1);
		this.method7084(8448, 7681);
		this.method7071(34167, 768, 0);
		@Pc(39) float local39 = local9.aFloat52 / (float) local9.anInt1954;
		@Pc(46) float local46 = local9.aFloat53 / (float) local9.anInt1950;
		OpenGL.glColor4ub((byte) (arg0 >> 16), (byte) (arg0 >> 8), (byte) arg0, (byte) (arg0 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f((float) (this.anInt8580 - arg2) * local39, (float) (this.anInt8558 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8580, this.anInt8558);
		OpenGL.glTexCoord2f((float) (this.anInt8580 - arg2) * local39, local46 * (float) (this.anInt8574 - arg3));
		OpenGL.glVertex2i(this.anInt8580, this.anInt8574);
		OpenGL.glTexCoord2f((float) (this.anInt8557 - arg2) * local39, local46 * (float) (this.anInt8574 - arg3));
		OpenGL.glVertex2i(this.anInt8557, this.anInt8574);
		OpenGL.glTexCoord2f(local39 * (float) (this.anInt8557 - arg2), (float) (this.anInt8558 - arg3) * local46);
		OpenGL.glVertex2i(this.anInt8557, this.anInt8558);
		OpenGL.glEnd();
		this.method7071(5890, 768, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "l", descriptor = "()V")
	@Override
	public void method7893() {
		if (this.aBoolean608) {
			if (this.anInterface11_1 != this.aClass125_6) {
				throw new RuntimeException();
			}
			this.aClass125_6.method2965(0);
			this.aClass125_6.method2965(8);
			this.method7037(this.aClass125_6);
		} else if (this.aBoolean609) {
			this.aClass20_Sub3_1.method7395(0, 0, this.anInt8404, this.anInt8349, 0, 0);
			this.anOpenGL2.setSurface(this.aLong228);
		} else {
			throw new RuntimeException("");
		}
		this.anInt8349 = this.anInt8527;
		this.aClass20_Sub3_1 = null;
		this.anInt8404 = this.anInt8519;
		this.method7087();
		this.method7069();
		this.la();
	}

	@OriginalMember(owner = "client!qfa", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		this.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class51 method7908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(IIIIII)Lclient!qaa;")
	@Override
	public Class144 method7928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.aBoolean605 ? new Class144_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!gda;I)V")
	public void method7089(@OriginalArg(0) Interface8 arg0) {
		if (arg0 != this.anInterface8_5) {
			if (this.aBoolean601) {
				OpenGL.glBindBufferARB(34962, arg0.method5113());
			}
			this.anInterface8_5 = arg0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLclient!dca;)V")
	public void method7090(@OriginalArg(1) Class66 arg0) {
		@Pc(11) Class66 local11 = this.aClass66Array1[this.anInt8589];
		if (local11 != arg0) {
			if (arg0 == null) {
				OpenGL.glDisable(local11.anInt8223);
			} else {
				if (local11 == null) {
					OpenGL.glEnable(arg0.anInt8223);
				} else if (arg0.anInt8223 != local11.anInt8223) {
					OpenGL.glDisable(local11.anInt8223);
					OpenGL.glEnable(arg0.anInt8223);
				}
				OpenGL.glBindTexture(arg0.anInt8223, arg0.method6849());
			}
			this.aClass66Array1[this.anInt8589] = arg0;
		}
		this.anInt8554 &= 0xFFFFFFFE;
	}

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "()Z")
	@Override
	public boolean method7881() {
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "(B)V")
	public void method7091() {
		if (this.anInt8554 == 2) {
			return;
		}
		this.method7062();
		this.method7079(false);
		this.method7038(false);
		this.method7067(false);
		this.method7073(false);
		this.method7029(-2);
		this.anInt8554 = 2;
	}

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7936() {
		return this.aClass14_Sub16_Sub1_1 != null && (this.anInt8543 <= 1 || this.aBoolean588);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ZZII)V")
	public void method7092(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (this.anInt8572 != arg2 || this.aBoolean593 != this.aBoolean611) {
			@Pc(24) Class66_Sub1 local24 = null;
			@Pc(26) int local26 = 0;
			@Pc(28) byte local28 = 0;
			@Pc(30) int local30 = 0;
			@Pc(37) int local37 = this.aBoolean593 ? 3 : 0;
			if (arg2 < 0) {
				this.method7068();
			} else {
				local24 = this.aClass379_1.method9073(arg2);
				@Pc(59) Class224 local59 = super.anInterface3_11.method6177(arg2);
				if (local59.aByte98 == 0 && local59.aByte97 == 0) {
					this.method7068();
				} else {
					@Pc(75) int local75 = local59.aBoolean455 ? 64 : 128;
					@Pc(79) int local79 = local75 * 50;
					this.method7094((float) (this.anInt8544 % local79 * local59.aByte97) / (float) local79, 0.0F, (float) (this.anInt8544 % local79 * local59.aByte98) / (float) local79);
				}
				if (!this.aBoolean593) {
					local28 = local59.aByte94;
					local30 = local59.anInt6488;
					local37 = local59.aByte96;
				}
				local26 = local59.anInt6486;
			}
			this.aClass140_1.method3373(local37, arg1, local28, local30, arg0);
			if (!this.aClass140_1.method3371(local24, local26)) {
				this.method7090(local24);
				this.method7077(local26);
			}
			this.anInt8572 = arg2;
			this.aBoolean611 = this.aBoolean593;
		}
		this.anInt8554 &= 0xFFFFFFF8;
	}

	@OriginalMember(owner = "client!qfa", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8584 = arg0;
		this.anInt8559 = arg1;
		this.anInt8578 = arg3;
		this.anInt8566 = arg2;
		this.method7046();
		this.method7044();
		if (this.anInt8573 == 3) {
			this.method7039();
		} else if (this.anInt8573 == 2) {
			this.method7074();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "u", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method7923() {
		return this.aClass26_Sub3_1;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IBI)V")
	public synchronized void method7093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class14_Sub18 local14 = new Class14_Sub18(arg1);
		local14.aLong305 = (long) arg0;
		this.aClass262_55.method6314(local14);
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method7872() {
		return this.aClass26_Sub3_3;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(FFFI)V")
	private void method7094(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBoolean604) {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glTranslatef(arg2, arg0, arg1);
		OpenGL.glMatrixMode(5888);
		this.aBoolean604 = true;
	}

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "()V")
	@Override
	public void method7906() {
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BI)V")
	public void method7095(@OriginalArg(1) int arg0) {
		if (arg0 != this.anInt8589) {
			OpenGL.glActiveTexture(arg0 + 33984);
			this.anInt8589 = arg0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(IB)I")
	public int method7096(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!qfa", name = "j", descriptor = "(B)V")
	private void method7097() {
		Static116.aFloatArray18[2] = this.aFloat207 * this.aFloat191;
		Static116.aFloatArray18[0] = this.aFloat205 * this.aFloat207;
		Static116.aFloatArray18[3] = 1.0F;
		Static116.aFloatArray18[1] = this.aFloat210 * this.aFloat207;
		OpenGL.glLightfv(16384, 4609, Static116.aFloatArray18, 0);
		Static116.aFloatArray18[3] = 1.0F;
		Static116.aFloatArray18[2] = this.aFloat191 * -this.aFloat204;
		Static116.aFloatArray18[0] = -this.aFloat204 * this.aFloat205;
		Static116.aFloatArray18[1] = this.aFloat210 * -this.aFloat204;
		OpenGL.glLightfv(16385, 4609, Static116.aFloatArray18, 0);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7929() {
		this.method7028();
		this.method7082(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100);
		OpenGL.glColor4ub((byte) -1, (byte) 0, (byte) 0, (byte) -1);
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qfa", name = "B", descriptor = "(I)V")
	private void method7098() {
		this.aFloatArray67[14] = this.aFloat198;
		this.aFloatArray67[10] = this.aFloat211;
		this.aFloat196 = (this.aFloatArray67[14] - (float) this.anInt8588) / this.aFloatArray67[10];
		this.aFloat200 = (float) this.anInt8588;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!dba;IIII)Lclient!ka;")
	@Override
	public Class80 method7901(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class80_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!kda;I)V")
	public void method7099(@OriginalArg(0) Interface12 arg0) {
		if (arg0 != this.anInterface12_4) {
			if (this.aBoolean601) {
				OpenGL.glBindBufferARB(34963, arg0.method5496());
			}
			this.anInterface12_4 = arg0;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		this.method7889(arg2, arg3);
	}

	@OriginalMember(owner = "client!qfa", name = "t", descriptor = "()V")
	@Override
	public void method7919() {
		this.aClass234_1.method5541();
	}

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "(Lclient!iha;I)V")
	public void method7100(@OriginalArg(0) Interface11 arg0) {
		if (this.anInt8549 < 0 || this.anInterface11Array1[this.anInt8549] != arg0) {
			throw new RuntimeException();
		}
		this.anInterface11Array1[this.anInt8549--] = null;
		arg0.method2960();
		if (this.anInt8549 >= 0) {
			this.anInterface11_2 = this.anInterface11Array1[this.anInt8549];
			this.anInterface11_2.method2963();
		} else {
			this.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(II)Lclient!kfa;")
	@Override
	public Interface14 method7902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == this.anInt8561 && this.anInt8588 == arg1) {
			return;
		}
		this.anInt8561 = arg0;
		this.anInt8588 = arg1;
		this.method7046();
		this.method7083();
		if (this.anInt8573 == 3) {
			this.method7039();
		} else if (this.anInt8573 == 2) {
			this.method7074();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(28) float local28 = this.aClass26_Sub3_3.aFloat171 + this.aClass26_Sub3_3.aFloat179 * (float) arg2 + this.aClass26_Sub3_3.aFloat175 * (float) arg1 + this.aClass26_Sub3_3.aFloat181 * (float) arg0;
		if (local28 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(77) int local77 = (int) ((this.aClass26_Sub3_3.aFloat176 + (float) arg1 * this.aClass26_Sub3_3.aFloat177 + this.aClass26_Sub3_3.aFloat172 * (float) arg0 + this.aClass26_Sub3_3.aFloat173 * (float) arg2) * (float) this.anInt8566 / local28);
		arg3[0] = (int) ((float) local77 - this.aFloat199);
		@Pc(118) int local118 = (int) ((float) this.anInt8578 * (this.aClass26_Sub3_3.aFloat178 + (float) arg1 * this.aClass26_Sub3_3.aFloat180 + this.aClass26_Sub3_3.aFloat182 * (float) arg0 + this.aClass26_Sub3_3.aFloat174 * (float) arg2) / local28);
		arg3[2] = (int) local28;
		arg3[1] = (int) ((float) local118 - this.aFloat192);
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
	}

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "()Lclient!cq;")
	@Override
	public Class64 method7953() {
		@Pc(7) int local7 = -1;
		if (this.aString82.indexOf("nvidia") != -1) {
			local7 = 4318;
		} else if (this.aString82.indexOf("intel") != -1) {
			local7 = 32902;
		} else if (this.aString82.indexOf("ati") != -1) {
			local7 = 4098;
		}
		return new Class64(local7, "OpenGL", this.anInt8577, this.aString83, 0L);
	}

	@OriginalMember(owner = "client!qfa", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8557 = this.anInt8404;
		this.anInt8574 = this.anInt8349;
		this.anInt8580 = 0;
		this.anInt8558 = 0;
		OpenGL.glDisable(3089);
		this.method7044();
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IF)V")
	public void method7101(@OriginalArg(1) float arg0) {
		if (arg0 == this.aFloat195) {
			return;
		}
		this.aFloat195 = arg0;
		if (this.anInt8573 == 3) {
			this.method7039();
			return;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "(II)I")
	@Override
	public int method7922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 & arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!qfa", name = "k", descriptor = "(B)V")
	private void method7102() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass26_Sub3_4.method6462(), 0);
		if (this.aBoolean611) {
			this.aClass140_1.aClass33_Sub6_1.method6607();
		}
		this.method7035();
		this.method7040();
	}

	@OriginalMember(owner = "client!qfa", name = "i", descriptor = "(I)V")
	@Override
	public void method7931(@OriginalArg(0) int arg0) {
		if (arg0 < 128 || arg0 > 1024) {
			throw new IllegalArgumentException();
		}
		this.anInt8531 = arg0;
		this.aClass379_1.method9076();
	}

	@OriginalMember(owner = "client!qfa", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8557;
		arg0[0] = this.anInt8580;
		arg0[3] = this.anInt8574;
		arg0[1] = this.anInt8558;
	}

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(ZI)V")
	public void method7103(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean591) {
			this.aBoolean591 = arg0;
			this.method7104();
		}
	}

	@OriginalMember(owner = "client!qfa", name = "C", descriptor = "(I)V")
	private void method7104() {
		if (this.aBoolean587 && !this.aBoolean591) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "D", descriptor = "(I)V")
	public void method7105() {
		OpenGL.glPushMatrix();
	}

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "()Z")
	@Override
	public boolean method7904() {
		return true;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass234_1.method5538(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!qfa", name = "f", descriptor = "()Z")
	@Override
	public boolean method7880() {
		return this.aClass14_Sub16_Sub1_1 != null && this.aClass14_Sub16_Sub1_1.method1888();
	}

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "()V")
	@Override
	protected void method7905() {
		for (@Pc(10) Class14 local10 = this.aClass262_50.method6318(); local10 != null; local10 = this.aClass262_50.method6311()) {
			((Class14_Sub7_Sub1) local10).method1050();
		}
		if (this.aClass234_1 != null) {
			this.aClass234_1.method5537();
		}
		if (this.anOpenGL2 != null) {
			this.method7065();
			@Pc(40) Enumeration local40 = this.aHashtable5.keys();
			while (local40.hasMoreElements()) {
				@Pc(46) Canvas local46 = (Canvas) local40.nextElement();
				@Pc(52) Long local52 = (Long) this.aHashtable5.get(local46);
				this.anOpenGL2.releaseSurface(local46, local52);
			}
			this.anOpenGL2.release();
			this.anOpenGL2 = null;
		}
		if (this.aBoolean580) {
			Static349.method5327(true, false);
			this.aBoolean580 = false;
		}
	}
}
