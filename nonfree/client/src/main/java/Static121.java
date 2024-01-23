import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	public static int anInt2511 = 3553;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "I")
	public static int anInt2512 = 34037;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "I")
	public static int anInt2513 = 6407;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	public static int anInt2514 = 6408;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public static int anInt2515 = 32993;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	public static int anInt2516 = 34843;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "I")
	public static int anInt2517 = 34842;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "I")
	public static int anInt2518 = 34837;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "I")
	public static int anInt2519 = 34836;

	@OriginalMember(owner = "client!il", name = "j", descriptor = "I")
	public static int anInt2520 = 6406;

	@OriginalMember(owner = "client!il", name = "k", descriptor = "I")
	public static int anInt2521 = 6402;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "I")
	public static int anInt2522 = 9729;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "I")
	public static int anInt2523 = 9728;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "I")
	public static int anInt2524 = 5126;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public static int anInt2525 = 5121;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "[I")
	private static int[] anIntArray217 = new int[1];

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III[B)I")
	public static int method2153(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method2155(anInt2511, arg0, 128, 128, anInt2522, anInt2522, arg0, anInt2525, arg1);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII[B)V")
	public static void method2154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static156.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method2155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static156.aGL1;
		@Pc(3) int local3 = method2159();
		if (arg0 == 3553) {
			Static156.method2699(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method2154(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
	public static void method2156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2154(anInt2511, arg0, arg1, arg2, anInt2513, anInt2525, null);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
	public static void method2157(@OriginalArg(0) int arg0) {
		anIntArray217[0] = arg0;
		Static156.aGL1.glDeleteTextures(1, anIntArray217, 0);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(III)I")
	public static int method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method2155(anInt2511, arg0, arg1, arg2, anInt2522, anInt2522, arg0, anInt2525, null);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()I")
	public static int method2159() {
		Static156.aGL1.glGenTextures(1, anIntArray217, 0);
		return anIntArray217[0];
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(III)V")
	public static void method2160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2154(anInt2512, arg0, arg1, arg2, anInt2513, anInt2525, null);
	}
}
