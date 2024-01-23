import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "Z")
	public static boolean aBoolean216;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	public static int anInt2696 = -1;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
	public static int[] anIntArray200 = null;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
	public static int[] anIntArray201 = null;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	public static int anInt2697 = -1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "()V")
	public static void method2291() {
		@Pc(11) byte[] local11;
		if (aByteBuffer9 == null) {
			@Pc(5) Class32_Sub1_Sub1 local5 = new Class32_Sub1_Sub1();
			local11 = local5.method1569();
			aByteBuffer9 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer9.position(0);
			aByteBuffer9.put(local11);
			aByteBuffer9.flip();
		}
		if (aByteBuffer8 != null) {
			return;
		}
		@Pc(32) Class32_Sub2_Sub1 local32 = new Class32_Sub2_Sub1();
		local11 = local32.method1675();
		aByteBuffer8 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer8.position(0);
		aByteBuffer8.put(local11);
		aByteBuffer8.flip();
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "()V")
	private static void method2293() {
		@Pc(1) GL local1 = Static60.aGL1;
		if (aBoolean216) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer9.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer9);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2697 = local6[0];
			Static256.anInt5188 += aByteBuffer9.limit() * 2;
			return;
		}
		anIntArray201 = new int[64];
		local1.glGenTextures(64, anIntArray201, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static60.method1157(anIntArray201[local65]);
			aByteBuffer9.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer9);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static256.anInt5188 += aByteBuffer9.limit() * 2;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "()V")
	public static void method2294() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt2697 != -1) {
			local4 = Static60.aGL1;
			local11 = new int[] { anInt2697 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2697 = -1;
			Static256.anInt5188 -= aByteBuffer9.limit() * 2;
		}
		if (anIntArray201 != null) {
			local4 = Static60.aGL1;
			local4.glDeleteTextures(64, anIntArray201, 0);
			anIntArray201 = null;
			Static256.anInt5188 -= aByteBuffer9.limit() * 2;
		}
		if (anInt2696 != -1) {
			local4 = Static60.aGL1;
			local11 = new int[] { anInt2696 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2696 = -1;
			Static256.anInt5188 -= aByteBuffer8.limit() * 2;
		}
		if (anIntArray200 != null) {
			local4 = Static60.aGL1;
			local4.glDeleteTextures(64, anIntArray200, 0);
			anIntArray200 = null;
			Static256.anInt5188 -= aByteBuffer8.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "()V")
	private static void method2295() {
		@Pc(1) GL local1 = Static60.aGL1;
		if (aBoolean216) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer8.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer8);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2696 = local6[0];
			Static256.anInt5188 += aByteBuffer8.limit() * 2;
			return;
		}
		anIntArray200 = new int[64];
		local1.glGenTextures(64, anIntArray200, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static60.method1157(anIntArray200[local65]);
			aByteBuffer8.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer8);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static256.anInt5188 += aByteBuffer8.limit() * 2;
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "()V")
	public static void method2296() {
		aBoolean216 = Static60.aBoolean101;
		method2291();
		method2293();
		method2295();
	}
}
