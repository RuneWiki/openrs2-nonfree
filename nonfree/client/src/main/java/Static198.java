import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!me", name = "x", descriptor = "I")
	public static int anInt3898;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString253 = "Loaded client variable data";

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public static void method3543(@OriginalArg(1) byte arg0) {
		if (Static301.aByteArrayArrayArray11 == null) {
			Static301.aByteArrayArrayArray11 = new byte[4][Static15.anInt287][Static325.anInt6173];
		}
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			for (@Pc(19) int local19 = 0; local19 < Static15.anInt287; local19++) {
				for (@Pc(22) int local22 = 0; local22 < Static325.anInt6173; local22++) {
					Static301.aByteArrayArrayArray11[local16][local19][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILjava/lang/String;JILjava/lang/String;II)V")
	public static void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) long arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!Static169.aBoolean260 && Static33.anInt735 < 500) {
			@Pc(16) int local16 = arg1 == -1 ? Static221.anInt4408 : arg1;
			@Pc(35) Class7_Sub32 local35 = new Class7_Sub32(arg2, arg4, local16, arg5, arg3, arg6, arg0);
			Static76.aClass74_8.method1802(local35);
			Static33.anInt735++;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!sa;)V")
	public static void method3545(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1) {
		Static331.aClass8Array5[arg0] = arg1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)I")
	public static int method3546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	public static void method3548() {
		Static196.aBoolean300 = true;
	}
}
