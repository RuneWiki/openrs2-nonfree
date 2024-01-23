import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	public static int anInt929 = 3553;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	public static int anInt930 = 34037;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public static int anInt931 = 6407;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	public static int anInt932 = 6408;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	public static int anInt933 = 32993;

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
	public static int anInt934 = 34843;

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	public static int anInt935 = 34842;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public static int anInt936 = 34837;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public static int anInt937 = 34836;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public static int anInt938 = 6406;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
	public static int anInt939 = 6402;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public static int anInt940 = 9729;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
	public static int anInt941 = 9728;

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
	public static int anInt942 = 5126;

	@OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
	public static int anInt943 = 5121;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "[I")
	private static int[] anIntArray84 = new int[1];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)I")
	public static int method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method777(anInt929, arg0, arg1, arg2, anInt940, anInt940, arg0, anInt943, null);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public static void method775(@OriginalArg(0) int arg0) {
		anIntArray84[0] = arg0;
		Static277.aGL1.glDeleteTextures(1, anIntArray84, 0);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIII[B)V")
	public static void method776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static277.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static277.aGL1;
		@Pc(3) int local3 = method778();
		if (arg0 == 3553) {
			Static277.method4212(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method776(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "()I")
	public static int method778() {
		Static277.aGL1.glGenTextures(1, anIntArray84, 0);
		return anIntArray84[0];
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[B)I")
	public static int method779(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method777(anInt929, arg0, 128, 128, anInt940, anInt940, arg0, anInt943, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)V")
	public static void method780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method776(anInt929, arg0, arg1, arg2, anInt931, anInt943, null);
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(III)V")
	public static void method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method776(anInt930, arg0, arg1, arg2, anInt931, anInt943, null);
	}
}
