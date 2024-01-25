import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "Lclient!ct;")
	public static Class30 aClass30_6;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "Lclient!h;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "Z")
	public static boolean aBoolean49 = true;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "I")
	public static int anInt698 = 0;

	@OriginalMember(owner = "client!bo", name = "M", descriptor = "[I")
	public static final int[] anIntArray48 = new int[14];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method716(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static209.aStringArray23.length; local7++) {
			if (Static209.aStringArray23[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!kg;)Z")
	public static boolean method718(@OriginalArg(1) Class112 arg0) {
		if (arg0.anInt3446 == Static306.anInt5899) {
			Static166.anInt3465 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBII)I")
	public static int method719(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static264.aByteArrayArrayArray7[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static264.aByteArrayArrayArray7[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I")
	public static int method720(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
