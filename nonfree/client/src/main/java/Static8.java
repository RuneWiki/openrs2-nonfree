import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Z")
	public static boolean aBoolean15;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
	public static int[] anIntArray13 = null;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public static int anInt172 = -1;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public static int anInt173 = -1;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
	public static int[] anIntArray14 = null;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
	public static void method136() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt173 != -1) {
			local4 = Static283.aGL1;
			local11 = new int[] { anInt173 };
			local4.glDeleteTextures(1, local11, 0);
			anInt173 = -1;
			Static189.anInt3721 -= aByteBuffer1.limit() * 2;
		}
		if (anIntArray13 != null) {
			local4 = Static283.aGL1;
			local4.glDeleteTextures(64, anIntArray13, 0);
			anIntArray13 = null;
			Static189.anInt3721 -= aByteBuffer1.limit() * 2;
		}
		if (anInt172 != -1) {
			local4 = Static283.aGL1;
			local11 = new int[] { anInt172 };
			local4.glDeleteTextures(1, local11, 0);
			anInt172 = -1;
			Static189.anInt3721 -= aByteBuffer2.limit() * 2;
		}
		if (anIntArray14 != null) {
			local4 = Static283.aGL1;
			local4.glDeleteTextures(64, anIntArray14, 0);
			anIntArray14 = null;
			Static189.anInt3721 -= aByteBuffer2.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()V")
	private static void method137() {
		@Pc(1) GL local1 = Static283.aGL1;
		if (aBoolean15) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer2.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt172 = local6[0];
			Static189.anInt3721 += aByteBuffer2.limit() * 2;
			return;
		}
		anIntArray14 = new int[64];
		local1.glGenTextures(64, anIntArray14, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static283.method4636(anIntArray14[local65]);
			aByteBuffer2.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer2);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static189.anInt3721 += aByteBuffer2.limit() * 2;
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()V")
	public static void method138() {
		aBoolean15 = Static283.aBoolean405;
		method141();
		method139();
		method137();
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()V")
	private static void method139() {
		@Pc(1) GL local1 = Static283.aGL1;
		if (aBoolean15) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer1.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer1);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt173 = local6[0];
			Static189.anInt3721 += aByteBuffer1.limit() * 2;
			return;
		}
		anIntArray13 = new int[64];
		local1.glGenTextures(64, anIntArray13, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static283.method4636(anIntArray13[local65]);
			aByteBuffer1.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer1);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static189.anInt3721 += aByteBuffer1.limit() * 2;
	}

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "()V")
	public static void method141() {
		@Pc(11) byte[] local11;
		if (aByteBuffer1 == null) {
			@Pc(5) Class8_Sub1_Sub1 local5 = new Class8_Sub1_Sub1();
			local11 = local5.method3728();
			aByteBuffer1 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer1.position(0);
			aByteBuffer1.put(local11);
			aByteBuffer1.flip();
		}
		if (aByteBuffer2 != null) {
			return;
		}
		@Pc(32) Class8_Sub2_Sub1 local32 = new Class8_Sub2_Sub1();
		local11 = local32.method4264();
		aByteBuffer2 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer2.position(0);
		aByteBuffer2.put(local11);
		aByteBuffer2.flip();
	}
}
