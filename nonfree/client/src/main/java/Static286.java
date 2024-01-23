import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer9;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
	private static ByteBuffer aByteBuffer10;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Z")
	public static boolean aBoolean372;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	public static int anInt5648 = -1;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public static int anInt5649 = -1;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "[I")
	public static int[] anIntArray538 = null;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "[I")
	public static int[] anIntArray539 = null;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
	public static void method4453() {
		aBoolean372 = Static116.aBoolean183;
		method4458();
		method4456();
		method4455();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "()V")
	public static void method4454() {
		@Pc(4) GL local4;
		@Pc(11) int[] local11;
		if (anInt5648 != -1) {
			local4 = Static116.aGL1;
			local11 = new int[] { anInt5648 };
			local4.glDeleteTextures(1, local11, 0);
			anInt5648 = -1;
			Static124.anInt2872 -= aByteBuffer10.limit() * 2;
		}
		if (anIntArray539 != null) {
			local4 = Static116.aGL1;
			local4.glDeleteTextures(64, anIntArray539, 0);
			anIntArray539 = null;
			Static124.anInt2872 -= aByteBuffer10.limit() * 2;
		}
		if (anInt5649 != -1) {
			local4 = Static116.aGL1;
			local11 = new int[] { anInt5649 };
			local4.glDeleteTextures(1, local11, 0);
			anInt5649 = -1;
			Static124.anInt2872 -= aByteBuffer9.limit() * 2;
		}
		if (anIntArray538 != null) {
			local4 = Static116.aGL1;
			local4.glDeleteTextures(64, anIntArray538, 0);
			anIntArray538 = null;
			Static124.anInt2872 -= aByteBuffer9.limit() * 2;
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "()V")
	private static void method4455() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (aBoolean372) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer9.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer9);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt5649 = local6[0];
			Static124.anInt2872 += aByteBuffer9.limit() * 2;
			return;
		}
		anIntArray538 = new int[64];
		local1.glGenTextures(64, anIntArray538, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static116.method1945(anIntArray538[local65]);
			aByteBuffer9.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer9);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static124.anInt2872 += aByteBuffer9.limit() * 2;
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "()V")
	private static void method4456() {
		@Pc(1) GL local1 = Static116.aGL1;
		if (aBoolean372) {
			@Pc(6) int[] local6 = new int[1];
			local1.glGenTextures(1, local6, 0);
			local1.glBindTexture(32879, local6[0]);
			aByteBuffer10.position(0);
			local1.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer10);
			local1.glTexParameteri(32879, 10241, 9729);
			local1.glTexParameteri(32879, 10240, 9729);
			anInt5648 = local6[0];
			Static124.anInt2872 += aByteBuffer10.limit() * 2;
			return;
		}
		anIntArray539 = new int[64];
		local1.glGenTextures(64, anIntArray539, 0);
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static116.method1945(anIntArray539[local65]);
			aByteBuffer10.position(local65 * 64 * 64 * 2);
			local1.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer10);
			local1.glTexParameteri(3553, 10241, 9729);
			local1.glTexParameteri(3553, 10240, 9729);
		}
		Static124.anInt2872 += aByteBuffer10.limit() * 2;
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "()V")
	public static void method4458() {
		@Pc(11) byte[] local11;
		if (aByteBuffer10 == null) {
			@Pc(5) Class77_Sub2_Sub1 local5 = new Class77_Sub2_Sub1();
			local11 = local5.method4085();
			aByteBuffer10 = ByteBuffer.allocateDirect(local11.length);
			aByteBuffer10.position(0);
			aByteBuffer10.put(local11);
			aByteBuffer10.flip();
		}
		if (aByteBuffer9 != null) {
			return;
		}
		@Pc(32) Class77_Sub1_Sub1 local32 = new Class77_Sub1_Sub1();
		local11 = local32.method4716();
		aByteBuffer9 = ByteBuffer.allocateDirect(local11.length);
		aByteBuffer9.position(0);
		aByteBuffer9.put(local11);
		aByteBuffer9.flip();
	}
}
