import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "Z")
	public static boolean aBoolean247;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
	public static int[] anIntArray320 = null;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static int anInt3819 = -1;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public static int anInt3820 = -1;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "[I")
	public static int[] anIntArray321 = null;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "()V")
	public static void method3028() {
		@Pc(11) byte[] local11;
		if (aByteBuffer8 == null) {
			@Pc(5) Class120_Sub1_Sub1 local5 = new Class120_Sub1_Sub1();
			local11 = local5.method2952();
			aByteBuffer8 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer8.position(0);
			aByteBuffer8.put(local11);
			aByteBuffer8.flip();
		}
		if (aByteBuffer7 != null) {
			return;
		}
		@Pc(32) Class120_Sub2_Sub1 local32 = new Class120_Sub2_Sub1();
		local11 = local32.method4269();
		aByteBuffer7 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer7.position(0);
		aByteBuffer7.put(local11);
		aByteBuffer7.flip();
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "()V")
	public static void method3029() {
		anIntArray320 = null;
		anIntArray321 = null;
		aByteBuffer8 = null;
		aByteBuffer7 = null;
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "()V")
	public static void method3030() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt3820 != -1) {
			local4 = Static178.aGL1;
			local11 = new int[] { anInt3820 };
			local4.glDeleteTextures(1, local11, 0);
			anInt3820 = -1;
			Static163.anInt3221 -= aByteBuffer8.limit() * 2;
		}
		if (anIntArray320 != null) {
			local4 = Static178.aGL1;
			local4.glDeleteTextures(64, anIntArray320, 0);
			anIntArray320 = null;
			Static163.anInt3221 -= aByteBuffer8.limit() * 2;
		}
		if (anInt3819 != -1) {
			local4 = Static178.aGL1;
			local11 = new int[] { anInt3819 };
			local4.glDeleteTextures(1, local11, 0);
			anInt3819 = -1;
			Static163.anInt3221 -= aByteBuffer7.limit() * 2;
		}
		if (anIntArray321 != null) {
			local4 = Static178.aGL1;
			local4.glDeleteTextures(64, anIntArray321, 0);
			anIntArray321 = null;
			Static163.anInt3221 -= aByteBuffer7.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "()V")
	private static void method3031() {
		@Pc(1) GL local1 = Static178.aGL1;
		if (aBoolean247) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer8.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer8);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt3820 = local6[0];
			Static163.anInt3221 += aByteBuffer8.limit() * 2;
			return;
		}
		anIntArray320 = new int[64];
		local1.glGenTextures(64, anIntArray320, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static178.method2763(anIntArray320[local65]);
			aByteBuffer8.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer8);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static163.anInt3221 += aByteBuffer8.limit() * 2;
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "()V")
	private static void method3032() {
		@Pc(1) GL local1 = Static178.aGL1;
		if (aBoolean247) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer7.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer7);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt3819 = local6[0];
			Static163.anInt3221 += aByteBuffer7.limit() * 2;
			return;
		}
		anIntArray321 = new int[64];
		local1.glGenTextures(64, anIntArray321, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static178.method2763(anIntArray321[local65]);
			aByteBuffer7.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer7);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static163.anInt3221 += aByteBuffer7.limit() * 2;
	}

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "()V")
	public static void method3033() {
		aBoolean247 = Static178.aBoolean229;
		method3028();
		method3031();
		method3032();
	}
}
