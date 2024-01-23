import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer3;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Z")
	public static boolean aBoolean95;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
	public static int anInt1757 = -1;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public static int anInt1758 = -1;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "[I")
	public static int[] anIntArray181 = null;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
	public static int[] anIntArray182 = null;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
	private static void method1304() {
		@Pc(1) GL local1 = Static296.aGL1;
		if (aBoolean95) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer4.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer4);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt1757 = local6[0];
			Static237.anInt5215 += aByteBuffer4.limit() * 2;
			return;
		}
		anIntArray181 = new int[64];
		local1.glGenTextures(64, anIntArray181, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static296.method4812(anIntArray181[local65]);
			aByteBuffer4.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer4);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static237.anInt5215 += aByteBuffer4.limit() * 2;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "()V")
	public static void method1305() {
		@Pc(11) byte[] local11;
		if (aByteBuffer4 == null) {
			@Pc(5) Class13_Sub2_Sub1 local5 = new Class13_Sub2_Sub1();
			local11 = local5.method2243();
			aByteBuffer4 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer4.position(0);
			aByteBuffer4.put(local11);
			aByteBuffer4.flip();
		}
		if (aByteBuffer3 != null) {
			return;
		}
		@Pc(32) Class13_Sub1_Sub1 local32 = new Class13_Sub1_Sub1();
		local11 = local32.method1453();
		aByteBuffer3 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer3.position(0);
		aByteBuffer3.put(local11);
		aByteBuffer3.flip();
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
	public static void method1306() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt1757 != -1) {
			local4 = Static296.aGL1;
			local11 = new int[] { anInt1757 };
			local4.glDeleteTextures(1, local11, 0);
			anInt1757 = -1;
			Static237.anInt5215 -= aByteBuffer4.limit() * 2;
		}
		if (anIntArray181 != null) {
			local4 = Static296.aGL1;
			local4.glDeleteTextures(64, anIntArray181, 0);
			anIntArray181 = null;
			Static237.anInt5215 -= aByteBuffer4.limit() * 2;
		}
		if (anInt1758 != -1) {
			local4 = Static296.aGL1;
			local11 = new int[] { anInt1758 };
			local4.glDeleteTextures(1, local11, 0);
			anInt1758 = -1;
			Static237.anInt5215 -= aByteBuffer3.limit() * 2;
		}
		if (anIntArray182 != null) {
			local4 = Static296.aGL1;
			local4.glDeleteTextures(64, anIntArray182, 0);
			anIntArray182 = null;
			Static237.anInt5215 -= aByteBuffer3.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()V")
	public static void method1307() {
		aBoolean95 = Static296.aBoolean339;
		method1305();
		method1304();
		method1309();
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "()V")
	private static void method1309() {
		@Pc(1) GL local1 = Static296.aGL1;
		if (aBoolean95) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer3.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt1758 = local6[0];
			Static237.anInt5215 += aByteBuffer3.limit() * 2;
			return;
		}
		anIntArray182 = new int[64];
		local1.glGenTextures(64, anIntArray182, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static296.method4812(anIntArray182[local65]);
			aByteBuffer3.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer3);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static237.anInt5215 += aByteBuffer3.limit() * 2;
	}
}
