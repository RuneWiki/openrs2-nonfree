import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!pn;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
	public static int anInt3109;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "[Lclient!v;")
	public static Class87_Sub1_Sub1[] aClass87_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
	public static int anInt3112;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
	public static int anInt3113;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!lg", name = "L", descriptor = "[I")
	public static int[] anIntArray260;

	@OriginalMember(owner = "client!lg", name = "fb", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer10;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public static int anInt3106 = 0;

	@OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
	public static int anInt3107 = 0;

	@OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
	public static int anInt3110 = 0;

	@OriginalMember(owner = "client!lg", name = "v", descriptor = "Lclient!ie;")
	public static Class73 aClass73_1 = new Class73(8);

	@OriginalMember(owner = "client!lg", name = "w", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
	public static int anInt3111 = 0;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "Z")
	public static boolean aBoolean215 = false;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[8];

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
	public static int anInt3114 = 2;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "[Z")
	public static boolean[] aBooleanArray13 = new boolean[8];

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	public static int anInt3115 = 0;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
	public static int anInt3117 = 0;

	@OriginalMember(owner = "client!lg", name = "O", descriptor = "Lclient!lf;")
	public static Class1_Sub14 aClass1_Sub14_4 = new Class1_Sub14(131056);

	@OriginalMember(owner = "client!lg", name = "eb", descriptor = "F")
	public static float aFloat93 = 1.0F;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
	public static void method2706() {
		@Pc(1) GL local1 = Static156.aGL1;
		if (Static311.aBoolean384) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static156.aBoolean203) {
			local1.glEnable(2912);
		}
		if (aBoolean214) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "()V")
	public static void method2710() {
		aClass73_1 = new Class73(8);
		anInt3115 = 0;
		for (@Pc(11) Class87_Sub2 local11 = (Class87_Sub2) aClass141_1.method3481(); local11 != null; local11 = (Class87_Sub2) aClass141_1.method3477()) {
			local11.method2722();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!nk;)V")
	public static void method2713(@OriginalArg(0) Class121 arg0) {
		anInt3110 = 0;
		anInt3107 = 0;
		aClass141_1 = new Class141();
		aClass87_Sub1_Sub1Array1 = new Class87_Sub1_Sub1[1024];
		Static92.method4695(arg0);
		Static18.method270(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(J)V")
	public static void method2714(@OriginalArg(0) long arg0) {
		anInt3111 = anInt3109;
		anInt3106 = 0;
		anInt3109 = 0;
		@Pc(8) long local8 = Static298.method4535();
		for (@Pc(13) Class87_Sub2 local13 = (Class87_Sub2) aClass141_1.method3481(); local13 != null; local13 = (Class87_Sub2) aClass141_1.method3477()) {
			if (local13.method2712(arg0)) {
				anInt3106++;
			}
		}
		if (aBoolean215 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass141_1.method3480() + ", running: " + anInt3106 + ". Particles: " + anInt3109 + ". Time taken: " + (Static298.method4535() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "()I")
	public static int method2715() {
		return anInt3114;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V")
	public static void method2717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat93 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public static void method2721(@OriginalArg(0) int arg0) {
		anInt3114 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "g", descriptor = "()V")
	public static void method2723() {
		@Pc(1) GL local1 = Static156.aGL1;
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
		aShortArrayArray4 = new short[1600][32];
		aShortArrayArray3 = new short[32][768];
		anIntArray260 = new int[1600];
		anIntArray259 = new int[32];
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
	public static void method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static156.aGL1;
		if (aBoolean214) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static90.method1648(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static76.aFloatArray5, 0);
		if (Static311.aBoolean384) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static156.aBoolean203) {
			local1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!lg", name = "h", descriptor = "()V")
	public static void method2726() {
		aShortArrayArray4 = null;
		aShortArrayArray3 = null;
		anIntArray260 = null;
		anIntArray259 = null;
	}
}
