import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public static int anInt1118 = 3553;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public static int anInt1119 = 34037;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public static int anInt1120 = 6407;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public static int anInt1121 = 6408;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public static int anInt1122 = 32993;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public static int anInt1123 = 34843;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	public static int anInt1124 = 34842;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
	public static int anInt1125 = 34837;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	public static int anInt1126 = 34836;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
	public static int anInt1127 = 6406;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public static int anInt1128 = 6402;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	public static int anInt1129 = 9729;

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
	public static int anInt1130 = 9728;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
	public static int anInt1131 = 5126;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
	public static int anInt1132 = 5121;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "[I")
	private static int[] anIntArray92 = new int[1];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public static void method975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method978(anInt1118, arg0, arg1, arg2, anInt1120, anInt1132, null);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()I")
	public static int method976() {
		Static60.aGL1.glGenTextures(1, anIntArray92, 0);
		return anIntArray92[0];
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method977(@OriginalArg(0) int arg0) {
		anIntArray92[0] = arg0;
		Static60.aGL1.glDeleteTextures(1, anIntArray92, 0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII[B)V")
	public static void method978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6) {
		@Pc(6) ByteBuffer local6 = arg6 == null ? null : ByteBuffer.wrap(arg6);
		Static60.aGL1.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, local6);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V")
	public static void method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		method978(anInt1119, arg0, arg1, arg2, anInt1120, anInt1132, null);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIII[B)I")
	public static int method981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8) {
		@Pc(1) GL local1 = Static60.aGL1;
		@Pc(3) int local3 = method976();
		if (arg0 == 3553) {
			Static60.method1157(local3);
		} else {
			local1.glBindTexture(arg0, local3);
		}
		method978(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
		local1.glTexParameteri(3553, 10241, arg4);
		local1.glTexParameteri(3553, 10240, arg5);
		return local3;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III[B)I")
	public static int method982(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		return method981(anInt1118, arg0, 128, 128, anInt1129, anInt1129, arg0, anInt1132, arg1);
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(III)I")
	public static int method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return method981(anInt1118, arg0, arg1, arg2, anInt1129, anInt1129, arg0, anInt1132, null);
	}
}
