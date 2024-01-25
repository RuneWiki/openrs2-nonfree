import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dq", name = "db", descriptor = "I")
	public static int anInt1878;

	@OriginalMember(owner = "client!dq", name = "eb", descriptor = "Lclient!ns;")
	public static Class166 aClass166_66;

	@OriginalMember(owner = "client!dq", name = "hb", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!dq", name = "ib", descriptor = "I")
	public static int anInt1880;

	@OriginalMember(owner = "client!dq", name = "bb", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_40 = new Class36(37, 3);

	@OriginalMember(owner = "client!dq", name = "cb", descriptor = "J")
	public static volatile long aLong42 = 0L;

	@OriginalMember(owner = "client!dq", name = "fb", descriptor = "Z")
	public static boolean aBoolean126 = false;

	@OriginalMember(owner = "client!dq", name = "jb", descriptor = "I")
	public static int anInt1881 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZII)I")
	public static int method1412(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub39 local8 = Static195.method2229(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray589.length) {
			return local8.anIntArray589[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIII)I")
	public static int method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static346.aClass146Array2 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(25) int local25 = arg3 >> 7;
			@Pc(29) int local29 = arg1 >> 7;
			if (arg0 < 0 || arg2 < 0 || arg0 > Static126.anInt2569 - 1 || arg2 > Static190.anInt3697 - 1) {
				return 0;
			} else if (local25 >= 1 && local29 >= 1 && local25 <= Static126.anInt2569 - 1 && Static190.anInt3697 - 1 >= local29) {
				@Pc(91) boolean local91 = (Static327.aByteArrayArrayArray11[1][arg3 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(116) boolean local116;
				@Pc(135) boolean local135;
				if ((arg3 & 0x7F) == 0) {
					local116 = (Static327.aByteArrayArrayArray11[1][local25 - 1][arg1 >> 7] & 0x2) != 0;
					local135 = (Static327.aByteArrayArrayArray11[1][local25][arg1 >> 7] & 0x2) != 0;
					if (local116 != local135) {
						local91 = (Static327.aByteArrayArrayArray11[1][arg0][arg2] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local116 = (Static327.aByteArrayArrayArray11[1][arg3 >> 7][local29 - 1] & 0x2) != 0;
					local135 = (Static327.aByteArrayArrayArray11[1][arg3 >> 7][local29] & 0x2) != 0;
					if (local116 != local135) {
						local91 = (Static327.aByteArrayArrayArray11[1][arg0][arg2] & 0x2) != 0;
					}
				}
				if (local91) {
					arg4++;
				}
				return Static346.aClass146Array2[arg4].va(arg3, arg1);
			} else {
				return 0;
			}
		} else {
			return Static346.aClass146Array2[arg4].va(arg3, arg1);
		}
	}
}
