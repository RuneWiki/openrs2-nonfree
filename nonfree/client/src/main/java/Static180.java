import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
	public static int anInt3464;

	@OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString200 = "Loading - please wait.";

	@OriginalMember(owner = "client!mo", name = "g", descriptor = "Z")
	public static boolean aBoolean233 = false;

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "J")
	public static volatile long aLong124 = 0L;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!hi;)Z")
	public static boolean method2981(@OriginalArg(1) Class66 arg0) {
		if (arg0.anIntArray182 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < arg0.anIntArray182.length; local13++) {
			@Pc(23) int local23 = Static63.method2806(arg0, local13);
			@Pc(28) int local28 = arg0.anIntArray186[local13];
			if (arg0.anIntArray182[local13] == 2) {
				if (local28 <= local23) {
					return false;
				}
			} else if (arg0.anIntArray182[local13] == 3) {
				if (local28 >= local23) {
					return false;
				}
			} else if (arg0.anIntArray182[local13] == 4) {
				if (local28 == local23) {
					return false;
				}
			} else if (local23 != local28) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIB)I")
	public static int method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
	public static void method2984(@OriginalArg(1) int arg0) {
		@Pc(2) Class54 local2 = Static133.aClass54_1;
		synchronized (Static133.aClass54_1) {
			Static21.anInt387 = arg0;
		}
	}
}
