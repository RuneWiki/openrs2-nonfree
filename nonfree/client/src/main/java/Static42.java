import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	public static int anInt1034;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	public static int anInt1035;

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "Lclient!qe;")
	public static Class138 aClass138_2;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "[Lclient!gm;")
	public static Class34_Sub2_Sub1[] aClass34_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
	public static int anInt1040;

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "[[S")
	public static short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!dc", name = "kb", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!dc", name = "mb", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	public static int anInt1031 = 0;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
	public static int anInt1036 = 0;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "Lclient!mk;")
	public static Class110 aClass110_1 = new Class110(8);

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	public static int anInt1037 = 0;

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[8];

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "Lclient!qm;")
	public static Class1_Sub14 aClass1_Sub14_2 = new Class1_Sub14(131056);

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
	public static int anInt1054 = 0;

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[8];

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
	public static int anInt1055 = 2;

	@OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
	public static int anInt1056 = 0;

	@OriginalMember(owner = "client!dc", name = "nb", descriptor = "F")
	public static float aFloat11 = 1.0F;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()I")
	public static int method849() {
		return anInt1055;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()V")
	public static void method851() {
		@Pc(1) GL local1 = Static294.aGL1;
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
			aBoolean75 = true;
		}
		aShortArrayArray3 = new short[1600][32];
		aShortArrayArray2 = new short[32][768];
		anIntArray128 = new int[1600];
		anIntArray129 = new int[32];
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "()V")
	public static void method853() {
		aShortArrayArray3 = null;
		aShortArrayArray2 = null;
		anIntArray128 = null;
		anIntArray129 = null;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method854(@OriginalArg(0) int arg0) {
		anInt1055 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "()V")
	public static void method857() {
		@Pc(1) GL local1 = Static294.aGL1;
		if (Static65.aBoolean96) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static294.aBoolean379) {
			local1.glEnable(2912);
		}
		if (aBoolean75) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(J)V")
	public static void method864(@OriginalArg(0) long arg0) {
		anInt1031 = anInt1034;
		anInt1036 = 0;
		anInt1034 = 0;
		@Pc(8) long local8 = Static258.method3967();
		for (@Pc(13) Class34_Sub1 local13 = (Class34_Sub1) aClass138_2.method3540(); local13 != null; local13 = (Class34_Sub1) aClass138_2.method3536()) {
			if (local13.method868(arg0)) {
				anInt1036++;
			}
		}
		if (aBoolean74 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass138_2.method3537() + ", running: " + anInt1036 + ". Particles: " + anInt1034 + ". Time taken: " + (Static258.method3967() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
	public static void method865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat11 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	public static void method866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static294.aGL1;
		if (aBoolean75) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static1.method4721(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static66.aFloatArray19, 0);
		if (Static65.aBoolean96) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static294.aBoolean379) {
			local1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "()V")
	public static void method867() {
		aClass110_1 = new Class110(8);
		anInt1054 = 0;
		for (@Pc(11) Class34_Sub1 local11 = (Class34_Sub1) aClass138_2.method3540(); local11 != null; local11 = (Class34_Sub1) aClass138_2.method3536()) {
			local11.method862();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!th;)V")
	public static void method871(@OriginalArg(0) Class168 arg0) {
		anInt1037 = 0;
		anInt1032 = 0;
		aClass138_2 = new Class138();
		aClass34_Sub2_Sub1Array2 = new Class34_Sub2_Sub1[1024];
		Static286.method4389(arg0);
		Static304.method4622(arg0);
	}
}
