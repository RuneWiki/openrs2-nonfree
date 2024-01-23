import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public static int anInt2927 = 3553;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	public static int anInt2928 = 34037;

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public static int anInt2929 = 6407;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public static int anInt2930 = 6408;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	public static int anInt2931 = 32993;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public static int anInt2932 = 34843;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public static int anInt2933 = 34842;

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public static int anInt2934 = 34837;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	public static int anInt2935 = 34836;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	public static int anInt2936 = 6406;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public static int anInt2937 = 6402;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public static int anInt2938 = 9729;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public static int anInt2939 = 9728;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public static int anInt2940 = 5126;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	public static int anInt2941 = 5121;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "[I")
	private static int[] anIntArray276 = new int[1];

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III[B)I")
	public static int method2322(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method2324(anInt2927, arg0, 128, 128, anInt2938, anInt2938, arg0, anInt2941, arg1);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)I")
	public static int method2323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method2324(anInt2927, arg0, arg1, arg2, anInt2938, anInt2938, arg0, anInt2941, null);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method2324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static178.aGL1;
		@Pc(3) int local3 = method2325();
		if (arg0 == 3553) {
			Static178.method2763(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method2327(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()I")
	public static int method2325() {
		Static178.aGL1.glGenTextures(1, anIntArray276, 0);
		return anIntArray276[0];
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
	public static void method2326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2327(anInt2928, arg0, arg1, arg2, anInt2929, anInt2941, null);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII[B)V")
	public static void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static178.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(III)V")
	public static void method2328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method2327(anInt2927, arg0, arg1, arg2, anInt2929, anInt2941, null);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "()V")
	public static void method2329() {
		anIntArray276 = null;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
	public static void method2330(@OriginalArg(0) int arg0) {
		anIntArray276[0] = arg0;
		Static178.aGL1.glDeleteTextures(1, anIntArray276, 0);
	}
}
