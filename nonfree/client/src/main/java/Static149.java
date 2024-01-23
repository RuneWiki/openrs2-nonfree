import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "[Lclient!lb;")
	public static Class45_Sub3_Sub1[] aClass45_Sub3_Sub1Array1;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
	public static int anInt2993;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
	public static int anInt2995;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
	public static int anInt2996;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "Lclient!tf;")
	public static Class168 aClass168_3;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "[[S")
	public static short[][] aShortArrayArray19;

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!ko", name = "V", descriptor = "[[S")
	public static short[][] aShortArrayArray20;

	@OriginalMember(owner = "client!ko", name = "W", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!ko", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
	public static int anInt2990 = 0;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
	public static int anInt2991 = 0;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
	public static int anInt2992 = 0;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
	public static int anInt2997 = 0;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "Lclient!nn;")
	public static Class121 aClass121_1 = new Class121(8);

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
	public static int anInt3003 = 0;

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "[Z")
	public static boolean[] aBooleanArray32 = new boolean[8];

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "Lclient!sb;")
	public static Class1_Sub14 aClass1_Sub14_6 = new Class1_Sub14(131056);

	@OriginalMember(owner = "client!ko", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray33 = new boolean[8];

	@OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
	public static int anInt3008 = 0;

	@OriginalMember(owner = "client!ko", name = "bb", descriptor = "I")
	public static int anInt3013 = 2;

	@OriginalMember(owner = "client!ko", name = "fb", descriptor = "F")
	public static float aFloat34 = 1.0F;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ph;)V")
	public static void method2394(@OriginalArg(0) Class138 arg0) {
		anInt2991 = 0;
		anInt2997 = 0;
		aClass168_3 = new Class168();
		aClass45_Sub3_Sub1Array1 = new Class45_Sub3_Sub1[1024];
		Static86.method1272(arg0);
		Static85.method1253(arg0);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	public static void method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static291.aGL1;
		if (aBoolean214) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static207.method3280(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static241.aFloatArray27, 0);
		if (Static302.aBoolean419) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static291.aBoolean402) {
			local1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()I")
	public static int method2401() {
		return anInt3013;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	public static void method2403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat34 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "()V")
	public static void method2404() {
		aClass121_1 = new Class121(8);
		anInt3003 = 0;
		for (@Pc(11) Class45_Sub2 local11 = (Class45_Sub2) aClass168_3.method3985(); local11 != null; local11 = (Class45_Sub2) aClass168_3.method3988()) {
			local11.method2416();
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	public static void method2407(@OriginalArg(0) int arg0) {
		anInt3013 = arg0;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(J)V")
	public static void method2408(@OriginalArg(0) long arg0) {
		anInt2990 = anInt2996;
		anInt2992 = 0;
		anInt2996 = 0;
		@Pc(8) long local8 = Static135.method2186();
		for (@Pc(13) Class45_Sub2 local13 = (Class45_Sub2) aClass168_3.method3985(); local13 != null; local13 = (Class45_Sub2) aClass168_3.method3988()) {
			if (local13.method2412(arg0)) {
				anInt2992++;
			}
		}
		if (aBoolean215 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass168_3.method3981() + ", running: " + anInt2992 + ". Particles: " + anInt2996 + ". Time taken: " + (Static135.method2186() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "()V")
	public static void method2410() {
		@Pc(1) GL local1 = Static291.aGL1;
		if (Static302.aBoolean419) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static291.aBoolean402) {
			local1.glEnable(2912);
		}
		if (aBoolean214) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "()V")
	public static void method2414() {
		@Pc(1) GL local1 = Static291.aGL1;
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
			aBoolean214 = true;
		}
		aShortArrayArray19 = new short[1600][32];
		aShortArrayArray20 = new short[32][768];
		anIntArray243 = new int[1600];
		anIntArray244 = new int[32];
	}

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "()V")
	public static void method2415() {
		aShortArrayArray19 = null;
		aShortArrayArray20 = null;
		anIntArray243 = null;
		anIntArray244 = null;
	}
}
