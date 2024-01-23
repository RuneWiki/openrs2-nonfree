import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[Lclient!lm;")
	public static Class20_Sub2_Sub1[] aClass20_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	public static int anInt3503;

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
	public static int anInt3504;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "Lclient!ug;")
	public static Class175 aClass175_3;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
	public static int anInt3506;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ne", name = "Z", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "[I")
	public static int[] anIntArray388;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!ak;")
	public static Class10 aClass10_1 = new Class10(8);

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public static int anInt3500 = 0;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public static int anInt3501 = 0;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public static int anInt3502 = 0;

	@OriginalMember(owner = "client!ne", name = "A", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	public static int anInt3505 = 0;

	@OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
	public static int anInt3519 = 0;

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "Lclient!fd;")
	public static Class4_Sub10 aClass4_Sub10_7 = new Class4_Sub10(131056);

	@OriginalMember(owner = "client!ne", name = "V", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[8];

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[8];

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
	public static int anInt3523 = 2;

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
	public static int anInt3524 = 0;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "F")
	public static float aFloat86 = 1.0F;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method2963(@OriginalArg(0) Class58 arg0) {
		anInt3501 = 0;
		anInt3502 = 0;
		aClass175_3 = new Class175();
		aClass20_Sub2_Sub1Array1 = new Class20_Sub2_Sub1[1024];
		Static156.method2515(arg0);
		Static276.method4301(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public static void method2964() {
		aShortArrayArray3 = null;
		aShortArrayArray4 = null;
		anIntArray387 = null;
		anIntArray388 = null;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()I")
	public static int method2967() {
		return anInt3523;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method2970(@OriginalArg(0) int arg0) {
		anInt3523 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static94.aGL1;
		if (aBoolean249) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static164.method2665(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static161.aFloatArray36, 0);
		if (Static56.aBoolean66) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static94.aBoolean139) {
			local1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "()V")
	public static void method2975() {
		@Pc(1) GL local1 = Static94.aGL1;
		if (Static56.aBoolean66) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static94.aBoolean139) {
			local1.glEnable(2912);
		}
		if (aBoolean249) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "()V")
	public static void method2976() {
		aClass10_1 = new Class10(8);
		anInt3524 = 0;
		for (@Pc(11) Class20_Sub3 local11 = (Class20_Sub3) aClass175_3.method4357(); local11 != null; local11 = (Class20_Sub3) aClass175_3.method4352()) {
			local11.method2971();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V")
	public static void method2977(@OriginalArg(0) long arg0) {
		anInt3500 = anInt3504;
		anInt3505 = 0;
		anInt3504 = 0;
		@Pc(8) long local8 = Static101.method1677();
		for (@Pc(13) Class20_Sub3 local13 = (Class20_Sub3) aClass175_3.method4357(); local13 != null; local13 = (Class20_Sub3) aClass175_3.method4352()) {
			if (local13.method2981(arg0)) {
				anInt3505++;
			}
		}
		if (aBoolean251 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass175_3.method4353() + ", running: " + anInt3505 + ". Particles: " + anInt3504 + ". Time taken: " + (Static101.method1677() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	public static void method2979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat86 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "()V")
	public static void method2982() {
		@Pc(1) GL local1 = Static94.aGL1;
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
			aBoolean249 = true;
		}
		aShortArrayArray3 = new short[1600][32];
		aShortArrayArray4 = new short[32][768];
		anIntArray387 = new int[1600];
		anIntArray388 = new int[32];
	}
}
