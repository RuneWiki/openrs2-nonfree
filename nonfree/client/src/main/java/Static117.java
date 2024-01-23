import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!h;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "I")
	public static int anInt2419;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public static int anInt2420;

	@OriginalMember(owner = "client!il", name = "r", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "[Lclient!wg;")
	public static Class21_Sub2_Sub1[] aClass21_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!il", name = "S", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!il", name = "U", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!il", name = "Y", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!il", name = "ab", descriptor = "[I")
	public static int[] anIntArray211;

	@OriginalMember(owner = "client!il", name = "cb", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "Lclient!tg;")
	public static Class162 aClass162_1 = new Class162(8);

	@OriginalMember(owner = "client!il", name = "h", descriptor = "I")
	public static int anInt2416 = 0;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public static int anInt2417 = 0;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "I")
	public static int anInt2418 = 0;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public static int anInt2421 = 0;

	@OriginalMember(owner = "client!il", name = "v", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!il", name = "x", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
	public static int anInt2437 = 0;

	@OriginalMember(owner = "client!il", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray20 = new boolean[8];

	@OriginalMember(owner = "client!il", name = "T", descriptor = "Lclient!pi;")
	public static Class4_Sub24 aClass4_Sub24_22 = new Class4_Sub24(131056);

	@OriginalMember(owner = "client!il", name = "W", descriptor = "I")
	public static int anInt2439 = 0;

	@OriginalMember(owner = "client!il", name = "X", descriptor = "I")
	public static int anInt2440 = 2;

	@OriginalMember(owner = "client!il", name = "bb", descriptor = "F")
	public static float aFloat71 = 1.0F;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public static void method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static251.aGL1;
		if (aBoolean153) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static126.method2046(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static43.aFloatArray13, 0);
		if (Static253.aBoolean335) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static251.aBoolean318) {
			local1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!cg;)V")
	public static void method1973(@OriginalArg(0) Class22 arg0) {
		anInt2417 = 0;
		anInt2416 = 0;
		aClass63_1 = new Class63();
		aClass21_Sub2_Sub1Array2 = new Class21_Sub2_Sub1[1024];
		Static70.method1194(arg0);
		Static149.method2346(arg0);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public static void method1978(@OriginalArg(0) int arg0) {
		anInt2440 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
	public static void method1979() {
		@Pc(1) GL local1 = Static251.aGL1;
		if (Static253.aBoolean335) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static251.aBoolean318) {
			local1.glEnable(2912);
		}
		if (aBoolean153) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "()V")
	public static void method1980() {
		aClass162_1 = new Class162(8);
		anInt2439 = 0;
		for (@Pc(11) Class21_Sub1 local11 = (Class21_Sub1) aClass63_1.method1568(); local11 != null; local11 = (Class21_Sub1) aClass63_1.method1571()) {
			local11.method1985();
		}
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "()V")
	public static void method1982() {
		aShortArrayArray3 = null;
		aShortArrayArray2 = null;
		anIntArray211 = null;
		anIntArray210 = null;
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "()I")
	public static int method1983() {
		return anInt2440;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(J)V")
	public static void method1986(@OriginalArg(0) long arg0) {
		anInt2421 = anInt2422;
		anInt2418 = 0;
		anInt2422 = 0;
		@Pc(8) long local8 = Static61.method1150();
		for (@Pc(13) Class21_Sub1 local13 = (Class21_Sub1) aClass63_1.method1568(); local13 != null; local13 = (Class21_Sub1) aClass63_1.method1571()) {
			if (local13.method1992(arg0)) {
				anInt2418++;
			}
		}
		if (aBoolean154 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass63_1.method1569() + ", running: " + anInt2418 + ". Particles: " + anInt2422 + ". Time taken: " + (Static61.method1150() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!il", name = "h", descriptor = "()V")
	public static void method1987() {
		@Pc(1) GL local1 = Static251.aGL1;
		if (local1.isExtensionAvailable("GL_ARB_point_parameters")) {
			@Pc(20) float[] local20 = new float[] { 1.0F, 0.0F, 5.0E-7F };
			local1.glPointParameterfvARB(33065, local20, 0);
			@Pc(28) FloatBuffer local28 = FloatBuffer.allocate(1);
			local1.glGetFloatv(33063, local28);
			@Pc(36) float local36 = local28.get(0);
			if (local36 > 64.0F) {
				local36 = 64.0F;
			}
			local1.glPointParameterfARB(33062, 1.0F);
			local1.glPointParameterfARB(33063, local36);
		}
		if (local1.isExtensionAvailable("GL_ARB_point_sprite")) {
			aBoolean153 = true;
		}
		aShortArrayArray3 = new short[1600][32];
		aShortArrayArray2 = new short[32][768];
		anIntArray211 = new int[1600];
		anIntArray210 = new int[32];
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
	public static void method1993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat71 = (float) arg1 / 334.0F;
	}
}
