import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
	public static int anInt6984;

	@OriginalMember(owner = "client!nia", name = "f", descriptor = "[[Lclient!tp;")
	public static Class331[][] aClass331ArrayArray2;

	@OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
	public static final int anInt6985 = 328;

	@OriginalMember(owner = "client!nia", name = "e", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_93 = new Class71(114, -1);

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIII)Z")
	public static boolean method5737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static224.aClass54_4.method5139(arg1, arg0, arg2, Static513.anIntArray501);
		@Pc(18) int local18 = Static513.anIntArray501[2];
		if (local18 < 50) {
			return false;
		} else {
			Static513.anIntArray501[2] = local18;
			Static513.anIntArray501[1] = Static193.anInt4515 + Static623.anInt6559 * Static513.anIntArray501[1] / local18;
			Static513.anIntArray501[0] = Static613.anInt10345 + Static130.anInt3468 * Static513.anIntArray501[0] / local18;
			return true;
		}
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!vn;")
	public static Class240 method5739(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class240_Sub1(arg0, 7500);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IZIIIII)V")
	public static void method5740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static155.aClass8_Sub25_6.aClass36_Sub6_1.method3331() != 0 && arg1 != 0 && Static55.anInt1863 < 50 && arg0 != -1) {
			Static63.aClass230Array1[Static55.anInt1863++] = new Class230((byte) 1, arg0, arg1, arg2, arg4, arg3, arg5, null);
		}
	}
}
