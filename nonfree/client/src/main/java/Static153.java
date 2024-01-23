import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
	public static boolean aBoolean229;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "I")
	public static int anInt3140 = -1;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt3141 = -1;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
	public static int[] anIntArray251 = null;

	@OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
	public static int[] anIntArray252 = null;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	private static void method2502() {
		@Pc(1) GL local1 = Static291.aGL1;
		if (aBoolean229) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer8.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer8);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt3141 = local6[0];
			Static74.anInt1418 += aByteBuffer8.limit() * 2;
			return;
		}
		anIntArray252 = new int[64];
		local1.glGenTextures(64, anIntArray252, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static291.method4310(anIntArray252[local65]);
			aByteBuffer8.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer8);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static74.anInt1418 += aByteBuffer8.limit() * 2;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	public static void method2503() {
		aBoolean229 = Static291.aBoolean396;
		method2504();
		method2505();
		method2502();
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	public static void method2504() {
		@Pc(11) byte[] local11;
		if (aByteBuffer9 == null) {
			@Pc(5) Class75_Sub2_Sub1 local5 = new Class75_Sub2_Sub1();
			local11 = local5.method1901();
			aByteBuffer9 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer9.position(0);
			aByteBuffer9.put(local11);
			aByteBuffer9.flip();
		}
		if (aByteBuffer8 != null) {
			return;
		}
		@Pc(32) Class75_Sub1_Sub1 local32 = new Class75_Sub1_Sub1();
		local11 = local32.method1747();
		aByteBuffer8 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer8.position(0);
		aByteBuffer8.put(local11);
		aByteBuffer8.flip();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
	private static void method2505() {
		@Pc(1) GL local1 = Static291.aGL1;
		if (aBoolean229) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer9.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer9);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt3140 = local6[0];
			Static74.anInt1418 += aByteBuffer9.limit() * 2;
			return;
		}
		anIntArray251 = new int[64];
		local1.glGenTextures(64, anIntArray251, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static291.method4310(anIntArray251[local65]);
			aByteBuffer9.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer9);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static74.anInt1418 += aByteBuffer9.limit() * 2;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "()V")
	public static void method2507() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt3140 != -1) {
			local4 = Static291.aGL1;
			local11 = new int[] { anInt3140 };
			local4.glDeleteTextures(1, local11, 0);
			anInt3140 = -1;
			Static74.anInt1418 -= aByteBuffer9.limit() * 2;
		}
		if (anIntArray251 != null) {
			local4 = Static291.aGL1;
			local4.glDeleteTextures(64, anIntArray251, 0);
			anIntArray251 = null;
			Static74.anInt1418 -= aByteBuffer9.limit() * 2;
		}
		if (anInt3141 != -1) {
			local4 = Static291.aGL1;
			local11 = new int[] { anInt3141 };
			local4.glDeleteTextures(1, local11, 0);
			anInt3141 = -1;
			Static74.anInt1418 -= aByteBuffer8.limit() * 2;
		}
		if (anIntArray252 != null) {
			local4 = Static291.aGL1;
			local4.glDeleteTextures(64, anIntArray252, 0);
			anIntArray252 = null;
			Static74.anInt1418 -= aByteBuffer8.limit() * 2;
		}
	}
}
