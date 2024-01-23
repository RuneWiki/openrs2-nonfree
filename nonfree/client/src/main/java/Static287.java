import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt5637 = 3553;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public static int anInt5638 = 34037;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt5639 = 6407;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int anInt5640 = 6408;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt5641 = 32993;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	public static int anInt5642 = 34843;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt5643 = 34842;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "I")
	public static int anInt5644 = 34837;

	@OriginalMember(owner = "client!w", name = "i", descriptor = "I")
	public static int anInt5645 = 34836;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	public static int anInt5646 = 6406;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	public static int anInt5647 = 6402;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int anInt5648 = 9729;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public static int anInt5649 = 9728;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	public static int anInt5650 = 5126;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	public static int anInt5651 = 5121;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
	private static int[] anIntArray494 = new int[1];

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III[B)I")
	public static int method4252(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method4256(anInt5637, arg0, 128, 128, anInt5648, anInt5648, arg0, anInt5651, arg1);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public static void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4257(anInt5638, arg0, arg1, arg2, anInt5639, anInt5651, null);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(III)I")
	public static int method4254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method4256(anInt5637, arg0, arg1, arg2, anInt5648, anInt5648, arg0, anInt5651, null);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method4255(@OriginalArg(0) int arg0) {
		anIntArray494[0] = arg0;
		Static116.aGL1.glDeleteTextures(1, anIntArray494, 0);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method4256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(3) int local3 = method4259();
		if (arg0 == 3553) {
			Static116.method1897(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method4257(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII[B)V")
	public static void method4257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static116.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()I")
	public static int method4259() {
		Static116.aGL1.glGenTextures(1, anIntArray494, 0);
		return anIntArray494[0];
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(III)V")
	public static void method4260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4257(anInt5637, arg0, arg1, arg2, anInt5639, anInt5651, null);
	}
}
