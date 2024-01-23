import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public static int anInt894 = -1;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public static int anInt895 = -1;

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "[I")
	public static int[] anIntArray124 = null;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "[I")
	public static int[] anIntArray125 = null;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	private static void method756() {
		@Pc(1) GL local1 = Static240.aGL1;
		if (aBoolean83) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer4.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer4);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt895 = local6[0];
			Static154.anInt2855 += aByteBuffer4.limit() * 2;
			return;
		}
		anIntArray125 = new int[64];
		local1.glGenTextures(64, anIntArray125, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static240.method3789(anIntArray125[local65]);
			aByteBuffer4.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer4);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static154.anInt2855 += aByteBuffer4.limit() * 2;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
	public static void method757() {
		aBoolean83 = Static240.aBoolean375;
		method759();
		method756();
		method760();
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()V")
	public static void method758() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt895 != -1) {
			local4 = Static240.aGL1;
			local11 = new int[] { anInt895 };
			local4.glDeleteTextures(1, local11, 0);
			anInt895 = -1;
			Static154.anInt2855 -= aByteBuffer4.limit() * 2;
		}
		if (anIntArray125 != null) {
			local4 = Static240.aGL1;
			local4.glDeleteTextures(64, anIntArray125, 0);
			anIntArray125 = null;
			Static154.anInt2855 -= aByteBuffer4.limit() * 2;
		}
		if (anInt894 != -1) {
			local4 = Static240.aGL1;
			local11 = new int[] { anInt894 };
			local4.glDeleteTextures(1, local11, 0);
			anInt894 = -1;
			Static154.anInt2855 -= aByteBuffer3.limit() * 2;
		}
		if (anIntArray124 != null) {
			local4 = Static240.aGL1;
			local4.glDeleteTextures(64, anIntArray124, 0);
			anIntArray124 = null;
			Static154.anInt2855 -= aByteBuffer3.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "()V")
	public static void method759() {
		@Pc(11) byte[] local11;
		if (aByteBuffer4 == null) {
			@Pc(5) Class55_Sub1_Sub1 local5 = new Class55_Sub1_Sub1();
			local11 = local5.method1817();
			aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer4.position(0);
			aByteBuffer4.put(local11);
			aByteBuffer4.flip();
		}
		if (aByteBuffer3 != null) {
			return;
		}
		@Pc(32) Class55_Sub2_Sub1 local32 = new Class55_Sub2_Sub1();
		local11 = local32.method2441();
		aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer3.position(0);
		aByteBuffer3.put(local11);
		aByteBuffer3.flip();
	}

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "()V")
	private static void method760() {
		@Pc(1) GL local1 = Static240.aGL1;
		if (aBoolean83) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer3.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt894 = local6[0];
			Static154.anInt2855 += aByteBuffer3.limit() * 2;
			return;
		}
		anIntArray124 = new int[64];
		local1.glGenTextures(64, anIntArray124, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static240.method3789(anIntArray124[local65]);
			aByteBuffer3.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static154.anInt2855 += aByteBuffer3.limit() * 2;
	}
}
