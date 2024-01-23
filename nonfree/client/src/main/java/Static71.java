import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!em", name = "s", descriptor = "Lclient!ge;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "I")
	public static int anInt1295;

	@OriginalMember(owner = "client!em", name = "A", descriptor = "I")
	public static int anInt1297;

	@OriginalMember(owner = "client!em", name = "B", descriptor = "[Lclient!tm;")
	public static Class47_Sub2_Sub1[] aClass47_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!em", name = "E", descriptor = "I")
	public static int anInt1300;

	@OriginalMember(owner = "client!em", name = "H", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!em", name = "K", descriptor = "[I")
	public static int[] anIntArray116;

	@OriginalMember(owner = "client!em", name = "O", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!em", name = "S", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!em", name = "ib", descriptor = "Ljava/nio/ByteBuffer;")
	public static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!em", name = "o", descriptor = "I")
	public static int anInt1293 = 0;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "I")
	public static int anInt1294 = 0;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!em", name = "y", descriptor = "I")
	public static int anInt1296 = 0;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	public static int anInt1299 = 0;

	@OriginalMember(owner = "client!em", name = "F", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!em", name = "G", descriptor = "Lclient!lo;")
	public static Class107 aClass107_1 = new Class107(8);

	@OriginalMember(owner = "client!em", name = "I", descriptor = "I")
	public static int anInt1301 = 0;

	@OriginalMember(owner = "client!em", name = "J", descriptor = "I")
	public static int anInt1302 = 2;

	@OriginalMember(owner = "client!em", name = "L", descriptor = "Lclient!ug;")
	public static Class3_Sub26 aClass3_Sub26_1 = new Class3_Sub26(131056);

	@OriginalMember(owner = "client!em", name = "M", descriptor = "I")
	public static int anInt1303 = 0;

	@OriginalMember(owner = "client!em", name = "N", descriptor = "[Z")
	public static boolean[] aBooleanArray30 = new boolean[8];

	@OriginalMember(owner = "client!em", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray31 = new boolean[8];

	@OriginalMember(owner = "client!em", name = "fb", descriptor = "F")
	public static float aFloat15 = 1.0F;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!rn;)V")
	public static void method1073(@OriginalArg(0) Class155 arg0) {
		anInt1296 = 0;
		anInt1294 = 0;
		aClass62_1 = new Class62();
		aClass47_Sub2_Sub1Array2 = new Class47_Sub2_Sub1[1024];
		Static147.method2497(arg0);
		Static163.method2721(arg0);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public static void method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		aFloat15 = (float) arg1 / 334.0F;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public static void method1077(@OriginalArg(0) int arg0) {
		anInt1302 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "()V")
	public static void method1078() {
		@Pc(1) GL local1 = Static283.aGL1;
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
			aBoolean104 = true;
		}
		aShortArrayArray3 = new short[1600][32];
		aShortArrayArray4 = new short[32][768];
		anIntArray116 = new int[1600];
		anIntArray117 = new int[32];
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "()I")
	public static int method1079() {
		return anInt1302;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(J)V")
	public static void method1081(@OriginalArg(0) long arg0) {
		anInt1293 = anInt1300;
		anInt1299 = 0;
		anInt1300 = 0;
		@Pc(8) long local8 = Static128.method2196();
		for (@Pc(13) Class47_Sub1 local13 = (Class47_Sub1) aClass62_1.method1369(); local13 != null; local13 = (Class47_Sub1) aClass62_1.method1363()) {
			if (local13.method1082(arg0)) {
				anInt1299++;
			}
		}
		if (aBoolean105 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + aClass62_1.method1362() + ", running: " + anInt1299 + ". Particles: " + anInt1300 + ". Time taken: " + (Static128.method2196() - local8) + "ms");
		}
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "()V")
	public static void method1083() {
		@Pc(1) GL local1 = Static283.aGL1;
		if (Static67.aBoolean95) {
			local1.glEnableClientState(32885);
		}
		local1.glEnableClientState(32888);
		local1.glDepthMask(true);
		local1.glColorMaterial(1028, 5634);
		local1.glPopMatrix();
		if (!Static283.aBoolean395) {
			local1.glEnable(2912);
		}
		if (aBoolean104) {
			local1.glTexEnvi(34913, 34914, 0);
			local1.glDisable(34913);
		}
	}

	@OriginalMember(owner = "client!em", name = "f", descriptor = "()V")
	public static void method1086() {
		aShortArrayArray3 = null;
		aShortArrayArray4 = null;
		anIntArray116 = null;
		anIntArray117 = null;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public static void method1087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) GL local1 = Static283.aGL1;
		if (aBoolean104) {
			local1.glEnable(34913);
			local1.glTexEnvi(34913, 34914, 1);
		}
		local1.glDepthMask(false);
		Static53.method5036(0, 0);
		local1.glColorMaterial(1028, 4609);
		local1.glMaterialfv(1028, 4608, Static175.aFloatArray15, 0);
		if (Static67.aBoolean95) {
			local1.glDisableClientState(32885);
		}
		local1.glDisableClientState(32888);
		local1.glPushMatrix();
		local1.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
		local1.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!Static283.aBoolean395) {
			local1.glDisable(2912);
		}
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "()V")
	public static void method1088() {
		aClass107_1 = new Class107(8);
		anInt1303 = 0;
		for (@Pc(11) Class47_Sub1 local11 = (Class47_Sub1) aClass62_1.method1369(); local11 != null; local11 = (Class47_Sub1) aClass62_1.method1363()) {
			local11.method1092();
		}
	}
}
