import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Z")
	public static boolean aBoolean160;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public static int anInt2341 = -1;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
	public static int[] anIntArray198 = null;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public static int anInt2342 = -1;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
	public static int[] anIntArray199 = null;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
	public static void method1856() {
		aBoolean160 = Static94.aBoolean137;
		method1860();
		method1857();
		method1858();
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()V")
	private static void method1857() {
		@Pc(1) GL local1 = Static94.aGL1;
		if (aBoolean160) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer3.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2342 = local6[0];
			Static173.anInt3330 += aByteBuffer3.limit() * 2;
			return;
		}
		anIntArray198 = new int[64];
		local1.glGenTextures(64, anIntArray198, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static94.method1600(anIntArray198[local65]);
			aByteBuffer3.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static173.anInt3330 += aByteBuffer3.limit() * 2;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
	private static void method1858() {
		@Pc(1) GL local1 = Static94.aGL1;
		if (aBoolean160) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer2.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2341 = local6[0];
			Static173.anInt3330 += aByteBuffer2.limit() * 2;
			return;
		}
		anIntArray199 = new int[64];
		local1.glGenTextures(64, anIntArray199, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static94.method1600(anIntArray199[local65]);
			aByteBuffer2.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static173.anInt3330 += aByteBuffer2.limit() * 2;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "()V")
	public static void method1859() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt2342 != -1) {
			local4 = Static94.aGL1;
			local11 = new int[] { anInt2342 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2342 = -1;
			Static173.anInt3330 -= aByteBuffer3.limit() * 2;
		}
		if (anIntArray198 != null) {
			local4 = Static94.aGL1;
			local4.glDeleteTextures(64, anIntArray198, 0);
			anIntArray198 = null;
			Static173.anInt3330 -= aByteBuffer3.limit() * 2;
		}
		if (anInt2341 != -1) {
			local4 = Static94.aGL1;
			local11 = new int[] { anInt2341 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2341 = -1;
			Static173.anInt3330 -= aByteBuffer2.limit() * 2;
		}
		if (anIntArray199 != null) {
			local4 = Static94.aGL1;
			local4.glDeleteTextures(64, anIntArray199, 0);
			anIntArray199 = null;
			Static173.anInt3330 -= aByteBuffer2.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "()V")
	public static void method1860() {
		@Pc(11) byte[] local11;
		if (aByteBuffer3 == null) {
			@Pc(5) Class41_Sub1_Sub1 local5 = new Class41_Sub1_Sub1();
			local11 = local5.method938();
			aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer3.position(0);
			aByteBuffer3.put(local11);
			aByteBuffer3.flip();
		}
		if (aByteBuffer2 != null) {
			return;
		}
		@Pc(32) Class41_Sub2_Sub1 local32 = new Class41_Sub2_Sub1();
		local11 = local32.method3169();
		aByteBuffer2 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer2.position(0);
		aByteBuffer2.put(local11);
		aByteBuffer2.flip();
	}
}
