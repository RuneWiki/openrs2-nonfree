import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Lclient!kg;")
	public static Class189 aClass189_4;

	@OriginalMember(owner = "client!iu", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray3 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)V")
	public static void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static478.method7175(arg1)) {
			Static23.method3331(Static343.aClass225ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method3614(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		if (local13 == 0) {
			return new byte[0];
		}
		@Pc(24) int local24 = local13 + 3 & 0xFFFFFFFC;
		@Pc(30) int local30 = local24 / 4 * 3;
		if (local24 - 2 >= local13 || Static46.method588(arg0.charAt(local24 - 2)) == -1) {
			local30 -= 2;
		} else if (local13 <= local24 - 1 || Static46.method588(arg0.charAt(local24 - 1)) == -1) {
			local30--;
		}
		@Pc(71) byte[] local71 = new byte[local30];
		Static595.method8400(local71, 0, arg0);
		return local71;
	}
}
