import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
	public static boolean aBoolean429;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer12;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer13;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
	public static int[] anIntArray513 = null;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
	public static int[] anIntArray514 = null;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt4615 = -1;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt4616 = -1;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	private static void method3922() {
		@Pc(1) GL local1 = Static71.aGL1;
		if (aBoolean429) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer13.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer13);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt4615 = local6[0];
			Static162.anInt3246 += aByteBuffer13.limit() * 2;
			return;
		}
		anIntArray514 = new int[64];
		local1.glGenTextures(64, anIntArray514, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static71.method1400(anIntArray514[local65]);
			aByteBuffer13.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer13);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static162.anInt3246 += aByteBuffer13.limit() * 2;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	public static void method3923() {
		aBoolean429 = Static71.aBoolean164;
		method3926();
		method3925();
		method3922();
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
	private static void method3925() {
		@Pc(1) GL local1 = Static71.aGL1;
		if (aBoolean429) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer12.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer12);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt4616 = local6[0];
			Static162.anInt3246 += aByteBuffer12.limit() * 2;
			return;
		}
		anIntArray513 = new int[64];
		local1.glGenTextures(64, anIntArray513, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static71.method1400(anIntArray513[local65]);
			aByteBuffer12.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer12);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static162.anInt3246 += aByteBuffer12.limit() * 2;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "()V")
	public static void method3926() {
		@Pc(11) byte[] local11;
		if (aByteBuffer12 == null) {
			@Pc(5) Class26_Sub1_Sub1 local5 = new Class26_Sub1_Sub1();
			local11 = local5.method721();
			aByteBuffer12 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer12.position(0);
			aByteBuffer12.put(local11);
			aByteBuffer12.flip();
		}
		if (aByteBuffer13 != null) {
			return;
		}
		@Pc(32) Class26_Sub2_Sub1 local32 = new Class26_Sub2_Sub1();
		local11 = local32.method4622();
		aByteBuffer13 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer13.position(0);
		aByteBuffer13.put(local11);
		aByteBuffer13.flip();
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "()V")
	public static void method3927() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt4616 != -1) {
			local4 = Static71.aGL1;
			local11 = new int[] { anInt4616 };
			local4.glDeleteTextures(1, local11, 0);
			anInt4616 = -1;
			Static162.anInt3246 -= aByteBuffer12.limit() * 2;
		}
		if (anIntArray513 != null) {
			local4 = Static71.aGL1;
			local4.glDeleteTextures(64, anIntArray513, 0);
			anIntArray513 = null;
			Static162.anInt3246 -= aByteBuffer12.limit() * 2;
		}
		if (anInt4615 != -1) {
			local4 = Static71.aGL1;
			local11 = new int[] { anInt4615 };
			local4.glDeleteTextures(1, local11, 0);
			anInt4615 = -1;
			Static162.anInt3246 -= aByteBuffer13.limit() * 2;
		}
		if (anIntArray514 != null) {
			local4 = Static71.aGL1;
			local4.glDeleteTextures(64, anIntArray514, 0);
			anIntArray514 = null;
			Static162.anInt3246 -= aByteBuffer13.limit() * 2;
		}
	}
}
