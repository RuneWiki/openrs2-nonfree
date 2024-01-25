import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public static int anInt2379 = 1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([BII)[B")
	public static byte[] method2231(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = new byte[arg1];
		Static691.method82(arg0, 0, local13, 0, arg1);
		return local13;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
	public static void method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static63.aClass89ArrayArrayArray1[0][arg1][arg2] != null && Static63.aClass89ArrayArrayArray1[0][arg1][arg2].aClass89_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static63.aClass89ArrayArrayArray1[local25][arg1][arg2] == null) {
				@Pc(47) Class89 local47 = Static63.aClass89ArrayArrayArray1[local25][arg1][arg2] = new Class89(local25);
				if (local23) {
					local47.aByte27++;
				}
			}
		}
	}
}
