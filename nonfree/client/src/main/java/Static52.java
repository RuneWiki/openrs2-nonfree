import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public static int anInt1126;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
	public static int anInt1128;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "[Lclient!cc;")
	public static Class22_Sub1_Sub1[] aClass22_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
	public static int anInt1130;

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "Lclient!uh;")
	public static Class174 aClass174_3;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!dh", name = "O", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!dh", name = "Q", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!dh", name = "ib", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	public static int anInt1127 = 0;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "Lclient!qb;")
	public static Class139 aClass139_1 = new Class139(8);

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
	public static int anInt1131 = 0;

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
	public static int anInt1134 = 0;

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
	public static int anInt1135 = 0;

	@OriginalMember(owner = "client!dh", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!dh", name = "M", descriptor = "Lclient!fh;")
	public static Class1_Sub13 aClass1_Sub13_2 = new Class1_Sub13(131056);

	@OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
	public static int anInt1136 = 2;

	@OriginalMember(owner = "client!dh", name = "R", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[8];

	@OriginalMember(owner = "client!dh", name = "V", descriptor = "F")
	public static float aFloat21 = 1.0F;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat21 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(J)V")
	public static void method956(@OriginalArg(0) long arg0) {
		anInt1127 = anInt1130;
		anInt1131 = 0;
		anInt1130 = 0;
		@Pc(8) long local8 = Static244.method3859();
		for (@Pc(13) Class22_Sub3 local13 = (Class22_Sub3) aClass174_3.method4281(); local13 != null; local13 = (Class22_Sub3) aClass174_3.method4278()) {
			if (local13.method953(arg0)) {
				anInt1131++;
			}
		}
		if (aBoolean112 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass174_3.method4280() + ", running: " + anInt1131 + ". Particles: " + anInt1130 + ". Time taken: " + (Static244.method3859() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
	public static void method957() {
		aClass139_1 = new Class139(8);
		anInt1135 = 0;
		for (@Pc(11) Class22_Sub3 local11 = (Class22_Sub3) aClass174_3.method4281(); local11 != null; local11 = (Class22_Sub3) aClass174_3.method4278()) {
			local11.method955();
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!nm;)V")
	public static void method959(@OriginalArg(0) Class119 arg0) {
		anInt1132 = 0;
		anInt1129 = 0;
		aClass174_3 = new Class174();
		aClass22_Sub1_Sub1Array1 = new Class22_Sub1_Sub1[1024];
		Static17.method269(arg0);
		Static13.method187(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
	public static void method960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static71.aGL1;
		if (aBoolean113) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static165.method4612(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static266.aFloatArray30, 0);
		if (Static69.aBoolean146) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static71.aBoolean155) {
			local1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "()V")
	public static void method963() {
		@Pc(1) GL local1 = Static71.aGL1;
		if (Static69.aBoolean146) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static71.aBoolean155) {
			local1.glEnable(2912);
		}
		if (aBoolean113) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "()V")
	public static void method965() {
		aShortArrayArray3 = null;
		aShortArrayArray2 = null;
		anIntArray89 = null;
		anIntArray88 = null;
	}

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "()I")
	public static int method967() {
		return anInt1136;
	}

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "()V")
	public static void method968() {
		@Pc(1) GL local1 = Static71.aGL1;
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
			aBoolean113 = true;
		}
		aShortArrayArray3 = new short[1600][32];
		aShortArrayArray2 = new short[32][768];
		anIntArray89 = new int[1600];
		anIntArray88 = new int[32];
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public static void method969(@OriginalArg(0) int arg0) {
		anInt1136 = arg0;
	}
}
