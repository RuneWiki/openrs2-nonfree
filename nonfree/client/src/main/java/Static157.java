import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt3127 = 3553;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public static int anInt3128 = 34037;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	public static int anInt3129 = 6407;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public static int anInt3130 = 6408;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public static int anInt3131 = 32993;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public static int anInt3132 = 34843;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public static int anInt3133 = 34842;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "I")
	public static int anInt3134 = 34837;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public static int anInt3135 = 34836;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public static int anInt3136 = 6406;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public static int anInt3137 = 6402;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	public static int anInt3138 = 9729;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public static int anInt3139 = 9728;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public static int anInt3140 = 5126;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	public static int anInt3141 = 5121;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "[I")
	private static int[] anIntArray269 = new int[1];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III[B)I")
	public static int method2693(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method2696(anInt3127, arg0, 128, 128, anInt3138, anInt3138, arg0, anInt3141, arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "()I")
	public static int method2694() {
		Static71.aGL1.glGenTextures(1, anIntArray269, 0);
		return anIntArray269[0];
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method2695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2697(anInt3127, arg0, arg1, arg2, anInt3129, anInt3141, null);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method2696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static71.aGL1;
		@Pc(3) int local3 = method2694();
		if (arg0 == 3553) {
			Static71.method1400(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method2697(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIII[B)V")
	public static void method2697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static71.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)I")
	public static int method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method2696(anInt3127, arg0, arg1, arg2, anInt3138, anInt3138, arg0, anInt3141, null);
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(III)V")
	public static void method2700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2697(anInt3128, arg0, arg1, arg2, anInt3129, anInt3141, null);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method2701(@OriginalArg(0) int arg0) {
		anIntArray269[0] = arg0;
		Static71.aGL1.glDeleteTextures(1, anIntArray269, 0);
	}
}
