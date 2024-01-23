import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
	public static boolean aBoolean53;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public static int anInt651 = -1;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	public static int[] anIntArray73 = null;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "[I")
	public static int[] anIntArray74 = null;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public static int anInt652 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	public static void method547() {
		@Pc(11) byte[] local11;
		if (aByteBuffer3 == null) {
			@Pc(5) Class24_Sub2_Sub1 local5 = new Class24_Sub2_Sub1();
			local11 = local5.method3205();
			aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer3.position(0);
			aByteBuffer3.put(local11);
			aByteBuffer3.flip();
		}
		if (aByteBuffer2 != null) {
			return;
		}
		@Pc(32) Class24_Sub1_Sub1 local32 = new Class24_Sub1_Sub1();
		local11 = local32.method819();
		aByteBuffer2 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer2.position(0);
		aByteBuffer2.put(local11);
		aByteBuffer2.flip();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
	public static void method548() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt652 != -1) {
			local4 = Static277.aGL1;
			local11 = new int[] { anInt652 };
			local4.glDeleteTextures(1, local11, 0);
			anInt652 = -1;
			Static94.anInt2206 -= aByteBuffer3.limit() * 2;
		}
		if (anIntArray73 != null) {
			local4 = Static277.aGL1;
			local4.glDeleteTextures(64, anIntArray73, 0);
			anIntArray73 = null;
			Static94.anInt2206 -= aByteBuffer3.limit() * 2;
		}
		if (anInt651 != -1) {
			local4 = Static277.aGL1;
			local11 = new int[] { anInt651 };
			local4.glDeleteTextures(1, local11, 0);
			anInt651 = -1;
			Static94.anInt2206 -= aByteBuffer2.limit() * 2;
		}
		if (anIntArray74 != null) {
			local4 = Static277.aGL1;
			local4.glDeleteTextures(64, anIntArray74, 0);
			anIntArray74 = null;
			Static94.anInt2206 -= aByteBuffer2.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()V")
	private static void method549() {
		@Pc(1) GL local1 = Static277.aGL1;
		if (aBoolean53) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer2.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt651 = local6[0];
			Static94.anInt2206 += aByteBuffer2.limit() * 2;
			return;
		}
		anIntArray74 = new int[64];
		local1.glGenTextures(64, anIntArray74, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static277.method4212(anIntArray74[local65]);
			aByteBuffer2.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static94.anInt2206 += aByteBuffer2.limit() * 2;
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "()V")
	private static void method551() {
		@Pc(1) GL local1 = Static277.aGL1;
		if (aBoolean53) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer3.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt652 = local6[0];
			Static94.anInt2206 += aByteBuffer3.limit() * 2;
			return;
		}
		anIntArray73 = new int[64];
		local1.glGenTextures(64, anIntArray73, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static277.method4212(anIntArray73[local65]);
			aByteBuffer3.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static94.anInt2206 += aByteBuffer3.limit() * 2;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "()V")
	public static void method552() {
		aBoolean53 = Static277.aBoolean416;
		method547();
		method551();
		method549();
	}
}
