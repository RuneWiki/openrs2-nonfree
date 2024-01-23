import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	public static int anInt5134 = 3553;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public static int anInt5135 = 34037;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public static int anInt5136 = 6407;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public static int anInt5137 = 6408;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "I")
	public static int anInt5138 = 32993;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public static int anInt5139 = 34843;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	public static int anInt5140 = 34842;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "I")
	public static int anInt5141 = 34837;

	@OriginalMember(owner = "client!th", name = "i", descriptor = "I")
	public static int anInt5142 = 34836;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "I")
	public static int anInt5143 = 6406;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "I")
	public static int anInt5144 = 6402;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static int anInt5145 = 9729;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "I")
	public static int anInt5146 = 9728;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "I")
	public static int anInt5147 = 5126;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "I")
	public static int anInt5148 = 5121;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "[I")
	private static int[] anIntArray555 = new int[1];

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII[B)V")
	public static void method4203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static94.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	public static void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4203(anInt5135, arg0, arg1, arg2, anInt5136, anInt5148, null);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method4205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static94.aGL1;
		@Pc(3) int local3 = method4209();
		if (arg0 == 3553) {
			Static94.method1600(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method4203(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	public static void method4206(@OriginalArg(0) int arg0) {
		anIntArray555[0] = arg0;
		Static94.aGL1.glDeleteTextures(1, anIntArray555, 0);
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(III)V")
	public static void method4207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method4203(anInt5134, arg0, arg1, arg2, anInt5136, anInt5148, null);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(III)I")
	public static int method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method4205(anInt5134, arg0, arg1, arg2, anInt5145, anInt5145, arg0, anInt5148, null);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "()I")
	public static int method4209() {
		Static94.aGL1.glGenTextures(1, anIntArray555, 0);
		return anIntArray555[0];
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III[B)I")
	public static int method4210(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method4205(anInt5134, arg0, 128, 128, anInt5145, anInt5145, arg0, anInt5148, arg1);
	}
}
