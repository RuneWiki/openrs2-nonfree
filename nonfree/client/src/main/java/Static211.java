import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public static int anInt4135 = 3553;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public static int anInt4136 = 34037;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public static int anInt4137 = 6407;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public static int anInt4138 = 6408;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public static int anInt4139 = 32993;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public static int anInt4140 = 34843;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
	public static int anInt4141 = 34842;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public static int anInt4142 = 34837;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public static int anInt4143 = 34836;

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
	public static int anInt4144 = 6406;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt4145 = 6402;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public static int anInt4146 = 9729;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	public static int anInt4147 = 9728;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public static int anInt4148 = 5126;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
	public static int anInt4149 = 5121;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "[I")
	private static int[] anIntArray458 = new int[1];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[B)I")
	public static int method3476(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method3481(anInt4135, arg0, 128, 128, anInt4146, anInt4146, arg0, anInt4149, arg1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII[B)V")
	public static void method3477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static283.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
	public static int method3478() {
		Static283.aGL1.glGenTextures(1, anIntArray458, 0);
		return anIntArray458[0];
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public static void method3480(@OriginalArg(0) int arg0) {
		anIntArray458[0] = arg0;
		Static283.aGL1.glDeleteTextures(1, anIntArray458, 0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method3481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static283.aGL1;
		@Pc(3) int local3 = method3478();
		if (arg0 == 3553) {
			Static283.method4636(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method3477(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	public static void method3482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method3477(anInt4136, arg0, arg1, arg2, anInt4137, anInt4149, null);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)V")
	public static void method3483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method3477(anInt4135, arg0, arg1, arg2, anInt4137, anInt4149, null);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)I")
	public static int method3484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method3481(anInt4135, arg0, arg1, arg2, anInt4146, anInt4146, arg0, anInt4149, null);
	}
}
