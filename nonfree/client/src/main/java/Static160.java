import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	public static int anInt3367 = 3553;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	public static int anInt3368 = 34037;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public static int anInt3369 = 6407;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt3370 = 6408;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	public static int anInt3371 = 32993;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public static int anInt3372 = 34843;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	public static int anInt3373 = 34842;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public static int anInt3374 = 34837;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	public static int anInt3375 = 34836;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	public static int anInt3376 = 6406;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	public static int anInt3377 = 6402;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	public static int anInt3378 = 9729;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	public static int anInt3379 = 9728;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	public static int anInt3380 = 5126;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
	public static int anInt3381 = 5121;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "[I")
	private static int[] anIntArray271 = new int[1];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III[B)I")
	public static int method2698(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method2701(anInt3367, arg0, 128, 128, anInt3378, anInt3378, arg0, anInt3381, arg1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public static void method2699(@OriginalArg(0) int arg0) {
		anIntArray271[0] = arg0;
		Static291.aGL1.glDeleteTextures(1, anIntArray271, 0);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I")
	public static int method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method2701(anInt3367, arg0, arg1, arg2, anInt3378, anInt3378, arg0, anInt3381, null);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method2701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static291.aGL1;
		@Pc(3) int local3 = method2704();
		if (arg0 == 3553) {
			Static291.method4310(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method2702(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIII[B)V")
	public static void method2702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static291.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)V")
	public static void method2703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2702(anInt3368, arg0, arg1, arg2, anInt3369, anInt3381, null);
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "()I")
	public static int method2704() {
		Static291.aGL1.glGenTextures(1, anIntArray271, 0);
		return anIntArray271[0];
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(III)V")
	public static void method2705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2702(anInt3367, arg0, arg1, arg2, anInt3369, anInt3381, null);
	}
}
