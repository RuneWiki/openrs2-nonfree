import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt4839 = 3553;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public static int anInt4840 = 34037;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	public static int anInt4841 = 6407;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
	public static int anInt4842 = 6408;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	public static int anInt4843 = 32993;

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
	public static int anInt4844 = 34843;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
	public static int anInt4845 = 34842;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
	public static int anInt4846 = 34837;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public static int anInt4847 = 34836;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
	public static int anInt4848 = 6406;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
	public static int anInt4849 = 6402;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
	public static int anInt4850 = 9729;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public static int anInt4851 = 9728;

	@OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
	public static int anInt4852 = 5126;

	@OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
	public static int anInt4853 = 5121;

	@OriginalMember(owner = "client!rj", name = "p", descriptor = "[I")
	private static int[] anIntArray569 = new int[1];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	public static void method3694(@OriginalArg(0) int arg0) {
		anIntArray569[0] = arg0;
		Static240.aGL1.glDeleteTextures(1, anIntArray569, 0);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
	public static void method3695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method3700(anInt4840, arg0, arg1, arg2, anInt4841, anInt4853, null);
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)I")
	public static int method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method3697(anInt4839, arg0, arg1, arg2, anInt4850, anInt4850, arg0, anInt4853, null);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method3697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static240.aGL1;
		@Pc(3) int local3 = method3699();
		if (arg0 == 3553) {
			Static240.method3789(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method3700(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(III[B)I")
	public static int method3698(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method3697(anInt4839, arg0, 128, 128, anInt4850, anInt4850, arg0, anInt4853, arg1);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "()I")
	public static int method3699() {
		Static240.aGL1.glGenTextures(1, anIntArray569, 0);
		return anIntArray569[0];
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIII[B)V")
	public static void method3700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static240.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(III)V")
	public static void method3701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method3700(anInt4839, arg0, arg1, arg2, anInt4841, anInt4853, null);
	}
}
