import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!of", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "I")
	public static int anInt6305 = 0;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	public static int anInt6306 = -1;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString417 = " is already on your friend list.";

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BIIIIII)I")
	public static int method5320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(15) int local15 = arg4;
			arg4 = arg0;
			arg0 = local15;
		}
		@Pc(23) int local23 = arg3 & 0x3;
		if (local23 == 0) {
			return arg1;
		} else if (local23 == 1) {
			return arg5;
		} else if (local23 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return 7 + 1 - arg5 - arg0;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!hq;Ljava/lang/String;IZ)V")
	public static void method5321(@OriginalArg(0) Class94 arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(21) int local21 = Static326.aClass208_7.method5380(arg1, null, 250);
		@Pc(30) int local30 = Static326.aClass208_7.method5375(arg1, 250, null) * 13;
		Static128.aClass89_3.method5439(6, 6, local21 + 4 + 4, local30 + 4 - -4, -16777216, 0);
		Static128.aClass89_3.method5481(6, 6, local21 + 8, local30 - -4 - -4, -1, 0);
		arg0.method5693(0, -1, 10, 1, null, local30, 1, 0, null, -1, local21, 10, null, arg1, 0);
		Static352.method5647(6, 6, local21 + 4 + 4, 4 + 4 + local30);
		if (arg2) {
			Static128.aClass89_3.method5392();
		}
	}
}
