import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	public static int anInt5768 = 3553;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public static int anInt5769 = 34037;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
	public static int anInt5770 = 6407;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
	public static int anInt5771 = 6408;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public static int anInt5772 = 32993;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	public static int anInt5773 = 34843;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public static int anInt5774 = 34842;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	public static int anInt5775 = 34837;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public static int anInt5776 = 34836;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public static int anInt5777 = 6406;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	public static int anInt5778 = 6402;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
	public static int anInt5779 = 9729;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
	public static int anInt5780 = 9728;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	public static int anInt5781 = 5126;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
	public static int anInt5782 = 5121;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "[I")
	private static int[] anIntArray565 = new int[1];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
	public static void method4548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4552(anInt5769, arg0, arg1, arg2, anInt5770, anInt5782, null);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)V")
	public static void method4550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4552(anInt5768, arg0, arg1, arg2, anInt5770, anInt5782, null);
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)I")
	public static int method4551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method4554(anInt5768, arg0, arg1, arg2, anInt5779, anInt5779, arg0, anInt5782, null);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII[B)V")
	public static void method4552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static116.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "()I")
	public static int method4553() {
		Static116.aGL1.glGenTextures(1, anIntArray565, 0);
		return anIntArray565[0];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method4554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static116.aGL1;
		@Pc(3) int local3 = method4553();
		if (arg0 == 3553) {
			Static116.method1945(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method4552(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)I")
	public static int method4555(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method4554(anInt5768, arg0, 128, 128, anInt5779, anInt5779, arg0, anInt5782, arg1);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method4556(@OriginalArg(0) int arg0) {
		anIntArray565[0] = arg0;
		Static116.aGL1.glDeleteTextures(1, anIntArray565, 0);
	}
}
