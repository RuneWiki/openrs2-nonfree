import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Z")
	public static boolean aBoolean262;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
	public static int[] anIntArray349 = null;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
	public static int[] anIntArray350 = null;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public static int anInt4218 = -1;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public static int anInt4219 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	private static void method3405() {
		@Pc(1) GL local1 = Static251.aGL1;
		if (aBoolean262) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer13.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer13);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt4219 = local6[0];
			Static239.anInt4728 += aByteBuffer13.limit() * 2;
			return;
		}
		anIntArray349 = new int[64];
		local1.glGenTextures(64, anIntArray349, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static251.method3892(anIntArray349[local65]);
			aByteBuffer13.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer13);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static239.anInt4728 += aByteBuffer13.limit() * 2;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
	public static void method3406() {
		@Pc(11) byte[] local11;
		if (aByteBuffer12 == null) {
			@Pc(5) Class23_Sub2_Sub1 local5 = new Class23_Sub2_Sub1();
			local11 = local5.method2510();
			aByteBuffer12 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer12.position(0);
			aByteBuffer12.put(local11);
			aByteBuffer12.flip();
		}
		if (aByteBuffer13 != null) {
			return;
		}
		@Pc(32) Class23_Sub1_Sub1 local32 = new Class23_Sub1_Sub1();
		local11 = local32.method1938();
		aByteBuffer13 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer13.position(0);
		aByteBuffer13.put(local11);
		aByteBuffer13.flip();
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	public static void method3408() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt4218 != -1) {
			local4 = Static251.aGL1;
			local11 = new int[] { anInt4218 };
			local4.glDeleteTextures(1, local11, 0);
			anInt4218 = -1;
			Static239.anInt4728 -= aByteBuffer12.limit() * 2;
		}
		if (anIntArray350 != null) {
			local4 = Static251.aGL1;
			local4.glDeleteTextures(64, anIntArray350, 0);
			anIntArray350 = null;
			Static239.anInt4728 -= aByteBuffer12.limit() * 2;
		}
		if (anInt4219 != -1) {
			local4 = Static251.aGL1;
			local11 = new int[] { anInt4219 };
			local4.glDeleteTextures(1, local11, 0);
			anInt4219 = -1;
			Static239.anInt4728 -= aByteBuffer13.limit() * 2;
		}
		if (anIntArray349 != null) {
			local4 = Static251.aGL1;
			local4.glDeleteTextures(64, anIntArray349, 0);
			anIntArray349 = null;
			Static239.anInt4728 -= aByteBuffer13.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "()V")
	private static void method3409() {
		@Pc(1) GL local1 = Static251.aGL1;
		if (aBoolean262) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer12.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer12);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt4218 = local6[0];
			Static239.anInt4728 += aByteBuffer12.limit() * 2;
			return;
		}
		anIntArray350 = new int[64];
		local1.glGenTextures(64, anIntArray350, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static251.method3892(anIntArray350[local65]);
			aByteBuffer12.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer12);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static239.anInt4728 += aByteBuffer12.limit() * 2;
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "()V")
	public static void method3410() {
		aBoolean262 = Static251.aBoolean329;
		method3406();
		method3409();
		method3405();
	}
}
