import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
	public static int anInt8382;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "Lclient!od;")
	public static Class264 aClass264_1;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
	public static int anInt8392;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "Lclient!hs;")
	public static final Class162 aClass162_10 = new Class162("", 17);

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	public static int anInt8396 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static98.method1620(arg3, arg2, arg1)) {
			return false;
		}
		@Pc(23) int local23 = Static5.anIntArray4[2];
		@Pc(27) int local27 = Static5.anIntArray4[0];
		@Pc(31) int local31 = Static5.anIntArray4[1];
		if (!Static98.method1620(arg7, arg0, arg6)) {
			return false;
		}
		@Pc(46) int local46 = Static5.anIntArray4[2];
		@Pc(50) int local50 = Static5.anIntArray4[0];
		@Pc(54) int local54 = Static5.anIntArray4[1];
		if (Static98.method1620(arg8, arg5, arg4)) {
			@Pc(67) int local67 = Static5.anIntArray4[0];
			@Pc(71) int local71 = Static5.anIntArray4[2];
			@Pc(75) int local75 = Static5.anIntArray4[1];
			return Static392.method5968(local54, local27, local75, local46, local31, local23, local50, local71, local67);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Z")
	public static boolean method7318() {
		return Static425.method6393("jaclib") ? Static425.method6393("hw3d") : false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!jc;)V")
	public static void method7320(@OriginalArg(1) Class14_Sub21 arg0) {
		@Pc(6) byte[] local6 = new byte[24];
		if (Static413.aClass243_3 != null) {
			@Pc(18) int local18;
			try {
				Static413.aClass243_3.method5982(0L);
				Static413.aClass243_3.method5975(local6);
				for (local18 = 0; local18 < 24 && local6[local18] == 0; local18++) {
				}
				if (local18 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local18 = 0; local18 < 24; local18++) {
					local6[local18] = -1;
				}
			}
		}
		arg0.method7743(0, local6, 24);
	}
}
