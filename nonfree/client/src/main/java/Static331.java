import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	public static int anInt6267;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	public static int anInt6257 = 0;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "I")
	public static int anInt6260 = 0;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	public static int anInt6263 = -1;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "I")
	public static int anInt6271 = -2;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	public static boolean method5078(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZII[B)[B")
	public static byte[] method5080(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static596.method7719(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
