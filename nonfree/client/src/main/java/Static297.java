import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public static int anInt6216 = 3553;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public static int anInt6217 = 34037;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	public static int anInt6218 = 6407;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public static int anInt6219 = 6408;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	public static int anInt6220 = 32993;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public static int anInt6221 = 34843;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	public static int anInt6222 = 34842;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	public static int anInt6223 = 34837;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public static int anInt6224 = 34836;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public static int anInt6225 = 6406;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	public static int anInt6226 = 6402;

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
	public static int anInt6227 = 9729;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public static int anInt6228 = 9728;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	public static int anInt6229 = 5126;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public static int anInt6230 = 5121;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
	private static int[] anIntArray621 = new int[1];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method4842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static296.aGL1;
		@Pc(3) int local3 = method4847();
		if (arg0 == 3553) {
			Static296.method4812(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method4846(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method4843(@OriginalArg(0) int arg0) {
		anIntArray621[0] = arg0;
		Static296.aGL1.glDeleteTextures(1, anIntArray621, 0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
	public static void method4844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4846(anInt6216, arg0, arg1, arg2, anInt6218, anInt6230, null);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)V")
	public static void method4845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4846(anInt6217, arg0, arg1, arg2, anInt6218, anInt6230, null);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII[B)V")
	public static void method4846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static296.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()I")
	public static int method4847() {
		Static296.aGL1.glGenTextures(1, anIntArray621, 0);
		return anIntArray621[0];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III[B)I")
	public static int method4849(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method4842(anInt6216, arg0, 128, 128, anInt6227, anInt6227, arg0, anInt6230, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(III)I")
	public static int method4850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method4842(anInt6216, arg0, arg1, arg2, anInt6227, anInt6227, arg0, anInt6230, null);
	}
}
