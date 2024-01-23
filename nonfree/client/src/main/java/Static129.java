import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Z")
	public static boolean aBoolean216;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "[I")
	public static int[] anIntArray207 = null;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	public static int anInt2585 = -1;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "[I")
	public static int[] anIntArray208 = null;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public static int anInt2586 = -1;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "()V")
	public static void method2080() {
		aBoolean216 = Static116.aBoolean198;
		method2085();
		method2084();
		method2083();
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "()V")
	public static void method2082() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt2585 != -1) {
			local4 = Static116.aGL1;
			local11 = new int[] { anInt2585 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2585 = -1;
			Static166.anInt3351 -= aByteBuffer6.limit() * 2;
		}
		if (anIntArray208 != null) {
			local4 = Static116.aGL1;
			local4.glDeleteTextures(64, anIntArray208, 0);
			anIntArray208 = null;
			Static166.anInt3351 -= aByteBuffer6.limit() * 2;
		}
		if (anInt2586 != -1) {
			local4 = Static116.aGL1;
			local11 = new int[] { anInt2586 };
			local4.glDeleteTextures(1, local11, 0);
			anInt2586 = -1;
			Static166.anInt3351 -= aByteBuffer5.limit() * 2;
		}
		if (anIntArray207 != null) {
			local4 = Static116.aGL1;
			local4.glDeleteTextures(64, anIntArray207, 0);
			anIntArray207 = null;
			Static166.anInt3351 -= aByteBuffer5.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "()V")
	private static void method2083() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (aBoolean216) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer5.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer5);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2586 = local6[0];
			Static166.anInt3351 += aByteBuffer5.limit() * 2;
			return;
		}
		anIntArray207 = new int[64];
		local1.glGenTextures(64, anIntArray207, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static116.method1897(anIntArray207[local65]);
			aByteBuffer5.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer5);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static166.anInt3351 += aByteBuffer5.limit() * 2;
	}

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "()V")
	private static void method2084() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (aBoolean216) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer6.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer6);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt2585 = local6[0];
			Static166.anInt3351 += aByteBuffer6.limit() * 2;
			return;
		}
		anIntArray208 = new int[64];
		local1.glGenTextures(64, anIntArray208, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static116.method1897(anIntArray208[local65]);
			aByteBuffer6.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer6);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static166.anInt3351 += aByteBuffer6.limit() * 2;
	}

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "()V")
	public static void method2085() {
		@Pc(11) byte[] local11;
		if (aByteBuffer6 == null) {
			@Pc(5) Class31_Sub1_Sub1 local5 = new Class31_Sub1_Sub1();
			local11 = local5.method4138();
			aByteBuffer6 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer6.position(0);
			aByteBuffer6.put(local11);
			aByteBuffer6.flip();
		}
		if (aByteBuffer5 != null) {
			return;
		}
		@Pc(32) Class31_Sub2_Sub1 local32 = new Class31_Sub2_Sub1();
		local11 = local32.method2913();
		aByteBuffer5 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer5.position(0);
		aByteBuffer5.put(local11);
		aByteBuffer5.flip();
	}
}
