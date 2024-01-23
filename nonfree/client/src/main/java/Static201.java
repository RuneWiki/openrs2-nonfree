import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt4366 = 3553;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt4367 = 34037;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt4368 = 6407;

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static int anInt4369 = 6408;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	public static int anInt4370 = 32993;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	public static int anInt4371 = 34843;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	public static int anInt4372 = 34842;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	public static int anInt4373 = 34837;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	public static int anInt4374 = 34836;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt4375 = 6406;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	public static int anInt4376 = 6402;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	public static int anInt4377 = 9729;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
	public static int anInt4378 = 9728;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	public static int anInt4379 = 5126;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	public static int anInt4380 = 5121;

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "[I")
	private static int[] anIntArray391 = new int[1];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	public static void method3206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method3214(anInt4367, arg0, arg1, arg2, anInt4368, anInt4380, null);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[B)I")
	public static int method3207(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method3211(anInt4366, arg0, 128, 128, anInt4377, anInt4377, arg0, anInt4380, arg1);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)V")
	public static void method3208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method3214(anInt4366, arg0, arg1, arg2, anInt4368, anInt4380, null);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
	public static void method3210(@OriginalArg(0) int arg0) {
		anIntArray391[0] = arg0;
		Static294.aGL1.glDeleteTextures(1, anIntArray391, 0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method3211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static294.aGL1;
		@Pc(3) int local3 = method3212();
		if (arg0 == 3553) {
			Static294.method4486(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method3214(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "()I")
	public static int method3212() {
		Static294.aGL1.glGenTextures(1, anIntArray391, 0);
		return anIntArray391[0];
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(III)I")
	public static int method3213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method3211(anInt4366, arg0, arg1, arg2, anInt4377, anInt4377, arg0, anInt4380, null);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII[B)V")
	public static void method3214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static294.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}
}
